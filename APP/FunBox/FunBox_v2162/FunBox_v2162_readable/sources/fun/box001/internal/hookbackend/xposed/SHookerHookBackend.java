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
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: p.f */
/* JADX INFO: loaded from: classes.dex */
public final class SHookerHookBackend extends XHooker {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentHashMap f831a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap f832b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f833c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    static Object m543a(HookRecord hookRecord, Object obj, Object[] objArr) throws Throwable {
        ArrayList<XHooker.HookCallback> arrayList;
        ArrayList<XHooker.HookCallback> arrayList2;
        Object[] objArr2 = new Object[1];
        boolean[] zArr = new boolean[1];
        Throwable[] thArr = new Throwable[1];
        ConcurrentHashMap concurrentHashMap = f831a;
        boolean zContainsKey = concurrentHashMap.containsKey(hookRecord.f818a);
        Member member = hookRecord.f818a;
        if (zContainsKey && (arrayList2 = (ArrayList) concurrentHashMap.get(member)) != null) {
            for (XHooker.HookCallback hookCallback : arrayList2) {
                ArrayList arrayList3 = arrayList2;
                C0215d c0215d = new C0215d(zArr, objArr2, arrayList2, hookCallback, thArr);
                c0215d.args = objArr;
                c0215d.method = member;
                c0215d.obj = obj;
                try {
                    hookCallback.onInvoke(c0215d);
                } catch (Throwable th) {
                    XHooker.log("[FunBox]" + Log.getStackTraceString(th));
                }
                arrayList2 = arrayList3;
            }
        }
        if (!zArr[0]) {
            try {
                HashMap map = SHooker.f59a;
                objArr2[0] = hookRecord.f819b.invoke(obj, objArr);
            } catch (Throwable th2) {
                thArr[0] = th2;
            }
        }
        ConcurrentHashMap concurrentHashMap2 = f832b;
        if (concurrentHashMap2.containsKey(member) && (arrayList = (ArrayList) concurrentHashMap2.get(member)) != null) {
            for (XHooker.HookCallback hookCallback2 : arrayList) {
                C0216e c0216e = new C0216e(objArr2, arrayList, hookCallback2, thArr);
                c0216e.args = objArr;
                c0216e.method = member;
                c0216e.obj = obj;
                try {
                    hookCallback2.onInvoke(c0216e);
                } catch (Throwable th3) {
                    XHooker.log("[FunBox]" + Log.getStackTraceString(th3));
                }
            }
        }
        Throwable th4 = thArr[0];
        if (th4 == null) {
            return objArr2[0];
        }
        throw th4;
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void decompile0(Member member) {
        HashMap map = SHooker.f59a;
        if (!Modifier.isAbstract(member.getModifiers())) {
            SHooker._deoptimize(member);
        } else {
            throw new IllegalArgumentException("Cannot deoptimize abstract methods: " + member);
        }
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookAfterImpl(Member member, XHooker.HookCallback hookCallback) {
        ConcurrentHashMap concurrentHashMap = f833c;
        if (!concurrentHashMap.containsKey(Integer.valueOf(member.hashCode()))) {
            concurrentHashMap.put(Integer.valueOf(member.hashCode()), SHooker.m68a(member, new C0214c()));
        }
        ((ArrayList) f832b.computeIfAbsent(member, new C0212a(0))).add(hookCallback);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void hookBeforeImpl(Member member, XHooker.HookCallback hookCallback) {
        ConcurrentHashMap concurrentHashMap = f833c;
        if (!concurrentHashMap.containsKey(Integer.valueOf(member.hashCode()))) {
            concurrentHashMap.put(Integer.valueOf(member.hashCode()), SHooker.m68a(member, new C0213b()));
        }
        ((ArrayList) f831a.computeIfAbsent(member, new C0212a(1))).add(hookCallback);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final Object invokeImpl(Member member, Object obj, Object[] objArr) {
        ConcurrentHashMap concurrentHashMap = f833c;
        if (!concurrentHashMap.containsKey(Integer.valueOf(member.hashCode()))) {
            return ((Method) member).invoke(obj, objArr);
        }
        HookRecord hookRecord = (HookRecord) concurrentHashMap.get(Integer.valueOf(member.hashCode()));
        HashMap map = SHooker.f59a;
        return hookRecord.f819b.invoke(obj, objArr);
    }

    @Override // fun.box001.shared.hook.XHooker
    protected final void logImpl(String str) {
        Log.i("[FunBox]", str);
    }
}
