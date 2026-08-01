package p077m0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.LruCache;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ListView;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import p001A0.AbstractC0039l;
import p001A0.C0013M;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0134v;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p086r0.C0832E;
import p086r0.C0842H0;
import p086r0.C0903g0;
import p086r0.C0932q;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: m0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0768f extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2586c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0768f(InterfaceC0551a interfaceC0551a, Object obj, int i2) {
        this.f2584a = i2;
        this.f2585b = interfaceC0551a;
        this.f2586c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c0104d;
        View viewM1612W;
        String strM1614X;
        boolean zM414a = false;
        Object obj = this.f2586c;
        Object obj2 = this.f2585b;
        switch (this.f2584a) {
            case 0:
                ((MainHook) obj).initPlugin((Context) methodHookParam.args[0], (XC_LoadPackage.LoadPackageParam) obj2);
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                ListView listView = obj3 instanceof ListView ? (ListView) obj3 : null;
                if (listView != null) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0223g.m417d(objArr, "args");
                    Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                    if (objM258f0 != null) {
                        Class<?> superclass = objM258f0.getClass();
                        C0832E c0832e = (C0832E) obj2;
                        c0832e.getClass();
                        while (true) {
                            if (superclass != null) {
                                String name = superclass.getName();
                                if (!name.equals("kc5.v0") && !name.equals("va5.v0") && !name.equals("sd5.x0") && !name.equals("yf5.w0") && !name.equals("com.tencent.mm.ui.k3") && !name.equals("com.tencent.mm.ui.i3") && !AbstractC0307q.m538h0(name, false, "com.tencent.mm.ui.conversation")) {
                                    superclass = superclass.getSuperclass();
                                }
                            } else {
                                Class<?> cls = objM258f0.getClass();
                                if (AbstractC1135r.m2485g() == null && AbstractC1135r.m2496r(3060)) {
                                    C0013M c0013mM70h = AbstractC0039l.m70h((Context) obj);
                                    zM414a = AbstractC0223g.m414a(c0013mM70h != null ? c0013mM70h.f120a : null, cls.getName());
                                }
                                if (!zM414a) {
                                }
                            }
                        }
                        c0832e.f2779b = new WeakReference(objM258f0);
                        c0832e.f2778a = new WeakReference(listView);
                        AbstractC0731a.m1384a("hide close friend list adapter bind", objM258f0.getClass().getName());
                        break;
                    }
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr2 = methodHookParam.args;
                AbstractC0223g.m417d(objArr2, "args");
                Object objM258f02 = AbstractC0120h.m258f0(0, objArr2);
                if (objM258f02 != null) {
                    try {
                        c0104d = (View) AbstractC0514f.f1622b.mo1015f(objM258f02, "itemView");
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    View view = (View) (c0104d instanceof C0104d ? null : c0104d);
                    if (view != null) {
                        C0903g0 c0903g0 = (C0903g0) obj2;
                        c0903g0.m1937e("tag page onBind", ((Class) obj).getName(), view.getClass().getName());
                        c0903g0.m1947s(view);
                        break;
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                C0842H0 c0842h0 = (C0842H0) obj2;
                c0842h0.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z2 = AbstractC1126i.f3786a;
                String str = (String) obj;
                if (C1124g.m2415F()) {
                    Object objM1673U = c0842h0.m1673U(obj4);
                    ContextMenu contextMenu = objM1673U instanceof ContextMenu ? (ContextMenu) objM1673U : null;
                    if (contextMenu != null && (strM1614X = C0842H0.m1614X((viewM1612W = C0842H0.m1612W(obj4)))) != null) {
                        String strM1699q1 = c0842h0.m1699q1(viewM1612W, null, strM1614X);
                        c0842h0.m1687l1(strM1614X, strM1699q1, obj4);
                        c0842h0.m1693o(contextMenu, strM1614X, strM1699q1);
                        C0842H0.m1623b1("conversation append popup", jCurrentTimeMillis, str);
                    }
                }
                C0842H0.m1621b(c0842h0, methodHookParam.thisObject, str);
                break;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int iIntValue;
        Uri data;
        Object c0104d;
        File file;
        InputStream inputStreamOpenInputStream;
        switch (this.f2584a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                boolean zBooleanValue = false;
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                Integer num = objM258f0 instanceof Integer ? (Integer) objM258f0 : null;
                if (num == null || (iIntValue = num.intValue()) != 22305) {
                    return;
                }
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity == null) {
                    return;
                }
                Object[] objArr2 = methodHookParam.args;
                AbstractC0223g.m417d(objArr2, "args");
                Object objM258f02 = AbstractC0120h.m258f0(1, objArr2);
                Integer num2 = objM258f02 instanceof Integer ? (Integer) objM258f02 : null;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Object[] objArr3 = methodHookParam.args;
                AbstractC0223g.m417d(objArr3, "args");
                Object objM258f03 = AbstractC0120h.m258f0(2, objArr3);
                Intent intent = objM258f03 instanceof Intent ? (Intent) objM258f03 : null;
                LruCache lruCache = AbstractC1129l.f3803a;
                if (iIntValue == 22305) {
                    boolean z2 = AbstractC1126i.f3786a;
                    String string = C1124g.m2438n().getString("custom_local_avatar_pending_wxid", "");
                    if (string == null) {
                        string = "";
                    }
                    AbstractC1129l.m2457g("");
                    if (iIntValue2 == -1 && !AbstractC0307q.m534d0(string) && intent != null && (data = intent.getData()) != null) {
                        try {
                            activity.getContentResolver().takePersistableUriPermission(data, 1);
                            break;
                        } catch (Throwable unused) {
                        }
                        try {
                            File file2 = new File(activity.getFilesDir(), "custom_local_avatars");
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            Pattern patternCompile = Pattern.compile("[^A-Za-z0-9_@.-]");
                            AbstractC0223g.m417d(patternCompile, "compile(...)");
                            String strReplaceAll = patternCompile.matcher(string).replaceAll("_");
                            AbstractC0223g.m417d(strReplaceAll, "replaceAll(...)");
                            file = new File(file2, strReplaceAll + "_" + System.currentTimeMillis() + ".img");
                            inputStreamOpenInputStream = activity.getContentResolver().openInputStream(data);
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    AbstractC0079h.m185i(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                    LinkedHashMap linkedHashMapM299d0 = AbstractC0134v.m299d0(AbstractC1129l.m2453c());
                                    linkedHashMapM299d0.put(string, file.getAbsolutePath());
                                    AbstractC1129l.f3803a.evictAll();
                                    c0104d = Boolean.valueOf(AbstractC1129l.m2456f(linkedHashMapM299d0));
                                    Throwable thM246a = AbstractC0105e.m246a(c0104d);
                                    if (thM246a != null) {
                                        AbstractC0731a.m1387d("save custom avatar fail", string, thM246a);
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    if (c0104d instanceof C0104d) {
                                        c0104d = bool;
                                    }
                                    zBooleanValue = ((Boolean) c0104d).booleanValue();
                                } finally {
                                }
                            } finally {
                            }
                        }
                        if (zBooleanValue) {
                            AbstractC0503h.m978P("本地头像已设置，重新进入页面后生效");
                        } else {
                            AbstractC0503h.m978P("本地头像保存失败");
                        }
                    }
                    zBooleanValue = true;
                }
                if (zBooleanValue) {
                    C0932q c0932q = (C0932q) this.f2585b;
                    c0932q.f3316a.evictAll();
                    Context applicationContext = activity.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = (Context) this.f2586c;
                    }
                    c0932q.m2048g(applicationContext);
                    methodHookParam.setResult((Object) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0768f(MainHook mainHook, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        this.f2584a = 0;
        this.f2586c = mainHook;
        this.f2585b = loadPackageParam;
    }
}
