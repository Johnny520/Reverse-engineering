package p135j2;

import p135j2.C3530h2;
import p135j2.C3551n;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: j2.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3554o implements InterfaceC3553n1 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC3553n1[] f9888b;

    /* JADX INFO: renamed from: c */
    public final C3530h2 f9889c;

    /* JADX INFO: renamed from: d */
    public final C3551n f9890d;

    /* JADX INFO: renamed from: e */
    public final C3530h2 f9891e;

    /* JADX INFO: renamed from: f */
    public final C3551n f9892f;

    public C3554o(InterfaceC3553n1[] interfaceC3553n1Arr) {
        this.f9888b = interfaceC3553n1Arr;
        C3530h2.a aVar = C3530h2.f9773b;
        int length = interfaceC3553n1Arr.length;
        C3530h2[] c3530h2Arr = new C3530h2[length];
        for (int i10 = 0; i10 < length; i10++) {
            c3530h2Arr[i10] = this.f9888b[i10].mo13323a();
        }
        this.f9889c = aVar.m13135b(c3530h2Arr);
        C3551n.a aVar2 = C3551n.f9883b;
        int length2 = this.f9888b.length;
        C3551n[] c3551nArr = new C3551n[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            c3551nArr[i11] = this.f9888b[i11].mo13326d();
        }
        this.f9890d = aVar2.m13319a(c3551nArr);
        C3530h2.a aVar3 = C3530h2.f9773b;
        int length3 = this.f9888b.length;
        C3530h2[] c3530h2Arr2 = new C3530h2[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            c3530h2Arr2[i12] = this.f9888b[i12].mo13324b();
        }
        this.f9891e = aVar3.m13136c(c3530h2Arr2);
        C3551n.a aVar4 = C3551n.f9883b;
        int length4 = this.f9888b.length;
        C3551n[] c3551nArr2 = new C3551n[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            c3551nArr2[i13] = this.f9888b[i13].mo13325c();
        }
        this.f9892f = aVar4.m13320b(c3551nArr2);
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: a */
    public C3530h2 mo13323a() {
        return this.f9889c;
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: b */
    public C3530h2 mo13324b() {
        return this.f9891e;
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: c */
    public C3551n mo13325c() {
        return this.f9892f;
    }

    @Override // p135j2.InterfaceC3553n1
    /* JADX INFO: renamed from: d */
    public C3551n mo13326d() {
        return this.f9890d;
    }

    public String toString() {
        return AbstractC5106t.m20754u0(this.f9888b, null, "innermostOf(", ")", 0, null, null, 57, null);
    }
}
