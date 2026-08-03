package p332wb;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.wq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5450wq {

    /* JADX INFO: renamed from: a */
    public static final C5450wq f21764a = new C5450wq();

    /* JADX INFO: renamed from: b */
    public static final HashSet f21765b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static InterfaceC1231l f21766c;

    /* JADX INFO: renamed from: d */
    public static Activity f21767d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9762a(Class cls) {
        HashSet hashSet = f21765b;
        if (hashSet.contains(cls)) {
            return;
        }
        try {
            XposedBridge.hookAllMethods(cls, "onActivityResult", new C5226q0(3));
            hashSet.add(cls);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m9763b(Activity activity, int i9, InterfaceC1231l interfaceC1231l) {
        f21766c = interfaceC1231l;
        f21767d = activity;
        m9762a(activity.getClass());
        m9762a(Activity.class);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.addFlags(1);
        intent.addFlags(64);
        AbstractC4955ho.m9299B4(activity, intent);
        try {
            activity.startActivityForResult(intent, 1212371546);
        } catch (Throwable unused) {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.addCategory("android.intent.category.OPENABLE");
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent2.addFlags(1);
            activity.startActivityForResult(Intent.createChooser(intent2, AbstractC4955ho.m9493Z6(i9)), 1212371546);
        }
    }
}
