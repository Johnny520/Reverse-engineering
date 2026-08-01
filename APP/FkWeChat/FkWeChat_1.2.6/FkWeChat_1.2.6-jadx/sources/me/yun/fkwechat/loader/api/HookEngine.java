package me.yun.fkwechat.loader.api;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import java.lang.reflect.Member;
import kotlin.Metadata;
import md.InterfaceC5153h;
import md.InterfaceC5154i;
import md.InterfaceC5155j;
import md.InterfaceC5156k;
import okhttp3.internal.url._UrlKt;
import p172l8.C4700i0;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\rJ!\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\nJ)\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\nJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J+\u0010\u001b\u001a\u00020\u00102\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00102\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010\u001e\u001a\u00020\u00102\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m16758d2 = {"Lme/yun/fkwechat/loader/api/HookEngine;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Ljava/lang/reflect/Member;", "member", "Lmd/k;", "callback", "Lmd/h;", "hookBefore", "(Ljava/lang/reflect/Member;Lmd/k;)Lmd/h;", _UrlKt.FRAGMENT_ENCODE_SET, "id", "(Ljava/lang/reflect/Member;Ljava/lang/String;Lmd/k;)Lmd/h;", "hookAfter", "hookReplace", "Ll8/i0;", "replaceHook", "(Ljava/lang/String;Lmd/k;)V", "unhook", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "clazz", "methodName", "hookMethodBefore", "(Ljava/lang/Class;Ljava/lang/String;Lmd/k;)Lmd/h;", "hookMethodAfter", "hookAllMethodsBefore", "(Ljava/lang/Class;Ljava/lang/String;Lmd/k;)V", "hookAllMethodsAfter", "hookAllConstructorsBefore", "(Ljava/lang/Class;Lmd/k;)V", "Lmd/j;", "provider", "Lmd/j;", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class HookEngine {
    public static final int $stable = 0;
    public static final HookEngine INSTANCE = null;
    public static InterfaceC5155j provider;

    static {
        FkwLoader.registerNativesForClass(19, HookEngine.class);
        Hidden0.special_clinit_19_00(HookEngine.class);
    }

    private HookEngine() {
    }

    /* JADX INFO: renamed from: a */
    public static native C4700i0 m21243a(InterfaceC5156k interfaceC5156k, InterfaceC5154i interfaceC5154i);

    /* JADX INFO: renamed from: b */
    public static native C4700i0 m21244b(InterfaceC5156k interfaceC5156k, InterfaceC5154i interfaceC5154i);

    /* JADX INFO: renamed from: c */
    public static native C4700i0 m21245c(InterfaceC5156k interfaceC5156k, InterfaceC5154i interfaceC5154i);

    /* JADX INFO: renamed from: d */
    public static native Object m21246d(InterfaceC5156k interfaceC5156k, InterfaceC5154i interfaceC5154i);

    /* JADX INFO: renamed from: e */
    public static native C4700i0 m21247e(InterfaceC5156k interfaceC5156k, InterfaceC5154i interfaceC5154i);

    /* JADX INFO: renamed from: f */
    public static native Object m21248f(InterfaceC5156k interfaceC5156k, InterfaceC5154i interfaceC5154i);

    /* JADX INFO: renamed from: g */
    public static native Object m21249g(InterfaceC5156k interfaceC5156k, InterfaceC5154i interfaceC5154i);

    public static final native InterfaceC5153h hookAfter(Member member, String id2, InterfaceC5156k callback);

    public static final native InterfaceC5153h hookAfter(Member member, InterfaceC5156k callback);

    public static final native void hookAllConstructorsBefore(Class<?> clazz, InterfaceC5156k callback);

    public static final native void hookAllMethodsAfter(Class<?> clazz, String methodName, InterfaceC5156k callback);

    public static final native void hookAllMethodsBefore(Class<?> clazz, String methodName, InterfaceC5156k callback);

    public static final native InterfaceC5153h hookBefore(Member member, String id2, InterfaceC5156k callback);

    public static final native InterfaceC5153h hookBefore(Member member, InterfaceC5156k callback);

    public static final native InterfaceC5153h hookMethodAfter(Class<?> clazz, String methodName, InterfaceC5156k callback);

    public static final native InterfaceC5153h hookMethodBefore(Class<?> clazz, String methodName, InterfaceC5156k callback);

    public static final native InterfaceC5153h hookReplace(Member member, String id2, InterfaceC5156k callback);

    public static final native InterfaceC5153h hookReplace(Member member, InterfaceC5156k callback);

    public static final native void replaceHook(String id2, InterfaceC5156k callback);

    public static final native void unhook(String id2);
}
