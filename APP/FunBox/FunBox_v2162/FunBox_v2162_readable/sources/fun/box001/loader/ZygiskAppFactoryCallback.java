package fun.box001.loader;

import android.content.pm.ApplicationInfo;
import com.shooker.SHooker;
import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.hookbackend.HookRecord;
import fun.box001.shared.Env;
import java.util.HashMap;

/* JADX INFO: renamed from: fun.box001.loader.a */
/* JADX INFO: loaded from: classes.dex */
final class ZygiskAppFactoryCallback extends RuntimeDexGenerator {
    @Override // fun.box001.internal.dexbridge.RuntimeDexGenerator
    /* JADX INFO: renamed from: n */
    public final Object mo21n(HookRecord hookRecord, Object obj, Object[] objArr) {
        ApplicationInfo applicationInfo = (ApplicationInfo) objArr[0];
        ClassLoader classLoader = (ClassLoader) objArr[1];
        if (applicationInfo != null && classLoader != null && Env.package_name.equals(applicationInfo.packageName)) {
            ZygiskEntry.m218a(applicationInfo, classLoader);
        }
        HashMap map = SHooker.f59a;
        return hookRecord.f819b.invoke(obj, objArr);
    }
}
