package p032c5;

import bsh.C1259t2;
import p045d5.C1886h;
import p045d5.C1888j;
import p094g5.InterfaceC2519b;
import p309v5.C8835q;
import p376zd.C9987e;

/* JADX INFO: renamed from: c5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1329c extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final int f3971b;

    /* JADX INFO: renamed from: c */
    public final int f3972c;

    /* JADX INFO: renamed from: d */
    public final C1888j f3973d;

    /* JADX INFO: renamed from: e */
    public final C1886h f3974e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2519b f3975f;

    public C1329c(int i10, int i11, C1888j c1888j, C1886h c1886h, InterfaceC2519b interfaceC2519b) {
        super("Code");
        if (i10 < 0) {
            C9987e.m38645a("maxStack < 0");
            throw null;
        }
        if (i11 < 0) {
            C9987e.m38645a("maxLocals < 0");
            throw null;
        }
        if (c1888j == null) {
            C1259t2.m5095a("code == null");
            throw null;
        }
        try {
            if (c1886h.m33927c()) {
                throw new C8835q("catches.isMutable()");
            }
            try {
                if (interfaceC2519b.m9027c()) {
                    throw new C8835q("attributes.isMutable()");
                }
                this.f3971b = i10;
                this.f3972c = i11;
                this.f3973d = c1888j;
                this.f3974e = c1886h;
                this.f3975f = interfaceC2519b;
            } catch (NullPointerException unused) {
                C1259t2.m5095a("attributes == null");
                throw null;
            }
        } catch (NullPointerException unused2) {
            C1259t2.m5095a("catches == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return this.f3973d.m6738a() + 10 + this.f3974e.m6730a() + this.f3975f.mo9026a();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC2519b m5339b() {
        return this.f3975f;
    }

    /* JADX INFO: renamed from: c */
    public C1886h m5340c() {
        return this.f3974e;
    }

    /* JADX INFO: renamed from: d */
    public C1888j m5341d() {
        return this.f3973d;
    }

    /* JADX INFO: renamed from: e */
    public int m5342e() {
        return this.f3972c;
    }

    /* JADX INFO: renamed from: f */
    public int m5343f() {
        return this.f3971b;
    }
}
