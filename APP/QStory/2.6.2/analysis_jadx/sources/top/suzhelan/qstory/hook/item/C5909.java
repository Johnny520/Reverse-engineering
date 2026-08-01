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
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object result = methodHookParam.getResult();
                if (result != null) {
                    try {
                        int intField = XposedHelpers.getIntField(result, AbstractC3056.m6668(-3937732214419359143L));
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setBooleanField(result, AbstractC3056.m6668(-3937732227304261031L), false);
                            XposedHelpers.setIntField(result, AbstractC3056.m6668(-3937732214419359143L), 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 9:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 11:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937741732066887079L));
                AbstractC3056.m6668(-3937741495843685799L);
                String strM6668 = AbstractC3056.m6668(-3937741504433620391L);
                C1245 c1245 = c6316M11825.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{String.class};
                methodHookParam.setResult(c6316M11825.m11828(null, AbstractC3056.m6668(-3937741401354405287L)));
                break;
            case 24:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult(AbstractC3056.m6668(-3937561979095614887L));
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
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                AbstractC3056.m6668(-3937732158584784295L);
                objArr.getClass();
                Object objM8845 = AbstractC4346.m8845(1, objArr);
                if (objM8845 != null) {
                    try {
                        int intField = XposedHelpers.getIntField(objM8845, AbstractC3056.m6668(-3937732076980405671L));
                        if (intField == 201 || intField == 202) {
                            XposedHelpers.setIntField(objM8845, AbstractC3056.m6668(-3937732076980405671L), 0);
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 2:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj = methodHookParam.args[0];
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle != null && bundle.getInt(AbstractC3056.m6668(-3937609880865867175L), -1) == 0) {
                    int i = bundle.getInt(AbstractC3056.m6668(-3937730019691070887L), 0);
                    String string = bundle.getString(AbstractC3056.m6668(-3937730032575972775L));
                    if (i != 0 && string != null && string.length() != 0) {
                        bundle.putInt(AbstractC3056.m6668(-3937730019691070887L), 0);
                        bundle.putString(AbstractC3056.m6668(-3937730032575972775L), AbstractC3056.m6668(-3937561979095614887L));
                        break;
                    }
                }
                break;
            case 3:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 4:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 5:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 6:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 7:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 8:
                AbstractC3056.m6668(-3937697365054719399L);
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
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 12:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 13:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 14:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 15:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj2 = methodHookParam.args[0];
                AbstractC3056.m6668(-3937753135205057959L);
                obj2.getClass();
                if (((Integer) obj2).intValue() > 0) {
                    methodHookParam.args[0] = 0;
                }
                break;
            case 16:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 17:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                if (objArr2.length == 3) {
                    Object obj3 = objArr2[2];
                    AbstractC3056.m6668(-3937759461691884967L);
                    obj3.getClass();
                    if (!AbstractC4394.m8917(String.valueOf(((Long) obj3).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 18:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object[] objArr3 = methodHookParam.args;
                if (objArr3.length == 2) {
                    Object obj4 = objArr3[0];
                    AbstractC3056.m6668(-3937759461691884967L);
                    obj4.getClass();
                    if (!AbstractC4394.m8917(String.valueOf(((Long) obj4).longValue()), QQEnvTool.getCurrentUin())) {
                        methodHookParam.setResult(Boolean.FALSE);
                    }
                }
                break;
            case 19:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult((Object) null);
                break;
            case 20:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                try {
                    Object obj5 = methodHookParam.args[0];
                    AbstractC3056.m6668(-3937753135205057959L);
                    obj5.getClass();
                    int iIntValue = ((Integer) obj5).intValue();
                    Object obj6 = methodHookParam.thisObject;
                    try {
                        XposedHelpers.setIntField(obj6, AbstractC3056.m6668(-3937765431696426407L), iIntValue);
                        XposedHelpers.setObjectField(obj6, AbstractC3056.m6668(-3937765418811524519L), String.valueOf(iIntValue));
                        break;
                    } catch (NoSuchFieldError unused2) {
                    }
                    methodHookParam.setResult((Object) null);
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 21:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.args[2] = Integer.MAX_VALUE;
                break;
            case 22:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 23:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                methodHookParam.setResult(-1);
                break;
            case 25:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj7 = methodHookParam.args[0];
                AbstractC3056.m6668(-3937759461691884967L);
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
                    methodHookParam.setResult(AbstractC3056.m6668(-3937797850109576615L));
                }
                break;
            case 29:
                Object obj8 = methodHookParam.args[0];
                if (AbstractC3056.m6668(-3937595844912743847L).equals((String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937595797668103591L), obj8))) {
                    C6158 c6158 = new C6158();
                    c6158.m11582(C6158.m11577((byte[]) AbstractC6317.m11831(byte[].class, AbstractC3056.m6668(-3937595595804640679L), obj8)));
                    JSONObject jSONObjectM11583 = c6158.m11583();
                    JSONObject jSONObject = jSONObjectM11583.getJSONObject(AbstractC3056.m6668(-3937595638754313639L)).getJSONObject(AbstractC3056.m6668(-3937595612984509863L));
                    if (jSONObject.getIntValue(AbstractC3056.m6668(-3937595638754313639L)) == 732 && jSONObject.getIntValue(AbstractC3056.m6668(-3937595612984509863L)) == 12) {
                        JSONObject jSONObject2 = jSONObjectM11583.getJSONObject(AbstractC3056.m6668(-3937595638754313639L)).getJSONObject(AbstractC3056.m6668(-3937595621574444455L)).getJSONObject(AbstractC3056.m6668(-3937595612984509863L));
                        String strValueOf = String.valueOf(jSONObject2.getIntValue(AbstractC3056.m6668(-3937595638754313639L)));
                        String string2 = jSONObject2.getString(AbstractC3056.m6668(-3937595527085163943L));
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(AbstractC3056.m6668(-3937595535675098535L)).getJSONObject(AbstractC3056.m6668(-3937595621574444455L));
                        PluginCallback.onTroopBanInfo(strValueOf, QQEnvTool.getUinFromUid(jSONObject3.getString(AbstractC3056.m6668(-3937595638754313639L))), QQEnvTool.getUinFromUid(string2), jSONObject3.getLong(AbstractC3056.m6668(-3937595612984509863L)).longValue());
                        break;
                    }
                }
                break;
        }
    }
}
