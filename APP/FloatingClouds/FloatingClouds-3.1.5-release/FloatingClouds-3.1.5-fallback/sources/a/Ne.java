package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Ne f187a = null;
    public static final java.util.List<a.Oe> b = null;

    public enum a extends java.lang.Enum<a.Ne.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.Ne.a f188a = null;
        public static final a.Ne.a b = null;
        public static final a.Ne.a c = null;
        public static final /* synthetic */ a.Ne.a[] d = null;

        static {
                a.Ne$a r0 = new a.Ne$a
                java.lang.String r1 = "YES"
                r2 = 0
                r0.<init>(r1, r2)
                a.Ne.a.f188a = r0
                a.Ne$a r1 = new a.Ne$a
                java.lang.String r2 = "NO"
                r3 = 1
                r1.<init>(r2, r3)
                a.Ne.a.b = r1
                a.Ne$a r2 = new a.Ne$a
                java.lang.String r3 = "ABSTAIN"
                r4 = 2
                r2.<init>(r3, r4)
                a.Ne.a.c = r2
                a.Ne$a[] r0 = new a.Ne.a[]{r0, r1, r2}
                a.Ne.a.d = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.Ne.a valueOf(java.lang.String r1) {
                java.lang.Class<a.Ne$a> r0 = a.Ne.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.Ne$a r1 = (a.Ne.a) r1
                return r1
        }

        public static a.Ne.a[] values() {
                a.Ne$a[] r0 = a.Ne.a.d
                java.lang.Object r0 = r0.clone()
                a.Ne$a[] r0 = (a.Ne.a[]) r0
                return r0
        }
    }

    static {
            a.Ne r0 = new a.Ne
            r0.<init>()
            a.Ne.f187a = r0
            a.Vc r0 = new a.Vc
            r0.<init>()
            a.y2 r1 = new a.y2
            r1.<init>()
            a.sf r2 = new a.sf
            r2.<init>()
            r3 = 3
            a.Oe[] r3 = new a.Oe[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.util.List r0 = a.C0294o3.d0(r3)
            a.Ne.b = r0
            return
    }
}
