package p254r5;

import bsh.C1259t2;
import p225p5.C5953a;

/* JADX INFO: renamed from: r5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6491c extends AbstractC6487a {

    /* JADX INFO: renamed from: q */
    public final C5953a f20376q;

    public C6491c(C5953a c5953a) {
        if (c5953a == null) {
            C1259t2.m5095a("annotation == null");
            throw null;
        }
        c5953a.m33930v();
        this.f20376q = c5953a;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: c */
    public int mo25727c(AbstractC6487a abstractC6487a) {
        return this.f20376q.compareTo(((C6491c) abstractC6487a).f20376q);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6491c) {
            return this.f20376q.equals(((C6491c) obj).f20376q);
        }
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return this.f20376q.toString();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: h */
    public boolean mo25728h() {
        return false;
    }

    public int hashCode() {
        return this.f20376q.hashCode();
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "annotation";
    }

    /* JADX INFO: renamed from: k */
    public C5953a m25736k() {
        return this.f20376q;
    }

    public String toString() {
        return this.f20376q.toString();
    }
}
