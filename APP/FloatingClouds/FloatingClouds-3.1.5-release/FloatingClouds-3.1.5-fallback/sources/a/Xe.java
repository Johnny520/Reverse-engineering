package a;

/* JADX INFO: loaded from: classes.dex */
public final class Xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Xe.c f341a = null;
    public static final a.Xe.c b = null;
    public static final a.Xe.c c = null;
    public static final a.Xe.c d = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.Xe.a f342a = null;

        static {
                a.Xe$a r0 = new a.Xe$a
                r0.<init>()
                a.Xe.a.f342a = r0
                return
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.Xe.a f343a;

        public b(a.Xe.a r1) {
                r0 = this;
                r0.<init>()
                r0.f343a = r1
                return
        }

        public abstract boolean a();

        public final boolean b(java.lang.CharSequence r7, int r8) {
                r6 = this;
                r0 = 1
                if (r7 == 0) goto L42
                if (r8 < 0) goto L42
                int r1 = r7.length()
                int r1 = r1 - r8
                if (r1 < 0) goto L42
                a.Xe$a r1 = r6.f343a
                if (r1 != 0) goto L15
                boolean r7 = r6.a()
                return r7
            L15:
                r1 = 0
                r2 = 2
                r3 = r1
                r4 = r2
            L19:
                if (r3 >= r8) goto L37
                if (r4 != r2) goto L37
                char r4 = r7.charAt(r3)
                byte r4 = java.lang.Character.getDirectionality(r4)
                a.Xe$c r5 = a.Xe.f341a
                if (r4 == 0) goto L34
                if (r4 == r0) goto L32
                if (r4 == r2) goto L32
                switch(r4) {
                    case 14: goto L34;
                    case 15: goto L34;
                    case 16: goto L32;
                    case 17: goto L32;
                    default: goto L30;
                }
            L30:
                r4 = r2
                goto L35
            L32:
                r4 = r1
                goto L35
            L34:
                r4 = r0
            L35:
                int r3 = r3 + r0
                goto L19
            L37:
                if (r4 == 0) goto L41
                if (r4 == r0) goto L40
                boolean r7 = r6.a()
                return r7
            L40:
                return r1
            L41:
                return r0
            L42:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>()
                throw r7
        }
    }

    public static class c extends a.Xe.b {
        public final boolean b;

        public c(a.Xe.a r1, boolean r2) {
                r0 = this;
                r0.<init>(r1)
                r0.b = r2
                return
        }

        @Override // a.Xe.b
        public final boolean a() {
                r1 = this;
                boolean r0 = r1.b
                return r0
        }
    }

    static {
            a.Xe$c r0 = new a.Xe$c
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            a.Xe.f341a = r0
            a.Xe$c r0 = new a.Xe$c
            r3 = 1
            r0.<init>(r1, r3)
            a.Xe.b = r0
            a.Xe$c r0 = new a.Xe$c
            a.Xe$a r1 = a.Xe.a.f342a
            r0.<init>(r1, r2)
            a.Xe.c = r0
            a.Xe$c r0 = new a.Xe$c
            r0.<init>(r1, r3)
            a.Xe.d = r0
            return
    }
}
