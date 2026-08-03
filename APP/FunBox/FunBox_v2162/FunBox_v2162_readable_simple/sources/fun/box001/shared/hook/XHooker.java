package fun.box001.shared.hook;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public abstract class XHooker {
    private static XHooker instance;

    public interface HookCallback {
        void onInvoke(HookParam r1);
    }

    public static abstract class HookParam {
        public Object[] args;
        public Member method;
        public Object obj;

        public HookParam() {
        }

        public abstract Object getResult();

        public abstract Throwable getThrowable();

        public abstract void setResult(Object r1);

        public abstract void setThrowable(Throwable r1);

        public abstract void unhook();
    }

    public XHooker() {
    }

    public static void decompile(Member r1) {
        instance.decompile0(r1);
    }

    public static void hookAfter(Member r1, HookCallback r2) {
        instance.hookAfterImpl(r1, r2);
    }

    public static void hookBefore(Member r1, HookCallback r2) {
        instance.hookBeforeImpl(r1, r2);
    }

    public static Object invoke(Member r1, Object r2, Object[] r3) {
        return instance.invokeImpl(r1, r2, r3);
    }

    public static void log(Object r1) {
        instance.logImpl(String.valueOf(r1));
    }

    public static void setImpl(XHooker r0) {
        instance = r0;
    }

    protected abstract void decompile0(Member r1);

    protected abstract void hookAfterImpl(Member r1, HookCallback r2);

    protected abstract void hookBeforeImpl(Member r1, HookCallback r2);

    protected abstract Object invokeImpl(Member r1, Object r2, Object[] r3);

    protected abstract void logImpl(String r1);
}
