package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0087C0 extends C0520M3 implements InterfaceC0173E0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0130D0 f194d;

    public C0087C0(C0130D0 r2, Context r3) {
        this.f194d = r2;
        super(r3, null, R.attr.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC2706xB.m5280a(this, getContentDescription());
        setOnTouchListener(new C2695x0(this, this));
    }

    @Override // p000.InterfaceC0173E0
    /* JADX INFO: renamed from: a */
    public final boolean mo135a() {
        return false;
    }

    @Override // p000.InterfaceC0173E0
    /* JADX INFO: renamed from: b */
    public final boolean mo136b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick() == false) goto L5;
        return true;
    L5:
        playSoundEffect(0);
        this.f194d.m223l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r5, int r6, int r7, int r8) {
        boolean r52 = super.setFrame(r5, r6, r7, r8);
        Drawable r62 = getDrawable();
        Drawable r72 = getBackground();
        if (r62 == null) goto L6;
        if (r72 == null) goto L6;
        int r63 = getWidth();
        int r82 = getHeight();
        int r0 = Math.max(r63, r82) / 2;
        int r1 = getPaddingLeft() - getPaddingRight();
        int r64 = (r63 + r1) / 2;
        int r83 = (r82 + (getPaddingTop() - getPaddingBottom())) / 2;
        r72.setHotspotBounds(r64 - r0, r83 - r0, r64 + r0, r83 + r0);
    L6:
        return r52;
    }
}
