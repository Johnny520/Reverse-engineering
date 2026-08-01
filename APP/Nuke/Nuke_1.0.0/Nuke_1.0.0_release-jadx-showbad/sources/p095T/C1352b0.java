package p095T;

import p007B0.C0173F;
import p112W2.InterfaceC1603e;
import p203n.AbstractC2670o;
import p203n.C2680y;
import p203n.InterfaceC2660i0;
import p203n.InterfaceC2675t;

/* JADX INFO: renamed from: T.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1352b0 implements InterfaceC1353c, InterfaceC2660i0 {

    /* JADX INFO: renamed from: d */
    public final int f4786d;

    /* JADX INFO: renamed from: e */
    public int f4787e;

    /* JADX INFO: renamed from: f */
    public final Object f4788f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1352b0(byte[] bArr, int i5, int i6) {
        this.f4788f = bArr;
        this.f4786d = i5;
        this.f4787e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: c */
    public void mo780c(int i5, Object obj) {
        ((InterfaceC1353c) this.f4788f).mo780c(i5 + (this.f4787e == 0 ? this.f4786d : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: d */
    public void mo781d(Object obj) {
        this.f4787e++;
        ((InterfaceC1353c) this.f4788f).mo781d(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: e */
    public void mo782e() {
        ((InterfaceC1353c) this.f4788f).mo782e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: f */
    public void mo783f(int i5, Object obj) {
        ((InterfaceC1353c) this.f4788f).mo783f(i5 + (this.f4787e == 0 ? this.f4786d : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: h */
    public void mo785h(int i5, int i6, int i7) {
        int i8 = this.f4787e == 0 ? this.f4786d : 0;
        ((InterfaceC1353c) this.f4788f).mo785h(i5 + i8, i6 + i8, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: i */
    public Object mo786i() {
        return ((InterfaceC1353c) this.f4788f).mo786i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: j */
    public void mo787j(int i5, int i6) {
        ((InterfaceC1353c) this.f4788f).mo787j(i5 + (this.f4787e == 0 ? this.f4786d : 0), i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2660i0
    /* JADX INFO: renamed from: k */
    public int mo2502k() {
        return this.f4787e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: l */
    public void mo2398l(InterfaceC1603e interfaceC1603e, Object obj) {
        ((InterfaceC1353c) this.f4788f).mo2398l(interfaceC1603e, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: n */
    public void mo788n() {
        if (!(this.f4787e > 0)) {
            AbstractC1387t.m2638a("OffsetApplier up called with no corresponding down");
        }
        this.f4787e--;
        ((InterfaceC1353c) this.f4788f).mo788n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: o */
    public AbstractC2670o mo258o(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        return ((C0173F) this.f4788f).mo258o(j5, abstractC2670o, abstractC2670o2, abstractC2670o3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: r */
    public AbstractC2670o mo259r(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        return ((C0173F) this.f4788f).mo259r(j5, abstractC2670o, abstractC2670o2, abstractC2670o3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2660i0
    /* JADX INFO: renamed from: s */
    public int mo2503s() {
        return this.f4786d;
    }

    public C1352b0(InterfaceC1353c interfaceC1353c, int i5) {
        this.f4788f = interfaceC1353c;
        this.f4786d = i5;
    }

    public C1352b0() {
        this.f4788f = new C1352b0[256];
        this.f4786d = 0;
        this.f4787e = 0;
    }

    public C1352b0(int i5, int i6) {
        this.f4788f = null;
        this.f4786d = i5;
        int i7 = i6 & 7;
        this.f4787e = i7 == 0 ? 8 : i7;
    }

    public C1352b0(int i5, int i6, InterfaceC2675t interfaceC2675t) {
        this.f4786d = i5;
        this.f4787e = i6;
        this.f4788f = new C0173F(new C2680y(i5, i6, interfaceC2675t));
    }
}
