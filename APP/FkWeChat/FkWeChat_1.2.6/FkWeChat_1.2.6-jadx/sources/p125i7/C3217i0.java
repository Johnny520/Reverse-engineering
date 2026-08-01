package p125i7;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i7.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3217i0 implements InterfaceC3219j0 {

    /* JADX INFO: renamed from: a */
    public final C3234r f8605a;

    /* JADX INFO: renamed from: b */
    public String f8606b;

    /* JADX INFO: renamed from: c */
    public int f8607c;

    public C3217i0(C3234r c3234r) {
        c3234r.getClass();
        this.f8605a = c3234r;
        this.f8606b = "0.0.0.0";
        this.f8607c = 80;
    }

    @Override // p125i7.InterfaceC3219j0
    /* JADX INFO: renamed from: a */
    public int mo12226a() {
        return this.f8607c;
    }

    @Override // p125i7.InterfaceC3219j0
    /* JADX INFO: renamed from: b */
    public String mo12227b() {
        return this.f8606b;
    }

    /* JADX INFO: renamed from: c */
    public void m12228c(String str) {
        str.getClass();
        this.f8606b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m12229d(int i10) {
        this.f8607c = i10;
    }

    @Override // p125i7.InterfaceC3219j0
    public C3234r getType() {
        return this.f8605a;
    }

    public String toString() {
        return getType().m12287c() + ' ' + mo12227b() + ':' + mo12226a();
    }

    public /* synthetic */ C3217i0(C3234r c3234r, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? C3234r.f8685b.m12288a() : c3234r);
    }
}
