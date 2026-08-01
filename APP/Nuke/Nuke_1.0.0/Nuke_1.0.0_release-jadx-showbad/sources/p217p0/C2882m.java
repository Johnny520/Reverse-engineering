package p217p0;

import com.bumptech.glide.AbstractC1926h;

/* JADX INFO: renamed from: p0.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2882m implements InterfaceC2878i {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9114d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2886q f9115e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2882m(C2886q c2886q, int i5) {
        this.f9114d = i5;
        this.f9115e = c2886q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.InterfaceC2878i
    /* JADX INFO: renamed from: b */
    public final double mo601b(double d5) {
        switch (this.f9114d) {
            case 0:
                return AbstractC1926h.m3566i(this.f9115e.f9130k.mo601b(d5), r10.f9124e, r10.f9125f);
            default:
                return this.f9115e.f9133n.mo601b(AbstractC1926h.m3566i(d5, r0.f9124e, r0.f9125f));
        }
    }
}
