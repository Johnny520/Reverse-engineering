package p000;

import android.view.MotionEvent;
import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: da */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0185da extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f193a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185da(Method method) {
        super(90);
        this.f193a = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01bc, code lost:
    
        if (r1 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01cb, code lost:
    
        if (r1 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01e9, code lost:
    
        r1 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01ed, code lost:
    
        if (r1 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01f3, code lost:
    
        if (r1.length() <= 3) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01f7, code lost:
    
        r1 = r13.getReturnType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01fd, code lost:
    
        if (r1 == java.lang.Boolean.TYPE) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0201, code lost:
    
        if (r1 == java.lang.Boolean.class) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0205, code lost:
    
        if (r1 == java.lang.Void.TYPE) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0209, code lost:
    
        if (r1 == java.lang.Void.class) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0212, code lost:
    
        if (r13.getParameterTypes().length > 3) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0214, code lost:
    
        r1 = r14.args;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x021a, code lost:
    
        if (p000.AbstractC0233ga.m450m(r0) != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x021e, code lost:
    
        r3 = p000.AbstractC0233ga.m463z(r13).toLowerCase(java.util.Locale.US);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x022e, code lost:
    
        if (r3.contains("refreshstate") == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0238, code lost:
    
        if (r3.contains("minioldstyleheader") != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0240, code lost:
    
        if (r3.contains("simplecomponent") != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0243, code lost:
    
        r3 = r13.getParameterTypes();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0249, code lost:
    
        if (r5 >= r3.length) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x024b, code lost:
    
        r6 = r3[r5].getName().toLowerCase(java.util.Locale.US);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x025d, code lost:
    
        if (r6.contains("refresh") != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0265, code lost:
    
        if (r6.startsWith("m6.") == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0269, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0274, code lost:
    
        if (p000.AbstractC0233ga.m452o(p000.AbstractC0233ga.m441d(r0)) != false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0276, code lost:
    
        if (r1 != null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0279, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x027b, code lost:
    
        if (r3 >= r1.length) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x027d, code lost:
    
        r5 = r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x027f, code lost:
    
        if (r5 != null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x028a, code lost:
    
        if (p000.AbstractC0233ga.m452o(p000.AbstractC0233ga.m441d(r5)) == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x028e, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x029d, code lost:
    
        if (p000.AbstractC0233ga.m452o(p000.AbstractC0233ga.m441d(r13.getDeclaringClass())) == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02a0, code lost:
    
        r4 = p000.AbstractC0233ga.m452o(p000.AbstractC0233ga.m463z(r13).toLowerCase(java.util.Locale.US));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02ae, code lost:
    
        if (r4 == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02b6, code lost:
    
        if (p000.AbstractC0233ga.m455r(r0) == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02bb, code lost:
    
        if ((r0 instanceof android.view.View) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x02c8, code lost:
    
        if (p000.AbstractC0233ga.m444g((android.view.View) r0, 0, new int[]{0}) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02cb, code lost:
    
        r1 = p000.AbstractC0233ga.m463z(r13).toLowerCase(java.util.Locale.US);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02db, code lost:
    
        if (r1.contains("mini") != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02e3, code lost:
    
        if (r1.contains("wxa") != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02eb, code lost:
    
        if (r1.contains("microapp") == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x02ed, code lost:
    
        r14.setResult(p000.AbstractC0233ga.m443f(r0, r13.getReturnType()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:?, code lost:
    
        return;
     */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        MotionEvent motionEvent;
        int action;
        float fFloatValue;
        boolean zEquals;
        int iMax;
        Object obj;
        Object objM437B;
        Object obj2 = methodHookParam.thisObject;
        if (!HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
            return;
        }
        Object obj3 = methodHookParam.thisObject;
        Object[] objArr = methodHookParam.args;
        if (obj3 != null && objArr != null) {
            int i = 0;
            while (true) {
                if (i >= objArr.length) {
                    break;
                }
                if (AbstractC0233ga.m454q(objArr[i])) {
                    AbstractC0233ga.m462y(obj3);
                    break;
                }
                i++;
            }
        }
        if (objArr != null) {
            for (Object obj4 : objArr) {
                if (obj4 != null) {
                    if (AbstractC0233ga.m454q(obj4)) {
                        AbstractC0233ga.m462y(obj3);
                    } else if (AbstractC0233ga.m451n(obj4)) {
                        AbstractC0233ga.m462y(obj3);
                    }
                }
            }
        }
        if (!AbstractC0233ga.m451n(methodHookParam.thisObject) && (obj = methodHookParam.thisObject) != null && !AbstractC0233ga.m460w(obj) && (objM437B = AbstractC0233ga.m437B(obj)) != null && !AbstractC0233ga.m460w(objM437B) && AbstractC0233ga.m457t(objM437B) && AbstractC0233ga.m442e(objM437B, 0, Collections.newSetFromMap(new IdentityHashMap()))) {
            AbstractC0233ga.m462y(objM437B);
        }
        if (!AbstractC0233ga.m451n(methodHookParam.thisObject)) {
            return;
        }
        Method method = this.f193a;
        if (!HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD) || method == null || !AbstractC0233ga.m451n(methodHookParam.thisObject)) {
            return;
        }
        Object obj5 = methodHookParam.thisObject;
        String lowerCase = method.getName() == null ? "" : method.getName().toLowerCase(Locale.US);
        if (AbstractC0233ga.m453p(method) || AbstractC0233ga.m459v(method)) {
            Object[] objArr2 = methodHookParam.args;
            if (AbstractC0233ga.m450m(obj5) && !AbstractC0233ga.m452o(AbstractC0233ga.m441d(obj5))) {
                if (objArr2 != null) {
                    for (Object obj6 : objArr2) {
                        if (obj6 != null && AbstractC0233ga.m452o(AbstractC0233ga.m441d(obj6))) {
                            return;
                        }
                    }
                }
                if (AbstractC0233ga.m452o(AbstractC0233ga.m441d(method.getDeclaringClass())) ? true : AbstractC0233ga.m452o(AbstractC0233ga.m463z(method).toLowerCase(Locale.US))) {
                    return;
                }
                if (!AbstractC0233ga.m455r(obj5)) {
                    String lowerCase2 = AbstractC0233ga.m463z(method).toLowerCase(Locale.US);
                    if (!lowerCase2.contains("mini") && !lowerCase2.contains("wxa") && !lowerCase2.contains("microapp")) {
                        return;
                    }
                }
                methodHookParam.setResult(AbstractC0233ga.m443f(obj5, method.getReturnType()));
                return;
            }
            return;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i2 = 0;
        while (true) {
            if (i2 >= parameterTypes.length) {
                break;
            }
            if (!MotionEvent.class.isAssignableFrom(parameterTypes[i2])) {
                i2++;
            } else if (AbstractC0233ga.m450m(obj5) || AbstractC0233ga.m451n(obj5)) {
                Object[] objArr3 = methodHookParam.args;
                if ((obj5 instanceof View) && objArr3 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= objArr3.length) {
                            motionEvent = null;
                            break;
                        }
                        Object obj7 = objArr3[i3];
                        if (obj7 instanceof MotionEvent) {
                            motionEvent = (MotionEvent) obj7;
                            break;
                        }
                        i3++;
                    }
                    if (motionEvent != null) {
                        View view = (View) obj5;
                        try {
                            action = motionEvent.getActionMasked();
                        } catch (Throwable unused) {
                            action = motionEvent.getAction();
                        }
                        if (action == 0) {
                            WeakHashMap weakHashMap = AbstractC0233ga.f318g;
                            synchronized (weakHashMap) {
                                weakHashMap.put(view, Float.valueOf(motionEvent.getY()));
                            }
                            WeakHashMap weakHashMap2 = AbstractC0233ga.f319h;
                            synchronized (weakHashMap2) {
                                weakHashMap2.remove(view);
                            }
                        } else {
                            WeakHashMap weakHashMap3 = AbstractC0233ga.f318g;
                            synchronized (weakHashMap3) {
                                try {
                                    Float f = (Float) weakHashMap3.get(view);
                                    fFloatValue = f != null ? f.floatValue() : Float.NaN;
                                } finally {
                                }
                            }
                            WeakHashMap weakHashMap4 = AbstractC0233ga.f319h;
                            synchronized (weakHashMap4) {
                                zEquals = Boolean.TRUE.equals(weakHashMap4.get(view));
                            }
                            if (Float.isNaN(fFloatValue)) {
                                fFloatValue = motionEvent.getY();
                            }
                            boolean z = lowerCase != null && (lowerCase.contains("touch") || lowerCase.contains("intercept") || lowerCase.length() <= 3);
                            if (action != 1 && action != 3) {
                                float y = motionEvent.getY() - fFloatValue;
                                try {
                                    iMax = Math.max(1, (int) ((2.0f * (view.getResources() == null ? 1.0f : view.getResources().getDisplayMetrics().density)) + 0.5f));
                                } catch (Throwable unused2) {
                                    iMax = 2;
                                }
                                if (y > iMax && z) {
                                    WeakHashMap weakHashMap5 = AbstractC0233ga.f319h;
                                    synchronized (weakHashMap5) {
                                        weakHashMap5.put(view, Boolean.TRUE);
                                    }
                                } else if (zEquals) {
                                }
                                methodHookParam.setResult(AbstractC0233ga.m443f(obj5, method.getReturnType()));
                                return;
                            }
                            synchronized (weakHashMap3) {
                                weakHashMap3.remove(view);
                            }
                            synchronized (weakHashMap4) {
                                weakHashMap4.remove(view);
                            }
                            if (zEquals) {
                            }
                        }
                    }
                }
            }
        }
    }
}
