package p000a;

import java.io.Serializable;

/* JADX INFO: renamed from: a.wd */
/* JADX INFO: loaded from: classes.dex */
public final class C0901wd<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f3502a;

    /* JADX INFO: renamed from: a.wd$a */
    public static final class a implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f3503a;

        public a(Throwable th) {
            C0631i9.m1482e(th, "exception");
            this.f3503a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return C0631i9.m1478a(this.f3503a, ((a) obj).f3503a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f3503a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f3503a + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m2189a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f3503a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0901wd) {
            return C0631i9.m1478a(this.f3502a, ((C0901wd) obj).f3502a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3502a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3502a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
