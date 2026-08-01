package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.compose.C0849;
import androidx.compose.foundation.lazy.C1604;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.compose.p001ui.contentcapture.ViewOnAttachStateChangeListenerC2256;
import androidx.fragment.app.C3182;
import androidx.fragment.app.C3190;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.strictmode.Violation;
import androidx.window.layout.C3431;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.AbstractC3953;
import com.google.android.material.datepicker.AbstractC3975;
import com.google.android.material.textfield.TextInputLayout;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.C6008;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.selects.C6205;
import kotlinx.coroutines.selects.InterfaceC6200;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import lin.xposed.hook.view.main.itemview.Update;
import p022.C6946;
import p025.C6999;
import p025.C7003;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p049.AbstractC7165;
import p050.C7177;
import p051.C7182;
import p052.AbstractC7187;
import p052.C7185;
import p052.C7189;
import p053.AbstractC7199;
import p055.C7243;
import p055.ViewOnClickListenerC7215;
import p058.C7276;
import p069.AbstractC7390;
import p091.C7790;
import p109.C8030;
import p152.C8353;
import p177.AbstractC8471;
import p191.AbstractC8568;
import p267.ExecutorC9007;
import p267.SharedPreferencesC9005;
import p335.C9504;
import p335.C9506;
import p335.C9508;
import p343.C9577;
import p343.C9579;
import p343.C9581;
import p348.C9614;
import p362.C9665;
import p407.C9924;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.C6758;
import top.suzhelan.qstory.hook.item.C6783;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0946 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f626;

    public /* synthetic */ RunnableC0946(ArrayList arrayList, C3190 c3190, C3182 c3182) {
        this.f626 = 2;
        this.f624 = arrayList;
        this.f625 = c3190;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f626;
        Object obj = this.f625;
        Object obj2 = this.f624;
        switch (i) {
            case 0:
                ExecutorC0938 executorC0938 = (ExecutorC0938) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    executorC0938.m883();
                }
            case 1:
                AbstractC7390.m12613((ViewOnAttachStateChangeListenerC2256) obj2, (LongSparseArray) obj);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                C3190 c3190 = (C3190) obj;
                if (arrayList.contains(c3190)) {
                    arrayList.remove(c3190);
                    View view = c3190.f7326.f7226;
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c3190.f7328;
                    view.getClass();
                    specialEffectsController$Operation$State.applyState(view);
                    return;
                }
                return;
            case 3:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.f10436;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.f10439;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.f10439 = null;
                    materialButton.f10443 = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 4:
                AbstractC3975 abstractC3975 = (AbstractC3975) obj2;
                TextInputLayout textInputLayout = abstractC3975.f10718;
                SimpleDateFormat simpleDateFormat = abstractC3975.f10717;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(C0328R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(C0328R.string.mtrl_picker_invalid_format_use), ((String) obj).replace(' ', (char) 160)) + "\n" + String.format(context.getString(C0328R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(AbstractC3953.m7688().getTimeInMillis())).replace(' ', (char) 160)));
                abstractC3975.mo7696();
                return;
            case 5:
                ((InterfaceC6200) obj2).mo10971((C6205) obj, C6008.f15084);
                return;
            case 6:
                C6758 c6758 = (C6758) obj2;
                String str = (String) obj;
                try {
                    long j = Long.parseLong(String.valueOf(c6758.f16461.m12399(0, "replyDelay")));
                    if (j > 0) {
                        TimeUnit.MILLISECONDS.sleep(j);
                    }
                    String strSubstring = (String) c6758.f16461.m12399(null, "replyText");
                    if (strSubstring.endsWith("|")) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    List listAsList = Arrays.asList(strSubstring.split("\\|"));
                    QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str), (String) listAsList.get(new Random().nextInt(listAsList.size())));
                    return;
                } catch (Exception e) {
                    c6758.getExceptionCollectionToolInstance().m12391(e);
                    return;
                }
            case 7:
                try {
                    ((C6783) obj2).m11884((LinearLayout) obj);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                C0849 c0849 = (C0849) obj2;
                C1604 c1604 = (C1604) obj;
                try {
                    Update.detectUpdates();
                    new Handler(Looper.getMainLooper()).post(new RunnableC0946(c0849, 9, C7790.m12833()));
                    return;
                } catch (Exception unused2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1945(c1604, 15));
                    return;
                }
            case 9:
                ((C0849) obj2).invoke((C9614) obj);
                return;
            case 10:
                C6999 c6999 = C6999.f17312;
                int i2 = ((C7003) obj).f17325;
                c6999.getClass();
                C6999.m12123(i2, (C6946) obj2);
                return;
            case 11:
                String str2 = (String) obj;
                try {
                    AbstractC5894.m10609((String) obj2, C7243.f17939 + str2);
                    AbstractC7014.m12151("语音已保存" + str2);
                    return;
                } catch (Exception e2) {
                    C6755.m11872(e2);
                    return;
                }
            case 12:
                C7177 c7177 = (C7177) obj2;
                RunnableC0946 runnableC0946 = (RunnableC0946) obj;
                try {
                    String str3 = AbstractC4765.m8870("img") + "/" + c7177.f17829;
                    if (c7177.f17829.equals(AbstractC3897.m7384(new File(str3)))) {
                        c7177.f17831 = str3;
                        new Handler(Looper.getMainLooper()).post(runnableC0946);
                    } else {
                        new File(str3).delete();
                        AbstractC7199.m12510(c7177.f17828, str3);
                        c7177.f17831 = str3;
                        new Handler(Looper.getMainLooper()).post(runnableC0946);
                    }
                    return;
                } catch (Throwable unused3) {
                    new Handler(Looper.getMainLooper()).post(runnableC0946);
                    return;
                }
            case 13:
                ((C3894) ComponentCallbacks2C3890.m7325(AbstractC7187.f17852).m7359(new File(((C7177) obj2).f17831)).m7174()).m7349((ImageView) obj);
                return;
            case 14:
                Throwable th = (Throwable) obj;
                String str4 = ((C7185) obj2).f17849;
                if (new File(str4).length() > 2097152) {
                    AbstractC5894.m10611(new File(str4));
                }
                AbstractC5894.m10615(str4, AbstractC7017.m12160(th), true);
                AbstractC7017.m12162("主线程闪退已拦截");
                return;
            case 15:
                Throwable th2 = (Throwable) obj;
                String str5 = ((C7189) obj2).f17860;
                if (new File(str5).length() > 2097152) {
                    AbstractC5894.m10611(new File(str5));
                }
                AbstractC5894.m10615(str5, AbstractC7017.m12160(th2), true);
                AbstractC7017.m12162("子线程闪退已拦截");
                return;
            case 16:
                ViewOnClickListenerC7215 viewOnClickListenerC7215 = (ViewOnClickListenerC7215) obj2;
                String str6 = (String) ((View) obj).getTag();
                String string = viewOnClickListenerC7215.f17895.getText().toString();
                if (string.isEmpty()) {
                    string = "图转卡";
                }
                try {
                    viewOnClickListenerC7215.f17896.dismiss();
                    AbstractC7014.m12151("正在签名 请不要离开聊天窗口...");
                    String str7 = "https://api.lzlnb.cn/api/ark?url=" + URLEncoder.encode(str6) + "&yx=" + URLEncoder.encode(string);
                    String strM12509 = AbstractC7199.m12509(str7);
                    AbstractC7017.m12163(str7 + "->" + strM12509, "send ark");
                    QQNTSendMsgUtils.sendCard(QQSessionUtils.getCurrentContact(), strM12509);
                    return;
                } catch (Exception e3) {
                    AbstractC7014.m12151("签名失败" + e3);
                    String strM14531 = "send ark";
                    String str8 = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM14531, e3.toString(), e3, true);
                    return;
                }
            case 17:
                C7276 c7276 = (C7276) obj2;
                String str9 = c7276.f18008;
                String str10 = c7276.f18007;
                String str11 = c7276.f18006;
                String str12 = c7276.f18005;
                String str13 = c7276.f18004;
                String str14 = c7276.f18003;
                String str15 = c7276.f18009;
                try {
                    String strM145312 = "msgRandom";
                    Class cls = Long.TYPE;
                    long jLongValue = ((Long) AbstractC7165.m12418(cls, strM145312, obj)).longValue();
                    long jLongValue2 = ((Long) AbstractC7165.m12418(cls, "clientSeq", obj)).longValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append("authkey=");
                    sb.append(str9);
                    sb.append("&agreement=0&groupid=");
                    sb.append(str10);
                    sb.append("&channel=");
                    sb.append(str11);
                    sb.append("&listid=");
                    sb.append(str12);
                    sb.append("&skey_type=");
                    sb.append((str13.length() > 12 ? "0" : "2"));
                    sb.append("&grouptype=");
                    sb.append(1);
                    sb.append("&answer=");
                    sb.append(URLEncoder.encode(str14));
                    sb.append("&groupuin=");
                    sb.append(str10);
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(Hook_cookie.getName(str15)));
                    sb.append("&skey=");
                    sb.append(str13);
                    sb.append("&uin=");
                    sb.append(str15);
                    sb.append("&msg_id=");
                    sb.append(jLongValue);
                    sb.append("&msg_md5=");
                    sb.append(AbstractC8568.m13640(str14.getBytes(StandardCharsets.UTF_8)).toLowerCase(Locale.ROOT));
                    sb.append("&msg_seq=");
                    sb.append(jLongValue2);
                    C7182.m12501(sb.toString(), str13);
                    return;
                } catch (Exception e4) {
                    Log.d("报错口令红包打开", String.valueOf(e4));
                    return;
                }
            case 18:
                ((C6276) obj2).m11096((C8030) obj);
                return;
            case 19:
                ((C8353) obj2).f20738.accept((C3431) obj);
                return;
            case 20:
                Violation violation = (Violation) obj;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat((String) obj2), violation);
                throw violation;
            case 21:
                ((AbstractC8471) obj2).mo1296((Typeface) obj);
                return;
            case 22:
                SharedPreferencesC9005 sharedPreferencesC9005 = (SharedPreferencesC9005) obj2;
                AbstractC3897.m7391(new File(sharedPreferencesC9005.f22866 + sharedPreferencesC9005.f22865, (String) obj));
                return;
            case 23:
                ExecutorC9007 executorC9007 = (ExecutorC9007) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    executorC9007.m14231();
                }
            case 24:
                int i3 = C9508.f24828;
                C9924 c9924 = ((C9508) obj2).f24830;
                HashSet hashSet = new HashSet(c9924.m15239(String.class, "CheckedTroopsToday"));
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (String str16 : (List) obj) {
                    if (!hashSet.contains(str16)) {
                        C9665.m15057(str16, QQEnvTool.getCurrentUin());
                        arrayList2.add(str16);
                    }
                }
                c9924.m15236(arrayList2, "CheckedTroopsToday");
                return;
            case 25:
                C9924 c99242 = ((C9506) obj2).f24824;
                ArrayList arrayListM15239 = c99242.m15239(String.class, "CheckedTroopsToday");
                for (String str17 : (List) obj) {
                    if (!arrayListM15239.contains(str17)) {
                        C9665.m15057(str17, QQEnvTool.getCurrentUin());
                        arrayListM15239.add(str17);
                    }
                }
                c99242.m15236(arrayListM15239, "CheckedTroopsToday");
                return;
            case 26:
                C9924 c99243 = ((C9504) obj2).f24820;
                ArrayList arrayListM152392 = c99243.m15239(String.class, "CheckedTroopsToday");
                for (String str18 : (List) obj) {
                    if (!arrayListM152392.contains(str18)) {
                        C9665.m15057(str18, QQEnvTool.getCurrentUin());
                        arrayListM152392.add(str18);
                    }
                }
                c99243.m15236(arrayListM152392, "CheckedTroopsToday");
                return;
            case 27:
                C9579 c9579 = (C9579) obj2;
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj;
                HashMap map = C9579.f25011;
                if (((Boolean) methodHookParam.args[0]).booleanValue()) {
                    c9579.m15001((Activity) methodHookParam.thisObject, true);
                    return;
                }
                return;
            case 28:
                C9577 c9577 = (C9577) obj2;
                XC_MethodHook.MethodHookParam methodHookParam2 = (XC_MethodHook.MethodHookParam) obj;
                HashMap map2 = C9577.f25007;
                if (((Boolean) methodHookParam2.args[0]).booleanValue()) {
                    c9577.m15000((Activity) methodHookParam2.thisObject, true);
                    return;
                }
                return;
            default:
                C9581 c9581 = (C9581) obj2;
                XC_MethodHook.MethodHookParam methodHookParam3 = (XC_MethodHook.MethodHookParam) obj;
                HashMap map3 = C9581.f25015;
                if (((Boolean) methodHookParam3.args[0]).booleanValue()) {
                    c9581.m15002((Activity) methodHookParam3.thisObject, true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0946(Object obj, int i, Object obj2) {
        this.f626 = i;
        this.f624 = obj;
        this.f625 = obj2;
    }
}
