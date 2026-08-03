package p151k6;

import java.io.IOException;
import p105h6.AbstractC1622n;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2307o extends AbstractC1622n {

    /* JADX INFO: renamed from: b */
    public static final C2305n f7628b = new C2305n(new C2307o(0), 0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7629a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h6.f.<init>(j6.d, int, java.util.HashMap, boolean, h6.a, int, boolean, int, java.util.ArrayList, int, int, java.util.ArrayList):void, k6.o.<clinit>():void] */
    public /* synthetic */ C2307o(int i9) {
        this.f7629a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        switch (this.f7629a) {
            case 0:
                c3066a.m6515w((Number) obj);
                break;
            default:
                c3066a.m6508l();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f7629a) {
            case 1:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
