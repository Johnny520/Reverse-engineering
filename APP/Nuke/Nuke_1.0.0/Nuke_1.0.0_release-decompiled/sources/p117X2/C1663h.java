package p117X2;

import p011B4.AbstractC0231b;
import p056K2.InterfaceC0877c;
import p137b3.InterfaceC1853a;

/* JADX INFO: renamed from: X2.h */
/* JADX INFO: loaded from: classes.dex */
public class C1663h extends AbstractC1658c implements InterfaceC1662g, InterfaceC1853a, InterfaceC0877c {

    /* JADX INFO: renamed from: j */
    public final int f5700j;

    public C1663h(int i5, Class cls, String str, String str2, int i6) {
        this(i5, C1657b.f5691d, cls, str, str2, i6, 0);
    }

    @Override // p117X2.InterfaceC1662g
    /* JADX INFO: renamed from: b */
    public final int mo2234b() {
        return this.f5700j;
    }

    @Override // p117X2.AbstractC1658c
    /* JADX INFO: renamed from: c */
    public final InterfaceC1853a mo2975c() {
        AbstractC1676u.f5711a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1663h) {
            C1663h c1663h = (C1663h) obj;
            return this.f5695g.equals(c1663h.f5695g) && this.f5696h.equals(c1663h.f5696h) && AbstractC1665j.m2981a(this.f5693e, c1663h.f5693e) && m2976d().equals(c1663h.m2976d());
        }
        if (!(obj instanceof C1663h)) {
            return false;
        }
        InterfaceC1853a interfaceC1853a = this.f5692d;
        if (interfaceC1853a == null) {
            mo2975c();
            this.f5692d = this;
            interfaceC1853a = this;
        }
        return obj.equals(interfaceC1853a);
    }

    public final int hashCode() {
        m2976d();
        return this.f5696h.hashCode() + AbstractC0231b.m394e(m2976d().hashCode() * 31, 31, this.f5695g);
    }

    public final String toString() {
        InterfaceC1853a interfaceC1853a = this.f5692d;
        if (interfaceC1853a == null) {
            mo2975c();
            this.f5692d = this;
            interfaceC1853a = this;
        }
        if (interfaceC1853a != this) {
            return interfaceC1853a.toString();
        }
        String str = this.f5695g;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0231b.m400k("function ", str, " (Kotlin reflection is not available)");
    }

    public C1663h(int i5, Object obj, Class cls, String str, String str2, int i6, int i7) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f5700j = i5;
    }
}
