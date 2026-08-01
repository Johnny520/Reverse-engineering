package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0400p3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final String f695a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0400p3(String str) {
        this.f695a = str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (!AbstractC0432r3.m846d().f735b || (objArr = methodHookParam.args) == null || objArr.length <= 2) {
            return;
        }
        Object obj = objArr[1];
        if ((obj instanceof Number ? ((Number) obj).longValue() : Long.MIN_VALUE) == 528) {
            Object obj2 = objArr[2];
            if ((obj2 instanceof Number ? ((Number) obj2).longValue() : Long.MIN_VALUE) == 309) {
                methodHookParam.setResult(AbstractC0432r3.m843a(methodHookParam.method));
                StringBuilder sb = new StringBuilder("[Elaris:NoticeGate] blocked qq precise group-todo notice process=");
                sb.append(AbstractC0432r3.m859q(this.f695a));
                sb.append(" method=");
                Member member = methodHookParam.method;
                sb.append(AbstractC0432r3.m859q(member == null ? "" : member.toString()));
                HookEntry.log(sb.toString());
            }
        }
    }
}
