package Yue;

import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1179<T extends java.lang.Comparable<? super T>> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۥ۟ۡ$ۥ, reason: contains not printable characters */
    public static final class C1180 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T extends java.lang.Comparable<? super T>> boolean m6132(@Yue.InterfaceC4418 Yue.InterfaceC1179<T> r1, @Yue.InterfaceC4418 T r2) {
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r2, r0)
                java.lang.Comparable r0 = r1.mo5769()
                int r0 = r2.compareTo(r0)
                if (r0 < 0) goto L1b
                java.lang.Comparable r1 = r1.mo5771()
                int r1 = r2.compareTo(r1)
                if (r1 > 0) goto L1b
                r1 = 1
                goto L1c
            L1b:
                r1 = 0
            L1c:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static <T extends java.lang.Comparable<? super T>> boolean m6133(@Yue.InterfaceC4418 Yue.InterfaceC1179<T> r1) {
                java.lang.Comparable r0 = r1.mo5769()
                java.lang.Comparable r1 = r1.mo5771()
                int r1 = r0.compareTo(r1)
                if (r1 <= 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                return r1
        }
    }

    boolean isEmpty();

    /* JADX INFO: renamed from: ۥ */
    boolean mo5768(@Yue.InterfaceC4418 T r1);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    T mo5769();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    T mo5771();
}
