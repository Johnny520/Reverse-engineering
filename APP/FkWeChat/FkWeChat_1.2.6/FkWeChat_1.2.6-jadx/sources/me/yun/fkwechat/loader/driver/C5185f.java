package me.yun.fkwechat.loader.driver;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import io.github.libxposed.api.XposedInterface;
import md.InterfaceC5153h;

/* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.f */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5185f implements InterfaceC5153h {

    /* JADX INFO: renamed from: a */
    public final XposedInterface.HookHandle f15816a;

    static {
        FkwLoader.registerNativesForClass(34, C5185f.class);
        Hidden0.special_clinit_34_30(C5185f.class);
    }

    public C5185f(XposedInterface.HookHandle hookHandle) {
        this.f15816a = hookHandle;
    }

    /* JADX INFO: renamed from: a */
    public final native XposedInterface.HookHandle m21258a();

    @Override // md.InterfaceC5153h
    public native void unhook();
}
