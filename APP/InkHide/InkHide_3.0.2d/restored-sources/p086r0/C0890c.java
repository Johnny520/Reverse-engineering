package p086r0;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Map;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0890c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0908i f3073a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1808a(Context context, XC_MethodHook.MethodHookParam methodHookParam, Map map) {
        long jLongValue;
        Long lM531a0;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2442r()) {
            C0908i c0908i = this.f3073a;
            c0908i.getClass();
            Object[] objArr = methodHookParam.args;
            Object objM258f0 = objArr != null ? AbstractC0120h.m258f0(0, objArr) : null;
            String str = objM258f0 instanceof String ? (String) objM258f0 : null;
            if (str == null) {
                return;
            }
            Object[] objArr2 = methodHookParam.args;
            Object objM258f02 = objArr2 != null ? AbstractC0120h.m258f0(1, objArr2) : null;
            String str2 = objM258f02 instanceof String ? (String) objM258f02 : null;
            if (str2 != null && str2.equals("sysmsg") && AbstractC0299i.m511i0(str, "revokemsg", false) && AbstractC0223g.m414a(map.get(".sysmsg.$type"), "revokemsg")) {
                Object obj = map.get(".sysmsg.revokemsg.session");
                String str3 = obj instanceof String ? (String) obj : null;
                if (str3 == null) {
                    return;
                }
                Object obj2 = map.get(".sysmsg.revokemsg.newmsgid");
                String str4 = obj2 instanceof String ? (String) obj2 : null;
                if (str4 == null || (lM531a0 = AbstractC0306p.m531a0(str4)) == null) {
                    Object obj3 = map.get(".sysmsg.revokemsg.newmsgid");
                    Number number = obj3 instanceof Number ? (Number) obj3 : null;
                    if (number == null) {
                        return;
                    } else {
                        jLongValue = number.longValue();
                    }
                } else {
                    jLongValue = lM531a0.longValue();
                }
                Object obj4 = map.get(".sysmsg.revokemsg.replacemsg");
                String str5 = obj4 instanceof String ? (String) obj4 : null;
                if (AbstractC0307q.m534d0(str3) || jLongValue <= 0) {
                    return;
                }
                if (str5 != null && !AbstractC0307q.m534d0(str5)) {
                    if (C0908i.m1953f(str5)) {
                        return;
                    }
                    if (!AbstractC0299i.m511i0(str5, "\"", false) && !AbstractC0299i.m511i0(str5, "「", false) && !AbstractC0299i.m511i0(str5, "『", false)) {
                        return;
                    }
                }
                map.put(".sysmsg.$type", null);
                c0908i.m1958d(context, str3, jLongValue, null, "xml");
            }
        }
    }
}
