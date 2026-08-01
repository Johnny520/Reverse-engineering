package p228p8;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.C1046l0;
import p172l8.C4700i0;
import p228p8.InterfaceC5980j;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p8.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5975e implements InterfaceC5980j, Serializable {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5980j f18911q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j.b f18912r;

    public C5975e(InterfaceC5980j interfaceC5980j, InterfaceC5980j.b bVar) {
        interfaceC5980j.getClass();
        bVar.getClass();
        this.f18911q = interfaceC5980j;
        this.f18912r = bVar;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m23971a(InterfaceC5980j[] interfaceC5980jArr, C1046l0 c1046l0, C4700i0 c4700i0, InterfaceC5980j.b bVar) {
        c4700i0.getClass();
        bVar.getClass();
        int i10 = c1046l0.f3205q;
        c1046l0.f3205q = i10 + 1;
        interfaceC5980jArr[i10] = bVar;
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static String m23972b(String str, InterfaceC5980j.b bVar) {
        str.getClass();
        bVar.getClass();
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    /* JADX INFO: renamed from: g */
    private final int m23973g() {
        int i10 = 2;
        C5975e c5975e = this;
        while (true) {
            InterfaceC5980j interfaceC5980j = c5975e.f18911q;
            c5975e = interfaceC5980j instanceof C5975e ? (C5975e) interfaceC5980j : null;
            if (c5975e == null) {
                return i10;
            }
            i10++;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iM23973g = m23973g();
        final InterfaceC5980j[] interfaceC5980jArr = new InterfaceC5980j[iM23973g];
        final C1046l0 c1046l0 = new C1046l0();
        mo1655q(C4700i0.f13910a, new InterfaceC0188p() { // from class: p8.c
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return C5975e.m23971a(interfaceC5980jArr, c1046l0, (C4700i0) obj, (InterfaceC5980j.b) obj2);
            }
        });
        if (c1046l0.f3205q == iM23973g) {
            return new a(interfaceC5980jArr);
        }
        C10010p0.m38820a("Check failed.");
        return null;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        cVar.getClass();
        InterfaceC5980j.b bVarMo1654h = this.f18912r.mo1654h(cVar);
        InterfaceC5980j interfaceC5980j = this.f18911q;
        if (bVarMo1654h != null) {
            return interfaceC5980j;
        }
        InterfaceC5980j interfaceC5980jMo1649L = interfaceC5980j.mo1649L(cVar);
        if (interfaceC5980jMo1649L == this.f18911q) {
            return this;
        }
        C5981k c5981k = C5981k.f18917q;
        InterfaceC5980j.b bVar = this.f18912r;
        return interfaceC5980jMo1649L == c5981k ? bVar : new C5975e(interfaceC5980jMo1649L, bVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC5980j.a.m23984b(this, interfaceC5980j);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m23974d(InterfaceC5980j.b bVar) {
        return AbstractC1061t.m3842c(mo1654h(bVar.getKey()), bVar);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m23975e(C5975e c5975e) {
        while (m23974d(c5975e.f18912r)) {
            InterfaceC5980j interfaceC5980j = c5975e.f18911q;
            if (!(interfaceC5980j instanceof C5975e)) {
                interfaceC5980j.getClass();
                return m23974d((InterfaceC5980j.b) interfaceC5980j);
            }
            c5975e = (C5975e) interfaceC5980j;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5975e)) {
            return false;
        }
        C5975e c5975e = (C5975e) obj;
        return c5975e.m23973g() == m23973g() && c5975e.m23975e(this);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        cVar.getClass();
        C5975e c5975e = this;
        while (true) {
            InterfaceC5980j.b bVarMo1654h = c5975e.f18912r.mo1654h(cVar);
            if (bVarMo1654h != null) {
                return bVarMo1654h;
            }
            InterfaceC5980j interfaceC5980j = c5975e.f18911q;
            if (!(interfaceC5980j instanceof C5975e)) {
                return interfaceC5980j.mo1654h(cVar);
            }
            c5975e = (C5975e) interfaceC5980j;
        }
    }

    public int hashCode() {
        return this.f18911q.hashCode() + this.f18912r.hashCode();
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        return interfaceC0188p.invoke(this.f18911q.mo1655q(obj, interfaceC0188p), this.f18912r);
    }

    public String toString() {
        return "[" + ((String) mo1655q(_UrlKt.FRAGMENT_ENCODE_SET, new InterfaceC0188p() { // from class: p8.d
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return C5975e.m23972b((String) obj, (InterfaceC5980j.b) obj2);
            }
        })) + ']';
    }

    /* JADX INFO: renamed from: p8.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Serializable {

        /* JADX INFO: renamed from: r */
        public static final C10180a f18913r = new C10180a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: q */
        public final InterfaceC5980j[] f18914q;

        public a(InterfaceC5980j[] interfaceC5980jArr) {
            interfaceC5980jArr.getClass();
            this.f18914q = interfaceC5980jArr;
        }

        private final Object readResolve() {
            InterfaceC5980j[] interfaceC5980jArr = this.f18914q;
            InterfaceC5980j interfaceC5980jMo1651c0 = C5981k.f18917q;
            for (InterfaceC5980j interfaceC5980j : interfaceC5980jArr) {
                interfaceC5980jMo1651c0 = interfaceC5980jMo1651c0.mo1651c0(interfaceC5980j);
            }
            return interfaceC5980jMo1651c0;
        }

        /* JADX INFO: renamed from: p8.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10180a {
            public /* synthetic */ C10180a(AbstractC1043k abstractC1043k) {
                this();
            }

            public C10180a() {
            }
        }
    }
}
