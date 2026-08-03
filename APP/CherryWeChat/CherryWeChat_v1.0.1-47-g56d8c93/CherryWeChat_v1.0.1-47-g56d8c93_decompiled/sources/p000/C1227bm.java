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

    public /* synthetic */ C1227bm(int i, Object obj) {
        this.f4190a = i;
        this.f4191b = obj;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f4190a) {
            case 0:
                return JavaImporter.pushClassWrapper$lambda$3((Class) this.f4191b, lua);
            case 1:
                return JavaImporter.pushClassWrapper$lambda$5((Class) this.f4191b, lua);
            case 2:
                return JavaImporter.pushClassWrapper$lambda$6((Class) this.f4191b, lua);
            default:
                return CherryAPI.registerLogApi$lambda$6$lambda$5((Function2) this.f4191b, lua);
        }
    }
}
