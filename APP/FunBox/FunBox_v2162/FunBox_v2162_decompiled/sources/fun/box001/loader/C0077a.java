package fun.box001.loader;

import android.content.pm.ApplicationInfo;
import com.shooker.SHooker;
import fun.box001.shared.Env;
import java.util.HashMap;
import p000a.AbstractC0001b;
import p014o.C0211a;

/* JADX INFO: renamed from: fun.box001.loader.a */
/* JADX INFO: loaded from: classes.dex */
final class C0077a extends AbstractC0001b {
    @Override // p000a.AbstractC0001b
    /* JADX INFO: renamed from: n */
    public final Object mo21n(C0211a c0211a, Object obj, Object[] objArr) {
        ApplicationInfo applicationInfo = (ApplicationInfo) objArr[0];
        ClassLoader classLoader = (ClassLoader) objArr[1];
        if (applicationInfo != null && classLoader != null && Env.package_name.equals(applicationInfo.packageName)) {
            ZygiskEntry.m218a(applicationInfo, classLoader);
        }
        HashMap map = SHooker.f59a;
        return c0211a.f819b.invoke(obj, objArr);
    }
}
