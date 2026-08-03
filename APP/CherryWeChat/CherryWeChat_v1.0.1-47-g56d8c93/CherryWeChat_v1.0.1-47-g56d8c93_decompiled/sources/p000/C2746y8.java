package p000;

import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.MessageAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: y8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2746y8 implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1416fj f9375b;

    public /* synthetic */ C2746y8(InterfaceC1416fj interfaceC1416fj, int i) {
        this.f9374a = i;
        this.f9375b = interfaceC1416fj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f9374a) {
            case 0:
                return CherryMessageAPI.register$lambda$16$lambda$15((C2703x8) this.f9375b, obj);
            default:
                return MessageAPI.register$lambda$14$lambda$13((C2703x8) this.f9375b, obj);
        }
    }
}
