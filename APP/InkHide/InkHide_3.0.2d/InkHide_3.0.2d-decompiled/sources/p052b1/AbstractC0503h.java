package p052b1;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.widget.Toast;
import com.p055lu.wxmask272.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p006D.InterfaceC0084m;
import p009E0.C0104d;
import p012G.C0140d;
import p027N0.AbstractC0223g;
import p037T.AbstractC0264o;
import p037T.C0267r;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p061e.AbstractActivityC0533i;
import p062e0.AbstractC0552b;
import p062e0.InterfaceC0551a;
import p069i.AbstractC0700n1;
import p069i.C0635N0;
import p069i.ViewOnLongClickListenerC0706p1;
import p076m.AbstractFutureC0761g;
import p076m.C0757c;
import p076m.C0760f;
import p080o.AbstractC0778d;
import p080o.AbstractC0779e;
import p083q.AbstractC0789c;
import p083q.AbstractC0795i;
import p083q.AbstractC0799m;
import p083q.C0792f;
import p083q.C0796j;
import p083q.C0797k;
import p088s0.C0977K;
import p090t0.AbstractC1008c;
import p093v.C1023h;
import p097x.InterfaceC1034b;
import p099y.AbstractC1048L;
import p099y.C1047K;
import p099y.InterfaceC1055T;
import p099y.InterfaceC1078j;

/* JADX INFO: renamed from: b1.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0503h implements InterfaceC0084m, InterfaceC1055T {

    /* JADX INFO: renamed from: a */
    public static Field f1592a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f1593b = false;

    /* JADX INFO: renamed from: c */
    public static Class f1594c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f1595d = false;

    /* JADX INFO: renamed from: e */
    public static Field f1596e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f1597f = false;

    /* JADX INFO: renamed from: g */
    public static Field f1598g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f1599h = false;

    /* JADX INFO: renamed from: i */
    public static Context f1600i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f1601j = false;

    /* JADX INFO: renamed from: k */
    public static long f1602k = 0;

    /* JADX INFO: renamed from: l */
    public static boolean f1603l = false;

    /* JADX INFO: renamed from: m */
    public static Method f1604m = null;

    /* JADX INFO: renamed from: n */
    public static boolean f1605n = false;

    /* JADX INFO: renamed from: o */
    public static Field f1606o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0503h() {
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static Intent m965A(AbstractActivityC0533i abstractActivityC0533i, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM966B = m966B(abstractActivityC0533i, componentName);
        if (strM966B == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM966B);
        return m966B(abstractActivityC0533i, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static String m966B(Activity activity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static File m967C(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m968D(Activity activity) {
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return false;
        }
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View viewM989v = m989v(viewGroup, childCount);
            if ((viewM989v instanceof AbstractC1008c) && ((AbstractC1008c) viewM989v).m2206c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static Object m969E(Object obj, String str, Object... objArr) {
        Method declaredMethod;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : objArr) {
            arrayList.add(obj2.getClass());
        }
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
        Class<?> cls = obj.getClass();
        try {
            try {
                declaredMethod = cls.getMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            }
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            declaredMethod = null;
        }
        try {
            return declaredMethod.invoke(obj, objArr);
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m970F(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            boolean z2 = m975M(intent, extras, "label_id") > 0;
            String stringExtra = intent.getStringExtra("INTENT_KEY_SEARCH_LABEL_USERNAME_LIST");
            boolean z3 = stringExtra == null || AbstractC0307q.m534d0(stringExtra);
            String stringExtra2 = intent.getStringExtra("label_name");
            boolean z4 = stringExtra2 == null || AbstractC0307q.m534d0(stringExtra2);
            boolean z5 = m975M(intent, extras, "scene") == 7;
            if (z2 || !z3 || (!z4 && z5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: G */
    public static MappedByteBuffer m971G(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static void m972H(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static final int m973I(C0267r c0267r, String str, int i2) {
        Integer numValueOf;
        try {
            numValueOf = Integer.valueOf(((AbstractC0264o) c0267r.f637a.get(str)).mo487a());
        } catch (Exception unused) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static C0977K m974J(Context context) {
        AbstractC0223g.m418e(context, "context");
        String string = context.getSharedPreferences("mask_manager_ui_theme", 0).getString("theme_mode", "light");
        String str = string != null ? string : "light";
        return (str.equals("dark") || (str.equals("system") && (context.getResources().getConfiguration().uiMode & 48) == 32)) ? new C0977K(true, -14670809, -15592426, -14868188, -14275793, -854538, -5195070, -8418669, -13354176) : new C0977K(false, -591623, -1249295, -1, -328451, -16777216, -8945270, -6642517, -2103317);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static int m975M(Intent intent, Bundle bundle, String str) {
        Object c0104d;
        Object obj;
        Object c0104d2;
        Integer numM530Z;
        if (bundle != null) {
            try {
                obj = bundle.get(str);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
        } else {
            obj = null;
        }
        c0104d = obj;
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        if (c0104d == null) {
            try {
                Bundle extras = intent.getExtras();
                c0104d2 = extras != null ? extras.get(str) : null;
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            Object obj2 = c0104d2 instanceof C0104d ? null : c0104d2;
            if (obj2 == null) {
                return -1;
            }
            c0104d = obj2;
        }
        if (c0104d instanceof Integer) {
            return ((Number) c0104d).intValue();
        }
        if (c0104d instanceof Number) {
            return ((Number) c0104d).intValue();
        }
        if (!(c0104d instanceof String) || (numM530Z = AbstractC0306p.m530Z((String) c0104d)) == null) {
            return -1;
        }
        return numM530Z.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m976N(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0700n1.m1326a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0706p1 viewOnLongClickListenerC0706p1 = ViewOnLongClickListenerC0706p1.f2380l;
        if (viewOnLongClickListenerC0706p1 != null && viewOnLongClickListenerC0706p1.f2382b == view) {
            ViewOnLongClickListenerC0706p1.m1338b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0706p1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0706p1 viewOnLongClickListenerC0706p12 = ViewOnLongClickListenerC0706p1.f2381m;
        if (viewOnLongClickListenerC0706p12 != null && viewOnLongClickListenerC0706p12.f2382b == view) {
            viewOnLongClickListenerC0706p12.m1339a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m977O(Context context, String str) {
        if (context == null) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static void m978P(String str) {
        m977O(m991x(), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m979g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m980h(Context context, String str) {
        int iM1433c;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM1434d = AbstractC0778d.m1434d(str);
            if (strM1434d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerM1437c = AbstractC0779e.m1437c(context);
                    iM1433c = AbstractC0779e.m1435a(appOpsManagerM1437c, strM1434d, Binder.getCallingUid(), packageName);
                    if (iM1433c == 0) {
                        iM1433c = AbstractC0779e.m1435a(appOpsManagerM1437c, strM1434d, iMyUid, AbstractC0779e.m1436b(context));
                    }
                } else {
                    iM1433c = AbstractC0778d.m1433c((AppOpsManager) AbstractC0778d.m1431a(context, AppOpsManager.class), strM1434d, packageName);
                }
                if (iM1433c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m981i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m982j(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zM983k = m983k(file, inputStreamOpenRawResource);
                m981i(inputStreamOpenRawResource);
                return zM983k;
            } catch (Throwable th) {
                th = th;
                m981i(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m983k(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    m981i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m981i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m981i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m984p(Activity activity) {
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return false;
        }
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View viewM989v = m989v(viewGroup, childCount);
            if (viewM989v instanceof AbstractC1008c) {
                AbstractC1008c abstractC1008c = (AbstractC1008c) viewM989v;
                if (abstractC1008c.m2206c()) {
                    abstractC1008c.mo2182a();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m985q(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C1047K.f3658d;
        C1047K c1047k = (C1047K) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c1047k == null) {
            c1047k = new C1047K();
            c1047k.f3659a = null;
            c1047k.f3660b = null;
            c1047k.f3661c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c1047k);
        }
        WeakReference weakReference2 = c1047k.f3661c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c1047k.f3661c = new WeakReference(keyEvent);
        if (c1047k.f3660b == null) {
            c1047k.f3660b = new SparseArray();
        }
        SparseArray sparseArray = c1047k.f3660b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            C1047K.m2280b(view2, keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m986r(InterfaceC1078j interfaceC1078j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC1078j != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC1078j.mo637d(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f1603l) {
                            try {
                                f1604m = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f1603l = true;
                        }
                        Method method = f1604m;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC1048L.m2283b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f1605n) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f1606o = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f1605n = true;
                }
                Field field = f1606o;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC1048L.m2283b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC1048L.m2283b(view, keyEvent)) || interfaceC1078j.mo637d(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static ArrayList m987s(View view, InterfaceC1034b interfaceC1034b) {
        ArrayList arrayList = new ArrayList();
        if (view != null && (view instanceof ViewGroup)) {
            if (interfaceC1034b.test(view)) {
                arrayList.add((View) View.class.cast(view));
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((ViewGroup) view);
            while (arrayList2.size() > 0) {
                ViewGroup viewGroup = (ViewGroup) arrayList2.get(0);
                arrayList2.remove(0);
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (interfaceC1034b.test(childAt)) {
                        arrayList.add((View) View.class.cast(childAt));
                    }
                    if (childAt instanceof ViewGroup) {
                        arrayList2.add((ViewGroup) childAt);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC0551a m988u(Class cls) {
        InterfaceC0551a interfaceC0551a;
        Object obj = (InterfaceC0551a) AbstractC0552b.f1859a.get(cls);
        if (obj == null) {
            obj = null;
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                AbstractC0223g.m417d(objNewInstance, "newInstance(...)");
                interfaceC0551a = (InterfaceC0551a) objNewInstance;
            } catch (Exception unused) {
                interfaceC0551a = null;
            }
            if (interfaceC0551a != null) {
                AbstractC0552b.f1859a.put(cls, interfaceC0551a);
                interfaceC0551a.onCreate();
                obj = interfaceC0551a;
            }
        }
        Object objCast = cls.cast(obj);
        AbstractC0223g.m415b(objCast);
        return (InterfaceC0551a) objCast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final View m989v(ViewGroup viewGroup, int i2) {
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + viewGroup.getChildCount());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f2651c == r8.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m990w(Context context, int i2) {
        ColorStateList colorStateListM1463a;
        ColorStateList colorStateList;
        C0796j c0796j;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0797k c0797k = new C0797k(resources, theme);
        synchronized (AbstractC0799m.f2656c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0799m.f2655b.get(c0797k);
                colorStateListM1463a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c0796j = (C0796j) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (c0796j.f2650b.equals(resources.getConfiguration())) {
                        if (theme != null || c0796j.f2651c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = c0796j.f2649a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC0799m.f2654a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListM1463a = AbstractC0789c.m1463a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListM1463a == null) {
            return AbstractC0795i.m1466b(resources, i2, theme);
        }
        synchronized (AbstractC0799m.f2656c) {
            try {
                WeakHashMap weakHashMap = AbstractC0799m.f2655b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c0797k);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c0797k, sparseArray2);
                }
                sparseArray2.append(i2, new C0796j(colorStateListM1463a, c0797k.f2652a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListM1463a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static Context m991x() {
        Object objInvoke;
        if (f1600i == null) {
            Application application = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (objInvoke == null) {
                throw new NullPointerException("can't find application from ActivityThread!!!");
            }
            application = (Application) objInvoke;
            f1600i = application;
        }
        return f1600i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static Drawable m992y(Context context, int i2) {
        return C0635N0.m1251b().m1254c(context, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static Intent m993z(AbstractActivityC0533i abstractActivityC0533i) {
        Intent parentActivityIntent = abstractActivityC0533i.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM966B = m966B(abstractActivityC0533i, abstractActivityC0533i.getComponentName());
            if (strM966B == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0533i, strM966B);
            try {
                return m966B(abstractActivityC0533i, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM966B + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo994K(C0760f c0760f, C0760f c0760f2);

    /* JADX INFO: renamed from: L */
    public abstract void mo995L(C0760f c0760f, Thread thread);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo998d(AbstractFutureC0761g abstractFutureC0761g, C0757c c0757c);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo999e(AbstractFutureC0761g abstractFutureC0761g, Object obj, Object obj2);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo1000f(AbstractFutureC0761g abstractFutureC0761g, C0760f c0760f, C0760f c0760f2);

    /* JADX INFO: renamed from: l */
    public abstract Typeface mo1001l(Context context, C0792f c0792f, Resources resources, int i2);

    /* JADX INFO: renamed from: m */
    public abstract Typeface mo1002m(Context context, C1023h[] c1023hArr, int i2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public Typeface mo1003n(Context context, InputStream inputStream) {
        File fileM967C = m967C(context);
        if (fileM967C == null) {
            return null;
        }
        try {
            if (m983k(fileM967C, inputStream)) {
                return Typeface.createFromFile(fileM967C.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM967C.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public Typeface mo1004o(Context context, Resources resources, int i2, String str, int i3) {
        File fileM967C = m967C(context);
        if (fileM967C == null) {
            return null;
        }
        try {
            if (m982j(fileM967C, resources, i2)) {
                return Typeface.createFromFile(fileM967C.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM967C.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public C1023h mo1005t(int i2, C1023h[] c1023hArr) {
        new C0140d(28);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        C1023h c1023h = null;
        int i4 = Integer.MAX_VALUE;
        for (C1023h c1023h2 : c1023hArr) {
            int iAbs = (Math.abs(c1023h2.f3634c - i3) * 2) + (c1023h2.f3635d == z2 ? 0 : 1);
            if (c1023h == null || i4 > iAbs) {
                c1023h = c1023h2;
                i4 = iAbs;
            }
        }
        return c1023h;
    }

    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: b */
    public void mo996b() {
    }

    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: c */
    public void mo997c() {
    }
}
