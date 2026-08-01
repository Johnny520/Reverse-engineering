package p000;

import io.github.libxposed.service.XposedService;
import java.util.function.Function;

/* JADX INFO: renamed from: ye */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0555ye implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1116b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0555ye(int i, Object obj) {
        this.f1115a = i;
        this.f1116b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f1115a;
        Object obj2 = this.f1116b;
        switch (i) {
            case 0:
                return ((XposedService) obj2).lambda$getRemotePreferences$0((String) obj);
            default:
                return ((XposedService.OnScopeEventListener) obj2).lambda$asInterface$0((XposedService.OnScopeEventListener) obj);
        }
    }
}
