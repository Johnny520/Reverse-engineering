package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: oy */
/* JADX INFO: loaded from: classes.dex */
public final class C2340oy extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: e */
    public static boolean f8211e;

    /* JADX INFO: renamed from: a */
    public TextView f8212a;

    /* JADX INFO: renamed from: b */
    public TextView f8213b;

    /* JADX INFO: renamed from: c */
    public TextView f8214c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f8215d;

    static {
        AbstractC0295Gu.m625r(-477119326976053L);
    }

    /* JADX INFO: renamed from: a */
    public static final void m4746a(C2340oy r5) {
        TextView r0 = r5.f8212a;
        TextView r1 = null;
        if (r0 != null) goto L5;
        AbstractC0295Gu.m625r(-476397772470325L);
        r0 = null;
    L5:
        r0.setText(AbstractC0295Gu.m625r(-476453607045173L));
        r0.setClickable(false);
        r0.setAlpha(1.0f);
        GradientDrawable r2 = new GradientDrawable();
        r2.setColor(r0.getContext().getColor(R.color.colorError));
        r2.setCornerRadius(AbstractC0295Gu.m616i(8));
        r0.setBackground(r2);
        TextView r52 = r5.f8214c;
        if (r52 != null) goto L8;
        AbstractC0295Gu.m625r(-476483671816245L);
    L9:
        r1.setText(AbstractC0295Gu.m625r(-476556686260277L));
        r1.setTextColor(r1.getContext().getColor(R.color.colorError));
        return;
    L8:
        r1 = r52;
        goto L9
    }

    /* JADX INFO: renamed from: e */
    public static final void m4747e(C2340oy r2) {
        TextView r22 = r2.f8212a;
        if (r22 != null) goto L5;
        AbstractC0295Gu.m625r(-476213088876597L);
        r22 = null;
    L5:
        r22.setText(AbstractC0295Gu.m625r(-476268923451445L));
        r22.setClickable(true);
        r22.setAlpha(1.0f);
        GradientDrawable r0 = new GradientDrawable();
        r0.setColor(-1499549);
        r0.setCornerRadius(AbstractC0295Gu.m616i(8));
        r22.setBackground(r0);
    }

    /* JADX INFO: renamed from: f */
    public static final void m4748f(C2340oy r2) {
        TextView r22 = r2.f8212a;
        if (r22 != null) goto L5;
        AbstractC0295Gu.m625r(-476131484497973L);
        r22 = null;
    L5:
        r22.setText(AbstractC0295Gu.m625r(-476187319072821L));
        r22.setClickable(false);
        r22.setAlpha(1.0f);
        GradientDrawable r0 = new GradientDrawable();
        r0.setColor(-6381922);
        r0.setCornerRadius(AbstractC0295Gu.m616i(8));
        r22.setBackground(r0);
    }

    /* JADX INFO: renamed from: g */
    public static final void m4749g(C2340oy r4, boolean r5) {
        TextView r0 = r4.f8214c;
        LinearLayout r1 = null;
        if (r0 != null) goto L5;
        AbstractC0295Gu.m625r(-478274673178677L);
        r0 = null;
    L5:
        if (r5 == false) goto L12;
        r0.setText(AbstractC0295Gu.m625r(-477797931808821L));
        r0.setTextColor(r0.getContext().getColor(R.color.colorSuccess));
        LinearLayout r42 = r4.f8215d;
        if (r42 != null) goto L9;
        AbstractC0295Gu.m625r(-477840881481781L);
    L10:
        r1.setVisibility(0);
        return;
    L9:
        r1 = r42;
        goto L10
    L12:
        r0.setText(AbstractC0295Gu.m625r(-477918190893109L));
        r0.setTextColor(r0.getContext().getColor(R.color.colorError));
        LinearLayout r43 = r4.f8215d;
        if (r43 != null) goto L15;
        AbstractC0295Gu.m625r(-477969730500661L);
    L16:
        r1.setVisibility(8);
        return;
    L15:
        r1 = r43;
        goto L16
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-476951823251509L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-476990477957173L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r3) {
        AbstractC0295Gu.m625r(-476363412731957L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-477029132662837L);
    }

    public int getViewId() {
        return 6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f8211e == false) goto L6;
        f8211e = false;
        C1498hd r1 = AbstractC1499he.f5282a;
        InterfaceC0190Eb r3 = null;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C2297ny(this, r3, 0), 3);
        return;
    }
}
