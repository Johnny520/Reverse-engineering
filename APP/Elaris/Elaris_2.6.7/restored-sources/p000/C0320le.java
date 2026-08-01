package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: le */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0320le extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f541a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0320le(ClassLoader classLoader) {
        super(70);
        this.f541a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Bundle bundle;
        Context contextHostContext;
        Context contextHostContext2;
        Activity activity;
        Context contextHostContext3;
        ArrayList parcelableArrayList;
        if (HookEntry.runtimeBool(Prefs.KEY_VOICE_MESSAGE_ACTIONS)) {
            Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
            if (obj == null) {
                bundle = null;
            } else {
                loop2: for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        if (Bundle.class.isAssignableFrom(field.getType())) {
                            try {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (obj2 instanceof Bundle) {
                                    bundle = (Bundle) obj2;
                                    break loop2;
                                }
                                continue;
                            } catch (Throwable unused) {
                                continue;
                            }
                        }
                    }
                }
                bundle = null;
            }
            if (bundle == null || !bundle.containsKey("elaris_ptt_forward_path") || bundle.getBoolean("elaris_ptt_forward_handled", false)) {
                return;
            }
            bundle.putBoolean("elaris_ptt_forward_handled", true);
            String string = bundle.getString("elaris_ptt_forward_path", "");
            if (string == null || string.length() == 0 || !new File(string).exists()) {
                Object obj3 = methodHookParam == null ? null : methodHookParam.thisObject;
                if (obj3 instanceof Activity) {
                    contextHostContext = (Activity) obj3;
                } else {
                    Object objM332y = AbstractC0169w.m332y(0, obj3);
                    contextHostContext = objM332y instanceof Activity ? (Activity) objM332y : HookEntry.topActivity();
                }
                if (contextHostContext == null) {
                    contextHostContext = HookEntry.hostContext();
                }
                AbstractC0169w.m276W0(contextHostContext, "语音文件不存在");
                methodHookParam.setResult(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            try {
                parcelableArrayList = bundle.getParcelableArrayList("forward_multi_target");
            } catch (Throwable unused2) {
            }
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                String strM243G = AbstractC0169w.m243G(bundle.getString("uin"), bundle.getString("Uid"), bundle.getString("peerUin"), bundle.getString("peerUid"));
                int i = bundle.containsKey("uintype") ? bundle.getInt("uintype", -1) : -1;
                if (strM243G.length() > 0) {
                    arrayList.add(new C0410pd(strM243G, AbstractC0169w.m300i(i)));
                }
            } else {
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    C0410pd c0410pdM264Q0 = AbstractC0169w.m264Q0(parcelableArrayList.get(i2));
                    if (c0410pdM264Q0 != null) {
                        arrayList.add(c0410pdM264Q0);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                Object obj4 = methodHookParam == null ? null : methodHookParam.thisObject;
                if (obj4 instanceof Activity) {
                    contextHostContext3 = (Activity) obj4;
                } else {
                    Object objM332y2 = AbstractC0169w.m332y(0, obj4);
                    contextHostContext3 = objM332y2 instanceof Activity ? (Activity) objM332y2 : HookEntry.topActivity();
                }
                if (contextHostContext3 == null) {
                    contextHostContext3 = HookEntry.hostContext();
                }
                AbstractC0169w.m276W0(contextHostContext3, "未获取到转发对象");
                methodHookParam.setResult(null);
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (AbstractC0169w.m250J0(this.f541a, string, bundle.getInt("elaris_ptt_forward_duration", 0), bundle.getByteArray("elaris_ptt_forward_waves"), (C0410pd) arrayList.get(i4), null)) {
                    i3++;
                }
            }
            Object obj5 = methodHookParam == null ? null : methodHookParam.thisObject;
            if (obj5 instanceof Activity) {
                contextHostContext2 = (Activity) obj5;
            } else {
                Object objM332y3 = AbstractC0169w.m332y(0, obj5);
                contextHostContext2 = objM332y3 instanceof Activity ? (Activity) objM332y3 : HookEntry.topActivity();
            }
            if (contextHostContext2 == null) {
                contextHostContext2 = HookEntry.hostContext();
            }
            AbstractC0169w.m276W0(contextHostContext2, i3 == arrayList.size() ? "已提交语音转发" : "语音转发部分失败：" + i3 + "/" + arrayList.size());
            Object obj6 = methodHookParam == null ? null : methodHookParam.thisObject;
            if (obj6 instanceof Activity) {
                activity = (Activity) obj6;
            } else {
                Object objM332y4 = AbstractC0169w.m332y(0, obj6);
                activity = objM332y4 instanceof Activity ? (Activity) objM332y4 : HookEntry.topActivity();
            }
            if (activity != null) {
                try {
                    activity.finish();
                } catch (Throwable unused3) {
                }
            }
            methodHookParam.setResult(null);
        }
    }
}
