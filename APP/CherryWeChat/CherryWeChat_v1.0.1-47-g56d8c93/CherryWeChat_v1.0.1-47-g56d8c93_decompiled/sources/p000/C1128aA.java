package p000;

import android.R;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: aA */
/* JADX INFO: loaded from: classes.dex */
public final class C1128aA extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public String f3575a;

    /* JADX INFO: renamed from: b */
    public final C1030Xz f3576b;

    /* JADX INFO: renamed from: c */
    public final TextView f3577c;

    /* JADX INFO: renamed from: d */
    public final TextView f3578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128aA(Context context) {
        super(context, null, 0);
        AbstractC0295Gu.m625r(-492817432442933L);
        setMinimumHeight(AbstractC0295Gu.m616i(50));
        C1030Xz c1030Xz = new C1030Xz(context);
        c1030Xz.setOnCheckedChangeListener(new C2479s(7, this));
        this.f3576b = c1030Xz;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(25));
        setId(R.id.icon);
        layoutParams.gravity = 8388629;
        addView(c1030Xz, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388627;
        layoutParams2.rightMargin = AbstractC0295Gu.m616i(50);
        linearLayout.setLayoutParams(layoutParams2);
        addView(linearLayout);
        TextView textView = new TextView(context);
        textView.setTextSize(16.0f);
        textView.setTextColor(context.getColor(io.github.cherrywechat.R.color.textTitle));
        this.f3577c = textView;
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(14.0f);
        textView2.setVisibility(8);
        textView2.setTextColor(context.getColor(io.github.cherrywechat.R.color.textSummary));
        this.f3578d = textView2;
        linearLayout.addView(textView2);
    }

    public final String getKey() {
        return this.f3575a;
    }

    public final void setChecked(boolean z) {
        C1030Xz c1030Xz = this.f3576b;
        if (c1030Xz != null) {
            c1030Xz.setChecked(z);
        }
    }

    public final void setKey(String str) {
        AbstractC0295Gu.m625r(-492851792181301L);
        this.f3575a = str;
    }

    public final void setOnCheckedChangeListener(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-493478857406517L);
        C1030Xz c1030Xz = this.f3576b;
        if (c1030Xz != null) {
            c1030Xz.setOnCheckedChangeListener(interfaceC1416fj);
        }
    }

    public final void setSummary(String str) {
        AbstractC0295Gu.m625r(-493444497668149L);
        TextView textView = this.f3578d;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setTitle(String str) {
        AbstractC0295Gu.m625r(-493418727864373L);
        TextView textView = this.f3577c;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
