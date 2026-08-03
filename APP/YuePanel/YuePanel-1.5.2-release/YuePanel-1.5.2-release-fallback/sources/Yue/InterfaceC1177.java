package Yue;

import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
public interface InterfaceC1177<T extends java.lang.Comparable<? super T>> extends Yue.InterfaceC1179<T> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۥ۟۠$ۥ, reason: contains not printable characters */
    public static final class C1178 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T extends java.lang.Comparable<? super T>> boolean m6130(@Yue.InterfaceC4418 Yue.InterfaceC1177<T> r1, @Yue.InterfaceC4418 T r2) {
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r2, r0)
                java.lang.Comparable r0 = r1.mo5769()
                boolean r0 = r1.mo6121(r0, r2)
                if (r0 == 0) goto L1b
                java.lang.Comparable r0 = r1.mo5771()
                boolean r1 = r1.mo6121(r2, r0)
                if (r1 == 0) goto L1b
                r1 = 1
                goto L1c
            L1b:
                r1 = 0
            L1c:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static <T extends java.lang.Comparable<? super T>> boolean m6131(@Yue.InterfaceC4418 Yue.InterfaceC1177<T> r2) {
                java.lang.Comparable r0 = r2.mo5769()
                java.lang.Comparable r1 = r2.mo5771()
                boolean r2 = r2.mo6121(r0, r1)
                r2 = r2 ^ 1
                return r2
        }
    }

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    boolean isEmpty();

    @Override // Yue.InterfaceC1179, Yue.InterfaceC4636
    /* JADX INFO: renamed from: ۥ */
    boolean mo5768(@Yue.InterfaceC4418 T r1);

    /* JADX INFO: renamed from: ۥ۟۟ */
    boolean mo6121(@Yue.InterfaceC4418 T r1, @Yue.InterfaceC4418 T r2);
}
