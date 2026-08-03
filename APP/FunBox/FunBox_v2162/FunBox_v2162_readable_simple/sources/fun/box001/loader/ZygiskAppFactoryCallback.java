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
    public final Object mo21n(HookRecord r5, Object r6, Object[] r7) {
        ApplicationInfo r0 = (ApplicationInfo) r7[0];
        ClassLoader r1 = (ClassLoader) r7[1];
        if (r0 == null) goto L8;
        if (r1 == null) goto L8;
        if (Env.package_name.equals(r0.packageName) == false) goto L8;
        ZygiskEntry.m218a(r0, r1);
    L8:
        HashMap r02 = SHooker.f59a;
        return r5.f819b.invoke(r6, r7);
    }
}
