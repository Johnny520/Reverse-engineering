package p029F0;

import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: F0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0412m extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1240e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0414n[] f1241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0412m(C0414n[] c0414nArr, int i5) {
        super(2);
        this.f1240e = i5;
        this.f1241f = c0414nArr;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1240e) {
            case 0:
                return Float.valueOf(AbstractC0435z.m689b((AbstractC0389a0) obj, true, this.f1241f, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC0435z.m689b((AbstractC0389a0) obj, false, this.f1241f, ((Number) obj2).floatValue()));
        }
    }
}
