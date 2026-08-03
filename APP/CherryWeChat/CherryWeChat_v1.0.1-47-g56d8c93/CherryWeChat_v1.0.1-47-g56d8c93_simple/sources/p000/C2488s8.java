package p000;

import io.github.cherrywechat.lua.dev.CherryDevServer;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2488s8 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8750b;

    public /* synthetic */ C2488s8(String r1, int r2) {
        this.f8749a = r2;
        this.f8750b = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r3) {
        switch(this.f8749a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-576857057523765L);
        return Boolean.valueOf(((String) r3).equals(this.f8750b));
    L7:
        return CherryDevServer.m3519b(this.f8750b, (C0340Hw) r3);
    }
}
