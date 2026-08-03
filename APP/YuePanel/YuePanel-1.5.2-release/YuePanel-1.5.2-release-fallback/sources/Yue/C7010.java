package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7010 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f24512 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int f24513;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.ArrayList<Yue.C1517> f24514;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f24515;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f24516;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f24517;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<Yue.C7010.C7011> f24518;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f24519;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ, reason: contains not printable characters */
    public class C7011 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.ref.WeakReference<Yue.C1517> f24520;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f24521;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f24522;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f24523;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f24524;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f24525;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f24526;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C7010 f24527;

        public C7011(Yue.C7010 r1, Yue.C1517 r2, Yue.C3609 r3, int r4) {
                r0 = this;
                r0.f24527 = r1
                r0.<init>()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.f24520 = r1
                Yue.ۥ۟ۧ۟۠ r1 = r2.f4854
                int r1 = r3.m14597(r1)
                r0.f24521 = r1
                Yue.ۥ۟ۧ۟۠ r1 = r2.f4855
                int r1 = r3.m14597(r1)
                r0.f24522 = r1
                Yue.ۥ۟ۧ۟۠ r1 = r2.f4856
                int r1 = r3.m14597(r1)
                r0.f24523 = r1
                Yue.ۥ۟ۧ۟۠ r1 = r2.f4857
                int r1 = r3.m14597(r1)
                r0.f24524 = r1
                Yue.ۥ۟ۧ۟۠ r1 = r2.f4858
                int r1 = r3.m14597(r1)
                r0.f24525 = r1
                r0.f24526 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m27161() {
                r8 = this;
                java.lang.ref.WeakReference<Yue.ۥ۟ۧ۟ۢ> r0 = r8.f24520
                java.lang.Object r0 = r0.get()
                r1 = r0
                Yue.ۥ۟ۧ۟ۢ r1 = (Yue.C1517) r1
                if (r1 == 0) goto L1a
                int r2 = r8.f24521
                int r3 = r8.f24522
                int r4 = r8.f24523
                int r5 = r8.f24524
                int r6 = r8.f24525
                int r7 = r8.f24526
                r1.m7579(r2, r3, r4, r5, r6, r7)
            L1a:
                return
        }
    }

    static {
            return
    }

    public C7010(int r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f24514 = r0
            r0 = 0
            r2.f24516 = r0
            r0 = 0
            r2.f24518 = r0
            r0 = -1
            r2.f24519 = r0
            int r0 = Yue.C7010.f24513
            int r1 = r0 + 1
            Yue.C7010.f24513 = r1
            r2.f24515 = r0
            r2.f24517 = r3
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.m27151()
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            int r1 = r4.f24515
            r0.append(r1)
            java.lang.String r1 = "] <"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r1 = r4.f24514
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            java.lang.String r0 = r2.m7507()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L25
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " >"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m27144(Yue.C1517 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24514
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24514
            r0.add(r2)
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m27145() {
            r2 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۟$ۥ> r0 = r2.f24518
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.f24516
            if (r0 != 0) goto La
            return
        La:
            r0 = 0
        Lb:
            java.util.ArrayList<Yue.ۥۢۥۣ۟$ۥ> r1 = r2.f24518
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<Yue.ۥۢۥۣ۟$ۥ> r1 = r2.f24518
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۥۣ۟$ۥ r1 = (Yue.C7010.C7011) r1
            r1.m27161()
            int r0 = r0 + 1
            goto Lb
        L21:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m27146(java.util.ArrayList<Yue.C7010> r6) {
            r5 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r5.f24514
            int r0 = r0.size()
            int r1 = r5.f24519
            r2 = -1
            if (r1 == r2) goto L28
            if (r0 <= 0) goto L28
            r1 = 0
        Le:
            int r2 = r6.size()
            if (r1 >= r2) goto L28
            java.lang.Object r2 = r6.get(r1)
            Yue.ۥۢۥۣ۟ r2 = (Yue.C7010) r2
            int r3 = r5.f24519
            int r4 = r2.f24515
            if (r3 != r4) goto L25
            int r3 = r5.f24517
            r5.m27156(r3, r2)
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            if (r0 != 0) goto L2d
            r6.remove(r5)
        L2d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m27147() {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24514
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m27148(Yue.C1517 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24514
            boolean r2 = r0.contains(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m27149() {
            r1 = this;
            int r0 = r1.f24515
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m27150() {
            r1 = this;
            int r0 = r1.f24517
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.lang.String m27151() {
            r2 = this;
            int r0 = r2.f24517
            if (r0 != 0) goto L7
            java.lang.String r0 = "Horizontal"
            return r0
        L7:
            r1 = 1
            if (r0 != r1) goto Ld
            java.lang.String r0 = "Vertical"
            return r0
        Ld:
            r1 = 2
            if (r0 != r1) goto L13
            java.lang.String r0 = "Both"
            return r0
        L13:
            java.lang.String r0 = "Unknown"
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m27152(Yue.C7010 r4) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r2 = r3.f24514
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r2 = r3.f24514
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            boolean r2 = r4.m27148(r2)
            if (r2 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m27153() {
            r1 = this;
            boolean r0 = r1.f24516
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m27154(int r3, Yue.C1517 r4) {
            r2 = this;
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r4.m7508(r3)
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4912
            if (r0 == r1) goto L13
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4914
            if (r0 == r1) goto L13
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4911
            if (r0 != r1) goto L11
            goto L13
        L11:
            r3 = -1
            return r3
        L13:
            if (r3 != 0) goto L1a
            int r3 = r4.m7544()
            goto L1e
        L1a:
            int r3 = r4.m7512()
        L1e:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m27155(Yue.C3609 r2, int r3) {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24514
            int r0 = r0.size()
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24514
            int r2 = r1.m27160(r2, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m27156(int r4, Yue.C7010 r5) {
            r3 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r3.f24514
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۟ۢ r1 = (Yue.C1517) r1
            r5.m27144(r1)
            if (r4 != 0) goto L1e
            int r2 = r5.m27149()
            r1.f4907 = r2
            goto L6
        L1e:
            int r2 = r5.m27149()
            r1.f4908 = r2
            goto L6
        L25:
            int r4 = r5.f24515
            r3.f24519 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m27157(boolean r1) {
            r0 = this;
            r0.f24516 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m27158(int r1) {
            r0 = this;
            r0.f24517 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m27159() {
            r1 = this;
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r1.f24514
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m27160(Yue.C3609 r5, java.util.ArrayList<Yue.C1517> r6, int r7) {
            r4 = this;
            r0 = 0
            java.lang.Object r1 = r6.get(r0)
            Yue.ۥ۟ۧ۟ۢ r1 = (Yue.C1517) r1
            Yue.ۥ۟ۧ۟ۢ r1 = r1.m7529()
            Yue.ۥۣ۟ۧ۟ r1 = (Yue.C1520) r1
            r5.m14607()
            r1.mo4464(r5, r0)
            r2 = r0
        L14:
            int r3 = r6.size()
            if (r2 >= r3) goto L26
            java.lang.Object r3 = r6.get(r2)
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            r3.mo4464(r5, r0)
            int r2 = r2 + 1
            goto L14
        L26:
            if (r7 != 0) goto L2f
            int r2 = r1.f4931
            if (r2 <= 0) goto L2f
            Yue.C0965.m5437(r1, r5, r6, r0)
        L2f:
            r2 = 1
            if (r7 != r2) goto L39
            int r3 = r1.f4932
            if (r3 <= 0) goto L39
            Yue.C0965.m5437(r1, r5, r6, r2)
        L39:
            r5.m14602()     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r2 = move-exception
            r2.printStackTrace()
        L41:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.f24518 = r2
        L48:
            int r2 = r6.size()
            if (r0 >= r2) goto L61
            java.lang.Object r2 = r6.get(r0)
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            Yue.ۥۢۥۣ۟$ۥ r3 = new Yue.ۥۢۥۣ۟$ۥ
            r3.<init>(r4, r2, r5, r7)
            java.util.ArrayList<Yue.ۥۢۥۣ۟$ۥ> r2 = r4.f24518
            r2.add(r3)
            int r0 = r0 + 1
            goto L48
        L61:
            if (r7 != 0) goto L74
            Yue.ۥ۟ۧ۟۠ r6 = r1.f4854
            int r6 = r5.m14597(r6)
            Yue.ۥ۟ۧ۟۠ r7 = r1.f4856
            int r7 = r5.m14597(r7)
            r5.m14607()
        L72:
            int r7 = r7 - r6
            return r7
        L74:
            Yue.ۥ۟ۧ۟۠ r6 = r1.f4855
            int r6 = r5.m14597(r6)
            Yue.ۥ۟ۧ۟۠ r7 = r1.f4857
            int r7 = r5.m14597(r7)
            r5.m14607()
            goto L72
    }
}
