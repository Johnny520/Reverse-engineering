package p000;

import io.github.cherrywechat.lua.dev.CherryDevServer;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2488s8 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8750b;

    public /* synthetic */ C2488s8(String str, int i) {
        this.f8749a = i;
        this.f8750b = str;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        switch (this.f8749a) {
            case 0:
                return CherryDevServer.handleScriptUpload$lambda$16$lambda$15(this.f8750b, (C0340Hw) obj);
            default:
                AbstractC0295Gu.m625r(-576857057523765L);
                return Boolean.valueOf(((String) obj).equals(this.f8750b));
        }
    }
}
