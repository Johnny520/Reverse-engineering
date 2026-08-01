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
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.C0763;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421;
import androidx.fragment.app.C2349;
import androidx.fragment.app.C2357;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.strictmode.Violation;
import androidx.window.layout.C2597;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.AbstractC3120;
import com.google.android.material.datepicker.AbstractC3142;
import com.google.android.material.textfield.TextInputLayout;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC3932;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
import kotlin.C5175;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.selects.C5372;
import kotlinx.coroutines.selects.InterfaceC5367;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import lin.xposed.hook.view.main.itemview.Update;
import p007.C6132;
import p007.C6143;
import p008.C6150;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p032.AbstractC6317;
import p033.C6329;
import p034.C6335;
import p035.AbstractC6340;
import p035.C6338;
import p035.C6344;
import p036.AbstractC6353;
import p038.C6397;
import p038.ViewOnClickListenerC6421;
import p041.C6437;
import p075.C6960;
import p093.C7200;
import p136.C7523;
import p161.AbstractC7641;
import p175.AbstractC7738;
import p251.ExecutorC8177;
import p251.SharedPreferencesC8175;
import p253.AbstractC8189;
import p320.C8708;
import p320.C8710;
import p320.C8712;
import p330.C8792;
import p330.C8794;
import p330.C8798;
import p331.C8799;
import p346.C8849;
import p391.C9114;
import top.suzhelan.qstory.hook.item.C5872;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.C5922;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        MessageDigest messageDigest;
        ByteArrayInputStream byteArrayInputStream;
        int i = this.f281;
        String upperCase = null;
        Object obj = this.f280;
        Object obj2 = this.f279;
        switch (i) {
            case 0:
                ExecutorC0091 executorC0091 = (ExecutorC0091) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    executorC0091.m322();
                }
            case 1:
                AbstractC7738.m13059((ViewOnAttachStateChangeListenerC1421) obj2, (LongSparseArray) obj);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                C2357 c2357 = (C2357) obj;
                if (arrayList.contains(c2357)) {
                    arrayList.remove(c2357);
                    View view = c2357.f6980.f6880;
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State = c2357.f6982;
                    view.getClass();
                    specialEffectsController$Operation$State.applyState(view);
                    return;
                }
                return;
            case 3:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.f10086;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.f10089;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.f10089 = null;
                    materialButton.f10093 = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 4:
                AbstractC3142 abstractC3142 = (AbstractC3142) obj2;
                TextInputLayout textInputLayout = abstractC3142.f10368;
                SimpleDateFormat simpleDateFormat = abstractC3142.f10367;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), ((String) obj).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(AbstractC3120.m7142().getTimeInMillis())).replace(' ', (char) 160)));
                abstractC3142.mo7150();
                return;
            case 5:
                ((InterfaceC5367) obj2).mo10408((C5372) obj, C5175.f14739);
                return;
            case 6:
                C5922 c5922 = (C5922) obj2;
                String str = (String) obj;
                try {
                    long j = Long.parseLong(String.valueOf(c5922.f16107.m11812(0, AbstractC3056.m6668(-3937662425495766439L))));
                    if (j > 0) {
                        TimeUnit.MILLISECONDS.sleep(j);
                    }
                    String strSubstring = (String) c5922.f16107.m11812(null, AbstractC3056.m6668(-3937662485625308583L));
                    if (strSubstring.endsWith(AbstractC3056.m6668(-3937661407588517287L))) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    List listAsList = Arrays.asList(strSubstring.split(AbstractC3056.m6668(-3937661416178451879L)));
                    QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str), (String) listAsList.get(new Random().nextInt(listAsList.size())));
                    return;
                } catch (Exception e) {
                    c5922.getExceptionCollectionToolInstance().m11804(e);
                    return;
                }
            case 7:
                try {
                    ((C5872) obj2).m11222((LinearLayout) obj);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                C0002 c0002 = (C0002) obj2;
                C0763 c0763 = (C0763) obj;
                try {
                    Update.detectUpdates();
                    new Handler(Looper.getMainLooper()).post(new RunnableC0099(c0002, 9, C6960.m12246()));
                    return;
                } catch (Exception unused2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1107(c0763, 15));
                    return;
                }
            case 9:
                ((C0002) obj2).invoke((C8799) obj);
                return;
            case 10:
                C6132 c6132 = C6132.f16715;
                int i2 = ((C6143) obj).f16740;
                c6132.getClass();
                C6132.m11526(i2, (C6150) obj2);
                return;
            case 11:
                C6329 c6329 = (C6329) obj2;
                RunnableC0099 runnableC0099 = (RunnableC0099) obj;
                try {
                    String str2 = AbstractC3932.m8321(AbstractC3056.m6668(-3937590274340160935L)) + AbstractC3056.m6668(-3937561854541563303L) + c6329.f17442;
                    if (c6329.f17442.equals(AbstractC8189.m13681(new File(str2)))) {
                        c6329.f17444 = str2;
                        new Handler(Looper.getMainLooper()).post(runnableC0099);
                    } else {
                        new File(str2).delete();
                        AbstractC6353.m11903(c6329.f17441, str2);
                        c6329.f17444 = str2;
                        new Handler(Looper.getMainLooper()).post(runnableC0099);
                    }
                    return;
                } catch (Throwable unused3) {
                    new Handler(Looper.getMainLooper()).post(runnableC0099);
                    return;
                }
            case 12:
                ((C3061) ComponentCallbacks2C3057.m6720(AbstractC6340.f17460).m6754(new File(((C6329) obj2).f17444)).m6554()).m6744((ImageView) obj);
                return;
            case 13:
                Throwable th = (Throwable) obj;
                String str3 = ((C6338) obj2).f17457;
                if (new File(str3).length() > 2097152) {
                    AbstractC0455.m1161(new File(str3));
                }
                AbstractC0455.m1145(str3, AbstractC6157.m11570(th), true);
                AbstractC6157.m11572(AbstractC3056.m6668(-3937553672628864423L));
                return;
            case 14:
                Throwable th2 = (Throwable) obj;
                String str4 = ((C6344) obj2).f17471;
                if (new File(str4).length() > 2097152) {
                    AbstractC0455.m1161(new File(str4));
                }
                AbstractC0455.m1145(str4, AbstractC6157.m11570(th2), true);
                AbstractC6157.m11572(AbstractC3056.m6668(-3937569207525574055L));
                return;
            case 15:
                ViewOnClickListenerC6421 viewOnClickListenerC6421 = (ViewOnClickListenerC6421) obj2;
                String str5 = (String) ((View) obj).getTag();
                String string = viewOnClickListenerC6421.f17585.getText().toString();
                if (string.isEmpty()) {
                    string = AbstractC3056.m6668(-3937580718037927335L);
                }
                try {
                    viewOnClickListenerC6421.f17586.dismiss();
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937580503289562535L));
                    String str6 = AbstractC3056.m6668(-3937580340080805287L) + URLEncoder.encode(str5) + AbstractC3056.m6668(-3937580211231786407L) + URLEncoder.encode(string);
                    String strM11902 = AbstractC6353.m11902(str6);
                    AbstractC6157.m11573(str6 + AbstractC3056.m6668(-3937580133922375079L) + strM11902, AbstractC3056.m6668(-3937580232706622887L));
                    QQNTSendMsgUtils.sendCard(QQSessionUtils.getCurrentContact(), strM11902);
                    return;
                } catch (Exception e2) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937580112447538599L) + e2);
                    String strM6668 = AbstractC3056.m6668(-3937580232706622887L);
                    String str7 = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM6668, e2.toString(), e2, true);
                    return;
                }
            case 16:
                String str8 = (String) obj;
                try {
                    AbstractC0455.m1170((String) obj2, C6397.f17549 + str8);
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937620480845153703L) + str8);
                    return;
                } catch (Exception e3) {
                    C5919.m11252(e3);
                    return;
                }
            case 17:
                C6437 c6437 = (C6437) obj2;
                String str9 = c6437.f17643;
                String str10 = c6437.f17642;
                String str11 = c6437.f17641;
                String str12 = c6437.f17640;
                String str13 = c6437.f17639;
                String str14 = c6437.f17638;
                String str15 = c6437.f17644;
                try {
                    String strM66682 = AbstractC3056.m6668(-3937611422759126439L);
                    Class cls = Long.TYPE;
                    long jLongValue = ((Long) AbstractC6317.m11831(cls, strM66682, obj)).longValue();
                    long jLongValue2 = ((Long) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937611362629584295L), obj)).longValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC3056.m6668(-3937613368379311527L));
                    sb.append(str9);
                    sb.append(AbstractC3056.m6668(-3937611268140303783L));
                    sb.append(str10);
                    sb.append(AbstractC3056.m6668(-3937612852983236007L));
                    sb.append(str11);
                    sb.append(AbstractC3056.m6668(-3937612676889576871L));
                    sb.append(str12);
                    sb.append(AbstractC3056.m6668(-3937602686795646375L));
                    sb.append(str13.length() > 12 ? AbstractC3056.m6668(-3937561652678100391L) : AbstractC3056.m6668(-3937595612984509863L));
                    sb.append(AbstractC3056.m6668(-3937612578105329063L));
                    sb.append(1);
                    sb.append(AbstractC3056.m6668(-3937611225190630823L));
                    sb.append(URLEncoder.encode(str14));
                    sb.append(AbstractC3056.m6668(-3937612595285198247L));
                    sb.append(str10);
                    sb.append(AbstractC3056.m6668(-3937612346177095079L));
                    sb.append(URLEncoder.encode(Hook_cookie.getName(str15)));
                    sb.append(AbstractC3056.m6668(-3937602532176823719L));
                    sb.append(str13);
                    sb.append(AbstractC3056.m6668(-3937612376241866151L));
                    sb.append(str15);
                    sb.append(AbstractC3056.m6668(-3937611126406383015L));
                    sb.append(jLongValue);
                    sb.append(AbstractC3056.m6668(-3937611165061088679L));
                    byte[] bytes = str14.getBytes(StandardCharsets.UTF_8);
                    byte[] bArr = new byte[1024];
                    try {
                        messageDigest = MessageDigest.getInstance(AbstractC3056.m6668(-3937560909648758183L));
                        byteArrayInputStream = new ByteArrayInputStream(bytes);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    while (true) {
                        int i3 = byteArrayInputStream.read(bArr, 0, 1024);
                        if (i3 != -1) {
                            messageDigest.update(bArr, 0, i3);
                        } else {
                            byteArrayInputStream.close();
                            upperCase = new BigInteger(1, messageDigest.digest()).toString(16).toUpperCase();
                        }
                        sb.append(upperCase.toLowerCase(Locale.ROOT));
                        sb.append(AbstractC3056.m6668(-3937611036212069799L));
                        sb.append(jLongValue2);
                        C6335.m11894(sb.toString(), str13);
                        return;
                    }
                } catch (Exception e5) {
                    Log.d(AbstractC3056.m6668(-3937611079161742759L), String.valueOf(e5));
                    return;
                }
            case 18:
                ((C5443) obj2).m10533((C7200) obj);
                return;
            case 19:
                ((C7523) obj2).f20398.accept((C2597) obj);
                return;
            case 20:
                Violation violation = (Violation) obj;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat((String) obj2), violation);
                throw violation;
            case 21:
                ((AbstractC7641) obj2).mo735((Typeface) obj);
                return;
            case 22:
                SharedPreferencesC8175 sharedPreferencesC8175 = (SharedPreferencesC8175) obj2;
                AbstractC3065.m6832(new File(sharedPreferencesC8175.f22522 + sharedPreferencesC8175.f22521, (String) obj));
                return;
            case 23:
                ExecutorC8177 executorC8177 = (ExecutorC8177) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    executorC8177.m13648();
                }
            case 24:
                int i4 = C8712.f24573;
                C9114 c9114 = ((C8712) obj2).f24575;
                HashSet hashSet = new HashSet(c9114.m14643(String.class, AbstractC3056.m6668(-3937679442156193191L)));
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (String str16 : (List) obj) {
                    if (!hashSet.contains(str16)) {
                        C8849.m14483(str16, QQEnvTool.getCurrentUin());
                        arrayList2.add(str16);
                    }
                }
                c9114.m14640(arrayList2, AbstractC3056.m6668(-3937679442156193191L));
                return;
            case 25:
                C9114 c91142 = ((C8710) obj2).f24569;
                ArrayList arrayListM14643 = c91142.m14643(String.class, AbstractC3056.m6668(-3937679442156193191L));
                for (String str17 : (List) obj) {
                    if (!arrayListM14643.contains(str17)) {
                        C8849.m14483(str17, QQEnvTool.getCurrentUin());
                        arrayListM14643.add(str17);
                    }
                }
                c91142.m14640(arrayListM14643, AbstractC3056.m6668(-3937679442156193191L));
                return;
            case 26:
                C9114 c91143 = ((C8708) obj2).f24565;
                ArrayList arrayListM146432 = c91143.m14643(String.class, AbstractC3056.m6668(-3937679442156193191L));
                for (String str18 : (List) obj) {
                    if (!arrayListM146432.contains(str18)) {
                        C8849.m14483(str18, QQEnvTool.getCurrentUin());
                        arrayListM146432.add(str18);
                    }
                }
                c91143.m14640(arrayListM146432, AbstractC3056.m6668(-3937679442156193191L));
                return;
            case 27:
                C8794 c8794 = (C8794) obj2;
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj;
                HashMap map = C8794.f24747;
                if (((Boolean) methodHookParam.args[0]).booleanValue()) {
                    c8794.m14447((Activity) methodHookParam.thisObject, true);
                    return;
                }
                return;
            case 28:
                C8792 c8792 = (C8792) obj2;
                XC_MethodHook.MethodHookParam methodHookParam2 = (XC_MethodHook.MethodHookParam) obj;
                HashMap map2 = C8792.f24743;
                if (((Boolean) methodHookParam2.args[0]).booleanValue()) {
                    c8792.m14446((Activity) methodHookParam2.thisObject, true);
                    return;
                }
                return;
            default:
                C8798 c8798 = (C8798) obj2;
                XC_MethodHook.MethodHookParam methodHookParam3 = (XC_MethodHook.MethodHookParam) obj;
                HashMap map3 = C8798.f24754;
                if (((Boolean) methodHookParam3.args[0]).booleanValue()) {
                    c8798.m14450((Activity) methodHookParam3.thisObject, true);
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
