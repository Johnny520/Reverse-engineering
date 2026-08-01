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
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.reader.C2700;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
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
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import lin.util.ReflectUtils.ReflectException;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6185;
import p010.C6189;
import p018.AbstractC6253;
import p026.AbstractC6314;
import p029.C6320;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p036.C6364;
import p036.C6367;
import p038.C6373;
import p038.C6375;
import p038.C6383;
import p287.AbstractC8405;
import p305.C8623;
import p322.C8705;
import p336.C8797;
import top.suzhelan.qstory.hook.item.C5881;
import top.suzhelan.qstory.hook.item.C5890;
import top.suzhelan.qstory.hook.item.C5898;
import top.suzhelan.qstory.hook.item.C5901;
import top.suzhelan.qstory.hook.item.C5906;
import top.suzhelan.qstory.hook.item.C5907;
import top.suzhelan.qstory.hook.item.C5920;
import top.suzhelan.qstory.hook.item.C5932;
import top.suzhelan.qstory.hook.item.C5937;
import top.suzhelan.qstory.hook.item.C5941;
import top.suzhelan.qstory.hook.item.C5944;
import top.suzhelan.qstory.hook.item.C5945;
import top.suzhelan.qstory.hook.item.chat.C5827;
import top.suzhelan.qstory.hook.item.chat.C5828;
import top.suzhelan.qstory.hook.item.chat.C5834;
import top.suzhelan.qstory.hook.item.chat.C5848;
import top.suzhelan.qstory.hook.item.chat.C5853;
import top.suzhelan.qstory.hook.item.chat.C5857;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5812 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6314 f15934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15935;

    public /* synthetic */ C5812(AbstractC6314 abstractC6314, int i) {
        this.f15935 = i;
        this.f15934 = abstractC6314;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        Object tag;
        Bitmap bitmapM11244;
        List list;
        Class<?>[] interfaces;
        int i = this.f15935;
        Class cls = Integer.TYPE;
        int i2 = 2;
        int i3 = 0;
        AbstractC6314 abstractC6314 = this.f15934;
        switch (i) {
            case 0:
                C5811 c5811 = (C5811) abstractC6314;
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                try {
                    String str = c5811.f15933;
                    if (str == null || str.equals(QQEnvTool.getCurrentUin())) {
                        return;
                    }
                    c5811.f15933 = QQEnvTool.getCurrentUin();
                    Collection<PluginLoader> allRunningPluginLoader = PluginManager.getAllRunningPluginLoader();
                    AbstractC8405.m13972(1553);
                    allRunningPluginLoader.getClass();
                    if (allRunningPluginLoader.isEmpty()) {
                        return;
                    }
                    AbstractC6185.m11592(AbstractC8405.m13972(1554));
                    PluginManager.stopAllPlugin();
                    return;
                } catch (Exception e) {
                    c5811.getExceptionCollectionToolInstance().m11832(e);
                    return;
                }
            case 2:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                C5920 c5920 = (C5920) abstractC6314;
                obj.getClass();
                C5920.m11301(c5920, obj, AbstractC8405.m13972(1796));
                C5920.m11301(c5920, obj, AbstractC8405.m13972(1797));
                return;
            case 7:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5944) abstractC6314).f17425.booleanValue()) {
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
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5906) abstractC6314).f17425.booleanValue()) {
                    Object obj2 = methodHookParam.thisObject;
                    BaseAdapter baseAdapter = obj2 instanceof BaseAdapter ? (BaseAdapter) obj2 : null;
                    if (baseAdapter == null) {
                        return;
                    }
                    Object obj3 = methodHookParam.args[0];
                    AbstractC8405.m13972(1866);
                    obj3.getClass();
                    Object item = baseAdapter.getItem(((Integer) obj3).intValue());
                    if (item == null) {
                        return;
                    }
                    String string = item.toString();
                    Matcher matcher = Pattern.compile(AbstractC8405.m13972(2077)).matcher(string);
                    String strGroup = matcher.find() ? matcher.group(1) : null;
                    Matcher matcher2 = Pattern.compile(AbstractC8405.m13972(2078)).matcher(string);
                    String strGroup2 = matcher2.find() ? matcher2.group(1) : null;
                    if (strGroup == null || strGroup2 == null || strGroup2.equals(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"))) {
                        return;
                    }
                    Object result2 = methodHookParam.getResult();
                    View view = result2 instanceof View ? (View) result2 : null;
                    if (view == null || (tag = view.getTag()) == null) {
                        return;
                    }
                    Field[] declaredFields = tag.getClass().getDeclaredFields();
                    AbstractC8405.m13972(1985);
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        Object obj4 = field.get(tag);
                        if (obj4 instanceof TextView) {
                            TextView textView = (TextView) obj4;
                            if (strGroup.equals(textView.getText().toString())) {
                                StringBuilder sbM140 = AbstractC0053.m140(strGroup);
                                sbM140.append(AbstractC8405.m13972(2079));
                                sbM140.append(strGroup2);
                                sbM140.append(')');
                                textView.setText(sbM140.toString());
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            case 15:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5857) abstractC6314).f17425.booleanValue()) {
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
                final C5834 c5834 = (C5834) abstractC6314;
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                try {
                    Object obj6 = methodHookParam.thisObject;
                    final Object obj7 = methodHookParam.args[1];
                    if (obj7 == null) {
                        return;
                    }
                    obj6.getClass();
                    ImageView imageViewM11246 = C5834.m11246(c5834, obj6);
                    if (imageViewM11246 == null) {
                        return;
                    }
                    String name = imageViewM11246.getContext().getClass().getName();
                    AbstractC8405.m13972(1820);
                    if (!AbstractC5144.m10176(name, AbstractC8405.m13972(2219), false) && (bitmapM11244 = C5834.m11244(c5834)) != null) {
                        int iM11754 = c5834.f15976;
                        if (iM11754 == 0) {
                            Context context = AbstractC6358.f17507;
                            C6320 c6320 = c5834.f15975;
                            c6320.getClass();
                            Object objM11840 = c6320.m11840(50, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜"));
                            AbstractC8405.m13972(1866);
                            objM11840.getClass();
                            iM11754 = AbstractC6253.m11754(context, ((Integer) objM11840).intValue());
                            c5834.f15976 = iM11754;
                        }
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM11244, iM11754, iM11754, true);
                        AbstractC8405.m13972(2220);
                        bitmapCreateScaledBitmap.getClass();
                        imageViewM11246.setImageBitmap(bitmapCreateScaledBitmap);
                        Object tag2 = imageViewM11246.getTag(37327667);
                        Boolean bool = Boolean.TRUE;
                        if (!AbstractC4395.m8907(tag2, bool)) {
                            imageViewM11246.setOnClickListener(new View.OnClickListener() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲楪兰苏
                                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                                @Override // android.view.View.OnClickListener
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void onClick(android.view.View r9) {
                                    /*
                                        r8 = this;
                                        java.lang.Object r9 = r2
                                        top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏楪兰 r8 = r1
                                        飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏兰哲 r0 = r8.f15975
                                        r1 = 0
                                        if (r0 == 0) goto L1e
                                        r2 = 2206(0x89e, float:3.091E-42)
                                        java.lang.String r2 = p287.AbstractC8405.m13972(r2)
                                        java.lang.Boolean r3 = java.lang.Boolean.FALSE
                                        java.lang.Object r0 = r0.m11840(r3, r2)
                                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                                        if (r0 == 0) goto L1e
                                        boolean r0 = r0.booleanValue()
                                        goto L1f
                                    L1e:
                                        r0 = r1
                                    L1f:
                                        if (r0 == 0) goto L32
                                        long r2 = java.lang.System.currentTimeMillis()
                                        long r4 = r8.f15974
                                        long r4 = r2 - r4
                                        long r6 = r8.f15973
                                        int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                        if (r0 <= 0) goto L32
                                        r8.f15974 = r2
                                        return
                                    L32:
                                        long r2 = java.lang.System.currentTimeMillis()
                                        r8.f15974 = r2
                                        java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Exception -> L4c
                                        r2 = 164(0xa4, float:2.3E-43)
                                        java.lang.String r2 = p287.AbstractC8405.m13972(r2)     // Catch: java.lang.Exception -> L4c
                                        r3 = 0
                                        java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch: java.lang.Exception -> L4c
                                        java.lang.Object r0 = r0.invoke(r9, r3)     // Catch: java.lang.Exception -> L4c
                                        goto L58
                                    L4c:
                                        r0 = 1909(0x775, float:2.675E-42)
                                        java.lang.String r0 = p287.AbstractC8405.m13972(r0)     // Catch: java.lang.Exception -> L77
                                        java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                                        java.lang.Object r0 = p033.AbstractC6336.m11859(r2, r0, r9)     // Catch: java.lang.Exception -> L77
                                    L58:
                                        if (r0 != 0) goto L5b
                                        goto L77
                                    L5b:
                                        java.lang.String r2 = "喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"
                                        java.lang.String r2 = p287.AbstractC8405.m13973(r2)     // Catch: java.lang.Exception -> L77
                                        java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L77
                                        java.lang.Object r0 = p033.AbstractC6336.m11859(r3, r2, r0)     // Catch: java.lang.Exception -> L77
                                        java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L77
                                        if (r0 == 0) goto L6f
                                        int r1 = r0.intValue()     // Catch: java.lang.Exception -> L77
                                    L6f:
                                        r0 = 1
                                        if (r1 != r0) goto L73
                                        goto L77
                                    L73:
                                        top.suzhelan.qstory.hook.item.chat.C5834.m11245(r8, r9)     // Catch: java.lang.Exception -> L81
                                        goto L85
                                    L77:
                                        r8 = 2221(0x8ad, float:3.112E-42)
                                        java.lang.String r8 = p287.AbstractC8405.m13972(r8)     // Catch: java.lang.Exception -> L81
                                        p010.AbstractC6185.m11592(r8)     // Catch: java.lang.Exception -> L81
                                        goto L85
                                    L81:
                                        r8 = move-exception
                                        r8.printStackTrace()
                                    L85:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5831.onClick(android.view.View):void");
                                }
                            });
                            imageViewM11246.setTag(37327667, bool);
                        }
                        imageViewM11246.setVisibility(0);
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 17:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5828) abstractC6314).f17425.booleanValue() && AbstractC4395.m8907(methodHookParam.getResult(), "")) {
                    methodHookParam.setResult(AbstractC8405.m13972(2239));
                    return;
                }
                return;
            case 18:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object result3 = methodHookParam.getResult();
                List list2 = result3 instanceof List ? (List) result3 : null;
                if (list2 == null) {
                    return;
                }
                methodHookParam.setResult(AbstractC4344.m8778(list2, new C1934((C5827) abstractC6314, i2)));
                return;
            case 19:
                Integer numValueOf = Integer.valueOf(R.mipmap.ic_launcher_round);
                C6364 c6364 = (C6364) abstractC6314;
                Context context2 = (Context) methodHookParam.args[0];
                AbstractC3056.m6687(context2);
                List list3 = (List) methodHookParam.getResult();
                Class<?> cls2 = list3.get(0).getClass();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    try {
                        list = (List) AbstractC6336.m11858(List.class, it.next());
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (list == null || list.isEmpty()) {
                        i3 = 0;
                    } else if (list.get(i3).getClass().getName().startsWith(AbstractC8405.m13972(81))) {
                        Class<?> cls3 = list.get(i3).getClass();
                        Object objM6285 = AbstractC6358.f17508 >= 10290 ? AbstractC2905.m6285(new Object[]{context2, 21002, context2.getString(R.string.app_name), numValueOf, context2.getString(R.string.app_name)}, new Class[]{Context.class, cls, CharSequence.class, cls, String.class}, cls3) : AbstractC2905.m6285(new Object[]{context2, 21002, context2.getString(R.string.app_name), numValueOf}, new Class[]{Context.class, cls, CharSequence.class, cls}, cls3);
                        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC6333.m11851(cls3, new C8623(26))));
                        arrayList.sort(Comparator.comparing(new C2700(27)));
                        ((Method) arrayList.get(i3)).invoke(objM6285, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(80))}, new C6367(context2)));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(objM6285);
                        arrayList2.add(C6364.m11946(context2, cls3));
                        arrayList2.add(C6364.m11945(context2, cls3));
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
                        throw new ReflectException(AbstractC0053.m158("查找不到指定长度的构造方法 : ", cls2.getName(), " 想要查找的长度 : 5"));
                    }
                    c6364.getExceptionCollectionToolInstance().m11832(e);
                    i3 = 0;
                }
                return;
            case 21:
                C6383 c6383 = (C6383) abstractC6314;
                try {
                    Object obj8 = methodHookParam.thisObject;
                    C6335 c6335M11854 = C6335.m11854(obj8.getClass());
                    c6335M11854.f17458.f3618 = AbstractC8405.m13972(329);
                    View view2 = (View) c6335M11854.m11856(obj8, new Object[0]);
                    Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
                    HashMap map = AbstractC6336.f17459;
                    Object obj9 = AbstractC6336.m11861(obj8.getClass(), clsM11866).get(obj8);
                    if (obj9 != null && view2 != null) {
                        C6335 c6335M118542 = C6335.m11854(obj9.getClass());
                        c6335M118542.f17458.f3618 = AbstractC8405.m13972(164);
                        Iterator it2 = ((ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), c6335M118542.m11856(obj9, new Object[0]))).iterator();
                        while (it2.hasNext()) {
                            if (((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13972(338), it2.next())).intValue() <= 2) {
                                c6383.m11962((ViewGroup) view2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    c6383.getExceptionCollectionToolInstance().m11832(e4);
                    return;
                }
            case 23:
                Class cls4 = (Class) methodHookParam.getResult();
                if (cls4 == null) {
                    return;
                }
                String name2 = cls4.getName();
                Object[][] objArr = AbstractC6337.f17462;
                if (name2.startsWith("androidx.") || name2.startsWith("android.") || name2.startsWith("kotlin.") || name2.startsWith("kotlinx.") || name2.startsWith("com.tencent.mmkv.") || name2.startsWith("com.android.tools.r8.") || name2.startsWith("com.google.android.") || name2.startsWith("com.google.gson.") || name2.startsWith("com.google.common.") || name2.startsWith("com.microsoft.appcenter.") || name2.startsWith("org.intellij.lang.annotations.") || name2.startsWith("org.jetbrains.annotations.") || (interfaces = cls4.getInterfaces()) == null) {
                    return;
                }
                int length2 = interfaces.length;
                while (i3 < length2) {
                    if (interfaces[i3] == SensorEventListener.class) {
                        ((C8797) abstractC6314).f24765.add(XposedBridge.hookMethod(AbstractC6333.m11849(cls4, AbstractC8405.m13972(1141), new Class[]{SensorEvent.class}), new C6373(16)));
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
        String strSubstring2;
        ComponentName component;
        String shortClassName;
        Object tag;
        int i = this.f15935;
        int i2 = 0;
        AbstractC6314 abstractC6314 = this.f15934;
        switch (i) {
            case 1:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5932) abstractC6314).f17425.booleanValue()) {
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
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5890) abstractC6314).f17425.booleanValue()) {
                    methodHookParam.setResult(new ArrayList());
                }
                break;
            case 4:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5898) abstractC6314).f17425.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 5:
                C5881 c5881 = (C5881) abstractC6314;
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                Object obj = objArr[0];
                if (obj instanceof Intent) {
                    AbstractC8405.m13972(1918);
                    intent = (Intent) obj;
                } else {
                    Object obj2 = objArr[1];
                    AbstractC8405.m13972(1918);
                    obj2.getClass();
                    intent = (Intent) obj2;
                }
                if (c5881.f17425.booleanValue() && !intent.getBooleanExtra(c5881.f16056, false) && (stringExtra = intent.getStringExtra(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"))) != null && !AbstractC5144.m10172(stringExtra)) {
                    Pattern patternCompile = Pattern.compile(c5881.f16057);
                    String lowerCase = stringExtra.toLowerCase(Locale.ROOT);
                    AbstractC8405.m13972(1322);
                    lowerCase.getClass();
                    if (patternCompile.matcher(lowerCase).matches()) {
                        if (AbstractC5144.m10176(stringExtra, AbstractC8405.m13973("喵呜喵喵呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵呜喵呜"), false)) {
                            strSubstring = stringExtra.substring(AbstractC5144.m10170(stringExtra, AbstractC8405.m13973("喵呜喵喵呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵呜喵呜"), 0, false, 6) + 3);
                            AbstractC8405.m13972(1901);
                        } else {
                            strSubstring = stringExtra;
                        }
                        int length = strSubstring.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                strSubstring2 = "";
                            } else if (strSubstring.charAt(i3) == '/') {
                                i3++;
                            } else {
                                strSubstring2 = strSubstring.substring(i3);
                                AbstractC8405.m13972(1901);
                            }
                        }
                        if (AbstractC5144.m10176(strSubstring2, AbstractC8405.m13973("喵呜喵呜呜呜喵喵"), false)) {
                            strSubstring2 = strSubstring2.substring(0, AbstractC5144.m10170(strSubstring2, AbstractC8405.m13973("喵呜喵呜呜呜喵喵"), 0, false, 6));
                            AbstractC8405.m13972(1901);
                        }
                        String lowerCase2 = strSubstring2.toLowerCase(Locale.ROOT);
                        AbstractC8405.m13972(1322);
                        lowerCase2.getClass();
                        if (!lowerCase2.endsWith(AbstractC8405.m13973("喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵喵~喵呜喵呜喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜")) && !lowerCase2.endsWith(AbstractC8405.m13972(398)) && !lowerCase2.endsWith(AbstractC8405.m13972(1928)) && !lowerCase2.equals(AbstractC8405.m13972(1929)) && (component = intent.getComponent()) != null && (shortClassName = component.getShortClassName()) != null && AbstractC5144.m10176(shortClassName, AbstractC8405.m13972(1926), false)) {
                            if (!AbstractC5139.m10139(stringExtra, AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵"), false) && !AbstractC5139.m10139(stringExtra, AbstractC8405.m13972(883), false)) {
                                stringExtra = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵").concat(stringExtra);
                            }
                            try {
                                Object obj3 = methodHookParam.thisObject;
                                Intent intent2 = new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(stringExtra));
                                intent2.addFlags(268435456);
                                intent2.putExtra(AbstractC8405.m13972(1927), true);
                                obj3.getClass().getMethod(AbstractC8405.m13972(1923), Intent.class).invoke(obj3, intent2);
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
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5937) abstractC6314).f17425.booleanValue()) {
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
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5944) abstractC6314).f17425.booleanValue()) {
                    try {
                        Class<?> cls = methodHookParam.thisObject.getClass();
                        Field[] declaredFields = cls.getDeclaredFields();
                        AbstractC8405.m13972(1985);
                        declaredFields.getClass();
                        int length2 = declaredFields.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length2) {
                                if (AbstractC4395.m8907(declaredFields[i4].getName(), AbstractC8405.m13973("喵喵喵呜呜呜喵喵"))) {
                                    i2 = 1;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        float f = i2 != 0 ? 71.0f : 76.0f;
                        String strM13973 = i2 != 0 ? AbstractC8405.m13973("喵喵喵呜呜呜喵喵") : AbstractC8405.m13973("喵喵喵呜呜呜呜喵");
                        Object obj4 = methodHookParam.thisObject;
                        AbstractC8405.m13972(1543);
                        obj4.getClass();
                        int i5 = (int) (((f / 1.5f) * ((View) obj4).getResources().getDisplayMetrics().density) + 0.5f);
                        Field declaredField = cls.getDeclaredField(strM13973);
                        declaredField.setAccessible(true);
                        declaredField.set(methodHookParam.thisObject, Integer.valueOf(i5));
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                }
                break;
            case 8:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5945) abstractC6314).f17425.booleanValue()) {
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
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
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5941) abstractC6314).f17425.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            case 11:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5907) abstractC6314).f17425.booleanValue()) {
                    Object obj5 = methodHookParam.args[1];
                    TextView textView = obj5 instanceof TextView ? (TextView) obj5 : null;
                    if (textView != null && (tag = textView.getTag()) != null) {
                        Object obj6 = methodHookParam.args[4];
                        String str = obj6 instanceof String ? (String) obj6 : null;
                        if (str != null && str.length() > 0) {
                            try {
                                long longField = XposedHelpers.getLongField(tag, AbstractC8405.m13973("喵喵喵呜喵呜喵呜"));
                                int intField = XposedHelpers.getIntField(tag, AbstractC8405.m13973("喵喵喵呜呜喵喵喵"));
                                Object[] objArr3 = methodHookParam.args;
                                StringBuilder sb = new StringBuilder();
                                sb.append(methodHookParam.args[3]);
                                sb.append('(');
                                sb.append(longField);
                                sb.append(')');
                                objArr3[3] = sb.toString();
                                methodHookParam.args[4] = str + AbstractC8405.m13972(2090) + intField;
                            } catch (Exception unused4) {
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
            case 12:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5901) abstractC6314).f17425.booleanValue()) {
                    try {
                        try {
                            XposedHelpers.setObjectField(methodHookParam.thisObject, AbstractC8405.m13972(2094), 1);
                        } catch (Exception unused5) {
                            XposedHelpers.setIntField(methodHookParam.thisObject, AbstractC8405.m13972(2094), 1);
                        }
                        break;
                    } catch (Exception unused6) {
                    }
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 13:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5848) abstractC6314).f17425.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            case 14:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C5853) abstractC6314).f17425.booleanValue()) {
                    methodHookParam.args[1] = Boolean.TRUE;
                    break;
                }
                break;
            case 20:
                Object obj7 = methodHookParam.args[0];
                if (AbstractC8405.m13972(311).equals((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(310), obj7))) {
                    C6189 c6189 = new C6189();
                    c6189.m11613(C6189.m11608((byte[]) AbstractC6336.m11859(byte[].class, AbstractC8405.m13972(312), obj7)));
                    JSONObject jSONObjectM11614 = c6189.m11614();
                    int intValue = jSONObjectM11614.getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵喵呜")).getIntValue(AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
                    JSONObject jSONObject = jSONObjectM11614.getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵喵喵"));
                    if (intValue == 33 && jSONObject.containsKey(AbstractC8405.m13973("喵呜喵喵喵喵喵呜"))) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractC8405.m13973("喵呜喵喵喵喵喵呜"));
                        if (jSONObject2.containsKey(AbstractC8405.m13973("喵呜喵喵喵喵喵喵")) && (jSONObject2.get(AbstractC8405.m13973("喵呜喵喵喵呜呜喵")) instanceof String)) {
                            int intValue2 = jSONObject2.getIntValue(AbstractC8405.m13973("喵呜喵喵喵呜呜呜"));
                            if (intValue2 == 130 || intValue2 == 131) {
                                ((C6375) abstractC6314).f17530.execute(new RunnableC2346(jSONObject2.getString(AbstractC8405.m13973("喵呜喵喵喵喵喵喵")), jSONObject2.getString(AbstractC8405.m13973("喵呜喵喵喵呜呜喵")), String.valueOf(jSONObject2.getLong(AbstractC8405.m13973("喵呜喵喵喵喵呜喵"))), 7));
                            }
                            break;
                        }
                    }
                }
                break;
            case 22:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C8705) abstractC6314).f17425.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
        }
    }
}
