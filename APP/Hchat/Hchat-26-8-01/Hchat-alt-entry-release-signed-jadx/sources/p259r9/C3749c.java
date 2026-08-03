package p259r9;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bb.RunnableC0246h;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p085fg.InterfaceC1231l;
import p172lg.C2566f;
import p258r8.RunnableC3737b;
import p276sf.C3967n;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: r9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3749c implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12165g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3752d0 f12166h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3749c(C3752d0 c3752d0, int i9) {
        this.f12165g = i9;
        this.f12166h = c3752d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        Object objM8366C0;
        XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj;
        switch (this.f12165g) {
            case 0:
                methodHookParam.getClass();
                Object obj2 = methodHookParam.thisObject;
                Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null) {
                    C3752d0 c3752d0 = this.f12166h;
                    if (c3752d0.f12192c.getBoolean("group_member_history_enable", false)) {
                        Window window = activity.getWindow();
                        View decorView = window != null ? window.getDecorView() : null;
                        ListView listViewM7810r = C3752d0.m7810r(decorView instanceof ViewGroup ? (ViewGroup) decorView : null);
                        ListAdapter adapter = listViewM7810r != null ? listViewM7810r.getAdapter() : null;
                        if (adapter == null || !c3752d0.m7820D(activity, adapter)) {
                            c3752d0.m7820D(activity, null);
                        }
                    }
                }
                break;
            case 1:
                methodHookParam.getClass();
                Object obj3 = methodHookParam.thisObject;
                Object obj4 = null;
                Activity activity2 = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity2 != null) {
                    C3752d0 c3752d02 = this.f12166h;
                    if (c3752d02.f12192c.getBoolean("group_member_history_enable", false)) {
                        Object[] objArr = methodHookParam.args;
                        if (objArr == null || (objM8366C0 = AbstractC4165l.m8366C0(1, objArr)) == null || (!C3752d0.m7801j0(objM8366C0).equals("hchat_group_member_history") && !C3752d0.m7803k0(objM8366C0).equals("历史发言记录"))) {
                            objM8366C0 = null;
                        }
                        if (objM8366C0 != null) {
                            obj4 = objM8366C0;
                        } else if (objArr != null) {
                            for (Object obj5 : objArr) {
                                if (obj5 != null && (C3752d0.m7801j0(obj5).equals("hchat_group_member_history") || C3752d0.m7803k0(obj5).equals("历史发言记录"))) {
                                    obj4 = obj5;
                                }
                            }
                        }
                        if (obj4 != null) {
                            c3752d02.m7838e0(activity2);
                            methodHookParam.setResult(Boolean.TRUE);
                        }
                    }
                }
                break;
            case 2:
                methodHookParam.getClass();
                if (this.f12166h.f12192c.getBoolean("skip_web_risk_enable", false)) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            case 3:
                methodHookParam.getClass();
                if (this.f12166h.f12192c.getBoolean("skip_web_risk_enable", false)) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            case 4:
                methodHookParam.getClass();
                if (this.f12166h.f12192c.getBoolean("red_packet_details_enable", false)) {
                    Object[] objArr2 = methodHookParam.args;
                    Long l10 = null;
                    Object objM8366C02 = objArr2 != null ? AbstractC4165l.m8366C0(1, objArr2) : null;
                    Number number = objM8366C02 instanceof Number ? (Number) objM8366C02 : null;
                    if (number != null) {
                        long jLongValue = number.longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        C2566f c2566f = C3752d0.f12180K;
                        long j3 = c2566f.f8324g;
                        if (jLongValue <= c2566f.f8325h && j3 <= jLongValue) {
                            l10 = lValueOf;
                        }
                        if (l10 != null) {
                            methodHookParam.setResult(C3752d0.m7814x(l10.longValue()));
                        }
                    }
                }
                break;
            case 5:
                methodHookParam.getClass();
                C3752d0 c3752d03 = this.f12166h;
                if (c3752d03.f12192c.getBoolean("red_packet_details_enable", false)) {
                    Object[] objArr3 = methodHookParam.args;
                    Object objM8366C03 = objArr3 != null ? AbstractC4165l.m8366C0(0, objArr3) : null;
                    Object[] objArr4 = methodHookParam.args;
                    boolean z9 = true;
                    Object objM8366C04 = objArr4 != null ? AbstractC4165l.m8366C0(1, objArr4) : null;
                    Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                    setNewSetFromMap.getClass();
                    Long lM7813w = C3752d0.m7813w(0, objM8366C04, setNewSetFromMap);
                    if (lM7813w != null) {
                        long jLongValue2 = lM7813w.longValue();
                        String strM7814x = C3752d0.m7814x(jLongValue2);
                        boolean zM7822E0 = c3752d03.m7822E0(objM8366C03, strM7814x);
                        TextView textViewM7855y = c3752d03.m7855y(objM8366C03, jLongValue2);
                        if (textViewM7855y != null) {
                            textViewM7855y.setText(strM7814x);
                            textViewM7855y.post(new RunnableC3737b(c3752d03, textViewM7855y, strM7814x));
                        } else {
                            z9 = zM7822E0;
                        }
                        if (!z9) {
                            View viewM7851u = objM8366C03 != null ? c3752d03.m7851u(objM8366C03) : null;
                            if (viewM7851u != null) {
                                viewM7851u.post(new RunnableC0246h(c3752d03, objM8366C03, strM7814x, jLongValue2));
                            }
                        }
                    }
                }
                break;
            default:
                methodHookParam.getClass();
                if (this.f12166h.f12192c.getBoolean("red_packet_details_enable", false)) {
                    Object[] objArr5 = methodHookParam.args;
                    Object objM8366C05 = objArr5 != null ? AbstractC4165l.m8366C0(2, objArr5) : null;
                    JSONObject jSONObject = objM8366C05 instanceof JSONObject ? (JSONObject) objM8366C05 : null;
                    if (jSONObject != null) {
                        int iOptInt = jSONObject.optInt("totalAmount", 0);
                        int iOptInt2 = jSONObject.optInt("totalNum", 0);
                        int iOptInt3 = jSONObject.optInt("recNum", 0);
                        int iOptInt4 = jSONObject.optInt("recAmount", 0);
                        if (iOptInt > 0 || iOptInt2 > 0) {
                            double d10 = ((double) (iOptInt - iOptInt4)) / 100.0d;
                            StringBuilder sb2 = new StringBuilder("金额:");
                            sb2.append(((double) iOptInt4) / 100.0d);
                            sb2.append('/');
                            sb2.append(((double) iOptInt) / 100.0d);
                            sb2.append("元\n数量:");
                            sb2.append(iOptInt3);
                            sb2.append('/');
                            sb2.append(iOptInt2);
                            if (d10 > 0.0d) {
                                sb2.append("\n剩余:");
                                sb2.append(d10);
                                sb2.append("元");
                            }
                            jSONObject.put("headTitle", sb2.toString());
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }
}
