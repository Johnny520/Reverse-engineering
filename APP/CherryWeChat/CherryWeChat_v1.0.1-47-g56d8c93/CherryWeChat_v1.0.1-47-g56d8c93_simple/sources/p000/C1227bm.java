package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.bridge.JavaImporter;
import kotlin.jvm.functions.Function2;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: bm */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1227bm implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4191b;

    public /* synthetic */ C1227bm(int r1, Object r2) {
        this.f4190a = r1;
        this.f4191b = r2;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua r2) {
        switch(this.f4190a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return CherryAPI.m2998L((Function2) this.f4191b, r2);
    L7:
        return JavaImporter.m3510b((Class) this.f4191b, r2);
    L9:
        return JavaImporter.m3515g((Class) this.f4191b, r2);
    L11:
        return JavaImporter.m3514f((Class) this.f4191b, r2);
    }
}
