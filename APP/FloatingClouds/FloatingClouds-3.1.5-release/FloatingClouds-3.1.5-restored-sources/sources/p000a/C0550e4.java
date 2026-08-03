package p000a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0550e4 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public volatile String f2038a;

    /* JADX INFO: renamed from: b */
    public volatile long f2039b;

    /* JADX INFO: renamed from: c */
    public final Handler f2040c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static boolean m1325b(MenuItem menuItem) {
        if (menuItem.getItemId() == 1835102465) {
            return true;
        }
        CharSequence title = menuItem.getTitle();
        String string = title != null ? title.toString() : null;
        C0186K3.f638a.getClass();
        String str = C0186K3.a.m508i().f2411C;
        if (C0034Be.m101P(str)) {
            str = "加入密友";
        }
        return C0631i9.m1478a(string, str) || C0631i9.m1478a(string, "取消密友");
    }

    /* JADX INFO: renamed from: c */
    public static String m1326c(Object obj) throws IllegalAccessException {
        Object objM2206a;
        try {
            Object objM19h = C0002A1.m19h(obj, "field_username");
            objM2206a = objM19h instanceof String ? (String) objM19h : null;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (objM2206a instanceof C0901wd.a) {
            objM2206a = null;
        }
        String str = (String) objM2206a;
        if (str != null && !C0034Be.m101P(str)) {
            return str;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (C0631i9.m1478a(field.getType(), String.class)) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 != null && C0943yh.m2221a(str2)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1327a() {
        String str = this.f2038a;
        if (str == null) {
            return;
        }
        this.f2038a = null;
        ExecutorService executorService = C0582fh.f2149G;
        if (C0582fh.a.m1423a(str)) {
            C0186K3.a aVar = C0186K3.f638a;
            aVar.getClass();
            C0186K3.a.m514o(str);
            Context context = C0889w1.f3488p;
            if (context != null) {
                aVar.getClass();
                C0653jc c0653jcM508i = C0186K3.a.m508i();
                if (c0653jcM508i.f2426R) {
                    String str2 = c0653jcM508i.f2429U;
                    Toast.makeText(context, C0034Be.m101P(str2) ? "刻舟求剑" : str2, 0).show();
                }
            }
            Log.e("CAM", "removeMask OK: ".concat(str));
        } else {
            C0186K3.a aVar2 = C0186K3.f638a;
            MaskItemBean maskItemBean = new MaskItemBean(str, str, 0, null, null, 28, null);
            aVar2.getClass();
            C0186K3.a.m500a(maskItemBean);
            Context context2 = C0889w1.f3488p;
            if (context2 != null) {
                aVar2.getClass();
                C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                if (c0653jcM508i2.f2426R) {
                    String str3 = c0653jcM508i2.f2428T;
                    Toast.makeText(context2, C0034Be.m101P(str3) ? "刻舟求剑" : str3, 0).show();
                }
            }
            Log.e("CAM", "addMask OK: ".concat(str));
        }
        C0664k4 c0664k4 = C0816s4.f3224M;
        if (c0664k4 != null) {
            c0664k4.mo31a();
        }
        C0004A3 c0004a3 = C0611h8.f2257k;
        if (c0004a3 != null) {
            c0004a3.mo31a();
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        ClassLoader classLoader;
        Class cls;
        int i;
        Object objM2206a;
        Object objM2206a2;
        final int i2 = 0;
        final int i3 = 1;
        C0631i9.m1482e(c0173j8, "session");
        Log.e("CAM", "handleHook START");
        String[] strArr = {"com.tencent.mm.ui.conversation.m3", "com.tencent.mm.ui.conversation.n3", "com.tencent.mm.ui.conversation.r3"};
        int i4 = 0;
        boolean z = false;
        while (true) {
            classLoader = c0173j8.f608a;
            if (i4 >= 3) {
                break;
            }
            String str = strArr[i4];
            if (z) {
                break;
            }
            try {
                Method methodM16e = C0002A1.m16e(str, classLoader, "onCreateContextMenu", ContextMenu.class, View.class, ContextMenu.ContextMenuInfo.class);
                if (methodM16e != null) {
                    C0173J8.m468g(c0173j8, methodM16e, new InterfaceC0064D7(this) { // from class: a.d4

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0550e4 f1922b;

                        {
                            this.f1922b = this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:127:0x01f1  */
                        /* JADX WARN: Removed duplicated region for block: B:130:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object mo53f(Object obj) throws IllegalAccessException {
                            ListView listView;
                            ListAdapter adapter;
                            Object objM2206a3;
                            String strM1326c;
                            Object objM2206a4;
                            String strM1326c2;
                            Object objM2206a5;
                            String str2;
                            MenuItem menuItem;
                            switch (i2) {
                                case 0:
                                    C0550e4 c0550e4 = this.f1922b;
                                    XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain, "chain");
                                    Object obj2 = chain.getArgs().get(0);
                                    ContextMenu contextMenu = obj2 instanceof ContextMenu ? (ContextMenu) obj2 : null;
                                    Object obj3 = chain.getArgs().get(1);
                                    View view = obj3 instanceof View ? (View) obj3 : null;
                                    Object obj4 = chain.getArgs().get(2);
                                    ContextMenu.ContextMenuInfo contextMenuInfo = obj4 instanceof ContextMenu.ContextMenuInfo ? (ContextMenu.ContextMenuInfo) obj4 : null;
                                    if (contextMenu != null && view != null) {
                                        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = contextMenuInfo instanceof AdapterView.AdapterContextMenuInfo ? (AdapterView.AdapterContextMenuInfo) contextMenuInfo : null;
                                        int i5 = adapterContextMenuInfo != null ? adapterContextMenuInfo.position : -1;
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2409A) {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (jCurrentTimeMillis - c0550e4.f2039b >= 500) {
                                                c0550e4.f2039b = jCurrentTimeMillis;
                                                View view2 = view;
                                                while (true) {
                                                    if (view2 == null) {
                                                        view2 = null;
                                                    } else if (!(view2 instanceof ListView)) {
                                                        Object parent = view2.getParent();
                                                        view2 = parent instanceof View ? (View) parent : null;
                                                    }
                                                }
                                                if (view2 != null && (adapter = (listView = (ListView) view2).getAdapter()) != null) {
                                                    int headerViewsCount = listView.getHeaderViewsCount();
                                                    try {
                                                        objM2206a3 = ((ListView) view2).getItemAtPosition(i5);
                                                    } catch (Throwable th) {
                                                        objM2206a3 = C0920xd.m2206a(th);
                                                    }
                                                    strM1326c = C0550e4.m1326c(new C0901wd(objM2206a3));
                                                    if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                        if (headerViewsCount <= 0 || i5 < headerViewsCount) {
                                                            try {
                                                                objM2206a4 = adapter.getItem(i5);
                                                            } catch (Throwable th2) {
                                                                objM2206a4 = C0920xd.m2206a(th2);
                                                            }
                                                            strM1326c = C0550e4.m1326c(new C0901wd(objM2206a4));
                                                            if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                                View view3 = view;
                                                                for (int i6 = 0; view3 != null && i6 < 15; i6++) {
                                                                    Object tag = view3.getTag();
                                                                    if (tag == null || (strM1326c2 = C0550e4.m1326c(tag)) == null || C0034Be.m101P(strM1326c2)) {
                                                                        Object parent2 = view3.getParent();
                                                                        view3 = parent2 instanceof View ? (View) parent2 : null;
                                                                    } else {
                                                                        strM1326c = strM1326c2;
                                                                    }
                                                                }
                                                                strM1326c = null;
                                                            }
                                                        } else {
                                                            try {
                                                                objM2206a5 = adapter.getItem(i5 - headerViewsCount);
                                                            } catch (Throwable th3) {
                                                                objM2206a5 = C0920xd.m2206a(th3);
                                                            }
                                                            strM1326c = C0550e4.m1326c(new C0901wd(objM2206a5));
                                                            if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                            }
                                                        }
                                                    }
                                                    if (strM1326c != null || C0034Be.m101P(strM1326c)) {
                                                        Log.w("CAM", "inject: no wxid from view=".concat(view.getClass().getName()));
                                                    } else {
                                                        c0550e4.f2038a = strM1326c;
                                                        ExecutorService executorService = C0582fh.f2149G;
                                                        boolean zM1423a = C0582fh.a.m1423a(strM1326c);
                                                        if (zM1423a) {
                                                            str2 = "取消密友";
                                                        } else {
                                                            C0186K3.f638a.getClass();
                                                            str2 = C0186K3.a.m508i().f2411C;
                                                            if (C0034Be.m101P(str2)) {
                                                                str2 = "加入密友";
                                                            }
                                                        }
                                                        try {
                                                            contextMenu.add(0, 1835102465, 0, str2);
                                                            Log.e("CAM", "inject OK: '" + str2 + "' wxid=" + strM1326c + " masked=" + zM1423a);
                                                        } catch (Exception e) {
                                                            Log.e("CAM", "inject fail: " + e.getMessage(), e);
                                                        }
                                                        c0550e4.f2040c.removeCallbacksAndMessages(null);
                                                        c0550e4.f2040c.postDelayed(new RunnableC0221M2(5, c0550e4), 15000L);
                                                    }
                                                    break;
                                                } else {
                                                    strM1326c = null;
                                                    if (strM1326c != null) {
                                                        Log.w("CAM", "inject: no wxid from view=".concat(view.getClass().getName()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return chain.proceed();
                                case 1:
                                    XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain2, "chain");
                                    Object obj5 = chain2.getArgs().get(0);
                                    menuItem = obj5 instanceof MenuItem ? (MenuItem) obj5 : null;
                                    if (menuItem != null) {
                                        C0550e4 c0550e42 = this.f1922b;
                                        if (C0550e4.m1325b(menuItem)) {
                                            c0550e42.m1327a();
                                        }
                                    }
                                    return chain2.proceed();
                                default:
                                    XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain3, "chain");
                                    Object obj6 = chain3.getArgs().get(0);
                                    menuItem = obj6 instanceof MenuItem ? (MenuItem) obj6 : null;
                                    if (menuItem != null) {
                                        C0550e4 c0550e43 = this.f1922b;
                                        if (C0550e4.m1325b(menuItem)) {
                                            c0550e43.m1327a();
                                        }
                                    }
                                    return chain3.proceed();
                            }
                        }
                    });
                    Log.e("CAM", "conv onCreateContextMenu hooked: " + str);
                    z = true;
                }
                objM2206a2 = C0413Wf.f1577a;
            } catch (Throwable th) {
                objM2206a2 = C0920xd.m2206a(th);
            }
            Throwable thM2189a = C0901wd.m2189a(objM2206a2);
            if (thM2189a != null) {
                Log.w("CAM", "conv " + str + " fail: " + thM2189a.getMessage());
            }
            i4++;
        }
        if (!z) {
            Log.e("CAM", "!!! conv onCreateContextMenu NOT FOUND");
        }
        String[] strArr2 = {"com.tencent.mm.ui.conversation.k3", "com.tencent.mm.ui.conversation.l3", "com.tencent.mm.ui.conversation.p3"};
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            cls = Integer.TYPE;
            i = i2;
            if (i5 >= 3) {
                break;
            }
            String str2 = strArr2[i5];
            if (z2) {
                break;
            }
            try {
                Method methodM16e2 = C0002A1.m16e(str2, classLoader, "onMMMenuItemSelected", MenuItem.class, cls);
                if (methodM16e2 != null) {
                    C0173J8.m468g(c0173j8, methodM16e2, new InterfaceC0064D7(this) { // from class: a.d4

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0550e4 f1922b;

                        {
                            this.f1922b = this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:127:0x01f1  */
                        /* JADX WARN: Removed duplicated region for block: B:130:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object mo53f(Object obj) throws IllegalAccessException {
                            ListView listView;
                            ListAdapter adapter;
                            Object objM2206a3;
                            String strM1326c;
                            Object objM2206a4;
                            String strM1326c2;
                            Object objM2206a5;
                            String str22;
                            MenuItem menuItem;
                            switch (i3) {
                                case 0:
                                    C0550e4 c0550e4 = this.f1922b;
                                    XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain, "chain");
                                    Object obj2 = chain.getArgs().get(0);
                                    ContextMenu contextMenu = obj2 instanceof ContextMenu ? (ContextMenu) obj2 : null;
                                    Object obj3 = chain.getArgs().get(1);
                                    View view = obj3 instanceof View ? (View) obj3 : null;
                                    Object obj4 = chain.getArgs().get(2);
                                    ContextMenu.ContextMenuInfo contextMenuInfo = obj4 instanceof ContextMenu.ContextMenuInfo ? (ContextMenu.ContextMenuInfo) obj4 : null;
                                    if (contextMenu != null && view != null) {
                                        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = contextMenuInfo instanceof AdapterView.AdapterContextMenuInfo ? (AdapterView.AdapterContextMenuInfo) contextMenuInfo : null;
                                        int i52 = adapterContextMenuInfo != null ? adapterContextMenuInfo.position : -1;
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2409A) {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (jCurrentTimeMillis - c0550e4.f2039b >= 500) {
                                                c0550e4.f2039b = jCurrentTimeMillis;
                                                View view2 = view;
                                                while (true) {
                                                    if (view2 == null) {
                                                        view2 = null;
                                                    } else if (!(view2 instanceof ListView)) {
                                                        Object parent = view2.getParent();
                                                        view2 = parent instanceof View ? (View) parent : null;
                                                    }
                                                }
                                                if (view2 != null && (adapter = (listView = (ListView) view2).getAdapter()) != null) {
                                                    int headerViewsCount = listView.getHeaderViewsCount();
                                                    try {
                                                        objM2206a3 = ((ListView) view2).getItemAtPosition(i52);
                                                    } catch (Throwable th2) {
                                                        objM2206a3 = C0920xd.m2206a(th2);
                                                    }
                                                    strM1326c = C0550e4.m1326c(new C0901wd(objM2206a3));
                                                    if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                        if (headerViewsCount <= 0 || i52 < headerViewsCount) {
                                                            try {
                                                                objM2206a4 = adapter.getItem(i52);
                                                            } catch (Throwable th22) {
                                                                objM2206a4 = C0920xd.m2206a(th22);
                                                            }
                                                            strM1326c = C0550e4.m1326c(new C0901wd(objM2206a4));
                                                            if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                                View view3 = view;
                                                                for (int i6 = 0; view3 != null && i6 < 15; i6++) {
                                                                    Object tag = view3.getTag();
                                                                    if (tag == null || (strM1326c2 = C0550e4.m1326c(tag)) == null || C0034Be.m101P(strM1326c2)) {
                                                                        Object parent2 = view3.getParent();
                                                                        view3 = parent2 instanceof View ? (View) parent2 : null;
                                                                    } else {
                                                                        strM1326c = strM1326c2;
                                                                    }
                                                                }
                                                                strM1326c = null;
                                                            }
                                                        } else {
                                                            try {
                                                                objM2206a5 = adapter.getItem(i52 - headerViewsCount);
                                                            } catch (Throwable th3) {
                                                                objM2206a5 = C0920xd.m2206a(th3);
                                                            }
                                                            strM1326c = C0550e4.m1326c(new C0901wd(objM2206a5));
                                                            if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                            }
                                                        }
                                                    }
                                                    if (strM1326c != null || C0034Be.m101P(strM1326c)) {
                                                        Log.w("CAM", "inject: no wxid from view=".concat(view.getClass().getName()));
                                                    } else {
                                                        c0550e4.f2038a = strM1326c;
                                                        ExecutorService executorService = C0582fh.f2149G;
                                                        boolean zM1423a = C0582fh.a.m1423a(strM1326c);
                                                        if (zM1423a) {
                                                            str22 = "取消密友";
                                                        } else {
                                                            C0186K3.f638a.getClass();
                                                            str22 = C0186K3.a.m508i().f2411C;
                                                            if (C0034Be.m101P(str22)) {
                                                                str22 = "加入密友";
                                                            }
                                                        }
                                                        try {
                                                            contextMenu.add(0, 1835102465, 0, str22);
                                                            Log.e("CAM", "inject OK: '" + str22 + "' wxid=" + strM1326c + " masked=" + zM1423a);
                                                        } catch (Exception e) {
                                                            Log.e("CAM", "inject fail: " + e.getMessage(), e);
                                                        }
                                                        c0550e4.f2040c.removeCallbacksAndMessages(null);
                                                        c0550e4.f2040c.postDelayed(new RunnableC0221M2(5, c0550e4), 15000L);
                                                    }
                                                    break;
                                                } else {
                                                    strM1326c = null;
                                                    if (strM1326c != null) {
                                                        Log.w("CAM", "inject: no wxid from view=".concat(view.getClass().getName()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return chain.proceed();
                                case 1:
                                    XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain2, "chain");
                                    Object obj5 = chain2.getArgs().get(0);
                                    menuItem = obj5 instanceof MenuItem ? (MenuItem) obj5 : null;
                                    if (menuItem != null) {
                                        C0550e4 c0550e42 = this.f1922b;
                                        if (C0550e4.m1325b(menuItem)) {
                                            c0550e42.m1327a();
                                        }
                                    }
                                    return chain2.proceed();
                                default:
                                    XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                                    C0631i9.m1482e(chain3, "chain");
                                    Object obj6 = chain3.getArgs().get(0);
                                    menuItem = obj6 instanceof MenuItem ? (MenuItem) obj6 : null;
                                    if (menuItem != null) {
                                        C0550e4 c0550e43 = this.f1922b;
                                        if (C0550e4.m1325b(menuItem)) {
                                            c0550e43.m1327a();
                                        }
                                    }
                                    return chain3.proceed();
                            }
                        }
                    });
                    Log.e("CAM", "onMMMenuItemSelected hooked: " + str2);
                    z2 = true;
                }
                objM2206a = C0413Wf.f1577a;
            } catch (Throwable th2) {
                objM2206a = C0920xd.m2206a(th2);
            }
            Throwable thM2189a2 = C0901wd.m2189a(objM2206a);
            if (thM2189a2 != null) {
                Log.w("CAM", "conv " + str2 + " fail: " + thM2189a2.getMessage());
            }
            i5++;
            i2 = i;
        }
        if (!z2) {
            String str3 = new String[]{"com.tencent.mm.ui.conversation"}[i];
            String[] strArr3 = {C0944z.m2226f(str3, ".a"), C0944z.m2226f(str3, ".b"), C0944z.m2226f(str3, ".c"), C0944z.m2226f(str3, ".d"), C0944z.m2226f(str3, ".e"), C0944z.m2226f(str3, ".f"), C0944z.m2226f(str3, ".g"), C0944z.m2226f(str3, ".h"), C0944z.m2226f(str3, ".i"), C0944z.m2226f(str3, ".j"), C0944z.m2226f(str3, ".k3"), C0944z.m2226f(str3, ".l3"), C0944z.m2226f(str3, ".m3"), C0944z.m2226f(str3, ".n3"), C0944z.m2226f(str3, ".o3"), C0944z.m2226f(str3, ".p3"), C0944z.m2226f(str3, ".q3"), C0944z.m2226f(str3, ".r3"), C0944z.m2226f(str3, ".s3"), C0944z.m2226f(str3, ".t3")};
            int i6 = i;
            while (true) {
                if (i6 >= 20) {
                    Log.w("CAM", "onMMMenuItemSelected broad search failed");
                    break;
                }
                String str4 = strArr3[i6];
                try {
                    Method methodM16e3 = C0002A1.m16e(str4, classLoader, "onMMMenuItemSelected", MenuItem.class, cls);
                    if (methodM16e3 != null) {
                        final int i7 = 2;
                        C0173J8.m468g(c0173j8, methodM16e3, new InterfaceC0064D7(this) { // from class: a.d4

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C0550e4 f1922b;

                            {
                                this.f1922b = this;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:127:0x01f1  */
                            /* JADX WARN: Removed duplicated region for block: B:130:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // p000a.InterfaceC0064D7
                            /* JADX INFO: renamed from: f */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object mo53f(Object obj) throws IllegalAccessException {
                                ListView listView;
                                ListAdapter adapter;
                                Object objM2206a3;
                                String strM1326c;
                                Object objM2206a4;
                                String strM1326c2;
                                Object objM2206a5;
                                String str22;
                                MenuItem menuItem;
                                switch (i7) {
                                    case 0:
                                        C0550e4 c0550e4 = this.f1922b;
                                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                        C0631i9.m1482e(chain, "chain");
                                        Object obj2 = chain.getArgs().get(0);
                                        ContextMenu contextMenu = obj2 instanceof ContextMenu ? (ContextMenu) obj2 : null;
                                        Object obj3 = chain.getArgs().get(1);
                                        View view = obj3 instanceof View ? (View) obj3 : null;
                                        Object obj4 = chain.getArgs().get(2);
                                        ContextMenu.ContextMenuInfo contextMenuInfo = obj4 instanceof ContextMenu.ContextMenuInfo ? (ContextMenu.ContextMenuInfo) obj4 : null;
                                        if (contextMenu != null && view != null) {
                                            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = contextMenuInfo instanceof AdapterView.AdapterContextMenuInfo ? (AdapterView.AdapterContextMenuInfo) contextMenuInfo : null;
                                            int i52 = adapterContextMenuInfo != null ? adapterContextMenuInfo.position : -1;
                                            C0186K3.f638a.getClass();
                                            if (C0186K3.a.m511l() && C0186K3.a.m508i().f2409A) {
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                if (jCurrentTimeMillis - c0550e4.f2039b >= 500) {
                                                    c0550e4.f2039b = jCurrentTimeMillis;
                                                    View view2 = view;
                                                    while (true) {
                                                        if (view2 == null) {
                                                            view2 = null;
                                                        } else if (!(view2 instanceof ListView)) {
                                                            Object parent = view2.getParent();
                                                            view2 = parent instanceof View ? (View) parent : null;
                                                        }
                                                    }
                                                    if (view2 != null && (adapter = (listView = (ListView) view2).getAdapter()) != null) {
                                                        int headerViewsCount = listView.getHeaderViewsCount();
                                                        try {
                                                            objM2206a3 = ((ListView) view2).getItemAtPosition(i52);
                                                        } catch (Throwable th22) {
                                                            objM2206a3 = C0920xd.m2206a(th22);
                                                        }
                                                        strM1326c = C0550e4.m1326c(new C0901wd(objM2206a3));
                                                        if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                            if (headerViewsCount <= 0 || i52 < headerViewsCount) {
                                                                try {
                                                                    objM2206a4 = adapter.getItem(i52);
                                                                } catch (Throwable th222) {
                                                                    objM2206a4 = C0920xd.m2206a(th222);
                                                                }
                                                                strM1326c = C0550e4.m1326c(new C0901wd(objM2206a4));
                                                                if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                                    View view3 = view;
                                                                    for (int i62 = 0; view3 != null && i62 < 15; i62++) {
                                                                        Object tag = view3.getTag();
                                                                        if (tag == null || (strM1326c2 = C0550e4.m1326c(tag)) == null || C0034Be.m101P(strM1326c2)) {
                                                                            Object parent2 = view3.getParent();
                                                                            view3 = parent2 instanceof View ? (View) parent2 : null;
                                                                        } else {
                                                                            strM1326c = strM1326c2;
                                                                        }
                                                                    }
                                                                    strM1326c = null;
                                                                }
                                                            } else {
                                                                try {
                                                                    objM2206a5 = adapter.getItem(i52 - headerViewsCount);
                                                                } catch (Throwable th3) {
                                                                    objM2206a5 = C0920xd.m2206a(th3);
                                                                }
                                                                strM1326c = C0550e4.m1326c(new C0901wd(objM2206a5));
                                                                if (strM1326c == null || C0034Be.m101P(strM1326c)) {
                                                                }
                                                            }
                                                        }
                                                        if (strM1326c != null || C0034Be.m101P(strM1326c)) {
                                                            Log.w("CAM", "inject: no wxid from view=".concat(view.getClass().getName()));
                                                        } else {
                                                            c0550e4.f2038a = strM1326c;
                                                            ExecutorService executorService = C0582fh.f2149G;
                                                            boolean zM1423a = C0582fh.a.m1423a(strM1326c);
                                                            if (zM1423a) {
                                                                str22 = "取消密友";
                                                            } else {
                                                                C0186K3.f638a.getClass();
                                                                str22 = C0186K3.a.m508i().f2411C;
                                                                if (C0034Be.m101P(str22)) {
                                                                    str22 = "加入密友";
                                                                }
                                                            }
                                                            try {
                                                                contextMenu.add(0, 1835102465, 0, str22);
                                                                Log.e("CAM", "inject OK: '" + str22 + "' wxid=" + strM1326c + " masked=" + zM1423a);
                                                            } catch (Exception e) {
                                                                Log.e("CAM", "inject fail: " + e.getMessage(), e);
                                                            }
                                                            c0550e4.f2040c.removeCallbacksAndMessages(null);
                                                            c0550e4.f2040c.postDelayed(new RunnableC0221M2(5, c0550e4), 15000L);
                                                        }
                                                        break;
                                                    } else {
                                                        strM1326c = null;
                                                        if (strM1326c != null) {
                                                            Log.w("CAM", "inject: no wxid from view=".concat(view.getClass().getName()));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return chain.proceed();
                                    case 1:
                                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                        C0631i9.m1482e(chain2, "chain");
                                        Object obj5 = chain2.getArgs().get(0);
                                        menuItem = obj5 instanceof MenuItem ? (MenuItem) obj5 : null;
                                        if (menuItem != null) {
                                            C0550e4 c0550e42 = this.f1922b;
                                            if (C0550e4.m1325b(menuItem)) {
                                                c0550e42.m1327a();
                                            }
                                        }
                                        return chain2.proceed();
                                    default:
                                        XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                                        C0631i9.m1482e(chain3, "chain");
                                        Object obj6 = chain3.getArgs().get(0);
                                        menuItem = obj6 instanceof MenuItem ? (MenuItem) obj6 : null;
                                        if (menuItem != null) {
                                            C0550e4 c0550e43 = this.f1922b;
                                            if (C0550e4.m1325b(menuItem)) {
                                                c0550e43.m1327a();
                                            }
                                        }
                                        return chain3.proceed();
                                }
                            }
                        });
                        Log.e("CAM", "onMMMenuItemSelected hooked (broad): " + str4);
                        break;
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th3) {
                    C0920xd.m2206a(th3);
                }
                i6++;
            }
        }
        Log.e("CAM", "ready");
    }
}
