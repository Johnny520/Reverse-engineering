package p104h3;

import p024b9.AbstractC1061t;
import p265s1.AbstractC7070e3;
import p265s1.AbstractC7078g1;
import p265s1.C7128q1;

/* JADX INFO: renamed from: h3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2850c implements InterfaceC2863p {

    /* JADX INFO: renamed from: b */
    public final AbstractC7070e3 f7416b;

    /* JADX INFO: renamed from: c */
    public final float f7417c;

    public C2850c(AbstractC7070e3 abstractC7070e3, float f10) {
        this.f7416b = abstractC7070e3;
        this.f7417c = f10;
    }

    @Override // p104h3.InterfaceC2863p
    /* JADX INFO: renamed from: a */
    public float mo10102a() {
        return this.f7417c;
    }

    @Override // p104h3.InterfaceC2863p
    /* JADX INFO: renamed from: b */
    public long mo10103b() {
        return C7128q1.f23644b.m28147h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2850c)) {
            return false;
        }
        C2850c c2850c = (C2850c) obj;
        return AbstractC1061t.m3842c(this.f7416b, c2850c.f7416b) && Float.compare(this.f7417c, c2850c.f7417c) == 0;
    }

    @Override // p104h3.InterfaceC2863p
    /* JADX INFO: renamed from: f */
    public AbstractC7078g1 mo10104f() {
        return this.f7416b;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC7070e3 m10105h() {
        return this.f7416b;
    }

    public int hashCode() {
        return (this.f7416b.hashCode() * 31) + Float.hashCode(this.f7417c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f7416b + ", alpha=" + this.f7417c + ')';
    }
}
