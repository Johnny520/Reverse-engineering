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

    public C1128aA(Context r6) {
        AbstractC0295Gu.m625r(-492817432442933L);
        super(r6, null, 0);
        setMinimumHeight(AbstractC0295Gu.m616i(50));
        C1030Xz r1 = new C1030Xz(r6);
        r1.setOnCheckedChangeListener(new C2479s(7, this));
        this.f3576b = r1;
        FrameLayout.LayoutParams r2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(25));
        setId(R.id.icon);
        r2.gravity = 8388629;
        addView(r1, r2);
        LinearLayout r12 = new LinearLayout(r6);
        r12.setOrientation(1);
        FrameLayout.LayoutParams r22 = new FrameLayout.LayoutParams(-2, -2);
        r22.gravity = 8388627;
        r22.rightMargin = AbstractC0295Gu.m616i(50);
        r12.setLayoutParams(r22);
        addView(r12);
        TextView r0 = new TextView(r6);
        r0.setTextSize(16.0f);
        r0.setTextColor(r6.getColor(io.github.cherrywechat.R.color.textTitle));
        this.f3577c = r0;
        r12.addView(r0);
        TextView r02 = new TextView(r6);
        r02.setTextSize(14.0f);
        r02.setVisibility(8);
        r02.setTextColor(r6.getColor(io.github.cherrywechat.R.color.textSummary));
        this.f3578d = r02;
        r12.addView(r02);
    }

    public final String getKey() {
        return this.f3575a;
    }

    public final void setChecked(boolean r2) {
        C1030Xz r0 = this.f3576b;
        if (r0 == null) goto L6;
        r0.setChecked(r2);
        return;
    }

    public final void setKey(String r3) {
        AbstractC0295Gu.m625r(-492851792181301L);
        this.f3575a = r3;
    }

    public final void setOnCheckedChangeListener(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-493478857406517L);
        C1030Xz r0 = this.f3576b;
        if (r0 == null) goto L6;
        r0.setOnCheckedChangeListener(r3);
        return;
    }

    public final void setSummary(String r3) {
        AbstractC0295Gu.m625r(-493444497668149L);
        TextView r0 = this.f3578d;
        if (r0 == null) goto L5;
        r0.setVisibility(0);
    L5:
        if (r0 == null) goto L8;
        r0.setText(r3);
        return;
    }

    public final void setTitle(String r3) {
        AbstractC0295Gu.m625r(-493418727864373L);
        TextView r0 = this.f3577c;
        if (r0 == null) goto L6;
        r0.setText(r3);
        return;
    }
}
