package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4556
public interface InterfaceC0258<E> extends Yue.InterfaceC1662, Yue.InterfaceC5242<E> {

    /* JADX INFO: renamed from: Yue.ۥ۟۠۟$ۥ, reason: contains not printable characters */
    public static final class C0259 {
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m1207(Yue.InterfaceC0258 r0) {
                Yue.InterfaceC5242.C5243.m19800(r0)
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static <E> Yue.InterfaceC5562<E> m1208(@Yue.InterfaceC4418 Yue.InterfaceC0258<E> r0) {
                Yue.ۥۡۧۨۧ r0 = Yue.InterfaceC5242.C5243.m19803(r0)
                return r0
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @Yue.InterfaceC5313(expression = "tryReceive().getOrNull()", imports = {}))
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E> E m1209(@Yue.InterfaceC4418 Yue.InterfaceC0258<E> r0) {
                java.lang.Object r0 = Yue.InterfaceC5242.C5243.m19807(r0)
                return r0
        }

        @Yue.InterfaceC3834
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @Yue.InterfaceC5313(expression = "receiveCatching().getOrNull()", imports = {}))
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <E> java.lang.Object m1210(@Yue.InterfaceC4418 Yue.InterfaceC0258<E> r0, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r1) {
                java.lang.Object r0 = Yue.InterfaceC5242.C5243.m19808(r0, r1)
                return r0
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    Yue.InterfaceC0996<E> m1206();
}
