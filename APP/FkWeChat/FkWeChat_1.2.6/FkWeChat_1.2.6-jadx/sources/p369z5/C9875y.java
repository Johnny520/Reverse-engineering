package p369z5;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p038ce.InterfaceC1519a;
import p077f6.InterfaceC2321l0;
import p360yb.AbstractC9658a;
import p360yb.InterfaceC9661d;

/* JADX INFO: renamed from: z5.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9875y {

    /* JADX INFO: renamed from: a */
    public final String f33346a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1519a f33347b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2321l0 f33348c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9661d f33349d;

    public C9875y(String str, InterfaceC1519a interfaceC1519a, InterfaceC2321l0 interfaceC2321l0, InterfaceC9661d interfaceC9661d) {
        str.getClass();
        interfaceC1519a.getClass();
        interfaceC2321l0.getClass();
        interfaceC9661d.getClass();
        this.f33346a = str;
        this.f33347b = interfaceC1519a;
        this.f33348c = interfaceC2321l0;
        this.f33349d = interfaceC9661d;
    }

    /* JADX INFO: renamed from: a */
    public final String m38355a() {
        return this.f33346a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC9661d m38356b() {
        return this.f33349d;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1519a m38357c() {
        return this.f33347b;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2321l0 m38358d() {
        return this.f33348c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9875y)) {
            return false;
        }
        C9875y c9875y = (C9875y) obj;
        return AbstractC1061t.m3842c(this.f33346a, c9875y.f33346a) && AbstractC1061t.m3842c(this.f33347b, c9875y.f33347b) && AbstractC1061t.m3842c(this.f33348c, c9875y.f33348c) && AbstractC1061t.m3842c(this.f33349d, c9875y.f33349d);
    }

    public int hashCode() {
        return (((((this.f33346a.hashCode() * 31) + this.f33347b.hashCode()) * 31) + this.f33348c.hashCode()) * 31) + this.f33349d.hashCode();
    }

    public String toString() {
        return "MarkdownComponentModel(content=" + this.f33346a + ", node=" + this.f33347b + ", typography=" + this.f33348c + ", extra=" + this.f33349d + ")";
    }

    public /* synthetic */ C9875y(String str, InterfaceC1519a interfaceC1519a, InterfaceC2321l0 interfaceC2321l0, InterfaceC9661d interfaceC9661d, int i10, AbstractC1043k abstractC1043k) {
        this(str, interfaceC1519a, interfaceC2321l0, (i10 & 8) != 0 ? AbstractC9658a.m37777b() : interfaceC9661d);
    }
}
