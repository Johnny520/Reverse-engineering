package bsh.classpath;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: bsh.classpath.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0346c implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractCollection f997b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0346c(AbstractCollection abstractCollection, int i9) {
        this.f996a = i9;
        this.f997b = abstractCollection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f996a) {
            case 0:
                BshClassPath.lambda$getFullPath$2((ArrayList) this.f997b, (BshClassPath) obj);
                break;
            default:
                BshClassPath.lambda$getPackagesSet$9((HashSet) this.f997b, (BshClassPath) obj);
                break;
        }
    }
}
