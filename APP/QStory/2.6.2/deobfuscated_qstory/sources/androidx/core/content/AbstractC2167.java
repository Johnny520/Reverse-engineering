package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.Objects;
import p162.AbstractC7651;

/* JADX INFO: renamed from: androidx.core.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2167 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.content.BroadcastReceiver, androidx.core.content.飘花落叶言子楪世哲苏兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m3937(android.content.Context r4, android.content.IntentFilter r5, int r6, java.lang.String r7, android.os.Handler r8, androidx.core.content.C2168 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.core.content.ContextKt$receiveBroadcasts$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.core.content.ContextKt$receiveBroadcasts$1 r0 = (androidx.core.content.ContextKt$receiveBroadcasts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.core.content.ContextKt$receiveBroadcasts$1 r0 = new androidx.core.content.ContextKt$receiveBroadcasts$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L2a:
            java.lang.Object r4 = r0.L$5
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r0.L$4
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r5 = (p052.InterfaceC6553) r5
            java.lang.Object r5 = r0.L$3
            android.os.Handler r5 = (android.os.Handler) r5
            java.lang.Object r5 = r0.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.L$1
            android.content.IntentFilter r5 = (android.content.IntentFilter) r5
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L48
            r10 = r4
            r4 = r5
            goto L83
        L48:
            r0 = move-exception
            r6 = r0
            goto L8d
        L4b:
            kotlin.AbstractC5184.m10206(r10)
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L89
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L89
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L89
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L89
            r0.L$4 = r9     // Catch: java.lang.Throwable -> L89
            r0.L$5 = r10     // Catch: java.lang.Throwable -> L89
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L89
            r0.label = r3     // Catch: java.lang.Throwable -> L89
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r2 = new kotlinx.coroutines.飘花落叶言子楪苏兰世哲     // Catch: java.lang.Throwable -> L89
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r0 = com.bumptech.glide.AbstractC3054.m6602(r0)     // Catch: java.lang.Throwable -> L89
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L89
            r2.m10539()     // Catch: java.lang.Throwable -> L89
            r0 = r9
            r9 = r6
            r6 = r5
            androidx.core.content.飘花落叶言子楪世哲苏兰 r5 = new androidx.core.content.飘花落叶言子楪世哲苏兰     // Catch: java.lang.Throwable -> L89
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> L89
            r10.element = r5     // Catch: java.lang.Throwable -> L89
            p162.AbstractC7652.m12892(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r5 = r2.m10536()     // Catch: java.lang.Throwable -> L89
            if (r5 != r1) goto L83
            return r1
        L83:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L89
            r5.<init>()     // Catch: java.lang.Throwable -> L89
            throw r5     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            r6 = r0
            r5 = r4
            r4 = r10
        L8d:
            T r4 = r4.element
            if (r4 == 0) goto L96
            android.content.BroadcastReceiver r4 = (android.content.BroadcastReceiver) r4
            r5.unregisterReceiver(r4)
        L96:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.AbstractC2167.m3937(android.content.Context, android.content.IntentFilter, int, java.lang.String, android.os.Handler, androidx.core.content.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m3938(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC7651.m12885(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }
}
