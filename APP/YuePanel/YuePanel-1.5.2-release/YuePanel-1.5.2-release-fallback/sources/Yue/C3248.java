package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3419
public final class C3248<E> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.Object f10624;

    public /* synthetic */ C3248(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f10624 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C3248 m13674(java.lang.Object r1) {
            Yue.ۥ۠ۥۢۡ r0 = new Yue.ۥ۠ۥۢۡ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <E> java.lang.Object m13675(@Yue.InterfaceC4543 java.lang.Object r0) {
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m13676(java.lang.Object r0, int r1, Yue.C1769 r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            java.lang.Object r0 = m13675(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m13677(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof Yue.C3248
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥ۠ۥۢۡ r3 = (Yue.C3248) r3
            java.lang.Object r3 = r3.m13683()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m13678(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = Yue.C3329.m13897(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m13679(java.lang.Object r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super E, Yue.C6593> r3) {
            if (r2 != 0) goto L3
            return
        L3:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto Lb
            r3.invoke(r2)
            goto L20
        Lb:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L13:
            r1 = -1
            if (r1 >= r0) goto L20
            java.lang.Object r1 = r2.get(r0)
            r3.invoke(r1)
            int r0 = r0 + (-1)
            goto L13
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m13680(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.Object m13681(java.lang.Object r2, E r3) {
            if (r2 != 0) goto L7
            java.lang.Object r2 = m13675(r3)
            goto L26
        L7:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto L16
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
            java.lang.Object r2 = m13675(r2)
            goto L26
        L16:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            java.lang.Object r2 = m13675(r0)
        L26:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m13682(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InlineList(holder="
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10624
            boolean r2 = m13677(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f10624
            int r0 = m13680(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.f10624
            java.lang.String r0 = m13682(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object m13683() {
            r1 = this;
            java.lang.Object r0 = r1.f10624
            return r0
    }
}
