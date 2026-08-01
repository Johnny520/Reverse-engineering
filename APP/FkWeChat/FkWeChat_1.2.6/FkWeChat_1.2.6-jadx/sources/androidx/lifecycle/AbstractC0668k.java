package androidx.lifecycle;

import p024b9.AbstractC1043k;
import p215oc.C5729x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0668k {

    /* JADX INFO: renamed from: a */
    public C0650b f1965a = new C0650b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: q */
        public static final b f1968q = new b("DESTROYED", 0);

        /* JADX INFO: renamed from: r */
        public static final b f1969r = new b("INITIALIZED", 1);

        /* JADX INFO: renamed from: s */
        public static final b f1970s = new b("CREATED", 2);

        /* JADX INFO: renamed from: t */
        public static final b f1971t = new b("STARTED", 3);

        /* JADX INFO: renamed from: u */
        public static final b f1972u = new b("RESUMED", 4);

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ b[] f1973v;

        /* JADX INFO: renamed from: w */
        public static final /* synthetic */ InterfaceC7197a f1974w;

        static {
            b[] bVarArrM2635a = m2635a();
            f1973v = bVarArrM2635a;
            f1974w = AbstractC7198b.m28437a(bVarArrM2635a);
        }

        public b(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b[] m2635a() {
            return new b[]{f1968q, f1969r, f1970s, f1971t, f1972u};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1973v.clone();
        }

        /* JADX INFO: renamed from: c */
        public final boolean m2636c(b bVar) {
            bVar.getClass();
            return compareTo(bVar) >= 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2628a(InterfaceC0674n interfaceC0674n);

    /* JADX INFO: renamed from: b */
    public abstract b mo2629b();

    /* JADX INFO: renamed from: c */
    public abstract void mo2630c(InterfaceC0674n interfaceC0674n);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        private static final /* synthetic */ InterfaceC7197a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C10054a Companion;
        public static final a ON_CREATE = new a("ON_CREATE", 0);
        public static final a ON_START = new a("ON_START", 1);
        public static final a ON_RESUME = new a("ON_RESUME", 2);
        public static final a ON_PAUSE = new a("ON_PAUSE", 3);
        public static final a ON_STOP = new a("ON_STOP", 4);
        public static final a ON_DESTROY = new a("ON_DESTROY", 5);
        public static final a ON_ANY = new a("ON_ANY", 6);

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f1967a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f1967a = iArr;
            }
        }

        static {
            a[] aVarArrM2631a = m2631a();
            $VALUES = aVarArrM2631a;
            $ENTRIES = AbstractC7198b.m28437a(aVarArrM2631a);
            Companion = new C10054a(null);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m2631a() {
            return new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: c */
        public final b m2632c() {
            switch (b.f1967a[ordinal()]) {
                case 1:
                case 2:
                    return b.f1970s;
                case 3:
                case 4:
                    return b.f1971t;
                case 5:
                    return b.f1972u;
                case 6:
                    return b.f1968q;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    C5729x.m23182a();
                    return null;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10054a {

            /* JADX INFO: renamed from: androidx.lifecycle.k$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public /* synthetic */ class C10055a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f1966a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.f1970s.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.f1971t.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.f1972u.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.f1968q.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.f1969r.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f1966a = iArr;
                }
            }

            public /* synthetic */ C10054a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m2633a(b bVar) {
                bVar.getClass();
                int i10 = C10055a.f1966a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* JADX INFO: renamed from: b */
            public final a m2634b(b bVar) {
                bVar.getClass();
                int i10 = C10055a.f1966a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public C10054a() {
            }
        }
    }
}
