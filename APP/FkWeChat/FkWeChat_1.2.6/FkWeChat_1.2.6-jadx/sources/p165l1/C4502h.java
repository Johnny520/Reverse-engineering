package p165l1;

import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: l1.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4502h implements InterfaceC4507m {

    /* JADX INFO: renamed from: b */
    public final InterfaceC4507m f13052b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4507m f13053c;

    /* JADX INFO: renamed from: l1.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public static final a f13054r = new a();

        public a() {
            super(2);
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, InterfaceC4507m.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C4502h(InterfaceC4507m interfaceC4507m, InterfaceC4507m interfaceC4507m2) {
        this.f13052b = interfaceC4507m;
        this.f13053c = interfaceC4507m2;
    }

    @Override // p165l1.InterfaceC4507m
    /* JADX INFO: renamed from: a */
    public Object mo17429a(Object obj, InterfaceC0188p interfaceC0188p) {
        return this.f13053c.mo17429a(this.f13052b.mo17429a(obj, interfaceC0188p), interfaceC0188p);
    }

    @Override // p165l1.InterfaceC4507m
    /* JADX INFO: renamed from: b */
    public boolean mo17430b(InterfaceC0184l interfaceC0184l) {
        return this.f13052b.mo17430b(interfaceC0184l) && this.f13053c.mo17430b(interfaceC0184l);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4502h)) {
            return false;
        }
        C4502h c4502h = (C4502h) obj;
        return AbstractC1061t.m3842c(this.f13052b, c4502h.f13052b) && AbstractC1061t.m3842c(this.f13053c, c4502h.f13053c);
    }

    public int hashCode() {
        return this.f13052b.hashCode() + (this.f13053c.hashCode() * 31);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC4507m m17431j() {
        return this.f13053c;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC4507m m17432k() {
        return this.f13052b;
    }

    public String toString() {
        return "[" + ((String) mo17429a(_UrlKt.FRAGMENT_ENCODE_SET, a.f13054r)) + ']';
    }
}
