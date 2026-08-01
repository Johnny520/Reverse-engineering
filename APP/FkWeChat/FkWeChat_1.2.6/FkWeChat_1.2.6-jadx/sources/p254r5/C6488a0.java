package p254r5;

import p269s5.C7186a;
import p269s5.C7188c;

/* JADX INFO: renamed from: r5.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6488a0 extends AbstractC6500g0 {

    /* JADX INFO: renamed from: q */
    public final C7186a f20374q;

    public C6488a0(C7186a c7186a) {
        this.f20374q = c7186a;
    }

    /* JADX INFO: renamed from: n */
    public static C6488a0 m25730n(C6492c0 c6492c0) {
        return new C6488a0(C7186a.m28378c(c6492c0.m25741n()));
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        return this.f20374q.compareTo(((C6488a0) abstractC6487a).m25731k());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6488a0) {
            return m25731k().equals(((C6488a0) obj).m25731k());
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f20374q.m28385g();
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23835N;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    public int hashCode() {
        return this.f20374q.hashCode();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "proto";
    }

    /* JADX INFO: renamed from: k */
    public C7186a m25731k() {
        return this.f20374q;
    }

    public final String toString() {
        return mo25729j() + "{" + mo6828g() + '}';
    }
}
