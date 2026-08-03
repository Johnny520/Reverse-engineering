package p044d4;

import bsh.loader.BshLoaderHelper;
import java.util.function.Function;

/* JADX INFO: renamed from: d4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0688a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2095a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2096b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ClassLoader f2097c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0688a(String str, ClassLoader classLoader, int i9) {
        this.f2095a = i9;
        this.f2096b = str;
        this.f2097c = classLoader;
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.loader.BshLoaderHelper.d(java.lang.String, java.lang.ClassLoader, java.lang.String):java.lang.ClassLoader */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2095a) {
            case 0:
                return BshLoaderHelper.lambda$getLoaderByJar$2(this.f2096b, this.f2097c, (String) obj);
            case 1:
                return BshLoaderHelper.lambda$getLoaderByDex$1(this.f2096b, this.f2097c, (String) obj);
            default:
                return BshLoaderHelper.lambda$getLoaderByAar$3(this.f2096b, this.f2097c, (String) obj);
        }
    }
}
