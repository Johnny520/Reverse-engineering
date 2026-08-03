package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0443 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.widget.CompoundButton f1140;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.res.ColorStateList f1141;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f1142;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f1143;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f1144;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f1145;

    public C0443(@Yue.InterfaceC4410 android.widget.CompoundButton r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1141 = r0
            r1.f1142 = r0
            r0 = 0
            r1.f1143 = r0
            r1.f1144 = r0
            r1.f1140 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1653() {
            r2 = this;
            android.widget.CompoundButton r0 = r2.f1140
            android.graphics.drawable.Drawable r0 = Yue.C1435.m7078(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.f1143
            if (r1 != 0) goto L10
            boolean r1 = r2.f1144
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = Yue.C1995.m9235(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.f1143
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.f1141
            Yue.C1995.m9232(r0, r1)
        L21:
            boolean r1 = r2.f1144
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.f1142
            Yue.C1995.m9233(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CompoundButton r1 = r2.f1140
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CompoundButton r1 = r2.f1140
            r1.setButtonDrawable(r0)
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.res.ColorStateList m1654() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1141
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode m1655() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f1142
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m1656(@Yue.InterfaceC4544 android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.widget.CompoundButton r0 = r10.f1140
            android.content.Context r0 = r0.getContext()
            int[] r1 = Yue.C5058.C5071.f17820
            r2 = 0
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f1140
            android.content.Context r4 = r3.getContext()
            int[] r5 = Yue.C5058.C5071.f17820
            android.content.res.TypedArray r7 = r0.m23367()
            r9 = 0
            r6 = r11
            r8 = r12
            Yue.C6794.m26221(r3, r4, r5, r6, r7, r8, r9)
            int r11 = Yue.C5058.C5071.f17822     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            int r11 = Yue.C5058.C5071.f17822     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.m23360(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            android.widget.CompoundButton r12 = r10.f1140     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r11 = Yue.C0479.m1737(r1, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L5c
        L3d:
            r11 = move-exception
            goto L8c
        L3f:
            int r11 = Yue.C5058.C5071.f17821     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            int r11 = Yue.C5058.C5071.f17821     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.m23360(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            android.widget.CompoundButton r12 = r10.f1140     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = Yue.C0479.m1737(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5c:
            int r11 = Yue.C5058.C5071.f17823     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L6f
            android.widget.CompoundButton r11 = r10.f1140     // Catch: java.lang.Throwable -> L3d
            int r12 = Yue.C5058.C5071.f17823     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r0.m23343(r12)     // Catch: java.lang.Throwable -> L3d
            Yue.C1435.m7081(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L6f:
            int r11 = Yue.C5058.C5071.f17824     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L88
            android.widget.CompoundButton r11 = r10.f1140     // Catch: java.lang.Throwable -> L3d
            int r12 = Yue.C5058.C5071.f17824     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            int r12 = r0.m23354(r12, r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = Yue.C2012.m9307(r12, r1)     // Catch: java.lang.Throwable -> L3d
            Yue.C1435.m7082(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L88:
            r0.m23371()
            return
        L8c:
            r0.m23371()
            throw r11
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m1657() {
            r1 = this;
            boolean r0 = r1.f1145
            if (r0 == 0) goto L8
            r0 = 0
            r1.f1145 = r0
            return
        L8:
            r0 = 1
            r1.f1145 = r0
            r1.m1653()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m1658(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f1141 = r1
            r1 = 1
            r0.f1143 = r1
            r0.m1653()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m1659(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f1142 = r1
            r1 = 1
            r0.f1144 = r1
            r0.m1653()
            return
    }
}
