package p282t7;

import p024b9.AbstractC1061t;
import p035c8.C1399a;
import p299ub.AbstractC8621f0;
import p376zd.C9987e;

/* JADX INFO: renamed from: t7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8174a {

    /* JADX INFO: renamed from: a */
    public final String f27476a;

    /* JADX INFO: renamed from: b */
    public final C1399a f27477b;

    public C8174a(String str, C1399a c1399a) {
        str.getClass();
        c1399a.getClass();
        this.f27476a = str;
        this.f27477b = c1399a;
        if (AbstractC8621f0.m33156p0(str)) {
            C9987e.m38645a("Name can't be blank");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m31825a() {
        return this.f27476a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8174a)) {
            return false;
        }
        C8174a c8174a = (C8174a) obj;
        return AbstractC1061t.m3842c(this.f27476a, c8174a.f27476a) && AbstractC1061t.m3842c(this.f27477b, c8174a.f27477b);
    }

    public int hashCode() {
        return (this.f27476a.hashCode() * 31) + this.f27477b.hashCode();
    }

    public String toString() {
        return "AttributeKey: " + this.f27476a;
    }
}
