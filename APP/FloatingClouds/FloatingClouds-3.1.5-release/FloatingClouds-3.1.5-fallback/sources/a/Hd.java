package a;

/* JADX INFO: loaded from: classes.dex */
public final class Hd implements androidx.savedstate.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.savedstate.a f115a;
    public boolean b;
    public android.os.Bundle c;
    public final a.Me d;

    public static final class a extends a.AbstractC0407u9 implements a.InterfaceC0369s7<a.Id> {
        public final /* synthetic */ a.Gg b;

        public a(a.Gg r1) {
                r0 = this;
                r0.b = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final a.Id a() {
                r1 = this;
                a.Gg r0 = r1.b
                a.Id r0 = androidx.lifecycle.n.c(r0)
                return r0
        }
    }

    public Hd(androidx.savedstate.a r2, a.Gg r3) {
            r1 = this;
            java.lang.String r0 = "savedStateRegistry"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            r1.f115a = r2
            a.Hd$a r2 = new a.Hd$a
            r2.<init>(r3)
            a.Me r3 = new a.Me
            r3.<init>(r2)
            r1.d = r3
            return
    }

    @Override // androidx.savedstate.a.b
    public final android.os.Bundle a() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r5.c
            if (r1 == 0) goto Lc
            r0.putAll(r1)
        Lc:
            a.Me r1 = r5.d
            java.lang.Object r1 = r1.a()
            a.Id r1 = (a.Id) r1
            java.util.LinkedHashMap r1 = r1.d
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.m r2 = (androidx.lifecycle.m) r2
            androidx.savedstate.a$b r2 = r2.e
            android.os.Bundle r2 = r2.a()
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            boolean r4 = a.C0193i9.a(r2, r4)
            if (r4 != 0) goto L1e
            r0.putBundle(r3, r2)
            goto L1e
        L48:
            r1 = 0
            r5.b = r1
            return r0
    }

    public final void b() {
            r3 = this;
            boolean r0 = r3.b
            if (r0 != 0) goto L2a
            androidx.savedstate.a r0 = r3.f115a
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r0 = r0.a(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r2 = r3.c
            if (r2 == 0) goto L18
            r1.putAll(r2)
        L18:
            if (r0 == 0) goto L1d
            r1.putAll(r0)
        L1d:
            r3.c = r1
            r0 = 1
            r3.b = r0
            a.Me r0 = r3.d
            java.lang.Object r0 = r0.a()
            a.Id r0 = (a.Id) r0
        L2a:
            return
    }
}
