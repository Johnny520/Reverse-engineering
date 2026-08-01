package me.yun.fkwechat.loader.driver;

import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import md.InterfaceC5153h;
import md.InterfaceC5154i;
import md.InterfaceC5155j;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0004\"#$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, m16758d2 = {"Lme/yun/fkwechat/loader/driver/HookProviderZygisk;", "Lmd/j;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "priority", _UrlKt.FRAGMENT_ENCODE_SET, "tag", "msg", "Ll8/i0;", "log", "(ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/reflect/Member;", "member", "id", "Lkotlin/Function1;", "Lmd/i;", "before", "after", "Lmd/h;", "hook", "(Ljava/lang/reflect/Member;Ljava/lang/String;La9/l;La9/l;)Lmd/h;", _UrlKt.FRAGMENT_ENCODE_SET, "replace", "hookReplace", "(Ljava/lang/reflect/Member;Ljava/lang/String;La9/l;)Lmd/h;", "replaceHook", "(Ljava/lang/String;La9/l;)V", "unhook", "(Ljava/lang/String;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Lme/yun/fkwechat/loader/driver/HookProviderZygisk$ZygiskHookHandle;", "handles", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "ZygiskHookEntry", "ZygiskHookHandle", "ZygiskHookParam", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class HookProviderZygisk implements InterfaceC5155j {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = null;
    private final ConcurrentHashMap<String, ZygiskHookHandle> handles = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0087 J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\fH\u0087 J\b\u0010\r\u001a\u00020\u0005H\u0007¨\u0006\u000e"}, m16758d2 = {"Lme/yun/fkwechat/loader/driver/HookProviderZygisk$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "nativeInitLSPlant", _UrlKt.FRAGMENT_ENCODE_SET, "nativeHook", "targetMethod", "Ljava/lang/reflect/Executable;", "hookerObject", "isStatic", "nativeUnhook", "Ljava/lang/reflect/Method;", "initLSPlant", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
    public static final class Companion {
        static {
            FkwLoader.registerNativesForClass(20, Companion.class);
            Hidden0.special_clinit_20_60(Companion.class);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final native boolean initLSPlant();

        public final native boolean nativeHook(Executable targetMethod, Object hookerObject, boolean isStatic);

        public final native boolean nativeInitLSPlant();

        public final native boolean nativeUnhook(Method targetMethod);
    }

    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0018"}, m16758d2 = {"Lme/yun/fkwechat/loader/driver/HookProviderZygisk$ZygiskHookEntry;", _UrlKt.FRAGMENT_ENCODE_SET, "Lkotlin/Function1;", "Lmd/i;", "Ll8/i0;", "before", "after", "replace", "Ljava/lang/reflect/Method;", "backup", _UrlKt.FRAGMENT_ENCODE_SET, "isStatic", "Ljava/lang/reflect/Member;", "member", "<init>", "(La9/l;La9/l;La9/l;Ljava/lang/reflect/Method;ZLjava/lang/reflect/Member;)V", _UrlKt.FRAGMENT_ENCODE_SET, "rawArgs", "callback", "([Ljava/lang/Object;)Ljava/lang/Object;", "La9/l;", "Ljava/lang/reflect/Method;", "Z", "Ljava/lang/reflect/Member;", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
    public static final class ZygiskHookEntry {
        public static final int $stable = 8;
        private final InterfaceC0184l after;
        public Method backup;
        private final InterfaceC0184l before;
        private final boolean isStatic;
        private final Member member;
        private final InterfaceC0184l replace;

        static {
            FkwLoader.registerNativesForClass(21, ZygiskHookEntry.class);
            Hidden0.special_clinit_21_00(ZygiskHookEntry.class);
        }

        public ZygiskHookEntry(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, Method method, boolean z10, Member member) {
            member.getClass();
            this.before = interfaceC0184l;
            this.after = interfaceC0184l2;
            this.replace = interfaceC0184l3;
            this.backup = method;
            this.isStatic = z10;
            this.member = member;
        }

        public final native Object callback(Object[] rawArgs);
    }

    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, m16758d2 = {"Lme/yun/fkwechat/loader/driver/HookProviderZygisk$ZygiskHookHandle;", "Lmd/h;", "Lme/yun/fkwechat/loader/driver/HookProviderZygisk$ZygiskHookEntry;", "entry", "Ljava/lang/reflect/Method;", "method", "<init>", "(Lme/yun/fkwechat/loader/driver/HookProviderZygisk$ZygiskHookEntry;Ljava/lang/reflect/Method;)V", "Ll8/i0;", "unhook", "()V", "Lme/yun/fkwechat/loader/driver/HookProviderZygisk$ZygiskHookEntry;", "Ljava/lang/reflect/Method;", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
    public static final class ZygiskHookHandle implements InterfaceC5153h {
        public static final int $stable = 8;
        private final ZygiskHookEntry entry;
        private final Method method;

        static {
            FkwLoader.registerNativesForClass(22, ZygiskHookHandle.class);
            Hidden0.special_clinit_22_00(ZygiskHookHandle.class);
        }

        public ZygiskHookHandle(ZygiskHookEntry zygiskHookEntry, Method method) {
            this.entry = zygiskHookEntry;
            this.method = method;
        }

        @Override // md.InterfaceC5153h
        public native void unhook();
    }

    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u000bR\u0014\u0010$\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016¨\u0006%"}, m16758d2 = {"Lme/yun/fkwechat/loader/driver/HookProviderZygisk$ZygiskHookParam;", "Lmd/i;", _UrlKt.FRAGMENT_ENCODE_SET, "thisObject", _UrlKt.FRAGMENT_ENCODE_SET, "args", "<init>", "(Ljava/lang/Object;[Ljava/lang/Object;)V", "value", "Ll8/i0;", "setResultInternal", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getThisObject", "()Ljava/lang/Object;", "[Ljava/lang/Object;", "getArgs", "()[Ljava/lang/Object;", "_result", _UrlKt.FRAGMENT_ENCODE_SET, "isResultSet", "Z", "()Z", "setResultSet", "(Z)V", _UrlKt.FRAGMENT_ENCODE_SET, "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "getResult", "setResult", "result", "getHasThrowable", "hasThrowable", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
    public static final class ZygiskHookParam implements InterfaceC5154i {
        private Object _result;
        private final Object[] args;
        private boolean isResultSet;
        private final Object thisObject;
        private Throwable throwable;

        static {
            FkwLoader.registerNativesForClass(23, ZygiskHookParam.class);
            Hidden0.special_clinit_23_140(ZygiskHookParam.class);
        }

        public ZygiskHookParam(Object obj, Object[] objArr) {
            objArr.getClass();
            this.thisObject = obj;
            this.args = objArr;
        }

        @Override // md.InterfaceC5154i
        public native /* bridge */ <T> T arg(int i10);

        @Override // md.InterfaceC5154i
        public native Object[] getArgs();

        public native boolean getHasThrowable();

        @Override // md.InterfaceC5154i
        public native Object getResult();

        @Override // md.InterfaceC5154i
        public native Object getThisObject();

        public native Throwable getThrowable();

        public final native boolean isResultSet();

        @Override // md.InterfaceC5154i
        public native /* bridge */ void setArg(int i10, Object obj);

        @Override // md.InterfaceC5154i
        public native void setResult(Object obj);

        public final native void setResultInternal(Object value);

        public final native void setResultSet(boolean z10);

        public native void setThrowable(Throwable th);

        @Override // md.InterfaceC5154i
        public native /* bridge */ void skipWith(Object obj);
    }

    static {
        FkwLoader.registerNativesForClass(24, HookProviderZygisk.class);
        Hidden0.special_clinit_24_00(HookProviderZygisk.class);
    }

    public static final native boolean initLSPlant();

    public static final native boolean nativeHook(Executable executable, Object obj, boolean z10);

    public static final native boolean nativeInitLSPlant();

    public static final native boolean nativeUnhook(Method method);

    @Override // md.InterfaceC5155j
    public native InterfaceC5153h hook(Member member, String id2, InterfaceC0184l before, InterfaceC0184l after);

    @Override // md.InterfaceC5155j
    public native InterfaceC5153h hookReplace(Member member, String id2, InterfaceC0184l replace);

    @Override // md.InterfaceC5155j
    public native void log(int priority, String tag, String msg);

    @Override // md.InterfaceC5155j
    public native void replaceHook(String id2, InterfaceC0184l replace);

    @Override // md.InterfaceC5155j
    public native void unhook(String id2);
}
