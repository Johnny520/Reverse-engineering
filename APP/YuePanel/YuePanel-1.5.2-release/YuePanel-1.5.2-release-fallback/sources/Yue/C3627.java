package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class C3627 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m14667(java.lang.Object[] r0, int r1, int r2, java.util.List r3) {
            boolean r0 = m14674(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ int m14668(java.lang.Object[] r0, int r1, int r2) {
            int r0 = m14675(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String m14669(java.lang.Object[] r0, int r1, int r2) {
            java.lang.String r0 = m14676(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> E[] m14670(int r1) {
            if (r1 < 0) goto L5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            return r1
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be non-negative."
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T[] m14671(@Yue.InterfaceC4418 T[] r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <E> void m14672(@Yue.InterfaceC4418 E[] r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 0
            r1[r2] = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <E> void m14673(@Yue.InterfaceC4418 E[] r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
        L5:
            if (r2 >= r3) goto Ld
            m14672(r1, r2)
            int r2 = r2 + 1
            goto L5
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m14674(T[] r4, int r5, int r6, java.util.List<?> r7) {
            int r0 = r7.size()
            r1 = 0
            if (r6 == r0) goto L8
            return r1
        L8:
            r0 = r1
        L9:
            if (r0 >= r6) goto L1d
            int r2 = r5 + r0
            r2 = r4[r2]
            java.lang.Object r3 = r7.get(r0)
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r0 = r0 + 1
            goto L9
        L1d:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> int m14675(T[] r4, int r5, int r6) {
            r0 = 1
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r6) goto L17
            int r3 = r5 + r2
            r3 = r4[r3]
            int r0 = r0 * 31
            if (r3 == 0) goto L12
            int r3 = r3.hashCode()
            goto L13
        L12:
            r3 = r1
        L13:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> java.lang.String m14676(T[] r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lf:
            if (r1 >= r5) goto L22
            if (r1 <= 0) goto L18
            java.lang.String r2 = ", "
            r0.append(r2)
        L18:
            int r2 = r4 + r1
            r2 = r3[r2]
            r0.append(r2)
            int r1 = r1 + 1
            goto Lf
        L22:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "sb.toString()"
            Yue.C3329.m13905(r3, r4)
            return r3
    }
}
