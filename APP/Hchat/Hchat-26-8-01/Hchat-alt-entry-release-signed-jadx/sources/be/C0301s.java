package be;

import bsh.Reflect;
import java.io.Serializable;
import java.util.function.IntFunction;
import p302ud.C4311g;

/* JADX INFO: renamed from: be.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0301s implements IntFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Serializable f870b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0301s(int i9, Serializable serializable) {
        this.f869a = i9;
        this.f870b = serializable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.IntFunction
    public final Object apply(int i9) {
        switch (this.f869a) {
            case 0:
                return ((C4311g[]) this.f870b)[i9];
            default:
                return Reflect.lambda$getEnumConstants$8((Class) this.f870b, i9);
        }
    }
}
