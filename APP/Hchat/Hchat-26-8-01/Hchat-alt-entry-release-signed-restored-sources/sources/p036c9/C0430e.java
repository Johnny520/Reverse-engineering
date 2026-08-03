package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ba.C0223c;
import ba.C0226f;
import bi.C0315c;
import de.robv.android.xposed.XposedBridge;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p024b9.C0219e;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: c9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0430e {

    /* JADX INFO: renamed from: a */
    public static final C0430e f1252a = new C0430e();

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f1253b = new AtomicInteger(29968);

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f1254c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap.KeySetView f1255d = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap.KeySetView f1256e = ConcurrentHashMap.newKeySet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1448b(Context context, Intent intent) {
        Object c3959f;
        for (String str : AbstractC0000a.m101y0("com.google.android.documentsui", "com.android.documentsui")) {
            Intent intent2 = new Intent(intent).setPackage(str);
            intent2.getClass();
            try {
                c3959f = context.getPackageManager().queryIntentActivities(intent2, 0);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = C4173t.f13710g;
            }
            if (!((Collection) c3959f).isEmpty()) {
                intent.setPackage(str);
                return;
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: c */
    public static String m1449c(Activity activity, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i9 = 0;
                while (true) {
                    int i10 = inputStreamOpenInputStream.read(bArr);
                    if (i10 < 0) {
                        String string = byteArrayOutputStream.toString(AbstractC3137a.f10177a.name());
                        inputStreamOpenInputStream.close();
                        if (string != null) {
                            return string;
                        }
                    } else {
                        i9 += i10;
                        if (i9 > 8388608) {
                            throw new IllegalArgumentException("聊天分组文件不能超过 8 MB");
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                }
            } finally {
            }
        }
        C2104o.m5276A("无法读取所选文件");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1450a(Activity activity, AbstractC0473o2 abstractC0473o2, Intent intent, InterfaceC1231l interfaceC1231l, C0315c c0315c) {
        ConcurrentHashMap concurrentHashMap;
        int iIntValue;
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4 = C3967n.f12976a;
        for (Class<?> superclass = activity.getClass(); superclass != null && Activity.class.isAssignableFrom(superclass); superclass = superclass.getSuperclass()) {
            ConcurrentHashMap.KeySetView keySetView = f1255d;
            if (keySetView.add(superclass)) {
                try {
                    c3959f2 = XposedBridge.hookAllMethods(superclass, "onActivityResult", new C0219e(this, 4));
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (C3960g.m8182b(c3959f2) != null) {
                    keySetView.remove(superclass);
                }
            }
            ConcurrentHashMap.KeySetView keySetView2 = f1256e;
            if (keySetView2.add(superclass)) {
                try {
                    c3959f3 = XposedBridge.hookAllMethods(superclass, "onDestroy", new C0226f(1));
                } catch (Throwable th3) {
                    c3959f3 = new C3959f(th3);
                }
                if (C3960g.m8182b(c3959f3) != null) {
                    keySetView2.remove(superclass);
                }
            }
        }
        int i9 = 0;
        while (true) {
            concurrentHashMap = f1254c;
            if (i9 < 240) {
                iIntValue = f1253b.updateAndGet(new C0223c(1));
                if (!concurrentHashMap.containsKey(Integer.valueOf(iIntValue))) {
                    break;
                } else {
                    i9++;
                }
            } else {
                Set setKeySet = concurrentHashMap.keySet();
                setKeySet.getClass();
                Integer num = (Integer) AbstractC4166m.m8395D1(setKeySet);
                iIntValue = num != null ? num.intValue() : 29968;
                C0426d c0426d = (C0426d) concurrentHashMap.remove(Integer.valueOf(iIntValue));
                if (c0426d != null) {
                    c0426d.m1415a(new C0477p2(HttpUrl.FRAGMENT_ENCODE_SET, false));
                }
            }
        }
        concurrentHashMap.put(Integer.valueOf(iIntValue), new C0426d(new WeakReference(activity), abstractC0473o2, interfaceC1231l));
        try {
            activity.startActivityForResult(intent, iIntValue);
            c3959f = c3959f4;
        } catch (Throwable th4) {
            c3959f = new C3959f(th4);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            Intent intent2 = c0315c != null ? (Intent) c0315c.invoke() : null;
            if (intent2 == null) {
                concurrentHashMap.remove(Integer.valueOf(iIntValue));
                interfaceC1231l.invoke(new C0477p2("当前系统不支持选择文件", false));
                AbstractC0921a.m2261x("[Hchat:ConversationGroup] 启动系统文档选择器失败: ", thM8182b.getMessage(), thM8182b);
                return;
            }
            try {
                activity.startActivityForResult(intent2, iIntValue);
            } catch (Throwable th5) {
                c3959f4 = new C3959f(th5);
            }
            Throwable thM8182b2 = C3960g.m8182b(c3959f4);
            if (thM8182b2 != null) {
                concurrentHashMap.remove(Integer.valueOf(iIntValue));
                interfaceC1231l.invoke(new C0477p2("当前系统不支持选择文件", false));
                AbstractC0921a.m2261x("[Hchat:ConversationGroup] 启动备用文档选择器失败: ", thM8182b2.getMessage(), thM8182b2);
            }
        }
    }
}
