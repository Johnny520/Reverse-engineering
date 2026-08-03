package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public class C7135 extends Yue.C7134 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.String f24669 = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static java.lang.reflect.Method f24670;

    public C7135(Yue.C7136 r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.m27467()
            return
    }

    public C7135(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.<init>(r1)
            r0.m27467()
            return
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public android.graphics.Rect getDirtyBounds() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            android.graphics.Rect r0 = r0.getDirtyBounds()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@Yue.InterfaceC4410 android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.getOutline(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f24668
            if (r0 == 0) goto L1c
            java.lang.reflect.Method r1 = Yue.C7135.f24670
            if (r1 == 0) goto L1c
            r2 = 0
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L14
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L14
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.String r1 = "WrappedDrawableApi21"
            java.lang.String r2 = "Error calling Drawable#isProjected() method"
            android.util.Log.w(r1, r2, r0)
        L1c:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setHotspot(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setHotspotBounds(r2, r3, r4, r5)
            return
    }

    @Override // Yue.C7134, android.graphics.drawable.Drawable
    public boolean setState(@Yue.InterfaceC4410 int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            if (r1 == 0) goto Lb
            r0.invalidateSelf()
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // Yue.C7134, android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTint(int r2) {
            r1 = this;
            boolean r0 = r1.mo27463()
            if (r0 == 0) goto La
            super.setTint(r2)
            goto Lf
        La:
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setTint(r2)
        Lf:
            return
    }

    @Override // Yue.C7134, android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            boolean r0 = r1.mo27463()
            if (r0 == 0) goto La
            super.setTintList(r2)
            goto Lf
        La:
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setTintList(r2)
        Lf:
            return
    }

    @Override // Yue.C7134, android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintMode(@Yue.InterfaceC4410 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            boolean r0 = r1.mo27463()
            if (r0 == 0) goto La
            super.setTintMode(r2)
            goto Lf
        La:
            android.graphics.drawable.Drawable r0 = r1.f24668
            r0.setTintMode(r2)
        Lf:
            return
    }

    @Override // Yue.C7134
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo27463() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m27467() {
            r3 = this;
            java.lang.reflect.Method r0 = Yue.C7135.f24670
            if (r0 != 0) goto L18
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r1 = "isProjected"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L10
            Yue.C7135.f24670 = r0     // Catch: java.lang.Exception -> L10
            goto L18
        L10:
            r0 = move-exception
            java.lang.String r1 = "WrappedDrawableApi21"
            java.lang.String r2 = "Failed to retrieve Drawable#isProjected() method"
            android.util.Log.w(r1, r2, r0)
        L18:
            return
    }
}
