package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0714 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    public static final class C0715 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f1966;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f1967;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f1968;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f1969;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f1970;

        public C0715(Yue.InterfaceC1598<? super Yue.C0714.C0715> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f1969 = r2
                int r2 = r1.f1970
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f1970 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C0714.m4457(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    public static final class C0716 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f1971;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f1972;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f1973;

        public C0716(Yue.InterfaceC1598<? super Yue.C0714.C0716> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f1972 = r2
                int r2 = r1.f1973
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f1973 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C0714.m4456(r2, r1)
                return r2
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> java.lang.Object m4454(@Yue.InterfaceC4418 java.util.Collection<? extends Yue.InterfaceC1796<? extends T>> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.util.List<? extends T>> r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = Yue.C1208.m6210()
            return r2
        Lb:
            Yue.ۥۣ۟ۢۤ r0 = new Yue.ۥۣ۟ۢۤ
            r1 = 0
            Yue.ۥ۟ۨۧۥ[] r1 = new Yue.InterfaceC1796[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            if (r2 == 0) goto L20
            Yue.ۥ۟ۨۧۥ[] r2 = (Yue.InterfaceC1796[]) r2
            r0.<init>(r2)
            java.lang.Object r2 = r0.m4447(r3)
            return r2
        L20:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m4455(@Yue.InterfaceC4418 Yue.InterfaceC1796<? extends T>[] r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.util.List<? extends T>> r2) {
            int r0 = r1.length
            if (r0 != 0) goto L8
            java.util.List r1 = Yue.C1208.m6210()
            return r1
        L8:
            Yue.ۥۣ۟ۢۤ r0 = new Yue.ۥۣ۟ۢۤ
            r0.<init>(r1)
            java.lang.Object r1 = r0.m4447(r2)
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Object m4456(@Yue.InterfaceC4418 java.util.Collection<? extends Yue.InterfaceC3383> r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r5) {
            boolean r0 = r5 instanceof Yue.C0714.C0716
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥ۟ۢۤۤ$ۥ۟ r0 = (Yue.C0714.C0716) r0
            int r1 = r0.f1973
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1973 = r1
            goto L18
        L13:
            Yue.ۥ۟ۢۤۤ$ۥ۟ r0 = new Yue.ۥ۟ۢۤۤ$ۥ۟
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1972
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f1973
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f1971
            java.util.Iterator r4 = (java.util.Iterator) r4
            Yue.C5391.m20403(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Yue.C5391.m20403(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            Yue.ۥ۠ۦ۟ۡ r5 = (Yue.InterfaceC3383) r5
            r0.f1971 = r4
            r0.f1973 = r3
            java.lang.Object r5 = r5.mo13984(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object m4457(@Yue.InterfaceC4418 Yue.InterfaceC3383[] r6, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r7) {
            boolean r0 = r7 instanceof Yue.C0714.C0715
            if (r0 == 0) goto L13
            r0 = r7
            Yue.ۥ۟ۢۤۤ$ۥ r0 = (Yue.C0714.C0715) r0
            int r1 = r0.f1970
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1970 = r1
            goto L18
        L13:
            Yue.ۥ۟ۢۤۤ$ۥ r0 = new Yue.ۥ۟ۢۤۤ$ۥ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1969
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f1970
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f1968
            int r2 = r0.f1967
            java.lang.Object r4 = r0.f1966
            Yue.ۥ۠ۦ۟ۡ[] r4 = (Yue.InterfaceC3383[]) r4
            Yue.C5391.m20403(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            Yue.C5391.m20403(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f1966 = r7
            r0.f1967 = r2
            r0.f1968 = r6
            r0.f1970 = r3
            java.lang.Object r4 = r4.mo13984(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016
            return r6
    }
}
