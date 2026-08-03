package be;

import java.util.function.Consumer;
import nc.C2958a;
import p302ud.C4311g;
import p302ud.C4322r;

/* JADX INFO: renamed from: be.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0278e0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0271b f815b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4322r f816c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0278e0(C0271b c0271b, C4322r c4322r, int i9) {
        this.f814a = i9;
        this.f815b = c0271b;
        this.f816c = c4322r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f814a) {
            case 0:
                this.f815b.m1109x(this.f816c, (C4311g) obj);
                break;
            default:
                this.f815b.m1108s(this.f816c, (C2958a) obj);
                break;
        }
    }
}
