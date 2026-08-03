package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2257 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f7020 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC1675 f7021 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ, reason: contains not printable characters */
    public static final class C2258<T> implements java.util.Comparator {
        public C2258() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public final int compare(T r1, T r2) {
                r0 = this;
                java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
                java.lang.Class[] r2 = r2.getParameterTypes()
                int r2 = r2.length
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
                java.lang.Class[] r1 = r1.getParameterTypes()
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r1 = Yue.C1395.m6935(r2, r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟, reason: contains not printable characters */
    public static final class C2259 extends Yue.AbstractC3560 implements Yue.InterfaceC2825 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C2257.C2259 f7022 = null;

        static {
                Yue.ۥ۠ۡۢۥ$ۥ۟ r0 = new Yue.ۥ۠ۡۢۥ$ۥ۟
                r0.<init>()
                Yue.C2257.C2259.f7022 = r0
                return
        }

        public C2259() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Void r1 = r0.m10458(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Void m10458(@Yue.InterfaceC4418 java.lang.Throwable r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2260 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.reflect.Constructor f7023;

        public C2260(java.lang.reflect.Constructor r1) {
                r0 = this;
                r0.f7023 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.m10459(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Throwable m10459(@Yue.InterfaceC4418 java.lang.Throwable r3) {
                r2 = this;
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L19
                java.lang.reflect.Constructor r0 = r2.f7023     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = r3.getMessage()     // Catch: java.lang.Throwable -> L19
                java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L19
                if (r3 == 0) goto L1b
                java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L19
                java.lang.Object r3 = Yue.C5388.m20377(r3)     // Catch: java.lang.Throwable -> L19
                goto L2d
            L19:
                r3 = move-exception
                goto L23
            L1b:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L19
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Throwable"
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L19
                throw r3     // Catch: java.lang.Throwable -> L19
            L23:
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
                java.lang.Object r3 = Yue.C5391.m20390(r3)
                java.lang.Object r3 = Yue.C5388.m20377(r3)
            L2d:
                boolean r0 = Yue.C5388.m20384(r3)
                if (r0 == 0) goto L34
                r3 = 0
            L34:
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C2261 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.reflect.Constructor f7024;

        public C2261(java.lang.reflect.Constructor r1) {
                r0 = this;
                r0.f7024 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.m10460(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Throwable m10460(@Yue.InterfaceC4418 java.lang.Throwable r2) {
                r1 = this;
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L15
                java.lang.reflect.Constructor r0 = r1.f7024     // Catch: java.lang.Throwable -> L15
                java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L15
                java.lang.Object r2 = r0.newInstance(r2)     // Catch: java.lang.Throwable -> L15
                if (r2 == 0) goto L17
                java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L15
                java.lang.Object r2 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L15
                goto L29
            L15:
                r2 = move-exception
                goto L1f
            L17:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L15
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Throwable"
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L15
                throw r2     // Catch: java.lang.Throwable -> L15
            L1f:
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
                java.lang.Object r2 = Yue.C5391.m20390(r2)
                java.lang.Object r2 = Yue.C5388.m20377(r2)
            L29:
                boolean r0 = Yue.C5388.m20384(r2)
                if (r0 == 0) goto L30
                r2 = 0
            L30:
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C2262 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.reflect.Constructor f7025;

        public C2262(java.lang.reflect.Constructor r1) {
                r0 = this;
                r0.f7025 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.m10461(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Throwable m10461(@Yue.InterfaceC4418 java.lang.Throwable r3) {
                r2 = this;
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L1c
                java.lang.reflect.Constructor r0 = r2.f7025     // Catch: java.lang.Throwable -> L1c
                java.lang.String r1 = r3.getMessage()     // Catch: java.lang.Throwable -> L1c
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L1e
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L1c
                r0.initCause(r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = Yue.C5388.m20377(r0)     // Catch: java.lang.Throwable -> L1c
                goto L30
            L1c:
                r3 = move-exception
                goto L26
            L1e:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1c
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Throwable"
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L1c
                throw r3     // Catch: java.lang.Throwable -> L1c
            L26:
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
                java.lang.Object r3 = Yue.C5391.m20390(r3)
                java.lang.Object r3 = Yue.C5388.m20377(r3)
            L30:
                boolean r0 = Yue.C5388.m20384(r3)
                if (r0 == 0) goto L37
                r3 = 0
            L37:
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C2263 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.reflect.Constructor f7026;

        public C2263(java.lang.reflect.Constructor r1) {
                r0 = this;
                r0.f7026 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.m10462(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Throwable m10462(@Yue.InterfaceC4418 java.lang.Throwable r3) {
                r2 = this;
                r0 = 0
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L15
                java.lang.reflect.Constructor r1 = r2.f7026     // Catch: java.lang.Throwable -> L15
                java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L15
                if (r1 == 0) goto L17
                java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L15
                r1.initCause(r3)     // Catch: java.lang.Throwable -> L15
                java.lang.Object r3 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L15
                goto L29
            L15:
                r3 = move-exception
                goto L1f
            L17:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L15
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Throwable"
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L15
                throw r3     // Catch: java.lang.Throwable -> L15
            L1f:
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
                java.lang.Object r3 = Yue.C5391.m20390(r3)
                java.lang.Object r3 = Yue.C5388.m20377(r3)
            L29:
                boolean r1 = Yue.C5388.m20384(r3)
                if (r1 == 0) goto L30
                goto L31
            L30:
                r0 = r3
            L31:
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C2264 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> f7027;

        public C2264(Yue.InterfaceC2825<? super java.lang.Throwable, ? extends java.lang.Throwable> r1) {
                r0 = this;
                r0.f7027 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Throwable invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Throwable r1 = r0.m10463(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Throwable m10463(@Yue.InterfaceC4418 java.lang.Throwable r3) {
                r2 = this;
                Yue.ۥۣ۠ۡ۟<java.lang.Throwable, java.lang.Throwable> r0 = r2.f7027
                Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r3 = r0.invoke(r3)     // Catch: java.lang.Throwable -> Lf
                java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r3 = Yue.C5388.m20377(r3)     // Catch: java.lang.Throwable -> Lf
                goto L1a
            Lf:
                r3 = move-exception
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
                java.lang.Object r3 = Yue.C5391.m20390(r3)
                java.lang.Object r3 = Yue.C5388.m20377(r3)
            L1a:
                boolean r0 = Yue.C5388.m20384(r3)
                if (r0 == 0) goto L21
                r3 = 0
            L21:
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                return r3
        }
    }

    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r1 = -1
            int r0 = m10455(r0, r1)
            Yue.C2257.f7020 = r0
            boolean r0 = Yue.C2337.m10722()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            Yue.ۥۢۥۡ r0 = Yue.C6978.f24344     // Catch: java.lang.Throwable -> L15
            goto L17
        L12:
            Yue.ۥ۟ۤۧۤ r0 = Yue.C1150.f3540     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            Yue.ۥۢۥۡ r0 = Yue.C6978.f24344
        L17:
            Yue.C2257.f7021 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m10450(java.lang.Class r0) {
            Yue.ۥۣ۠ۡ۟ r0 = m10451(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> m10451(java.lang.Class<E> r3) {
            Yue.ۥ۠ۡۢۥ$ۥ۟ r0 = Yue.C2257.C2259.f7022
            int r1 = Yue.C2257.f7020
            r2 = 0
            int r2 = m10455(r3, r2)
            if (r1 == r2) goto Lc
            return r0
        Lc:
            java.lang.reflect.Constructor[] r3 = r3.getConstructors()
            Yue.ۥ۠ۡۢۥ$ۥ r1 = new Yue.ۥ۠ۡۢۥ$ۥ
            r1.<init>()
            java.util.List r3 = Yue.C0595.m3829(r3, r1)
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            Yue.ۥۣ۠ۡ۟ r1 = m10452(r1)
            if (r1 == 0) goto L1d
            return r1
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> m10452(java.lang.reflect.Constructor<?> r8) {
            java.lang.Class[] r0 = r8.getParameterTypes()
            int r1 = r0.length
            if (r1 == 0) goto L44
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r5 = 1
            r6 = 0
            if (r1 == r5) goto L2a
            r7 = 2
            if (r1 == r7) goto L14
            goto L49
        L14:
            r1 = r0[r4]
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L49
            r0 = r0[r5]
            boolean r0 = Yue.C3329.m13897(r0, r2)
            if (r0 == 0) goto L49
            Yue.ۥ۠ۡۢۥ$ۥ۟۟ r6 = new Yue.ۥ۠ۡۢۥ$ۥ۟۟
            r6.<init>(r8)
            goto L49
        L2a:
            r0 = r0[r4]
            boolean r1 = Yue.C3329.m13897(r0, r2)
            if (r1 == 0) goto L38
            Yue.ۥ۠ۡۢۥ$ۥ۟۟۟ r6 = new Yue.ۥ۠ۡۢۥ$ۥ۟۟۟
            r6.<init>(r8)
            goto L49
        L38:
            boolean r0 = Yue.C3329.m13897(r0, r3)
            if (r0 == 0) goto L49
            Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۟ r6 = new Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۟
            r6.<init>(r8)
            goto L49
        L44:
            Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۠ r6 = new Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۠
            r6.<init>(r8)
        L49:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m10453(java.lang.Class<?> r5, int r6) {
        L0:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L7:
            if (r2 >= r1) goto L1c
            r4 = r0[r2]
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L19
            int r3 = r3 + 1
        L19:
            int r2 = r2 + 1
            goto L7
        L1c:
            int r6 = r6 + r3
            java.lang.Class r5 = r5.getSuperclass()
            if (r5 != 0) goto L0
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m10454(java.lang.Class r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = m10453(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m10455(java.lang.Class<?> r3, int r4) {
            Yue.C3413.m14197(r3)
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = m10454(r3, r2, r0, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = Yue.C5388.m20377(r3)     // Catch: java.lang.Throwable -> L15
            goto L20
        L15:
            r3 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
            java.lang.Object r3 = Yue.C5391.m20390(r3)
            java.lang.Object r3 = Yue.C5388.m20377(r3)
        L20:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r0 = Yue.C5388.m20384(r3)
            if (r0 == 0) goto L2b
            r3 = r4
        L2b:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.InterfaceC2825<java.lang.Throwable, java.lang.Throwable> m10456(Yue.InterfaceC2825<? super java.lang.Throwable, ? extends java.lang.Throwable> r1) {
            Yue.ۥ۠ۡۢۥ$ۥ۟۟۟ۡ r0 = new Yue.ۥ۠ۡۢۥ$ۥ۟۟۟ۡ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m10457(@Yue.InterfaceC4418 E r2) {
            boolean r0 = r2 instanceof Yue.InterfaceC1631
            if (r0 == 0) goto L26
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L11
            Yue.ۥ۟ۧۦۤ r2 = (Yue.InterfaceC1631) r2     // Catch: java.lang.Throwable -> L11
            java.lang.Throwable r2 = r2.mo7905()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L11
            goto L1c
        L11:
            r2 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
            java.lang.Object r2 = Yue.C5391.m20390(r2)
            java.lang.Object r2 = Yue.C5388.m20377(r2)
        L1c:
            boolean r0 = Yue.C5388.m20384(r2)
            if (r0 == 0) goto L23
            r2 = 0
        L23:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L26:
            Yue.ۥ۟ۧۨۦ r0 = Yue.C2257.f7021
            java.lang.Class r1 = r2.getClass()
            Yue.ۥۣ۠ۡ۟ r0 = r0.mo6046(r1)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
    }
}
