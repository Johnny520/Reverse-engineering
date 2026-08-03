package p000a;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0329S3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0329S3 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public volatile String f1164a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f1165b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f1166c;

    /* JADX INFO: renamed from: d */
    public volatile Class<?> f1167d;

    /* JADX INFO: renamed from: e */
    public volatile Object f1168e;

    /* JADX INFO: renamed from: a.S3$a */
    public static final class a extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public final BaseAdapter f1169a;

        /* JADX INFO: renamed from: b */
        public final String f1170b;

        /* JADX INFO: renamed from: c */
        public final Context f1171c;

        /* JADX INFO: renamed from: d */
        public final String f1172d;

        public a(BaseAdapter baseAdapter, String str, Context context, String str2) {
            C0631i9.m1482e(str, "wxid");
            this.f1169a = baseAdapter;
            this.f1170b = str;
            this.f1171c = context;
            this.f1172d = str2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.f1169a.getCount() + 1;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            BaseAdapter baseAdapter = this.f1169a;
            return i < baseAdapter.getCount() ? baseAdapter.getItem(i) : this;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            BaseAdapter baseAdapter = this.f1169a;
            if (i < baseAdapter.getCount()) {
                return baseAdapter.getItemId(i);
            }
            return -1L;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            BaseAdapter baseAdapter = this.f1169a;
            if (i < baseAdapter.getCount()) {
                View view2 = baseAdapter.getView(i, view, viewGroup);
                C0631i9.m1481d(view2, "getView(...)");
                return view2;
            }
            Context context = this.f1171c;
            float f = context.getResources().getDisplayMetrics().density;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView == null) {
                textView = new TextView(context);
            }
            textView.setText(this.f1172d);
            textView.setGravity(16);
            float f2 = 24 * f;
            float f3 = 16 * f;
            textView.setPadding(C0726n9.m1680w(f2), C0726n9.m1680w(f3), C0726n9.m1680w(f2), C0726n9.m1680w(f3));
            textView.setTextSize(17.0f);
            textView.setTextColor(-15658735);
            return textView;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m908b(Object obj) {
        Object objM2206a;
        String lowerCase;
        if (obj != null) {
            try {
                Field declaredField = obj.getClass().getDeclaredField("d");
                declaredField.setAccessible(true);
                objM2206a = declaredField.get(obj);
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            if (objM2206a instanceof C0901wd.a) {
                objM2206a = null;
            }
            if (objM2206a != null) {
                Iterator it = C0739o3.m1757d0("d1", "d", "getUsername", "getWxid").iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        for (String str : C0739o3.m1757d0("username", "wxid", "field_username", "field_wxid")) {
                            for (Class<?> superclass = objM2206a.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                try {
                                    Field declaredField2 = superclass.getDeclaredField(str);
                                    declaredField2.setAccessible(true);
                                    Object obj2 = declaredField2.get(objM2206a);
                                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                                    if (str2 != null && !C0034Be.m101P(str2)) {
                                        lowerCase = str2.toLowerCase(Locale.ROOT);
                                        C0631i9.m1481d(lowerCase, "toLowerCase(...)");
                                    }
                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                } catch (Throwable th2) {
                                    C0920xd.m2206a(th2);
                                }
                            }
                        }
                        return null;
                    }
                    String str3 = (String) it.next();
                    for (Class<?> superclass2 = objM2206a.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                        try {
                            Method declaredMethod = superclass2.getDeclaredMethod(str3, null);
                            declaredMethod.setAccessible(true);
                            Object objInvoke = declaredMethod.invoke(objM2206a, null);
                            String str4 = objInvoke instanceof String ? (String) objInvoke : null;
                            if (str4 != null && !C0034Be.m101P(str4)) {
                                lowerCase = str4.toLowerCase(Locale.ROOT);
                                C0631i9.m1481d(lowerCase, "toLowerCase(...)");
                                break loop0;
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                        } catch (Throwable th3) {
                            C0920xd.m2206a(th3);
                        }
                    }
                }
                return lowerCase;
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x0059 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x007e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x007c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.widget.ListView] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.widget.ListView] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX INFO: renamed from: a */
    public final void m909a(Object obj) {
        ?? r3;
        ListAdapter adapter;
        Method method;
        try {
            Method[] methods = obj.getClass().getMethods();
            C0631i9.m1481d(methods, "getMethods(...)");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods[i];
                if (C0631i9.m1478a(method.getName(), "getListView")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            r3 = objInvoke instanceof ListView ? (ListView) objInvoke : 0;
        } else {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
            int length2 = declaredFields.length;
            int i2 = 0;
            r3 = declaredFields;
            while (i2 < length2) {
                ?? r6 = r3[i2];
                try {
                    if (ListView.class.isAssignableFrom(r6.getType())) {
                        r6.setAccessible(true);
                        Object obj2 = r6.get(obj);
                        if (!(obj2 instanceof ListView)) {
                            break;
                        }
                        r3 = (ListView) obj2;
                        break;
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th2) {
                    C0920xd.m2206a(th2);
                }
                i2++;
                r3 = r3;
            }
        }
        if (r3 == 0 || (adapter = r3.getAdapter()) == null) {
            return;
        }
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        if (adapter instanceof a) {
            this.f1168e = obj;
            Log.e("ContactAddMask", "popup captured for our menu");
        }
        this.f1165b = false;
        this.f1164a = null;
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        ClassLoader classLoader;
        Object objM2206a;
        C0597gd c0597gdM1467a;
        Class<?> cls;
        Object objM2206a2;
        Object objM2206a3;
        Object objM2206a4;
        Object objM2206a5;
        Object objM2206a6;
        Method[] declaredMethods;
        final int i = 0;
        final int i2 = 1;
        C0631i9.m1482e(c0173j8, "session");
        Log.e("ContactAddMask", "handleHook START process=" + c0173j8.f609b);
        if (!C0631i9.m1478a(c0173j8.f609b, "com.tencent.mm")) {
            Log.w("ContactAddMask", "非主进程 " + c0173j8.f609b + "，跳过");
            return;
        }
        if (this.f1166c || (classLoader = c0173j8.f608a) == null) {
            return;
        }
        try {
            int i3 = -1;
            if (C0021B1.f64a == -1) {
                try {
                    Context context = C0889w1.f3488p;
                    C0631i9.m1479b(context);
                    i3 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
                } catch (Exception e) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                }
                C0021B1.f64a = i3;
            }
            C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
            C0616hd.f2278a.getClass();
            c0597gdM1467a = C0616hd.m1467a("F004_contact_add_mask", c0578fd);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (c0597gdM1467a.f2208a && (cls = c0597gdM1467a.f2209b) != null) {
            String name = cls.getName();
            Class<?> clsM1426a = c0597gdM1467a.m1426a("builderClass");
            if (clsM1426a == null) {
                return;
            }
            String name2 = clsM1426a.getName();
            Class<?> clsM1426a2 = c0597gdM1467a.m1426a("adapterClass");
            if (clsM1426a2 == null) {
                return;
            }
            String name3 = clsM1426a2.getName();
            Class<?> clsM1426a3 = c0597gdM1467a.m1426a("clickListenerClass");
            if (clsM1426a3 == null) {
                return;
            }
            String name4 = clsM1426a3.getName();
            Log.i("ContactAddMask", "tryHookYm5: via=ENGINE path=" + c0597gdM1467a.f2211d + " builder=" + name2 + " adapter=" + name3 + " click=" + name4 + " entry=" + name);
            try {
                objM2206a2 = classLoader.loadClass(name2);
            } catch (Throwable th2) {
                objM2206a2 = C0920xd.m2206a(th2);
            }
            if (objM2206a2 instanceof C0901wd.a) {
                objM2206a2 = null;
            }
            if (((Class) objM2206a2) == null) {
                Log.w("ContactAddMask", "builder class not found: ".concat(name2));
                return;
            }
            try {
                objM2206a3 = classLoader.loadClass(name);
            } catch (Throwable th3) {
                objM2206a3 = C0920xd.m2206a(th3);
            }
            if (objM2206a3 instanceof C0901wd.a) {
                objM2206a3 = null;
            }
            Class cls2 = (Class) objM2206a3;
            if (cls2 == null) {
                Log.w("ContactAddMask", "entry class not found: ".concat(name));
                return;
            }
            try {
                objM2206a4 = classLoader.loadClass(name4);
            } catch (Throwable th4) {
                objM2206a4 = C0920xd.m2206a(th4);
            }
            if (objM2206a4 instanceof C0901wd.a) {
                objM2206a4 = null;
            }
            Class cls3 = (Class) objM2206a4;
            try {
                objM2206a5 = classLoader.loadClass(name3);
            } catch (Throwable th5) {
                objM2206a5 = C0920xd.m2206a(th5);
            }
            Class<?> cls4 = (Class) (objM2206a5 instanceof C0901wd.a ? null : objM2206a5);
            if (cls4 == null) {
                Log.w("ContactAddMask", "adapter class not found: ".concat(name3));
                return;
            }
            this.f1167d = cls4;
            Method[] declaredMethods2 = cls2.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method : declaredMethods2) {
                if (C0631i9.m1478a(method.getName(), "r")) {
                    arrayList.add(method);
                }
            }
            for (Method method2 : arrayList) {
                C0631i9.m1479b(method2);
                C0173J8.m469h(c0173j8, "F004", method2, new InterfaceC0064D7(this) { // from class: a.R3

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0329S3 f1116b;

                    {
                        this.f1116b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:116:0x01ce  */
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo53f(Object obj) {
                        String str;
                        Context context2;
                        String str2;
                        Object objM2206a7;
                        Object objM2206a8;
                        Object objM2206a9;
                        Method method3;
                        Field field;
                        Object obj2;
                        Method method4;
                        int i4 = 0;
                        switch (i) {
                            case 0:
                                C0329S3 c0329s3 = this.f1116b;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                C0631i9.m1482e(chain, "chain");
                                try {
                                    List args = chain.getArgs();
                                    C0631i9.m1481d(args, "getArgs(...)");
                                    c0329s3.f1164a = C0329S3.m908b(C0834t3.m1951o0(args, 1));
                                    c0329s3.f1165b = true;
                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                    break;
                                } catch (Throwable th6) {
                                    C0920xd.m2206a(th6);
                                }
                                return chain.proceed();
                            case 1:
                                C0329S3 c0329s32 = this.f1116b;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                C0631i9.m1482e(chain2, "chain");
                                Object obj3 = chain2.getArgs().get(0);
                                if (obj3 != null) {
                                    Class<?> cls5 = c0329s32.f1167d;
                                    C0631i9.m1479b(cls5);
                                    if (cls5.isInstance(obj3)) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2410B && c0329s32.f1165b && (str = c0329s32.f1164a) != null && !C0034Be.m101P(str) && (context2 = C0889w1.f3488p) != null) {
                                            ExecutorService executorService = C0582fh.f2149G;
                                            boolean zM1423a = C0582fh.a.m1423a(str);
                                            if (zM1423a) {
                                                str2 = "取消密友";
                                            } else {
                                                str2 = C0186K3.a.m508i().f2411C;
                                                if (C0034Be.m101P(str2)) {
                                                    str2 = "加入密友";
                                                }
                                            }
                                            C0329S3.a aVar = new C0329S3.a((BaseAdapter) obj3, str, context2, str2);
                                            Object thisObject = chain2.getThisObject();
                                            C0631i9.m1480c(thisObject, "null cannot be cast to non-null type android.widget.ListView");
                                            ((ListView) thisObject).setAdapter((ListAdapter) aVar);
                                            Log.e("ContactAddMask", "wrap OK: '" + str2 + "' wxid=" + str + " masked=" + zM1423a);
                                            return null;
                                        }
                                    }
                                }
                                return chain2.proceed();
                            case 2:
                                C0329S3 c0329s33 = this.f1116b;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                                C0631i9.m1482e(chain3, "chain");
                                chain3.proceed();
                                try {
                                    Object thisObject2 = chain3.getThisObject();
                                    C0631i9.m1481d(thisObject2, "getThisObject(...)");
                                    c0329s33.m909a(thisObject2);
                                    objM2206a7 = C0413Wf.f1577a;
                                    break;
                                } catch (Throwable th7) {
                                    objM2206a7 = C0920xd.m2206a(th7);
                                }
                                return new C0901wd(objM2206a7);
                            default:
                                C0329S3 c0329s34 = this.f1116b;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                                C0631i9.m1482e(chain4, "chain");
                                List args2 = chain4.getArgs();
                                C0631i9.m1481d(args2, "getArgs(...)");
                                Object objM1951o0 = C0834t3.m1951o0(args2, 0);
                                AdapterView adapterView = objM1951o0 instanceof AdapterView ? (AdapterView) objM1951o0 : null;
                                if (adapterView == null) {
                                    chain4.proceed();
                                } else {
                                    List args3 = chain4.getArgs();
                                    C0631i9.m1481d(args3, "getArgs(...)");
                                    Object objM1951o02 = C0834t3.m1951o0(args3, 2);
                                    Integer num = objM1951o02 instanceof Integer ? (Integer) objM1951o02 : null;
                                    if (num != null) {
                                        int iIntValue = num.intValue();
                                        Object adapter = adapterView.getAdapter();
                                        if (adapter != null) {
                                            if (adapter instanceof HeaderViewListAdapter) {
                                                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                                            }
                                            if (adapter instanceof C0329S3.a) {
                                                C0329S3.a aVar2 = (C0329S3.a) adapter;
                                                if (iIntValue == aVar2.getCount() - 1) {
                                                    String str3 = aVar2.f1170b;
                                                    try {
                                                        ExecutorService executorService2 = C0582fh.f2149G;
                                                        String str4 = "刻舟求剑";
                                                        if (C0582fh.a.m1423a(str3)) {
                                                            C0186K3.f638a.getClass();
                                                            C0186K3.a.m514o(str3);
                                                            Context context3 = C0889w1.f3488p;
                                                            if (context3 != null) {
                                                                C0653jc c0653jcM508i = C0186K3.a.m508i();
                                                                if (c0653jcM508i.f2426R) {
                                                                    String str5 = c0653jcM508i.f2429U;
                                                                    if (!C0034Be.m101P(str5)) {
                                                                        str4 = str5;
                                                                    }
                                                                    Toast.makeText(context3, str4, 0).show();
                                                                }
                                                            }
                                                            Log.e("ContactAddMask", "removeMask OK: ".concat(str3));
                                                        } else {
                                                            C0186K3.a aVar3 = C0186K3.f638a;
                                                            MaskItemBean maskItemBean = new MaskItemBean(str3, str3, 0, null, null, 28, null);
                                                            aVar3.getClass();
                                                            C0186K3.a.m500a(maskItemBean);
                                                            Context context4 = C0889w1.f3488p;
                                                            if (context4 != null) {
                                                                C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                                                if (c0653jcM508i2.f2426R) {
                                                                    String str6 = c0653jcM508i2.f2428T;
                                                                    if (!C0034Be.m101P(str6)) {
                                                                        str4 = str6;
                                                                    }
                                                                    Toast.makeText(context4, str4, 0).show();
                                                                }
                                                            }
                                                            Log.e("ContactAddMask", "addMask OK: " + str3);
                                                        }
                                                        C0664k4 c0664k4 = C0816s4.f3224M;
                                                        if (c0664k4 != null) {
                                                            c0664k4.mo31a();
                                                        }
                                                        C0004A3 c0004a3 = C0611h8.f2257k;
                                                        if (c0004a3 != null) {
                                                            c0004a3.mo31a();
                                                            objM2206a8 = C0413Wf.f1577a;
                                                        } else {
                                                            objM2206a8 = null;
                                                        }
                                                    } catch (Throwable th8) {
                                                        objM2206a8 = C0920xd.m2206a(th8);
                                                    }
                                                    Throwable thM2189a = C0901wd.m2189a(objM2206a8);
                                                    if (thM2189a != null) {
                                                        Log.e("ContactAddMask", "consume fail", thM2189a);
                                                    }
                                                    c0329s34.f1165b = false;
                                                    c0329s34.f1164a = null;
                                                    try {
                                                        Object obj4 = c0329s34.f1168e;
                                                        if (obj4 != null) {
                                                            Method[] methods = obj4.getClass().getMethods();
                                                            C0631i9.m1481d(methods, "getMethods(...)");
                                                            int length = methods.length;
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < length) {
                                                                    method3 = methods[i5];
                                                                    if (C0631i9.m1478a(method3.getName(), "a")) {
                                                                        Class<?>[] parameterTypes = method3.getParameterTypes();
                                                                        C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                                                        if (parameterTypes.length == 0) {
                                                                        }
                                                                    }
                                                                    i5++;
                                                                } else {
                                                                    method3 = null;
                                                                }
                                                            }
                                                            if (method3 != null) {
                                                                method3.invoke(obj4, null);
                                                            } else {
                                                                Field[] declaredFields = obj4.getClass().getDeclaredFields();
                                                                C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                                                                int length2 = declaredFields.length;
                                                                int i6 = 0;
                                                                while (true) {
                                                                    if (i6 < length2) {
                                                                        field = declaredFields[i6];
                                                                        if (!field.getType().getName().equals("kc5.d5")) {
                                                                            i6++;
                                                                        }
                                                                    } else {
                                                                        field = null;
                                                                    }
                                                                }
                                                                if (field != null) {
                                                                    field.setAccessible(true);
                                                                }
                                                                if (field != null && (obj2 = field.get(obj4)) != null) {
                                                                    Method[] methods2 = obj2.getClass().getMethods();
                                                                    C0631i9.m1481d(methods2, "getMethods(...)");
                                                                    int length3 = methods2.length;
                                                                    while (true) {
                                                                        if (i4 < length3) {
                                                                            method4 = methods2[i4];
                                                                            if (C0631i9.m1478a(method4.getName(), "dismiss")) {
                                                                                Class<?>[] parameterTypes2 = method4.getParameterTypes();
                                                                                C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
                                                                                if (parameterTypes2.length == 0) {
                                                                                }
                                                                            }
                                                                            i4++;
                                                                        } else {
                                                                            method4 = null;
                                                                        }
                                                                    }
                                                                    if (method4 != null) {
                                                                        method4.invoke(obj2, null);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        objM2206a9 = C0413Wf.f1577a;
                                                    } catch (Throwable th9) {
                                                        objM2206a9 = C0920xd.m2206a(th9);
                                                    }
                                                    Throwable thM2189a2 = C0901wd.m2189a(objM2206a9);
                                                    if (thM2189a2 != null) {
                                                        Log.e("ContactAddMask", "dismiss fail", thM2189a2);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                return C0413Wf.f1577a;
                        }
                    }
                });
            }
            Method declaredMethod = ListView.class.getDeclaredMethod("setAdapter", ListAdapter.class);
            C0631i9.m1479b(declaredMethod);
            C0173J8.m469h(c0173j8, "F004", declaredMethod, new InterfaceC0064D7(this) { // from class: a.R3

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0329S3 f1116b;

                {
                    this.f1116b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:116:0x01ce  */
                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo53f(Object obj) {
                    String str;
                    Context context2;
                    String str2;
                    Object objM2206a7;
                    Object objM2206a8;
                    Object objM2206a9;
                    Method method3;
                    Field field;
                    Object obj2;
                    Method method4;
                    int i4 = 0;
                    switch (i2) {
                        case 0:
                            C0329S3 c0329s3 = this.f1116b;
                            XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain, "chain");
                            try {
                                List args = chain.getArgs();
                                C0631i9.m1481d(args, "getArgs(...)");
                                c0329s3.f1164a = C0329S3.m908b(C0834t3.m1951o0(args, 1));
                                c0329s3.f1165b = true;
                                C0413Wf c0413Wf = C0413Wf.f1577a;
                                break;
                            } catch (Throwable th6) {
                                C0920xd.m2206a(th6);
                            }
                            return chain.proceed();
                        case 1:
                            C0329S3 c0329s32 = this.f1116b;
                            XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain2, "chain");
                            Object obj3 = chain2.getArgs().get(0);
                            if (obj3 != null) {
                                Class<?> cls5 = c0329s32.f1167d;
                                C0631i9.m1479b(cls5);
                                if (cls5.isInstance(obj3)) {
                                    C0186K3.f638a.getClass();
                                    if (C0186K3.a.m511l() && C0186K3.a.m508i().f2410B && c0329s32.f1165b && (str = c0329s32.f1164a) != null && !C0034Be.m101P(str) && (context2 = C0889w1.f3488p) != null) {
                                        ExecutorService executorService = C0582fh.f2149G;
                                        boolean zM1423a = C0582fh.a.m1423a(str);
                                        if (zM1423a) {
                                            str2 = "取消密友";
                                        } else {
                                            str2 = C0186K3.a.m508i().f2411C;
                                            if (C0034Be.m101P(str2)) {
                                                str2 = "加入密友";
                                            }
                                        }
                                        C0329S3.a aVar = new C0329S3.a((BaseAdapter) obj3, str, context2, str2);
                                        Object thisObject = chain2.getThisObject();
                                        C0631i9.m1480c(thisObject, "null cannot be cast to non-null type android.widget.ListView");
                                        ((ListView) thisObject).setAdapter((ListAdapter) aVar);
                                        Log.e("ContactAddMask", "wrap OK: '" + str2 + "' wxid=" + str + " masked=" + zM1423a);
                                        return null;
                                    }
                                }
                            }
                            return chain2.proceed();
                        case 2:
                            C0329S3 c0329s33 = this.f1116b;
                            XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain3, "chain");
                            chain3.proceed();
                            try {
                                Object thisObject2 = chain3.getThisObject();
                                C0631i9.m1481d(thisObject2, "getThisObject(...)");
                                c0329s33.m909a(thisObject2);
                                objM2206a7 = C0413Wf.f1577a;
                                break;
                            } catch (Throwable th7) {
                                objM2206a7 = C0920xd.m2206a(th7);
                            }
                            return new C0901wd(objM2206a7);
                        default:
                            C0329S3 c0329s34 = this.f1116b;
                            XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain4, "chain");
                            List args2 = chain4.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args2, 0);
                            AdapterView adapterView = objM1951o0 instanceof AdapterView ? (AdapterView) objM1951o0 : null;
                            if (adapterView == null) {
                                chain4.proceed();
                            } else {
                                List args3 = chain4.getArgs();
                                C0631i9.m1481d(args3, "getArgs(...)");
                                Object objM1951o02 = C0834t3.m1951o0(args3, 2);
                                Integer num = objM1951o02 instanceof Integer ? (Integer) objM1951o02 : null;
                                if (num != null) {
                                    int iIntValue = num.intValue();
                                    Object adapter = adapterView.getAdapter();
                                    if (adapter != null) {
                                        if (adapter instanceof HeaderViewListAdapter) {
                                            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                                        }
                                        if (adapter instanceof C0329S3.a) {
                                            C0329S3.a aVar2 = (C0329S3.a) adapter;
                                            if (iIntValue == aVar2.getCount() - 1) {
                                                String str3 = aVar2.f1170b;
                                                try {
                                                    ExecutorService executorService2 = C0582fh.f2149G;
                                                    String str4 = "刻舟求剑";
                                                    if (C0582fh.a.m1423a(str3)) {
                                                        C0186K3.f638a.getClass();
                                                        C0186K3.a.m514o(str3);
                                                        Context context3 = C0889w1.f3488p;
                                                        if (context3 != null) {
                                                            C0653jc c0653jcM508i = C0186K3.a.m508i();
                                                            if (c0653jcM508i.f2426R) {
                                                                String str5 = c0653jcM508i.f2429U;
                                                                if (!C0034Be.m101P(str5)) {
                                                                    str4 = str5;
                                                                }
                                                                Toast.makeText(context3, str4, 0).show();
                                                            }
                                                        }
                                                        Log.e("ContactAddMask", "removeMask OK: ".concat(str3));
                                                    } else {
                                                        C0186K3.a aVar3 = C0186K3.f638a;
                                                        MaskItemBean maskItemBean = new MaskItemBean(str3, str3, 0, null, null, 28, null);
                                                        aVar3.getClass();
                                                        C0186K3.a.m500a(maskItemBean);
                                                        Context context4 = C0889w1.f3488p;
                                                        if (context4 != null) {
                                                            C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                                            if (c0653jcM508i2.f2426R) {
                                                                String str6 = c0653jcM508i2.f2428T;
                                                                if (!C0034Be.m101P(str6)) {
                                                                    str4 = str6;
                                                                }
                                                                Toast.makeText(context4, str4, 0).show();
                                                            }
                                                        }
                                                        Log.e("ContactAddMask", "addMask OK: " + str3);
                                                    }
                                                    C0664k4 c0664k4 = C0816s4.f3224M;
                                                    if (c0664k4 != null) {
                                                        c0664k4.mo31a();
                                                    }
                                                    C0004A3 c0004a3 = C0611h8.f2257k;
                                                    if (c0004a3 != null) {
                                                        c0004a3.mo31a();
                                                        objM2206a8 = C0413Wf.f1577a;
                                                    } else {
                                                        objM2206a8 = null;
                                                    }
                                                } catch (Throwable th8) {
                                                    objM2206a8 = C0920xd.m2206a(th8);
                                                }
                                                Throwable thM2189a = C0901wd.m2189a(objM2206a8);
                                                if (thM2189a != null) {
                                                    Log.e("ContactAddMask", "consume fail", thM2189a);
                                                }
                                                c0329s34.f1165b = false;
                                                c0329s34.f1164a = null;
                                                try {
                                                    Object obj4 = c0329s34.f1168e;
                                                    if (obj4 != null) {
                                                        Method[] methods = obj4.getClass().getMethods();
                                                        C0631i9.m1481d(methods, "getMethods(...)");
                                                        int length = methods.length;
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (i5 < length) {
                                                                method3 = methods[i5];
                                                                if (C0631i9.m1478a(method3.getName(), "a")) {
                                                                    Class<?>[] parameterTypes = method3.getParameterTypes();
                                                                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                                                    if (parameterTypes.length == 0) {
                                                                    }
                                                                }
                                                                i5++;
                                                            } else {
                                                                method3 = null;
                                                            }
                                                        }
                                                        if (method3 != null) {
                                                            method3.invoke(obj4, null);
                                                        } else {
                                                            Field[] declaredFields = obj4.getClass().getDeclaredFields();
                                                            C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                                                            int length2 = declaredFields.length;
                                                            int i6 = 0;
                                                            while (true) {
                                                                if (i6 < length2) {
                                                                    field = declaredFields[i6];
                                                                    if (!field.getType().getName().equals("kc5.d5")) {
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    field = null;
                                                                }
                                                            }
                                                            if (field != null) {
                                                                field.setAccessible(true);
                                                            }
                                                            if (field != null && (obj2 = field.get(obj4)) != null) {
                                                                Method[] methods2 = obj2.getClass().getMethods();
                                                                C0631i9.m1481d(methods2, "getMethods(...)");
                                                                int length3 = methods2.length;
                                                                while (true) {
                                                                    if (i4 < length3) {
                                                                        method4 = methods2[i4];
                                                                        if (C0631i9.m1478a(method4.getName(), "dismiss")) {
                                                                            Class<?>[] parameterTypes2 = method4.getParameterTypes();
                                                                            C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
                                                                            if (parameterTypes2.length == 0) {
                                                                            }
                                                                        }
                                                                        i4++;
                                                                    } else {
                                                                        method4 = null;
                                                                    }
                                                                }
                                                                if (method4 != null) {
                                                                    method4.invoke(obj2, null);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    objM2206a9 = C0413Wf.f1577a;
                                                } catch (Throwable th9) {
                                                    objM2206a9 = C0920xd.m2206a(th9);
                                                }
                                                Throwable thM2189a2 = C0901wd.m2189a(objM2206a9);
                                                if (thM2189a2 != null) {
                                                    Log.e("ContactAddMask", "dismiss fail", thM2189a2);
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            return C0413Wf.f1577a;
                    }
                }
            });
            try {
                Method[] declaredMethods3 = classLoader.loadClass("com.tencent.mm.ui.base.MMListPopupWindow").getDeclaredMethods();
                C0631i9.m1481d(declaredMethods3, "getDeclaredMethods(...)");
                ArrayList<Method> arrayList2 = new ArrayList();
                for (Method method3 : declaredMethods3) {
                    if (C0631i9.m1478a(method3.getReturnType(), Void.TYPE)) {
                        arrayList2.add(method3);
                    }
                }
                for (Method method4 : arrayList2) {
                    C0631i9.m1479b(method4);
                    final int i4 = 2;
                    C0173J8.m469h(c0173j8, "F004", method4, new InterfaceC0064D7(this) { // from class: a.R3

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0329S3 f1116b;

                        {
                            this.f1116b = this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:116:0x01ce  */
                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object mo53f(Object obj) {
                            String str;
                            Context context2;
                            String str2;
                            Object objM2206a7;
                            Object objM2206a8;
                            Object objM2206a9;
                            Method method32;
                            Field field;
                            Object obj2;
                            Method method42;
                            int i42 = 0;
                            switch (i4) {
                                case 0:
                                    C0329S3 c0329s3 = this.f1116b;
                                    XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain, "chain");
                                    try {
                                        List args = chain.getArgs();
                                        C0631i9.m1481d(args, "getArgs(...)");
                                        c0329s3.f1164a = C0329S3.m908b(C0834t3.m1951o0(args, 1));
                                        c0329s3.f1165b = true;
                                        C0413Wf c0413Wf = C0413Wf.f1577a;
                                        break;
                                    } catch (Throwable th6) {
                                        C0920xd.m2206a(th6);
                                    }
                                    return chain.proceed();
                                case 1:
                                    C0329S3 c0329s32 = this.f1116b;
                                    XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain2, "chain");
                                    Object obj3 = chain2.getArgs().get(0);
                                    if (obj3 != null) {
                                        Class<?> cls5 = c0329s32.f1167d;
                                        C0631i9.m1479b(cls5);
                                        if (cls5.isInstance(obj3)) {
                                            C0186K3.f638a.getClass();
                                            if (C0186K3.a.m511l() && C0186K3.a.m508i().f2410B && c0329s32.f1165b && (str = c0329s32.f1164a) != null && !C0034Be.m101P(str) && (context2 = C0889w1.f3488p) != null) {
                                                ExecutorService executorService = C0582fh.f2149G;
                                                boolean zM1423a = C0582fh.a.m1423a(str);
                                                if (zM1423a) {
                                                    str2 = "取消密友";
                                                } else {
                                                    str2 = C0186K3.a.m508i().f2411C;
                                                    if (C0034Be.m101P(str2)) {
                                                        str2 = "加入密友";
                                                    }
                                                }
                                                C0329S3.a aVar = new C0329S3.a((BaseAdapter) obj3, str, context2, str2);
                                                Object thisObject = chain2.getThisObject();
                                                C0631i9.m1480c(thisObject, "null cannot be cast to non-null type android.widget.ListView");
                                                ((ListView) thisObject).setAdapter((ListAdapter) aVar);
                                                Log.e("ContactAddMask", "wrap OK: '" + str2 + "' wxid=" + str + " masked=" + zM1423a);
                                                return null;
                                            }
                                        }
                                    }
                                    return chain2.proceed();
                                case 2:
                                    C0329S3 c0329s33 = this.f1116b;
                                    XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain3, "chain");
                                    chain3.proceed();
                                    try {
                                        Object thisObject2 = chain3.getThisObject();
                                        C0631i9.m1481d(thisObject2, "getThisObject(...)");
                                        c0329s33.m909a(thisObject2);
                                        objM2206a7 = C0413Wf.f1577a;
                                        break;
                                    } catch (Throwable th7) {
                                        objM2206a7 = C0920xd.m2206a(th7);
                                    }
                                    return new C0901wd(objM2206a7);
                                default:
                                    C0329S3 c0329s34 = this.f1116b;
                                    XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain4, "chain");
                                    List args2 = chain4.getArgs();
                                    C0631i9.m1481d(args2, "getArgs(...)");
                                    Object objM1951o0 = C0834t3.m1951o0(args2, 0);
                                    AdapterView adapterView = objM1951o0 instanceof AdapterView ? (AdapterView) objM1951o0 : null;
                                    if (adapterView == null) {
                                        chain4.proceed();
                                    } else {
                                        List args3 = chain4.getArgs();
                                        C0631i9.m1481d(args3, "getArgs(...)");
                                        Object objM1951o02 = C0834t3.m1951o0(args3, 2);
                                        Integer num = objM1951o02 instanceof Integer ? (Integer) objM1951o02 : null;
                                        if (num != null) {
                                            int iIntValue = num.intValue();
                                            Object adapter = adapterView.getAdapter();
                                            if (adapter != null) {
                                                if (adapter instanceof HeaderViewListAdapter) {
                                                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                                                }
                                                if (adapter instanceof C0329S3.a) {
                                                    C0329S3.a aVar2 = (C0329S3.a) adapter;
                                                    if (iIntValue == aVar2.getCount() - 1) {
                                                        String str3 = aVar2.f1170b;
                                                        try {
                                                            ExecutorService executorService2 = C0582fh.f2149G;
                                                            String str4 = "刻舟求剑";
                                                            if (C0582fh.a.m1423a(str3)) {
                                                                C0186K3.f638a.getClass();
                                                                C0186K3.a.m514o(str3);
                                                                Context context3 = C0889w1.f3488p;
                                                                if (context3 != null) {
                                                                    C0653jc c0653jcM508i = C0186K3.a.m508i();
                                                                    if (c0653jcM508i.f2426R) {
                                                                        String str5 = c0653jcM508i.f2429U;
                                                                        if (!C0034Be.m101P(str5)) {
                                                                            str4 = str5;
                                                                        }
                                                                        Toast.makeText(context3, str4, 0).show();
                                                                    }
                                                                }
                                                                Log.e("ContactAddMask", "removeMask OK: ".concat(str3));
                                                            } else {
                                                                C0186K3.a aVar3 = C0186K3.f638a;
                                                                MaskItemBean maskItemBean = new MaskItemBean(str3, str3, 0, null, null, 28, null);
                                                                aVar3.getClass();
                                                                C0186K3.a.m500a(maskItemBean);
                                                                Context context4 = C0889w1.f3488p;
                                                                if (context4 != null) {
                                                                    C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                                                    if (c0653jcM508i2.f2426R) {
                                                                        String str6 = c0653jcM508i2.f2428T;
                                                                        if (!C0034Be.m101P(str6)) {
                                                                            str4 = str6;
                                                                        }
                                                                        Toast.makeText(context4, str4, 0).show();
                                                                    }
                                                                }
                                                                Log.e("ContactAddMask", "addMask OK: " + str3);
                                                            }
                                                            C0664k4 c0664k4 = C0816s4.f3224M;
                                                            if (c0664k4 != null) {
                                                                c0664k4.mo31a();
                                                            }
                                                            C0004A3 c0004a3 = C0611h8.f2257k;
                                                            if (c0004a3 != null) {
                                                                c0004a3.mo31a();
                                                                objM2206a8 = C0413Wf.f1577a;
                                                            } else {
                                                                objM2206a8 = null;
                                                            }
                                                        } catch (Throwable th8) {
                                                            objM2206a8 = C0920xd.m2206a(th8);
                                                        }
                                                        Throwable thM2189a = C0901wd.m2189a(objM2206a8);
                                                        if (thM2189a != null) {
                                                            Log.e("ContactAddMask", "consume fail", thM2189a);
                                                        }
                                                        c0329s34.f1165b = false;
                                                        c0329s34.f1164a = null;
                                                        try {
                                                            Object obj4 = c0329s34.f1168e;
                                                            if (obj4 != null) {
                                                                Method[] methods = obj4.getClass().getMethods();
                                                                C0631i9.m1481d(methods, "getMethods(...)");
                                                                int length = methods.length;
                                                                int i5 = 0;
                                                                while (true) {
                                                                    if (i5 < length) {
                                                                        method32 = methods[i5];
                                                                        if (C0631i9.m1478a(method32.getName(), "a")) {
                                                                            Class<?>[] parameterTypes = method32.getParameterTypes();
                                                                            C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                                                            if (parameterTypes.length == 0) {
                                                                            }
                                                                        }
                                                                        i5++;
                                                                    } else {
                                                                        method32 = null;
                                                                    }
                                                                }
                                                                if (method32 != null) {
                                                                    method32.invoke(obj4, null);
                                                                } else {
                                                                    Field[] declaredFields = obj4.getClass().getDeclaredFields();
                                                                    C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                                                                    int length2 = declaredFields.length;
                                                                    int i6 = 0;
                                                                    while (true) {
                                                                        if (i6 < length2) {
                                                                            field = declaredFields[i6];
                                                                            if (!field.getType().getName().equals("kc5.d5")) {
                                                                                i6++;
                                                                            }
                                                                        } else {
                                                                            field = null;
                                                                        }
                                                                    }
                                                                    if (field != null) {
                                                                        field.setAccessible(true);
                                                                    }
                                                                    if (field != null && (obj2 = field.get(obj4)) != null) {
                                                                        Method[] methods2 = obj2.getClass().getMethods();
                                                                        C0631i9.m1481d(methods2, "getMethods(...)");
                                                                        int length3 = methods2.length;
                                                                        while (true) {
                                                                            if (i42 < length3) {
                                                                                method42 = methods2[i42];
                                                                                if (C0631i9.m1478a(method42.getName(), "dismiss")) {
                                                                                    Class<?>[] parameterTypes2 = method42.getParameterTypes();
                                                                                    C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
                                                                                    if (parameterTypes2.length == 0) {
                                                                                    }
                                                                                }
                                                                                i42++;
                                                                            } else {
                                                                                method42 = null;
                                                                            }
                                                                        }
                                                                        if (method42 != null) {
                                                                            method42.invoke(obj2, null);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            objM2206a9 = C0413Wf.f1577a;
                                                        } catch (Throwable th9) {
                                                            objM2206a9 = C0920xd.m2206a(th9);
                                                        }
                                                        Throwable thM2189a2 = C0901wd.m2189a(objM2206a9);
                                                        if (thM2189a2 != null) {
                                                            Log.e("ContactAddMask", "dismiss fail", thM2189a2);
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return C0413Wf.f1577a;
                            }
                        }
                    });
                }
                objM2206a6 = Integer.valueOf(Log.e("ContactAddMask", "MMListPopupWindow capture hooks registered"));
            } catch (Throwable th6) {
                objM2206a6 = C0920xd.m2206a(th6);
            }
            Throwable thM2189a = C0901wd.m2189a(objM2206a6);
            if (thM2189a != null) {
                Log.e("ContactAddMask", "MMListPopupWindow hook fail", thM2189a);
            }
            if (cls3 != null && (declaredMethods = cls3.getDeclaredMethods()) != null) {
                ArrayList<Method> arrayList3 = new ArrayList();
                int length = declaredMethods.length;
                while (i < length) {
                    Method method5 = declaredMethods[i];
                    if (C0631i9.m1478a(method5.getName(), "onItemClick") && method5.getParameterTypes().length == 4) {
                        arrayList3.add(method5);
                    }
                    i++;
                }
                for (Method method6 : arrayList3) {
                    C0631i9.m1479b(method6);
                    final int i5 = 3;
                    C0173J8.m469h(c0173j8, "F004", method6, new InterfaceC0064D7(this) { // from class: a.R3

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0329S3 f1116b;

                        {
                            this.f1116b = this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:116:0x01ce  */
                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object mo53f(Object obj) {
                            String str;
                            Context context2;
                            String str2;
                            Object objM2206a7;
                            Object objM2206a8;
                            Object objM2206a9;
                            Method method32;
                            Field field;
                            Object obj2;
                            Method method42;
                            int i42 = 0;
                            switch (i5) {
                                case 0:
                                    C0329S3 c0329s3 = this.f1116b;
                                    XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain, "chain");
                                    try {
                                        List args = chain.getArgs();
                                        C0631i9.m1481d(args, "getArgs(...)");
                                        c0329s3.f1164a = C0329S3.m908b(C0834t3.m1951o0(args, 1));
                                        c0329s3.f1165b = true;
                                        C0413Wf c0413Wf = C0413Wf.f1577a;
                                        break;
                                    } catch (Throwable th62) {
                                        C0920xd.m2206a(th62);
                                    }
                                    return chain.proceed();
                                case 1:
                                    C0329S3 c0329s32 = this.f1116b;
                                    XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain2, "chain");
                                    Object obj3 = chain2.getArgs().get(0);
                                    if (obj3 != null) {
                                        Class<?> cls5 = c0329s32.f1167d;
                                        C0631i9.m1479b(cls5);
                                        if (cls5.isInstance(obj3)) {
                                            C0186K3.f638a.getClass();
                                            if (C0186K3.a.m511l() && C0186K3.a.m508i().f2410B && c0329s32.f1165b && (str = c0329s32.f1164a) != null && !C0034Be.m101P(str) && (context2 = C0889w1.f3488p) != null) {
                                                ExecutorService executorService = C0582fh.f2149G;
                                                boolean zM1423a = C0582fh.a.m1423a(str);
                                                if (zM1423a) {
                                                    str2 = "取消密友";
                                                } else {
                                                    str2 = C0186K3.a.m508i().f2411C;
                                                    if (C0034Be.m101P(str2)) {
                                                        str2 = "加入密友";
                                                    }
                                                }
                                                C0329S3.a aVar = new C0329S3.a((BaseAdapter) obj3, str, context2, str2);
                                                Object thisObject = chain2.getThisObject();
                                                C0631i9.m1480c(thisObject, "null cannot be cast to non-null type android.widget.ListView");
                                                ((ListView) thisObject).setAdapter((ListAdapter) aVar);
                                                Log.e("ContactAddMask", "wrap OK: '" + str2 + "' wxid=" + str + " masked=" + zM1423a);
                                                return null;
                                            }
                                        }
                                    }
                                    return chain2.proceed();
                                case 2:
                                    C0329S3 c0329s33 = this.f1116b;
                                    XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain3, "chain");
                                    chain3.proceed();
                                    try {
                                        Object thisObject2 = chain3.getThisObject();
                                        C0631i9.m1481d(thisObject2, "getThisObject(...)");
                                        c0329s33.m909a(thisObject2);
                                        objM2206a7 = C0413Wf.f1577a;
                                        break;
                                    } catch (Throwable th7) {
                                        objM2206a7 = C0920xd.m2206a(th7);
                                    }
                                    return new C0901wd(objM2206a7);
                                default:
                                    C0329S3 c0329s34 = this.f1116b;
                                    XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain4, "chain");
                                    List args2 = chain4.getArgs();
                                    C0631i9.m1481d(args2, "getArgs(...)");
                                    Object objM1951o0 = C0834t3.m1951o0(args2, 0);
                                    AdapterView adapterView = objM1951o0 instanceof AdapterView ? (AdapterView) objM1951o0 : null;
                                    if (adapterView == null) {
                                        chain4.proceed();
                                    } else {
                                        List args3 = chain4.getArgs();
                                        C0631i9.m1481d(args3, "getArgs(...)");
                                        Object objM1951o02 = C0834t3.m1951o0(args3, 2);
                                        Integer num = objM1951o02 instanceof Integer ? (Integer) objM1951o02 : null;
                                        if (num != null) {
                                            int iIntValue = num.intValue();
                                            Object adapter = adapterView.getAdapter();
                                            if (adapter != null) {
                                                if (adapter instanceof HeaderViewListAdapter) {
                                                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                                                }
                                                if (adapter instanceof C0329S3.a) {
                                                    C0329S3.a aVar2 = (C0329S3.a) adapter;
                                                    if (iIntValue == aVar2.getCount() - 1) {
                                                        String str3 = aVar2.f1170b;
                                                        try {
                                                            ExecutorService executorService2 = C0582fh.f2149G;
                                                            String str4 = "刻舟求剑";
                                                            if (C0582fh.a.m1423a(str3)) {
                                                                C0186K3.f638a.getClass();
                                                                C0186K3.a.m514o(str3);
                                                                Context context3 = C0889w1.f3488p;
                                                                if (context3 != null) {
                                                                    C0653jc c0653jcM508i = C0186K3.a.m508i();
                                                                    if (c0653jcM508i.f2426R) {
                                                                        String str5 = c0653jcM508i.f2429U;
                                                                        if (!C0034Be.m101P(str5)) {
                                                                            str4 = str5;
                                                                        }
                                                                        Toast.makeText(context3, str4, 0).show();
                                                                    }
                                                                }
                                                                Log.e("ContactAddMask", "removeMask OK: ".concat(str3));
                                                            } else {
                                                                C0186K3.a aVar3 = C0186K3.f638a;
                                                                MaskItemBean maskItemBean = new MaskItemBean(str3, str3, 0, null, null, 28, null);
                                                                aVar3.getClass();
                                                                C0186K3.a.m500a(maskItemBean);
                                                                Context context4 = C0889w1.f3488p;
                                                                if (context4 != null) {
                                                                    C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                                                    if (c0653jcM508i2.f2426R) {
                                                                        String str6 = c0653jcM508i2.f2428T;
                                                                        if (!C0034Be.m101P(str6)) {
                                                                            str4 = str6;
                                                                        }
                                                                        Toast.makeText(context4, str4, 0).show();
                                                                    }
                                                                }
                                                                Log.e("ContactAddMask", "addMask OK: " + str3);
                                                            }
                                                            C0664k4 c0664k4 = C0816s4.f3224M;
                                                            if (c0664k4 != null) {
                                                                c0664k4.mo31a();
                                                            }
                                                            C0004A3 c0004a3 = C0611h8.f2257k;
                                                            if (c0004a3 != null) {
                                                                c0004a3.mo31a();
                                                                objM2206a8 = C0413Wf.f1577a;
                                                            } else {
                                                                objM2206a8 = null;
                                                            }
                                                        } catch (Throwable th8) {
                                                            objM2206a8 = C0920xd.m2206a(th8);
                                                        }
                                                        Throwable thM2189a2 = C0901wd.m2189a(objM2206a8);
                                                        if (thM2189a2 != null) {
                                                            Log.e("ContactAddMask", "consume fail", thM2189a2);
                                                        }
                                                        c0329s34.f1165b = false;
                                                        c0329s34.f1164a = null;
                                                        try {
                                                            Object obj4 = c0329s34.f1168e;
                                                            if (obj4 != null) {
                                                                Method[] methods = obj4.getClass().getMethods();
                                                                C0631i9.m1481d(methods, "getMethods(...)");
                                                                int length2 = methods.length;
                                                                int i52 = 0;
                                                                while (true) {
                                                                    if (i52 < length2) {
                                                                        method32 = methods[i52];
                                                                        if (C0631i9.m1478a(method32.getName(), "a")) {
                                                                            Class<?>[] parameterTypes = method32.getParameterTypes();
                                                                            C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                                                            if (parameterTypes.length == 0) {
                                                                            }
                                                                        }
                                                                        i52++;
                                                                    } else {
                                                                        method32 = null;
                                                                    }
                                                                }
                                                                if (method32 != null) {
                                                                    method32.invoke(obj4, null);
                                                                } else {
                                                                    Field[] declaredFields = obj4.getClass().getDeclaredFields();
                                                                    C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                                                                    int length22 = declaredFields.length;
                                                                    int i6 = 0;
                                                                    while (true) {
                                                                        if (i6 < length22) {
                                                                            field = declaredFields[i6];
                                                                            if (!field.getType().getName().equals("kc5.d5")) {
                                                                                i6++;
                                                                            }
                                                                        } else {
                                                                            field = null;
                                                                        }
                                                                    }
                                                                    if (field != null) {
                                                                        field.setAccessible(true);
                                                                    }
                                                                    if (field != null && (obj2 = field.get(obj4)) != null) {
                                                                        Method[] methods2 = obj2.getClass().getMethods();
                                                                        C0631i9.m1481d(methods2, "getMethods(...)");
                                                                        int length3 = methods2.length;
                                                                        while (true) {
                                                                            if (i42 < length3) {
                                                                                method42 = methods2[i42];
                                                                                if (C0631i9.m1478a(method42.getName(), "dismiss")) {
                                                                                    Class<?>[] parameterTypes2 = method42.getParameterTypes();
                                                                                    C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
                                                                                    if (parameterTypes2.length == 0) {
                                                                                    }
                                                                                }
                                                                                i42++;
                                                                            } else {
                                                                                method42 = null;
                                                                            }
                                                                        }
                                                                        if (method42 != null) {
                                                                            method42.invoke(obj2, null);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            objM2206a9 = C0413Wf.f1577a;
                                                        } catch (Throwable th9) {
                                                            objM2206a9 = C0920xd.m2206a(th9);
                                                        }
                                                        Throwable thM2189a22 = C0901wd.m2189a(objM2206a9);
                                                        if (thM2189a22 != null) {
                                                            Log.e("ContactAddMask", "dismiss fail", thM2189a22);
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return C0413Wf.f1577a;
                            }
                        }
                    });
                }
            }
            this.f1166c = true;
            objM2206a = Integer.valueOf(Log.e("ContactAddMask", "ym5 hook OK (ah5.b0.r / ListView.setAdapter / MMListPopupWindow / ym5.i&r.onItemClick)"));
            Throwable thM2189a2 = C0901wd.m2189a(objM2206a);
            if (thM2189a2 != null) {
                Log.e("ContactAddMask", "ym5 hook fail", thM2189a2);
                return;
            }
            return;
        }
        C0647j6 c0647j6 = c0597gdM1467a.f2210c;
        Log.w("ContactAddMask", "tryHookYm5: F004_contact_add_mask resolve FAILED: " + (c0647j6 != null ? c0647j6.f2390c : null));
    }
}
