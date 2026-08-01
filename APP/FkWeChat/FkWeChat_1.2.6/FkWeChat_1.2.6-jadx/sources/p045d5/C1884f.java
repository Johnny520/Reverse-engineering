package p045d5;

import bsh.C1259t2;
import p309v5.AbstractC8826h;
import p309v5.C8829k;
import p309v5.InterfaceC8831m;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1884f implements InterfaceC8831m {

    /* JADX INFO: renamed from: a */
    public final int f5237a;

    /* JADX INFO: renamed from: b */
    public final int f5238b;

    /* JADX INFO: renamed from: c */
    public final int f5239c;

    /* JADX INFO: renamed from: d */
    public final C8829k f5240d;

    /* JADX INFO: renamed from: e */
    public final C1886h f5241e;

    public C1884f(int i10, int i11, int i12, C8829k c8829k, C1886h c1886h) {
        if (i10 < 0) {
            C9987e.m38645a("label < 0");
            throw null;
        }
        if (i11 < 0) {
            C9987e.m38645a("start < 0");
            throw null;
        }
        if (i12 <= i11) {
            C9987e.m38645a("end <= start");
            throw null;
        }
        if (c8829k == null) {
            C1259t2.m5095a("targets == null");
            throw null;
        }
        int size = c8829k.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (c8829k.m33920z(i13) < 0) {
                throw new IllegalArgumentException("successors[" + i13 + "] == " + c8829k.m33920z(i13));
            }
        }
        if (c1886h == null) {
            C1259t2.m5095a("catches == null");
            throw null;
        }
        this.f5237a = i10;
        this.f5238b = i11;
        this.f5239c = i12;
        this.f5240d = c8829k;
        this.f5241e = c1886h;
    }

    @Override // p309v5.InterfaceC8831m
    /* JADX INFO: renamed from: a */
    public int mo6715a() {
        return this.f5237a;
    }

    /* JADX INFO: renamed from: b */
    public C1886h m6716b() {
        return this.f5241e;
    }

    /* JADX INFO: renamed from: c */
    public int m6717c() {
        return this.f5239c;
    }

    /* JADX INFO: renamed from: d */
    public int m6718d() {
        return this.f5238b;
    }

    /* JADX INFO: renamed from: e */
    public C8829k m6719e() {
        return this.f5240d;
    }

    public String toString() {
        return "{" + AbstractC8826h.m33898g(this.f5237a) + ": " + AbstractC8826h.m33898g(this.f5238b) + ".." + AbstractC8826h.m33898g(this.f5239c) + '}';
    }
}
