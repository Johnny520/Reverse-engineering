package p000;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0447s2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f821a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f824d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f825e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Serializable f826f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Throwable[] */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC0447s2(String str, Object[] objArr, AtomicBoolean atomicBoolean, Context context, Throwable[] thArr) {
        this.f822b = str;
        this.f823c = objArr;
        this.f824d = atomicBoolean;
        this.f825e = context;
        this.f826f = thArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        C0483u6 c0483u6;
        Method method;
        Method method2;
        Object[] objArrM934S;
        ArrayList arrayList;
        Class<?> returnType;
        switch (this.f821a) {
            case 0:
                Object[] objArr = (Object[]) this.f823c;
                try {
                    String str = this.f822b;
                    DexKitBridge.Companion companion = DexKitBridge.Companion;
                    Method declaredMethod = DexKitBridge.class.getDeclaredMethod("create", String.class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, str);
                    objArr[0] = objInvoke;
                    if (((AtomicBoolean) this.f824d).get()) {
                        AbstractC0463t2.m1006g(objInvoke);
                        objArr[0] = null;
                    } else {
                        AbstractC0463t2.m1000a((Context) this.f825e, objInvoke);
                    }
                    return;
                } catch (Throwable th) {
                    ((Throwable[]) this.f826f)[0] = th;
                    return;
                }
            default:
                String string = "";
                try {
                    EditText editTextM984v = AbstractC0451s6.m984v((Activity) this.f823c);
                    Editable text = editTextM984v == null ? null : editTextM984v.getText();
                    if (text != null) {
                        string = text.toString();
                        break;
                    }
                } catch (Throwable unused) {
                }
                String str2 = string;
                Object obj = AbstractC0366oc.f652a;
                long jMax = Math.max(0L, 2200L) + System.currentTimeMillis();
                if (jMax > AbstractC0366oc.f656e) {
                    AbstractC0366oc.f656e = jMax;
                }
                View view = (View) this.f824d;
                if (view == null) {
                    String[] strArr = AbstractC0499v6.f956a;
                } else {
                    Map map = AbstractC0499v6.f957b;
                    synchronized (map) {
                        c0483u6 = (C0483u6) map.get(view);
                        break;
                    }
                    Object obj2 = c0483u6 == null ? null : c0483u6.f940a.get();
                    if (obj2 != null && (method = c0483u6.f941b) != null) {
                        try {
                            Object objInvokeOriginalMethod = XposedBridge.invokeOriginalMethod(method, obj2, new Object[]{view});
                            if (objInvokeOriginalMethod instanceof Boolean) {
                                if (((Boolean) objInvokeOriginalMethod).booleanValue()) {
                                    AbstractC0451s6.m944b((Activity) this.f823c, this.f822b, (String) this.f825e, (String) this.f826f, str2, "native-long-click");
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC0198e7.m343a("group-avatar", "invoke-original-long-click", th2);
                        }
                    }
                }
                EditText editTextM984v2 = AbstractC0451s6.m984v((Activity) this.f823c);
                Activity activity = (Activity) this.f823c;
                String str3 = this.f822b;
                String str4 = (String) this.f825e;
                String str5 = (String) this.f826f;
                Class<?> cls = Boolean.TYPE;
                ArrayList arrayList2 = new ArrayList();
                AbstractC0451s6.m948d(arrayList2, editTextM984v2);
                if (editTextM984v2 != null) {
                    try {
                        Object parent = editTextM984v2.getParent();
                        int i = 0;
                        while (parent != null) {
                            int i2 = i + 1;
                            if (i < 5) {
                                arrayList2.add(parent);
                                if (parent instanceof View) {
                                    parent = ((View) parent).getParent();
                                    i = i2;
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                arrayList2.add(activity);
                AbstractC0451s6.m948d(arrayList2, AbstractC0451s6.m952f(AbstractC0451s6.m922H(activity)));
                String strM959i0 = AbstractC0451s6.m959i0(activity, str4);
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    Object obj3 = arrayList2.get(i3);
                    if (obj3 != null) {
                        if (hashSet.add(obj3.getClass().getName() + "@" + System.identityHashCode(obj3))) {
                            ArrayList arrayListM950e = AbstractC0451s6.m950e(obj3.getClass());
                            int i4 = 0;
                            while (true) {
                                if (i4 < arrayListM950e.size()) {
                                    method2 = (Method) arrayListM950e.get(i4);
                                    if (Modifier.isAbstract(method2.getModifiers()) || Modifier.isStatic(method2.getModifiers())) {
                                        arrayList = arrayListM950e;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        arrayList = arrayListM950e;
                                        sb.append(method2.getName());
                                        sb.append(" ");
                                        sb.append(AbstractC0451s6.m933R(method2));
                                        String lowerCase = sb.toString().toLowerCase(Locale.US);
                                        if ((lowerCase.contains("at") || lowerCase.contains("mention")) && (((returnType = method2.getReturnType()) == Void.TYPE || returnType == cls || returnType == Boolean.class) && AbstractC0451s6.m934S(method2.getParameterTypes(), null, null, "", "1", "1", "n") != null)) {
                                        }
                                    }
                                    i4++;
                                    arrayListM950e = arrayList;
                                } else {
                                    method2 = null;
                                }
                            }
                            if (method2 != null && (objArrM934S = AbstractC0451s6.m934S(method2.getParameterTypes(), activity, editTextM984v2, str3, str4, strM959i0, str5)) != null) {
                                try {
                                    method2.setAccessible(true);
                                    Object objInvoke2 = method2.invoke(obj3, objArrM934S);
                                    if (method2.getReturnType() == cls || method2.getReturnType() == Boolean.class) {
                                        if (!Boolean.TRUE.equals(objInvoke2)) {
                                        }
                                    }
                                    HookEntry.log("group action native mention invoked class=" + obj3.getClass().getName() + " method=" + AbstractC0451s6.m933R(method2));
                                    AbstractC0451s6.m944b((Activity) this.f823c, this.f822b, (String) this.f825e, (String) this.f826f, str2, "native-reflect");
                                    return;
                                } catch (Throwable th3) {
                                    Throwable thM913C0 = AbstractC0451s6.m913C0(th3);
                                    HookEntry.log("group action native mention failed method=" + AbstractC0451s6.m933R(method2) + " reason=" + thM913C0.getClass().getSimpleName() + ": " + thM913C0.getMessage());
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                HookEntry.log("group action failed type=艾特 reason=native mention entry unresolved groupUin=" + this.f822b + " targetUin=" + ((String) this.f825e));
                AbstractC0451s6.m991y0("未找到 QQ 原生艾特入口");
                return;
        }
    }

    public RunnableC0447s2(Activity activity, View view, String str, String str2, String str3) {
        this.f823c = activity;
        this.f824d = view;
        this.f822b = str;
        this.f825e = str2;
        this.f826f = str3;
    }
}
