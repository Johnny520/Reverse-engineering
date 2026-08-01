package p041H0;

import p105V.C1483e;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2205n;

/* JADX INFO: renamed from: H0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0586c0 {

    /* JADX INFO: renamed from: a */
    public AbstractC2206o f1867a;

    /* JADX INFO: renamed from: b */
    public int f1868b;

    /* JADX INFO: renamed from: c */
    public C1483e f1869c;

    /* JADX INFO: renamed from: d */
    public C1483e f1870d;

    /* JADX INFO: renamed from: e */
    public boolean f1871e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0590e0 f1872f;

    public C0586c0(C0590e0 c0590e0, AbstractC2206o abstractC2206o, int i5, C1483e c1483e, C1483e c1483e2, boolean z5) {
        this.f1872f = c0590e0;
        this.f1867a = abstractC2206o;
        this.f1868b = i5;
        this.f1869c = c1483e;
        this.f1870d = c1483e2;
        this.f1871e = z5;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m957a(int i5, int i6) {
        C1483e c1483e = this.f1869c;
        int i7 = this.f1868b;
        InterfaceC2205n interfaceC2205n = (InterfaceC2205n) c1483e.f5181d[i5 + i7];
        InterfaceC2205n interfaceC2205n2 = (InterfaceC2205n) this.f1870d.f5181d[i7 + i6];
        return AbstractC1665j.m2981a(interfaceC2205n, interfaceC2205n2) || interfaceC2205n.getClass() == interfaceC2205n2.getClass();
    }
}
