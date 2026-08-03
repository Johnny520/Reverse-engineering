package bsh.classpath;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: bsh.classpath.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0345b implements IntFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f995a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bsh.classpath.BshClassPath.searchJarFSForClasses(java.net.URL):java.lang.String[], bsh.classpath.BshClassPath.searchJrtFSForClasses(java.net.URL):java.lang.String[]] */
    public /* synthetic */ C0345b(int i9) {
        this.f995a = i9;
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.classpath.BshClassPath.i(int):java.lang.String[] */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.IntFunction
    public final Object apply(int i9) {
        switch (this.f995a) {
            case 0:
                return BshClassPath.lambda$searchJarFSForClasses$8(i9);
            default:
                return BshClassPath.lambda$searchJrtFSForClasses$7(i9);
        }
    }
}
