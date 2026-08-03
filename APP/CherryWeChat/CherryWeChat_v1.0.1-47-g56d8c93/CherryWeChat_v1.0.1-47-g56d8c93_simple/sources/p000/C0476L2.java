package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: L2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0476L2 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1571a;

    /* JADX INFO: renamed from: b */
    public final Object f1572b;

    public /* synthetic */ C0476L2(int r1, Object r2) {
        this.f1571a = r1;
        this.f1572b = r2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch(this.f1571a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.canApplyTheme();
    L7:
        return ((Drawable.ConstantState) this.f1572b).canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch(this.f1571a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        return 0;
    L7:
        return ((Drawable.ConstantState) this.f1572b).getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch(this.f1571a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C0519M2 r0 = new C0519M2(null, 0);
        Drawable r1 = ((Drawable.ConstantState) this.f1572b).newDrawable();
        r0.f373a = r1;
        r1.setCallback(r0.f1696f);
        return r0;
    L5:
        return new C0026Aj(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources r4) {
        switch(this.f1571a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C0519M2 r0 = new C0519M2(null, 0);
        Drawable r42 = ((Drawable.ConstantState) this.f1572b).newDrawable(r4);
        r0.f373a = r42;
        r42.setCallback(r0.f1696f);
        return r0;
    L5:
        return new C0026Aj(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources r4, Resources.Theme r5) {
        switch(this.f1571a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C0519M2 r0 = new C0519M2(null, 0);
        Drawable r42 = ((Drawable.ConstantState) this.f1572b).newDrawable(r4, r5);
        r0.f373a = r42;
        r42.setCallback(r0.f1696f);
        return r0;
    L5:
        return super.newDrawable(r4, r5);
    }
}
