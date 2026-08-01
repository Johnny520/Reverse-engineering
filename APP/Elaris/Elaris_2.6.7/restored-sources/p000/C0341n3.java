package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Member;
import java.util.Collections;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: n3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0341n3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final String f587a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0341n3(String str) {
        this.f587a = str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        if (AbstractC0432r3.m846d().f734a) {
            Object[] objArr = methodHookParam.args;
            Object obj2 = null;
            if (objArr != null) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    obj = objArr[i];
                    if (obj != null && AbstractC0432r3.m861s(obj.getClass())) {
                        break;
                    }
                }
                obj = null;
            } else {
                obj = null;
            }
            if (obj == null) {
                return;
            }
            int iM845c = AbstractC0432r3.m845c(obj, "chatType", "getChatType", Integer.MIN_VALUE);
            if (iM845c == Integer.MIN_VALUE || iM845c == 2) {
                int iM845c2 = AbstractC0432r3.m845c(obj, "atType", "getAtType", 0);
                StringBuilder sb = new StringBuilder(512);
                AbstractC0432r3.m849g(sb, obj, Collections.newSetFromMap(new IdentityHashMap()), 0);
                String string = sb.toString();
                if ((iM845c2 & 1) == 0) {
                    if (string.length() != 0 && string.contains("@全体成员")) {
                        obj2 = "@全体成员";
                    }
                    if (obj2 == null) {
                        return;
                    }
                }
                methodHookParam.setResult(AbstractC0432r3.m843a(methodHookParam.method));
                StringBuilder sb2 = new StringBuilder("[Elaris:NoticeGate] blocked qq precise at-all notice process=");
                sb2.append(AbstractC0432r3.m859q(this.f587a));
                sb2.append(" method=");
                Member member = methodHookParam.method;
                sb2.append(AbstractC0432r3.m859q(member == null ? "" : member.toString()));
                sb2.append(" chatType=");
                sb2.append(iM845c);
                sb2.append(" atType=");
                sb2.append(iM845c2);
                HookEntry.log(sb2.toString());
            }
        }
    }
}
