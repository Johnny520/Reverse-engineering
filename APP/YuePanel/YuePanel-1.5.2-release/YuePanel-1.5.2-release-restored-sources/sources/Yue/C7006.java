package Yue;

import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7006 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m3313(boolean z, @InterfaceC6399 Number number) {
        C5499.m17103(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::LYue/ۥ۟ۥ۟ۡ<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m3314(InterfaceC3854 interfaceC3854, Object obj) {
        C5499.m17103(interfaceC3854, "<this>");
        return obj != null && interfaceC3854.mo829((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::LYue/ۥۣۣۡۥ<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m21643(InterfaceC6571 interfaceC6571, Object obj) {
        C5499.m17103(interfaceC6571, "<this>");
        return obj != null && interfaceC6571.mo829((Comparable) obj);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC3853<Double> m21644(double d, double d2) {
        return new C3851(d, d2);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC3853<Float> m21645(float f, float f2) {
        return new C3852(f, f2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> InterfaceC3854<T> m21646(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, "<this>");
        C5499.m17103(t2, "that");
        return new C4024(t, t2);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC6571<Double> m21647(double d, double d2) {
        return new C6569(d, d2);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final InterfaceC6571<Float> m21648(float f, float f2) {
        return new C6570(f, f2);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> InterfaceC6571<T> m21649(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, "<this>");
        C5499.m17103(t2, "that");
        return new C4023(t, t2);
    }
}
