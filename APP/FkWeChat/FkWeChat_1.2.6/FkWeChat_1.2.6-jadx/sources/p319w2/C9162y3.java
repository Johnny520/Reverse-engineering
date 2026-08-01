package p319w2;

import p024b9.AbstractC1061t;
import p319w2.C9058e;

/* JADX INFO: renamed from: w2.y3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9162y3 implements C9058e.a {

    /* JADX INFO: renamed from: a */
    public final String f31251a;

    public C9162y3(String str) {
        this.f31251a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m35606a() {
        return this.f31251a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9162y3) && AbstractC1061t.m3842c(this.f31251a, ((C9162y3) obj).f31251a);
    }

    public int hashCode() {
        return this.f31251a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f31251a + ')';
    }
}
