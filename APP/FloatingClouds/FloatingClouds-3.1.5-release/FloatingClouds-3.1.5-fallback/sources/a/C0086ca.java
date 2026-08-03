package a;

/* JADX INFO: renamed from: a.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0086ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList<a.C0086ca.d> f421a = null;

    /* JADX INFO: renamed from: a.ca$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a.ca$a$a, reason: collision with other inner class name */
        public static final class C0002a extends a.C0086ca.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C0086ca.b f422a;
            public final a.C0086ca.b b;
            public final a.C0086ca.c c;

            public C0002a(a.C0086ca.b r2, a.C0086ca.b r3, a.C0086ca.c r4) {
                    r1 = this;
                    java.lang.String r0 = "oldState"
                    a.C0193i9.e(r3, r0)
                    r1.<init>()
                    r1.f422a = r2
                    r1.b = r3
                    r1.c = r4
                    return
            }

            public final boolean equals(java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof a.C0086ca.a.C0002a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    a.ca$a$a r5 = (a.C0086ca.a.C0002a) r5
                    a.ca$b r1 = r5.f422a
                    a.ca$b r3 = r4.f422a
                    if (r3 == r1) goto L13
                    return r2
                L13:
                    a.ca$b r1 = r4.b
                    a.ca$b r3 = r5.b
                    if (r1 == r3) goto L1a
                    return r2
                L1a:
                    a.ca$c r1 = r4.c
                    a.ca$c r5 = r5.c
                    if (r1 == r5) goto L21
                    return r2
                L21:
                    return r0
            }

            public final int hashCode() {
                    r2 = this;
                    a.ca$b r0 = r2.f422a
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    a.ca$b r1 = r2.b
                    int r1 = r1.hashCode()
                    int r1 = r1 + r0
                    int r1 = r1 * 31
                    a.ca$c r0 = r2.c
                    int r0 = r0.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            public final java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "HideStateChanged(newState="
                    r0.<init>(r1)
                    a.ca$b r1 = r2.f422a
                    r0.append(r1)
                    java.lang.String r1 = ", oldState="
                    r0.append(r1)
                    a.ca$b r1 = r2.b
                    r0.append(r1)
                    java.lang.String r1 = ", source="
                    r0.append(r1)
                    a.ca$c r1 = r2.c
                    r0.append(r1)
                    java.lang.String r1 = ")"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        /* JADX INFO: renamed from: a.ca$a$b */
        public static final class b extends a.C0086ca.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final java.lang.String f423a;
            public final boolean b;

            public b(java.lang.String r2, boolean r3) {
                    r1 = this;
                    java.lang.String r0 = "talker"
                    a.C0193i9.e(r2, r0)
                    r1.<init>()
                    r1.f423a = r2
                    r1.b = r3
                    return
            }

            public final boolean equals(java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof a.C0086ca.a.b
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    a.ca$a$b r5 = (a.C0086ca.a.b) r5
                    java.lang.String r1 = r5.f423a
                    java.lang.String r3 = r4.f423a
                    boolean r1 = a.C0193i9.a(r3, r1)
                    if (r1 != 0) goto L17
                    return r2
                L17:
                    boolean r1 = r4.b
                    boolean r5 = r5.b
                    if (r1 == r5) goto L1e
                    return r2
                L1e:
                    return r0
            }

            public final int hashCode() {
                    r2 = this;
                    java.lang.String r0 = r2.f423a
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    boolean r1 = r2.b
                    int r1 = java.lang.Boolean.hashCode(r1)
                    int r1 = r1 + r0
                    return r1
            }

            public final java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "MsgInserted(talker="
                    r0.<init>(r1)
                    java.lang.String r1 = r2.f423a
                    r0.append(r1)
                    java.lang.String r1 = ", isSend="
                    r0.append(r1)
                    boolean r1 = r2.b
                    r0.append(r1)
                    java.lang.String r1 = ")"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: a.ca$b */
    public enum b extends java.lang.Enum<a.C0086ca.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.C0086ca.b f424a = null;
        public static final a.C0086ca.b b = null;
        public static final a.C0086ca.b c = null;
        public static final /* synthetic */ a.C0086ca.b[] d = null;

        static {
                a.ca$b r0 = new a.ca$b
                java.lang.String r1 = "HIDDEN"
                r2 = 0
                r0.<init>(r1, r2)
                a.C0086ca.b.f424a = r0
                a.ca$b r1 = new a.ca$b
                java.lang.String r2 = "UNHIDDEN_USER"
                r3 = 1
                r1.<init>(r2, r3)
                a.C0086ca.b.b = r1
                a.ca$b r2 = new a.ca$b
                java.lang.String r3 = "UNHIDDEN_COMMAND"
                r4 = 2
                r2.<init>(r3, r4)
                a.C0086ca.b.c = r2
                a.ca$b[] r0 = new a.C0086ca.b[]{r0, r1, r2}
                a.C0086ca.b.d = r0
                return
        }

        b() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.C0086ca.b valueOf(java.lang.String r1) {
                java.lang.Class<a.ca$b> r0 = a.C0086ca.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.ca$b r1 = (a.C0086ca.b) r1
                return r1
        }

        public static a.C0086ca.b[] values() {
                a.ca$b[] r0 = a.C0086ca.b.d
                java.lang.Object r0 = r0.clone()
                a.ca$b[] r0 = (a.C0086ca.b[]) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: a.ca$c */
    public enum c extends java.lang.Enum<a.C0086ca.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.C0086ca.c f425a = null;
        public static final a.C0086ca.c b = null;
        public static final a.C0086ca.c c = null;
        public static final a.C0086ca.c d = null;
        public static final a.C0086ca.c e = null;
        public static final a.C0086ca.c f = null;
        public static final /* synthetic */ a.C0086ca.c[] g = null;

        static {
                a.ca$c r0 = new a.ca$c
                java.lang.String r1 = "MULTI_CLICK"
                r2 = 0
                r0.<init>(r1, r2)
                a.C0086ca.c.f425a = r0
                a.ca$c r1 = new a.ca$c
                java.lang.String r2 = "LONG_PRESS"
                r3 = 1
                r1.<init>(r2, r3)
                a.C0086ca.c.b = r1
                a.ca$c r2 = new a.ca$c
                java.lang.String r3 = "SEARCH_COMMAND"
                r4 = 2
                r2.<init>(r3, r4)
                a.C0086ca.c.c = r2
                a.ca$c r3 = new a.ca$c
                java.lang.String r4 = "AUTO_REHIDE"
                r5 = 3
                r3.<init>(r4, r5)
                a.ca$c r4 = new a.ca$c
                java.lang.String r5 = "EXPLICIT_REHIDE"
                r6 = 4
                r4.<init>(r5, r6)
                a.C0086ca.c.d = r4
                a.ca$c r5 = new a.ca$c
                java.lang.String r6 = "BACK_KEY"
                r7 = 5
                r5.<init>(r6, r7)
                a.C0086ca.c.e = r5
                a.ca$c r6 = new a.ca$c
                java.lang.String r7 = "LEAVE_APP"
                r8 = 6
                r6.<init>(r7, r8)
                a.C0086ca.c.f = r6
                a.ca$c r7 = new a.ca$c
                java.lang.String r8 = "ENTER_CHAT"
                r9 = 7
                r7.<init>(r8, r9)
                a.ca$c[] r0 = new a.C0086ca.c[]{r0, r1, r2, r3, r4, r5, r6, r7}
                a.C0086ca.c.g = r0
                return
        }

        c() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static a.C0086ca.c valueOf(java.lang.String r1) {
                java.lang.Class<a.ca$c> r0 = a.C0086ca.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                a.ca$c r1 = (a.C0086ca.c) r1
                return r1
        }

        public static a.C0086ca.c[] values() {
                a.ca$c[] r0 = a.C0086ca.c.g
                java.lang.Object r0 = r0.clone()
                a.ca$c[] r0 = (a.C0086ca.c[]) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: a.ca$d */
    public interface d {
        void a(a.C0086ca.a r1);
    }

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            a.C0086ca.f421a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            return
    }

    public static void a(a.C0086ca.a r4) {
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r0 = a.C0086ca.f421a
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            a.C0193i9.d(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            a.ca$d r1 = (a.C0086ca.d) r1
            r1.a(r4)     // Catch: java.lang.Throwable -> L1b
            goto Lb
        L1b:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MaskEventBus: subscriber error on "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.a(r1)
            goto Lb
        L43:
            return
    }

    public static void b(a.C0086ca.d r2) {
            java.lang.String r0 = "subscriber"
            a.C0193i9.e(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r0 = a.C0086ca.f421a
            boolean r1 = r0.contains(r2)
            if (r1 != 0) goto L10
            r0.add(r2)
        L10:
            return
    }
}
