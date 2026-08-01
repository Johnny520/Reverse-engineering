package com.p001mr.elaris.xposedcompat;

import com.p001mr.elaris.xposedcompat.callbacks.XCallback;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class XC_MethodHook extends XCallback {

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class MethodHookParam extends XCallback.Param {
        public Object[] args;
        public Member method;
        private Object result;
        private boolean returnEarly;
        public Object thisObject;
        private Throwable throwable;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void clearReturnEarly() {
            this.returnEarly = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Object getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Object getResultOrThrowable() throws Throwable {
            Throwable th = this.throwable;
            if (th == null) {
                return this.result;
            }
            throw th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean hasThrowable() {
            return this.throwable != null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setResult(Object obj) {
            this.result = obj;
            this.throwable = null;
            this.returnEarly = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setThrowable(Throwable th) {
            this.throwable = th;
            this.result = null;
            this.returnEarly = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean shouldReturnEarly() {
            return this.returnEarly;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static class Unhook {
        private final XC_MethodHook callback;
        private final Member hookedMethod;
        private final Runnable unhookAction;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Unhook(Member member, XC_MethodHook xC_MethodHook, Runnable runnable) {
            this.hookedMethod = member;
            this.callback = xC_MethodHook;
            this.unhookAction = runnable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public XC_MethodHook getCallback() {
            return this.callback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Member getHookedMethod() {
            return this.hookedMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void unhook() {
            Runnable runnable = this.unhookAction;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public XC_MethodHook() {
    }

    public XC_MethodHook(int i) {
        super(i);
    }

    public void afterHookedMethod(MethodHookParam methodHookParam) {
    }

    public void beforeHookedMethod(MethodHookParam methodHookParam) {
    }
}
