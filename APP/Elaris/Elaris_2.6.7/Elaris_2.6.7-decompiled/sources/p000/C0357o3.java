package p000;

import android.app.Notification;
import android.os.Bundle;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Member;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0357o3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final String f630a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0357o3(String str) {
        this.f630a = str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da A[PHI: r1
  0x00da: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v7 java.lang.String) binds: [B:51:0x00e4, B:47:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Notification notification;
        String string;
        C0416q3 c0416q3M846d = AbstractC0432r3.m846d();
        boolean z = c0416q3M846d.f735b;
        boolean z2 = c0416q3M846d.f734a;
        if (z2 || z) {
            Object[] objArr = methodHookParam.args;
            String str = null;
            if (objArr == null) {
                notification = null;
            } else {
                for (Object obj : objArr) {
                    if (obj instanceof Notification) {
                        notification = (Notification) obj;
                        break;
                    }
                }
                notification = null;
            }
            if (notification == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder(512);
            AbstractC0432r3.m847e(sb2, notification.tickerText);
            try {
                Bundle bundle = notification.extras;
                if (bundle != null) {
                    String[] strArr = {"android.title", "android.text", "android.bigText", "android.subText", "android.infoText", "android.summaryText", "android.title.big", "android.conversationTitle", "android.textLines"};
                    for (int i = 0; i < 9; i++) {
                        AbstractC0432r3.m847e(sb2, bundle.get(strArr[i]));
                    }
                    Iterator<String> it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC0432r3.m847e(sb2, bundle.get(it.next()));
                    }
                }
            } catch (Throwable unused) {
            }
            sb.append(sb2.toString());
            sb.append('\n');
            Object[] objArr2 = methodHookParam.args;
            if (objArr2 == null || objArr2.length == 0) {
                string = "";
            } else {
                StringBuilder sb3 = new StringBuilder(512);
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                for (Object obj2 : objArr2) {
                    AbstractC0432r3.m849g(sb3, obj2, setNewSetFromMap, 0);
                    if (sb3.length() > 4096) {
                        break;
                    }
                }
                string = sb3.toString();
            }
            sb.append(string);
            String string2 = sb.toString();
            if (string2.length() != 0) {
                if (z2) {
                    String str2 = "@全体成员";
                    if (string2.contains("@全体成员")) {
                        str = str2;
                    } else if (z) {
                        str2 = "群待办";
                        if (string2.contains("群待办")) {
                        }
                    }
                }
            }
            if (str == null) {
                return;
            }
            methodHookParam.setResult(AbstractC0432r3.m843a(methodHookParam.method));
            StringBuilder sb4 = new StringBuilder("[Elaris:NoticeGate] blocked qq notice process=");
            sb4.append(AbstractC0432r3.m859q(this.f630a));
            sb4.append(" method=");
            Member member = methodHookParam.method;
            sb4.append(AbstractC0432r3.m859q(member != null ? member.toString() : ""));
            sb4.append(" type=");
            sb4.append(str);
            sb4.append(" text=");
            sb4.append(AbstractC0432r3.m859q(string2));
            HookEntry.log(sb4.toString());
        }
    }
}
