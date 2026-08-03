package Yue;

import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4772.class})
@InterfaceC7470(version = "1.9")
public interface InterfaceC6571<T extends Comparable<? super T>> {

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۥ$ۥ */
    public static final class C1014 {
        /* JADX INFO: renamed from: ۥ */
        public static <T extends Comparable<? super T>> boolean m3029(@InterfaceC6399 InterfaceC6571<T> interfaceC6571, @InterfaceC6399 T t) {
            C5499.m17103(t, "value");
            return t.compareTo(interfaceC6571.mo830()) >= 0 && t.compareTo(interfaceC6571.mo10383()) < 0;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static <T extends Comparable<? super T>> boolean m3030(@InterfaceC6399 InterfaceC6571<T> interfaceC6571) {
            return interfaceC6571.mo830().compareTo(interfaceC6571.mo10383()) >= 0;
        }
    }

    boolean isEmpty();

    /* JADX INFO: renamed from: ۥ */
    boolean mo829(@InterfaceC6399 T t);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    T mo830();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    T mo10383();
}
