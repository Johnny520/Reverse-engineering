package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public enum a extends java.lang.Enum<androidx.lifecycle.e.a> {
        private static final /* synthetic */ androidx.lifecycle.e.a[] $VALUES = null;
        public static final androidx.lifecycle.e.a.C0020a Companion = null;
        public static final androidx.lifecycle.e.a ON_ANY = null;
        public static final androidx.lifecycle.e.a ON_CREATE = null;
        public static final androidx.lifecycle.e.a ON_DESTROY = null;
        public static final androidx.lifecycle.e.a ON_PAUSE = null;
        public static final androidx.lifecycle.e.a ON_RESUME = null;
        public static final androidx.lifecycle.e.a ON_START = null;
        public static final androidx.lifecycle.e.a ON_STOP = null;

        /* JADX INFO: renamed from: androidx.lifecycle.e$a$a, reason: collision with other inner class name */
        public static final class C0020a {
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    androidx.lifecycle.e$a[] r0 = androidx.lifecycle.e.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_START     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L2b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                L2b:
                    androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L34
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
                L34:
                    androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L3d
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                    r2 = 6
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                L3d:
                    androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L46
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                    r2 = 7
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
                L46:
                    androidx.lifecycle.e.a.b.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        static {
                androidx.lifecycle.e$a r0 = new androidx.lifecycle.e$a
                java.lang.String r1 = "ON_CREATE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.e.a.ON_CREATE = r0
                androidx.lifecycle.e$a r1 = new androidx.lifecycle.e$a
                java.lang.String r2 = "ON_START"
                r3 = 1
                r1.<init>(r2, r3)
                androidx.lifecycle.e.a.ON_START = r1
                androidx.lifecycle.e$a r2 = new androidx.lifecycle.e$a
                java.lang.String r3 = "ON_RESUME"
                r4 = 2
                r2.<init>(r3, r4)
                androidx.lifecycle.e.a.ON_RESUME = r2
                androidx.lifecycle.e$a r3 = new androidx.lifecycle.e$a
                java.lang.String r4 = "ON_PAUSE"
                r5 = 3
                r3.<init>(r4, r5)
                androidx.lifecycle.e.a.ON_PAUSE = r3
                androidx.lifecycle.e$a r4 = new androidx.lifecycle.e$a
                java.lang.String r5 = "ON_STOP"
                r6 = 4
                r4.<init>(r5, r6)
                androidx.lifecycle.e.a.ON_STOP = r4
                androidx.lifecycle.e$a r5 = new androidx.lifecycle.e$a
                java.lang.String r6 = "ON_DESTROY"
                r7 = 5
                r5.<init>(r6, r7)
                androidx.lifecycle.e.a.ON_DESTROY = r5
                androidx.lifecycle.e$a r6 = new androidx.lifecycle.e$a
                java.lang.String r7 = "ON_ANY"
                r8 = 6
                r6.<init>(r7, r8)
                androidx.lifecycle.e.a.ON_ANY = r6
                androidx.lifecycle.e$a[] r0 = new androidx.lifecycle.e.a[]{r0, r1, r2, r3, r4, r5, r6}
                androidx.lifecycle.e.a.$VALUES = r0
                androidx.lifecycle.e$a$a r0 = new androidx.lifecycle.e$a$a
                r0.<init>()
                androidx.lifecycle.e.a.Companion = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static androidx.lifecycle.e.a valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.e$a> r0 = androidx.lifecycle.e.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.e$a r1 = (androidx.lifecycle.e.a) r1
                return r1
        }

        public static androidx.lifecycle.e.a[] values() {
                androidx.lifecycle.e$a[] r0 = androidx.lifecycle.e.a.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.e$a[] r0 = (androidx.lifecycle.e.a[]) r0
                return r0
        }

        public final androidx.lifecycle.e.b a() {
                r3 = this;
                int[] r0 = androidx.lifecycle.e.a.b.$EnumSwitchMapping$0
                int r1 = r3.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L2b;
                    case 2: goto L2b;
                    case 3: goto L28;
                    case 4: goto L28;
                    case 5: goto L25;
                    case 6: goto L22;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r2 = " has no target state"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L22:
                androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.f932a
                return r0
            L25:
                androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.e
                return r0
            L28:
                androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.d
                return r0
            L2b:
                androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.c
                return r0
        }
    }

    public enum b extends java.lang.Enum<androidx.lifecycle.e.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.lifecycle.e.b f932a = null;
        public static final androidx.lifecycle.e.b b = null;
        public static final androidx.lifecycle.e.b c = null;
        public static final androidx.lifecycle.e.b d = null;
        public static final androidx.lifecycle.e.b e = null;
        public static final /* synthetic */ androidx.lifecycle.e.b[] f = null;

        static {
                androidx.lifecycle.e$b r0 = new androidx.lifecycle.e$b
                java.lang.String r1 = "DESTROYED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.e.b.f932a = r0
                androidx.lifecycle.e$b r1 = new androidx.lifecycle.e$b
                java.lang.String r2 = "INITIALIZED"
                r3 = 1
                r1.<init>(r2, r3)
                androidx.lifecycle.e.b.b = r1
                androidx.lifecycle.e$b r2 = new androidx.lifecycle.e$b
                java.lang.String r3 = "CREATED"
                r4 = 2
                r2.<init>(r3, r4)
                androidx.lifecycle.e.b.c = r2
                androidx.lifecycle.e$b r3 = new androidx.lifecycle.e$b
                java.lang.String r4 = "STARTED"
                r5 = 3
                r3.<init>(r4, r5)
                androidx.lifecycle.e.b.d = r3
                androidx.lifecycle.e$b r4 = new androidx.lifecycle.e$b
                java.lang.String r5 = "RESUMED"
                r6 = 4
                r4.<init>(r5, r6)
                androidx.lifecycle.e.b.e = r4
                androidx.lifecycle.e$b[] r0 = new androidx.lifecycle.e.b[]{r0, r1, r2, r3, r4}
                androidx.lifecycle.e.b.f = r0
                return
        }

        b() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static androidx.lifecycle.e.b valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.e$b> r0 = androidx.lifecycle.e.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.e$b r1 = (androidx.lifecycle.e.b) r1
                return r1
        }

        public static androidx.lifecycle.e.b[] values() {
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.e.b.f
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.e$b[] r0 = (androidx.lifecycle.e.b[]) r0
                return r0
        }
    }

    public abstract void a(a.InterfaceC0461x9 r1);

    public abstract androidx.lifecycle.e.b b();

    public abstract void c(a.InterfaceC0461x9 r1);
}
