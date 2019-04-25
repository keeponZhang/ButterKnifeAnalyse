package com.example.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @创建者 keepon
 * @创建时间 2019/4/25 0025 下午 6:27
 * @描述 ${TODO}
 * @版本 $$Rev$$
 * @更新者 $$Author$$
 * @更新时间 $$Date$$
 */
public class TestActivity extends Activity {
	//!methodBindings.isEmpty() && fieldBinding = null
	//View view = Utils.findRequiredView(source, 2130968576, "method 'onViewClicked'");
	//        this.view2130968576 = view;
	//        view.setOnClickListener(new DebouncingOnClickListener() {
	//            public void doClick(View p0) {
	//                target.onViewClicked();
	//            }
	//        });

	//	methodBindings.isEmpty() && fieldBinding != null
//	target.textView1 = (TextView)Utils.findRequiredViewAsType(source, 2130968576, "field 'textView1'", TextView.class);


	@BindView(R.id.tv1)
	TextView textView1;
	//	@BindView(R.id.tv1)
	//	TextView textView2;

	Unbinder mUnbinder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);

		mUnbinder = ButterKnife.bind(this);

//		textView1.setText("butterKnife1");
	}

	@Override
	protected void onDestroy() {
		mUnbinder.unbind();
		super.onDestroy();
	}

	public void unBind(View view) {
		mUnbinder.unbind();
	}

//	@OnClick(R.id.tv1)
//	public void onViewClicked() {
//	}
}
