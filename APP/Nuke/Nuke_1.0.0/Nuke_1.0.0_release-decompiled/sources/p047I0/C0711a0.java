package p047I0;

import android.view.Choreographer;
import p014C1.C0240b;
import p068N1.C1013c;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p074O2.InterfaceC1051i;
import p095T.C1357e;
import p095T.C1390u0;
import p112W2.InterfaceC1603e;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: I0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711a0 implements InterfaceC1049g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2251d;

    /* JADX INFO: renamed from: e */
    public final Object f2252e;

    /* JADX INFO: renamed from: f */
    public final Object f2253f;

    public C0711a0(Choreographer choreographer, C0706Y c0706y) {
        this.f2251d = 0;
        this.f2252e = choreographer;
        this.f2253f = c0706y;
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        switch (this.f2251d) {
        }
        return interfaceC1603e.mo0g(obj, this);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        switch (this.f2251d) {
        }
        return AbstractC1785a.m3250j(this, interfaceC1050h);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1209a(p112W2.InterfaceC1601c r7, p074O2.InterfaceC1046d r8) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.C0711a0.m1209a(W2.c, O2.d):java.lang.Object");
    }

    @Override // p074O2.InterfaceC1049g
    public InterfaceC1050h getKey() {
        return C1357e.f4794f;
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        switch (this.f2251d) {
        }
        return AbstractC1785a.m3253n(this, interfaceC1050h);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        switch (this.f2251d) {
        }
        return AbstractC1785a.m3254o(this, interfaceC1051i);
    }

    public C0711a0(C0711a0 c0711a0) {
        this.f2251d = 2;
        this.f2252e = c0711a0;
        this.f2253f = new C1013c();
    }

    public C0711a0(C1390u0 c1390u0) {
        this.f2251d = 1;
        this.f2252e = c1390u0;
        this.f2253f = new C0240b(5);
    }
}
