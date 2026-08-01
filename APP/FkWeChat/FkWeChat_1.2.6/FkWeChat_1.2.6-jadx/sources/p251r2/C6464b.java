package p251r2;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p024b9.AbstractC1061t;
import p350y1.C9516d;

/* JADX INFO: renamed from: r2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6464b {

    /* JADX INFO: renamed from: a */
    public final HashMap f20339a = new HashMap();

    /* JADX INFO: renamed from: r2.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C9516d f20340a;

        /* JADX INFO: renamed from: b */
        public final int f20341b;

        public a(C9516d c9516d, int i10) {
            this.f20340a = c9516d;
            this.f20341b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final int m25635a() {
            return this.f20341b;
        }

        /* JADX INFO: renamed from: b */
        public final C9516d m25636b() {
            return this.f20340a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f20340a, aVar.f20340a) && this.f20341b == aVar.f20341b;
        }

        public int hashCode() {
            return (this.f20340a.hashCode() * 31) + Integer.hashCode(this.f20341b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f20340a + ", configFlags=" + this.f20341b + ')';
        }
    }

    /* JADX INFO: renamed from: r2.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Resources.Theme f20342a;

        /* JADX INFO: renamed from: b */
        public final int f20343b;

        public b(Resources.Theme theme, int i10) {
            this.f20342a = theme;
            this.f20343b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(this.f20342a, bVar.f20342a) && this.f20343b == bVar.f20343b;
        }

        public int hashCode() {
            return (this.f20342a.hashCode() * 31) + Integer.hashCode(this.f20343b);
        }

        public String toString() {
            return "Key(theme=" + this.f20342a + ", id=" + this.f20343b + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25631a() {
        this.f20339a.clear();
    }

    /* JADX INFO: renamed from: b */
    public final a m25632b(b bVar) {
        WeakReference weakReference = (WeakReference) this.f20339a.get(bVar);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m25633c(int i10) {
        Iterator it = this.f20339a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.m25635a())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25634d(b bVar, a aVar) {
        this.f20339a.put(bVar, new WeakReference(aVar));
    }
}
