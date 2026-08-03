package Yue;

import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public interface InterfaceC3853<T extends Comparable<? super T>> extends InterfaceC3854<T> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۥ۟۠$ۥ */
    public static final class C0273 {
        /* JADX INFO: renamed from: ۥ */
        public static <T extends Comparable<? super T>> boolean m906(@InterfaceC6399 InterfaceC3853<T> interfaceC3853, @InterfaceC6399 T t) {
            C5499.m17103(t, "value");
            return interfaceC3853.mo10659(interfaceC3853.mo830(), t) && interfaceC3853.mo10659(t, interfaceC3853.mo10384());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static <T extends Comparable<? super T>> boolean m907(@InterfaceC6399 InterfaceC3853<T> interfaceC3853) {
            return !interfaceC3853.mo10659(interfaceC3853.mo830(), interfaceC3853.mo10384());
        }
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    boolean isEmpty();

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    boolean mo829(@InterfaceC6399 T t);

    /* JADX INFO: renamed from: ۥ۟۟ */
    boolean mo10659(@InterfaceC6399 T t, @InterfaceC6399 T t2);
}
