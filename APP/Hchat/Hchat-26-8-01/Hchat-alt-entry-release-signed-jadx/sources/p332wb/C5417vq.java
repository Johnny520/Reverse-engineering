package p332wb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: wb.vq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5417vq {

    /* JADX INFO: renamed from: a */
    public static final C5417vq f21502a = new C5417vq();

    /* JADX INFO: renamed from: b */
    public static final HashSet f21503b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static InterfaceC1231l f21504c;

    /* JADX INFO: renamed from: d */
    public static Activity f21505d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Uri m9753a(Bundle bundle) {
        Uri uriM9753a;
        if (bundle != null) {
            try {
                Set<String> setKeySet = bundle.keySet();
                setKeySet.getClass();
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    Object obj = bundle.get((String) it.next());
                    if (obj instanceof Uri) {
                        uriM9753a = (Uri) obj;
                    } else if (obj instanceof Intent) {
                        Uri data = ((Intent) obj).getData();
                        uriM9753a = data != null ? data : m9753a(((Intent) obj).getExtras());
                    } else {
                        uriM9753a = obj instanceof Bundle ? m9753a((Bundle) obj) : null;
                    }
                    if (uriM9753a != null) {
                        return uriM9753a;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m9754b(Class cls) {
        HashSet hashSet = f21503b;
        if (hashSet.contains(cls)) {
            return;
        }
        try {
            XposedBridge.hookAllMethods(cls, "onActivityResult", new C5226q0(2));
            hashSet.add(cls);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized void m9755c(Activity activity, InterfaceC1231l interfaceC1231l) {
        f21504c = interfaceC1231l;
        f21505d = activity;
        m9754b(activity.getClass());
        m9754b(Activity.class);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.addFlags(1);
        intent.addFlags(64);
        AbstractC4955ho.m9299B4(activity, intent);
        try {
            activity.startActivityForResult(intent, 1212371541);
        } catch (Throwable unused) {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.addCategory("android.intent.category.OPENABLE");
            intent2.setType("*/*");
            intent2.addFlags(1);
            activity.startActivityForResult(Intent.createChooser(intent2, "选择铃声文件"), 1212371541);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized void m9756d(Activity activity, String str, InterfaceC1231l interfaceC1231l) {
        try {
            str.getClass();
            f21504c = interfaceC1231l;
            f21505d = activity;
            m9754b(activity.getClass());
            m9754b(Activity.class);
            Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
            intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
            intent.putExtra("android.intent.extra.ringtone.TITLE", "选择通知铃声");
            intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
            intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
            intent.addFlags(1);
            if (!AbstractC3149m.m6721t0(str)) {
                intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Uri.parse(str));
            }
            activity.startActivityForResult(intent, 1212371540);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
