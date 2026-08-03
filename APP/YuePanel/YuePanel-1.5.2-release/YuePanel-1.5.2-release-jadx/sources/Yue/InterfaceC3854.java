package Yue;

import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3854<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۥ۟ۡ$ۥ */
    public static final class C0274 {
        /* JADX INFO: renamed from: ۥ */
        public static <T extends Comparable<? super T>> boolean m908(@InterfaceC6399 InterfaceC3854<T> interfaceC3854, @InterfaceC6399 T t) {
            C5499.m17103(t, "value");
            return t.compareTo(interfaceC3854.mo830()) >= 0 && t.compareTo(interfaceC3854.mo10384()) <= 0;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static <T extends Comparable<? super T>> boolean m909(@InterfaceC6399 InterfaceC3854<T> interfaceC3854) {
            return interfaceC3854.mo830().compareTo(interfaceC3854.mo10384()) > 0;
        }
    }

    boolean isEmpty();

    /* JADX INFO: renamed from: ۥ */
    boolean mo829(@InterfaceC6399 T t);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    T mo830();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    T mo10384();
}
