package p358y2;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import p002a1.C0010h;
import p085fg.InterfaceC1235p;
import p091g3.AbstractC1321m;
import p091g3.AbstractC1329q;
import p091g3.C1332r0;
import p091g3.InterfaceC1305e;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1876r1;
import p340x2.C5666a;
import p357y1.AbstractC5858a;

/* JADX INFO: renamed from: y2.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5985t extends AbstractC5858a implements InterfaceC1305e {

    /* JADX INFO: renamed from: p */
    public final Window f24301p;

    /* JADX INFO: renamed from: q */
    public final C1845j1 f24302q;

    /* JADX INFO: renamed from: r */
    public boolean f24303r;

    /* JADX INFO: renamed from: s */
    public boolean f24304s;

    /* JADX INFO: renamed from: t */
    public boolean f24305t;

    /* JADX INFO: renamed from: u */
    public boolean f24306u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5985t(Context context, Window window) {
        super(context);
        this.f24301p = window;
        this.f24302q = AbstractC1874r.m4639u(AbstractC5983r.f24299a);
        int i9 = AbstractC1329q.f4395a;
        AbstractC1321m.m3524b(this, this);
        AbstractC1329q.m3555b(this, new C5666a(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    /* JADX INFO: renamed from: a */
    public final void mo10551a(C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(1735448596);
        int i10 = (c1836h0.m4538h(this) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            ((InterfaceC1235p) this.f24302q.getValue()).invoke(c1836h0, 0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0010h(this, i9, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.InterfaceC1305e
    /* JADX INFO: renamed from: c */
    public final C1332r0 mo3460c(View view, C1332r0 c1332r0) {
        if (!this.f24304s) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c1332r0.f4398a.mo3504n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f24306u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    /* JADX INFO: renamed from: h */
    public final void mo10557h(boolean z9, int i9, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i13 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i14 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // p357y1.AbstractC5858a
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10558i(int i9, int i10) {
        int iM10716a;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo10558i(i9, i10);
            return;
        }
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        Window window = this.f24301p;
        if (mode != Integer.MIN_VALUE || this.f24303r || window.getAttributes().height != -2) {
            iM10716a = size2;
        } else if (this.f24304s) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 30) {
                iM10716a = C5979n.f24293a.m10714a(window);
            } else if (i11 < 32) {
                iM10716a = C5981p.f24295a.m10716a(window);
            }
        } else {
            iM10716a = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i12 = size - paddingRight;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = iM10716a - paddingBottom;
        int i14 = i13 >= 0 ? i13 : 0;
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode2 != 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        }
        childAt.measure(i9, i10);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f24304s || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f24303r) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
