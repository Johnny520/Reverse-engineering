package p141j8;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p157k8.InterfaceC4030b4;

/* JADX INFO: renamed from: j8.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3627d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4030b4 f10077a;

    /* JADX INFO: renamed from: b */
    public final String f10078b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f10079c;

    public /* synthetic */ C3627d0(InterfaceC4030b4 interfaceC4030b4, String str, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : interfaceC4030b4, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : interfaceC0184l);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4030b4 m13553a() {
        return this.f10077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3627d0 c3627d0 = (C3627d0) obj;
            if (AbstractC1061t.m3842c(this.f10077a, c3627d0.f10077a) && AbstractC1061t.m3842c(this.f10078b, c3627d0.f10078b) && AbstractC1061t.m3842c(this.f10079c, c3627d0.f10079c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        InterfaceC4030b4 interfaceC4030b4 = this.f10077a;
        int iHashCode = (interfaceC4030b4 != null ? interfaceC4030b4.hashCode() : 0) * 31;
        String str = this.f10078b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        InterfaceC0184l interfaceC0184l = this.f10079c;
        return iHashCode2 + (interfaceC0184l != null ? interfaceC0184l.hashCode() : 0);
    }

    public String toString() {
        return "TransportSendOptions(relatedRequestId=" + this.f10077a + ", resumptionToken=" + this.f10078b + ", onResumptionToken=" + this.f10079c + ")";
    }

    public C3627d0(InterfaceC4030b4 interfaceC4030b4, String str, InterfaceC0184l interfaceC0184l) {
        this.f10077a = interfaceC4030b4;
        this.f10078b = str;
        this.f10079c = interfaceC0184l;
    }
}
