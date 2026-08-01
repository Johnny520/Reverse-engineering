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
import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.semantics.C2769;
import androidx.fragment.app.RunnableC3179;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.reader.C3533;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
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
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import lin.util.ReflectUtils.ReflectException;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7014;
import p026.C7018;
import p034.AbstractC7082;
import p042.AbstractC7143;
import p045.C7149;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p052.C7193;
import p052.C7196;
import p054.C7202;
import p054.C7204;
import p054.C7212;
import p303.AbstractC9234;
import p321.C9452;
import p338.C9534;
import p352.C9626;
import top.suzhelan.qstory.hook.item.C6711;
import top.suzhelan.qstory.hook.item.C6720;
import top.suzhelan.qstory.hook.item.C6728;
import top.suzhelan.qstory.hook.item.C6731;
import top.suzhelan.qstory.hook.item.C6736;
import top.suzhelan.qstory.hook.item.C6737;
import top.suzhelan.qstory.hook.item.C6750;
import top.suzhelan.qstory.hook.item.C6762;
import top.suzhelan.qstory.hook.item.C6767;
import top.suzhelan.qstory.hook.item.C6771;
import top.suzhelan.qstory.hook.item.C6774;
import top.suzhelan.qstory.hook.item.C6775;
import top.suzhelan.qstory.hook.item.chat.C6657;
import top.suzhelan.qstory.hook.item.chat.C6658;
import top.suzhelan.qstory.hook.item.chat.C6664;
import top.suzhelan.qstory.hook.item.chat.C6678;
import top.suzhelan.qstory.hook.item.chat.C6683;
import top.suzhelan.qstory.hook.item.chat.C6687;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6642 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7143 f16279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16280;

    public /* synthetic */ C6642(AbstractC7143 abstractC7143, int i) {
        this.f16280 = i;
        this.f16279 = abstractC7143;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        Object tag;
        Bitmap bitmapM11803;
        List list;
        Class<?>[] interfaces;
        int i = this.f16280;
        Class cls = Integer.TYPE;
        int i2 = 2;
        int i3 = 0;
        AbstractC7143 abstractC7143 = this.f16279;
        switch (i) {
            case 0:
                C6641 c6641 = (C6641) abstractC7143;
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                try {
                    String str = c6641.f16278;
                    if (str == null || str.equals(QQEnvTool.getCurrentUin())) {
                        return;
                    }
                    c6641.f16278 = QQEnvTool.getCurrentUin();
                    Collection<PluginLoader> allRunningPluginLoader = PluginManager.getAllRunningPluginLoader();
                    AbstractC9234.m14531(1553);
                    allRunningPluginLoader.getClass();
                    if (allRunningPluginLoader.isEmpty()) {
                        return;
                    }
                    AbstractC7014.m12151(AbstractC9234.m14531(1554));
                    PluginManager.stopAllPlugin();
                    return;
                } catch (Exception e) {
                    c6641.getExceptionCollectionToolInstance().m12391(e);
                    return;
                }
            case 2:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                C6750 c6750 = (C6750) abstractC7143;
                obj.getClass();
                C6750.m11860(c6750, obj, AbstractC9234.m14531(1796));
                C6750.m11860(c6750, obj, AbstractC9234.m14531(1797));
                return;
            case 7:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6774) abstractC7143).f17770.booleanValue()) {
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
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6736) abstractC7143).f17770.booleanValue()) {
                    Object obj2 = methodHookParam.thisObject;
                    BaseAdapter baseAdapter = obj2 instanceof BaseAdapter ? (BaseAdapter) obj2 : null;
                    if (baseAdapter == null) {
                        return;
                    }
                    Object obj3 = methodHookParam.args[0];
                    AbstractC9234.m14531(1866);
                    obj3.getClass();
                    Object item = baseAdapter.getItem(((Integer) obj3).intValue());
                    if (item == null) {
                        return;
                    }
                    String string = item.toString();
                    Matcher matcher = Pattern.compile(AbstractC9234.m14531(2077)).matcher(string);
                    String strGroup = matcher.find() ? matcher.group(1) : null;
                    Matcher matcher2 = Pattern.compile(AbstractC9234.m14531(2078)).matcher(string);
                    String strGroup2 = matcher2.find() ? matcher2.group(1) : null;
                    if (strGroup == null || strGroup2 == null || strGroup2.equals(AbstractC9234.m14532("喵呜喵喵喵喵呜呜"))) {
                        return;
                    }
                    Object result2 = methodHookParam.getResult();
                    View view = result2 instanceof View ? (View) result2 : null;
                    if (view == null || (tag = view.getTag()) == null) {
                        return;
                    }
                    Field[] declaredFields = tag.getClass().getDeclaredFields();
                    AbstractC9234.m14531(1985);
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        Object obj4 = field.get(tag);
                        if (obj4 instanceof TextView) {
                            TextView textView = (TextView) obj4;
                            if (strGroup.equals(textView.getText().toString())) {
                                StringBuilder sbM700 = AbstractC0900.m700(strGroup);
                                sbM700.append(AbstractC9234.m14531(2079));
                                sbM700.append(strGroup2);
                                sbM700.append(')');
                                textView.setText(sbM700.toString());
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            case 15:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6687) abstractC7143).f17770.booleanValue()) {
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
                final C6664 c6664 = (C6664) abstractC7143;
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                try {
                    Object obj6 = methodHookParam.thisObject;
                    final Object obj7 = methodHookParam.args[1];
                    if (obj7 == null) {
                        return;
                    }
                    obj6.getClass();
                    ImageView imageViewM11805 = C6664.m11805(c6664, obj6);
                    if (imageViewM11805 == null) {
                        return;
                    }
                    String name = imageViewM11805.getContext().getClass().getName();
                    AbstractC9234.m14531(1820);
                    if (!AbstractC5976.m10735(name, AbstractC9234.m14531(2219), false) && (bitmapM11803 = C6664.m11803(c6664)) != null) {
                        int iM12313 = c6664.f16321;
                        if (iM12313 == 0) {
                            Context context = AbstractC7187.f17852;
                            C7149 c7149 = c6664.f16320;
                            c7149.getClass();
                            Object objM12399 = c7149.m12399(50, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜"));
                            AbstractC9234.m14531(1866);
                            objM12399.getClass();
                            iM12313 = AbstractC7082.m12313(context, ((Integer) objM12399).intValue());
                            c6664.f16321 = iM12313;
                        }
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM11803, iM12313, iM12313, true);
                        AbstractC9234.m14531(2220);
                        bitmapCreateScaledBitmap.getClass();
                        imageViewM11805.setImageBitmap(bitmapCreateScaledBitmap);
                        Object tag2 = imageViewM11805.getTag(37327667);
                        Boolean bool = Boolean.TRUE;
                        if (!AbstractC5227.m9466(tag2, bool)) {
                            imageViewM11805.setOnClickListener(new View.OnClickListener() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲楪兰苏
                                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                                @Override // android.view.View.OnClickListener
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void onClick(View view2) {
                                    boolean zBooleanValue;
                                    Object objM12418;
                                    Object obj8 = obj7;
                                    C6664 c66642 = c6664;
                                    C7149 c71492 = c66642.f16320;
                                    if (c71492 != null) {
                                        Boolean bool2 = (Boolean) c71492.m12399(Boolean.FALSE, AbstractC9234.m14531(2206));
                                        zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                                    }
                                    if (zBooleanValue) {
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        if (jCurrentTimeMillis - c66642.f16319 > c66642.f16318) {
                                            c66642.f16319 = jCurrentTimeMillis;
                                            return;
                                        }
                                    }
                                    c66642.f16319 = System.currentTimeMillis();
                                    try {
                                        try {
                                            try {
                                                objM12418 = obj8.getClass().getMethod(AbstractC9234.m14531(164), null).invoke(obj8, null);
                                            } catch (Exception unused2) {
                                                objM12418 = AbstractC7165.m12418(Object.class, AbstractC9234.m14531(1909), obj8);
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        if (objM12418 != null) {
                                            Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"), objM12418);
                                            if ((num != null ? num.intValue() : 0) != 1) {
                                                C6664.m11804(c66642, obj8);
                                            }
                                        }
                                        AbstractC7014.m12151(AbstractC9234.m14531(2221));
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            });
                            imageViewM11805.setTag(37327667, bool);
                        }
                        imageViewM11805.setVisibility(0);
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 17:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6658) abstractC7143).f17770.booleanValue() && AbstractC5227.m9466(methodHookParam.getResult(), "")) {
                    methodHookParam.setResult(AbstractC9234.m14531(2239));
                    return;
                }
                return;
            case 18:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object result3 = methodHookParam.getResult();
                List list2 = result3 instanceof List ? (List) result3 : null;
                if (list2 == null) {
                    return;
                }
                methodHookParam.setResult(AbstractC5176.m9337(list2, new C2769((C6657) abstractC7143, i2)));
                return;
            case 19:
                Integer numValueOf = Integer.valueOf(C0328R.mipmap.ic_launcher_round);
                C7193 c7193 = (C7193) abstractC7143;
                Context context2 = (Context) methodHookParam.args[0];
                AbstractC3888.m7247(context2);
                List list3 = (List) methodHookParam.getResult();
                Class<?> cls2 = list3.get(0).getClass();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    try {
                        list = (List) AbstractC7165.m12417(List.class, it.next());
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (list == null || list.isEmpty()) {
                        i3 = 0;
                    } else if (list.get(i3).getClass().getName().startsWith(AbstractC9234.m14531(81))) {
                        Class<?> cls3 = list.get(i3).getClass();
                        Object objM6845 = AbstractC7187.f17853 >= 10290 ? AbstractC3738.m6845(new Object[]{context2, 21002, context2.getString(C0328R.string.app_name), numValueOf, context2.getString(C0328R.string.app_name)}, new Class[]{Context.class, cls, CharSequence.class, cls, String.class}, cls3) : AbstractC3738.m6845(new Object[]{context2, 21002, context2.getString(C0328R.string.app_name), numValueOf}, new Class[]{Context.class, cls, CharSequence.class, cls}, cls3);
                        ArrayList arrayList = new ArrayList(Arrays.asList(AbstractC7162.m12410(cls3, new C9452(26))));
                        arrayList.sort(Comparator.comparing(new C3533(27)));
                        ((Method) arrayList.get(i3)).invoke(objM6845, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(80))}, new C7196(context2)));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(objM6845);
                        arrayList2.add(C7193.m12505(context2, cls3));
                        arrayList2.add(C7193.m12504(context2, cls3));
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
                        throw new ReflectException(AbstractC0900.m718("查找不到指定长度的构造方法 : ", cls2.getName(), " 想要查找的长度 : 5"));
                    }
                    c7193.getExceptionCollectionToolInstance().m12391(e);
                    i3 = 0;
                }
                return;
            case 21:
                C7212 c7212 = (C7212) abstractC7143;
                try {
                    Object obj8 = methodHookParam.thisObject;
                    C7164 c7164M12413 = C7164.m12413(obj8.getClass());
                    c7164M12413.f17803.f3963 = AbstractC9234.m14531(329);
                    View view2 = (View) c7164M12413.m12415(obj8, new Object[0]);
                    Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(160));
                    HashMap map = AbstractC7165.f17804;
                    Object obj9 = AbstractC7165.m12420(obj8.getClass(), clsM12425).get(obj8);
                    if (obj9 != null && view2 != null) {
                        C7164 c7164M124132 = C7164.m12413(obj9.getClass());
                        c7164M124132.f17803.f3963 = AbstractC9234.m14531(164);
                        Iterator it2 = ((ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), c7164M124132.m12415(obj9, new Object[0]))).iterator();
                        while (it2.hasNext()) {
                            if (((Integer) AbstractC7165.m12418(cls, AbstractC9234.m14531(338), it2.next())).intValue() <= 2) {
                                c7212.m12521((ViewGroup) view2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    c7212.getExceptionCollectionToolInstance().m12391(e4);
                    return;
                }
            case 23:
                Class cls4 = (Class) methodHookParam.getResult();
                if (cls4 == null) {
                    return;
                }
                String name2 = cls4.getName();
                Object[][] objArr = AbstractC7166.f17807;
                if (name2.startsWith("androidx.") || name2.startsWith("android.") || name2.startsWith("kotlin.") || name2.startsWith("kotlinx.") || name2.startsWith("com.tencent.mmkv.") || name2.startsWith("com.android.tools.r8.") || name2.startsWith("com.google.android.") || name2.startsWith("com.google.gson.") || name2.startsWith("com.google.common.") || name2.startsWith("com.microsoft.appcenter.") || name2.startsWith("org.intellij.lang.annotations.") || name2.startsWith("org.jetbrains.annotations.") || (interfaces = cls4.getInterfaces()) == null) {
                    return;
                }
                int length2 = interfaces.length;
                while (i3 < length2) {
                    if (interfaces[i3] == SensorEventListener.class) {
                        ((C9626) abstractC7143).f25110.add(XposedBridge.hookMethod(AbstractC7162.m12408(cls4, AbstractC9234.m14531(1141), new Class[]{SensorEvent.class}), new C7202(16)));
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
        int i = this.f16280;
        int i2 = 0;
        AbstractC7143 abstractC7143 = this.f16279;
        switch (i) {
            case 1:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6762) abstractC7143).f17770.booleanValue()) {
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
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6720) abstractC7143).f17770.booleanValue()) {
                    methodHookParam.setResult(new ArrayList());
                }
                break;
            case 4:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6728) abstractC7143).f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 5:
                C6711 c6711 = (C6711) abstractC7143;
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                Object obj = objArr[0];
                if (obj instanceof Intent) {
                    AbstractC9234.m14531(1918);
                    intent = (Intent) obj;
                } else {
                    Object obj2 = objArr[1];
                    AbstractC9234.m14531(1918);
                    obj2.getClass();
                    intent = (Intent) obj2;
                }
                if (c6711.f17770.booleanValue() && !intent.getBooleanExtra(c6711.f16401, false) && (stringExtra = intent.getStringExtra(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"))) != null && !AbstractC5976.m10731(stringExtra)) {
                    Pattern patternCompile = Pattern.compile(c6711.f16402);
                    String lowerCase = stringExtra.toLowerCase(Locale.ROOT);
                    AbstractC9234.m14531(1322);
                    lowerCase.getClass();
                    if (patternCompile.matcher(lowerCase).matches()) {
                        if (AbstractC5976.m10735(stringExtra, AbstractC9234.m14532("喵呜喵喵呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵呜喵呜"), false)) {
                            strSubstring = stringExtra.substring(AbstractC5976.m10729(stringExtra, AbstractC9234.m14532("喵呜喵喵呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵呜喵呜"), 0, false, 6) + 3);
                            AbstractC9234.m14531(1901);
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
                                AbstractC9234.m14531(1901);
                            }
                        }
                        if (AbstractC5976.m10735(strSubstring2, AbstractC9234.m14532("喵呜喵呜呜呜喵喵"), false)) {
                            strSubstring2 = strSubstring2.substring(0, AbstractC5976.m10729(strSubstring2, AbstractC9234.m14532("喵呜喵呜呜呜喵喵"), 0, false, 6));
                            AbstractC9234.m14531(1901);
                        }
                        String lowerCase2 = strSubstring2.toLowerCase(Locale.ROOT);
                        AbstractC9234.m14531(1322);
                        lowerCase2.getClass();
                        if (!lowerCase2.endsWith(AbstractC9234.m14532("喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵喵~喵呜喵呜喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜")) && !lowerCase2.endsWith(AbstractC9234.m14531(398)) && !lowerCase2.endsWith(AbstractC9234.m14531(1928)) && !lowerCase2.equals(AbstractC9234.m14531(1929)) && (component = intent.getComponent()) != null && (shortClassName = component.getShortClassName()) != null && AbstractC5976.m10735(shortClassName, AbstractC9234.m14531(1926), false)) {
                            if (!AbstractC5971.m10698(stringExtra, AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵"), false) && !AbstractC5971.m10698(stringExtra, AbstractC9234.m14531(883), false)) {
                                stringExtra = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵").concat(stringExtra);
                            }
                            try {
                                Object obj3 = methodHookParam.thisObject;
                                Intent intent2 = new Intent(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(stringExtra));
                                intent2.addFlags(268435456);
                                intent2.putExtra(AbstractC9234.m14531(1927), true);
                                obj3.getClass().getMethod(AbstractC9234.m14531(1923), Intent.class).invoke(obj3, intent2);
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
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6767) abstractC7143).f17770.booleanValue()) {
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
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6774) abstractC7143).f17770.booleanValue()) {
                    try {
                        Class<?> cls = methodHookParam.thisObject.getClass();
                        Field[] declaredFields = cls.getDeclaredFields();
                        AbstractC9234.m14531(1985);
                        declaredFields.getClass();
                        int length2 = declaredFields.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length2) {
                                if (AbstractC5227.m9466(declaredFields[i4].getName(), AbstractC9234.m14532("喵喵喵呜呜呜喵喵"))) {
                                    i2 = 1;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        float f = i2 != 0 ? 71.0f : 76.0f;
                        String strM14532 = i2 != 0 ? AbstractC9234.m14532("喵喵喵呜呜呜喵喵") : AbstractC9234.m14532("喵喵喵呜呜呜呜喵");
                        Object obj4 = methodHookParam.thisObject;
                        AbstractC9234.m14531(1543);
                        obj4.getClass();
                        int i5 = (int) (((f / 1.5f) * ((View) obj4).getResources().getDisplayMetrics().density) + 0.5f);
                        Field declaredField = cls.getDeclaredField(strM14532);
                        declaredField.setAccessible(true);
                        declaredField.set(methodHookParam.thisObject, Integer.valueOf(i5));
                    } catch (Exception unused3) {
                        return;
                    }
                    break;
                }
                break;
            case 8:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6775) abstractC7143).f17770.booleanValue()) {
                    Object[] objArr2 = methodHookParam.args;
                    AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
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
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6771) abstractC7143).f17770.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            case 11:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6737) abstractC7143).f17770.booleanValue()) {
                    Object obj5 = methodHookParam.args[1];
                    TextView textView = obj5 instanceof TextView ? (TextView) obj5 : null;
                    if (textView != null && (tag = textView.getTag()) != null) {
                        Object obj6 = methodHookParam.args[4];
                        String str = obj6 instanceof String ? (String) obj6 : null;
                        if (str != null && str.length() > 0) {
                            try {
                                long longField = XposedHelpers.getLongField(tag, AbstractC9234.m14532("喵喵喵呜喵呜喵呜"));
                                int intField = XposedHelpers.getIntField(tag, AbstractC9234.m14532("喵喵喵呜呜喵喵喵"));
                                Object[] objArr3 = methodHookParam.args;
                                StringBuilder sb = new StringBuilder();
                                sb.append(methodHookParam.args[3]);
                                sb.append('(');
                                sb.append(longField);
                                sb.append(')');
                                objArr3[3] = sb.toString();
                                methodHookParam.args[4] = str + AbstractC9234.m14531(2090) + intField;
                            } catch (Exception unused4) {
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
            case 12:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6731) abstractC7143).f17770.booleanValue()) {
                    try {
                        try {
                            XposedHelpers.setObjectField(methodHookParam.thisObject, AbstractC9234.m14531(2094), 1);
                        } catch (Exception unused5) {
                            XposedHelpers.setIntField(methodHookParam.thisObject, AbstractC9234.m14531(2094), 1);
                        }
                        break;
                    } catch (Exception unused6) {
                    }
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 13:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6678) abstractC7143).f17770.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
            case 14:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C6683) abstractC7143).f17770.booleanValue()) {
                    methodHookParam.args[1] = Boolean.TRUE;
                    break;
                }
                break;
            case 20:
                Object obj7 = methodHookParam.args[0];
                if (AbstractC9234.m14531(311).equals((String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(310), obj7))) {
                    C7018 c7018 = new C7018();
                    c7018.m12172(C7018.m12167((byte[]) AbstractC7165.m12418(byte[].class, AbstractC9234.m14531(312), obj7)));
                    JSONObject jSONObjectM12173 = c7018.m12173();
                    int intValue = jSONObjectM12173.getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵喵呜")).getIntValue(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
                    JSONObject jSONObject = jSONObjectM12173.getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵呜喵")).getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵喵喵"));
                    if (intValue == 33 && jSONObject.containsKey(AbstractC9234.m14532("喵呜喵喵喵喵喵呜"))) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractC9234.m14532("喵呜喵喵喵喵喵呜"));
                        if (jSONObject2.containsKey(AbstractC9234.m14532("喵呜喵喵喵喵喵喵")) && (jSONObject2.get(AbstractC9234.m14532("喵呜喵喵喵呜呜喵")) instanceof String)) {
                            int intValue2 = jSONObject2.getIntValue(AbstractC9234.m14532("喵呜喵喵喵呜呜呜"));
                            if (intValue2 == 130 || intValue2 == 131) {
                                ((C7204) abstractC7143).f17875.execute(new RunnableC3179(jSONObject2.getString(AbstractC9234.m14532("喵呜喵喵喵喵喵喵")), jSONObject2.getString(AbstractC9234.m14532("喵呜喵喵喵呜呜喵")), String.valueOf(jSONObject2.getLong(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"))), 7));
                            }
                            break;
                        }
                    }
                }
                break;
            case 22:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (((C9534) abstractC7143).f17770.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                }
                break;
        }
    }
}
