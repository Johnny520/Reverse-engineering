package p000;

import io.github.cherrywechat.lua.bridge.JavaImporter;
import java.util.List;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: Zl */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1102Zl implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f3493b;

    public /* synthetic */ C1102Zl(int i, List list) {
        this.f3492a = i;
        this.f3493b = list;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f3492a) {
            case 0:
                return JavaImporter.register$lambda$0(this.f3493b, lua);
            case 1:
                return JavaImporter.registerLuaJavaNamespace$lambda$9(this.f3493b, lua);
            case 2:
                return JavaImporter.registerLuaJavaNamespace$lambda$11(this.f3493b, lua);
            default:
                return JavaImporter.registerLuaJavaNamespace$lambda$12(this.f3493b, lua);
        }
    }
}
