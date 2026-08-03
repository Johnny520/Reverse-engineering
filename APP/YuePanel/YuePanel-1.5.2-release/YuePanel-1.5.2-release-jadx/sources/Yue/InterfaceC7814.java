package Yue;

import Yue.InterfaceC4025;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4774.class})
@InterfaceC7470(version = "1.9")
public interface InterfaceC7814 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C1368 f3093 = C1368.f3094;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۧ$ۥ */
    public static final class C1368 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ C1368 f3094 = new C1368();
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۧ$ۥ۟ */
    public static final class C1369 implements InterfaceC7816 {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public static final C1369 f3095 = new C1369();

        /* JADX INFO: renamed from: Yue.ۥۣۢۡۧ$ۥ۟$ۥ, reason: contains not printable characters */
        @InterfaceC7470(version = "1.9")
        @InterfaceC8405(markerClass = {InterfaceC4774.class})
        @InterfaceC5570
        public static final class C7815 implements InterfaceC4025 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final long f23378;

            /* JADX DEBUG: Marked for inline */
            /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۣۢۡۧ.ۥ۟.ۥ.ۥ۟۟۟۠(long):Yue.ۥۣۢۡۧ$ۥ۟$ۥ] */
            public /* synthetic */ C7815(long j) {
                this.f23378 = j;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static final /* synthetic */ C7815 m24781(long j) {
                return new C7815(j);
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public static final int m24782(long j, long j2) {
                return C4555.m13394(m24791(j, j2), C4555.f9803.m13508());
            }

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public static int m24783(long j, @InterfaceC6399 InterfaceC4025 interfaceC4025) {
                C5499.m17103(interfaceC4025, "other");
                return m24781(j).compareTo(interfaceC4025);
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public static long m24784(long j) {
                return j;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public static long m24785(long j) {
                return C6267.f1955.m19294(j);
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public static boolean m24786(long j, Object obj) {
                return (obj instanceof C7815) && j == ((C7815) obj).m24798();
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public static final boolean m24787(long j, long j2) {
                return j == j2;
            }

            /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
            public static boolean m24788(long j) {
                return C4555.m13439(m24785(j));
            }

            /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
            public static boolean m24789(long j) {
                return !C4555.m13439(m24785(j));
            }

            /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
            public static int m24790(long j) {
                return Long.hashCode(j);
            }

            /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
            public static final long m24791(long j, long j2) {
                return C6267.f1955.m19293(j, j2);
            }

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static long m24792(long j, long j2) {
                return C6267.f1955.m2734(j, C4555.m13459(j2));
            }

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public static long m24793(long j, @InterfaceC6399 InterfaceC4025 interfaceC4025) {
                C5499.m17103(interfaceC4025, "other");
                if (interfaceC4025 instanceof C7815) {
                    return m24791(j, ((C7815) interfaceC4025).m24798());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m24795(j)) + " and " + interfaceC4025);
            }

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public static long m24794(long j, long j2) {
                return C6267.f1955.m2734(j, j2);
            }

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public static String m24795(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // Yue.InterfaceC4025
            public boolean equals(Object obj) {
                return m24786(this.f23378, obj);
            }

            @Override // Yue.InterfaceC4025
            public int hashCode() {
                return m24790(this.f23378);
            }

            public String toString() {
                return m24795(this.f23378);
            }

            @Override // Yue.InterfaceC7813
            /* JADX INFO: renamed from: ۥ */
            public boolean mo46() {
                return m24789(this.f23378);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // Yue.InterfaceC4025, Yue.InterfaceC7813
            /* JADX INFO: renamed from: ۥ۟ */
            public /* bridge */ /* synthetic */ InterfaceC4025 mo47(long j) {
                return m24781(m24796(j));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // Yue.InterfaceC4025, Yue.InterfaceC7813
            /* JADX INFO: renamed from: ۥ۟۟ */
            public /* bridge */ /* synthetic */ InterfaceC4025 mo5783(long j) {
                return m24781(m24797(j));
            }

            @Override // Yue.InterfaceC7813
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public long mo5784() {
                return m24785(this.f23378);
            }

            @Override // Yue.InterfaceC7813
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public boolean mo5785() {
                return m24788(this.f23378);
            }

            @Override // Yue.InterfaceC4025
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
            public long mo5786(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
                C5499.m17103(interfaceC4025, "other");
                return m24793(this.f23378, interfaceC4025);
            }

            /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: merged with bridge method [inline-methods] */
            public int compareTo(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
                return InterfaceC4025.C0310.m985(this, interfaceC4025);
            }

            /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
            public long m24796(long j) {
                return m24792(this.f23378, j);
            }

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public long m24797(long j) {
                return m24794(this.f23378, j);
            }

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public final /* synthetic */ long m24798() {
                return this.f23378;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // Yue.InterfaceC7813
            /* JADX INFO: renamed from: ۥ۟ */
            public /* bridge */ /* synthetic */ InterfaceC7813 mo47(long j) {
                return m24781(m24796(j));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // Yue.InterfaceC7813
            /* JADX INFO: renamed from: ۥ۟۟ */
            public /* bridge */ /* synthetic */ InterfaceC7813 mo5783(long j) {
                return m24781(m24797(j));
            }
        }

        @InterfaceC6399
        public String toString() {
            return C6267.f1955.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // Yue.InterfaceC7814.InterfaceC7816, Yue.InterfaceC7814
        /* JADX INFO: renamed from: ۥ */
        public /* bridge */ /* synthetic */ InterfaceC4025 mo44() {
            return C7815.m24781(m3911());
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public long m3911() {
            return C6267.f1955.m19295();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // Yue.InterfaceC7814
        /* JADX INFO: renamed from: ۥ */
        public /* bridge */ /* synthetic */ InterfaceC7813 mo44() {
            return C7815.m24781(m3911());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۧ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC8405(markerClass = {InterfaceC4774.class})
    @InterfaceC7470(version = "1.9")
    public interface InterfaceC7816 extends InterfaceC7814 {
        @Override // Yue.InterfaceC7814
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        InterfaceC4025 mo44();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    InterfaceC7813 mo44();
}
