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

    public /* synthetic */ C1555a(CherryThreadAPI.LuaTaskRef r1, int r2) {
        this.f5552a = r2;
        this.f5553b = r1;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f5552a) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            default: goto L5;
        };
    L5:
        return CherryThreadAPI.m3194i(this.f5553b);
    L7:
        return CherryThreadAPI.m3185M(this.f5553b);
    L9:
        return CherryThreadAPI.m3177E(this.f5553b);
    L11:
        return CherryThreadAPI.m3196k(this.f5553b);
    L13:
        return CherryThreadAPI.m3195j(this.f5553b);
    L15:
        return CherryThreadAPI.m3208w(this.f5553b);
    L17:
        return CherryThreadAPI.m3201p(this.f5553b);
    }
}
