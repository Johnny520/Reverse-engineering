package p223p0;

import p176m1.C2731f0;

/* JADX INFO: renamed from: p0.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3285m extends AbstractC3283k {

    /* JADX INFO: renamed from: j */
    public final C2731f0 f10448j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3285m(C2731f0 c2731f0) {
        this.f10448j = c2731f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.f10446i;
        this.f10446i = i9 + 2;
        Object[] objArr = this.f10444g;
        return new C3273a(this.f10448j, objArr[i9], objArr[i9 + 1]);
    }
}
