package Yue;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "StreamsKt")
public final class C7606 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    public static final class C1305<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Stream f2964;

        public C1305(Stream stream) {
            this.f2964 = stream;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            Iterator<T> it = this.f2964.iterator();
            C5499.m17102(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ۟ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    public static final class C1306 implements InterfaceC7326<Integer> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ IntStream f2965;

        public C1306(IntStream intStream) {
            this.f2965 = intStream;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f2965.iterator();
            C5499.m17102(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    public static final class C7607 implements InterfaceC7326<Long> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ LongStream f2966;

        public C7607(LongStream longStream) {
            this.f2966 = longStream;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f2966.iterator();
            C5499.m17102(it, "iterator()");
            return it;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠ۨ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    public static final class C7608 implements InterfaceC7326<Double> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ DoubleStream f2967;

        public C7608(DoubleStream doubleStream) {
            this.f2967 = doubleStream;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f2967.iterator();
            C5499.m17102(it, "iterator()");
            return it;
        }
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC7326<Double> m3762(@InterfaceC6399 DoubleStream doubleStream) {
        C5499.m17103(doubleStream, "<this>");
        return new C7608(doubleStream);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC7326<Integer> m23802(@InterfaceC6399 IntStream intStream) {
        C5499.m17103(intStream, "<this>");
        return new C1306(intStream);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7326<Long> m23803(@InterfaceC6399 LongStream longStream) {
        C5499.m17103(longStream, "<this>");
        return new C7607(longStream);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23804(@InterfaceC6399 Stream<T> stream) {
        C5499.m17103(stream, "<this>");
        return new C1305(stream);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Stream<T> m23805(@InterfaceC6399 final InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: Yue.ۥۢ۠۠ۧ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C7606.m23806(interfaceC7326);
            }
        }, 16, false);
        C5499.m17102(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Spliterator m23806(InterfaceC7326 interfaceC7326) {
        C5499.m17103(interfaceC7326, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(interfaceC7326.iterator(), 16);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final List<Double> m23807(@InterfaceC6399 DoubleStream doubleStream) {
        C5499.m17103(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        C5499.m17102(array, "toArray()");
        return C3404.m7065(array);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final List<Integer> m23808(@InterfaceC6399 IntStream intStream) {
        C5499.m17103(intStream, "<this>");
        int[] array = intStream.toArray();
        C5499.m17102(array, "toArray()");
        return C3404.m7067(array);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final List<Long> m23809(@InterfaceC6399 LongStream longStream) {
        C5499.m17103(longStream, "<this>");
        long[] array = longStream.toArray();
        C5499.m17102(array, "toArray()");
        return C3404.m7068(array);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> List<T> m23810(@InterfaceC6399 Stream<T> stream) {
        C5499.m17103(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        C5499.m17102(objCollect, "collect(Collectors.toList<T>())");
        return (List) objCollect;
    }
}
