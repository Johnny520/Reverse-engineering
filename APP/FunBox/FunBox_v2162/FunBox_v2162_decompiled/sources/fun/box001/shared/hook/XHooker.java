package fun.box001.shared.hook;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public abstract class XHooker {
    private static XHooker instance;

    public interface HookCallback {
        void onInvoke(HookParam hookParam);
    }

    public static abstract class HookParam {
        public Object[] args;
        public Member method;
        public Object obj;

        public abstract Object getResult();

        public abstract Throwable getThrowable();

        public abstract void setResult(Object obj);

        public abstract void setThrowable(Throwable th);

        public abstract void unhook();
    }

    public static void decompile(Member member) {
        instance.decompile0(member);
    }

    public static void hookAfter(Member member, HookCallback hookCallback) {
        instance.hookAfterImpl(member, hookCallback);
    }

    public static void hookBefore(Member member, HookCallback hookCallback) {
        instance.hookBeforeImpl(member, hookCallback);
    }

    public static Object invoke(Member member, Object obj, Object[] objArr) {
        return instance.invokeImpl(member, obj, objArr);
    }

    public static void log(Object obj) {
        instance.logImpl(String.valueOf(obj));
    }

    public static void setImpl(XHooker xHooker) {
        instance = xHooker;
    }

    protected abstract void decompile0(Member member);

    protected abstract void hookAfterImpl(Member member, HookCallback hookCallback);

    protected abstract void hookBeforeImpl(Member member, HookCallback hookCallback);

    protected abstract Object invokeImpl(Member member, Object obj, Object[] objArr);

    protected abstract void logImpl(String str);
}
