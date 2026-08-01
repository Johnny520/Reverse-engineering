package me.yun.fkwechat.loader.driver;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import java.lang.reflect.Member;
import java.util.concurrent.ConcurrentHashMap;
import md.InterfaceC5153h;
import md.InterfaceC5155j;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.d */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5183d implements InterfaceC5155j {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f15802a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.d$a */
    /* JADX INFO: compiled from: Dex2C */
    public static final class a implements InterfaceC5153h {

        /* JADX INFO: renamed from: a */
        public final XC_MethodHook f15803a;

        /* JADX INFO: renamed from: b */
        public final Member f15804b;

        static {
            FkwLoader.registerNativesForClass(28, a.class);
            Hidden0.special_clinit_28_40(a.class);
        }

        public a(XC_MethodHook xC_MethodHook, Member member) {
            xC_MethodHook.getClass();
            member.getClass();
            this.f15803a = xC_MethodHook;
            this.f15804b = member;
        }

        /* JADX INFO: renamed from: a */
        public final native Member m21252a();

        /* JADX INFO: renamed from: b */
        public final native XC_MethodHook m21253b();

        @Override // md.InterfaceC5153h
        public native void unhook();
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.d$b */
    /* JADX INFO: compiled from: Dex2C */
    public static final class b extends XC_MethodHook {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0184l f15805a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0184l f15806b;

        static {
            FkwLoader.registerNativesForClass(29, b.class);
            Hidden0.special_clinit_29_30(b.class);
        }

        public b(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
            this.f15805a = interfaceC0184l;
            this.f15806b = interfaceC0184l2;
        }

        public native void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam);

        public native void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.d$c */
    /* JADX INFO: compiled from: Dex2C */
    public static final class c extends XC_MethodReplacement {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0184l f15807a;

        static {
            FkwLoader.registerNativesForClass(30, c.class);
            Hidden0.special_clinit_30_20(c.class);
        }

        public c(InterfaceC0184l interfaceC0184l) {
            this.f15807a = interfaceC0184l;
        }

        public native Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.loader.driver.d$d */
    /* JADX INFO: compiled from: Dex2C */
    public static final class d extends XC_MethodReplacement {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0184l f15808a;

        static {
            FkwLoader.registerNativesForClass(31, d.class);
            Hidden0.special_clinit_31_20(d.class);
        }

        public d(InterfaceC0184l interfaceC0184l) {
            this.f15808a = interfaceC0184l;
        }

        public native Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam);
    }

    static {
        FkwLoader.registerNativesForClass(32, C5183d.class);
        Hidden0.special_clinit_32_00(C5183d.class);
    }

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
