package p027c0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0191s;
import p172l8.C4700i0;
import p319w2.C9137t3;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1300c {

    /* JADX INFO: renamed from: a */
    public static final C1300c f3896a = new C1300c();

    /* JADX INFO: renamed from: b */
    public static InterfaceC0184l f3897b = new InterfaceC0184l() { // from class: c0.a
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C1300c.m5239a((Context) obj);
        }
    };

    /* JADX INFO: renamed from: c */
    public static InterfaceC0191s f3898c = new InterfaceC0191s() { // from class: c0.b
        @Override // p010a9.InterfaceC0191s
        /* JADX INFO: renamed from: t */
        public final Object mo231t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return C1300c.m5240b((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (C9137t3) obj5);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final int f3899d = 8;

    /* JADX INFO: renamed from: a */
    public static List m5239a(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(f3896a.m5241c(), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i10);
            if (f3896a.m5245g(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m5240b(Context context, ResolveInfo resolveInfo, boolean z10, CharSequence charSequence, C9137t3 c9137t3) {
        String string = charSequence.subSequence(C9137t3.m35521l(c9137t3.m35527r()), C9137t3.m35520k(c9137t3.m35527r())).toString();
        Intent intentM5242d = f3896a.m5242d(resolveInfo, z10);
        intentM5242d.putExtra("android.intent.extra.PROCESS_TEXT", string);
        context.startActivity(intentM5242d);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public final Intent m5241c() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    /* JADX INFO: renamed from: d */
    public final Intent m5242d(ResolveInfo resolveInfo, boolean z10) {
        Intent intentPutExtra = m5241c().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z10);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0191s m5243e() {
        return f3898c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5244f(ActivityInfo activityInfo, Context context) {
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5245g(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || m5244f(resolveInfo.activityInfo, context);
    }

    /* JADX INFO: renamed from: h */
    public final List m5246h(Context context) {
        return (List) f3897b.mo27m(context);
    }
}
