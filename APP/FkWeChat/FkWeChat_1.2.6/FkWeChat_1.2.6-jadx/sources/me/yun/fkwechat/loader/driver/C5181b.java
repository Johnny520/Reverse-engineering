package me.yun.fkwechat.loader.driver;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import io.github.libxposed.api.XposedInterface;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.b */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5181b implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f15798a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f15799b;

    static {
        FkwLoader.registerNativesForClass(26, C5181b.class);
        Hidden0.special_clinit_26_20(C5181b.class);
    }

    public /* synthetic */ C5181b(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        this.f15798a = interfaceC0184l;
        this.f15799b = interfaceC0184l2;
    }

    public final native Object intercept(XposedInterface.Chain chain);
}
