package p136;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7516 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m12733(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static List m12734(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        sidecarWindowLayoutInfo.getClass();
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? EmptyList.INSTANCE : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return EmptyList.INSTANCE;
            }
            return EmptyList.INSTANCE;
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            objInvoke.getClass();
            return (List) objInvoke;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m12735(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        int iM12736 = m12736(sidecarDeviceState);
        if (iM12736 < 0 || iM12736 > 4) {
            return 0;
        }
        return iM12736;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12736(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            objInvoke.getClass();
            return ((Integer) objInvoke).intValue();
        }
    }
}
