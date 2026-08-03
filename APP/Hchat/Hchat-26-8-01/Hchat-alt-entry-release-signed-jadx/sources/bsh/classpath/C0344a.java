package bsh.classpath;

import bsh.classpath.BshClassPath;
import java.util.function.Consumer;

/* JADX INFO: renamed from: bsh.classpath.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0344a implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BshClassPath.UnqualifiedNameTable f994b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0344a(BshClassPath.UnqualifiedNameTable unqualifiedNameTable, int i9) {
        this.f993a = i9;
        this.f994b = unqualifiedNameTable;
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.classpath.BshClassPath.g(bsh.classpath.BshClassPath$UnqualifiedNameTable, java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f993a) {
            case 0:
                BshClassPath.lambda$buildUnqualifiedNameTable$4(this.f994b, (BshClassPath) obj);
                break;
            case 1:
                this.f994b.add((String) obj);
                break;
            default:
                this.f994b.add((String) obj);
                break;
        }
    }
}
