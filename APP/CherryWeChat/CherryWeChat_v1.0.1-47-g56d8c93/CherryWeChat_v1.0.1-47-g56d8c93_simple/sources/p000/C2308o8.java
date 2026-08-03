package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2308o8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f8089c;

    public /* synthetic */ C2308o8(String r1, int r2, int r3) {
        this.f8087a = r3;
        this.f8088b = r1;
        this.f8089c = r2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f8087a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        String r0 = this.f8088b;
        return CherryViewAPI.m3252F0(this.f8089c, r0);
    L6:
        String r02 = this.f8088b;
        return CherryGlobalAPI.m3097h(this.f8089c, r02);
    L8:
        String r03 = this.f8088b;
        return CherryGlobalAPI.m3114y(this.f8089c, r03);
    L10:
        String r04 = this.f8088b;
        return CherryAPI.m3022g(this.f8089c, r04);
    }
}
