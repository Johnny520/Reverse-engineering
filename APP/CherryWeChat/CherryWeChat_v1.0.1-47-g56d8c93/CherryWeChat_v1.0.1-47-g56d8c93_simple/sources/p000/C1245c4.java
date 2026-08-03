package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: c4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1245c4 extends C0289Go implements InterfaceC1350e4 {

    /* JADX INFO: renamed from: C */
    public CharSequence f4232C;

    /* JADX INFO: renamed from: D */
    public C1078Z3 f4233D;

    /* JADX INFO: renamed from: E */
    public final Rect f4234E;

    /* JADX INFO: renamed from: F */
    public int f4235F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C1394f4 f4236G;

    public C1245c4(C1394f4 r3, Context r4, AttributeSet r5) {
        this.f4236G = r3;
        super(r4, r5, R.attr.spinnerStyle, 0);
        this.f4234E = new Rect();
        this.f951o = r3;
        this.f961y = true;
        this.f962z.setFocusable(true);
        this.f952p = new C1122a4(0, this);
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: f */
    public final void mo1974f(CharSequence r1) {
        this.f4232C = r1;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: k */
    public final void mo1977k(int r1) {
        this.f4235F = r1;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: m */
    public final void mo1979m(int r6, int r7) {
        C0606O3 r0 = this.f962z;
        boolean r1 = r0.isShowing();
        m2367s();
        r0.setInputMethodMode(2);
        mo577c();
        C0365Ie r2 = this.f939c;
        r2.setChoiceMode(1);
        r2.setTextDirection(r6);
        r2.setTextAlignment(r7);
        C1394f4 r62 = this.f4236G;
        int r72 = r62.getSelectedItemPosition();
        C0365Ie r22 = this.f939c;
        if (r0.isShowing() == false) goto L8;
        if (r22 == null) goto L8;
        r22.setListSelectionHidden(false);
        r22.setSelection(r72);
        if (r22.getChoiceMode() == 0) goto L8;
        r22.setItemChecked(r72, true);
    L8:
        if (r1 == true) goto L15;
        ViewTreeObserver r63 = r62.getViewTreeObserver();
        if (r63 == null) goto L14;
        ViewTreeObserverOnGlobalLayoutListenerC0949W3 r73 = new ViewTreeObserverOnGlobalLayoutListenerC0949W3(1, this);
        r63.addOnGlobalLayoutListener(r73);
        r0.setOnDismissListener(new C1202b4(this, r73));
        return;
    L14:
        return;
    }

    @Override // p000.InterfaceC1350e4
    /* JADX INFO: renamed from: o */
    public final CharSequence mo1981o() {
        return this.f4232C;
    }

    @Override // p000.C0289Go, p000.InterfaceC1350e4
    /* JADX INFO: renamed from: p */
    public final void mo584p(ListAdapter r1) {
        super.mo584p(r1);
        this.f4233D = (C1078Z3) r1;
    }

    /* JADX INFO: renamed from: s */
    public final void m2367s() {
        C1394f4 r0 = this.f4236G;
        Rect r1 = r0.f4956h;
        C0606O3 r2 = this.f962z;
        Drawable r3 = r2.getBackground();
        if (r3 == null) goto L8;
        r3.getPadding(r1);
        if (r0.getLayoutDirection() != 1) goto L7;
        int r32 = r1.right;
    L9:
        int r5 = r0.getPaddingLeft();
        int r6 = r0.getPaddingRight();
        int r7 = r0.getWidth();
        int r8 = r0.f4955g;
        if (r8 != (-2)) goto L16;
        int r22 = r0.m2672a(this.f4233D, r2.getBackground());
        int r82 = (r0.getContext().getResources().getDisplayMetrics().widthPixels - r1.left) - r1.right;
        if (r22 <= r82) goto L14;
        r22 = r82;
    L14:
        m585r(Math.max(r22, (r7 - r5) - r6));
    L20:
        if (r0.getLayoutDirection() != 1) goto L22;
        int r72 = (((r7 - r6) - this.f941e) - this.f4235F) + r32;
    L23:
        this.f942f = r72;
        return;
    L22:
        r72 = (r5 + this.f4235F) + r32;
        goto L23
    L16:
        if (r8 != (-1)) goto L18;
        m585r((r7 - r5) - r6);
        goto L20
    L18:
        m585r(r8);
        goto L20
    L7:
        r32 = -r1.left;
        goto L9
    L8:
        r32 = 0;
        r1.right = 0;
        r1.left = 0;
        goto L9
    }
}
