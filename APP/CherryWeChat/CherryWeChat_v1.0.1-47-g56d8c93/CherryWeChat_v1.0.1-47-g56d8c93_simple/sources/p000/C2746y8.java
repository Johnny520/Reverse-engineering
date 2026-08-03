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

    public /* synthetic */ C2746y8(InterfaceC1416fj r1, int r2) {
        this.f9374a = r2;
        this.f9375b = r1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object r2) {
        switch(this.f9374a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return MessageAPI.m3435A((C2703x8) this.f9375b, r2);
    L7:
        return CherryMessageAPI.m3123e((C2703x8) this.f9375b, r2);
    }
}
