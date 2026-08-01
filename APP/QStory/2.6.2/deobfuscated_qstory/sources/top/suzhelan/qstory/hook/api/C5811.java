package top.suzhelan.qstory.hook.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0053;
import androidx.compose.ui.semantics.C1934;
import androidx.fragment.app.RunnableC2346;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2904;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.reader.C2699;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import lin.util.ReflectUtils.ReflectException;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.util.qq.QQEnvTool;
import p000.AbstractC6087;
import p010.AbstractC6154;
import p010.C6158;
import p026.AbstractC6296;
import p028.C6301;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p035.C6347;
import p035.C6348;
import p037.C6356;
import p037.C6358;
import p037.C6366;
import p305.C8631;
import p321.C8723;
import p328.C8782;
import top.suzhelan.qstory.hook.item.C5873;
import top.suzhelan.qstory.hook.item.C5885;
import top.suzhelan.qstory.hook.item.C5893;
import top.suzhelan.qstory.hook.item.C5900;
import top.suzhelan.qstory.hook.item.C5901;
import top.suzhelan.qstory.hook.item.C5903;
import top.suzhelan.qstory.hook.item.C5914;
import top.suzhelan.qstory.hook.item.C5926;
import top.suzhelan.qstory.hook.item.C5932;
import top.suzhelan.qstory.hook.item.C5938;
import top.suzhelan.qstory.hook.item.C5939;
import top.suzhelan.qstory.hook.item.C5942;
import top.suzhelan.qstory.hook.item.chat.C5824;
import top.suzhelan.qstory.hook.item.chat.C5825;
import top.suzhelan.qstory.hook.item.chat.C5837;
import top.suzhelan.qstory.hook.item.chat.C5843;
import top.suzhelan.qstory.hook.item.chat.C5848;
import top.suzhelan.qstory.hook.item.chat.C5852;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5811 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6296 f15934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15935;

    public /* synthetic */ C5811(AbstractC6296 abstractC6296, int i) {
        this.f15935 = i;
        this.f15934 = abstractC6296;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        Object tag;
        Bitmap bitmapM11190;
        List list;
        Class<?>[] interfaces;
        int i = this.f15935;
        Class cls = Integer.TYPE;
        int i2 = 2;
        int i3 = 0;
        AbstractC6296 abstractC6296 = this.f15934;
        switch (i) {
            case 0:
                C5810 c5810 = (C5810) abstractC6296;
                "param";
                methodHookParam.getClass();
                try {
                    String str = c5810.f15933;
                    if (str == null || str.equals(QQEnvTool.getCurrentUin())) {
                        return;
                    }
                    c5810.f15933 = QQEnvTool.getCurrentUin();
                    Collection<PluginLoader> allRunningPluginLoader = PluginManager.getAllRunningPluginLoader();
                    "getAllRunningPluginLoader(...)";
                    allRunningPluginLoader.getClass();
                    if (allRunningPluginLoader.isEmpty()) {
                        return;
                    }
                    AbstractC6154.m11561("[QStory] \u5df2\u5207\u6362QQ\u8d26\u53f7 \u8bf7\u91cd\u65b0\u5f00\u542f\u811a\u672c \u9632\u6b62\u811a\u672c\u5f00\u542f\u72b6\u6001\u6df7\u4e71");
                    PluginManager.stopAllPlugin();
                    return;
                } catch (Exception e) {
                    c5810.getExceptionCollectionToolInstance().m11804(e);
                    return;
                }
            case 2:
                "param";
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                C5914 c5914 = (C5914) abstractC6296;
                obj.getClass();
                C5914.m11240(c5914, obj, "bubbleId");
                C5914.m11240(c5914, obj, "subBubbleId");
                return;
            case 7:
                "param";
                methodHookParam.getClass();
                if (((C5942) abstractC6296).f17376.booleanValue()) {
                    try {
                        Object result = methodHookParam.getResult();
                        LinearLayout linearLayout = result instanceof LinearLayout ? (LinearLayout) result : null;
                        if (linearLayout != null && linearLayout.getChildCount() > 0 && (linearLayout.getChildAt(0) instanceof ImageView)) {
                            linearLayout.removeViewAt(0);
                            linearLayout.setGravity(17);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 10:
                "param";
                methodHookParam.getClass();
                if (((C5903) abstractC6296).f17376.booleanValue()) {
                    Object obj2 = methodHookParam.thisObject;
                    BaseAdapter baseAdapter = obj2 instanceof BaseAdapter ? (BaseAdapter) obj2 : null;
                    if (baseAdapter == null) {
                        return;
                    }
                    Object obj3 = methodHookParam.args[0];
                    "null cannot be cast to non-null type kotlin.Int";
                    obj3.getClass();
                    Object item = baseAdapter.getItem(((Integer) obj3).intValue());
                    if (item == null) {
                        return;
                    }
                    String string = item.toString();
                    Matcher matcher = Pattern.compile("str_file_name='([^']*)'").matcher(string);
                    String strGroup = matcher.find() ? matcher.group(1) : null;
                    Matcher matcher2 = Pattern.compile("uint32_download_times=(\\d+)").matcher(string);
                    String strGroup2 = matcher2.find() ? matcher2.group(1) : null;
                    if (strGroup == null || strGroup2 == null || strGroup2.equals("0")) {
                        return;
                    }
                    Object result2 = methodHookParam.getResult();
                    View view = result2 instanceof View ? (View) result2 : null;
                    if (view == null || (tag = view.getTag()) == null) {
                        return;
                    }
                    Field[] declaredFields = tag.getClass().getDeclaredFields();
                    "getDeclaredFields(...)";
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        Object obj4 = field.get(tag);
                        if (obj4 instanceof TextView) {
                            TextView textView = (TextView) obj4;
                            if (strGroup.equals(textView.getText().toString())) {
                                StringBuilder sbM149 = AbstractC0053.m149(strGroup);
                                sbM149.append(" (\u4e0b\u8f7d\u6570\uff1a");
                                sbM149.append(strGroup2);
                                sbM149.append(')');
                                textView.setText(sbM149.toString());
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            case 15:
                "param";
                methodHookParam.getClass();
                if (((C5852) abstractC6296).f17376.booleanValue()) {
                    Object obj5 = methodHookParam.args[2];
                    ViewGroup viewGroup = obj5 instanceof ViewGroup ? (ViewGroup) obj5 : null;
                    if (viewGroup == null) {
                        return;
                    }
                    viewGroup.setVisibility(8);
                    return;
                }
                return;
            case 16:
                final C5837 c5837 = (C5837) abstractC6296;
                "param";
                methodHookParam.getClass();
                try {
                    Object obj6 = methodHookParam.thisObject;
                    final Object obj7 = methodHookParam.args[1];
                    if (obj7 == null) {
                        return;
                    }
                    obj6.getClass();
                    ImageView imageViewM11192 = C5837.m11192(c5837, obj6);
                    if (imageViewM11192 == null) {
                        return;
                    }
                    String name = imageViewM11192.getContext().getClass().getName();
                    "getName(...)";
                    if (!AbstractC5143.m10171(name, "MultiForwardActivity", false) && (bitmapM11190 = C5837.m11190(c5837)) != null) {
                        int iM6267 = c5837.f15986;
                        if (iM6267 == 0) {
                            Context context = AbstractC6340.f17460;
                            C6301 c6301 = c5837.f15985;
                            c6301.getClass();
                            Object objM11812 = c6301.m11812(50, "size");
                            "null cannot be cast to non-null type kotlin.Int";
                            objM11812.getClass();
                            iM6267 = AbstractC2904.m6267(context, ((Integer) objM11812).intValue());
                            c5837.f15986 = iM6267;
                        }
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM11190, iM6267, iM6267, true);
                        "createScaledBitmap(...)";
                        bitmapCreateScaledBitmap.getClass();
                        imageViewM11192.setImageBitmap(bitmapCreateScaledBitmap);
                        Object tag2 = imageViewM11192.getTag(37327667);
                        Boolean bool = Boolean.TRUE;
                        if (!AbstractC4394.m8917(tag2, bool)) {
                            imageViewM11192.setOnClickListener(new View.OnClickListener() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏哲兰楪
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
                                @Override // android.view.View.OnClickListener
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void onClick(android.view.View r9) {
                                    /*
                                        r8 = this;
                                        java.lang.Object r9 = r2
                                        top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰楪哲 r8 = r1
                                        飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏兰哲 r0 = r8.f15985
                                        r1 = 0
                                        if (r0 == 0) goto L21
                                        r2 = -3937783337415083431(0xc95a2eeafaebfa59, double:-2.335625999683132E45)
                                        java.lang.String r2 = com.bumptech.glide.AbstractC3056.m6668(r2)
                                        java.lang.Boolean r3 = java.lang.Boolean.FALSE
                                        java.lang.Object r0 = r0.m11812(r3, r2)
                                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                                        if (r0 == 0) goto L21
                                        boolean r0 = r0.booleanValue()
                                        goto L22
                                    L21:
                                        r0 = r1
                                    L22:
                                        if (r0 == 0) goto L35
                                        long r2 = java.lang.System.currentTimeMillis()
                                        long r4 = r8.f15984
                                        long r4 = r2 - r4
                                        long r6 = r8.f15983
                                        int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                        if (r0 <= 0) goto L35
                                        r8.f15984 = r2
                                        return
                                    L35:
                                        long r2 = java.lang.System.currentTimeMillis()
                                        r8.f15984 = r2
                                        java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Exception -> L52
                                        r2 = -3937563495219070375(0xc95af6dcfaebfa59, double:-2.4052967726159928E45)
                                        java.lang.String r2 = com.bumptech.glide.AbstractC3056.m6668(r2)     // Catch: java.lang.Exception -> L52
                                        r3 = 0
                                        java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch: java.lang.Exception -> L52
                                        java.lang.Object r0 = r0.invoke(r9, r3)     // Catch: java.lang.Exception -> L52
                                        goto L61
                                    L52:
                                        r2 = -3937747568927442343(0xc95a4f72faebfa59, double:-2.3469614858900024E45)
                                        java.lang.String r0 = com.bumptech.glide.AbstractC3056.m6668(r2)     // Catch: java.lang.Exception -> L83
                                        java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                                        java.lang.Object r0 = p032.AbstractC6317.m11831(r2, r0, r9)     // Catch: java.lang.Exception -> L83
                                    L61:
                                        if (r0 != 0) goto L64
                                        goto L83
                                    L64:
                                        r2 = -3937709266409096615(0xc95a7248faebfa59, double:-2.359100038482806E45)
                                        java.lang.String r2 = com.bumptech.glide.AbstractC3056.m6668(r2)     // Catch: java.lang.Exception -> L83
                                        java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L83
                                        java.lang.Object r0 = p032.AbstractC6317.m11831(r3, r2, r0)     // Catch: java.lang.Exception -> L83
                                        java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L83
                                        if (r0 == 0) goto L7b
                                        int r1 = r0.intValue()     // Catch: java.lang.Exception -> L83
                                    L7b:
                                        r0 = 1
                                        if (r1 != r0) goto L7f
                                        goto L83
                                    L7f:
                                        top.suzhelan.qstory.hook.item.chat.C5837.m11191(r8, r9)     // Catch: java.lang.Exception -> L90
                                        goto L94
                                    L83:
                                        r8 = -3937799718420350375(0xc95a2004faebfa59, double:-2.3304346518933863E45)
                                        java.lang.String r8 = com.bumptech.glide.AbstractC3056.m6668(r8)     // Catch: java.lang.Exception -> L90
                                        p010.AbstractC6154.m11561(r8)     // Catch: java.lang.Exception -> L90
                                        goto L94
                                    L90:
                                        r8 = move-exception
                                        r8.printStackTrace()
                                    L94:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5838.onClick(android.view.View):void");
                                }
                            });
                            imageViewM11192.setTag(37327667, bool);
                        }
                        imageViewM11192.setVisibility(0);
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 17:
                "param";
                methodHookParam.getClass();
                if (((C5824) abstractC6296).f17376.booleanValue() && AbstractC4394.m8917(methodHookParam.getResult(), "")) {
                    methodHookParam.setResult("\u5df2\u9000\u51fa\u8be5\u7fa4");
                    return;
                }
                return;
            case 18:
                "param";
                methodHookParam.getClass();
                Object result3 = methodHookParam.getResult();
                List list2 = result3 instanceof List ? (List) result3 : null;
                if (list2 == null) {
                    return;
                }
                methodHookParam.setResult(AbstractC4343.m8817(list2, new C1934((C5825) abstractC6296, i2)));
                return;
            case 19:
                Integer numValueOf = Integer.valueOf(R.mipmap.ic_launcher_round);
                C6348 c6348 = (C6348) abstractC6296;
                Context context2 = (Context) methodHookParam.args[0];
                AbstractC3065.m6858(context2);
                List list3 = (List) methodHookParam.getResult();
                Class<?> cls2 = list3.get(0).getClass();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    try {
                        list = (List) AbstractC6317.m11830(List.class, it.next());
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (list == null || list.isEmpty()) {
                        i3 = 0;
                    } else if (list.get(i3).getClass().getName().startsWith("com.tencent.mobileqq.setting.processor")) {
                        Class<?> cls3 = list.get(i3).getClass();
                        Object objM11389 = AbstractC6340.f17461 >= 10290 ? AbstractC6087.m11389(new Object[]{context2, 21002, context2.getString(R.string.app_name), numValueOf, context2.getString(R.string.app_name)}, new Class[]{Context.class, cls, CharSequence.class, cls, String.class}, cls3) : AbstractC6087.m11389(new Object[]{context2, 21002, context2.getString(R.string.app_name), numValueOf}, new Class[]{Context.class, cls, CharSequence.class, cls}, cls3);
                        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC6314.m11823(cls3, new C8631(26))));
                        arrayList.sort(Comparator.comparing(new C2699(27)));
                        ((Method) arrayList.get(i3)).invoke(objM11389, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("kotlin.jvm.functions.Function0")}, new C6347(context2)));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(objM11389);
                        arrayList2.add(C6348.m11898(context2, cls3));
                        arrayList2.add(C6348.m11897(context2, cls3));
                        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                        int length = declaredConstructors.length;
                        for (int i4 = i3; i4 < length; i4++) {
                            Constructor<?> constructor = declaredConstructors[i4];
                            if (constructor.getParameterTypes().length == 5) {
                                constructor.setAccessible(true);
                                list3.add(1, constructor.newInstance(arrayList2, null, null, 6, null));
                                return;
                            }
                            try {
                            } catch (Exception e3) {
                                e = e3;
                            }
                        }
                        throw new ReflectException(AbstractC0053.m156("查找不到指定长度的构造方法 : ", cls2.getName(), " 想要查找的长度 : 5"));
                    }
                    c6348.getExceptionCollectionToolInstance().m11804(e);
                    i3 = 0;
                }
                return;
            case 21:
                C6366 c6366 = (C6366) abstractC6296;
                try {
                    Object obj8 = methodHookParam.thisObject;
                    C6316 c6316M11826 = C6316.m11826(obj8.getClass());
                    c6316M11826.f17409.f3617 = "getHostView";
                    View view2 = (View) c6316M11826.m11828(obj8, new Object[0]);
                    Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem");
                    HashMap map = AbstractC6317.f17410;
                    Object obj9 = AbstractC6317.m11833(obj8.getClass(), clsM11838).get(obj8);
                    if (obj9 != null && view2 != null) {
                        C6316 c6316M118262 = C6316.m11826(obj9.getClass());
                        c6316M118262.f17409.f3617 = "getMsgRecord";
                        Iterator it2 = ((ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", c6316M118262.m11828(obj9, new Object[0]))).iterator();
                        while (it2.hasNext()) {
                            if (((Integer) AbstractC6317.m11831(cls, "elementType", it2.next())).intValue() <= 2) {
                                c6366.m11914((ViewGroup) view2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    c6366.getExceptionCollectionToolInstance().m11804(e4);
                    return;
                }
            case 23:
                Class cls4 = (Class) methodHookParam.getResult();
                if (cls4 == null) {
                    return;
                }
                String name2 = cls4.getName();
                Object[][] objArr = AbstractC6318.f17413;
                if (name2.startsWith("androidx.") || name2.startsWith("android.") || name2.startsWith("kotlin.") || name2.startsWith("kotlinx.") || name2.startsWith("com.tencent.mmkv.") || name2.startsWith("com.android.tools.r8.") || name2.startsWith("com.google.android.") || name2.startsWith("com.google.gson.") || name2.startsWith("com.google.common.") || name2.startsWith("com.microsoft.appcenter.") || name2.startsWith("org.intellij.lang.annotations.") || name2.startsWith("org.jetbrains.annotations.") || (interfaces = cls4.getInterfaces()) == null) {
                    return;
                }
                int length2 = interfaces.length;
                while (i3 < length2) {
                    if (interfaces[i3] == SensorEventListener.class) {
                        ((C8782) abstractC6296).f24733.add(XposedBridge.hookMethod(AbstractC6314.m11821(cls4, "onSensorChanged", new Class[]{SensorEvent.class}), new C6356(12)));
                    }
                    i3++;
                }
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intent intent;
        String stringExtra;
        String strSubstring;
        String strM6668;
        ComponentName component;
        String shortClassName;
        Object tag;
        int i = this.f15935;
        int i2 = 0;
        AbstractC6296 abstractC6296 = this.f15934;
        switch (i) {
            case 1:
                "param";
                methodHookParam.getClass();
                if (((C5926) abstractC6296).f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 2:
            case 10:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 3:
                "param";
                methodHookParam.getClass();
                if (((C5885) abstractC6296).f17376.booleanValue()) {
                    methodHookParam.setResult(new ArrayList());
                }
                break;
            case 4:
                "param";
                methodHookParam.getClass();
                if (((C5893) abstractC6296).f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 5:
                C5873 c5873 = (C5873) abstractC6296;
                "param";
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                Object obj = objArr[0];
                if (obj instanceof Intent) {
                    "null cannot be cast to non-null type android.content.Intent";
                    intent = (Intent) obj;
                } else {
                    Object obj2 = objArr[1];
                    "null cannot be cast to non-null type android.content.Intent";
                    obj2.getClass();
                    intent = (Intent) obj2;
                }
                if (c5873.f17376.booleanValue() && !intent.getBooleanExtra(c5873.f16045, false) && (stringExtra = intent.getStringExtra("url")) != null && !AbstractC5143.m10164(stringExtra)) {
                    Pattern patternCompile = Pattern.compile(c5873.f16046);
                    String lowerCase = stringExtra.toLowerCase(Locale.ROOT);
                    "toLowerCase(...)";
                    lowerCase.getClass();
                    if (patternCompile.matcher(lowerCase).matches()) {
                        if (AbstractC5143.m10171(stringExtra, "://", false)) {
                            strSubstring = stringExtra.substring(AbstractC5143.m10167(stringExtra, "://", 0, false, 6) + 3);
                            "substring(...)";
                        } else {
                            strSubstring = stringExtra;
                        }
                        int length = strSubstring.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                strM6668 = "";
                            } else if (strSubstring.charAt(i3) == '/') {
                                i3++;
                            } else {
                                strM6668 = strSubstring.substring(i3);
                                "substring(...)";
                            }
                        }
                        if (AbstractC5143.m10171(strM6668, "/", false)) {
                            strM6668 = strM6668.substring(0, AbstractC5143.m10167(strM6668, "/", 0, false, 6));
                            "substring(...)";
                        }
                        String strM4563 = AbstractC2442.m4563(strM6668, Locale.ROOT, -3937688152349869479L);
                        if (!strM4563.endsWith("qq.com") && !strM4563.endsWith("tenpay.com") && !strM4563.endsWith("meeting.tencent.com") && !strM4563.equals("qq-web.cdn-go.cn") && (component = intent.getComponent()) != null && (shortClassName = component.getShortClassName()) != null && AbstractC5143.m10171(shortClassName, "QQBrowserActivity", false)) {
                            if (!AbstractC5138.m10125(stringExtra, "http://", false) && !AbstractC5138.m10125(stringExtra, "https://", false)) {
                                stringExtra = "http://".concat(stringExtra);
                            }
                            try {
                                Object obj3 = methodHookParam.thisObject;
                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                                intent2.addFlags(268435456);
                                intent2.putExtra("from_fqb", true);
                                obj3.getClass().getMethod("startActivity", Intent.class).invoke(obj3, intent2);
                                break;
                            } catch (Exception unused) {
                            }
                            methodHookParam.setResult((Object) null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                "param";
                methodHookParam.getClass();
                if (((C5932) abstractC6296).f17376.booleanValue()) {
                    while (i2 < 19) {
                        try {
                            XposedBridge.invokeOriginalMethod(methodHookParam.method, methodHookParam.thisObject, methodHookParam.args);
                            i2++;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    break;
                }
                break;
            case 7:
                "param";
                methodHookParam.getClass();
                if (((C5942) abstractC6296).f17376.booleanValue()) {
                    try {
                        Class<?> cls = methodHookParam.thisObject.getClass();
                        Field[] declaredFields = cls.getDeclaredFields();
                        "getDeclaredFields(...)";
                        declaredFields.getClass();
                        int length2 = declaredFields.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length2) {
                                if (AbstractC4394.m8917(declaredFields[i4].getName(), "o")) {
                                    i2 = 1;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        float f = i2 != 0 ? 71.0f : 76.0f;
                        String strM66682 = i2 != 0 ? "o" : "m";
                        Object obj4 = methodHookParam.thisObject;
                        "null cannot be cast to non-null type android.view.View";
                        obj4.getClass();
                        int i5 = (int) (((f / 1.5f) * ((View) obj4).getResources().getDisplayMetrics().density) + 0.5f);
                        Field declaredField = cls.getDeclaredField(strM66682);
                        declaredField.setAccessible(true);
                        declaredField.set(methodHookParam.thisObject, Integer.valueOf(i5));
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                }
                break;
            case 8:
                "param";
                methodHookParam.getClass();
                if (((C5938) abstractC6296).f17376.booleanValue()) {
                    Object[] objArr2 = methodHookParam.args;
                    "args";
                    objArr2.getClass();
                    int length3 = objArr2.length;
                    int i6 = 0;
                    while (i2 < length3) {
                        int i7 = i6 + 1;
                        if (objArr2[i2] instanceof Boolean) {
                            methodHookParam.args[i6] = Boolean.FALSE;
                        }
                        i2++;
                        i6 = i7;
                    }
                }
                break;
            case 9:
                "param";
                methodHookParam.getClass();
                if (((C5939) abstractC6296).f17376.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            case 11:
                "param";
                methodHookParam.getClass();
                if (((C5900) abstractC6296).f17376.booleanValue()) {
                    Object obj5 = methodHookParam.args[1];
                    TextView textView = obj5 instanceof TextView ? (TextView) obj5 : null;
                    if (textView != null && (tag = textView.getTag()) != null) {
                        Object obj6 = methodHookParam.args[4];
                        String str = obj6 instanceof String ? (String) obj6 : null;
                        if (str != null && str.length() > 0) {
                            try {
                                long longField = XposedHelpers.getLongField(tag, "f");
                                int intField = XposedHelpers.getIntField(tag, "k");
                                Object[] objArr3 = methodHookParam.args;
                                StringBuilder sb = new StringBuilder();
                                sb.append(methodHookParam.args[3]);
                                sb.append('(');
                                sb.append(longField);
                                sb.append(')');
                                objArr3[3] = sb.toString();
                                methodHookParam.args[4] = str + " \u4e0b\u8f7d\u6b21\u6570:" + intField;
                            } catch (Exception unused4) {
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
            case 12:
                "param";
                methodHookParam.getClass();
                if (((C5901) abstractC6296).f17376.booleanValue()) {
                    try {
                        try {
                            XposedHelpers.setObjectField(methodHookParam.thisObject, "mViewContainer", 1);
                            break;
                        } catch (Exception unused5) {
                        }
                    } catch (Exception unused6) {
                        XposedHelpers.setIntField(methodHookParam.thisObject, "mViewContainer", 1);
                        break;
                    }
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 13:
                "param";
                methodHookParam.getClass();
                if (((C5843) abstractC6296).f17376.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            case 14:
                "param";
                methodHookParam.getClass();
                if (((C5848) abstractC6296).f17376.booleanValue()) {
                    methodHookParam.args[1] = Boolean.TRUE;
                    break;
                }
                break;
            case 20:
                Object obj7 = methodHookParam.args[0];
                if ("trpc.msg.olpush.OlPushService.MsgPush".equals((String) AbstractC6317.m11831(String.class, "serviceCmd", obj7))) {
                    C6158 c6158 = new C6158();
                    c6158.m11582(C6158.m11577((byte[]) AbstractC6317.m11831(byte[].class, "wupBuffer", obj7)));
                    JSONObject jSONObjectM11583 = c6158.m11583();
                    int intValue = jSONObjectM11583.getJSONObject("1").getJSONObject("2").getIntValue("1");
                    JSONObject jSONObject = jSONObjectM11583.getJSONObject("1").getJSONObject("3");
                    if (intValue == 33 && jSONObject.containsKey("2")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("2");
                        if (jSONObject2.containsKey("3") && (jSONObject2.get("5") instanceof String)) {
                            int intValue2 = jSONObject2.getIntValue("4");
                            if (intValue2 == 130 || intValue2 == 131) {
                                ((C6358) abstractC6296).f17484.execute(new RunnableC2346(jSONObject2.getString("3"), jSONObject2.getString("5"), String.valueOf(jSONObject2.getLong("1")), 7));
                            }
                            break;
                        }
                    }
                }
                break;
            case 22:
                "param";
                methodHookParam.getClass();
                if (((C8723) abstractC6296).f17376.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
        }
    }
}
