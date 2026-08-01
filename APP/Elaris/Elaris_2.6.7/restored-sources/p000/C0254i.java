package p000;

import android.view.View;
import android.view.ViewGroup;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.Locale;

/* JADX INFO: renamed from: i */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0254i extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object tag;
        String strRuntimeString = HookEntry.runtimeString(Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS, "");
        boolean zRuntimeBool = HookEntry.runtimeBool(Prefs.KEY_HIDE_AIO_INPUT_CAMERA_ENTRIES);
        boolean zRuntimeBool2 = HookEntry.runtimeBool(Prefs.KEY_AIO_INPUT_BAR_MIGRATED);
        if (AbstractC0260i5.m528F0(strRuntimeString, HookEntry.runtimeBool(Prefs.KEY_AIO_INPUT_BAR_ENABLED), zRuntimeBool2, zRuntimeBool)) {
            Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
            if (obj instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) obj;
                boolean z = !zRuntimeBool2 && zRuntimeBool;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                for (int i2 = childCount - 1; i2 >= 0; i2--) {
                    View childAt = viewGroup.getChildAt(i2);
                    int iIntValue = -1;
                    if (childAt != null) {
                        try {
                            tag = childAt.getTag();
                        } catch (Throwable th) {
                            AbstractC0198e7.m343a("aio-input-cleanup", "read-entry-tag", th);
                        }
                        if (tag instanceof Integer) {
                            iIntValue = ((Integer) tag).intValue();
                        } else {
                            String strM698a = AbstractC0273j.m698a(childAt, 0);
                            if (strM698a.length() != 0) {
                                String lowerCase = strM698a.toLowerCase(Locale.ROOT);
                                if (!strM698a.contains("本地语音")) {
                                    if (strM698a.contains("语音") || strM698a.contains("录音")) {
                                        iIntValue = 1000;
                                    } else if (strM698a.contains("表情") || lowerCase.contains("emoji") || lowerCase.contains("emoticon") || lowerCase.contains("emotion")) {
                                        iIntValue = 1001;
                                    } else if (strM698a.contains("相册") || strM698a.contains("照片") || strM698a.contains("图片")) {
                                        iIntValue = 1003;
                                    } else if (strM698a.contains("相机")) {
                                        iIntValue = 1005;
                                    } else if (strM698a.contains("泡泡")) {
                                        iIntValue = 1016;
                                    } else if (strM698a.contains("加号") || strM698a.contains("更多")) {
                                        iIntValue = 1006;
                                    }
                                }
                            }
                        }
                    }
                    if (AbstractC0260i5.m607e0(strRuntimeString, z).contains(Integer.valueOf(iIntValue))) {
                        viewGroup.removeViewAt(i2);
                        i++;
                    }
                }
                if (i > 0) {
                    String name = viewGroup.getClass().getName();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - AbstractC0273j.f434d < 60000) {
                        return;
                    }
                    AbstractC0273j.f434d = jCurrentTimeMillis;
                    HookEntry.logAlways("aio input bar cleanup hidden count=" + i + " icons=" + childCount + " source=shortcut_bar owner=" + name);
                }
            }
        }
    }
}
