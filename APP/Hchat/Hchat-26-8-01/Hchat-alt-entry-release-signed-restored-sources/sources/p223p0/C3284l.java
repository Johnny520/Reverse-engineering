package p223p0;

import p069f.C0958s;

/* JADX INFO: renamed from: p0.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3284l extends AbstractC3283k {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f10447j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10447j) {
            case 0:
                int i9 = this.f10446i;
                this.f10446i = i9 + 2;
                Object[] objArr = this.f10444g;
                return new C0958s(objArr[i9], 1, objArr[i9 + 1]);
            case 1:
                int i10 = this.f10446i;
                this.f10446i = i10 + 2;
                return this.f10444g[i10];
            default:
                int i11 = this.f10446i;
                this.f10446i = i11 + 2;
                return this.f10444g[i11 + 1];
        }
    }
}
