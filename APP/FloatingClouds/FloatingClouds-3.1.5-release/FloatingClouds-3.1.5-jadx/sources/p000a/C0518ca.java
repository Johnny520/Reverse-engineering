package p000a;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: a.ca */
/* JADX INFO: loaded from: classes.dex */
public final class C0518ca {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList<d> f1891a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a.ca$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a.ca$a$a, reason: collision with other inner class name */
        public static final class C1335a extends a {

            /* JADX INFO: renamed from: a */
            public final b f1892a;

            /* JADX INFO: renamed from: b */
            public final b f1893b;

            /* JADX INFO: renamed from: c */
            public final c f1894c;

            public C1335a(b bVar, b bVar2, c cVar) {
                C0631i9.m1482e(bVar2, "oldState");
                this.f1892a = bVar;
                this.f1893b = bVar2;
                this.f1894c = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1335a)) {
                    return false;
                }
                C1335a c1335a = (C1335a) obj;
                return this.f1892a == c1335a.f1892a && this.f1893b == c1335a.f1893b && this.f1894c == c1335a.f1894c;
            }

            public final int hashCode() {
                return this.f1894c.hashCode() + ((this.f1893b.hashCode() + (this.f1892a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "HideStateChanged(newState=" + this.f1892a + ", oldState=" + this.f1893b + ", source=" + this.f1894c + ")";
            }
        }

        /* JADX INFO: renamed from: a.ca$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final String f1895a;

            /* JADX INFO: renamed from: b */
            public final boolean f1896b;

            public b(String str, boolean z) {
                C0631i9.m1482e(str, "talker");
                this.f1895a = str;
                this.f1896b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C0631i9.m1478a(this.f1895a, bVar.f1895a) && this.f1896b == bVar.f1896b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f1896b) + (this.f1895a.hashCode() * 31);
            }

            public final String toString() {
                return "MsgInserted(talker=" + this.f1895a + ", isSend=" + this.f1896b + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.ca$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f1897a;

        /* JADX INFO: renamed from: b */
        public static final b f1898b;

        /* JADX INFO: renamed from: c */
        public static final b f1899c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ b[] f1900d;

        static {
            b bVar = new b("HIDDEN", 0);
            f1897a = bVar;
            b bVar2 = new b("UNHIDDEN_USER", 1);
            f1898b = bVar2;
            b bVar3 = new b("UNHIDDEN_COMMAND", 2);
            f1899c = bVar3;
            f1900d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1900d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.ca$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final c f1901a;

        /* JADX INFO: renamed from: b */
        public static final c f1902b;

        /* JADX INFO: renamed from: c */
        public static final c f1903c;

        /* JADX INFO: renamed from: d */
        public static final c f1904d;

        /* JADX INFO: renamed from: e */
        public static final c f1905e;

        /* JADX INFO: renamed from: f */
        public static final c f1906f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ c[] f1907g;

        static {
            c cVar = new c("MULTI_CLICK", 0);
            f1901a = cVar;
            c cVar2 = new c("LONG_PRESS", 1);
            f1902b = cVar2;
            c cVar3 = new c("SEARCH_COMMAND", 2);
            f1903c = cVar3;
            c cVar4 = new c("AUTO_REHIDE", 3);
            c cVar5 = new c("EXPLICIT_REHIDE", 4);
            f1904d = cVar5;
            c cVar6 = new c("BACK_KEY", 5);
            f1905e = cVar6;
            c cVar7 = new c("LEAVE_APP", 6);
            f1906f = cVar7;
            f1907g = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c("ENTER_CHAT", 7)};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f1907g.clone();
        }
    }

    /* JADX INFO: renamed from: a.ca$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo1281a(a aVar);
    }

    static {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static void m1279a(a aVar) {
        Iterator<d> it = f1891a.iterator();
        C0631i9.m1481d(it, "iterator(...)");
        while (it.hasNext()) {
            try {
                it.next().mo1281a(aVar);
            } catch (Throwable th) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{"MaskEventBus: subscriber error on " + aVar + ": " + th.getMessage()}, 1));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1280b(d dVar) {
        C0631i9.m1482e(dVar, "subscriber");
        CopyOnWriteArrayList<d> copyOnWriteArrayList = f1891a;
        if (copyOnWriteArrayList.contains(dVar)) {
            return;
        }
        copyOnWriteArrayList.add(dVar);
    }
}
