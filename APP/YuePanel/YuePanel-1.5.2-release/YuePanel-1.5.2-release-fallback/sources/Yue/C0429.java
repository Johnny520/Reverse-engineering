package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0429 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.view.View f1100;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C0456 f1101;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1102;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C6262 f1103;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C6262 f1104;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C6262 f1105;

    public C0429(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1102 = r0
            r1.f1100 = r2
            Yue.ۥۣ۟ۡۡ r2 = Yue.C0456.m1666()
            r1.f1101 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m1627(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r4) {
            r3 = this;
            Yue.ۥۢۡۥۤ r0 = r3.f1105
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r3.f1105 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r3.f1105
            r0.m23336()
            android.view.View r1 = r3.f1100
            android.content.res.ColorStateList r1 = Yue.C6794.m26126(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.f22319 = r2
            r0.f22316 = r1
        L1d:
            android.view.View r1 = r3.f1100
            android.graphics.PorterDuff$Mode r1 = Yue.C6794.m26127(r1)
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
            android.view.View r1 = r3.f1100
            int[] r1 = r1.getDrawableState()
            Yue.C0456.m1669(r4, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m1628() {
            r3 = this;
            android.view.View r0 = r3.f1100
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L30
            boolean r1 = r3.m1637()
            if (r1 == 0) goto L15
            boolean r1 = r3.m1627(r0)
            if (r1 == 0) goto L15
            return
        L15:
            Yue.ۥۢۡۥۤ r1 = r3.f1104
            if (r1 == 0) goto L23
            android.view.View r2 = r3.f1100
            int[] r2 = r2.getDrawableState()
            Yue.C0456.m1669(r0, r1, r2)
            goto L30
        L23:
            Yue.ۥۢۡۥۤ r1 = r3.f1103
            if (r1 == 0) goto L30
            android.view.View r2 = r3.f1100
            int[] r2 = r2.getDrawableState()
            Yue.C0456.m1669(r0, r1, r2)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.res.ColorStateList m1629() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1104
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f22316
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode m1630() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1104
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.f22317
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m1631(@Yue.InterfaceC4544 android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.view.View r0 = r8.f1100
            android.content.Context r0 = r0.getContext()
            int[] r1 = Yue.C5058.C5071.f18007
            r2 = 0
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r0, r9, r1, r10, r2)
            android.view.View r1 = r8.f1100
            android.content.Context r2 = r1.getContext()
            int[] r3 = Yue.C5058.C5071.f18007
            android.content.res.TypedArray r5 = r0.m23367()
            r7 = 0
            r4 = r9
            r6 = r10
            Yue.C6794.m26221(r1, r2, r3, r4, r5, r6, r7)
            int r9 = Yue.C5058.C5071.f18008     // Catch: java.lang.Throwable -> L44
            boolean r9 = r0.m23368(r9)     // Catch: java.lang.Throwable -> L44
            r10 = -1
            if (r9 == 0) goto L46
            int r9 = Yue.C5058.C5071.f18008     // Catch: java.lang.Throwable -> L44
            int r9 = r0.m23360(r9, r10)     // Catch: java.lang.Throwable -> L44
            r8.f1102 = r9     // Catch: java.lang.Throwable -> L44
            Yue.ۥۣ۟ۡۡ r9 = r8.f1101     // Catch: java.lang.Throwable -> L44
            android.view.View r1 = r8.f1100     // Catch: java.lang.Throwable -> L44
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L44
            int r2 = r8.f1102     // Catch: java.lang.Throwable -> L44
            android.content.res.ColorStateList r9 = r9.m1672(r1, r2)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L46
            r8.m1634(r9)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r9 = move-exception
            goto L75
        L46:
            int r9 = Yue.C5058.C5071.f18009     // Catch: java.lang.Throwable -> L44
            boolean r9 = r0.m23368(r9)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L59
            android.view.View r9 = r8.f1100     // Catch: java.lang.Throwable -> L44
            int r1 = Yue.C5058.C5071.f18009     // Catch: java.lang.Throwable -> L44
            android.content.res.ColorStateList r1 = r0.m23343(r1)     // Catch: java.lang.Throwable -> L44
            Yue.C6794.m26232(r9, r1)     // Catch: java.lang.Throwable -> L44
        L59:
            int r9 = Yue.C5058.C5071.f18010     // Catch: java.lang.Throwable -> L44
            boolean r9 = r0.m23368(r9)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L71
            android.view.View r9 = r8.f1100     // Catch: java.lang.Throwable -> L44
            int r1 = Yue.C5058.C5071.f18010     // Catch: java.lang.Throwable -> L44
            int r10 = r0.m23354(r1, r10)     // Catch: java.lang.Throwable -> L44
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = Yue.C2012.m9307(r10, r1)     // Catch: java.lang.Throwable -> L44
            Yue.C6794.m26233(r9, r10)     // Catch: java.lang.Throwable -> L44
        L71:
            r0.m23371()
            return
        L75:
            r0.m23371()
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m1632(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = -1
            r0.f1102 = r1
            r1 = 0
            r0.m1634(r1)
            r0.m1628()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m1633(int r3) {
            r2 = this;
            r2.f1102 = r3
            Yue.ۥۣ۟ۡۡ r0 = r2.f1101
            if (r0 == 0) goto L11
            android.view.View r1 = r2.f1100
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r3 = r0.m1672(r1, r3)
            goto L12
        L11:
            r3 = 0
        L12:
            r2.m1634(r3)
            r2.m1628()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m1634(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L15
            Yue.ۥۢۡۥۤ r0 = r1.f1103
            if (r0 != 0) goto Ld
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1103 = r0
        Ld:
            Yue.ۥۢۡۥۤ r0 = r1.f1103
            r0.f22316 = r2
            r2 = 1
            r0.f22319 = r2
            goto L18
        L15:
            r2 = 0
            r1.f1103 = r2
        L18:
            r1.m1628()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m1635(android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1104
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1104 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r1.f1104
            r0.f22316 = r2
            r2 = 1
            r0.f22319 = r2
            r1.m1628()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m1636(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1104
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1104 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r1.f1104
            r0.f22317 = r2
            r2 = 1
            r0.f22318 = r2
            r1.m1628()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m1637() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1103
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
