package fun.box001.internal.hookbackend.xposed;

import android.util.Log;
import com.shooker.SHooker;
import fun.box001.internal.hookbackend.HookRecord;
import fun.box001.shared.hook.XHooker;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes.dex */
public final class SHookerHookBackend extends XHooker {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentHashMap f831a = null;

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap f832b = null;

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f833c = null;

    static {
        f831a = new ConcurrentHashMap();
        f832b = new ConcurrentHashMap();
        f833c = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    static Object m543a(HookRecord r18, Object r19, Object[] r20) {
        Object[] r10 = new Object[1];
        boolean[] r11 = new boolean[1];
        Throwable[] r12 = new Throwable[1];
        ConcurrentHashMap r0 = f831a;
        boolean r4 = r0.containsKey(r18.f818a);
        Member r14 = r18.f818a;
        if (r4 == false) goto L16;
        ArrayList r15 = (ArrayList) r0.get(r14);
        if (r15 == null) goto L16;
        Iterator r16 = r15.iterator();
    L8:
        if (r16.hasNext() == false) goto L16;
        XHooker.HookCallback r02 = (XHooker.HookCallback) r16.next();
        ArrayList r17 = r15;
        C0215d r9 = new C0215d(r11, r10, r15, r02, r12);
        r9.args = r20;
        r9.method = r14;
        r9.obj = r19;
        r02.onInvoke(r9);     // Catch: Throwable -> L12
    L14:
        r15 = r17;
    L12:
        th = move-exception;
        XHooker.log("[FunBox]" + Log.getStackTraceString(th));
    L16:
        if (r11[0] == false) goto L38;
    L21:
        ConcurrentHashMap r03 = f832b;
        if (r03.containsKey(r14) == false) goto L33;
        ArrayList r1 = (ArrayList) r03.get(r14);
        if (r1 == null) goto L33;
        Iterator r5 = r1.iterator();
    L27:
        if (r5.hasNext() == false) goto L33;
        XHooker.HookCallback r04 = (XHooker.HookCallback) r5.next();
        C0216e r6 = new C0216e(r10, r1, r04, r12);
        r6.args = r20;
        r6.method = r14;
        r6.obj = r19;
        r04.onInvoke(r6);     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        XHooker.log("[FunBox]" + Log.getStackTraceString(th));
    L33:
        Throwable r05 = r12[0];
        if (r05 == null) goto L36;
        throw r05;
    L36:
        return r10[0];
    L38:
        HashMap r06 = SHooker.f59a;     // Catch: Throwable -> L19
        r10[0] = r18.f819b.invoke(r19, r20);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r12[0] = th;
        goto L21
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void decompile0(Member r4) {
        HashMap r0 = SHooker.f59a;
        if (Modifier.isAbstract(r4.getModifiers()) == true) goto L7;
        SHooker._deoptimize(r4);
        return;
    L7:
        throw new IllegalArgumentException("Cannot deoptimize abstract methods: " + r4);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookAfterImpl(Member r4, XHooker.HookCallback r5) {
        ConcurrentHashMap r0 = f833c;
        if (r0.containsKey(Integer.valueOf(r4.hashCode())) == true) goto L5;
        r0.put(Integer.valueOf(r4.hashCode()), SHooker.m68a(r4, new C0214c()));
    L5:
        ((ArrayList) f832b.computeIfAbsent(r4, new C0212a(0))).add(r5);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookBeforeImpl(Member r4, XHooker.HookCallback r5) {
        ConcurrentHashMap r0 = f833c;
        if (r0.containsKey(Integer.valueOf(r4.hashCode())) == true) goto L5;
        r0.put(Integer.valueOf(r4.hashCode()), SHooker.m68a(r4, new C0213b()));
    L5:
        ((ArrayList) f831a.computeIfAbsent(r4, new C0212a(1))).add(r5);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final Object invokeImpl(Member r3, Object r4, Object[] r5) {
        ConcurrentHashMap r0 = f833c;
        if (r0.containsKey(Integer.valueOf(r3.hashCode())) == false) goto L7;
        HookRecord r32 = (HookRecord) r0.get(Integer.valueOf(r3.hashCode()));
        HashMap r02 = SHooker.f59a;
        return r32.f819b.invoke(r4, r5);
    L7:
        return ((Method) r3).invoke(r4, r5);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void logImpl(String r2) {
        Log.i("[FunBox]", r2);
    }
}
