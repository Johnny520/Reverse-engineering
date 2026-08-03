package io.github.cherrywechat.lua.api;

import io.github.cherrywechat.lua.api.CherryThreadAPI;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.github.cherrywechat.lua.api.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1555a implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CherryThreadAPI.LuaTaskRef f5553b;

    public /* synthetic */ C1555a(CherryThreadAPI.LuaTaskRef luaTaskRef, int i) {
        this.f5552a = i;
        this.f5553b = luaTaskRef;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f5552a) {
            case 0:
                return CherryThreadAPI.register$lambda$26$lambda$25$lambda$24(this.f5553b);
            case 1:
                return CherryThreadAPI.register$lambda$26$lambda$25(this.f5553b);
            case 2:
                return CherryThreadAPI.register$lambda$31$lambda$30$lambda$29$lambda$28(this.f5553b);
            case 3:
                return CherryThreadAPI.cleanupFor$lambda$43$lambda$42$lambda$41(this.f5553b);
            case 4:
                return CherryThreadAPI.register$lambda$23$lambda$22$lambda$21$lambda$20(this.f5553b);
            case 5:
                return CherryThreadAPI.register$lambda$23$lambda$22$lambda$21(this.f5553b);
            default:
                return CherryThreadAPI.cleanup$lambda$47$lambda$46$lambda$45(this.f5553b);
        }
    }
}
