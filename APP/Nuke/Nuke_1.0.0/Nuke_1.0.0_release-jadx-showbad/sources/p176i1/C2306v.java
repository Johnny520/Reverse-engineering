package p176i1;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import p047I0.AbstractC0713b;
import p047I0.C0710a;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p170h1.C2210a;
import p229r1.AbstractC3087q;
import p229r1.AbstractC3092v;
import p229r1.C3070c0;
import p229r1.InterfaceC3081k;

/* JADX INFO: renamed from: i1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2306v extends AbstractC0713b implements InterfaceC3081k {

    /* JADX INFO: renamed from: l */
    public final Window f7500l;

    /* JADX INFO: renamed from: m */
    public final C1366i0 f7501m;

    /* JADX INFO: renamed from: n */
    public boolean f7502n;

    /* JADX INFO: renamed from: o */
    public boolean f7503o;

    /* JADX INFO: renamed from: p */
    public boolean f7504p;

    /* JADX INFO: renamed from: q */
    public boolean f7505q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2306v(Context context, Window window) {
        super(context);
        this.f7500l = window;
        this.f7501m = AbstractC1385s.m2629s(AbstractC2304t.f7498a);
        int i5 = AbstractC3092v.f9811a;
        AbstractC3087q.m5400b(this, this);
        AbstractC3092v.m5409c(this, new C2210a(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.InterfaceC3081k
    /* JADX INFO: renamed from: a */
    public final C3070c0 mo680a(View view, C3070c0 c3070c0) {
        if (!this.f7503o) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c3070c0.f9782a.mo5372r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c3070c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: b */
    public final void mo1210b(int i5, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1735448596);
        int i6 = (c1383r.m2586h(this) ? 4 : 2) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 3) != 2)) {
            ((InterfaceC1603e) this.f7501m.getValue()).mo0g(c1383r, 0);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0710a(this, i5, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: f */
    public final void mo1214f(boolean z5, int i5, int i6, int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i9 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i10 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1215g(int i5, int i6) {
        int iM4126a;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo1215g(i5, i6);
            return;
        }
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int mode = View.MeasureSpec.getMode(i6);
        Window window = this.f7500l;
        if (mode != Integer.MIN_VALUE || this.f7502n || window.getAttributes().height != -2) {
            iM4126a = size2;
        } else if (this.f7503o) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 30) {
                iM4126a = C2299o.f7492a.m4124a(window);
            } else if (i7 < 32) {
                iM4126a = C2301q.f7494a.m4126a(window);
            }
        } else {
            iM4126a = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i8 = size - paddingRight;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = iM4126a - paddingBottom;
        int i10 = i9 >= 0 ? i9 : 0;
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        }
        childAt.measure(i5, i6);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f7503o || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f7502n) {
            return;
        }
        window.setLayout(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0713b
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7505q;
    }
}
