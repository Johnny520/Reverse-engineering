package top.suzhelan.qstory.hook.item;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0909;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.JSONObject;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.C7018;
import p049.AbstractC7165;
import p049.C7164;
import p052.C7188;
import p052.RunnableC7186;
import p303.AbstractC9234;
import p361.C9663;
import top.suzhelan.qstory.hook.item.chat.C6655;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6745 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16448;

    public C6745(C6655 c6655) {
        this.f16448 = 25;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 0;
        switch (this.f16448) {
            case 0:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object result = methodHookParam.getResult();
                if (result != null) {
                    try {
                        int intField = XposedHelpers.getIntField(result, AbstractC9234.m14531(1759));
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setBooleanField(result, AbstractC9234.m14531(1760), false);
                            XposedHelpers.setIntField(result, AbstractC9234.m14531(1759), 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 9:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 11:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(1823));
                AbstractC9234.m14531(1824);
                String strM14532 = AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵呜喵喵喵呜呜~喵喵喵喵喵呜呜呜");
                C2080 c2080 = c7164M12412.f17803;
                c2080.f3963 = strM14532;
                c2080.f3964 = new Class[]{String.class};
                methodHookParam.setResult(c7164M12412.m12415(null, AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜喵喵喵~喵喵呜喵喵呜喵喵~喵喵呜喵喵喵喵喵~喵喵呜呜呜喵喵喵")));
                break;
            case 24:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult("");
                break;
            case 26:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC7186(methodHookParam, i), 200L);
                break;
            case 27:
                C9663.m15049().m15078().mo11722(new C6686(new C7188(0), 5));
                break;
            case 28:
                new Handler(Looper.getMainLooper()).post(new RunnableC0909(methodHookParam, 16));
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16448) {
            case 1:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr.getClass();
                Object objM9383 = AbstractC5179.m9383(1, objArr);
                if (objM9383 != null) {
                    try {
                        int intField = XposedHelpers.getIntField(objM9383, AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵呜喵喵呜呜呜~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"));
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setIntField(objM9383, AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵呜喵喵呜呜呜~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"), 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 2:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj = methodHookParam.args[0];
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle != null && bundle.getInt(AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), -1) == 0) {
                    int i = bundle.getInt(AbstractC9234.m14531(1776), 0);
                    String string = bundle.getString(AbstractC9234.m14532("喵喵喵呜呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵喵喵~喵喵呜呜喵喵喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"));
                    if (i != 0 && string != null && string.length() != 0) {
                        bundle.putInt(AbstractC9234.m14531(1776), 0);
                        bundle.putString(AbstractC9234.m14532("喵喵喵呜呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵喵喵~喵喵呜呜喵喵喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), "");
                        break;
                    }
                }
                break;
            case 3:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 4:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 5:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 6:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 7:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 8:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
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
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 12:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 13:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 14:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 15:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj2 = methodHookParam.args[0];
                AbstractC9234.m14531(1866);
                obj2.getClass();
                if (((Integer) obj2).intValue() > 0) {
                    methodHookParam.args[0] = 0;
                }
                break;
            case 16:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 17:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                if (objArr2.length == 3) {
                    Object obj3 = objArr2[2];
                    AbstractC9234.m14531(1954);
                    obj3.getClass();
                    if (!AbstractC5227.m9466(String.valueOf(((Long) obj3).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 18:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr3 = methodHookParam.args;
                if (objArr3.length == 2) {
                    Object obj4 = objArr3[0];
                    AbstractC9234.m14531(1954);
                    obj4.getClass();
                    if (!AbstractC5227.m9466(String.valueOf(((Long) obj4).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 19:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 20:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                try {
                    Object obj5 = methodHookParam.args[0];
                    AbstractC9234.m14531(1866);
                    obj5.getClass();
                    int iIntValue = ((Integer) obj5).intValue();
                    Object obj6 = methodHookParam.thisObject;
                    try {
                        XposedHelpers.setIntField(obj6, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵呜呜呜喵呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵喵呜喵呜"), iIntValue);
                        XposedHelpers.setObjectField(obj6, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵喵喵呜"), String.valueOf(iIntValue));
                        break;
                    } catch (NoSuchFieldError unused2) {
                    }
                    methodHookParam.setResult((Object) null);
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 21:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.args[2] = Integer.MAX_VALUE;
                break;
            case 22:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 23:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 25:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj7 = methodHookParam.args[0];
                AbstractC9234.m14531(1954);
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
                    methodHookParam.setResult(AbstractC9234.m14532("喵呜喵喵喵喵呜呜~呜喵喵呜喵喵呜喵~呜呜喵呜呜呜喵呜~呜呜呜呜呜喵呜喵"));
                }
                break;
            case 29:
                Object obj8 = methodHookParam.args[0];
                if (AbstractC9234.m14531(311).equals((String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(310), obj8))) {
                    C7018 c7018 = new C7018();
                    c7018.m12172(C7018.m12167((byte[]) AbstractC7165.m12418(byte[].class, AbstractC9234.m14531(312), obj8)));
                    JSONObject jSONObjectM12173 = c7018.m12173();
                    JSONObject jSONObject = jSONObjectM12173.getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵喵呜"));
                    if (jSONObject.getIntValue(AbstractC9234.m14532("喵呜喵喵喵喵呜喵")) == 732 && jSONObject.getIntValue(AbstractC9234.m14532("喵呜喵喵喵喵喵呜")) == 12) {
                        JSONObject jSONObject2 = jSONObjectM12173.getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵喵喵")).getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵喵呜"));
                        String strValueOf = String.valueOf(jSONObject2.getIntValue(AbstractC9234.m14532("喵呜喵喵喵喵呜喵")));
                        String string2 = jSONObject2.getString(AbstractC9234.m14532("喵呜喵喵喵呜呜呜"));
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(AbstractC9234.m14532("喵呜喵喵喵呜呜喵")).getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵喵喵"));
                        PluginCallback.onTroopBanInfo(strValueOf, QQEnvTool.getUinFromUid(jSONObject3.getString(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"))), QQEnvTool.getUinFromUid(string2), jSONObject3.getLong(AbstractC9234.m14532("喵呜喵喵喵喵喵呜")).longValue());
                        break;
                    }
                }
                break;
        }
    }
}
