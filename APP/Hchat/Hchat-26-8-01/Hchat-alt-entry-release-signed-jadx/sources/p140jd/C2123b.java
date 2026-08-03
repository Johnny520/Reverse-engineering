package p140jd;

import java.util.function.Consumer;
import p081fc.C1203f;
import p199nd.C2984p;

/* JADX INFO: renamed from: jd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2123b implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1203f f7083b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2123b(C1203f c1203f, int i9) {
        this.f7082a = i9;
        this.f7083b = c1203f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7082a) {
            case 0:
                C1203f c1203f = this.f7083b;
                c1203f.m3271r("/* ");
                c1203f.mo3259i((String) obj).mo3255e(" */");
                break;
            default:
                C2984p c2984p = (C2984p) obj;
                AbstractC2124c.m5342c(this.f7083b, c2984p.f9748g, c2984p.f9749h);
                break;
        }
    }
}
