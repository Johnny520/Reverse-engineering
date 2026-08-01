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
import androidx.activity.compose.C0002;
import androidx.compose.foundation.lazy.C0763;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421;
import androidx.fragment.app.C2349;
import androidx.fragment.app.C2357;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.strictmode.Violation;
import androidx.window.layout.C2598;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.AbstractC3121;
import com.google.android.material.datepicker.AbstractC3143;
import com.google.android.material.textfield.TextInputLayout;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC3933;
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
import kotlin.C5176;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.selects.C5373;
import kotlinx.coroutines.selects.InterfaceC5368;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import lin.xposed.hook.view.main.itemview.Update;
import p006.C6117;
import p009.C6170;
import p009.C6174;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p033.AbstractC6336;
import p034.C6348;
import p035.C6353;
import p036.AbstractC6358;
import p036.C6356;
import p036.C6360;
import p037.AbstractC6370;
import p039.C6414;
import p039.ViewOnClickListenerC6386;
import p042.C6447;
import p053.AbstractC6561;
import p075.C6961;
import p093.C7201;
import p136.C7524;
import p161.AbstractC7642;
import p175.AbstractC7739;
import p251.ExecutorC8178;
import p251.SharedPreferencesC8176;
import p287.AbstractC8405;
import p319.C8675;
import p319.C8677;
import p319.C8679;
import p327.C8748;
import p327.C8750;
import p327.C8752;
import p332.C8785;
import p346.C8836;
import p391.C9095;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.C5928;
import top.suzhelan.qstory.hook.item.C5953;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0099 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f279;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f280;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f281;

    public /* synthetic */ RunnableC0099(ArrayList arrayList, C2357 c2357, C2349 c2349) {
        this.f281 = 2;
        this.f279 = arrayList;
        this.f280 = c2357;
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
        int i = this.f281;
        Object obj = this.f280;
        Object obj2 = this.f279;
        switch (i) {
            case 0:
                ExecutorC0091 executorC0091 = (ExecutorC0091) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    executorC0091.m323();
                }
            case 1:
                AbstractC6561.m12054((ViewOnAttachStateChangeListenerC1421) obj2, (LongSparseArray) obj);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                C2357 c2357 = (C2357) obj;
                if (arrayList.contains(c2357)) {
                    arrayList.remove(c2357);
                    View view = c2357.f6981.f6881;
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c2357.f6983;
                    view.getClass();
                    specialEffectsController$Operation$State.applyState(view);
                    return;
                }
                return;
            case 3:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.f10091;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.f10094;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.f10094 = null;
                    materialButton.f10098 = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 4:
                AbstractC3143 abstractC3143 = (AbstractC3143) obj2;
                TextInputLayout textInputLayout = abstractC3143.f10373;
                SimpleDateFormat simpleDateFormat = abstractC3143.f10372;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), ((String) obj).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(AbstractC3121.m7129().getTimeInMillis())).replace(' ', (char) 160)));
                abstractC3143.mo7137();
                return;
            case 5:
                ((InterfaceC5368) obj2).mo10412((C5373) obj, C5176.f14739);
                return;
            case 6:
                C5928 c5928 = (C5928) obj2;
                String str = (String) obj;
                try {
                    long j = Long.parseLong(String.valueOf(c5928.f16116.m11840(0, AbstractC8405.m13972(1059)))); /* decoded: m13972(1059)=replyDelay */
                    if (j > 0) {
                        TimeUnit.MILLISECONDS.sleep(j);
                    }
                    String strSubstring = (String) c5928.f16116.m11840(null, AbstractC8405.m13972(1058)); /* decoded: m13972(1058)=replyText */
                    if (strSubstring.endsWith(AbstractC8405.m13973("喵喵喵喵呜呜呜呜"))) { /* decoded-inline: | */
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    List listAsList = Arrays.asList(strSubstring.split(AbstractC8405.m13973("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"))); /* decoded-inline: \| */
                    QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str), (String) listAsList.get(new Random().nextInt(listAsList.size())));
                    return;
                } catch (Exception e) {
                    c5928.getExceptionCollectionToolInstance().m11832(e);
                    return;
                }
            case 7:
                try {
                    ((C5953) obj2).m11325((LinearLayout) obj);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                C0002 c0002 = (C0002) obj2;
                C0763 c0763 = (C0763) obj;
                try {
                    Update.detectUpdates();
                    new Handler(Looper.getMainLooper()).post(new RunnableC0099(c0002, 9, C6961.m12274()));
                    return;
                } catch (Exception unused2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1107(c0763, 15));
                    return;
                }
            case 9:
                ((C0002) obj2).invoke((C8785) obj);
                return;
            case 10:
                C6170 c6170 = C6170.f16967;
                int i2 = ((C6174) obj).f16980;
                c6170.getClass();
                C6170.m11564(i2, (C6117) obj2);
                return;
            case 11:
                String str2 = (String) obj;
                try {
                    AbstractC5062.m10050((String) obj2, C6414.f17594 + str2);
                    AbstractC6185.m11592(AbstractC8405.m13972(575) + str2); /* decoded: m13972(575)=语音已保存 */
                    return;
                } catch (Exception e2) {
                    C5925.m11313(e2);
                    return;
                }
            case 12:
                C6348 c6348 = (C6348) obj2;
                RunnableC0099 runnableC0099 = (RunnableC0099) obj;
                try {
                    String str3 = AbstractC3933.m8311(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵呜")) + AbstractC8405.m13973("喵呜喵呜呜呜喵喵") + c6348.f17484; /* decoded-inline: img ; / */
                    if (c6348.f17484.equals(AbstractC3065.m6824(new File(str3)))) {
                        c6348.f17486 = str3;
                        new Handler(Looper.getMainLooper()).post(runnableC0099);
                    } else {
                        new File(str3).delete();
                        AbstractC6370.m11951(c6348.f17483, str3);
                        c6348.f17486 = str3;
                        new Handler(Looper.getMainLooper()).post(runnableC0099);
                    }
                    return;
                } catch (Throwable unused3) {
                    new Handler(Looper.getMainLooper()).post(runnableC0099);
                    return;
                }
            case 13:
                ((C3062) ComponentCallbacks2C3058.m6765(AbstractC6358.f17507).m6799(new File(((C6348) obj2).f17486)).m6614()).m6789((ImageView) obj);
                return;
            case 14:
                Throwable th = (Throwable) obj;
                String str4 = ((C6356) obj2).f17504;
                if (new File(str4).length() > 2097152) {
                    AbstractC5062.m10052(new File(str4));
                }
                AbstractC5062.m10056(str4, AbstractC6188.m11601(th), true);
                AbstractC6188.m11603(AbstractC8405.m13972(78)); /* decoded: m13972(78)=主线程闪退已拦截 */
                return;
            case 15:
                Throwable th2 = (Throwable) obj;
                String str5 = ((C6360) obj2).f17515;
                if (new File(str5).length() > 2097152) {
                    AbstractC5062.m10052(new File(str5));
                }
                AbstractC5062.m10056(str5, AbstractC6188.m11601(th2), true);
                AbstractC6188.m11603(AbstractC8405.m13972(98)); /* decoded: m13972(98)=子线程闪退已拦截 */
                return;
            case 16:
                ViewOnClickListenerC6386 viewOnClickListenerC6386 = (ViewOnClickListenerC6386) obj2;
                String str6 = (String) ((View) obj).getTag();
                String string = viewOnClickListenerC6386.f17550.getText().toString();
                if (string.isEmpty()) {
                    string = AbstractC8405.m13972(289); /* decoded: m13972(289)=图转卡 */
                }
                try {
                    viewOnClickListenerC6386.f17551.dismiss();
                    AbstractC6185.m11592(AbstractC8405.m13972(293)); /* decoded: m13972(293)=正在签名 请不要离开聊天窗口... */
                    String str7 = AbstractC8405.m13972(294) + URLEncoder.encode(str6) + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵呜喵呜喵呜喵呜") + URLEncoder.encode(string); /* decoded: m13972(294)=https://api.lzlnb.cn/api/ark?url= */ /* decoded-inline: &yx= */
                    String strM11950 = AbstractC6370.m11950(str7);
                    AbstractC6188.m11604(str7 + AbstractC8405.m13973("喵呜喵呜呜呜呜喵~喵呜喵喵呜喵呜呜") + strM11950, AbstractC8405.m13972(295)); /* decoded: m13972(295)=send ark */ /* decoded-inline: -> */
                    QQNTSendMsgUtils.sendCard(QQSessionUtils.getCurrentContact(), strM11950);
                    return;
                } catch (Exception e3) {
                    AbstractC6185.m11592(AbstractC8405.m13972(296) + e3); /* decoded: m13972(296)=签名失败 */
                    String strM13972 = AbstractC8405.m13972(295); /* decoded: m13972(295)=send ark */
                    String str8 = AbstractC6188.f17016;
                    AbstractC6188.m11605(strM13972, e3.toString(), e3, true);
                    return;
                }
            case 17:
                C6447 c6447 = (C6447) obj2;
                String str9 = c6447.f17663;
                String str10 = c6447.f17662;
                String str11 = c6447.f17661;
                String str12 = c6447.f17660;
                String str13 = c6447.f17659;
                String str14 = c6447.f17658;
                String str15 = c6447.f17664;
                try {
                    String strM139722 = AbstractC8405.m13972(484); /* decoded: m13972(484)=msgRandom */
                    Class cls = Long.TYPE;
                    long jLongValue = ((Long) AbstractC6336.m11859(cls, strM139722, obj)).longValue();
                    long jLongValue2 = ((Long) AbstractC6336.m11859(cls, AbstractC8405.m13972(485), obj)).longValue(); /* decoded: m13972(485)=clientSeq */
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC8405.m13972(453)); /* decoded: m13972(453)=authkey= */
                    sb.append(str9);
                    sb.append(AbstractC8405.m13972(486)); /* decoded: m13972(486)=&agreement=0&groupid= */
                    sb.append(str10);
                    sb.append(AbstractC8405.m13972(462)); /* decoded: m13972(462)=&channel= */
                    sb.append(str11);
                    sb.append(AbstractC8405.m13972(466)); /* decoded: m13972(466)=&listid= */
                    sb.append(str12);
                    sb.append(AbstractC8405.m13972(394)); /* decoded: m13972(394)=&skey_type= */
                    sb.append(AbstractC8405.m13973(str13.length() > 12 ? "喵呜喵喵喵喵呜呜" : "喵呜喵喵喵喵喵呜"));
                    sb.append(AbstractC8405.m13972(467)); /* decoded: m13972(467)=&grouptype= */
                    sb.append(1);
                    sb.append(AbstractC8405.m13972(487)); /* decoded: m13972(487)=&answer= */
                    sb.append(URLEncoder.encode(str14));
                    sb.append(AbstractC8405.m13972(468)); /* decoded: m13972(468)=&groupuin= */
                    sb.append(str10);
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵呜喵呜喵喵喵呜")); /* decoded-inline: &name= */
                    sb.append(URLEncoder.encode(Hook_cookie.getName(str15)));
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜呜呜喵喵~喵呜喵呜喵喵喵呜")); /* decoded-inline: &skey= */
                    sb.append(str13);
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵呜喵呜呜喵喵喵")); /* decoded-inline: &uin= */
                    sb.append(str15);
                    sb.append(AbstractC8405.m13972(488)); /* decoded: m13972(488)=&msg_id= */
                    sb.append(jLongValue);
                    sb.append(AbstractC8405.m13972(489)); /* decoded: m13972(489)=&msg_md5= */
                    sb.append(AbstractC7739.m13081(str14.getBytes(StandardCharsets.UTF_8)).toLowerCase(Locale.ROOT));
                    sb.append(AbstractC8405.m13972(490)); /* decoded: m13972(490)=&msg_seq= */
                    sb.append(jLongValue2);
                    C6353.m11942(sb.toString(), str13);
                    return;
                } catch (Exception e4) {
                    Log.d(AbstractC8405.m13972(491), String.valueOf(e4)); /* decoded: m13972(491)=报错口令红包打开 */
                    return;
                }
            case 18:
                ((C5444) obj2).m10537((C7201) obj);
                return;
            case 19:
                ((C7524) obj2).f20393.accept((C2598) obj);
                return;
            case 20:
                Violation violation = (Violation) obj;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat((String) obj2), violation);
                throw violation;
            case 21:
                ((AbstractC7642) obj2).mo736((Typeface) obj);
                return;
            case 22:
                SharedPreferencesC8176 sharedPreferencesC8176 = (SharedPreferencesC8176) obj2;
                AbstractC3065.m6831(new File(sharedPreferencesC8176.f22521 + sharedPreferencesC8176.f22520, (String) obj));
                return;
            case 23:
                ExecutorC8178 executorC8178 = (ExecutorC8178) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    executorC8178.m13672();
                }
            case 24:
                int i3 = C8679.f24483;
                C9095 c9095 = ((C8679) obj2).f24485;
                HashSet hashSet = new HashSet(c9095.m14680(String.class, AbstractC8405.m13972(1212))); /* decoded: m13972(1212)=CheckedTroopsToday */
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (String str16 : (List) obj) {
                    if (!hashSet.contains(str16)) {
                        C8836.m14498(str16, QQEnvTool.getCurrentUin());
                        arrayList2.add(str16);
                    }
                }
                c9095.m14677(arrayList2, AbstractC8405.m13972(1212)); /* decoded: m13972(1212)=CheckedTroopsToday */
                return;
            case 25:
                C9095 c90952 = ((C8677) obj2).f24479;
                ArrayList arrayListM14680 = c90952.m14680(String.class, AbstractC8405.m13972(1212)); /* decoded: m13972(1212)=CheckedTroopsToday */
                for (String str17 : (List) obj) {
                    if (!arrayListM14680.contains(str17)) {
                        C8836.m14498(str17, QQEnvTool.getCurrentUin());
                        arrayListM14680.add(str17);
                    }
                }
                c90952.m14677(arrayListM14680, AbstractC8405.m13972(1212)); /* decoded: m13972(1212)=CheckedTroopsToday */
                return;
            case 26:
                C9095 c90953 = ((C8675) obj2).f24475;
                ArrayList arrayListM146802 = c90953.m14680(String.class, AbstractC8405.m13972(1212)); /* decoded: m13972(1212)=CheckedTroopsToday */
                for (String str18 : (List) obj) {
                    if (!arrayListM146802.contains(str18)) {
                        C8836.m14498(str18, QQEnvTool.getCurrentUin());
                        arrayListM146802.add(str18);
                    }
                }
                c90953.m14677(arrayListM146802, AbstractC8405.m13972(1212)); /* decoded: m13972(1212)=CheckedTroopsToday */
                return;
            case 27:
                C8750 c8750 = (C8750) obj2;
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj;
                HashMap map = C8750.f24666;
                if (((Boolean) methodHookParam.args[0]).booleanValue()) {
                    c8750.m14442((Activity) methodHookParam.thisObject, true);
                    return;
                }
                return;
            case 28:
                C8748 c8748 = (C8748) obj2;
                XC_MethodHook.MethodHookParam methodHookParam2 = (XC_MethodHook.MethodHookParam) obj;
                HashMap map2 = C8748.f24662;
                if (((Boolean) methodHookParam2.args[0]).booleanValue()) {
                    c8748.m14441((Activity) methodHookParam2.thisObject, true);
                    return;
                }
                return;
            default:
                C8752 c8752 = (C8752) obj2;
                XC_MethodHook.MethodHookParam methodHookParam3 = (XC_MethodHook.MethodHookParam) obj;
                HashMap map3 = C8752.f24670;
                if (((Boolean) methodHookParam3.args[0]).booleanValue()) {
                    c8752.m14443((Activity) methodHookParam3.thisObject, true);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0099(Object obj, int i, Object obj2) {
        this.f281 = i;
        this.f279 = obj;
        this.f280 = obj2;
    }
}
