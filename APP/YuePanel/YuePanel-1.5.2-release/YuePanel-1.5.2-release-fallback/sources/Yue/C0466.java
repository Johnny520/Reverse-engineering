package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C0466 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.widget.ImageView f1178;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6262 f1179;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C6262 f1180;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C6262 f1181;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f1182;

    public C0466(@Yue.InterfaceC4410 android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1182 = r0
            r1.f1178 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m1706(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r4) {
            r3 = this;
            Yue.ۥۢۡۥۤ r0 = r3.f1181
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r3.f1181 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r3.f1181
            r0.m23336()
            android.widget.ImageView r1 = r3.f1178
            android.content.res.ColorStateList r1 = Yue.C3230.m13644(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.f22319 = r2
            r0.f22316 = r1
        L1d:
            android.widget.ImageView r1 = r3.f1178
            android.graphics.PorterDuff$Mode r1 = Yue.C3230.m13645(r1)
            if (r1 == 0) goto L29
            r0.f22318 = r2
            r0.f22317 = r1
        L29:
            boolean r1 = r0.f22319
            if (r1 != 0) goto L34
            boolean r1 = r0.f22318
            if (r1 == 0) goto L32
            goto L34
        L32:
            r4 = 0
            return r4
        L34:
            android.widget.ImageView r1 = r3.f1178
            int[] r1 = r1.getDrawableState()
            Yue.C0456.m1669(r4, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m1707() {
            r2 = this;
            android.widget.ImageView r0 = r2.f1178
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L13
            android.widget.ImageView r0 = r2.f1178
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            int r1 = r2.f1182
            r0.setLevel(r1)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m1708() {
            r3 = this;
            android.widget.ImageView r0 = r3.f1178
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto Lb
            Yue.C2012.m9304(r0)
        Lb:
            if (r0 == 0) goto L35
            boolean r1 = r3.m1718()
            if (r1 == 0) goto L1a
            boolean r1 = r3.m1706(r0)
            if (r1 == 0) goto L1a
            return
        L1a:
            Yue.ۥۢۡۥۤ r1 = r3.f1180
            if (r1 == 0) goto L28
            android.widget.ImageView r2 = r3.f1178
            int[] r2 = r2.getDrawableState()
            Yue.C0456.m1669(r0, r1, r2)
            goto L35
        L28:
            Yue.ۥۢۡۥۤ r1 = r3.f1179
            if (r1 == 0) goto L35
            android.widget.ImageView r2 = r3.f1178
            int[] r2 = r2.getDrawableState()
            Yue.C0456.m1669(r0, r1, r2)
        L35:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.content.res.ColorStateList m1709() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1180
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f22316
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode m1710() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1180
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.f22317
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m1711() {
            r1 = this;
            android.widget.ImageView r0 = r1.f1178
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m1712(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.ImageView r0 = r8.f1178
            android.content.Context r0 = r0.getContext()
            int[] r1 = Yue.C5058.C5071.f17644
            r2 = 0
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r0, r9, r1, r10, r2)
            android.widget.ImageView r1 = r8.f1178
            android.content.Context r2 = r1.getContext()
            int[] r3 = Yue.C5058.C5071.f17644
            android.content.res.TypedArray r5 = r0.m23367()
            r7 = 0
            r4 = r9
            r6 = r10
            Yue.C6794.m26221(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ImageView r9 = r8.f1178     // Catch: java.lang.Throwable -> L42
            android.graphics.drawable.Drawable r9 = r9.getDrawable()     // Catch: java.lang.Throwable -> L42
            r10 = -1
            if (r9 != 0) goto L44
            int r1 = Yue.C5058.C5071.f17646     // Catch: java.lang.Throwable -> L42
            int r1 = r0.m23360(r1, r10)     // Catch: java.lang.Throwable -> L42
            if (r1 == r10) goto L44
            android.widget.ImageView r9 = r8.f1178     // Catch: java.lang.Throwable -> L42
            android.content.Context r9 = r9.getContext()     // Catch: java.lang.Throwable -> L42
            android.graphics.drawable.Drawable r9 = Yue.C0479.m1737(r9, r1)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L44
            android.widget.ImageView r1 = r8.f1178     // Catch: java.lang.Throwable -> L42
            r1.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r9 = move-exception
            goto L78
        L44:
            if (r9 == 0) goto L49
            Yue.C2012.m9304(r9)     // Catch: java.lang.Throwable -> L42
        L49:
            int r9 = Yue.C5058.C5071.f17647     // Catch: java.lang.Throwable -> L42
            boolean r9 = r0.m23368(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L5c
            android.widget.ImageView r9 = r8.f1178     // Catch: java.lang.Throwable -> L42
            int r1 = Yue.C5058.C5071.f17647     // Catch: java.lang.Throwable -> L42
            android.content.res.ColorStateList r1 = r0.m23343(r1)     // Catch: java.lang.Throwable -> L42
            Yue.C3230.m13646(r9, r1)     // Catch: java.lang.Throwable -> L42
        L5c:
            int r9 = Yue.C5058.C5071.f17648     // Catch: java.lang.Throwable -> L42
            boolean r9 = r0.m23368(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L74
            android.widget.ImageView r9 = r8.f1178     // Catch: java.lang.Throwable -> L42
            int r1 = Yue.C5058.C5071.f17648     // Catch: java.lang.Throwable -> L42
            int r10 = r0.m23354(r1, r10)     // Catch: java.lang.Throwable -> L42
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = Yue.C2012.m9307(r10, r1)     // Catch: java.lang.Throwable -> L42
            Yue.C3230.m13647(r9, r10)     // Catch: java.lang.Throwable -> L42
        L74:
            r0.m23371()
            return
        L78:
            r0.m23371()
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m1713(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1) {
            r0 = this;
            int r1 = r1.getLevel()
            r0.f1182 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m1714(int r2) {
            r1 = this;
            if (r2 == 0) goto L17
            android.widget.ImageView r0 = r1.f1178
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            if (r2 == 0) goto L11
            Yue.C2012.m9304(r2)
        L11:
            android.widget.ImageView r0 = r1.f1178
            r0.setImageDrawable(r2)
            goto L1d
        L17:
            android.widget.ImageView r2 = r1.f1178
            r0 = 0
            r2.setImageDrawable(r0)
        L1d:
            r1.m1708()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m1715(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            Yue.ۥۢۡۥۤ r0 = r1.f1179
            if (r0 != 0) goto Ld
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1179 = r0
        Ld:
            Yue.ۥۢۡۥۤ r0 = r1.f1179
            r0.f22316 = r2
            r2 = 1
            r0.f22319 = r2
            goto L18
        L15:
            r2 = 0
            r1.f1179 = r2
        L18:
            r1.m1708()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m1716(android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1180
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1180 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r1.f1180
            r0.f22316 = r2
            r2 = 1
            r0.f22319 = r2
            r1.m1708()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m1717(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1180
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1180 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r1.f1180
            r0.f22317 = r2
            r2 = 1
            r0.f22318 = r2
            r1.m1708()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m1718() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1179
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
