package p277t2;

import p024b9.AbstractC1061t;
import p172l8.InterfaceC4695g;

/* JADX INFO: renamed from: t2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8059a {

    /* JADX INFO: renamed from: a */
    public final String f26863a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4695g f26864b;

    public C8059a(String str, InterfaceC4695g interfaceC4695g) {
        this.f26863a = str;
        this.f26864b = interfaceC4695g;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4695g m30986a() {
        return this.f26864b;
    }

    /* JADX INFO: renamed from: b */
    public final String m30987b() {
        return this.f26863a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8059a)) {
            return false;
        }
        C8059a c8059a = (C8059a) obj;
        return AbstractC1061t.m3842c(this.f26863a, c8059a.f26863a) && AbstractC1061t.m3842c(this.f26864b, c8059a.f26864b);
    }

    public int hashCode() {
        String str = this.f26863a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC4695g interfaceC4695g = this.f26864b;
        return iHashCode + (interfaceC4695g != null ? interfaceC4695g.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f26863a + ", action=" + this.f26864b + ')';
    }
}
