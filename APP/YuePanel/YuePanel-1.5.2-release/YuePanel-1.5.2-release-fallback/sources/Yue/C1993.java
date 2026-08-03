package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1993 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.view.View f6330;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C1993.InterfaceC1994 f6331;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f6332;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f6333;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f6334;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final android.view.View.OnLongClickListener f6335;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final android.view.View.OnTouchListener f6336;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۤ$ۥ, reason: contains not printable characters */
    public interface InterfaceC1994 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        boolean m9217(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 Yue.C1993 r2);
    }

    public C1993(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 Yue.C1993.InterfaceC1994 r3) {
            r1 = this;
            r1.<init>()
            Yue.ۥ۠۠۠ۢ r0 = new Yue.ۥ۠۠۠ۢ
            r0.<init>(r1)
            r1.f6335 = r0
            Yue.ۥۣ۠۠۠ r0 = new Yue.ۥۣ۠۠۠
            r0.<init>(r1)
            r1.f6336 = r0
            r1.f6330 = r2
            r1.f6331 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m9212() {
            r2 = this;
            android.view.View r0 = r2.f6330
            android.view.View$OnLongClickListener r1 = r2.f6335
            r0.setOnLongClickListener(r1)
            android.view.View r0 = r2.f6330
            android.view.View$OnTouchListener r1 = r2.f6336
            r0.setOnTouchListener(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m9213() {
            r2 = this;
            android.view.View r0 = r2.f6330
            r1 = 0
            r0.setOnLongClickListener(r1)
            android.view.View r0 = r2.f6330
            r0.setOnTouchListener(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m9214(@Yue.InterfaceC4410 android.graphics.Point r3) {
            r2 = this;
            int r0 = r2.f6332
            int r1 = r2.f6333
            r3.set(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m9215(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            boolean r0 = r1.f6334
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L6:
            Yue.ۥ۠۠۠ۤ$ۥ r0 = r1.f6331
            boolean r2 = r0.m9217(r2, r1)
            r1.f6334 = r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m9216(@Yue.InterfaceC4410 android.view.View r7, @Yue.InterfaceC4410 android.view.MotionEvent r8) {
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = Yue.C4270.m16629(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f6334
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f6332
            if (r8 != r0) goto L39
            int r8 = r6.f6333
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f6332 = r0
            r6.f6333 = r1
            Yue.ۥ۠۠۠ۤ$ۥ r8 = r6.f6331
            boolean r7 = r8.m9217(r7, r6)
            r6.f6334 = r7
            return r7
        L46:
            r6.f6334 = r3
            goto L4d
        L49:
            r6.f6332 = r0
            r6.f6333 = r1
        L4d:
            return r3
    }
}
