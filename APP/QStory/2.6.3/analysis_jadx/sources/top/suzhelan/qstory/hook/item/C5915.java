package top.suzhelan.qstory.hook.item;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0062;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.JSONObject;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.C6189;
import p033.AbstractC6336;
import p033.C6335;
import p036.C6359;
import p036.RunnableC6357;
import p287.AbstractC8405;
import p345.C8834;
import top.suzhelan.qstory.hook.item.chat.C5825;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5915 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16103;

    public C5915(C5825 c5825) {
        this.f16103 = 25;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = 0;
        switch (this.f16103) {
            case 0:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object result = methodHookParam.getResult();
                if (result != null) {
                    try {
                        int intField = XposedHelpers.getIntField(result, AbstractC8405.m13972(1759));
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setBooleanField(result, AbstractC8405.m13972(1760), false);
                            XposedHelpers.setIntField(result, AbstractC8405.m13972(1759), 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 9:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 11:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(1823));
                AbstractC8405.m13972(1824);
                String strM13973 = AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵呜喵喵喵呜呜~喵喵喵喵喵呜呜呜");
                C1245 c1245 = c6335M11853.f17458;
                c1245.f3618 = strM13973;
                c1245.f3619 = new Class[]{String.class};
                methodHookParam.setResult(c6335M11853.m11856(null, AbstractC8405.m13973("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜喵喵喵~喵喵呜喵喵呜喵喵~喵喵呜喵喵喵喵喵~喵喵呜呜呜喵喵喵")));
                break;
            case 24:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult("");
                break;
            case 26:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6357(methodHookParam, i), 200L);
                break;
            case 27:
                C8834.m14490().m14519().mo11163(new C5856(new C6359(0), 5));
                break;
            case 28:
                new Handler(Looper.getMainLooper()).post(new RunnableC0062(methodHookParam, 16));
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16103) {
            case 1:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr.getClass();
                Object objM8824 = AbstractC4347.m8824(1, objArr);
                if (objM8824 != null) {
                    try {
                        int intField = XposedHelpers.getIntField(objM8824, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵呜喵喵呜呜呜~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"));
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setIntField(objM8824, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵呜喵喵呜呜呜~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"), 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 2:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj = methodHookParam.args[0];
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle != null && bundle.getInt(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), -1) == 0) {
                    int i = bundle.getInt(AbstractC8405.m13972(1776), 0);
                    String string = bundle.getString(AbstractC8405.m13973("喵喵喵呜呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵喵喵~喵喵呜呜喵喵喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"));
                    if (i != 0 && string != null && string.length() != 0) {
                        bundle.putInt(AbstractC8405.m13972(1776), 0);
                        bundle.putString(AbstractC8405.m13973("喵喵喵呜呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵喵喵~喵喵呜呜喵喵喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), "");
                        break;
                    }
                }
                break;
            case 3:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 4:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 5:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 6:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 7:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 8:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
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
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 12:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 13:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 14:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 15:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj2 = methodHookParam.args[0];
                AbstractC8405.m13972(1866);
                obj2.getClass();
                if (((Integer) obj2).intValue() > 0) {
                    methodHookParam.args[0] = 0;
                }
                break;
            case 16:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 17:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                if (objArr2.length == 3) {
                    Object obj3 = objArr2[2];
                    AbstractC8405.m13972(1954);
                    obj3.getClass();
                    if (!AbstractC4395.m8907(String.valueOf(((Long) obj3).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 18:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr3 = methodHookParam.args;
                if (objArr3.length == 2) {
                    Object obj4 = objArr3[0];
                    AbstractC8405.m13972(1954);
                    obj4.getClass();
                    if (!AbstractC4395.m8907(String.valueOf(((Long) obj4).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 19:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 20:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                try {
                    Object obj5 = methodHookParam.args[0];
                    AbstractC8405.m13972(1866);
                    obj5.getClass();
                    int iIntValue = ((Integer) obj5).intValue();
                    Object obj6 = methodHookParam.thisObject;
                    try {
                        XposedHelpers.setIntField(obj6, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵呜呜呜喵呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵喵呜喵呜"), iIntValue);
                        XposedHelpers.setObjectField(obj6, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵呜喵喵喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵喵喵呜"), String.valueOf(iIntValue));
                        break;
                    } catch (NoSuchFieldError unused2) {
                    }
                    methodHookParam.setResult((Object) null);
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 21:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.args[2] = Integer.MAX_VALUE;
                break;
            case 22:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 23:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 25:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj7 = methodHookParam.args[0];
                AbstractC8405.m13972(1954);
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
                    methodHookParam.setResult(AbstractC8405.m13973("喵呜喵喵喵喵呜呜~呜喵喵呜喵喵呜喵~呜呜喵呜呜呜喵呜~呜呜呜呜呜喵呜喵"));
                }
                break;
            case 29:
                Object obj8 = methodHookParam.args[0];
                if (AbstractC8405.m13972(311).equals((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(310), obj8))) {
                    C6189 c6189 = new C6189();
                    c6189.m11613(C6189.m11608((byte[]) AbstractC6336.m11859(byte[].class, AbstractC8405.m13972(312), obj8)));
                    JSONObject jSONObjectM11614 = c6189.m11614();
                    JSONObject jSONObject = jSONObjectM11614.getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵喵呜"));
                    if (jSONObject.getIntValue(AbstractC8405.m13973("喵呜喵喵喵喵呜喵")) == 732 && jSONObject.getIntValue(AbstractC8405.m13973("喵呜喵喵喵喵喵呜")) == 12) {
                        JSONObject jSONObject2 = jSONObjectM11614.getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵喵喵")).getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵喵呜"));
                        String strValueOf = String.valueOf(jSONObject2.getIntValue(AbstractC8405.m13973("喵呜喵喵喵喵呜喵")));
                        String string2 = jSONObject2.getString(AbstractC8405.m13973("喵呜喵喵喵呜呜呜"));
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(AbstractC8405.m13973("喵呜喵喵喵呜呜喵")).getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵喵喵"));
                        PluginCallback.onTroopBanInfo(strValueOf, QQEnvTool.getUinFromUid(jSONObject3.getString(AbstractC8405.m13973("喵呜喵喵喵喵呜喵"))), QQEnvTool.getUinFromUid(string2), jSONObject3.getLong(AbstractC8405.m13973("喵呜喵喵喵喵喵呜")).longValue());
                        break;
                    }
                }
                break;
        }
    }
}
