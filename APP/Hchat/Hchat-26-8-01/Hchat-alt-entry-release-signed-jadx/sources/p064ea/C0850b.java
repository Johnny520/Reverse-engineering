package p064ea;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import de.robv.android.xposed.XC_MethodHook;
import ga.C1376a;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.util.HashSet;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p036c9.C0456k1;
import p068eh.AbstractC0921a;
import p079fa.C1098a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1645h0;
import p119i2.C1955z;
import p211o9.C3089b;
import p211o9.C3090c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: ea.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0850b extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2601b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0850b(Context context, int i9) {
        this.f2600a = i9;
        switch (i9) {
            case 3:
                HashSet hashSet = C1645h0.f5407e;
                this.f2601b = context;
                break;
            default:
                HashSet hashSet2 = C1376a.f4571e;
                this.f2601b = context;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        switch (this.f2600a) {
            case 4:
                methodHookParam.getClass();
                boolean z9 = false;
                if (AbstractC4302b.m8640c(this.f2601b, "Hchat_status_text_limit_config").getBoolean("status_text_limit_enable", false) && (obj = methodHookParam.thisObject) != null) {
                    C3010h c3010h = new C3010h(new C3011i(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredFields(obj.getClass())), true, new C1955z(19)), true, new C0456k1(obj, 9)));
                    while (c3010h.hasNext()) {
                        if (KavaReflector.writeField((Field) c3010h.next(), obj, (Object) 2000)) {
                            z9 = true;
                        }
                    }
                    if (!z9) {
                        AbstractC1184v0.m3203m("[Hchat:StatusTextLimit] 未找到可修改的状态词长度字段");
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws JSONException {
        Object c3959f;
        String strConcat;
        C3089b c3089bM6564a;
        Integer numM6568g;
        int i9 = this.f2600a;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        spannableStringBuilder = null;
        spannableStringBuilder = null;
        spannableStringBuilder = null;
        spannableStringBuilder = null;
        SpannableStringBuilder spannableStringBuilder = null;
        Context context = this.f2601b;
        switch (i9) {
            case 0:
                methodHookParam.getClass();
                if (AbstractC4302b.m8640c(context, "Hchat_fake_mini_program_base_lib_config").getBoolean("fake_mini_program_base_lib_enable", false)) {
                    Object[] objArr = methodHookParam.args;
                    objArr.getClass();
                    Object objM8366C0 = AbstractC4165l.m8366C0(1, objArr);
                    JSONObject jSONObject = objM8366C0 instanceof JSONObject ? (JSONObject) objM8366C0 : null;
                    if (jSONObject != null) {
                        String strOptString = jSONObject.optString("url");
                        strOptString.getClass();
                        if (strOptString.equals("https://support.weixin.qq.com/update") || AbstractC3156t.m6740d0(strOptString, "https://support.weixin.qq.com/update/", false) || strOptString.equals("https://szsupport.weixin.qq.com/update") || AbstractC3156t.m6740d0(strOptString, "https://szsupport.weixin.qq.com/update/", false)) {
                            jSONObject.put("url", HttpUrl.FRAGMENT_ENCODE_SET);
                        }
                    }
                    break;
                }
                break;
            case 1:
                methodHookParam.getClass();
                HashSet hashSet = C1098a.f3537f;
                if (AbstractC4302b.m8640c(context, "Hchat_skip_global_mini_program_splash_ads_config").getBoolean("skip_global_mini_program_splash_ads_enable", false)) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            case 2:
                methodHookParam.getClass();
                HashSet hashSet2 = C1376a.f4571e;
                if (AbstractC4302b.m8640c(context, "Hchat_skip_mini_program_video_ads_config").getBoolean("skip_mini_program_video_ads_enable", false)) {
                    Object[] objArr2 = methodHookParam.args;
                    objArr2.getClass();
                    if (AbstractC1416l.m3825a(AbstractC4165l.m8366C0(0, objArr2), "onVideoTimeUpdate")) {
                        Object[] objArr3 = methodHookParam.args;
                        objArr3.getClass();
                        Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr3);
                        String str2 = objM8366C02 instanceof String ? (String) objM8366C02 : null;
                        if (str2 != null) {
                            try {
                                c3959f = new JSONObject(str2);
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            JSONObject jSONObject2 = (JSONObject) (c3959f instanceof C3959f ? null : c3959f);
                            if (jSONObject2 != null) {
                                jSONObject2.put("position", 60);
                                jSONObject2.put("duration", 1);
                                methodHookParam.args[1] = jSONObject2.toString();
                            }
                        }
                        break;
                    }
                }
                break;
            case 3:
                methodHookParam.getClass();
                HashSet hashSet3 = C1645h0.f5407e;
                if (AbstractC4302b.m8640c(context, "Hchat_remove_moments_ads_config").getBoolean("remove_moments_ads_enable", false)) {
                    methodHookParam.setResult((Object) null);
                    break;
                }
                break;
            case 4:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 5:
                methodHookParam.getClass();
                Object[] objArr4 = methodHookParam.args;
                Object objM8366C03 = objArr4 != null ? AbstractC4165l.m8366C0(0, objArr4) : null;
                CharSequence charSequence = objM8366C03 instanceof CharSequence ? (CharSequence) objM8366C03 : null;
                if (charSequence != null) {
                    String string = charSequence.toString();
                    if (AbstractC3149m.m6709h0(string, "<sysmsg", true) && AbstractC3149m.m6709h0(string, "tmpl_type_profile", true) && AbstractC3149m.m6709h0(string, AbstractC3149m.m6703R0(" 退出了群聊").toString(), false)) {
                        String strM6569h = C3090c.m6569h(string, "username");
                        String strM6569h2 = C3090c.m6569h(string, "nickname");
                        if (AbstractC3149m.m6721t0(strM6569h2)) {
                            strM6569h2 = strM6569h;
                        }
                        String string2 = AbstractC3149m.m6703R0(strM6569h2).toString();
                        if (string2.length() != 0) {
                            if (AbstractC3149m.m6721t0(strM6569h)) {
                                C3089b c3089bM6566e = C3090c.m6566e(string2.concat(" 退出了群聊"));
                                String str3 = c3089bM6566e != null ? c3089bM6566e.f9980a : null;
                                if (str3 != null) {
                                    str = str3;
                                }
                                strM6569h = str;
                            }
                            if (!AbstractC3149m.m6709h0(string2, "(", false) || !AbstractC3149m.m6709h0(string2, ")", false)) {
                                if (AbstractC3149m.m6709h0(string2, "[", false) && AbstractC3149m.m6709h0(string2, "]", false)) {
                                    C3089b c3089bM6566e2 = C3090c.m6566e(string2.concat(" 退出了群聊"));
                                    if (c3089bM6566e2 != null) {
                                        string2 = AbstractC3149m.m6688C0(string2, c3089bM6566e2.f9981b - 1, c3089bM6566e2.f9982c + 1, AbstractC0921a.m2251n("(", c3089bM6566e2.f9980a, ")")).toString();
                                    }
                                } else if (!AbstractC3149m.m6721t0(strM6569h)) {
                                    string2 = AbstractC4855en.m9265i(string2, "(", strM6569h, ")");
                                }
                            }
                            strConcat = string2.concat(" 退出了群聊");
                        }
                    } else {
                        strConcat = null;
                    }
                    if (strConcat != null || (!AbstractC3149m.m6709h0(string, "<_wc_custom_link_", true) && !AbstractC3149m.m6709h0(string, "<sysmsg", true))) {
                        if (strConcat != null) {
                            string = strConcat;
                        }
                        int iM6723v0 = AbstractC3149m.m6723v0(6, string, "退出了群聊");
                        if (iM6723v0 <= 0) {
                            c3089bM6564a = null;
                        } else {
                            c3089bM6564a = C3090c.m6564a(string, iM6723v0, '(', ')');
                            if (c3089bM6564a == null) {
                                c3089bM6564a = C3090c.m6564a(string, iM6723v0, '[', ']');
                            }
                        }
                        if (c3089bM6564a != null) {
                            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_group_leave_monitor_config");
                            if (sharedPreferencesM8640c.getBoolean("group_leave_monitor_enable", false) && ((numM6568g = C3090c.m6568g(sharedPreferencesM8640c.getString("group_leave_monitor_wxid_color", "#576B95"))) != null || (numM6568g = C3090c.m6568g("#576B95")) != null)) {
                                int iIntValue = numM6568g.intValue();
                                spannableStringBuilder = strConcat != null ? new SpannableStringBuilder(strConcat) : new SpannableStringBuilder(charSequence);
                                Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ForegroundColorSpan.class);
                                spans.getClass();
                                for (Object obj : spans) {
                                    spannableStringBuilder.removeSpan((ForegroundColorSpan) obj);
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(iIntValue), c3089bM6564a.f9981b, c3089bM6564a.f9982c, 16711713);
                            }
                        }
                    }
                    if (spannableStringBuilder != null) {
                        methodHookParam.args[0] = spannableStringBuilder;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C0850b(Context context, int i9, boolean z9) {
        this.f2600a = i9;
        this.f2601b = context;
    }
}
