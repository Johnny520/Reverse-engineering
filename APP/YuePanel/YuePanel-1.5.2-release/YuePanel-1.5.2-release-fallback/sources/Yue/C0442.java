package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public class C0442 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.widget.CheckedTextView f1134;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.res.ColorStateList f1135;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f1136;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f1137;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f1138;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f1139;

    public C0442(@Yue.InterfaceC4410 android.widget.CheckedTextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1135 = r0
            r1.f1136 = r0
            r0 = 0
            r1.f1137 = r0
            r1.f1138 = r0
            r1.f1134 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1646() {
            r2 = this;
            android.widget.CheckedTextView r0 = r2.f1134
            android.graphics.drawable.Drawable r0 = Yue.C1121.m5924(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.f1137
            if (r1 != 0) goto L10
            boolean r1 = r2.f1138
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = Yue.C1995.m9235(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.f1137
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.f1135
            Yue.C1995.m9232(r0, r1)
        L21:
            boolean r1 = r2.f1138
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.f1136
            Yue.C1995.m9233(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CheckedTextView r1 = r2.f1134
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CheckedTextView r1 = r2.f1134
            r1.setCheckMarkDrawable(r0)
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.res.ColorStateList m1647() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1135
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode m1648() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f1136
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m1649(@Yue.InterfaceC4544 android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f1134
            android.content.Context r0 = r0.getContext()
            int[] r1 = Yue.C5058.C5071.f17815
            r2 = 0
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.f1134
            android.content.Context r4 = r3.getContext()
            int[] r5 = Yue.C5058.C5071.f17815
            android.content.res.TypedArray r7 = r0.m23367()
            r9 = 0
            r6 = r11
            r8 = r12
            Yue.C6794.m26221(r3, r4, r5, r6, r7, r8, r9)
            int r11 = Yue.C5058.C5071.f17817     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            int r11 = Yue.C5058.C5071.f17817     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.m23360(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            android.widget.CheckedTextView r12 = r10.f1134     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r11 = Yue.C0479.m1737(r1, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L5c
        L3d:
            r11 = move-exception
            goto L8c
        L3f:
            int r11 = Yue.C5058.C5071.f17816     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            int r11 = Yue.C5058.C5071.f17816     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.m23360(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            android.widget.CheckedTextView r12 = r10.f1134     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = Yue.C0479.m1737(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5c:
            int r11 = Yue.C5058.C5071.f17818     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L6f
            android.widget.CheckedTextView r11 = r10.f1134     // Catch: java.lang.Throwable -> L3d
            int r12 = Yue.C5058.C5071.f17818     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r0.m23343(r12)     // Catch: java.lang.Throwable -> L3d
            Yue.C1121.m5927(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L6f:
            int r11 = Yue.C5058.C5071.f17819     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.m23368(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L88
            android.widget.CheckedTextView r11 = r10.f1134     // Catch: java.lang.Throwable -> L3d
            int r12 = Yue.C5058.C5071.f17819     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            int r12 = r0.m23354(r12, r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = Yue.C2012.m9307(r12, r1)     // Catch: java.lang.Throwable -> L3d
            Yue.C1121.m5928(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L88:
            r0.m23371()
            return
        L8c:
            r0.m23371()
            throw r11
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m1650() {
            r1 = this;
            boolean r0 = r1.f1139
            if (r0 == 0) goto L8
            r0 = 0
            r1.f1139 = r0
            return
        L8:
            r0 = 1
            r1.f1139 = r0
            r1.m1646()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m1651(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f1135 = r1
            r1 = 1
            r0.f1137 = r1
            r0.m1646()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m1652(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f1136 = r1
            r1 = 1
            r0.f1138 = r1
            r0.m1646()
            return
    }
}
