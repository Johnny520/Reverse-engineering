package p047I0;

import p048I1.C0780e;
import p055K1.C0874a;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: I0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0765u0 extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f2387e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0780e f2388f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f2389g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0765u0(boolean z5, C0780e c0780e, String str) {
        super(0);
        this.f2387e = z5;
        this.f2388f = c0780e;
        this.f2389g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        if (this.f2387e) {
            C0780e c0780e = this.f2388f;
            String str = this.f2389g;
            C0874a c0874a = c0780e.f2522a;
            synchronized (c0874a.f2758c) {
            }
        }
        return C0891q.f2780a;
    }
}
