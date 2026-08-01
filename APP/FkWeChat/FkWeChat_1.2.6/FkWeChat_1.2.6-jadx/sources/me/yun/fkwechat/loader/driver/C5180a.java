package me.yun.fkwechat.loader.driver;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import io.github.libxposed.api.XposedInterface;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.a */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5180a implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f15797a;

    static {
        FkwLoader.registerNativesForClass(25, C5180a.class);
        Hidden0.special_clinit_25_20(C5180a.class);
    }

    public final native Object intercept(XposedInterface.Chain chain);
}
