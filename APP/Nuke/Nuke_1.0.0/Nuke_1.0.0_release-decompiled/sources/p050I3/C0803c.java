package p050I3;

import nuke.data.cipher.NativeCrypto;
import p056K2.C0891q;
import p095T.InterfaceC1347Y;
import p099T3.C1426e;
import p099T3.C1427f;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: I3.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0803c implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2581d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f2582e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f2583f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f2584g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2585h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2586i;

    public /* synthetic */ C0803c(String str, InterfaceC1601c interfaceC1601c, C1427f c1427f, String str2, InterfaceC1347Y interfaceC1347Y) {
        this.f2582e = str;
        this.f2584g = interfaceC1601c;
        this.f2585h = c1427f;
        this.f2583f = str2;
        this.f2586i = interfaceC1347Y;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f2581d) {
            case 0:
                return NativeCrypto.m4765b(this.f2582e, this.f2583f, (String) this.f2584g, (String) this.f2585h, (String) this.f2586i);
            default:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f2584g;
                C1427f c1427f = (C1427f) this.f2585h;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f2586i;
                String str = this.f2582e;
                if (str != null) {
                    if (str.equals(this.f2583f)) {
                        str = null;
                    }
                    interfaceC1601c.mo1h(C1427f.m2721a(c1427f, 0, 0, new C1426e(str), 3));
                    interfaceC1347Y.setValue(Boolean.FALSE);
                }
                return C0891q.f2780a;
        }
    }

    public /* synthetic */ C0803c(String str, String str2, String str3, String str4, String str5) {
        this.f2582e = str;
        this.f2583f = str2;
        this.f2584g = str3;
        this.f2585h = str4;
        this.f2586i = str5;
    }
}
