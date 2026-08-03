package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "StreamsKt")
public final class C5962 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    public static final class C5963<T> implements Yue.InterfaceC5609<T> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.stream.Stream f21741;

        public C5963(java.util.stream.Stream r1) {
                r0 = this;
                r0.f21741 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<T> iterator() {
                r2 = this;
                java.util.stream.Stream r0 = r2.f21741
                java.util.Iterator r0 = r0.iterator()
                java.lang.String r1 = "iterator()"
                Yue.C3329.m13905(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    public static final class C5964 implements Yue.InterfaceC5609<java.lang.Integer> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.stream.IntStream f21742;

        public C5964(java.util.stream.IntStream r1) {
                r0 = this;
                r0.f21742 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<java.lang.Integer> iterator() {
                r2 = this;
                java.util.stream.IntStream r0 = r2.f21742
                java.util.PrimitiveIterator$OfInt r0 = r0.iterator()
                java.lang.String r1 = "iterator()"
                Yue.C3329.m13905(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    public static final class C5965 implements Yue.InterfaceC5609<java.lang.Long> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.stream.LongStream f21743;

        public C5965(java.util.stream.LongStream r1) {
                r0 = this;
                r0.f21743 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<java.lang.Long> iterator() {
                r2 = this;
                java.util.stream.LongStream r0 = r2.f21743
                java.util.PrimitiveIterator$OfLong r0 = r0.iterator()
                java.lang.String r1 = "iterator()"
                Yue.C3329.m13905(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    public static final class C5966 implements Yue.InterfaceC5609<java.lang.Double> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.stream.DoubleStream f21744;

        public C5966(java.util.stream.DoubleStream r1) {
                r0 = this;
                r0.f21744 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<java.lang.Double> iterator() {
                r2 = this;
                java.util.stream.DoubleStream r0 = r2.f21744
                java.util.PrimitiveIterator$OfDouble r0 = r0.iterator()
                java.lang.String r1 = "iterator()"
                Yue.C3329.m13905(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.util.Spliterator m22100(Yue.InterfaceC5609 r0) {
            java.util.Spliterator r0 = m22106(r0)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.Double> m22101(@Yue.InterfaceC4418 java.util.stream.DoubleStream r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۢ۠۠ۨ$ۥ۟۟۟ r0 = new Yue.ۥۢ۠۠ۨ$ۥ۟۟۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.Integer> m22102(@Yue.InterfaceC4418 java.util.stream.IntStream r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۢ۠۠ۨ$ۥ۟ r0 = new Yue.ۥۢ۠۠ۨ$ۥ۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.Long> m22103(@Yue.InterfaceC4418 java.util.stream.LongStream r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۢ۠۠ۨ$ۥ۟۟ r0 = new Yue.ۥۢ۠۠ۨ$ۥ۟۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC5609<T> m22104(@Yue.InterfaceC4418 java.util.stream.Stream<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۢ۠۠ۨ$ۥ r0 = new Yue.ۥۢ۠۠ۨ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> java.util.stream.Stream<T> m22105(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۢ۠۠ۧ r0 = new Yue.ۥۢ۠۠ۧ
            r0.<init>(r2)
            r2 = 16
            r1 = 0
            java.util.stream.Stream r2 = java.util.stream.StreamSupport.stream(r0, r2, r1)
            java.lang.String r0 = "stream({ Spliterators.sp…literator.ORDERED, false)"
            Yue.C3329.m13905(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.util.Spliterator m22106(Yue.InterfaceC5609 r1) {
            java.lang.String r0 = "$this_asStream"
            Yue.C3329.m13906(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            r0 = 16
            java.util.Spliterator r1 = java.util.Spliterators.spliteratorUnknownSize(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.util.List<java.lang.Double> m22107(@Yue.InterfaceC4418 java.util.stream.DoubleStream r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            double[] r1 = r1.toArray()
            java.lang.String r0 = "toArray()"
            Yue.C3329.m13905(r1, r0)
            java.util.List r1 = Yue.C0586.m2112(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.util.List<java.lang.Integer> m22108(@Yue.InterfaceC4418 java.util.stream.IntStream r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int[] r1 = r1.toArray()
            java.lang.String r0 = "toArray()"
            Yue.C3329.m13905(r1, r0)
            java.util.List r1 = Yue.C0586.m2114(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.util.List<java.lang.Long> m22109(@Yue.InterfaceC4418 java.util.stream.LongStream r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            long[] r1 = r1.toArray()
            java.lang.String r0 = "toArray()"
            Yue.C3329.m13905(r1, r0)
            java.util.List r1 = Yue.C0586.m2115(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m22110(@Yue.InterfaceC4418 java.util.stream.Stream<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.lang.String r0 = "collect(Collectors.toList<T>())"
            Yue.C3329.m13905(r1, r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }
}
