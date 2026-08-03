package p273s7;

import p152k7.AbstractC2331a;
import p379z7.C6107c;
import p379z7.InterfaceC6124t;

/* JADX INFO: renamed from: s7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3932a implements InterfaceC6124t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3933b f12911g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.InterfaceC6124t
    /* JADX INFO: renamed from: a */
    public void mo5738a(int i9, int i10) {
        C3933b c3933b;
        AbstractC2331a abstractC2331aM6524Q;
        AbstractC2331a abstractC2331aM6524Q2;
        if (i9 == i10 || (abstractC2331aM6524Q = (c3933b = this.f12911g).m6524Q(i9)) == (abstractC2331aM6524Q2 = c3933b.m6524Q(i10)) || abstractC2331aM6524Q == null || abstractC2331aM6524Q2 == null) {
            return;
        }
        int i11 = abstractC2331aM6524Q.f7657g;
        int i12 = abstractC2331aM6524Q2.f7657g;
        C6107c c6107c = c3933b.f9926k;
        if (i11 == i12) {
            c6107c.getClass();
        } else {
            Object[] objArr = c6107c.f24642g;
            Object obj = objArr[i11];
            objArr[i11] = objArr[i12];
            objArr[i12] = obj;
            c6107c.f24646k = 0;
        }
        abstractC2331aM6524Q.m5546H(i12);
        abstractC2331aM6524Q2.m5546H(i11);
    }
}
