package p254r5;

import bsh.C1259t2;
import p269s5.C7186a;
import p269s5.C7188c;

/* JADX INFO: renamed from: r5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6503i extends AbstractC6487a {

    /* JADX INFO: renamed from: q */
    public final C6512q f20410q;

    /* JADX INFO: renamed from: r */
    public final int f20411r;

    public C6503i(C6512q c6512q, int i10) {
        if (c6512q == null) {
            C1259t2.m5095a("invokeDynamic == null");
            throw null;
        }
        this.f20410q = c6512q;
        this.f20411r = i10;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        C6503i c6503i = (C6503i) abstractC6487a;
        int iCompareTo = this.f20410q.compareTo(c6503i.f20410q);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f20411r, c6503i.f20411r);
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m25771k().mo6828g();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "CallSiteRef";
    }

    /* JADX INFO: renamed from: k */
    public C6501h m25771k() {
        return this.f20410q.m25787p();
    }

    /* JADX INFO: renamed from: n */
    public C7186a m25772n() {
        return this.f20410q.m25790u();
    }

    /* JADX INFO: renamed from: p */
    public C7188c m25773p() {
        return this.f20410q.m25792w();
    }

    public String toString() {
        return m25771k().toString();
    }
}
