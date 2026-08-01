package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.RunnableC0946;
import androidx.collection.C1123;
import androidx.compose.runtime.internal.C2080;
import androidx.core.os.InterfaceC3003;
import androidx.core.view.C3058;
import androidx.core.view.C3071;
import androidx.core.view.InterfaceC3038;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.C3891;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.InterfaceC3984;
import com.google.android.material.textfield.C4018;
import com.google.gson.internal.InterfaceC4070;
import com.kongzue.dialogx.interfaces.InterfaceC4575;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import lin.xposed.hook.util.p011qq.CreateElement;
import lin.xposed.hook.util.p011qq.QQMessageUtils;
import lin.xposed.hook.util.p011qq.QQServiceTool;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6972;
import p025.AbstractC7012;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p026.C7018;
import p026.InterfaceC7019;
import p027.C7032;
import p035.C7092;
import p042.InterfaceC7141;
import p044.DialogC7148;
import p045.C7149;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p050.AbstractC7176;
import p052.RunnableC7186;
import p054.C7206;
import p055.C7224;
import p055.C7226;
import p055.C7250;
import p055.C7254;
import p055.C7257;
import p055.CallableC7219;
import p055.CallableC7262;
import p055.ViewOnClickListenerC7239;
import p056.C7265;
import p056.C7266;
import p167.C8414;
import p167.C8416;
import p180.C8494;
import p191.AbstractC8568;
import p238.InterfaceC8816;
import p273.C9034;
import p285.AbstractC9097;
import p303.AbstractC9234;
import p321.InterfaceC9474;
import p335.C9504;
import p335.C9506;
import p335.C9508;
import p343.C9576;
import p344.C9583;
import p352.C9621;
import p371.InterfaceC9726;
import top.suzhelan.qstory.hook.item.RunnableC6769;
import top.suzhelan.qstory.hook.item.chat.C6654;
import top.suzhelan.qstory.hook.item.chat.C6666;
import top.suzhelan.qstory.hook.item.chat.C6670;
import top.suzhelan.qstory.hook.item.chat.C6672;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3191 implements InterfaceC3003, InterfaceC8816, InterfaceC9474, InterfaceC3984, InterfaceC4070, InterfaceC4575, InterfaceC7141, InterfaceC3038, InterfaceC9726, InterfaceC7019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7332;

    public /* synthetic */ C3191(Object obj, int i) {
        this.f7332 = i;
        this.f7331 = obj;
    }

    @Override // p238.InterfaceC8816
    public Object get() {
        return new C3891();
    }

    @Override // androidx.core.os.InterfaceC3003
    public void onCancel() {
        ((C3190) this.f7331).m5041();
    }

    @Override // com.google.gson.internal.InterfaceC4070
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object mo5042() {
        Constructor constructor = (Constructor) this.f7331;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            AbstractC8568 abstractC8568 = AbstractC9097.f23229;
            C1123.m1408("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC9097.m14394(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            C1123.m1408("Failed to invoke constructor '" + AbstractC9097.m14394(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    @Override // com.google.android.material.internal.InterfaceC3984
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo5043() {
        CheckableImageButton checkableImageButton = ((C4018) this.f7331).f11068;
        AbstractC3889.m7292(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // p371.InterfaceC9726
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo5044(List list) {
        int i = this.f7332;
        Object obj = this.f7331;
        switch (i) {
            case 23:
                C9508 c9508 = (C9508) obj;
                c9508.f24830.m15236(list, AbstractC9234.m14531(1207));
                AbstractC7014.m12151(AbstractC9234.m14531(1208) + list.size() + AbstractC9234.m14531(1209));
                c9508.f24829.execute(new RunnableC0946(c9508, 24, list));
                break;
            case 24:
                C9506 c9506 = (C9506) obj;
                c9506.f24824.m15236(list, AbstractC9234.m14531(1207));
                AbstractC7014.m12151(AbstractC9234.m14531(1208) + list.size() + AbstractC9234.m14531(1209));
                new Thread(new RunnableC0946(c9506, 25, list)).start();
                break;
            default:
                C9504 c9504 = (C9504) obj;
                c9504.f24820.m15236(list, AbstractC9234.m14531(1207));
                AbstractC7014.m12151(AbstractC9234.m14531(1208) + list.size() + AbstractC9234.m14531(1209));
                new Thread(new RunnableC0946(c9504, 26, list)).start();
                break;
        }
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo5045(CharSequence charSequence, Object obj, int i) {
        return ((PluginItemView) this.f7331).lambda$onLongClick$11((C9034) obj, charSequence, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0792 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x078d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:510:? A[RETURN, SYNTHETIC] */
    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        List list;
        Object objM9374;
        Class<?> superclass;
        Object obj;
        Object objM723;
        Long lM11807;
        Object objM7232;
        Object objM7233;
        Object service;
        List list2;
        Object next;
        int intField;
        Integer numValueOf;
        int intField2;
        String str;
        Object objectField;
        Object objCallMethod;
        long jLongValue;
        int i = this.f7332;
        Class cls = Void.TYPE;
        Class cls2 = Integer.TYPE;
        int i2 = 8;
        Object objCallMethod2 = null;
        imageView = null;
        ImageView imageView = null;
        int i3 = 1;
        Object obj2 = this.f7331;
        switch (i) {
            case 7:
                C6670 c6670 = (C6670) obj2;
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                try {
                    Object obj3 = methodHookParam.args[0];
                    AbstractC9234.m14531(1559);
                    obj3.getClass();
                    String str2 = (String) obj3;
                    Object obj4 = methodHookParam.args[1];
                    AbstractC9234.m14531(1560);
                    obj4.getClass();
                    byte[] bArr = (byte[]) obj4;
                    if (str2.equals(AbstractC9234.m14531(1561))) {
                        AbstractC3887.m7201(bArr, methodHookParam);
                    } else if (str2.equals(AbstractC9234.m14531(311))) {
                        AbstractC3887.m7200(bArr, methodHookParam);
                    }
                    return;
                } catch (Exception e) {
                    String itemPath = c6670.getItemPath();
                    AbstractC9234.m14531(2186);
                    itemPath.getClass();
                    String itemPath2 = c6670.getItemPath();
                    AbstractC9234.m14531(2186);
                    itemPath2.getClass();
                    String strSubstring = itemPath.substring(AbstractC5976.m10728(0, 6, itemPath2, AbstractC9234.m14532("喵呜喵呜呜呜喵喵")) + 1);
                    AbstractC9234.m14531(1901);
                    Log.e(AbstractC9234.m14531(773), strSubstring, e);
                    String str3 = AbstractC7017.f17361;
                    AbstractC7017.m12164(strSubstring, e.toString(), e, true);
                    Object obj5 = methodHookParam.args[0];
                    AbstractC9234.m14531(1559);
                    obj5.getClass();
                    Object obj6 = methodHookParam.args[1];
                    AbstractC9234.m14531(1560);
                    obj6.getClass();
                    C7018 c7018 = new C7018();
                    c7018.m12172(C7018.m12167((byte[]) obj6));
                    AbstractC7017.m12163(((String) obj5) + AbstractC9234.m14532("喵呜喵呜呜呜呜喵~喵呜喵喵呜喵呜呜") + c7018 + AbstractC9234.m14532("喵呜喵呜呜呜呜喵~喵呜喵喵呜喵呜呜~喵呜呜呜喵喵喵喵") + AbstractC7017.m12161(e), strSubstring);
                    return;
                }
            case 8:
                final C6666 c6666 = (C6666) obj2;
                ConcurrentHashMap concurrentHashMap = C6666.f16324;
                Object obj7 = methodHookParam.args[0];
                if (obj7 == null) {
                    return;
                }
                for (Class<?> superclass2 = obj7.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    Field[] declaredFields = superclass2.getDeclaredFields();
                    AbstractC9234.m14531(1985);
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        if (List.class.isAssignableFrom(field.getType())) {
                            try {
                                field.setAccessible(true);
                                Object obj8 = field.get(obj7);
                                list = AbstractC5220.m9452(obj8) ? (List) obj8 : null;
                                if (list == null && (objM9374 = AbstractC5176.m9374(list)) != null) {
                                    String strM14531 = AbstractC9234.m14531(160);
                                    superclass = objM9374.getClass();
                                    while (true) {
                                        if (superclass == null) {
                                            Field[] declaredFields2 = superclass.getDeclaredFields();
                                            AbstractC9234.m14531(1985);
                                            declaredFields2.getClass();
                                            for (Field field2 : declaredFields2) {
                                                if (field2.getType().getName().equals(strM14531)) {
                                                    try {
                                                        field2.setAccessible(true);
                                                        obj = field2.get(objM9374);
                                                    } catch (Throwable th) {
                                                        Result.m9304constructorimpl(new Result.Failure(th));
                                                    }
                                                }
                                            }
                                            superclass = superclass.getSuperclass();
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    if (obj != null) {
                                        return;
                                    }
                                    try {
                                        objM723 = Result.m9304constructorimpl(XposedHelpers.callMethod(obj, AbstractC9234.m14531(164), new Object[0]));
                                        break;
                                    } catch (Throwable th2) {
                                        objM723 = AbstractC0900.m723(th2);
                                    }
                                    if (Result.m9310isFailureimpl(objM723)) {
                                        objM723 = null;
                                    }
                                    if (objM723 == null || (lM11807 = C6666.m11807(objM723, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"))) == null) {
                                        return;
                                    }
                                    final long jLongValue2 = lM11807.longValue();
                                    Object objM11808 = C6666.m11808(objM723, AbstractC9234.m14531(152));
                                    List list3 = (objM11808 != null && (objM11808 instanceof List)) ? (List) objM11808 : null;
                                    String string = "";
                                    if (list3 != null) {
                                        StringBuilder sb = new StringBuilder();
                                        Iterator it = list3.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Object next2 = it.next();
                                                Object objM118082 = C6666.m11808(next2, AbstractC9234.m14531(338));
                                                if (objM118082 != null) {
                                                    Integer numValueOf2 = objM118082 instanceof Integer ? (Integer) objM118082 : objM118082 instanceof Number ? Integer.valueOf(((Number) objM118082).intValue()) : null;
                                                    if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                                                        try {
                                                            objM7232 = Result.m9304constructorimpl(XposedHelpers.callMethod(next2, AbstractC9234.m14531(247), new Object[0]));
                                                        } catch (Throwable th3) {
                                                            objM7232 = AbstractC0900.m723(th3);
                                                        }
                                                        if (Result.m9310isFailureimpl(objM7232)) {
                                                            objM7232 = null;
                                                        }
                                                        if (objM7232 != null) {
                                                            try {
                                                                Object objCallMethod3 = XposedHelpers.callMethod(objM7232, AbstractC9234.m14531(339), new Object[0]);
                                                                objM7233 = Result.m9304constructorimpl(objCallMethod3 instanceof String ? (String) objCallMethod3 : null);
                                                            } catch (Throwable th4) {
                                                                objM7233 = AbstractC0900.m723(th4);
                                                            }
                                                            if (Result.m9310isFailureimpl(objM7233)) {
                                                                objM7233 = null;
                                                            }
                                                            String str4 = (String) objM7233;
                                                            if (str4 != null) {
                                                                sb.append(str4);
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            } else {
                                                string = sb.toString();
                                                AbstractC9234.m14531(1296);
                                            }
                                        }
                                    }
                                    final String str5 = string.length() > 0 ? string : null;
                                    if (str5 == null) {
                                        return;
                                    }
                                    Object objM12520 = C7206.m12520(obj, AbstractC9234.m14531(2190), C0328R.mipmap.ic_launcher_round, new Callable(c6666, str5, jLongValue2) { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪苏兰哲

                                        /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
                                        public final /* synthetic */ long f16329;

                                        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                                        public final /* synthetic */ String f16330;

                                        {
                                            this.f16330 = str5;
                                            this.f16329 = jLongValue2;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            ConcurrentHashMap concurrentHashMap2 = C6666.f16324;
                                            Activity activityM7213 = AbstractC3887.m7213();
                                            if (activityM7213 == null) {
                                                return null;
                                            }
                                            final DialogC7148 dialogC7148 = new DialogC7148(activityM7213);
                                            View viewInflate = LayoutInflater.from(activityM7213).inflate(C0328R.layout.change_message, (ViewGroup) null, false);
                                            final EditText editText = (EditText) viewInflate.findViewById(C0328R.id.change_message_content);
                                            ConcurrentHashMap concurrentHashMap3 = C6666.f16324;
                                            final long j = this.f16329;
                                            String str6 = (String) concurrentHashMap3.get(Long.valueOf(j));
                                            if (str6 == null) {
                                                str6 = this.f16330;
                                            }
                                            editText.setText(str6);
                                            editText.setSelection(editText.getText().length());
                                            ((Button) viewInflate.findViewById(C0328R.id.change_message_save)).setOnClickListener(new View.OnClickListener() { // from class: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪哲苏兰
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    C6666.f16324.put(Long.valueOf(j), editText.getText().toString());
                                                    dialogC7148.dismiss();
                                                    AbstractC7014.m12151(AbstractC9234.m14531(2191));
                                                }
                                            });
                                            dialogC7148.setContentView(viewInflate);
                                            dialogC7148.show();
                                            return null;
                                        }
                                    });
                                    objM12520.getClass();
                                    list.add(0, objM12520);
                                    return;
                                }
                                return;
                            } catch (Throwable th5) {
                                Result.m9304constructorimpl(new Result.Failure(th5));
                            }
                        }
                    }
                }
                list = null;
                if (list == null) {
                    return;
                }
                String strM145312 = AbstractC9234.m14531(160);
                superclass = objM9374.getClass();
                while (true) {
                    if (superclass == null) {
                    }
                    superclass = superclass.getSuperclass();
                }
                if (obj != null) {
                }
                break;
            case 9:
                C6672 c6672 = (C6672) obj2;
                Object obj9 = methodHookParam.thisObject;
                obj9.getClass();
                try {
                    Field[] declaredFields3 = obj9.getClass().getDeclaredFields();
                    AbstractC9234.m14531(1985);
                    declaredFields3.getClass();
                    int length = declaredFields3.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            Field field3 = declaredFields3[i4];
                            String name = field3.getType().getName();
                            if (name.equals(AbstractC9234.m14531(2214)) || AbstractC5976.m10735(name, AbstractC9234.m14532("喵喵呜呜呜呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵呜"), false)) {
                                field3.setAccessible(true);
                                Object obj10 = field3.get(obj9);
                                if (obj10 != null) {
                                    Method[] methods = obj10.getClass().getMethods();
                                    AbstractC9234.m14531(2215);
                                    methods.getClass();
                                    for (Method method : methods) {
                                        if (AbstractC5227.m9466(method.getName(), AbstractC9234.m14531(2216)) && method.getParameterCount() == 0) {
                                            method.setAccessible(true);
                                            Object objInvoke = method.invoke(obj10, null);
                                            if (objInvoke instanceof ImageView) {
                                                imageView = (ImageView) objInvoke;
                                            }
                                        }
                                    }
                                }
                            }
                            i4++;
                        }
                    }
                } catch (Exception e2) {
                    c6672.getExceptionCollectionToolInstance().m12391(e2);
                }
                if (imageView == null) {
                    return;
                }
                String name2 = imageView.getContext().getClass().getName();
                AbstractC9234.m14531(1820);
                if (!AbstractC5976.m10735(name2, AbstractC9234.m14531(2219), false) && imageView.getVisibility() == 0) {
                    imageView.setVisibility(8);
                    return;
                }
                return;
            case 10:
                C6654 c6654 = (C6654) obj2;
                Object obj11 = methodHookParam.thisObject;
                Object obj12 = methodHookParam.args[0];
                AbstractC9234.m14531(1543);
                obj12.getClass();
                Object tag = ((View) obj12).getTag();
                if (tag == null) {
                    return;
                }
                try {
                    int intField3 = XposedHelpers.getIntField(tag, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"));
                    if (intField3 == 0 || (service = QQServiceTool.getService(AbstractC7166.m12425(AbstractC9234.m14531(2251)))) == null) {
                        return;
                    }
                    try {
                        objCallMethod = XposedHelpers.callMethod(service, AbstractC9234.m14531(2252), new Object[0]);
                    } catch (Exception unused) {
                        try {
                            Object objectField2 = XposedHelpers.getObjectField(service, AbstractC9234.m14531(2253));
                            if (AbstractC5220.m9452(objectField2)) {
                                list2 = (List) objectField2;
                                break;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    if (AbstractC5220.m9452(objCallMethod)) {
                        list2 = (List) objCallMethod;
                        break;
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        return;
                    }
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (XposedHelpers.getIntField(next, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜")) == intField3) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    if (next == null) {
                        return;
                    }
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        try {
                            intField = XposedHelpers.getIntField(it3.next(), AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"));
                        } catch (Exception unused3) {
                            intField = 0;
                        }
                        numValueOf = Integer.valueOf(intField);
                        while (it3.hasNext()) {
                            try {
                                intField2 = XposedHelpers.getIntField(it3.next(), AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"));
                            } catch (Exception unused4) {
                                intField2 = 0;
                            }
                            Integer numValueOf3 = Integer.valueOf(intField2);
                            if (numValueOf.compareTo(numValueOf3) < 0) {
                                numValueOf = numValueOf3;
                            }
                            break;
                        }
                        break;
                    } else {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
                    if (intField3 == iIntValue) {
                        return;
                    }
                    try {
                        objectField = XposedHelpers.getObjectField(next, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵喵呜"));
                    } catch (Exception unused5) {
                    }
                    if (objectField instanceof String) {
                        str = (String) objectField;
                        break;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        try {
                            objCallMethod2 = XposedHelpers.callMethod(QQServiceTool.getRuntime(), AbstractC9234.m14531(602), new Object[]{AbstractC9234.m14531(2247)});
                            break;
                        } catch (Exception unused6) {
                        }
                        if (objCallMethod2 != null) {
                            Method method2 = c6654.f16306;
                            method2.getClass();
                            XposedHelpers.callMethod(objCallMethod2, method2.getName(), new Object[]{AbstractC7176.m12471(str)});
                        }
                    }
                    XposedHelpers.callMethod(service, AbstractC9234.m14531(2254), new Object[]{next});
                    Object objCallMethod4 = XposedHelpers.callMethod(next, AbstractC9234.m14531(2255), new Object[]{next});
                    XposedHelpers.setIntField(objCallMethod4, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), iIntValue + 1);
                    XposedHelpers.callMethod(service, AbstractC9234.m14531(2256), new Object[]{objCallMethod4});
                    XposedHelpers.callMethod(service, AbstractC9234.m14531(2257), new Object[0]);
                    Object objectField3 = XposedHelpers.getObjectField(obj11, AbstractC9234.m14531(2258));
                    Object objM12146 = AbstractC7012.m12146(2259);
                    if (objM12146 != null) {
                        XposedHelpers.callMethod(XposedHelpers.callMethod(objM12146, AbstractC9234.m14531(2260), new Object[]{objectField3}), AbstractC9234.m14531(2261), new Object[0]);
                        return;
                    }
                    return;
                } catch (Exception unused7) {
                    return;
                }
            case 11:
                ViewOnClickListenerC7239 viewOnClickListenerC7239 = (ViewOnClickListenerC7239) obj2;
                for (Object obj13 : (ArrayList) methodHookParam.args[2]) {
                    C7164 c7164M12413 = C7164.m12413(obj13.getClass());
                    c7164M12413.f17803.f3963 = AbstractC9234.m14531(140);
                    Object objM12415 = c7164M12413.m12415(obj13, new Object[0]);
                    if (objM12415 != null) {
                        String strM12526 = viewOnClickListenerC7239.m12526();
                        if (!TextUtils.isEmpty(strM12526)) {
                            C7164 c7164M124132 = C7164.m12413(objM12415.getClass());
                            String strM145313 = AbstractC9234.m14531(142);
                            C2080 c2080 = c7164M124132.f17803;
                            c2080.f3963 = strM145313;
                            c2080.f3964 = new Class[]{String.class};
                            c2080.f3962 = cls;
                            c7164M124132.m12415(objM12415, strM12526);
                        }
                    }
                }
                return;
            case 12:
                C7257 c7257 = (C7257) obj2;
                Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(151));
                if (clsM12425 != null) {
                    for (Method method3 : clsM12425.getDeclaredMethods()) {
                        method3.setAccessible(true);
                        if (c7257.f17963.contains(method3.getName())) {
                            c7257.m12390(method3, new C7092(i2));
                        }
                    }
                }
                methodHookParam.setResult((Object) null);
                return;
            case 13:
                C6686 c6686 = (C6686) obj2;
                List list4 = (List) AbstractC7165.m12417(List.class, methodHookParam.args[0]);
                Object objM12417 = AbstractC7165.m12417(AbstractC7166.m12425(AbstractC9234.m14531(160)), list4.get(0));
                List<String> msgRecordPicUrlList = QQMessageUtils.getMsgRecordPicUrlList(XposedHelpers.callMethod(objM12417, AbstractC9234.m14531(164), new Object[0]));
                if (msgRecordPicUrlList.isEmpty()) {
                    return;
                }
                list4.add(0, C7206.m12520(objM12417, AbstractC9234.m14531(165), C0328R.mipmap.ic_launcher_round, new CallableC7262(c6686, msgRecordPicUrlList, i3)));
                return;
            case 14:
                C7254 c7254 = (C7254) obj2;
                LinearLayout linearLayout = (LinearLayout) methodHookParam.thisObject;
                Context context = linearLayout.getContext();
                if (linearLayout.getChildCount() < 4) {
                    if (linearLayout.getChildCount() >= 2) {
                        linearLayout.post(new RunnableC3179(c7254, linearLayout, context, i2));
                        return;
                    }
                    return;
                } else {
                    View childAt = linearLayout.getChildAt(2);
                    if (childAt == null) {
                        return;
                    }
                    linearLayout.post(new RunnableC6769(c7254, linearLayout, context, childAt, 1));
                    return;
                }
            case 15:
                LinearLayout linearLayout2 = (LinearLayout) methodHookParam.thisObject;
                linearLayout2.addView(C7250.m12531(((C7254) obj2).f17956, linearLayout2.getContext()), linearLayout2.getChildCount() - 2, (LinearLayout.LayoutParams) linearLayout2.getChildAt(0).getLayoutParams());
                return;
            case 16:
                C7149 c7149 = ((C7224) obj2).f17904;
                ArrayList arrayList = (ArrayList) methodHookParam.args[2];
                int i5 = -1;
                int i6 = -1;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    Object obj14 = arrayList.get(i7);
                    C7164 c7164M124133 = C7164.m12413(obj14.getClass());
                    c7164M124133.f17803.f3963 = AbstractC9234.m14531(247);
                    if (c7164M124133.m12415(obj14, new Object[0]) != null) {
                        if (i5 == -1) {
                            i5 = i7;
                        }
                        i6 = i7;
                    }
                }
                if (i5 == -1) {
                    return;
                }
                String strReplace = (String) c7149.m12398(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵呜喵呜喵喵"));
                String strReplace2 = (String) c7149.m12398(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵呜喵呜喵喵"));
                String str6 = (String) c7149.m12398(AbstractC9234.m14531(243));
                if (!TextUtils.isEmpty(str6)) {
                    String str7 = new SimpleDateFormat(str6, Locale.CHINA).format(new Date());
                    strReplace = strReplace.replace(AbstractC9234.m14532("喵喵喵喵呜喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵呜"), str7);
                    strReplace2 = strReplace2.replace(AbstractC9234.m14532("喵喵喵喵呜喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵呜"), str7);
                }
                arrayList.add(i5, CreateElement.createTextElement(strReplace));
                arrayList.add(i6 + 2, CreateElement.createTextElement(strReplace2));
                return;
            case 17:
                ((C7226) obj2).f17905.invoke(methodHookParam.thisObject, null);
                methodHookParam.setResult((Object) null);
                return;
            case 18:
                C6686 c66862 = (C6686) obj2;
                List list5 = (List) AbstractC7165.m12417(List.class, methodHookParam.args[0]);
                Object objM124172 = AbstractC7165.m12417(AbstractC7166.m12425(AbstractC9234.m14531(160)), list5.get(0));
                List<String> msgRecordPicUrlList2 = QQMessageUtils.getMsgRecordPicUrlList(XposedHelpers.callMethod(objM124172, AbstractC9234.m14531(164), new Object[0]));
                if (msgRecordPicUrlList2.isEmpty()) {
                    return;
                }
                list5.add(0, C7206.m12520(objM124172, AbstractC9234.m14531(290), C0328R.mipmap.ic_launcher_round, new CallableC7219(c66862, msgRecordPicUrlList2, i3)));
                return;
            case 19:
                C7266 c7266 = (C7266) obj2;
                for (Object obj15 : (ArrayList) methodHookParam.args[2]) {
                    C7164 c7164M124134 = C7164.m12413(obj15.getClass());
                    c7164M124134.f17803.f3963 = AbstractC9234.m14531(247);
                    Object objM124152 = c7164M124134.m12415(obj15, new Object[0]);
                    if (objM124152 != null && ((Integer) AbstractC7165.m12418(cls2, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM124152)).intValue() == 2) {
                        String str8 = (String) c7266.f17979.m12398(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"));
                        if (TextUtils.isEmpty(str8)) {
                            return;
                        }
                        C7164 c7164M124135 = C7164.m12413(objM124152.getClass());
                        String strM145314 = AbstractC9234.m14531(340);
                        C2080 c20802 = c7164M124135.f17803;
                        c20802.f3963 = strM145314;
                        c20802.f3964 = new Class[]{String.class};
                        c20802.f3962 = cls;
                        c7164M124135.m12415(objM124152, str8);
                    }
                }
                return;
            case 20:
                C7265 c7265 = (C7265) obj2;
                String str9 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵~喵喵呜呜呜喵呜呜~喵喵喵呜喵喵喵呜~喵喵喵呜呜呜呜喵"), methodHookParam.args[1]);
                HashMap map = c7265.f17976;
                if (map.containsKey(str9)) {
                    jLongValue = ((Long) map.get(str9)).longValue();
                } else {
                    C6956 c6956 = new C6956(new C6972());
                    C2080 c20803 = new C2080(6);
                    c20803.m2711(str9);
                    c20803.m2718("HEAD", null);
                    C6960 c6960M12193 = new C7032(c6956, new C6954(c20803)).m12193();
                    String strM12110 = c6960M12193.f17114.m12110(AbstractC9234.m14531(521));
                    if (strM12110 == null) {
                        strM12110 = null;
                    }
                    c6960M12193.close();
                    jLongValue = Long.parseLong(strM12110);
                }
                if (jLongValue > 104857600 || map.containsKey(str9)) {
                    if (System.currentTimeMillis() > c7265.f17977 + 60000) {
                        AbstractC7014.m12151(AbstractC9234.m14531(522));
                        c7265.f17977 = System.currentTimeMillis();
                        map.put(str9, Long.valueOf(jLongValue));
                    }
                    methodHookParam.setResult((Object) null);
                    return;
                }
                return;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                Object obj16 = methodHookParam.thisObject;
                Object obj17 = methodHookParam.args[1];
                C7164 c7164M124136 = C7164.m12413(obj17.getClass());
                c7164M124136.f17803.f3963 = AbstractC9234.m14531(164);
                Object objM124153 = c7164M124136.m12415(obj17, new Object[0]);
                Long l = (Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), objM124153);
                l.getClass();
                if (((C9621) obj2).f25103.contains(l)) {
                    return;
                }
                for (Object obj18 : (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), objM124153)) {
                    C7164 c7164M124137 = C7164.m12413(obj18.getClass());
                    c7164M124137.f17803.f3963 = AbstractC9234.m14531(140);
                    c7164M124137.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(178));
                    Object objM124154 = c7164M124137.m12415(obj18, new Object[0]);
                    if (objM124154 != null) {
                        int iIntValue2 = ((Integer) AbstractC7165.m12418(cls2, AbstractC9234.m14531(1138), objM124154)).intValue();
                        if (((Integer) AbstractC7165.m12418(cls2, AbstractC9234.m14531(1139), objM124154)).intValue() > 6000 && iIntValue2 > 6000) {
                            methodHookParam.setResult((Object) null);
                            return;
                        }
                    }
                }
                return;
            case 26:
                methodHookParam.setResult(AbstractC5227.m9466(((Method) obj2).getReturnType(), Boolean.TYPE) ? Boolean.FALSE : null);
                return;
            case 27:
                HashMap map2 = C9576.f25006;
                new Handler(Looper.getMainLooper()).post(new RunnableC7186((C9576) obj2, methodHookParam));
                return;
            case 28:
                C9583 c9583 = (C9583) obj2;
                HashSet hashSet = C9583.f25017;
                Object obj19 = methodHookParam.thisObject;
                File file = obj19 instanceof File ? (File) obj19 : null;
                if (file == null) {
                    return;
                }
                String absolutePath = file.getAbsolutePath();
                if (methodHookParam.getThrowable() != null) {
                    return;
                }
                Object result = methodHookParam.getResult();
                String[] strArr = result instanceof String[] ? (String[]) result : null;
                if (strArr == null) {
                    return;
                }
                HashSet hashSet2 = c9583.f25018;
                if (hashSet2 == null) {
                    AbstractC5227.m9467(AbstractC9234.m14531(2282));
                    throw null;
                }
                Iterator it4 = hashSet2.iterator();
                AbstractC9234.m14531(1253);
                it4.getClass();
                while (it4.hasNext()) {
                    Object next3 = it4.next();
                    AbstractC9234.m14531(1254);
                    next3.getClass();
                    absolutePath.getClass();
                    if (AbstractC5976.m10735(absolutePath, (String) next3, false)) {
                        if (strArr.length != 0) {
                            ArrayList arrayList2 = new ArrayList(strArr.length);
                            for (String str10 : strArr) {
                                if (str10 != null && !C9583.f25017.contains(str10)) {
                                    arrayList2.add(str10);
                                }
                            }
                            strArr = (String[]) arrayList2.toArray(new String[0]);
                        }
                        methodHookParam.setResult(strArr);
                        return;
                    }
                }
                return;
        }
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C3058 mo863(View view, C3058 c3058) {
        C8414 c8414 = (C8414) this.f7331;
        ArrayList arrayList = c8414.f20897;
        C3071 c3071 = c3058.f6866;
        C8494 c8494M13499 = C8494.m13499(c3071.mo4612(519), c3071.mo4612(64));
        C8494 c8494M134992 = C8494.m13499(c3071.mo4613(519), c3071.mo4613(64));
        if (!c8494M13499.equals(c8414.f20896) || !c8494M134992.equals(c8414.f20895)) {
            c8414.f20896 = c8494M13499;
            c8414.f20895 = c8494M134992;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C8416 c8416 = (C8416) arrayList.get(size);
                c8416.f20904 = c8494M13499;
                c8416.f20903 = c8494M134992;
                c8416.m13375();
            }
        }
        return c3058;
    }
}
