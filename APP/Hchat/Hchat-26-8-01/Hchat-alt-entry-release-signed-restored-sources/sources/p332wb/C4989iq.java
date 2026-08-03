package p332wb;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XposedBridge;
import java.util.HashSet;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.iq */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4989iq {

    /* JADX INFO: renamed from: a */
    public static final C4989iq f17987a = new C4989iq();

    /* JADX INFO: renamed from: b */
    public static final HashSet f17988b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static InterfaceC1231l f17989c;

    /* JADX INFO: renamed from: d */
    public static Activity f17990d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m9725a(Class cls) {
        HashSet hashSet = f17988b;
        if (hashSet.contains(cls)) {
            return;
        }
        try {
            XposedBridge.hookAllMethods(cls, "onActivityResult", new C5226q0(1));
            hashSet.add(cls);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m9726b(Activity activity, int i9, InterfaceC1231l interfaceC1231l) {
        f17989c = interfaceC1231l;
        f17990d = activity;
        m9725a(activity.getClass());
        m9725a(Activity.class);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.addFlags(1);
        intent.addFlags(64);
        AbstractC4955ho.m9299B4(activity, intent);
        try {
            activity.startActivityForResult(intent, 1212371542);
        } catch (Throwable unused) {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.addCategory("android.intent.category.OPENABLE");
            intent2.setType("*/*");
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent2.addFlags(1);
            activity.startActivityForResult(Intent.createChooser(intent2, AbstractC4955ho.m9365J6(i9)), 1212371542);
        }
    }
}
