package androidx.core.content;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import androidx.window.area.AbstractC3400;
import java.util.Objects;
import kotlin.AbstractC6017;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C6276;
import p178.AbstractC8481;
import p178.AbstractC8482;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.core.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3000 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.content.BroadcastReceiver, androidx.core.content.飘花落叶言子楪世哲苏兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m4507(Context context, IntentFilter intentFilter, int i, String str, Handler handler, C3001 c3001, ContinuationImpl continuationImpl) throws Throwable {
        ContextKt$receiveBroadcasts$1 contextKt$receiveBroadcasts$1;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        Context context2;
        Ref$ObjectRef ref$ObjectRef2;
        T t;
        if (continuationImpl instanceof ContextKt$receiveBroadcasts$1) {
            contextKt$receiveBroadcasts$1 = (ContextKt$receiveBroadcasts$1) continuationImpl;
            int i2 = contextKt$receiveBroadcasts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contextKt$receiveBroadcasts$1.label = i2 - Integer.MIN_VALUE;
            } else {
                contextKt$receiveBroadcasts$1 = new ContextKt$receiveBroadcasts$1(continuationImpl);
            }
        }
        Object obj = contextKt$receiveBroadcasts$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = contextKt$receiveBroadcasts$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            ref$ObjectRef = new Ref$ObjectRef();
            try {
                contextKt$receiveBroadcasts$1.L$0 = context;
                contextKt$receiveBroadcasts$1.L$1 = intentFilter;
                contextKt$receiveBroadcasts$1.L$2 = str;
                contextKt$receiveBroadcasts$1.L$3 = handler;
                contextKt$receiveBroadcasts$1.L$4 = c3001;
                contextKt$receiveBroadcasts$1.L$5 = ref$ObjectRef;
                contextKt$receiveBroadcasts$1.I$0 = i;
                contextKt$receiveBroadcasts$1.label = 1;
                C6276 c6276 = new C6276(1, AbstractC3400.m5624(contextKt$receiveBroadcasts$1));
                c6276.m11102();
                ?? c2999 = new C2999(c6276, c3001);
                ref$ObjectRef.element = c2999;
                AbstractC8482.m13480(context, c2999, intentFilter, str, handler, i);
                if (c6276.m11099() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th2) {
                th = th2;
                context2 = context;
                ref$ObjectRef2 = ref$ObjectRef;
                t = ref$ObjectRef2.element;
                if (t != 0) {
                }
            }
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef2 = (Ref$ObjectRef) contextKt$receiveBroadcasts$1.L$5;
            context2 = (Context) contextKt$receiveBroadcasts$1.L$0;
            try {
                AbstractC6017.m10769(obj);
                ref$ObjectRef = ref$ObjectRef2;
                context = context2;
            } catch (Throwable th3) {
                th = th3;
                t = ref$ObjectRef2.element;
                if (t != 0) {
                    throw th;
                }
                context2.unregisterReceiver((BroadcastReceiver) t);
                throw th;
            }
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m4508(Context context, String str) {
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
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, AbstractC8481.m13473(context)) : 1;
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
