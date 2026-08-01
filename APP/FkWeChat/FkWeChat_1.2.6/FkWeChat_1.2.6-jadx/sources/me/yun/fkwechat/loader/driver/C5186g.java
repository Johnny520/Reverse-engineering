package me.yun.fkwechat.loader.driver;

import de.robv.android.xposed.XC_MethodHook;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import md.InterfaceC5154i;

/* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.g */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5186g implements InterfaceC5154i {

    /* JADX INFO: renamed from: a */
    public final XC_MethodHook.MethodHookParam f15817a;

    static {
        FkwLoader.registerNativesForClass(35, C5186g.class);
        Hidden0.special_clinit_35_70(C5186g.class);
    }

    public C5186g(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.getClass();
        this.f15817a = methodHookParam;
    }

    @Override // md.InterfaceC5154i
    public native /* bridge */ Object arg(int i10);

    @Override // md.InterfaceC5154i
    public native Object[] getArgs();

    @Override // md.InterfaceC5154i
    public native Object getResult();

    @Override // md.InterfaceC5154i
    public native Object getThisObject();

    @Override // md.InterfaceC5154i
    public native /* bridge */ void setArg(int i10, Object obj);

    @Override // md.InterfaceC5154i
    public native void setResult(Object obj);
}
