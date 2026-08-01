package p110W0;

import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: W0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1576a implements InterfaceC1591p {

    /* JADX INFO: renamed from: d */
    public final int f5490d;

    public C1576a(int i5) {
        this.f5490d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1576a) && this.f5490d == ((C1576a) obj).f5490d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5490d);
    }

    public final String toString() {
        return AbstractC3202a.m5466a(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f5490d, ')');
    }
}
