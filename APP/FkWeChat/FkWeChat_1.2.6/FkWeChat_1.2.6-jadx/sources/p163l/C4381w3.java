package p163l;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.w3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4381w3 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4357s f12827a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4288e0 f12828b;

    /* JADX INFO: renamed from: c */
    public final int f12829c;

    public C4381w3(AbstractC4357s abstractC4357s, InterfaceC4288e0 interfaceC4288e0, int i10) {
        this.f12827a = abstractC4357s;
        this.f12828b = interfaceC4288e0;
        this.f12829c = i10;
    }

    /* JADX INFO: renamed from: a */
    public final int m17153a() {
        return this.f12829c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4288e0 m17154b() {
        return this.f12828b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC4357s m17155c() {
        return this.f12827a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4381w3)) {
            return false;
        }
        C4381w3 c4381w3 = (C4381w3) obj;
        return AbstractC1061t.m3842c(this.f12827a, c4381w3.f12827a) && AbstractC1061t.m3842c(this.f12828b, c4381w3.f12828b) && AbstractC4372v.m17126c(this.f12829c, c4381w3.f12829c);
    }

    public int hashCode() {
        return (((this.f12827a.hashCode() * 31) + this.f12828b.hashCode()) * 31) + AbstractC4372v.m17127d(this.f12829c);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f12827a + ", easing=" + this.f12828b + ", arcMode=" + ((Object) AbstractC4372v.m17128e(this.f12829c)) + ')';
    }

    public /* synthetic */ C4381w3(AbstractC4357s abstractC4357s, InterfaceC4288e0 interfaceC4288e0, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC4357s, interfaceC4288e0, i10);
    }
}
