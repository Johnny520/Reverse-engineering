package me.yun.fkwechat.loader.driver;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Member;
import java.util.concurrent.ConcurrentHashMap;
import md.InterfaceC5153h;
import md.InterfaceC5155j;
import p010a9.InterfaceC0184l;
import p172l8.C4700i0;

/* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.c */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5182c implements InterfaceC5155j {

    /* JADX INFO: renamed from: a */
    public final XposedInterface f15800a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f15801b;

    static {
        FkwLoader.registerNativesForClass(27, C5182c.class);
        Hidden0.special_clinit_27_00(C5182c.class);
    }

    public C5182c(XposedInterface xposedInterface) {
        xposedInterface.getClass();
        this.f15800a = xposedInterface;
        this.f15801b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static native Object m21250c(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, XposedInterface.Chain chain);

    /* JADX INFO: renamed from: d */
    public static native C4700i0 m21251d(InterfaceC0184l interfaceC0184l, XposedInterface.Chain chain);

    @Override // md.InterfaceC5155j
    public native InterfaceC5153h hook(Member member, String str, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2);

    @Override // md.InterfaceC5155j
    public native InterfaceC5153h hookReplace(Member member, String str, InterfaceC0184l interfaceC0184l);

    @Override // md.InterfaceC5155j
    public native void log(int i10, String str, String str2);

    @Override // md.InterfaceC5155j
    public native void replaceHook(String str, InterfaceC0184l interfaceC0184l);

    @Override // md.InterfaceC5155j
    public native void unhook(String str);
}
