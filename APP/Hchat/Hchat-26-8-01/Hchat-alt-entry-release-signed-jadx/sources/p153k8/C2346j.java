package p153k8;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: k8.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2346j implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7699g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f7700h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2346j(long j3, int i9) {
        this.f7699g = i9;
        this.f7700h = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        switch (this.f7699g) {
            case 0:
                if (this.f7700h - ((Long) entry.getValue()).longValue() > 300000) {
                }
                break;
            default:
                if (this.f7700h - ((Long) entry.getValue()).longValue() > 10000) {
                }
                break;
        }
        return false;
    }
}
