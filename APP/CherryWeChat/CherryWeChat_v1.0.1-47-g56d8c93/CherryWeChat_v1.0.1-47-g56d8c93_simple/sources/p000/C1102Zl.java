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

    public /* synthetic */ C1102Zl(int r1, List r2) {
        this.f3492a = r1;
        this.f3493b = r2;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua r2) {
        switch(this.f3492a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return JavaImporter.m3511c(this.f3493b, r2);
    L7:
        return JavaImporter.m3516h(this.f3493b, r2);
    L9:
        return JavaImporter.m3509a(this.f3493b, r2);
    L11:
        return JavaImporter.m3513e(this.f3493b, r2);
    }
}
