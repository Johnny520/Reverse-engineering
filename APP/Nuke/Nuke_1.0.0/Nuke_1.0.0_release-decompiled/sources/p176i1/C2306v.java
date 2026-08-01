package p176i1;

import android.content.Context;
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

    public C2306v(Context context, Window window) {
        super(context);
        this.f7500l = window;
        this.f7501m = AbstractC1385s.m2629s(AbstractC2304t.f7498a);
        int i5 = AbstractC3092v.f9811a;
        AbstractC3087q.m5400b(this, this);
        AbstractC3092v.m5409c(this, new C2210a(this, 1));
    }

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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1215g(int r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.mo1215g(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.f7500l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L49
            boolean r8 = r12.f7502n
            if (r8 != 0) goto L49
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L49
            boolean r8 = r12.f7503o
            if (r8 == 0) goto L46
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            i1.o r8 = p176i1.C2299o.f7492a
            int r8 = r8.m4124a(r6)
            goto L4a
        L3b:
            r9 = 32
            if (r8 >= r9) goto L49
            i1.q r8 = p176i1.C2301q.f7494a
            int r8 = r8.m4126a(r6)
            goto L4a
        L46:
            int r8 = r3 + 1
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L61
            r9 = r0
        L61:
            int r8 = r8 - r11
            if (r8 >= 0) goto L65
            goto L66
        L65:
            r0 = r8
        L66:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 != 0) goto L6d
            goto L71
        L6d:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L71:
            if (r4 != 0) goto L74
            goto L78
        L74:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L78:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L88
            if (r8 == r13) goto L91
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L91
        L88:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L91:
            if (r4 == r7) goto L9d
            if (r4 == r13) goto L9b
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto La6
        L9b:
            r13 = r3
            goto La6
        L9d:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        La6:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.f7503o
            if (r13 != 0) goto Lc7
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lc7
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc7
            r6.addFlags(r7)
            boolean r13 = r12.f7502n
            if (r13 != 0) goto Lc7
            r13 = -1
            r6.setLayout(r13, r13)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p176i1.C2306v.mo1215g(int, int):void");
    }

    @Override // p047I0.AbstractC0713b
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7505q;
    }
}
