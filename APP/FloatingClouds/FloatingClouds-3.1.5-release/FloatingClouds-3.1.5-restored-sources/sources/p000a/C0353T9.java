package p000a;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
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
import java.util.List;
import p000a.C0186K3;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.T9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0353T9 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public volatile ListView f1287a;

    /* JADX INFO: renamed from: b */
    public boolean f1288b;

    /* JADX INFO: renamed from: c */
    public boolean f1289c;

    /* JADX INFO: renamed from: d */
    public float f1290d;

    /* JADX INFO: renamed from: e */
    public float f1291e;

    /* JADX INFO: renamed from: g */
    public final RunnableC0300Q9 f1293g;

    /* JADX INFO: renamed from: i */
    public boolean f1295i;

    /* JADX INFO: renamed from: j */
    public final RunnableC0300Q9 f1296j;

    /* JADX INFO: renamed from: l */
    public long f1298l;

    /* JADX INFO: renamed from: n */
    public boolean f1300n;

    /* JADX INFO: renamed from: o */
    public boolean f1301o;

    /* JADX INFO: renamed from: p */
    public boolean f1302p;

    /* JADX INFO: renamed from: q */
    public boolean f1303q;

    /* JADX INFO: renamed from: r */
    public float f1304r;

    /* JADX INFO: renamed from: s */
    public float f1305s;

    /* JADX INFO: renamed from: u */
    public final RunnableC0300Q9 f1307u;

    /* JADX INFO: renamed from: v */
    public final RunnableC0300Q9 f1308v;

    /* JADX INFO: renamed from: f */
    public final Handler f1292f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h */
    public final int f1294h = ViewConfiguration.getLongPressTimeout();

    /* JADX INFO: renamed from: k */
    public final long f1297k = 180;

    /* JADX INFO: renamed from: m */
    public final long f1299m = 500;

    /* JADX INFO: renamed from: t */
    public final Handler f1306t = new Handler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r0v1, types: [a.Q9] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.Q9] */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.Q9] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a.Q9] */
    public C0353T9() {
        final int i = 0;
        this.f1293g = new Runnable(this) { // from class: a.Q9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0353T9 f1094b;

            {
                this.f1094b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ListView listView;
                ListView listView2;
                Object objM2206a;
                switch (i) {
                    case 0:
                        C0353T9 c0353t9 = this.f1094b;
                        if (c0353t9.f1288b) {
                            c0353t9.f1288b = false;
                            c0353t9.f1289c = true;
                            if (c0353t9.f1295i) {
                                c0353t9.f1295i = false;
                                c0353t9.f1292f.removeCallbacks(c0353t9.f1296j);
                                Log.d("LC_TRACE", ">>> [PATH2_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t9.m956b() && (listView = c0353t9.f1287a) != null) {
                                int iPointToPosition = listView.pointToPosition((int) c0353t9.f1290d, (int) c0353t9.f1291e);
                                if (iPointToPosition >= 0) {
                                    ListAdapter adapter = listView.getAdapter();
                                    Log.d("LC_TRACE", ">>> [PATH2_HIT] dispatchTouchEvent long-press, position=" + iPointToPosition + " adapter=" + (adapter != null ? adapter.getClass().getName() : null));
                                    C0353T9.m954f(listView, listView, iPointToPosition);
                                } else {
                                    Log.d("LC_TRACE", ">>> [PATH2_SKIP] pointToPosition=" + iPointToPosition);
                                }
                            }
                        }
                        break;
                    case 1:
                        C0353T9 c0353t92 = this.f1094b;
                        if (c0353t92.f1295i) {
                            c0353t92.f1295i = false;
                            c0353t92.m955a();
                        }
                        break;
                    case 2:
                        C0353T9 c0353t93 = this.f1094b;
                        if (c0353t93.f1301o) {
                            c0353t93.f1301o = false;
                            c0353t93.f1303q = true;
                            if (c0353t93.f1302p) {
                                c0353t93.f1302p = false;
                                c0353t93.f1306t.removeCallbacks(c0353t93.f1308v);
                                Log.d("LC_TRACE", ">>> [PATH3_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t93.m956b() && (listView2 = c0353t93.f1287a) != null) {
                                try {
                                    listView2.getLocationOnScreen(new int[2]);
                                    objM2206a = C0413Wf.f1577a;
                                } catch (Throwable th) {
                                    objM2206a = C0920xd.m2206a(th);
                                }
                                if (!(objM2206a instanceof C0901wd.a)) {
                                    int iPointToPosition2 = listView2.pointToPosition((int) (c0353t93.f1304r - r5[0]), (int) (c0353t93.f1305s - r5[1]));
                                    if (iPointToPosition2 >= 0) {
                                        Log.d("LC_TRACE", ">>> [PATH3_HIT] Window.Callback long-press, position=" + iPointToPosition2);
                                        C0353T9.m954f(listView2, listView2, iPointToPosition2);
                                    } else {
                                        Log.d("LC_TRACE", ">>> [PATH3_SKIP] pointToPosition=" + iPointToPosition2);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        C0353T9 c0353t94 = this.f1094b;
                        if (c0353t94.f1302p) {
                            c0353t94.f1302p = false;
                            c0353t94.f1301o = false;
                            c0353t94.f1306t.removeCallbacks(c0353t94.f1307u);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1296j = new Runnable(this) { // from class: a.Q9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0353T9 f1094b;

            {
                this.f1094b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ListView listView;
                ListView listView2;
                Object objM2206a;
                switch (i2) {
                    case 0:
                        C0353T9 c0353t9 = this.f1094b;
                        if (c0353t9.f1288b) {
                            c0353t9.f1288b = false;
                            c0353t9.f1289c = true;
                            if (c0353t9.f1295i) {
                                c0353t9.f1295i = false;
                                c0353t9.f1292f.removeCallbacks(c0353t9.f1296j);
                                Log.d("LC_TRACE", ">>> [PATH2_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t9.m956b() && (listView = c0353t9.f1287a) != null) {
                                int iPointToPosition = listView.pointToPosition((int) c0353t9.f1290d, (int) c0353t9.f1291e);
                                if (iPointToPosition >= 0) {
                                    ListAdapter adapter = listView.getAdapter();
                                    Log.d("LC_TRACE", ">>> [PATH2_HIT] dispatchTouchEvent long-press, position=" + iPointToPosition + " adapter=" + (adapter != null ? adapter.getClass().getName() : null));
                                    C0353T9.m954f(listView, listView, iPointToPosition);
                                } else {
                                    Log.d("LC_TRACE", ">>> [PATH2_SKIP] pointToPosition=" + iPointToPosition);
                                }
                            }
                        }
                        break;
                    case 1:
                        C0353T9 c0353t92 = this.f1094b;
                        if (c0353t92.f1295i) {
                            c0353t92.f1295i = false;
                            c0353t92.m955a();
                        }
                        break;
                    case 2:
                        C0353T9 c0353t93 = this.f1094b;
                        if (c0353t93.f1301o) {
                            c0353t93.f1301o = false;
                            c0353t93.f1303q = true;
                            if (c0353t93.f1302p) {
                                c0353t93.f1302p = false;
                                c0353t93.f1306t.removeCallbacks(c0353t93.f1308v);
                                Log.d("LC_TRACE", ">>> [PATH3_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t93.m956b() && (listView2 = c0353t93.f1287a) != null) {
                                try {
                                    listView2.getLocationOnScreen(new int[2]);
                                    objM2206a = C0413Wf.f1577a;
                                } catch (Throwable th) {
                                    objM2206a = C0920xd.m2206a(th);
                                }
                                if (!(objM2206a instanceof C0901wd.a)) {
                                    int iPointToPosition2 = listView2.pointToPosition((int) (c0353t93.f1304r - r5[0]), (int) (c0353t93.f1305s - r5[1]));
                                    if (iPointToPosition2 >= 0) {
                                        Log.d("LC_TRACE", ">>> [PATH3_HIT] Window.Callback long-press, position=" + iPointToPosition2);
                                        C0353T9.m954f(listView2, listView2, iPointToPosition2);
                                    } else {
                                        Log.d("LC_TRACE", ">>> [PATH3_SKIP] pointToPosition=" + iPointToPosition2);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        C0353T9 c0353t94 = this.f1094b;
                        if (c0353t94.f1302p) {
                            c0353t94.f1302p = false;
                            c0353t94.f1301o = false;
                            c0353t94.f1306t.removeCallbacks(c0353t94.f1307u);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1307u = new Runnable(this) { // from class: a.Q9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0353T9 f1094b;

            {
                this.f1094b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ListView listView;
                ListView listView2;
                Object objM2206a;
                switch (i3) {
                    case 0:
                        C0353T9 c0353t9 = this.f1094b;
                        if (c0353t9.f1288b) {
                            c0353t9.f1288b = false;
                            c0353t9.f1289c = true;
                            if (c0353t9.f1295i) {
                                c0353t9.f1295i = false;
                                c0353t9.f1292f.removeCallbacks(c0353t9.f1296j);
                                Log.d("LC_TRACE", ">>> [PATH2_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t9.m956b() && (listView = c0353t9.f1287a) != null) {
                                int iPointToPosition = listView.pointToPosition((int) c0353t9.f1290d, (int) c0353t9.f1291e);
                                if (iPointToPosition >= 0) {
                                    ListAdapter adapter = listView.getAdapter();
                                    Log.d("LC_TRACE", ">>> [PATH2_HIT] dispatchTouchEvent long-press, position=" + iPointToPosition + " adapter=" + (adapter != null ? adapter.getClass().getName() : null));
                                    C0353T9.m954f(listView, listView, iPointToPosition);
                                } else {
                                    Log.d("LC_TRACE", ">>> [PATH2_SKIP] pointToPosition=" + iPointToPosition);
                                }
                            }
                        }
                        break;
                    case 1:
                        C0353T9 c0353t92 = this.f1094b;
                        if (c0353t92.f1295i) {
                            c0353t92.f1295i = false;
                            c0353t92.m955a();
                        }
                        break;
                    case 2:
                        C0353T9 c0353t93 = this.f1094b;
                        if (c0353t93.f1301o) {
                            c0353t93.f1301o = false;
                            c0353t93.f1303q = true;
                            if (c0353t93.f1302p) {
                                c0353t93.f1302p = false;
                                c0353t93.f1306t.removeCallbacks(c0353t93.f1308v);
                                Log.d("LC_TRACE", ">>> [PATH3_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t93.m956b() && (listView2 = c0353t93.f1287a) != null) {
                                try {
                                    listView2.getLocationOnScreen(new int[2]);
                                    objM2206a = C0413Wf.f1577a;
                                } catch (Throwable th) {
                                    objM2206a = C0920xd.m2206a(th);
                                }
                                if (!(objM2206a instanceof C0901wd.a)) {
                                    int iPointToPosition2 = listView2.pointToPosition((int) (c0353t93.f1304r - r5[0]), (int) (c0353t93.f1305s - r5[1]));
                                    if (iPointToPosition2 >= 0) {
                                        Log.d("LC_TRACE", ">>> [PATH3_HIT] Window.Callback long-press, position=" + iPointToPosition2);
                                        C0353T9.m954f(listView2, listView2, iPointToPosition2);
                                    } else {
                                        Log.d("LC_TRACE", ">>> [PATH3_SKIP] pointToPosition=" + iPointToPosition2);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        C0353T9 c0353t94 = this.f1094b;
                        if (c0353t94.f1302p) {
                            c0353t94.f1302p = false;
                            c0353t94.f1301o = false;
                            c0353t94.f1306t.removeCallbacks(c0353t94.f1307u);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1308v = new Runnable(this) { // from class: a.Q9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0353T9 f1094b;

            {
                this.f1094b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ListView listView;
                ListView listView2;
                Object objM2206a;
                switch (i4) {
                    case 0:
                        C0353T9 c0353t9 = this.f1094b;
                        if (c0353t9.f1288b) {
                            c0353t9.f1288b = false;
                            c0353t9.f1289c = true;
                            if (c0353t9.f1295i) {
                                c0353t9.f1295i = false;
                                c0353t9.f1292f.removeCallbacks(c0353t9.f1296j);
                                Log.d("LC_TRACE", ">>> [PATH2_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t9.m956b() && (listView = c0353t9.f1287a) != null) {
                                int iPointToPosition = listView.pointToPosition((int) c0353t9.f1290d, (int) c0353t9.f1291e);
                                if (iPointToPosition >= 0) {
                                    ListAdapter adapter = listView.getAdapter();
                                    Log.d("LC_TRACE", ">>> [PATH2_HIT] dispatchTouchEvent long-press, position=" + iPointToPosition + " adapter=" + (adapter != null ? adapter.getClass().getName() : null));
                                    C0353T9.m954f(listView, listView, iPointToPosition);
                                } else {
                                    Log.d("LC_TRACE", ">>> [PATH2_SKIP] pointToPosition=" + iPointToPosition);
                                }
                            }
                        }
                        break;
                    case 1:
                        C0353T9 c0353t92 = this.f1094b;
                        if (c0353t92.f1295i) {
                            c0353t92.f1295i = false;
                            c0353t92.m955a();
                        }
                        break;
                    case 2:
                        C0353T9 c0353t93 = this.f1094b;
                        if (c0353t93.f1301o) {
                            c0353t93.f1301o = false;
                            c0353t93.f1303q = true;
                            if (c0353t93.f1302p) {
                                c0353t93.f1302p = false;
                                c0353t93.f1306t.removeCallbacks(c0353t93.f1308v);
                                Log.d("LC_TRACE", ">>> [PATH3_CANCEL_TOLERANCE] long-press completed within tolerance window");
                            }
                            if (c0353t93.m956b() && (listView2 = c0353t93.f1287a) != null) {
                                try {
                                    listView2.getLocationOnScreen(new int[2]);
                                    objM2206a = C0413Wf.f1577a;
                                } catch (Throwable th) {
                                    objM2206a = C0920xd.m2206a(th);
                                }
                                if (!(objM2206a instanceof C0901wd.a)) {
                                    int iPointToPosition2 = listView2.pointToPosition((int) (c0353t93.f1304r - r5[0]), (int) (c0353t93.f1305s - r5[1]));
                                    if (iPointToPosition2 >= 0) {
                                        Log.d("LC_TRACE", ">>> [PATH3_HIT] Window.Callback long-press, position=" + iPointToPosition2);
                                        C0353T9.m954f(listView2, listView2, iPointToPosition2);
                                    } else {
                                        Log.d("LC_TRACE", ">>> [PATH3_SKIP] pointToPosition=" + iPointToPosition2);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        C0353T9 c0353t94 = this.f1094b;
                        if (c0353t94.f1302p) {
                            c0353t94.f1302p = false;
                            c0353t94.f1301o = false;
                            c0353t94.f1306t.removeCallbacks(c0353t94.f1307u);
                        }
                        break;
                }
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static Field m953d(Class cls, String str) {
        while (cls != null && !cls.equals(Object.class)) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0159  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m954f(AdapterView adapterView, View view, int i) {
        Adapter adapter;
        Object objM2206a;
        Adapter adapter2;
        Object objM2206a2;
        Activity activity;
        Class<?> cls;
        boolean z;
        Object objM2206a3;
        String string;
        Field fieldM953d;
        int i2 = 0;
        C0186K3.f638a.getClass();
        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2440j && C0186K3.a.m508i().f2441k && i >= 0 && (adapter = adapterView.getAdapter()) != null) {
            if (adapter instanceof HeaderViewListAdapter) {
                try {
                    objM2206a = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                if (objM2206a instanceof C0901wd.a) {
                    objM2206a = null;
                }
                ListAdapter listAdapter = (ListAdapter) objM2206a;
                if (listAdapter == null) {
                    listAdapter = (ListAdapter) adapter;
                }
                adapter2 = listAdapter;
            } else {
                adapter2 = adapter;
            }
            Field fieldM953d2 = m953d(adapter2.getClass(), "d");
            if (fieldM953d2 == null) {
                objM2206a2 = null;
                activity = !(objM2206a2 instanceof Activity) ? (Activity) objM2206a2 : null;
                if (activity == null && activity.getClass().getName().equals("com.tencent.mm.plugin.sns.ui.SnsUserUI")) {
                    Log.d("LC_TRACE", ">>> [ALBUM_HIT] SnsUserUI activity detected");
                } else {
                    cls = adapter2.getClass();
                    if (BaseAdapter.class.isAssignableFrom(cls) && C0015Ae.m49H(cls.getName(), "com.tencent.mm.plugin.sns.", false)) {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                        z = false;
                        boolean z2 = false;
                        for (Method method : declaredMethods) {
                            if (C0631i9.m1478a(method.getName(), "getView") && method.getParameterTypes().length == 3 && C0631i9.m1478a(method.getParameterTypes()[0], Integer.TYPE)) {
                                z = true;
                            }
                            if (C0631i9.m1478a(method.getName(), "getCount")) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                if (parameterTypes.length == 0) {
                                    z2 = true;
                                }
                            }
                        }
                        if (z && z2) {
                            Log.d("LC_TRACE", ">>> [ALBUM_HIT] dynamic sns BaseAdapter: ".concat(cls.getName()));
                        }
                    }
                    Log.d("LC_TRACE", ">>> [ADAPTER_SKIP] " + adapter.getClass().getName() + " -> " + adapter2.getClass().getName() + " (not album)");
                }
                try {
                    objM2206a3 = adapter.getItem(i);
                } catch (Throwable th2) {
                    objM2206a3 = C0920xd.m2206a(th2);
                }
                if (objM2206a3 instanceof C0901wd.a) {
                    objM2206a3 = null;
                }
                if (objM2206a3 != null) {
                    Class<?> cls2 = objM2206a3.getClass();
                    Field fieldM953d3 = m953d(cls2, "field_stringSeq");
                    if (fieldM953d3 != null) {
                        try {
                            fieldM953d3.setAccessible(true);
                            Object obj = fieldM953d3.get(objM2206a3);
                            string = obj != null ? obj.toString() : null;
                        } catch (Exception unused) {
                        }
                        if (string == null || string.length() == 0) {
                            Field fieldM953d4 = m953d(cls2, "field_snsId");
                            if (fieldM953d4 != null) {
                                try {
                                    fieldM953d4.setAccessible(true);
                                    Object obj2 = fieldM953d4.get(objM2206a3);
                                    string = obj2 != null ? obj2.toString() : null;
                                } catch (Exception unused2) {
                                }
                                if (string == null || string.length() == 0 || C0015Ae.m49H(string, "sns_table_", false)) {
                                    String str = "localid";
                                    if (m953d(cls2, "localid") == null) {
                                        str = "field_localId";
                                        if (m953d(cls2, "field_localId") == null) {
                                            str = null;
                                        }
                                    }
                                    if (str == null || (fieldM953d = m953d(cls2, str)) == null) {
                                        Log.e("LC_TRACE", ">>> [CRITICAL] All snsId strategies failed for ".concat(cls2.getName()));
                                        string = null;
                                    } else {
                                        try {
                                            fieldM953d.setAccessible(true);
                                            Object obj3 = fieldM953d.get(objM2206a3);
                                            String string2 = obj3 != null ? obj3.toString() : null;
                                            if (string2 != null && string2.length() != 0 && !string2.equals("-1") && !string2.equals("0")) {
                                                Log.w("LC_TRACE", ">>> [FALLBACK] localId: local_" + string2);
                                                string = "local_" + string2;
                                            }
                                        } catch (Exception unused3) {
                                        }
                                    }
                                } else {
                                    Log.d("LC_TRACE", ">>> [BACKUP] field_snsId: ".concat(string));
                                }
                            }
                        } else {
                            Log.d("LC_TRACE", ">>> [SUCCESS] field_stringSeq: " + string);
                        }
                        if (string != null) {
                            Log.d("LC_TRACE", ">>> [ALBUM_LONG_CLICK] position=" + i + " snsId=" + string);
                            Context context = adapterView.getContext();
                            if (context == null) {
                                context = view.getContext();
                            }
                            if (context != null) {
                                Log.d("LC_TRACE", ">>> [DIALOG_SHOW] building hide dialog, snsId=" + string + " context=" + context.getClass().getName());
                                Toast.makeText(context, "已识别朋友圈，弹出隐藏菜单", 0).show();
                                boolean z3 = (context.getResources().getConfiguration().uiMode & 48) == 32;
                                AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle("朋友圈隐藏").setMessage("SnsId: ".concat(string)).setNeutralButton("复制", new DialogInterfaceOnClickListenerC0246N9(string, context, i2)).setPositiveButton("加入隐藏", new DialogInterfaceOnClickListenerC0264O9(i2, string)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                                alertDialogCreate.setCanceledOnTouchOutside(false);
                                alertDialogCreate.show();
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setColor(z3 ? -13816531 : -1);
                                    gradientDrawable.setCornerRadius(16 * context.getResources().getDisplayMetrics().density);
                                    Window window = alertDialogCreate.getWindow();
                                    if (window != null) {
                                        window.setBackgroundDrawable(gradientDrawable);
                                    }
                                    int i3 = z3 ? -7288071 : -15108398;
                                    Button button = alertDialogCreate.getButton(-1);
                                    if (button != null) {
                                        button.setTextColor(i3);
                                    }
                                    Button button2 = alertDialogCreate.getButton(-2);
                                    if (button2 != null) {
                                        button2.setTextColor(i3);
                                    }
                                    Button button3 = alertDialogCreate.getButton(-3);
                                    if (button3 != null) {
                                        button3.setTextColor(i3);
                                    }
                                    int i4 = z3 ? -2039584 : -14606047;
                                    TextView textView = (TextView) alertDialogCreate.findViewById(R.id.title);
                                    if (textView != null) {
                                        textView.setTextColor(i4);
                                    }
                                    TextView textView2 = (TextView) alertDialogCreate.findViewById(R.id.message);
                                    if (textView2 != null) {
                                        textView2.setTextColor(z3 ? -6250336 : -7829368);
                                        C0413Wf c0413Wf = C0413Wf.f1577a;
                                    }
                                } catch (Throwable th3) {
                                    C0920xd.m2206a(th3);
                                }
                                Log.d("LC_TRACE", ">>> [DIALOG_SHOWN] dialog.show() returned, isShowing=" + alertDialogCreate.isShowing());
                            }
                            return true;
                        }
                    }
                }
            } else {
                try {
                    fieldM953d2.setAccessible(true);
                    objM2206a2 = fieldM953d2.get(adapter2);
                } catch (Throwable th4) {
                    objM2206a2 = C0920xd.m2206a(th4);
                }
                if (objM2206a2 instanceof C0901wd.a) {
                }
                if (!(objM2206a2 instanceof Activity)) {
                }
                if (activity == null) {
                    cls = adapter2.getClass();
                    if (BaseAdapter.class.isAssignableFrom(cls)) {
                        Method[] declaredMethods2 = cls.getDeclaredMethods();
                        C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
                        z = false;
                        boolean z22 = false;
                        while (i < r9) {
                        }
                        if (z) {
                            Log.d("LC_TRACE", ">>> [ALBUM_HIT] dynamic sns BaseAdapter: ".concat(cls.getName()));
                            objM2206a3 = adapter.getItem(i);
                            if (objM2206a3 instanceof C0901wd.a) {
                            }
                            if (objM2206a3 != null) {
                            }
                        }
                    }
                    Log.d("LC_TRACE", ">>> [ADAPTER_SKIP] " + adapter.getClass().getName() + " -> " + adapter2.getClass().getName() + " (not album)");
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m955a() {
        this.f1288b = false;
        this.f1295i = false;
        Handler handler = this.f1292f;
        handler.removeCallbacks(this.f1293g);
        handler.removeCallbacks(this.f1296j);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m956b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f1298l;
        if (jCurrentTimeMillis - j >= this.f1299m) {
            this.f1298l = jCurrentTimeMillis;
            return true;
        }
        Log.d("LC_TRACE", ">>> [DEDUP] long-press suppressed (within " + (jCurrentTimeMillis - j) + "ms)");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m957c(View view) {
        View childAt;
        Object tag = view.getTag(532676609);
        Boolean bool = Boolean.TRUE;
        if (!C0631i9.m1478a(tag, bool)) {
            if (view instanceof AdapterView) {
                this.f1287a = view instanceof ListView ? (ListView) view : null;
                Log.d("LC_TRACE", ">>> [PATH2_LV_CAPTURED] " + view.getClass().getName() + " childCount=" + ((ViewGroup) view).getChildCount());
                return true;
            }
            if (view instanceof ViewGroup) {
                view.setTag(532676609, bool);
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    try {
                        childAt = ((ViewGroup) view).getChildAt(i);
                        C0631i9.m1481d(childAt, "getChildAt(...)");
                    } catch (Throwable th) {
                        C0920xd.m2206a(th);
                    }
                    if (m957c(childAt)) {
                        return true;
                    }
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m958e(Activity activity, View view) {
        Window window;
        Window.Callback callback;
        if (activity.getClass().getName().equals("com.tencent.mm.plugin.sns.ui.SnsUserUI")) {
            Log.d("LC_TRACE", ">>> [PATH2_INJECT] start find ListView, root=".concat(view.getClass().getName()));
            m957c(view);
            if (this.f1300n || (window = activity.getWindow()) == null || (callback = window.getCallback()) == null) {
                return;
            }
            this.f1300n = true;
            window.setCallback(new WindowCallbackC0335S9(callback, this));
            Log.d("LC_TRACE", ">>> [PATH3_WINDOW_CALLBACK] Window.Callback wrapped for SnsUserUI");
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        C0631i9.m1482e(c0173j8, "session");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== LongClickInject handleHook START (setOnItemLongClickListener inject) ==="}, 1));
        try {
            final int i = 0;
            ArrayList arrayListM464b = C0173J8.m464b(c0173j8, "android.widget.AdapterView", new C0263O8(13), new InterfaceC0064D7(this) { // from class: a.P9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0353T9 f977b;

                {
                    this.f977b = this;
                }

                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                public final Object mo53f(Object obj) {
                    View decorView;
                    switch (i) {
                        case 0:
                            XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain, "chain");
                            final C0353T9 c0353t9 = this.f977b;
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            final AdapterView.OnItemLongClickListener onItemLongClickListener = objM1951o0 instanceof AdapterView.OnItemLongClickListener ? (AdapterView.OnItemLongClickListener) objM1951o0 : null;
                            AdapterView.OnItemLongClickListener onItemLongClickListener2 = new AdapterView.OnItemLongClickListener(c0353t9, onItemLongClickListener) { // from class: a.R9

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ AdapterView.OnItemLongClickListener f1138a;

                                /* JADX DEBUG: Marked for inline */
                                /* JADX DEBUG: Method not inlined, still used in: [a.P9.f(java.lang.Object):java.lang.Object] */
                                {
                                    this.f1138a = onItemLongClickListener;
                                }

                                @Override // android.widget.AdapterView.OnItemLongClickListener
                                public final boolean onItemLongClick(AdapterView adapterView, View view, int i2, long j) {
                                    C0631i9.m1479b(adapterView);
                                    C0631i9.m1479b(view);
                                    if (C0353T9.m954f(adapterView, view, i2)) {
                                        return true;
                                    }
                                    AdapterView.OnItemLongClickListener onItemLongClickListener3 = this.f1138a;
                                    if (onItemLongClickListener3 != null) {
                                        return onItemLongClickListener3.onItemLongClick(adapterView, view, i2, j);
                                    }
                                    return false;
                                }
                            };
                            List args2 = chain.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            ArrayList arrayListM1961y0 = C0834t3.m1961y0(args2);
                            arrayListM1961y0.set(0, onItemLongClickListener2);
                            return chain.proceed(arrayListM1961y0.toArray(new Object[0]));
                        case 1:
                            XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain2, "chain");
                            Object thisObject = chain2.getThisObject();
                            Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                            if (activity != null) {
                                Window window = activity.getWindow();
                                if (window != null && (decorView = window.getDecorView()) != null) {
                                    decorView.post(new RunnableC0273P0(this.f977b, 9, activity));
                                }
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"LongClickInject: SnsUserUI.onResume -> inject posted"}, 1));
                            }
                            return chain2.proceed();
                        default:
                            C0353T9 c0353t92 = this.f977b;
                            XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain3, "chain");
                            Object thisObject2 = chain3.getThisObject();
                            ListView listView = thisObject2 instanceof ListView ? (ListView) thisObject2 : null;
                            if (listView != null && listView == c0353t92.f1287a) {
                                C0186K3.f638a.getClass();
                                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2440j) {
                                    return chain3.proceed();
                                }
                                if (!C0186K3.a.m508i().f2441k) {
                                    return chain3.proceed();
                                }
                                List args3 = chain3.getArgs();
                                C0631i9.m1481d(args3, "getArgs(...)");
                                Object objM1951o02 = C0834t3.m1951o0(args3, 0);
                                MotionEvent motionEvent = objM1951o02 instanceof MotionEvent ? (MotionEvent) objM1951o02 : null;
                                if (motionEvent == null) {
                                    return chain3.proceed();
                                }
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    c0353t92.f1289c = false;
                                    c0353t92.f1295i = false;
                                    c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                    c0353t92.f1288b = true;
                                    c0353t92.f1290d = motionEvent.getX();
                                    c0353t92.f1291e = motionEvent.getY();
                                    c0353t92.f1292f.removeCallbacks(c0353t92.f1293g);
                                    c0353t92.f1292f.postDelayed(c0353t92.f1293g, c0353t92.f1294h);
                                } else if (actionMasked == 1) {
                                    if (c0353t92.f1295i) {
                                        c0353t92.f1295i = false;
                                        c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                    }
                                    c0353t92.m955a();
                                    if (c0353t92.f1289c) {
                                        c0353t92.f1289c = false;
                                        return Boolean.TRUE;
                                    }
                                } else if (actionMasked != 2) {
                                    if (actionMasked == 3) {
                                        c0353t92.f1295i = true;
                                        c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                        c0353t92.f1292f.postDelayed(c0353t92.f1296j, c0353t92.f1297k);
                                    }
                                } else if (c0353t92.f1288b) {
                                    float x = motionEvent.getX() - c0353t92.f1290d;
                                    float y = motionEvent.getY() - c0353t92.f1291e;
                                    int scaledTouchSlop = ViewConfiguration.get(listView.getContext()).getScaledTouchSlop();
                                    if ((y * y) + (x * x) > scaledTouchSlop * scaledTouchSlop) {
                                        c0353t92.m955a();
                                    }
                                }
                                return chain3.proceed();
                            }
                            return chain3.proceed();
                    }
                }
            });
            if (arrayListM464b.isEmpty()) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"LongClickInject: AdapterView.setOnItemLongClickListener hook FAILED"}, 1));
            } else {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"LongClickInject: AdapterView.setOnItemLongClickListener hooked (" + arrayListM464b.size() + ")"}, 1));
            }
        } catch (Throwable th) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"LongClickInject: hook setOnItemLongClickListener FAILED", th}, 2));
        }
        try {
            final int i2 = 1;
            C0173J8.m463a(c0173j8, "com.tencent.mm.plugin.sns.ui.SnsUserUI", "onResume", new Class[0], new InterfaceC0064D7(this) { // from class: a.P9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0353T9 f977b;

                {
                    this.f977b = this;
                }

                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                public final Object mo53f(Object obj) {
                    View decorView;
                    switch (i2) {
                        case 0:
                            XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain, "chain");
                            final C0353T9 c0353t9 = this.f977b;
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            final AdapterView.OnItemLongClickListener onItemLongClickListener = objM1951o0 instanceof AdapterView.OnItemLongClickListener ? (AdapterView.OnItemLongClickListener) objM1951o0 : null;
                            AdapterView.OnItemLongClickListener onItemLongClickListener2 = new AdapterView.OnItemLongClickListener(c0353t9, onItemLongClickListener) { // from class: a.R9

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ AdapterView.OnItemLongClickListener f1138a;

                                /* JADX DEBUG: Marked for inline */
                                /* JADX DEBUG: Method not inlined, still used in: [a.P9.f(java.lang.Object):java.lang.Object] */
                                {
                                    this.f1138a = onItemLongClickListener;
                                }

                                @Override // android.widget.AdapterView.OnItemLongClickListener
                                public final boolean onItemLongClick(AdapterView adapterView, View view, int i22, long j) {
                                    C0631i9.m1479b(adapterView);
                                    C0631i9.m1479b(view);
                                    if (C0353T9.m954f(adapterView, view, i22)) {
                                        return true;
                                    }
                                    AdapterView.OnItemLongClickListener onItemLongClickListener3 = this.f1138a;
                                    if (onItemLongClickListener3 != null) {
                                        return onItemLongClickListener3.onItemLongClick(adapterView, view, i22, j);
                                    }
                                    return false;
                                }
                            };
                            List args2 = chain.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            ArrayList arrayListM1961y0 = C0834t3.m1961y0(args2);
                            arrayListM1961y0.set(0, onItemLongClickListener2);
                            return chain.proceed(arrayListM1961y0.toArray(new Object[0]));
                        case 1:
                            XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain2, "chain");
                            Object thisObject = chain2.getThisObject();
                            Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                            if (activity != null) {
                                Window window = activity.getWindow();
                                if (window != null && (decorView = window.getDecorView()) != null) {
                                    decorView.post(new RunnableC0273P0(this.f977b, 9, activity));
                                }
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"LongClickInject: SnsUserUI.onResume -> inject posted"}, 1));
                            }
                            return chain2.proceed();
                        default:
                            C0353T9 c0353t92 = this.f977b;
                            XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain3, "chain");
                            Object thisObject2 = chain3.getThisObject();
                            ListView listView = thisObject2 instanceof ListView ? (ListView) thisObject2 : null;
                            if (listView != null && listView == c0353t92.f1287a) {
                                C0186K3.f638a.getClass();
                                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2440j) {
                                    return chain3.proceed();
                                }
                                if (!C0186K3.a.m508i().f2441k) {
                                    return chain3.proceed();
                                }
                                List args3 = chain3.getArgs();
                                C0631i9.m1481d(args3, "getArgs(...)");
                                Object objM1951o02 = C0834t3.m1951o0(args3, 0);
                                MotionEvent motionEvent = objM1951o02 instanceof MotionEvent ? (MotionEvent) objM1951o02 : null;
                                if (motionEvent == null) {
                                    return chain3.proceed();
                                }
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    c0353t92.f1289c = false;
                                    c0353t92.f1295i = false;
                                    c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                    c0353t92.f1288b = true;
                                    c0353t92.f1290d = motionEvent.getX();
                                    c0353t92.f1291e = motionEvent.getY();
                                    c0353t92.f1292f.removeCallbacks(c0353t92.f1293g);
                                    c0353t92.f1292f.postDelayed(c0353t92.f1293g, c0353t92.f1294h);
                                } else if (actionMasked == 1) {
                                    if (c0353t92.f1295i) {
                                        c0353t92.f1295i = false;
                                        c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                    }
                                    c0353t92.m955a();
                                    if (c0353t92.f1289c) {
                                        c0353t92.f1289c = false;
                                        return Boolean.TRUE;
                                    }
                                } else if (actionMasked != 2) {
                                    if (actionMasked == 3) {
                                        c0353t92.f1295i = true;
                                        c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                        c0353t92.f1292f.postDelayed(c0353t92.f1296j, c0353t92.f1297k);
                                    }
                                } else if (c0353t92.f1288b) {
                                    float x = motionEvent.getX() - c0353t92.f1290d;
                                    float y = motionEvent.getY() - c0353t92.f1291e;
                                    int scaledTouchSlop = ViewConfiguration.get(listView.getContext()).getScaledTouchSlop();
                                    if ((y * y) + (x * x) > scaledTouchSlop * scaledTouchSlop) {
                                        c0353t92.m955a();
                                    }
                                }
                                return chain3.proceed();
                            }
                            return chain3.proceed();
                    }
                }
            });
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"LongClickInject: SnsUserUI.onResume hooked (View long-click inject path2)"}, 1));
        } catch (Throwable th2) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"LongClickInject: hook SnsUserUI.onResume FAILED", th2}, 2));
        }
        try {
            final int i3 = 2;
            C0173J8.m463a(c0173j8, "android.widget.AbsListView", "dispatchTouchEvent", new Class[]{MotionEvent.class}, new InterfaceC0064D7(this) { // from class: a.P9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0353T9 f977b;

                {
                    this.f977b = this;
                }

                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                public final Object mo53f(Object obj) {
                    View decorView;
                    switch (i3) {
                        case 0:
                            XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain, "chain");
                            final C0353T9 c0353t9 = this.f977b;
                            List args = chain.getArgs();
                            C0631i9.m1481d(args, "getArgs(...)");
                            Object objM1951o0 = C0834t3.m1951o0(args, 0);
                            final AdapterView.OnItemLongClickListener onItemLongClickListener = objM1951o0 instanceof AdapterView.OnItemLongClickListener ? (AdapterView.OnItemLongClickListener) objM1951o0 : null;
                            AdapterView.OnItemLongClickListener onItemLongClickListener2 = new AdapterView.OnItemLongClickListener(c0353t9, onItemLongClickListener) { // from class: a.R9

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ AdapterView.OnItemLongClickListener f1138a;

                                /* JADX DEBUG: Marked for inline */
                                /* JADX DEBUG: Method not inlined, still used in: [a.P9.f(java.lang.Object):java.lang.Object] */
                                {
                                    this.f1138a = onItemLongClickListener;
                                }

                                @Override // android.widget.AdapterView.OnItemLongClickListener
                                public final boolean onItemLongClick(AdapterView adapterView, View view, int i22, long j) {
                                    C0631i9.m1479b(adapterView);
                                    C0631i9.m1479b(view);
                                    if (C0353T9.m954f(adapterView, view, i22)) {
                                        return true;
                                    }
                                    AdapterView.OnItemLongClickListener onItemLongClickListener3 = this.f1138a;
                                    if (onItemLongClickListener3 != null) {
                                        return onItemLongClickListener3.onItemLongClick(adapterView, view, i22, j);
                                    }
                                    return false;
                                }
                            };
                            List args2 = chain.getArgs();
                            C0631i9.m1481d(args2, "getArgs(...)");
                            ArrayList arrayListM1961y0 = C0834t3.m1961y0(args2);
                            arrayListM1961y0.set(0, onItemLongClickListener2);
                            return chain.proceed(arrayListM1961y0.toArray(new Object[0]));
                        case 1:
                            XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain2, "chain");
                            Object thisObject = chain2.getThisObject();
                            Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                            if (activity != null) {
                                Window window = activity.getWindow();
                                if (window != null && (decorView = window.getDecorView()) != null) {
                                    decorView.post(new RunnableC0273P0(this.f977b, 9, activity));
                                }
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"LongClickInject: SnsUserUI.onResume -> inject posted"}, 1));
                            }
                            return chain2.proceed();
                        default:
                            C0353T9 c0353t92 = this.f977b;
                            XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                            C0631i9.m1482e(chain3, "chain");
                            Object thisObject2 = chain3.getThisObject();
                            ListView listView = thisObject2 instanceof ListView ? (ListView) thisObject2 : null;
                            if (listView != null && listView == c0353t92.f1287a) {
                                C0186K3.f638a.getClass();
                                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2440j) {
                                    return chain3.proceed();
                                }
                                if (!C0186K3.a.m508i().f2441k) {
                                    return chain3.proceed();
                                }
                                List args3 = chain3.getArgs();
                                C0631i9.m1481d(args3, "getArgs(...)");
                                Object objM1951o02 = C0834t3.m1951o0(args3, 0);
                                MotionEvent motionEvent = objM1951o02 instanceof MotionEvent ? (MotionEvent) objM1951o02 : null;
                                if (motionEvent == null) {
                                    return chain3.proceed();
                                }
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    c0353t92.f1289c = false;
                                    c0353t92.f1295i = false;
                                    c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                    c0353t92.f1288b = true;
                                    c0353t92.f1290d = motionEvent.getX();
                                    c0353t92.f1291e = motionEvent.getY();
                                    c0353t92.f1292f.removeCallbacks(c0353t92.f1293g);
                                    c0353t92.f1292f.postDelayed(c0353t92.f1293g, c0353t92.f1294h);
                                } else if (actionMasked == 1) {
                                    if (c0353t92.f1295i) {
                                        c0353t92.f1295i = false;
                                        c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                    }
                                    c0353t92.m955a();
                                    if (c0353t92.f1289c) {
                                        c0353t92.f1289c = false;
                                        return Boolean.TRUE;
                                    }
                                } else if (actionMasked != 2) {
                                    if (actionMasked == 3) {
                                        c0353t92.f1295i = true;
                                        c0353t92.f1292f.removeCallbacks(c0353t92.f1296j);
                                        c0353t92.f1292f.postDelayed(c0353t92.f1296j, c0353t92.f1297k);
                                    }
                                } else if (c0353t92.f1288b) {
                                    float x = motionEvent.getX() - c0353t92.f1290d;
                                    float y = motionEvent.getY() - c0353t92.f1291e;
                                    int scaledTouchSlop = ViewConfiguration.get(listView.getContext()).getScaledTouchSlop();
                                    if ((y * y) + (x * x) > scaledTouchSlop * scaledTouchSlop) {
                                        c0353t92.m955a();
                                    }
                                }
                                return chain3.proceed();
                            }
                            return chain3.proceed();
                    }
                }
            });
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"LongClickInject: AbsListView.dispatchTouchEvent hooked (self-timing long press)"}, 1));
        } catch (Throwable th3) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"LongClickInject: hook AbsListView.dispatchTouchEvent FAILED", th3}, 2));
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== LongClickInject handleHook DONE ==="}, 1));
    }
}
