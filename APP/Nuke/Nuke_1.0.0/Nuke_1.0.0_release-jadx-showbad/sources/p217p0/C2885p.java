package p217p0;

import com.bumptech.glide.AbstractC1926h;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: p0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2885p extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f9120e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2886q f9121f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2885p(C2886q c2886q, int i5) {
        super(1);
        this.f9120e = i5;
        this.f9121f = c2886q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f9120e) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f9121f.f9133n.mo601b(AbstractC1926h.m3566i(dDoubleValue, r10.f9124e, r10.f9125f)));
            default:
                return Double.valueOf(AbstractC1926h.m3566i(this.f9121f.f9130k.mo601b(((Number) obj).doubleValue()), r10.f9124e, r10.f9125f));
        }
    }
}
