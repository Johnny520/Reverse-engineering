package bsh;

import java.util.function.Supplier;

/* JADX INFO: renamed from: bsh.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0351h implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1001a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bsh.Interpreter.<clinit>():void, bsh.This.<clinit>():void] */
    public /* synthetic */ C0351h(int i9) {
        this.f1001a = i9;
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.Interpreter.a():java.lang.Boolean */
    /* JADX DEBUG: Class process forced to load method for inline: bsh.This.b():java.util.Map */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f1001a) {
            case 0:
                return Boolean.FALSE;
            default:
                return This.lambda$static$1();
        }
    }
}
