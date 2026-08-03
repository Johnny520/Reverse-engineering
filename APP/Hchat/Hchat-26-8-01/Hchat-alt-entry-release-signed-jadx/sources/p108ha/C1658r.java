package p108ha;

import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import p218og.AbstractC3149m;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: ha.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1658r extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1659s f5451b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1658r(C1659s c1659s, int i9) {
        this.f5450a = i9;
        this.f5451b = c1659s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:CAST), (wrap:java.lang.Object:CAST) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object result;
        Long lM4236o;
        Object obj2;
        Object obj3;
        String string;
        String string2;
        switch (this.f5450a) {
            case 0:
                methodHookParam.getClass();
                C1659s c1659s = this.f5451b;
                if (AbstractC4302b.m8640c(c1659s.f5453a.f12143a, "Hchat_moments_bottom_detail_config").getBoolean("moments_bottom_detail_enable", false) && c1659s.f5455c.getBoolean("moments_bottom_detail_hide_group_icon", false)) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            case 1:
                methodHookParam.getClass();
                C1659s c1659s2 = this.f5451b;
                if (AbstractC4302b.m8640c(c1659s2.f5453a.f12143a, "Hchat_moments_bottom_detail_config").getBoolean("moments_bottom_detail_enable", false) && (obj = methodHookParam.thisObject) != null && (result = methodHookParam.getResult()) != null && C1659s.m4230c(result.getClass()) && (lM4236o = C1659s.m4236o(result, "field_createTime")) != null) {
                    Object obj4 = c1659s2.f5460h.get();
                    obj4.getClass();
                    Map map = (Map) obj4;
                    Object linkedHashMap = map.get(obj);
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        map.put(obj, linkedHashMap);
                    }
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) linkedHashMap;
                    linkedHashMap2.put(lM4236o, result);
                    while (linkedHashMap2.size() > 32) {
                        Set setKeySet = linkedHashMap2.keySet();
                        setKeySet.getClass();
                        Long l10 = (Long) AbstractC4166m.m8423u1(setKeySet);
                        if (l10 != null) {
                            linkedHashMap2.remove(l10);
                        }
                    }
                }
                break;
            case 2:
                methodHookParam.getClass();
                C1659s c1659s3 = this.f5451b;
                if (AbstractC4302b.m8640c(c1659s3.f5453a.f12143a, "Hchat_moments_bottom_detail_config").getBoolean("moments_bottom_detail_enable", false) && (obj2 = methodHookParam.thisObject) != null) {
                    Object[] objArr = methodHookParam.args;
                    objArr.getClass();
                    Object objM8366C0 = AbstractC4165l.m8366C0(2, objArr);
                    Number number = objM8366C0 instanceof Number ? (Number) objM8366C0 : null;
                    if (number != null) {
                        long jLongValue = number.longValue();
                        LinkedHashMap linkedHashMap3 = (LinkedHashMap) ((WeakHashMap) c1659s3.f5460h.get()).get(obj2);
                        if (linkedHashMap3 != null && (obj3 = linkedHashMap3.get(Long.valueOf(jLongValue))) != null) {
                            Object[] objArr2 = methodHookParam.args;
                            objArr2.getClass();
                            Object objM8366C02 = AbstractC4165l.m8366C0(0, objArr2);
                            TextView textView = objM8366C02 instanceof TextView ? (TextView) objM8366C02 : null;
                            if (textView != null) {
                                Object[] objArr3 = methodHookParam.args;
                                objArr3.getClass();
                                Object objM8366C03 = AbstractC4165l.m8366C0(1, objArr3);
                                TextView textView2 = objM8366C03 instanceof TextView ? (TextView) objM8366C03 : null;
                                if (textView2 != null) {
                                    CharSequence contentDescription = textView2.getContentDescription();
                                    if (contentDescription == null || (string2 = contentDescription.toString()) == null) {
                                        CharSequence text = textView.getText();
                                        CharSequence text2 = textView2.getText();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append((Object) text);
                                        sb2.append((Object) text2);
                                        string = sb2.toString();
                                    } else {
                                        string = AbstractC3149m.m6721t0(string2) ? null : string2;
                                        if (string == null) {
                                        }
                                    }
                                    textView.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                                    textView2.setText(C1659s.m4229a(c1659s3, obj3, string));
                                    textView2.setContentDescription(textView2.getText());
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 4:
                methodHookParam.getClass();
                C1659s c1659s4 = this.f5451b;
                if (AbstractC4302b.m8640c(c1659s4.f5453a.f12143a, "Hchat_moments_bottom_detail_config").getBoolean("moments_bottom_detail_enable", false)) {
                    Object result2 = methodHookParam.getResult();
                    String str = result2 instanceof String ? (String) result2 : null;
                    if (str != null) {
                        methodHookParam.setResult(C1659s.m4229a(c1659s4, methodHookParam.thisObject, str));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f5450a) {
            case 3:
                methodHookParam.getClass();
                if (AbstractC4302b.m8640c(this.f5451b.f5453a.f12143a, "Hchat_moments_bottom_detail_config").getBoolean("moments_bottom_detail_enable", false)) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
