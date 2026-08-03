package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6977 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.Paint f24339;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String f24340;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f24341;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f24342;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float f24343;

    static {
            r0 = 781(0x30d, float:1.094E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6977(java.lang.String r4) {
            r3 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 200(0xc8, float:2.8E-43)
            r2 = -1041235968(0xffffffffc1f00000, float:-30.0)
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public C6977(java.lang.String r1, float r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f24340 = r1
            r0.f24343 = r2
            r0.f24341 = r3
            r0.f24342 = r4
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f24339 = r1
            r2 = 1
            r1.setAntiAlias(r2)
            r2 = -4144960(0xffffffffffc0c0c0, float:NaN)
            r1.setColor(r2)
            r2 = 1109393408(0x42200000, float:40.0)
            r1.setTextSize(r2)
            r2 = 70
            r1.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public native void draw(android.graphics.Canvas r1);

    @Override // android.graphics.drawable.Drawable
    public native int getOpacity();

    @Override // android.graphics.drawable.Drawable
    public native void setAlpha(int r1);

    @Override // android.graphics.drawable.Drawable
    public native void setColorFilter(android.graphics.ColorFilter r1);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public native void m26931(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public native void m26932(int r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public native void m26933(int r1);
}
