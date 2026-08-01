package top.suzhelan.qstory.hook.item;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0062;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.C6158;
import p032.AbstractC6317;
import p032.C6316;
import p035.C6341;
import p035.RunnableC6339;
import p349.C8865;
import top.suzhelan.qstory.hook.item.chat.C5828;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5909 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16094;

    public C5909(C5828 c5828) {
        this.f16094 = 25;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 0;
        switch (this.f16094) {
            case 0:
                "param";
                methodHookParam.getClass();
                Object result = methodHookParam.getResult();
                if (result != null) {
                    try {
                        int intField = XposedHelpers.getIntField(result, "forbidCode");
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setBooleanField(result, "isForbidAccount", false);
                            XposedHelpers.setIntField(result, "forbidCode", 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 9:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 11:
                "param";
                methodHookParam.getClass();
                C6316 c6316M11825 = C6316.m11825("com.tencent.common.config.pad.DeviceType");
                "find(...)";
                String strM6668 = "valueOf";
                C1245 c1245 = c6316M11825.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{String.class};
                methodHookParam.setResult(c6316M11825.m11828(null, "TABLET"));
                break;
            case 24:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult("");
                break;
            case 26:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6339(methodHookParam, i), 200L);
                break;
            case 27:
                C8865.m14509().m14504().mo11106(new C5851(new C6341(0), 5));
                break;
            case 28:
                new Handler(Looper.getMainLooper()).post(new RunnableC0062(methodHookParam, 15));
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16094) {
            case 1:
                "param";
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                "args";
                objArr.getClass();
                Object objM8845 = AbstractC4346.m8845(1, objArr);
                if (objM8845 != null) {
                    try {
                        int intField = XposedHelpers.getIntField(objM8845, "iResult");
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setIntField(objM8845, "iResult", 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 2:
                "param";
                methodHookParam.getClass();
                Object obj = methodHookParam.args[0];
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle != null && bundle.getInt("result", -1) == 0) {
                    int i = bundle.getInt("jumpResult", 0);
                    String string = bundle.getString("jumpUrl");
                    if (i != 0 && string != null && string.length() != 0) {
                        bundle.putInt("jumpResult", 0);
                        bundle.putString("jumpUrl", "");
                        break;
                    }
                }
                break;
            case 3:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 4:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 5:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 6:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 7:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 8:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 9:
            case 11:
            case 24:
            case 26:
            case 27:
            case 28:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 10:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 12:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 13:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 14:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 15:
                "param";
                methodHookParam.getClass();
                Object obj2 = methodHookParam.args[0];
                "null cannot be cast to non-null type kotlin.Int";
                obj2.getClass();
                if (((Integer) obj2).intValue() > 0) {
                    methodHookParam.args[0] = 0;
                }
                break;
            case 16:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 17:
                "param";
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                if (objArr2.length == 3) {
                    Object obj3 = objArr2[2];
                    "null cannot be cast to non-null type kotlin.Long";
                    obj3.getClass();
                    if (!AbstractC4394.m8917(String.valueOf(((Long) obj3).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 18:
                "param";
                methodHookParam.getClass();
                Object[] objArr3 = methodHookParam.args;
                if (objArr3.length == 2) {
                    Object obj4 = objArr3[0];
                    "null cannot be cast to non-null type kotlin.Long";
                    obj4.getClass();
                    if (!AbstractC4394.m8917(String.valueOf(((Long) obj4).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 19:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 20:
                "param";
                methodHookParam.getClass();
                try {
                    Object obj5 = methodHookParam.args[0];
                    "null cannot be cast to non-null type kotlin.Int";
                    obj5.getClass();
                    int iIntValue = ((Integer) obj5).intValue();
                    Object obj6 = methodHookParam.thisObject;
                    try {
                        XposedHelpers.setIntField(obj6, "mNum", iIntValue);
                        XposedHelpers.setObjectField(obj6, "mText", String.valueOf(iIntValue));
                        break;
                    } catch (NoSuchFieldError unused2) {
                    }
                    methodHookParam.setResult((Object) null);
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 21:
                "param";
                methodHookParam.getClass();
                methodHookParam.args[2] = Integer.MAX_VALUE;
                break;
            case 22:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 23:
                "param";
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 25:
                "param";
                methodHookParam.getClass();
                Object obj7 = methodHookParam.args[0];
                "null cannot be cast to non-null type kotlin.Long";
                obj7.getClass();
                long jLongValue = ((Long) obj7).longValue();
                if (jLongValue > 0) {
                    long j = jLongValue / 86400;
                    long j2 = (jLongValue % 86400) / 3600;
                    long j3 = (jLongValue % 3600) / 60;
                    long j4 = jLongValue % 60;
                    StringBuilder sb = new StringBuilder();
                    if (j > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(j);
                        sb2.append((char) 22825);
                        sb.append(sb2.toString());
                    }
                    if (j2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(j2);
                        sb3.append((char) 26102);
                        sb.append(sb3.toString());
                    }
                    if (j3 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(j3);
                        sb4.append((char) 20998);
                        sb.append(sb4.toString());
                    }
                    if (j4 > 0 || sb.length() == 0) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(j4);
                        sb5.append((char) 31186);
                        sb.append(sb5.toString());
                    }
                    methodHookParam.setResult(sb.toString());
                } else {
                    methodHookParam.setResult("0\u79d2");
                }
                break;
            case 29:
                Object obj8 = methodHookParam.args[0];
                if ("trpc.msg.olpush.OlPushService.MsgPush".equals((String) AbstractC6317.m11831(String.class, "serviceCmd", obj8))) {
                    C6158 c6158 = new C6158();
                    c6158.m11582(C6158.m11577((byte[]) AbstractC6317.m11831(byte[].class, "wupBuffer", obj8)));
                    JSONObject jSONObjectM11583 = c6158.m11583();
                    JSONObject jSONObject = jSONObjectM11583.getJSONObject("1").getJSONObject("2");
                    if (jSONObject.getIntValue("1") == 732 && jSONObject.getIntValue("2") == 12) {
                        JSONObject jSONObject2 = jSONObjectM11583.getJSONObject("1").getJSONObject("3").getJSONObject("2");
                        String strValueOf = String.valueOf(jSONObject2.getIntValue("1"));
                        String string2 = jSONObject2.getString("4");
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("5").getJSONObject("3");
                        PluginCallback.onTroopBanInfo(strValueOf, QQEnvTool.getUinFromUid(jSONObject3.getString("1")), QQEnvTool.getUinFromUid(string2), jSONObject3.getLong("2").longValue());
                        break;
                    }
                }
                break;
        }
    }
}
