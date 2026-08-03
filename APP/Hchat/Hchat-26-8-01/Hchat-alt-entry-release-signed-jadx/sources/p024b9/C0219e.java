package p024b9;

import ac.RunnableC0059l;
import android.app.Activity;
import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ba.C0228h;
import ba.C0229i;
import ba.C0230j;
import ba.C0231k;
import ba.C0232l;
import ba.C0233m;
import ba.C0235o;
import ba.C0237q;
import ba.C0238r;
import ba.EnumC0221a;
import ba.EnumC0234n;
import bb.C0245g;
import bb.C0248j;
import bb.C0249k;
import bb.C0250l;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.regex.Pattern;
import lb.RunnableC2539a;
import na.C2914b;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p009a9.C0031h;
import p019b4.C0178b;
import p020b5.C0184c;
import p024b9.RunnableC0217c;
import p036c9.C0415a0;
import p036c9.C0426d;
import p036c9.C0430e;
import p036c9.C0477p2;
import p037cb.C0545f;
import p050da.C0756b;
import p050da.C0757c;
import p050da.C0758d;
import p050da.C0759e;
import p050da.C0760f;
import p050da.C0761g;
import p050da.C0762h;
import p063e9.C0840k;
import p063e9.C0846q;
import p064ea.C0851c;
import p065eb.C0871h0;
import p065eb.C0875j0;
import p065eb.C0881m0;
import p068eh.AbstractC0921a;
import p077f8.C1088h;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p096g8.C1360a;
import p099h.Hchat.R;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatQuoteMsg;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1634c;
import p108ha.C1649j0;
import p109hb.C1671c;
import p109hb.C1687k;
import p119i2.C1955z;
import p153k8.AbstractC2338b;
import p153k8.C2340d;
import p153k8.C2341e;
import p153k8.C2346j;
import p153k8.C2347k;
import p167l8.C2529d;
import p196n8.C2910b;
import p196n8.C2911c;
import p198nb.C2954w;
import p198nb.C2957z;
import p198nb.RunnableC2932e;
import p210o8.C3086j;
import p212oa.AbstractC3107b;
import p212oa.C3106a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p230p8.C3353e0;
import p242q8.C3447b;
import p242q8.C3458m;
import p242q8.C3460o;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p259r9.C3752d0;
import p259r9.C3774x;
import p261rb.C3787c;
import p261rb.C3792h;
import p261rb.C3795k;
import p275s9.C3945a;
import p275s9.C3946b;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p329w8.C4688a;
import p331wa.AbstractC4699j;
import p331wa.C4695f;
import p331wa.C4696g;
import p360y4.C5995c;
import p381zb.AbstractC6134c;
import pa.AbstractC3375a;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: b9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219e extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f536b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219e(C0184c c0184c) {
        super(10000);
        this.f535a = 27;
        this.f536b = c0184c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m895a(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objM8391z0;
        TextView textView;
        boolean zBooleanValue;
        Object next;
        boolean z9;
        String string;
        methodHookParam.getClass();
        C0245g c0245g = (C0245g) this.f536b;
        c0245g.getClass();
        Object[] objArr = methodHookParam.args;
        if (objArr == null || (objM8391z0 = AbstractC4165l.m8391z0(objArr)) == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = c0245g.f658h;
        Field field = (Field) concurrentHashMap.get(objM8391z0.getClass());
        if (field != null) {
            Object field2 = KavaReflector.readField(field, objM8391z0);
            textView = field2 instanceof TextView ? (TextView) field2 : null;
        } else {
            Field fieldM984h = c0245g.m984h(objM8391z0.getClass());
            concurrentHashMap.put(objM8391z0.getClass(), fieldM984h);
            Object field3 = KavaReflector.readField(fieldM984h, objM8391z0);
            if (field3 instanceof TextView) {
                textView = (TextView) field3;
            }
        }
        if (textView != null) {
            boolean z10 = c0245g.f652b.f694a.getBoolean("enable", false);
            boolean z11 = c0245g.f653c.f6870a.getBoolean("enable", false);
            if (!z10 && !z11) {
                c0245g.f657g.remove(textView);
                C0245g.m976j(textView);
                C0245g.m975i(textView);
                return;
            }
            C3458m c3458mChatPage = WeChatApis.chatPage();
            String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
            if (strM7258a == null) {
                strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3156t.m6733W(strM7258a, "@chatroom", false) && !AbstractC3156t.m6733W(strM7258a, "@im.chatroom", false)) {
                c0245g.f657g.remove(textView);
                C0245g.m976j(textView);
                C0245g.m975i(textView);
                return;
            }
            Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
            ArrayList arrayList = new ArrayList();
            Object obj2 = null;
            for (Object obj3 : objArr) {
                if (obj3 instanceof String) {
                    if (((CharSequence) obj).length() == 0) {
                        obj = obj3;
                    }
                    String string2 = AbstractC3149m.m6703R0((String) obj3).toString();
                    C3147k c3147k = C0250l.f693c;
                    if (AbstractC6134c.m10905b(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (obj3 != null && c0245g.m985k(obj3.getClass())) {
                    obj2 = obj3;
                }
            }
            if (obj2 == null) {
                zBooleanValue = false;
            } else {
                String[] strArr = {"field_isSend", "isSend"};
                int i9 = 0;
                while (true) {
                    if (i9 >= 2) {
                        break;
                    }
                    Object field4 = KavaReflector.readField(obj2, strArr[i9]);
                    if (!(field4 instanceof Number)) {
                        if (field4 instanceof Boolean) {
                            zBooleanValue = ((Boolean) field4).booleanValue();
                            break;
                        }
                        i9++;
                    } else if (((Number) field4).intValue() == 1) {
                        zBooleanValue = true;
                    }
                }
            }
            if (zBooleanValue) {
                c0245g.f657g.remove(textView);
                C0245g.m976j(textView);
                C0245g.m975i(textView);
                return;
            }
            String str = (String) obj;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (!C0245g.m977l((String) next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String strM974e = (String) next;
            if (strM974e == null) {
                String strM974e2 = C0245g.m974e(obj2);
                if (strM974e2 == null) {
                    Map map = c0245g.f656f;
                    if (obj2 == null) {
                        C3147k c3147k2 = C0250l.f693c;
                        string = AbstractC6134c.m10905b(str) ? str : null;
                        strM974e = string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
                    } else {
                        strM974e = (String) map.get(obj2);
                        if (strM974e == null) {
                            String[] strArr2 = {"A0", "B0", "C0", "D0", "E0", "F0", "getSender", "getSendTalker", "getTalker", "j", "R1", "P1", "o0", "x0", "j0"};
                            int i10 = 0;
                            while (true) {
                                if (i10 >= 15) {
                                    String[] strArr3 = {"field_talker", "talker", "field_sender", "sender", "sendTalker", "field_talkerUsername", "P"};
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= 7) {
                                            strM974e = C0245g.m974e(obj2);
                                            if (strM974e != null) {
                                                map.put(obj2, strM974e);
                                            } else {
                                                C3147k c3147k3 = C0250l.f693c;
                                                string = AbstractC6134c.m10905b(str) ? str : null;
                                                if (string == null) {
                                                }
                                            }
                                        } else {
                                            Object field5 = KavaReflector.readField(obj2, strArr3[i11]);
                                            String str2 = field5 instanceof String ? (String) field5 : null;
                                            C3147k c3147k4 = C0250l.f693c;
                                            if (AbstractC6134c.m10905b(str2)) {
                                                string = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
                                                strM974e = string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
                                                map.put(obj2, strM974e);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                } else {
                                    Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj2.getClass(), strArr2[i10], new Class[0]), obj2, new Object[0]);
                                    String str3 = objInvoke instanceof String ? (String) objInvoke : null;
                                    C3147k c3147k5 = C0250l.f693c;
                                    if (AbstractC6134c.m10905b(str3)) {
                                        string = str3 != null ? AbstractC3149m.m6703R0(str3).toString() : null;
                                        strM974e = string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
                                        map.put(obj2, strM974e);
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    strM974e = !C0245g.m977l(strM974e2) ? strM974e2 : null;
                    if (strM974e == null) {
                    }
                }
            }
            C3147k c3147k6 = C0250l.f693c;
            if (!AbstractC6134c.m10905b(strM974e) || C0245g.m977l(strM974e)) {
                c0245g.f657g.remove(textView);
                C0245g.m976j(textView);
                C0245g.m975i(textView);
                return;
            }
            Map map2 = c0245g.f657g;
            map2.getClass();
            map2.put(textView, strM974e);
            if (z10) {
                String strM1001a = c0245g.f652b.m1001a(strM974e);
                if (!(strM1001a.length() > 0)) {
                    C0245g.m976j(textView);
                    if (c0245g.f652b.f694a.getBoolean("visible_query", true)) {
                        C0249k c0249k = c0245g.f654d;
                        c0249k.m996i();
                        String string3 = AbstractC3149m.m6703R0(strM7258a).toString();
                        if (string3 == null) {
                            string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String string4 = AbstractC3149m.m6703R0(strM974e).toString();
                        if (string4 == null) {
                            string4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (C0249k.m987g(string3) && AbstractC1184v0.m3174A(string4) && !C0249k.m988h(string4) && !c0249k.f675a.m1005e(string4) && !c0249k.f682h.contains(string4)) {
                            synchronized (c0249k.f679e) {
                                z9 = c0249k.f680f.size() + c0249k.f686l.size() >= 80;
                            }
                            if (!z9) {
                                c0249k.m992c(string3, string4);
                            }
                            if (!c0249k.m994e(string3, string4)) {
                                String strM989n = C0249k.m989n(string3, string4);
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                Long l10 = (Long) c0249k.f685k.get(strM989n);
                                if (l10 == null || jCurrentTimeMillis - l10.longValue() >= 5000) {
                                    c0249k.f685k.put(strM989n, Long.valueOf(jCurrentTimeMillis));
                                    c0249k.m996i();
                                    if (C0249k.m987g(string3) && AbstractC1184v0.m3174A(string4) && !c0249k.f675a.m1005e(string4) && !c0249k.f682h.contains(string4) && !c0249k.m994e(string3, string4)) {
                                        if (c0249k.f676b.m911c() && c0249k.m990a()) {
                                            c0249k.m1000m(string3, string4, true);
                                        } else {
                                            c0249k.m992c(string3, string4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (!c0245g.m980c(textView, strM974e, strM1001a)) {
                    Map map3 = c0245g.f657g;
                    map3.getClass();
                    map3.put(textView, strM974e);
                    C3086j c3086jTasks = WeChatApis.tasks();
                    if (c3086jTasks != null) {
                        c3086jTasks.m6555f(AbstractC0921a.m2249l(System.identityHashCode(textView), "real_tail_apply_"), 120L, new RunnableC0217c(c0245g, textView, strM974e, strM1001a));
                    }
                }
            } else {
                C0245g.m976j(textView);
            }
            if (z11) {
                c0245g.m979b(textView);
            } else {
                C0245g.m975i(textView);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:421:0x0580 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:432:0x05fd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:433:0x0428 */
    /* JADX DEBUG: Type inference failed for r13v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r7v6. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f8 A[PHI: r7
  0x01f8: PHI (r7v70 java.lang.String) = (r7v19 java.lang.String), (r7v21 java.lang.String), (r7v71 java.lang.String) binds: [B:129:0x0230, B:123:0x0213, B:112:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07b6  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m896b(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        char c10;
        Object objM1960j;
        Object next;
        Object objM1963o;
        Object next2;
        String str;
        int iM5940f;
        WeChatMessage weChatMessage;
        View viewFindViewById;
        TextView textViewM1951A;
        ?? arrayList;
        int i9;
        ?? arrayList2;
        ?? arrayList3;
        int i10;
        ArrayList arrayList4;
        TextView textViewM1951A2;
        boolean z9;
        boolean z10;
        View view;
        boolean z11;
        boolean z12;
        View viewFindViewById2;
        methodHookParam.getClass();
        C0762h c0762h = (C0762h) this.f536b;
        SharedPreferences sharedPreferences = c0762h.f2277b;
        Object[] objArr = methodHookParam.args;
        if (objArr != null) {
            char c11 = 2;
            if (objArr.length < 2) {
                return;
            }
            boolean z13 = false;
            Object obj2 = objArr[0];
            if (obj2 != null) {
                Object obj3 = objArr[1];
                Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Object field = KavaReflector.readField(obj2, "itemView");
                    View view2 = field instanceof View ? (View) field : null;
                    if (view2 == null) {
                        Object field2 = KavaReflector.readField(c0762h.m1976k(obj2.getClass()), obj2);
                        view2 = field2 instanceof View ? (View) field2 : null;
                    }
                    if (view2 != null) {
                        C0762h.m1955d(view2);
                        if (sharedPreferences.getBoolean("message_text_color_enable", false) && (obj = methodHookParam.thisObject) != null) {
                            ConcurrentHashMap concurrentHashMap = c0762h.f2279d;
                            if (iIntValue < 0) {
                                c10 = 2;
                                objM1960j = null;
                            } else {
                                Method method = (Method) concurrentHashMap.get(obj.getClass());
                                if (method != null) {
                                    objM1960j = KavaReflector.invoke(method, obj, num);
                                    c10 = 2;
                                } else {
                                    Class<?> superclass = obj.getClass();
                                    while (superclass != null && !superclass.equals(Object.class)) {
                                        Iterator it = KavaReflector.declaredMethods(superclass).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                c10 = c11;
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it.next();
                                            Method method2 = (Method) next2;
                                            if (method2.getParameterTypes().length == 1) {
                                                Class<?> cls = method2.getParameterTypes()[0];
                                                c10 = c11;
                                                Class cls2 = Integer.TYPE;
                                                if ((AbstractC1416l.m3825a(cls, cls2) || AbstractC1416l.m3825a(method2.getParameterTypes()[0], cls2)) && (AbstractC1416l.m3825a(method2.getName(), "J0") || AbstractC1416l.m3825a(method2.getName(), "getItem") || AbstractC1416l.m3825a(method2.getName(), "get"))) {
                                                    break;
                                                }
                                            } else {
                                                c10 = c11;
                                            }
                                            c11 = c10;
                                        }
                                        Method method3 = (Method) next2;
                                        if (method3 != null) {
                                            concurrentHashMap.put(obj.getClass(), method3);
                                            objM1963o = KavaReflector.invoke(method3, obj, num);
                                            if (objM1963o != null) {
                                                break;
                                            }
                                        }
                                        superclass = superclass.getSuperclass();
                                        c11 = c10;
                                    }
                                    c10 = c11;
                                    ConcurrentHashMap concurrentHashMap2 = c0762h.f2280e;
                                    Field field3 = (Field) concurrentHashMap2.get(obj.getClass());
                                    if (field3 == null || (objM1963o = C0762h.m1963o(iIntValue, KavaReflector.readField(field3, obj))) == null) {
                                        for (Class<?> superclass2 = obj.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                                            Iterator it2 = KavaReflector.declaredFields(superclass2).iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it2.next();
                                                Field field4 = (Field) next;
                                                if (AbstractC1416l.m3825a(field4.getName(), "K") || AbstractC1416l.m3825a(field4.getName(), "items") || AbstractC1416l.m3825a(field4.getName(), "data") || AbstractC1416l.m3825a(field4.getName(), "list")) {
                                                    break;
                                                }
                                            }
                                            Field field5 = (Field) next;
                                            if (field5 != null) {
                                                concurrentHashMap2.put(obj.getClass(), field5);
                                                objM1960j = C0762h.m1963o(iIntValue, KavaReflector.readField(field5, obj));
                                                break;
                                            }
                                        }
                                        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                                        setNewSetFromMap.getClass();
                                        objM1960j = C0762h.m1960j(obj, iIntValue, setNewSetFromMap, 0);
                                    } else {
                                        objM1960j = objM1963o;
                                    }
                                }
                            }
                            if (objM1960j != null) {
                                Set setNewSetFromMap2 = Collections.newSetFromMap(new WeakHashMap());
                                setNewSetFromMap2.getClass();
                                Object objM1973z = C0762h.m1973z(0, objM1960j, setNewSetFromMap2);
                                if (objM1973z != null) {
                                    long jM1964q = C0762h.m1964q(objM1973z);
                                    C3458m c3458mChatPage = WeChatApis.chatPage();
                                    String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                                    if (strM7258a == null) {
                                        strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    Object field6 = KavaReflector.readField(objM1973z, "field_content");
                                    String str2 = field6 instanceof String ? (String) field6 : null;
                                    if (str2 == null) {
                                        Object field7 = KavaReflector.readField(objM1973z, "content");
                                        str2 = field7 instanceof String ? (String) field7 : null;
                                        if (str2 == null) {
                                            Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(objM1973z.getClass(), "getContent", new Class[0]), objM1973z, new Object[0]);
                                            str2 = objInvoke instanceof String ? (String) objInvoke : null;
                                            str = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
                                        } else {
                                            if (AbstractC3149m.m6721t0(str2)) {
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                            }
                                        }
                                    } else {
                                        if (AbstractC3149m.m6721t0(str2)) {
                                            str2 = null;
                                        }
                                        if (str2 != null) {
                                        }
                                    }
                                    Integer numM1969v = C0762h.m1969v(C0762h.m1971x(objM1973z, "getType", "field_type", "type"));
                                    if (numM1969v == null) {
                                        WeChatMessage.Companion.getClass();
                                        iM5940f = C2529d.m5940f(str);
                                    } else {
                                        if (numM1969v.intValue() <= 0) {
                                            numM1969v = null;
                                        }
                                        if (numM1969v != null) {
                                            iM5940f = numM1969v.intValue();
                                        }
                                    }
                                    int i11 = iM5940f;
                                    if (i11 <= 0) {
                                        weChatMessage = null;
                                    } else {
                                        Object objM1971x = C0762h.m1971x(objM1973z, "getTalker", "field_talker", "talker");
                                        String str3 = objM1971x instanceof String ? (String) objM1971x : null;
                                        String str4 = str3 != null ? str3 : strM7258a;
                                        Integer numM1969v2 = C0762h.m1969v(C0762h.m1971x(objM1973z, "getIsSend", "field_isSend", "isSend"));
                                        weChatMessage = new WeChatMessage(jM1964q, 0L, i11, 0, numM1969v2 != null ? numM1969v2.intValue() : 0, 0L, str4, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                                    }
                                    if (weChatMessage != null) {
                                        boolean zIsVoip = weChatMessage.isVoip();
                                        List<C0760f> list = C4173t.f13710g;
                                        if (zIsVoip) {
                                            int iIntValue2 = ((Number) c0762h.f2283h.getValue()).intValue();
                                            Integer numValueOf = Integer.valueOf(iIntValue2);
                                            if (iIntValue2 == 0) {
                                                numValueOf = null;
                                            }
                                            if (numValueOf != null && (viewFindViewById2 = view2.findViewById(numValueOf.intValue())) != null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                C0762h.m1959h(viewFindViewById2, arrayList5);
                                                HashSet hashSet = new HashSet();
                                                arrayList4 = new ArrayList();
                                                for (Object obj4 : arrayList5) {
                                                    if (hashSet.add(((C0760f) obj4).f2271b)) {
                                                        arrayList4.add(obj4);
                                                    }
                                                }
                                                list = arrayList4;
                                            }
                                        } else if (weChatMessage.isApp() && weChatMessage.appMsgType() == 19) {
                                            List list2 = (List) c0762h.f2284i.getValue();
                                            ArrayList arrayList6 = new ArrayList();
                                            Iterator it3 = list2.iterator();
                                            while (it3.hasNext()) {
                                                View viewFindViewById3 = view2.findViewById(((Number) it3.next()).intValue());
                                                C0760f c0760f = (viewFindViewById3 == null || viewFindViewById3.getVisibility() != 0 || (textViewM1951A2 = C0762h.m1951A(viewFindViewById3)) == null) ? null : new C0760f(viewFindViewById3, textViewM1951A2);
                                                if (c0760f != null) {
                                                    arrayList6.add(c0760f);
                                                }
                                            }
                                            HashSet hashSet2 = new HashSet();
                                            arrayList4 = new ArrayList();
                                            for (Object obj5 : arrayList6) {
                                                if (hashSet2.add(((C0760f) obj5).f2270a)) {
                                                    arrayList4.add(obj5);
                                                }
                                            }
                                            list = arrayList4;
                                        } else if (weChatMessage.isText() || weChatMessage.isQuote() || weChatMessage.isVoice()) {
                                            int iIntValue3 = ((Number) c0762h.f2282g.getValue()).intValue();
                                            Integer numValueOf2 = Integer.valueOf(iIntValue3);
                                            if (iIntValue3 == 0) {
                                                numValueOf2 = null;
                                            }
                                            C0760f c0760f2 = (numValueOf2 == null || (viewFindViewById = view2.findViewById(numValueOf2.intValue())) == null || (textViewM1951A = C0762h.m1951A(viewFindViewById)) == null) ? null : new C0760f(viewFindViewById, textViewM1951A);
                                            if (c0760f2 == null) {
                                                if (weChatMessage.isText()) {
                                                    String strBodyContent = weChatMessage.bodyContent();
                                                    if (AbstractC3149m.m6721t0(strBodyContent)) {
                                                        strBodyContent = null;
                                                    }
                                                    if (strBodyContent != null) {
                                                        String strM1962n = C0762h.m1962n(strBodyContent);
                                                        int i12 = 6;
                                                        if (strM1962n.length() == 0) {
                                                            arrayList = list;
                                                        } else {
                                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                            linkedHashSet.add(strM1962n);
                                                            int iM6719r0 = AbstractC3149m.m6719r0(strM1962n, ":\n", 0, false, 6);
                                                            if (iM6719r0 > 0 && (i9 = iM6719r0 + 2) < strM1962n.length()) {
                                                                linkedHashSet.add(C0762h.m1962n(strM1962n.substring(i9)));
                                                            }
                                                            arrayList = new ArrayList();
                                                            for (Object obj6 : linkedHashSet) {
                                                                if (!AbstractC3149m.m6721t0((String) obj6)) {
                                                                    arrayList.add(obj6);
                                                                }
                                                            }
                                                        }
                                                        if (!arrayList.isEmpty()) {
                                                            ArrayList arrayList7 = new ArrayList();
                                                            C0762h.m1957f(view2, arrayList, true, arrayList7);
                                                            if (arrayList7.isEmpty()) {
                                                                C0762h.m1957f(view2, arrayList, false, arrayList7);
                                                            }
                                                            c0760f2 = (C0760f) AbstractC4166m.m8424v1(AbstractC4166m.m8402K1(arrayList7, new C0415a0(new C0415a0(c0762h, 5), i12)));
                                                        }
                                                        if (c0760f2 == null) {
                                                        }
                                                    }
                                                } else {
                                                    c0760f2 = null;
                                                    if (c0760f2 == null) {
                                                        int i13 = 7;
                                                        if (weChatMessage.isText() || weChatMessage.isQuote()) {
                                                            ArrayList arrayList8 = new ArrayList();
                                                            if (weChatMessage.isText()) {
                                                                C0762h.m1954c(weChatMessage.bodyContent(), arrayList8);
                                                            }
                                                            if (weChatMessage.isQuote()) {
                                                                String strBodyContent2 = weChatMessage.bodyContent();
                                                                WeChatQuoteMsg quoteMsg = weChatMessage.getQuoteMsg();
                                                                C0762h.m1954c(quoteMsg != null ? quoteMsg.title : null, arrayList8);
                                                                WeChatMessage.Companion.getClass();
                                                                C0762h.m1954c(C2529d.m5949o(strBodyContent2, "title"), arrayList8);
                                                            }
                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                            Iterator it4 = arrayList8.iterator();
                                                            it4.getClass();
                                                            while (it4.hasNext()) {
                                                                Object next3 = it4.next();
                                                                next3.getClass();
                                                                C3958e c3958e = (C3958e) next3;
                                                                int iIntValue4 = ((Number) c3958e.f12961g).intValue();
                                                                String strM6684e = (String) c3958e.f12962h;
                                                                if (strM6684e == null || AbstractC3149m.m6721t0(strM6684e)) {
                                                                    arrayList3 = list;
                                                                } else {
                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                    char c12 = c10;
                                                                    for (?? r14 = z13; r14 < c12; r14++) {
                                                                        strM6684e = new C3147k("&#(x[0-9a-fA-F]+|[0-9]+);").m6684e(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(strM6684e, "&lt;", "<", z13), "&gt;", ">", z13), "&quot;", "\"", z13), "&apos;", "'", z13), "&amp;", "&", z13), new C0178b(23));
                                                                        z13 = false;
                                                                        c12 = 2;
                                                                    }
                                                                    String strM1966s = C0762h.m1966s(strM6684e);
                                                                    if (strM1966s.length() != 0) {
                                                                        C0762h.m1953b(strM1966s, linkedHashSet2);
                                                                        Pattern patternCompile = Pattern.compile("<[^>]+>");
                                                                        patternCompile.getClass();
                                                                        String strReplaceAll = patternCompile.matcher(strM1966s).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
                                                                        strReplaceAll.getClass();
                                                                        Pattern patternCompile2 = Pattern.compile("\\{\\{[^}]+}}");
                                                                        patternCompile2.getClass();
                                                                        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
                                                                        strReplaceAll2.getClass();
                                                                        String strM1966s2 = C0762h.m1966s(strReplaceAll2);
                                                                        if (!AbstractC1416l.m3825a(strM1966s2, strM1966s)) {
                                                                            C0762h.m1953b(strM1966s2, linkedHashSet2);
                                                                        }
                                                                    }
                                                                    arrayList3 = new ArrayList();
                                                                    for (Object obj7 : linkedHashSet2) {
                                                                        if (!AbstractC3149m.m6721t0((String) obj7)) {
                                                                            arrayList3.add(obj7);
                                                                        }
                                                                    }
                                                                }
                                                                for (String str5 : arrayList3) {
                                                                    Integer num2 = (Integer) linkedHashMap.get(str5);
                                                                    if (num2 == null || iIntValue4 < num2.intValue()) {
                                                                        linkedHashMap.put(str5, Integer.valueOf(iIntValue4));
                                                                    }
                                                                }
                                                                z13 = false;
                                                                c10 = 2;
                                                            }
                                                            Set setEntrySet = linkedHashMap.entrySet();
                                                            setEntrySet.getClass();
                                                            List<Map.Entry> listM8402K1 = AbstractC4166m.m8402K1(setEntrySet, new C0415a0(new C0031h(8), i13));
                                                            arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM8402K1));
                                                            for (Map.Entry entry : listM8402K1) {
                                                                Object key = entry.getKey();
                                                                key.getClass();
                                                                Object value = entry.getValue();
                                                                value.getClass();
                                                                arrayList2.add(new C0758d((String) key, ((Number) value).intValue()));
                                                            }
                                                        } else {
                                                            arrayList2 = list;
                                                        }
                                                        if (arrayList2.isEmpty()) {
                                                            c0760f2 = null;
                                                            if (c0760f2 == null) {
                                                                if (weChatMessage.isText()) {
                                                                    ArrayList arrayList9 = new ArrayList();
                                                                    C0762h.m1958g(view2, arrayList9);
                                                                    c0760f2 = (C0760f) AbstractC4166m.m8424v1(AbstractC4166m.m8402K1(arrayList9, new C0761g(new C0761g(c0762h, view2), c0762h, 2)));
                                                                } else {
                                                                    c0760f2 = null;
                                                                }
                                                            }
                                                        } else {
                                                            ArrayList arrayList10 = new ArrayList();
                                                            C0762h.m1956e(view2, arrayList2, true, arrayList10);
                                                            if (arrayList10.isEmpty()) {
                                                                i10 = 0;
                                                                C0762h.m1956e(view2, arrayList2, false, arrayList10);
                                                            } else {
                                                                i10 = 0;
                                                            }
                                                            C0759e c0759e = (C0759e) AbstractC4166m.m8424v1(AbstractC4166m.m8402K1(arrayList10, new C0415a0(new C0761g(new C0415a0(new C0031h(i13), 3), c0762h, i10), 4)));
                                                            if (c0759e != null) {
                                                                c0760f2 = c0759e.f2267a;
                                                            }
                                                            if (c0760f2 == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            List listM99x0 = c0760f2 != null ? AbstractC0000a.m99x0(c0760f2) : null;
                                            if (listM99x0 != null) {
                                                list = listM99x0;
                                            }
                                        }
                                        if (list.isEmpty()) {
                                            return;
                                        }
                                        boolean zIsOutgoing = weChatMessage.isOutgoing();
                                        Context context = view2.getContext();
                                        context.getClass();
                                        boolean z14 = (context.getResources().getConfiguration().uiMode & 48) == 32;
                                        String str6 = (zIsOutgoing && z14) ? "message_text_color_right_dark" : zIsOutgoing ? "message_text_color_right_light" : z14 ? "message_text_color_left_dark" : "message_text_color_left_light";
                                        String str7 = "#FF000000";
                                        if ((!zIsOutgoing || !z14) && !zIsOutgoing && z14) {
                                            str7 = "#FFFFFFFF";
                                        }
                                        String string = sharedPreferences.getString(str6, str7);
                                        if (string == null) {
                                            string = str7;
                                        }
                                        C0757c c0757cM1968u = C0762h.m1968u(string);
                                        if (c0757cM1968u == null) {
                                            c0757cM1968u = C0762h.m1968u(str7);
                                        }
                                        if (c0757cM1968u != null) {
                                            String strBodyContent3 = weChatMessage.bodyContent();
                                            boolean z15 = weChatMessage.isQuote() || (weChatMessage.isText() && (AbstractC3149m.m6710i0(strBodyContent3, '#') || AbstractC3149m.m6710i0(strBodyContent3, (char) 65283)));
                                            for (C0760f c0760f3 : list) {
                                                if (z15) {
                                                    z9 = true;
                                                } else {
                                                    CharSequence charSequenceM1972y = C0762h.m1972y(c0760f3.f2270a, c0760f3.f2271b);
                                                    Spanned spanned = charSequenceM1972y instanceof Spanned ? (Spanned) charSequenceM1972y : null;
                                                    if (spanned == null) {
                                                        z9 = true;
                                                        z11 = false;
                                                        z12 = false;
                                                    } else if (spanned.length() == 0) {
                                                        z9 = true;
                                                        z11 = false;
                                                        z12 = false;
                                                    } else {
                                                        z11 = false;
                                                        Object[] spans = spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                                                        spans.getClass();
                                                        boolean z16 = spans.length == 0;
                                                        z9 = true;
                                                        z12 = !z16;
                                                    }
                                                    if (!z12) {
                                                        z10 = z11;
                                                    }
                                                    view = c0760f3.f2270a;
                                                    TextView textView = c0760f3.f2271b;
                                                    C0762h.m1955d(view);
                                                    ColorStateList textColors = textView.getTextColors();
                                                    textColors.getClass();
                                                    ColorStateList linkTextColors = textView.getLinkTextColors();
                                                    linkTextColors.getClass();
                                                    C0756b c0756b = new C0756b(textColors, linkTextColors, textView.getPaint().linkColor, textView.getPaint().getShader(), c0757cM1968u.f2262a);
                                                    view.setTag(R.id.hchat_message_text_color_applied, Boolean.TRUE);
                                                    view.setTag(R.id.hchat_message_text_color_original, c0756b);
                                                    int i14 = c0757cM1968u.f2262a;
                                                    view.setTag(R.id.hchat_message_text_color_value, Integer.valueOf(i14));
                                                    if (C0762h.m1961m(view)) {
                                                        KavaReflector.invokeMethod(view, "setTextColor", Integer.valueOf(i14));
                                                    }
                                                    textView.setTextColor(i14);
                                                    textView.invalidate();
                                                    view.invalidate();
                                                    textView.setLinkTextColor(i14);
                                                    if (C0762h.m1961m(view)) {
                                                        KavaReflector.invokeMethod(view, "setLinkTextColor", Integer.valueOf(i14));
                                                    }
                                                    if (!c0757cM1968u.f2264c || z10) {
                                                        c0762h.m1974B(view, textView, c0757cM1968u, c0756b);
                                                    }
                                                }
                                                z10 = z9;
                                                view = c0760f3.f2270a;
                                                TextView textView2 = c0760f3.f2271b;
                                                C0762h.m1955d(view);
                                                ColorStateList textColors2 = textView2.getTextColors();
                                                textColors2.getClass();
                                                ColorStateList linkTextColors2 = textView2.getLinkTextColors();
                                                linkTextColors2.getClass();
                                                C0756b c0756b2 = new C0756b(textColors2, linkTextColors2, textView2.getPaint().linkColor, textView2.getPaint().getShader(), c0757cM1968u.f2262a);
                                                view.setTag(R.id.hchat_message_text_color_applied, Boolean.TRUE);
                                                view.setTag(R.id.hchat_message_text_color_original, c0756b2);
                                                int i142 = c0757cM1968u.f2262a;
                                                view.setTag(R.id.hchat_message_text_color_value, Integer.valueOf(i142));
                                                if (C0762h.m1961m(view)) {
                                                }
                                                textView2.setTextColor(i142);
                                                textView2.invalidate();
                                                view.invalidate();
                                                textView2.setLinkTextColor(i142);
                                                if (C0762h.m1961m(view)) {
                                                }
                                                if (!c0757cM1968u.f2264c) {
                                                }
                                                c0762h.m1974B(view, textView2, c0757cM1968u, c0756b2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private final void m897c(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objM8391z0;
        methodHookParam.getClass();
        Object result = methodHookParam.getResult();
        C0840k c0840k = null;
        c0840k = null;
        Notification notification = result instanceof Notification ? (Notification) result : null;
        if (notification != null) {
            AtomicBoolean atomicBoolean = C0846q.f2580a;
            Method method = (Method) this.f536b;
            Object[] objArr = methodHookParam.args;
            if (objArr == null) {
                objArr = new Object[0];
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (C0846q.m2127l(parameterTypes)) {
                Object objM8366C0 = AbstractC4165l.m8366C0(4, objArr);
                String string = objM8366C0 != null ? objM8366C0.toString() : null;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Object objM8366C02 = AbstractC4165l.m8366C0(5, objArr);
                String string2 = objM8366C02 != null ? objM8366C02.toString() : null;
                if (string2 == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Object objM8366C03 = AbstractC4165l.m8366C0(6, objArr);
                String string3 = objM8366C03 != null ? objM8366C03.toString() : null;
                if (string3 == null) {
                    string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Object objM8366C04 = AbstractC4165l.m8366C0(14, objArr);
                String string4 = objM8366C04 != null ? objM8366C04.toString() : null;
                if (string4 != null) {
                    str = string4;
                }
                c0840k = new C0840k(string, string2, string3, str);
            } else if (C0846q.m2130o(parameterTypes) && (objM8391z0 = AbstractC4165l.m8391z0(objArr)) != null) {
                c0840k = new C0840k(C0846q.m2139x(objM8391z0, "e"), C0846q.m2139x(objM8391z0, "f"), C0846q.m2139x(objM8391z0, "g"), C0846q.m2139x(objM8391z0, "o"));
            }
            if (c0840k != null) {
                String str2 = c0840k.f2552a;
                if (notification.extras == null) {
                    notification.extras = new Bundle();
                }
                String str3 = c0840k.f2555d;
                String str4 = c0840k.f2554c;
                String str5 = c0840k.f2553b;
                if (!AbstractC3149m.m6721t0(str2)) {
                    notification.extras.putString("hchat_custom_notification_native_title", str2);
                }
                if (!AbstractC3149m.m6721t0(str5)) {
                    notification.extras.putString("hchat_custom_notification_native_text", str5);
                }
                if (!AbstractC3149m.m6721t0(str4)) {
                    notification.extras.putString("hchat_custom_notification_native_summary", str4);
                }
                if (AbstractC3149m.m6721t0(str3)) {
                    return;
                }
                notification.extras.putString("hchat_custom_notification_talker", str3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final void m898d(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.getClass();
        final C1687k c1687k = (C1687k) this.f536b;
        final Object obj = methodHookParam.thisObject;
        Object[] objArr = methodHookParam.args;
        c1687k.getClass();
        if (obj == null) {
            return;
        }
        Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(1, objArr) : null;
        Number number = objM8366C0 instanceof Number ? (Number) objM8366C0 : null;
        final int iIntValue = number != null ? number.intValue() : -1;
        Object objM8366C02 = objArr != null ? AbstractC4165l.m8366C0(2, objArr) : null;
        Number number2 = objM8366C02 instanceof Number ? (Number) objM8366C02 : null;
        final int iIntValue2 = number2 != null ? number2.intValue() : -1;
        c1687k.f5602c.post(new Runnable() { // from class: hb.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                C1683i c1683i;
                C1687k c1687k2 = c1687k;
                if (obj == c1687k2.f5607h && (c1683i = c1687k2.f5606g) != null) {
                    RunnableC0217c runnableC0217c = c1687k2.f5608i;
                    if (runnableC0217c != null) {
                        c1687k2.f5602c.removeCallbacks(runnableC0217c);
                    }
                    c1687k2.f5608i = null;
                    c1687k2.f5607h = null;
                    c1687k2.m4297a(c1683i, iIntValue == 0 && iIntValue2 == 0);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final void m899e(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object objM8366C0;
        methodHookParam.getClass();
        if (!((SharedPreferences) ((C1671c) this.f536b).f5522i).getBoolean("multi_recall_enable", false) || C1671c.m4267t(AbstractC2338b.m5564b(methodHookParam.thisObject)) == null || (objArr = methodHookParam.args) == null || (objM8366C0 = AbstractC4165l.m8366C0(0, objArr)) == null || KavaReflector.invokeMethod(objM8366C0, "findItem", 1212371523) != null) {
            return;
        }
        Object objInvokeMethod = KavaReflector.invokeMethod(objM8366C0, "add", 0, 1212371523, 0, "批量撤回[H]");
        if (objInvokeMethod == null) {
            objInvokeMethod = KavaReflector.invokeMethod(objM8366C0, "add", 0, 1212371523, 0, "批量撤回[H]");
        }
        if (objInvokeMethod == null && KavaReflector.invokeMethod(objM8366C0, "f", 1212371523, "批量撤回[H]") == null) {
            KavaReflector.invokeMethod(objM8366C0, "f", 1212371523, "批量撤回[H]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final void m900f(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.getClass();
        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) ((C2911c) this.f536b).f9407d.remove(methodHookParam.thisObject);
        if (interfaceC1231l != null) {
            Object[] objArr = methodHookParam.args;
            objArr.getClass();
            Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
            Number number = objM8366C0 instanceof Number ? (Number) objM8366C0 : null;
            int iIntValue = number != null ? number.intValue() : -1;
            Object[] objArr2 = methodHookParam.args;
            objArr2.getClass();
            Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr2);
            String str = objM8366C02 instanceof String ? (String) objM8366C02 : null;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Object[] objArr3 = methodHookParam.args;
            objArr3.getClass();
            Object objM8366C03 = AbstractC4165l.m8366C0(2, objArr3);
            interfaceC1231l.invoke(new C2910b(iIntValue, str, objM8366C03 instanceof JSONObject ? (JSONObject) objM8366C03 : null));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final void m901g(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        Object obj;
        Object c3959f;
        methodHookParam.getClass();
        C3353e0 c3353e0 = (C3353e0) this.f536b;
        Object obj2 = c3353e0.f10803g.get();
        Boolean bool = Boolean.TRUE;
        if (AbstractC1416l.m3825a(obj2, bool) || !AbstractC1416l.m3825a(methodHookParam.getResult(), bool) || (objArr = methodHookParam.args) == null) {
            return;
        }
        int length = objArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Object obj3 = objArr[i9];
            if (AbstractC1416l.m3825a(obj3 != null ? obj3.getClass().getName() : null, "com.tencent.mm.plugin.sns.storage.SnsInfo")) {
                obj = obj3;
                break;
            }
            i9++;
        }
        if (obj == null || AbstractC1416l.m3825a(KavaReflector.invokeMethod(obj, "isAd", new Object[0]), Boolean.TRUE)) {
            return;
        }
        Iterator it = c3353e0.f10802f.iterator();
        while (it.hasNext()) {
            try {
                ((C1634c) it.next()).m4159b(obj);
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c3353e0.f10800d.invoke("朋友圈入库观察回调失败: " + thM8182b.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final void m902h(XC_MethodHook.MethodHookParam methodHookParam) {
        C3774x c3774x;
        Object c3959f;
        methodHookParam.getClass();
        ArrayDeque arrayDeque = (ArrayDeque) ((C3752d0) this.f536b).f12184A.get();
        if (arrayDeque == null || (c3774x = (C3774x) arrayDeque.pollLast()) == null) {
            c3774x = new C3774x(null);
        }
        if (arrayDeque != null && arrayDeque.isEmpty()) {
            ((C3752d0) this.f536b).f12184A.remove();
        }
        if (((C3752d0) this.f536b).f12185B.f12352a) {
            try {
                c3959f = Boolean.valueOf(((C3752d0) this.f536b).m7839g(0, methodHookParam.thisObject, c3774x.f12346a, methodHookParam.args));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            C3752d0 c3752d0 = (C3752d0) this.f536b;
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c3752d0.f12191b.invoke("消息显示时间绑定失败", thM8182b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final void m903i(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object obj2;
        Boolean boolValueOf;
        Object obj3;
        C3945a c3945aM8168a;
        Integer num;
        methodHookParam.getClass();
        C3946b c3946b = (C3946b) this.f536b;
        Object[] objArr = methodHookParam.args;
        c3946b.getClass();
        if (objArr == null || objArr.length != 4) {
            return;
        }
        int length = objArr.length;
        int i9 = 0;
        while (true) {
            obj = null;
            if (i9 >= length) {
                obj2 = null;
                break;
            }
            obj2 = objArr[i9];
            if (obj2 != null && AbstractC0921a.m2263z("com.tencent.mm.storage.", obj2, false)) {
                break;
            } else {
                i9++;
            }
        }
        if (obj2 != null) {
            Object obj4 = objArr[2];
            String str = obj4 instanceof String ? (String) obj4 : null;
            C1360a c1360aAccount = WeChatApis.account();
            String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
            if (strM3652c == null) {
                strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(strM3652c) || str == null || AbstractC3149m.m6721t0(str)) {
                String[] strArr = {"getIsSend", "isSend"};
                int i10 = 0;
                while (true) {
                    if (i10 >= 2) {
                        String[] strArr2 = {"field_isSend", "isSend"};
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 2) {
                                boolValueOf = null;
                                break;
                            }
                            Boolean boolM8167d = C3946b.m8167d(KavaReflector.readField(obj2, strArr2[i11]));
                            if (boolM8167d != null) {
                                boolValueOf = boolM8167d;
                                break;
                            }
                            i11++;
                        }
                    } else {
                        Boolean boolM8167d2 = C3946b.m8167d(KavaReflector.invoke(KavaReflector.findMethod(obj2.getClass(), strArr[i10], new Class[0]), obj2, new Object[0]));
                        if (boolM8167d2 != null) {
                            boolValueOf = boolM8167d2;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                boolValueOf = Boolean.valueOf(strM3652c.equals(str));
            }
            if (boolValueOf != null) {
                boolean zBooleanValue = boolValueOf.booleanValue();
                SharedPreferences sharedPreferences = c3946b.f12939b;
                boolean z9 = zBooleanValue ? sharedPreferences.getBoolean("hide_chat_avatar_self", false) : sharedPreferences.getBoolean("hide_chat_avatar_other", false);
                int length2 = objArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length2) {
                        obj3 = objArr[i12];
                        if (obj3 != null && c3946b.m8168a(obj3.getClass()) != null) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                if (obj3 == null || (c3945aM8168a = c3946b.m8168a(obj3.getClass())) == null) {
                    return;
                }
                Object field = KavaReflector.readField(c3945aM8168a.f12936a, obj3);
                View view = field instanceof View ? (View) field : null;
                if (view != null) {
                    Object field2 = KavaReflector.readField(c3945aM8168a.f12937b, obj3);
                    View view2 = field2 instanceof View ? (View) field2 : null;
                    Object parent = view.getParent();
                    C3010h c3010h = new C3010h(new C3011i(AbstractC4165l.m8376k0(new View[]{view2, parent instanceof View ? (View) parent : null}), false, new C1955z(29)));
                    while (true) {
                        if (!c3010h.hasNext()) {
                            break;
                        }
                        Object next = c3010h.next();
                        if (((View) next).getClass().getName().equals("com.tencent.mm.ui.base.MaskLayout")) {
                            obj = next;
                            break;
                        }
                    }
                    View view3 = (View) obj;
                    if (view3 == null) {
                        if (z9) {
                            view.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if (layoutParams != null) {
                        Map map = c3946b.f12943f;
                        if (!z9) {
                            map.getClass();
                            synchronized (map) {
                                num = (Integer) c3946b.f12943f.remove(view3);
                            }
                            if (num == null || layoutParams.width == num.intValue()) {
                                return;
                            }
                            layoutParams.width = num.intValue();
                            view3.setLayoutParams(layoutParams);
                            return;
                        }
                        map.getClass();
                        synchronized (map) {
                            if (!c3946b.f12943f.containsKey(view3)) {
                                Map map2 = c3946b.f12943f;
                                map2.getClass();
                                map2.put(view3, Integer.valueOf(layoutParams.width));
                            }
                        }
                        if (layoutParams.width != 0) {
                            layoutParams.width = 0;
                            view3.setLayoutParams(layoutParams);
                        }
                        view.setVisibility(8);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    private final void m904j(XC_MethodHook.MethodHookParam methodHookParam) {
        String string;
        methodHookParam.getClass();
        C0184c c0184c = (C0184c) this.f536b;
        Object[] objArr = methodHookParam.args;
        Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(0, objArr) : null;
        SharedPreferences sharedPreferences = (SharedPreferences) c0184c.f470b;
        if (objM8366C0 == null || !sharedPreferences.getBoolean("hide_chat_menu_enable", false)) {
            return;
        }
        Set setM7882Y = AbstractC3754e0.m7882Y(sharedPreferences.getString("hide_chat_menu_titles", "提醒,搜一搜,收藏"));
        if (setM7882Y.isEmpty()) {
            return;
        }
        Object objInvokeMethod = KavaReflector.invokeMethod(objM8366C0, "size", new Object[0]);
        Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
        if (number != null) {
            int iIntValue = number.intValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i9 = 0; i9 < iIntValue; i9++) {
                Object objInvokeMethod2 = KavaReflector.invokeMethod(objM8366C0, "getItem", Integer.valueOf(i9));
                MenuItem menuItem = objInvokeMethod2 instanceof MenuItem ? (MenuItem) objInvokeMethod2 : null;
                if (menuItem != null) {
                    CharSequence title = menuItem.getTitle();
                    String string2 = (title == null || (string = title.toString()) == null) ? null : AbstractC3149m.m6703R0(string).toString();
                    if (string2 == null) {
                        string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (setM7882Y.contains(string2)) {
                        linkedHashSet.add(Integer.valueOf(menuItem.getItemId()));
                    }
                }
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                KavaReflector.invokeMethod(objM8366C0, "removeItem", Integer.valueOf(((Number) it.next()).intValue()));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:12:0x002e, B:14:0x0032, B:17:0x0038, B:20:0x0042, B:24:0x0051, B:30:0x005f, B:32:0x0069, B:35:0x0073, B:42:0x0084, B:55:0x00b6, B:61:0x00d9, B:64:0x00e4, B:68:0x0113, B:70:0x011c, B:72:0x012c, B:77:0x013b, B:85:0x014e, B:87:0x0152, B:89:0x0158, B:91:0x0162, B:23:0x004d), top: B:101:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m905k(XC_MethodHook.MethodHookParam methodHookParam) {
        int i9;
        String str;
        C4695f c4695f;
        Class<?> cls;
        boolean z9;
        Object objM9219i;
        byte[] bArrM9221u;
        final C4696g c4696g = (C4696g) this.f536b;
        ConcurrentHashMap concurrentHashMap = c4696g.f15691g;
        DexFinder dexFinder = c4696g.f15686b;
        SharedPreferences sharedPreferences = c4696g.f15687c;
        boolean z10 = sharedPreferences != null && sharedPreferences.getBoolean("protobuf_packet_enable", false);
        boolean zIsEmpty = AbstractC4699j.f15697c.isEmpty();
        if (z10 || !zIsEmpty) {
            try {
                Object[] objArr = methodHookParam.args;
                if (objArr != null && objArr.length >= 3) {
                    final Object obj = objArr[1];
                    final Object obj2 = objArr[2];
                    if (obj == null) {
                        return;
                    }
                    Object objM9217e = C4696g.m9217e(obj, "getUri");
                    String strValueOf = objM9217e == null ? HttpUrl.FRAGMENT_ENCODE_SET : String.valueOf(objM9217e);
                    if (strValueOf.length() == 0) {
                        strValueOf = "null";
                    }
                    String str2 = strValueOf;
                    Object objM9217e2 = C4696g.m9217e(obj, "getType");
                    int iIntValue = objM9217e2 instanceof Number ? ((Number) objM9217e2).intValue() : -1;
                    boolean z11 = z10 && c4696g.m9230n(iIntValue);
                    if (z11 && zIsEmpty) {
                        return;
                    }
                    Object obj3 = methodHookParam.thisObject;
                    try {
                        objM9219i = C4696g.m9219i(C4696g.m9217e(obj, "getReqObj"));
                        bArrM9221u = C4696g.m9221u(objM9219i);
                    } catch (Throwable unused) {
                    }
                    if (objM9219i != null && bArrM9221u != null) {
                        int i10 = iIntValue;
                        try {
                            c4695f = new C4695f(str2, i10, obj3, objM9219i, bArrM9221u);
                            str = str2;
                            i9 = i10;
                        } catch (Throwable unused2) {
                            str = str2;
                            i9 = i10;
                            c4695f = null;
                        }
                        if (c4695f != null) {
                            concurrentHashMap.put(c4695f.m9214a(), c4695f);
                            if (concurrentHashMap.size() > 60) {
                                try {
                                    concurrentHashMap.remove((String) concurrentHashMap.keySet().iterator().next());
                                } catch (Throwable unused3) {
                                }
                            }
                            if (!zIsEmpty) {
                                C4696g.m9216c("request", str, i9, c4695f.f15683e);
                            }
                            if (z10 && !z11) {
                                c4696g.m9231p("快照保存: type=" + i9 + " uri=" + str + " req=" + c4695f.f15682d.getClass().getName());
                            }
                            if (z10 && !z11 && ((sharedPreferences == null || sharedPreferences.getBoolean("protobuf_packet_capture_request", true)) && c4696g.m9235t("req|".concat(c4695f.m9214a()), c4695f.f15683e))) {
                                c4696g.m9232q("请求", str, i9, c4695f.f15683e);
                            }
                        }
                        if (zIsEmpty) {
                            if (!z10 || z11) {
                                return;
                            }
                            if (sharedPreferences != null) {
                                z9 = true;
                                if (!sharedPreferences.getBoolean("protobuf_packet_capture_response", true)) {
                                    z9 = false;
                                }
                            } else {
                                z9 = true;
                            }
                            if (!z9) {
                                return;
                            }
                        }
                        if (obj2 != null || dexFinder == null || (cls = dexFinder.protobufOnGYNetEndClass) == null || !cls.isInterface() || Proxy.isProxyClass(obj2.getClass())) {
                            return;
                        }
                        final String str3 = str;
                        final int i11 = i9;
                        methodHookParam.args[2] = Proxy.newProxyInstance(dexFinder.protobufOnGYNetEndClass.getClassLoader(), new Class[]{dexFinder.protobufOnGYNetEndClass}, new InvocationHandler() { // from class: wa.d
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
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
                            @Override // java.lang.reflect.InvocationHandler
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj4, Method method, Object[] objArr2) {
                                byte[] bArrM9221u2;
                                C4696g c4696g2 = c4696g;
                                SharedPreferences sharedPreferences2 = c4696g2.f15687c;
                                boolean zEquals = "hashCode".equals(method.getName());
                                Object obj5 = obj2;
                                if (zEquals) {
                                    return Integer.valueOf(obj5.hashCode());
                                }
                                if ("toString".equals(method.getName())) {
                                    return obj5.toString();
                                }
                                Object obj6 = null;
                                byte[] bArrM9221u3 = null;
                                obj6 = null;
                                if ("equals".equals(method.getName())) {
                                    if (objArr2 != null && objArr2.length > 0) {
                                        obj6 = objArr2[0];
                                    }
                                    return Boolean.valueOf(obj5 == obj6);
                                }
                                if ("onGYNetEnd".equals(method.getName())) {
                                    boolean zIsEmpty2 = AbstractC4699j.f15697c.isEmpty();
                                    int i12 = i11;
                                    boolean z12 = sharedPreferences2 != null && sharedPreferences2.getBoolean("protobuf_packet_enable", false) && (sharedPreferences2 == null || sharedPreferences2.getBoolean("protobuf_packet_capture_response", true)) && !c4696g2.m9230n(i12);
                                    if (!zIsEmpty2 || z12) {
                                        if (objArr2 != null) {
                                            try {
                                                Object obj7 = objArr2.length > 4 ? objArr2[4] : null;
                                                if (obj7 == null) {
                                                    obj7 = obj;
                                                }
                                                try {
                                                    bArrM9221u2 = C4696g.m9221u(C4696g.m9219i(C4696g.m9217e(obj7, "getRespObj")));
                                                } catch (Throwable unused4) {
                                                }
                                                if (bArrM9221u2 != null) {
                                                    bArrM9221u3 = bArrM9221u2;
                                                } else {
                                                    try {
                                                        bArrM9221u3 = C4696g.m9221u(C4696g.m9219i(KavaReflector.readField(obj7, "b")));
                                                    } catch (Throwable unused5) {
                                                    }
                                                }
                                                if (bArrM9221u3 != null) {
                                                    String str4 = str3;
                                                    if (!zIsEmpty2) {
                                                        C4696g.m9216c("response", str4, i12, bArrM9221u3);
                                                    }
                                                    if (z12) {
                                                        if (c4696g2.m9235t("resp|" + i12 + "|" + str4, bArrM9221u3)) {
                                                            c4696g2.m9232q("响应", str4, i12, bArrM9221u3);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                C4696g.m9218h("响应抓包失败: " + th2.getMessage());
                                            }
                                        }
                                    }
                                }
                                if (objArr2 == null) {
                                    objArr2 = new Object[0];
                                }
                                return KavaReflector.invoke(method, obj5, objArr2);
                            }
                        });
                        return;
                    }
                    i9 = iIntValue;
                    str = str2;
                    c4695f = null;
                    if (c4695f != null) {
                    }
                    if (zIsEmpty) {
                    }
                    if (obj2 != null) {
                    }
                }
            } catch (Throwable th2) {
                C4696g.m9218h("dispatch处理失败: " + th2.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0297 A[PHI: r34
  0x0297: PHI (r34v2 int) = (r34v6 int), (r34v8 int) binds: [B:171:0x0295, B:167:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a8 A[PHI: r34
  0x02a8: PHI (r34v5 int) = (r34v2 int), (r34v6 int) binds: [B:175:0x02a5, B:171:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0447 A[LOOP:2: B:233:0x0376->B:305:0x0447, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x046b A[PHI: r24
  0x046b: PHI (r24v5 boolean) = (r24v0 boolean), (r24v0 boolean), (r24v0 boolean), (r24v7 boolean) binds: [B:469:0x06b9, B:479:0x06d5, B:356:0x04f8, B:315:0x0469] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x0453 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objM8366C0;
        View viewM913e;
        long jM907j;
        C0228h c0228h;
        Object tag;
        Object objM946w;
        int i9;
        boolean z9;
        boolean z10;
        int iOrdinal;
        boolean z11;
        View view;
        View view2;
        List listM99x0;
        Class<Object> cls;
        Class<?> cls2;
        Object next;
        Iterator it;
        Class<?> cls3;
        Object next2;
        View viewFindViewById;
        ArrayList arrayList;
        List<View> list;
        Boolean bool;
        Boolean boolValueOf;
        boolean zBooleanValue;
        boolean z12;
        boolean z13;
        List listM99x02;
        boolean z14;
        boolean z15;
        C0229i c0229i;
        boolean z16;
        List<C0232l> list2;
        Integer num;
        ArrayList arrayList2;
        int i10;
        C0231k c0231k;
        C0237q c0237q;
        Integer num2;
        boolean z17;
        boolean z18;
        boolean z19;
        Integer numM933r;
        View view3;
        Object next3;
        String string;
        CharSequence text;
        String strM932q;
        boolean z20;
        Object objM934s;
        C0248j c0248j;
        String strM3180G;
        Object c3959f;
        int i11 = this.f535a;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        Object obj = this.f536b;
        switch (i11) {
            case 0:
                methodHookParam.getClass();
                C0220f c0220f = (C0220f) obj;
                Object[] objArr = methodHookParam.args;
                Map map = c0220f.f538b;
                String string2 = c0220f.f539c.getString("chat_time_mode", "original");
                String str2 = "custom";
                if (!AbstractC1416l.m3825a(string2, "custom")) {
                    str2 = "hidden";
                    if (!AbstractC1416l.m3825a(string2, "hidden")) {
                        str2 = "original";
                    }
                }
                if (objArr == null) {
                    objM8366C0 = null;
                } else {
                    objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
                    if (objM8366C0 == null) {
                        for (Object obj2 : objArr) {
                            if (obj2 != null && c0220f.m913e(obj2) != null) {
                                objM8366C0 = obj2;
                            }
                        }
                        objM8366C0 = null;
                    } else {
                        if (c0220f.m913e(objM8366C0) == null) {
                            objM8366C0 = null;
                        }
                        if (objM8366C0 == null) {
                        }
                    }
                }
                if (objM8366C0 != null && (viewM913e = c0220f.m913e(objM8366C0)) != null) {
                    Object tag2 = viewM913e.getTag();
                    if (tag2 == null) {
                        tag2 = objM8366C0;
                    }
                    TextView textViewM914f = c0220f.m914f(tag2);
                    if (textViewM914f != null || (textViewM914f = c0220f.m914f(objM8366C0)) != null) {
                        if (str2.equals("original")) {
                            map.remove(textViewM914f);
                        } else {
                            Object objM8366C02 = objArr != null ? AbstractC4165l.m8366C0(1, objArr) : null;
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                            setNewSetFromMap.getClass();
                            Object objM909l = C0220f.m909l(0, objM8366C02, setNewSetFromMap);
                            if (objM909l != null) {
                                jM907j = C0220f.m907j(objM909l);
                            } else {
                                Set setNewSetFromMap2 = Collections.newSetFromMap(new IdentityHashMap());
                                setNewSetFromMap2.getClass();
                                Object objM909l2 = C0220f.m909l(0, objArr, setNewSetFromMap2);
                                jM907j = objM909l2 != null ? C0220f.m907j(objM909l2) : 0L;
                            }
                            CharSequence text2 = textViewM914f.getText();
                            String string3 = text2 != null ? text2.toString() : null;
                            C0218d c0218d = new C0218d(textViewM914f.getVisibility(), string3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string3, jM907j);
                            map.getClass();
                            map.put(textViewM914f, c0218d);
                            c0220f.m910a(textViewM914f, c0218d, str2);
                        }
                        break;
                    }
                }
                break;
            case 1:
                methodHookParam.getClass();
                C0233m c0233m = (C0233m) obj;
                ArrayDeque arrayDeque = (ArrayDeque) c0233m.f605l.get();
                if (arrayDeque != null && (c0228h = (C0228h) arrayDeque.pollLast()) != null) {
                    View view4 = c0228h.f567a;
                    if (arrayDeque.isEmpty()) {
                        c0233m.f605l.remove();
                    }
                    if (view4 == null || (tag = view4.getTag()) == null) {
                        tag = c0228h.f568b;
                    } else {
                        if (!AbstractC0921a.m2263z("com.tencent.mm.ui.chatting.viewitems.", tag, false)) {
                            tag = null;
                        }
                        if (tag == null) {
                        }
                    }
                    Object[] objArr2 = methodHookParam.args;
                    SharedPreferences sharedPreferences = c0233m.f595b;
                    if (view4 != null) {
                        if (objArr2 != null) {
                            int length = objArr2.length;
                            for (int i12 = 1; i12 < length; i12++) {
                                Object obj3 = objArr2[i12];
                                Set setNewSetFromMap3 = Collections.newSetFromMap(new WeakHashMap());
                                setNewSetFromMap3.getClass();
                                objM946w = c0233m.m946w(0, obj3, setNewSetFromMap3);
                                if (objM946w == null) {
                                }
                            }
                            objM946w = null;
                        } else {
                            objM946w = null;
                        }
                        Integer numM933r2 = objM946w != null ? C0233m.m933r(C0233m.m934s(objM946w, "getType", "field_type", "type")) : null;
                        String string4 = (objM946w == null || (objM934s = C0233m.m934s(objM946w, "getContent", "field_content", "content")) == null) ? null : objM934s.toString();
                        if (string4 == null) {
                            string4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (numM933r2 != null) {
                            int iIntValue = numM933r2.intValue();
                            if (iIntValue <= 0) {
                                i9 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            } else {
                                i9 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                int i13 = iIntValue & 255;
                                int i14 = iIntValue & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                if ((iIntValue >>> 16) != 0) {
                                    if (i14 == 10000 || i14 == 10002) {
                                        iIntValue = i14;
                                    } else if (i13 != 0 && i14 == i13) {
                                        iIntValue = i13;
                                    }
                                }
                            }
                            if (iIntValue == 49) {
                                z9 = C0233m.f588r.m6682a(string4) || AbstractC3149m.m6709h0(string4, "<refermsg", true);
                            }
                            boolean z21 = numM933r2 == null && C0233m.m930n(numM933r2.intValue());
                            boolean z22 = numM933r2 == null && C0233m.f591u.contains(numM933r2);
                            if (numM933r2 != null) {
                                if (!(AbstractC1184v0.m3179F(numM933r2.intValue()) == 1)) {
                                    if (!(AbstractC1184v0.m3179F(numM933r2.intValue()) == 34) && !z21 && !C0233m.f585o.contains(numM933r2) && ((!z9 || C0233m.m928k(numM933r2, string4)) && (iOrdinal = C0233m.m937v(numM933r2, string4).ordinal()) != 1 && iOrdinal != 2)) {
                                        z10 = false;
                                    }
                                }
                                z10 = true;
                            }
                            if (!z10) {
                                C4173t c4173t = C4173t.f13710g;
                                if (z9) {
                                    Integer num3 = (Integer) c0233m.m942g().get("bkl");
                                    if (num3 != null) {
                                        int iIntValue2 = num3.intValue();
                                        ArrayList arrayList3 = new ArrayList();
                                        C0233m.m924c(view4, iIntValue2, arrayList3);
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj4 : arrayList3) {
                                            if (C0233m.m927j((View) obj4, view4)) {
                                                arrayList4.add(obj4);
                                            }
                                        }
                                        if (arrayList4.isEmpty()) {
                                            z11 = z9;
                                            view3 = null;
                                        } else {
                                            WeChatMessage.Companion.getClass();
                                            String strM932q2 = C0233m.m932q(C2529d.m5949o(string4, "title"));
                                            if (strM932q2.length() > 0) {
                                                Iterator it2 = arrayList4.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next3 = it2.next();
                                                        View view5 = (View) next3;
                                                        z11 = z9;
                                                        String str3 = str;
                                                        Object objInvokeMethod = KavaReflector.invokeMethod(view5, "getWrappedTextView", new Object[0]);
                                                        TextView textView = objInvokeMethod instanceof TextView ? (TextView) objInvokeMethod : null;
                                                        if (textView == null) {
                                                            textView = view5 instanceof TextView ? (TextView) view5 : null;
                                                        }
                                                        TextView textView2 = textView;
                                                        Object objInvokeMethod2 = KavaReflector.invokeMethod(view5, "a", new Object[0]);
                                                        if (objInvokeMethod2 == null) {
                                                            Object field = KavaReflector.readField(view5, "x");
                                                            if (field == null) {
                                                                CharSequence contentDescription = view5.getContentDescription();
                                                                string = contentDescription != null ? contentDescription.toString() : null;
                                                                if (string == null) {
                                                                    string = str3;
                                                                }
                                                                if (AbstractC3149m.m6721t0(string)) {
                                                                    string = (textView2 == null || (text = textView2.getText()) == null) ? null : text.toString();
                                                                    if (string == null) {
                                                                        string = str3;
                                                                    }
                                                                }
                                                                strM932q = C0233m.m932q(string);
                                                                if (AbstractC1416l.m3825a(strM932q, strM932q2)) {
                                                                    z20 = true;
                                                                    if (z20) {
                                                                        z9 = z11;
                                                                        str = str3;
                                                                    }
                                                                } else {
                                                                    if (!((strM932q2.length() < 2 || strM932q.length() > (strM932q2.length() * 3) + 12) ? false : AbstractC3149m.m6709h0(strM932q, strM932q2, false))) {
                                                                        z20 = false;
                                                                    }
                                                                    if (z20) {
                                                                    }
                                                                }
                                                            } else {
                                                                CharSequence charSequence = field instanceof CharSequence ? (CharSequence) field : null;
                                                                if (charSequence != null && (string = charSequence.toString()) != null) {
                                                                    if (AbstractC3149m.m6721t0(string)) {
                                                                        string = null;
                                                                    }
                                                                    if (string == null) {
                                                                    }
                                                                    strM932q = C0233m.m932q(string);
                                                                    if (AbstractC1416l.m3825a(strM932q, strM932q2)) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            CharSequence charSequence2 = objInvokeMethod2 instanceof CharSequence ? (CharSequence) objInvokeMethod2 : null;
                                                            if (charSequence2 != null && (string = charSequence2.toString()) != null) {
                                                                if (AbstractC3149m.m6721t0(string)) {
                                                                    string = null;
                                                                }
                                                                if (string == null) {
                                                                }
                                                                strM932q = C0233m.m932q(string);
                                                                if (AbstractC1416l.m3825a(strM932q, strM932q2)) {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        z11 = z9;
                                                        next3 = null;
                                                    }
                                                }
                                                view3 = (View) next3;
                                                if (view3 == null) {
                                                }
                                            } else {
                                                z11 = z9;
                                            }
                                            view3 = (View) AbstractC4166m.m8422t1(arrayList4);
                                        }
                                        listM99x0 = view3 != null ? AbstractC0000a.m99x0(view3) : null;
                                        if (listM99x0 == null) {
                                            listM99x0 = c4173t;
                                        }
                                    }
                                } else {
                                    z11 = z9;
                                    if (!z21) {
                                        ConcurrentHashMap concurrentHashMap = c0233m.f599f;
                                        Class<Object> cls4 = Object.class;
                                        if (tag == null) {
                                            view = null;
                                            if (view == null || !C0233m.m927j(view, view4)) {
                                                view = null;
                                            }
                                            if (view == null) {
                                                listM99x0 = AbstractC0000a.m99x0(view);
                                            } else {
                                                Map mapM943i = c0233m.m943i(tag);
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                Iterator it3 = C0233m.f592v.iterator();
                                                while (it3.hasNext()) {
                                                    String str4 = (String) it3.next();
                                                    Integer num4 = (Integer) c0233m.m942g().get(str4);
                                                    if (num4 != null) {
                                                        int iIntValue3 = num4.intValue();
                                                        if (!AbstractC1416l.m3825a(str4, "bkl") || numM933r2 == null) {
                                                            it = it3;
                                                        } else {
                                                            it = it3;
                                                            if (numM933r2.intValue() == 34) {
                                                            }
                                                        }
                                                        View viewFindViewById2 = (View) mapM943i.get(num4);
                                                        if (viewFindViewById2 == null) {
                                                            viewFindViewById2 = view4.findViewById(iIntValue3);
                                                        }
                                                        if (viewFindViewById2 != null) {
                                                            if (!C0233m.m927j(viewFindViewById2, view4)) {
                                                                viewFindViewById2 = null;
                                                            }
                                                            if (viewFindViewById2 != null) {
                                                                linkedHashSet.add(viewFindViewById2);
                                                            }
                                                        }
                                                    } else {
                                                        it = it3;
                                                    }
                                                    it3 = it;
                                                }
                                                if (linkedHashSet.isEmpty()) {
                                                    ConcurrentHashMap.KeySetView keySetView = c0233m.f602i;
                                                    ConcurrentHashMap concurrentHashMap2 = c0233m.f601h;
                                                    if (tag != null) {
                                                        Class<?> cls5 = tag.getClass();
                                                        Method method = (Method) concurrentHashMap2.get(cls5);
                                                        if (method != null) {
                                                            Object objInvoke = KavaReflector.invoke(method, tag, new Object[0]);
                                                            view2 = objInvoke instanceof View ? (View) objInvoke : null;
                                                            if (view2 == null) {
                                                                Integer num5 = (Integer) c0233m.m942g().get("bkg");
                                                                if (num5 != null) {
                                                                    View viewFindViewById3 = view4.findViewById(num5.intValue());
                                                                    if (viewFindViewById3 == null) {
                                                                        listM99x0 = null;
                                                                        if (listM99x0 == null) {
                                                                        }
                                                                    } else {
                                                                        if (!C0233m.m927j(viewFindViewById3, view4)) {
                                                                            viewFindViewById3 = null;
                                                                        }
                                                                        if (viewFindViewById3 != null) {
                                                                            listM99x0 = AbstractC0000a.m99x0(viewFindViewById3);
                                                                        }
                                                                        if (listM99x0 == null) {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (!C0233m.m927j(view2, view4)) {
                                                                    view2 = null;
                                                                }
                                                                if (view2 != null) {
                                                                    listM99x0 = AbstractC0000a.m99x0(view2);
                                                                }
                                                            }
                                                        } else if (!keySetView.contains(cls5)) {
                                                            Class<?> superclass = cls5;
                                                            while (superclass != null && !superclass.equals(cls4)) {
                                                                Iterator<T> it4 = KavaReflector.declaredMethods(superclass).iterator();
                                                                while (true) {
                                                                    if (it4.hasNext()) {
                                                                        next = it4.next();
                                                                        Method method2 = (Method) next;
                                                                        cls = cls4;
                                                                        cls2 = superclass;
                                                                        if (AbstractC1416l.m3825a(method2.getName(), "getMainContainerView")) {
                                                                            Class<?>[] parameterTypes = method2.getParameterTypes();
                                                                            parameterTypes.getClass();
                                                                            boolean z23 = parameterTypes.length == 0 && View.class.isAssignableFrom(method2.getReturnType());
                                                                            if (!z23) {
                                                                                cls4 = cls;
                                                                                superclass = cls2;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cls = cls4;
                                                                        cls2 = superclass;
                                                                        next = null;
                                                                    }
                                                                }
                                                                Method method3 = (Method) next;
                                                                if (method3 != null) {
                                                                    concurrentHashMap2.put(cls5, method3);
                                                                    Object objInvoke2 = KavaReflector.invoke(method3, tag, new Object[0]);
                                                                    if (objInvoke2 instanceof View) {
                                                                        view2 = (View) objInvoke2;
                                                                    }
                                                                    if (view2 == null) {
                                                                    }
                                                                } else {
                                                                    superclass = cls2.getSuperclass();
                                                                    cls4 = cls;
                                                                }
                                                            }
                                                            keySetView.add(cls5);
                                                            if (view2 == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    listM99x0 = AbstractC4166m.m8407P1(linkedHashSet);
                                                }
                                            }
                                        } else {
                                            Field field2 = (Field) concurrentHashMap.get(tag.getClass());
                                            if (field2 != null) {
                                                Object field3 = KavaReflector.readField(field2, tag);
                                                if (field3 instanceof View) {
                                                    view = (View) field3;
                                                }
                                                if (view == null) {
                                                    view = null;
                                                    if (view == null) {
                                                    }
                                                }
                                            } else {
                                                Class<?> superclass2 = tag.getClass();
                                                while (true) {
                                                    if (superclass2 != null && !superclass2.equals(cls4)) {
                                                        Iterator<T> it5 = KavaReflector.declaredFields(superclass2).iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next2 = it5.next();
                                                                Field field4 = (Field) next2;
                                                                cls3 = superclass2;
                                                                if (!(AbstractC1416l.m3825a(field4.getName(), "clickArea") && View.class.isAssignableFrom(field4.getType()))) {
                                                                    superclass2 = cls3;
                                                                }
                                                            } else {
                                                                cls3 = superclass2;
                                                                next2 = null;
                                                            }
                                                        }
                                                        Field field5 = (Field) next2;
                                                        if (field5 != null) {
                                                            concurrentHashMap.put(tag.getClass(), field5);
                                                            Object field6 = KavaReflector.readField(field5, tag);
                                                            if (field6 instanceof View) {
                                                                view = (View) field6;
                                                            }
                                                        } else {
                                                            superclass2 = cls3.getSuperclass();
                                                        }
                                                    }
                                                }
                                                view = null;
                                                if (view == null) {
                                                }
                                            }
                                        }
                                    } else if (z22) {
                                        Integer num6 = (Integer) c0233m.m942g().get("kpw");
                                        if (num6 == null || (viewFindViewById = view4.findViewById(num6.intValue())) == null) {
                                            viewFindViewById = view4;
                                            arrayList = new ArrayList();
                                            C0233m.m922a(viewFindViewById, view4, arrayList);
                                            if (arrayList.isEmpty()) {
                                                listM99x0 = arrayList;
                                            }
                                        } else {
                                            if (!C0233m.m931o(viewFindViewById, view4)) {
                                                viewFindViewById = null;
                                            }
                                            if (viewFindViewById == null) {
                                            }
                                            arrayList = new ArrayList();
                                            C0233m.m922a(viewFindViewById, view4, arrayList);
                                            if (arrayList.isEmpty()) {
                                            }
                                        }
                                    } else {
                                        Integer num7 = (Integer) c0233m.m942g().get("bkl");
                                        if (num7 == null) {
                                            View viewM925d = C0233m.m925d(view4, view4);
                                            listM99x0 = viewM925d != null ? AbstractC0000a.m99x0(viewM925d) : null;
                                            if (listM99x0 == null) {
                                            }
                                        } else {
                                            View view6 = (View) c0233m.m943i(tag).get(num7);
                                            if (view6 == null) {
                                                View viewFindViewById4 = view4.findViewById(num7.intValue());
                                                if (viewFindViewById4 != null) {
                                                    if (!C0233m.m931o(viewFindViewById4, view4)) {
                                                        viewFindViewById4 = null;
                                                    }
                                                    if (viewFindViewById4 != null) {
                                                        listM99x0 = AbstractC0000a.m99x0(viewFindViewById4);
                                                    }
                                                }
                                            } else {
                                                if (!C0233m.m931o(view6, view4)) {
                                                    view6 = null;
                                                }
                                                if (view6 != null) {
                                                    listM99x0 = AbstractC0000a.m99x0(view6);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!listM99x0.isEmpty() && sharedPreferences.getBoolean("message_bubble_enable", false)) {
                                    Boolean boolValueOf2 = (objM946w == null || (numM933r = C0233m.m933r(C0233m.m934s(objM946w, "getIsSend", "field_isSend", "isSend"))) == null) ? null : Boolean.valueOf(numM933r.intValue() != 0);
                                    Context context = view4.getContext();
                                    context.getClass();
                                    boolean z24 = (context.getResources().getConfiguration().uiMode & 48) == 32;
                                    boolean z25 = sharedPreferences.getBoolean("message_bubble_separate_dark_mode", false);
                                    EnumC0221a enumC0221aM937v = C0233m.m937v(numM933r2, string4);
                                    EnumC0221a enumC0221a = EnumC0221a.SYSTEM;
                                    if (enumC0221aM937v == enumC0221a) {
                                        list = listM99x0;
                                        bool = boolValueOf2;
                                        boolValueOf = null;
                                    } else {
                                        View view7 = (View) AbstractC4166m.m8422t1(listM99x0);
                                        int width = view4.getWidth();
                                        Integer numValueOf = Integer.valueOf(width);
                                        if (!(width > 0)) {
                                            numValueOf = null;
                                        }
                                        int iIntValue4 = numValueOf != null ? numValueOf.intValue() : view4.getMeasuredWidth();
                                        int width2 = view7.getWidth();
                                        Integer numValueOf2 = Integer.valueOf(width2);
                                        if (!(width2 > 0)) {
                                            numValueOf2 = null;
                                        }
                                        int iIntValue5 = numValueOf2 != null ? numValueOf2.intValue() : view7.getMeasuredWidth();
                                        if (iIntValue4 > 0 && iIntValue5 > 0) {
                                            list = listM99x0;
                                            bool = boolValueOf2;
                                            view4.getLocationOnScreen(new int[2]);
                                            view7.getLocationOnScreen(new int[2]);
                                            float f3 = iIntValue4;
                                            float f10 = (f3 / 2.0f) + r1[0];
                                            float f11 = (iIntValue5 / 2.0f) + r3[0];
                                            if (Math.abs(f11 - f10) >= f3 * 0.08f) {
                                                boolValueOf = Boolean.valueOf(f11 > f10);
                                            }
                                        }
                                        boolValueOf = null;
                                    }
                                    EnumC0221a enumC0221a2 = EnumC0221a.GENERAL;
                                    if (enumC0221aM937v == enumC0221a2 && numM933r2 == null && boolValueOf == null) {
                                        if (list.isEmpty()) {
                                            z19 = false;
                                            if (z19) {
                                                enumC0221aM937v = enumC0221a;
                                            }
                                        } else {
                                            Iterator it6 = list.iterator();
                                            while (it6.hasNext()) {
                                                int id2 = ((View) it6.next()).getId();
                                                Integer num8 = (Integer) c0233m.m942g().get("bkl");
                                                if (num8 != null && id2 == num8.intValue()) {
                                                    z19 = true;
                                                    if (z19) {
                                                    }
                                                }
                                            }
                                            z19 = false;
                                            if (z19) {
                                            }
                                        }
                                    }
                                    if (enumC0221aM937v == enumC0221a) {
                                        zBooleanValue = false;
                                    } else if (bool != null) {
                                        zBooleanValue = bool.booleanValue();
                                    } else if (boolValueOf != null) {
                                        zBooleanValue = boolValueOf.booleanValue();
                                    }
                                    if (!c0233m.f596c.getBoolean("message_text_color_enable", false)) {
                                        z12 = false;
                                    } else if (numM933r2 == null) {
                                        z17 = false;
                                        if (!z17) {
                                            if (numM933r2 == null) {
                                                z18 = false;
                                                if (!z18 || z11 || C0233m.m928k(numM933r2, string4)) {
                                                }
                                            } else {
                                                int iIntValue6 = numM933r2.intValue();
                                                if (iIntValue6 > 0) {
                                                    int i15 = iIntValue6 & 255;
                                                    int i16 = iIntValue6 & i9;
                                                    if ((iIntValue6 >>> 16) != 0) {
                                                        if (i16 == 10000 || i16 == 10002) {
                                                            iIntValue6 = i16;
                                                        } else if (i15 != 0 && i16 == i15) {
                                                            iIntValue6 = i15;
                                                        }
                                                    }
                                                }
                                                if (iIntValue6 == 34) {
                                                    z18 = true;
                                                }
                                                if (!z18) {
                                                }
                                            }
                                        }
                                        z12 = true;
                                    } else {
                                        int iIntValue7 = numM933r2.intValue();
                                        if (iIntValue7 > 0) {
                                            int i17 = iIntValue7 & 255;
                                            int i18 = iIntValue7 & i9;
                                            if ((iIntValue7 >>> 16) != 0) {
                                                if (i18 == 10000 || i18 == 10002) {
                                                    iIntValue7 = i18;
                                                } else if (i17 != 0 && i18 == i17) {
                                                    iIntValue7 = i17;
                                                }
                                            }
                                        }
                                        if (iIntValue7 == 1) {
                                            z17 = true;
                                        }
                                        if (!z17) {
                                        }
                                        z12 = true;
                                    }
                                    boolean z26 = (enumC0221aM937v == enumC0221a2 && z12) ? false : true;
                                    if (numM933r2 == null) {
                                        z13 = false;
                                    } else {
                                        int iIntValue8 = numM933r2.intValue();
                                        if (iIntValue8 > 0) {
                                            int i19 = iIntValue8 & 255;
                                            int i20 = iIntValue8 & i9;
                                            if ((iIntValue8 >>> 16) != 0) {
                                                if (i20 == 10000 || i20 == 10002) {
                                                    iIntValue8 = i20;
                                                } else if (i19 != 0 && i20 == i19) {
                                                    iIntValue8 = i19;
                                                }
                                            }
                                        }
                                        if (iIntValue8 == 34) {
                                            z13 = true;
                                        }
                                    }
                                    if (!z13 || (num2 = (Integer) c0233m.m942g().get("bkl")) == null) {
                                        listM99x02 = c4173t;
                                    } else {
                                        int iIntValue9 = num2.intValue();
                                        View viewFindViewById5 = (View) c0233m.m943i(tag).get(num2);
                                        if ((viewFindViewById5 != null || (viewFindViewById5 = view4.findViewById(iIntValue9)) != null) && C0233m.m931o(viewFindViewById5, view4)) {
                                            C0232l c0232lM939y = C0233m.m939y(viewFindViewById5);
                                            listM99x02 = c0232lM939y != null ? AbstractC0000a.m99x0(c0232lM939y) : null;
                                            if (listM99x02 == null) {
                                            }
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList(list.size());
                                    boolean z27 = false;
                                    for (View view8 : list) {
                                        Context context2 = view8.getContext();
                                        context2.getClass();
                                        boolean z28 = z24 && z25;
                                        ArrayList arrayList6 = new ArrayList();
                                        C0014a c0014a = EnumC0234n.f608l;
                                        c0014a.getClass();
                                        List list3 = listM99x02;
                                        EnumC0234n enumC0234nM169E = C0014a.m169E(enumC0221aM937v, zBooleanValue, z28);
                                        if (!arrayList6.contains(enumC0234nM169E)) {
                                            arrayList6.add(enumC0234nM169E);
                                        }
                                        if (z28) {
                                            c0014a.getClass();
                                            EnumC0234n enumC0234nM169E2 = C0014a.m169E(enumC0221aM937v, zBooleanValue, false);
                                            if (!arrayList6.contains(enumC0234nM169E2)) {
                                                arrayList6.add(enumC0234nM169E2);
                                            }
                                        }
                                        Iterator it7 = arrayList6.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                EnumC0234n enumC0234n = (EnumC0234n) it7.next();
                                                C0238r c0238r = C0238r.f632a;
                                                enumC0234n.getClass();
                                                C0235o c0235oM954e = C0238r.f632a.m954e(context2, enumC0234n);
                                                Iterator it8 = it7;
                                                if (c0235oM954e != null) {
                                                    z14 = zBooleanValue;
                                                    z15 = z26;
                                                    c0237q = new C0237q(c0235oM954e.f619a, c0235oM954e.f620b, c0235oM954e.f621c);
                                                } else {
                                                    z14 = zBooleanValue;
                                                    z15 = z26;
                                                    c0237q = null;
                                                }
                                                if (c0237q != null) {
                                                    c0229i = new C0229i(c0237q, enumC0234n);
                                                } else {
                                                    it7 = it8;
                                                    zBooleanValue = z14;
                                                    z26 = z15;
                                                }
                                            } else {
                                                z14 = zBooleanValue;
                                                z15 = z26;
                                                c0229i = null;
                                            }
                                        }
                                        if (c0229i != null) {
                                            List list4 = !z27 ? list3 : c4173t;
                                            C0237q c0237q2 = c0229i.f569a;
                                            EnumC0234n enumC0234n2 = c0229i.f570b;
                                            if (z15) {
                                                Context context3 = view8.getContext();
                                                context3.getClass();
                                                C0235o c0235oM954e2 = C0238r.f632a.m954e(context3, enumC0234n2);
                                                Integer numValueOf3 = c0235oM954e2 != null ? Integer.valueOf(c0235oM954e2.f622d) : null;
                                                if (numValueOf3 != null) {
                                                    int iIntValue10 = numValueOf3.intValue();
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                    C0233m.m923b(c0233m, view8, linkedHashMap2, view8);
                                                    list2 = list4;
                                                    num = numValueOf3;
                                                    ArrayList<C0232l> arrayList7 = new ArrayList(linkedHashMap2.size());
                                                    Iterator it9 = linkedHashMap2.entrySet().iterator();
                                                    while (it9.hasNext()) {
                                                        Map.Entry entry = (Map.Entry) it9.next();
                                                        arrayList7.add(new C0232l((View) entry.getValue(), (TextView) entry.getKey()));
                                                        it9 = it9;
                                                        z24 = z24;
                                                    }
                                                    z16 = z24;
                                                    for (C0232l c0232l : arrayList7) {
                                                        linkedHashMap.putIfAbsent(c0232l.f584b, c0232l);
                                                    }
                                                    for (C0232l c0232l2 : list2) {
                                                        linkedHashMap.putIfAbsent(c0232l2.f584b, c0232l2);
                                                    }
                                                    Collection<C0232l> collectionValues = linkedHashMap.values();
                                                    collectionValues.getClass();
                                                    arrayList2 = new ArrayList();
                                                    for (C0232l c0232l3 : collectionValues) {
                                                        c0232l3.getClass();
                                                        TextView textView3 = c0232l3.f584b;
                                                        boolean zM926h = C0233m.m926h(textView3.getCurrentTextColor(), iIntValue10);
                                                        boolean zM926h2 = C0233m.m926h(textView3.getLinkTextColors().getDefaultColor(), iIntValue10);
                                                        if (zM926h || zM926h2) {
                                                            ColorStateList textColors = textView3.getTextColors();
                                                            textColors.getClass();
                                                            ColorStateList linkTextColors = textView3.getLinkTextColors();
                                                            linkTextColors.getClass();
                                                            i10 = iIntValue10;
                                                            c0231k = new C0231k(c0232l3, textColors, linkTextColors, zM926h, zM926h2, i10);
                                                        } else {
                                                            i10 = iIntValue10;
                                                            c0231k = null;
                                                        }
                                                        if (c0231k != null) {
                                                            arrayList2.add(c0231k);
                                                        }
                                                        iIntValue10 = i10;
                                                    }
                                                } else {
                                                    list2 = list4;
                                                    num = numValueOf3;
                                                    z16 = z24;
                                                    arrayList2 = null;
                                                }
                                                List<C0231k> list5 = arrayList2 == null ? c4173t : arrayList2;
                                                Drawable background = view8.getBackground();
                                                int paddingLeft = view8.getPaddingLeft();
                                                int paddingTop = view8.getPaddingTop();
                                                int paddingRight = view8.getPaddingRight();
                                                int paddingBottom = view8.getPaddingBottom();
                                                view8.setTag(R.id.hchat_message_bubble_original, new C0230j(background, paddingLeft, paddingTop, paddingRight, paddingBottom, list5));
                                                view8.setBackground(c0237q2);
                                                Integer num9 = (Integer) c0233m.m942g().get("bkl");
                                                if (num9 == null || view8.getId() != num9.intValue()) {
                                                    view8.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                } else {
                                                    Rect rect = new Rect();
                                                    boolean z29 = c0237q2.getPadding(rect) && rect.left + rect.right > 0;
                                                    int i21 = z29 ? rect.left : (paddingLeft + paddingRight) / 2;
                                                    view8.setPadding(i21, paddingTop, z29 ? rect.right : (paddingLeft + paddingRight) - i21, paddingBottom);
                                                }
                                                if (num != null) {
                                                    int iIntValue11 = num.intValue();
                                                    for (C0231k c0231k2 : list5) {
                                                        C0232l c0232l4 = c0231k2.f577a;
                                                        TextView textView4 = c0232l4.f584b;
                                                        View view9 = c0232l4.f583a;
                                                        if (c0231k2.f580d) {
                                                            if (C0233m.m929l(view9)) {
                                                                KavaReflector.invokeMethod(view9, "setTextColor", Integer.valueOf(iIntValue11));
                                                            }
                                                            textView4.setTextColor(iIntValue11);
                                                        }
                                                        if (c0231k2.f581e) {
                                                            textView4.setLinkTextColor(iIntValue11);
                                                        }
                                                        textView4.invalidate();
                                                        view9.invalidate();
                                                    }
                                                }
                                                view8.invalidate();
                                                if (!list2.isEmpty()) {
                                                    z27 = true;
                                                }
                                                arrayList5.add(view8);
                                            }
                                        } else {
                                            z16 = z24;
                                        }
                                        listM99x02 = list3;
                                        zBooleanValue = z14;
                                        z26 = z15;
                                        z24 = z16;
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        view4.setTag(R.id.hchat_message_bubble_target, arrayList5);
                                    }
                                }
                                break;
                            }
                        } else {
                            i9 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        }
                        if (AbstractC3149m.m6709h0(string4, "<appmsg", true)) {
                        }
                        if (numM933r2 == null) {
                        }
                        if (numM933r2 == null) {
                        }
                        if (numM933r2 != null) {
                        }
                        if (!z10) {
                        }
                    }
                }
                break;
            case 2:
                C0220f c0220f2 = (C0220f) obj;
                methodHookParam.getClass();
                Object obj5 = methodHookParam.thisObject;
                if (obj5 != null && (c0248j = (C0248j) c0220f2.f538b.remove(obj5)) != null) {
                    Object field7 = KavaReflector.readField(obj5, "r");
                    if (field7 != null) {
                        Object field8 = KavaReflector.readField(field7, "f");
                        String str5 = field8 instanceof String ? (String) field8 : null;
                        C3147k c3147k = C0250l.f693c;
                        strM3180G = AbstractC1184v0.m3180G(str5);
                    } else {
                        strM3180G = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    C0249k c0249k = c0248j.f671a;
                    ConcurrentHashMap concurrentHashMap3 = c0249k.f684j;
                    ConcurrentHashMap concurrentHashMap4 = c0249k.f683i;
                    String str6 = c0248j.f672b;
                    String str7 = c0248j.f673c;
                    long j3 = c0248j.f674d;
                    ConcurrentHashMap.KeySetView keySetView2 = c0249k.f682h;
                    String strM989n = C0249k.m989n(str6, str7);
                    if (c0249k.m995f(j3, strM989n)) {
                        c0249k.m991b(j3, strM989n);
                        if (AbstractC3149m.m6721t0(strM3180G)) {
                            keySetView2.remove(str7);
                            c0249k.m999l();
                            String strM989n2 = C0249k.m989n(str6, str7);
                            concurrentHashMap4.remove(strM989n2);
                            concurrentHashMap3.put(strM989n2, Long.valueOf(System.currentTimeMillis() + 6000));
                            c0249k.m997j();
                        } else {
                            C0250l c0250l = c0249k.f675a;
                            String string5 = str7 != null ? AbstractC3149m.m6703R0(str7).toString() : null;
                            if (string5 != null) {
                                str = string5;
                            }
                            C3147k c3147k2 = C0250l.f693c;
                            if (AbstractC1184v0.m3174A(str)) {
                                String strM3180G2 = AbstractC1184v0.m3180G(strM3180G);
                                if (strM3180G2.length() != 0) {
                                    c0250l.f695b.put(str, strM3180G2);
                                    c0250l.f694a.edit().putString("tail_".concat(str), strM3180G2).apply();
                                }
                            }
                            keySetView2.remove(str7);
                            concurrentHashMap4.remove(strM989n);
                            concurrentHashMap3.remove(strM989n);
                            c0249k.m999l();
                            c0249k.f678d.invoke(str7);
                            c0249k.m997j();
                        }
                        break;
                    }
                }
                break;
            case 3:
                m895a(methodHookParam);
                break;
            case 4:
                methodHookParam.getClass();
                Object[] objArr3 = methodHookParam.args;
                objArr3.getClass();
                Object objM8366C03 = AbstractC4165l.m8366C0(0, objArr3);
                Integer num10 = objM8366C03 instanceof Integer ? (Integer) objM8366C03 : null;
                if (num10 != null) {
                    ConcurrentHashMap concurrentHashMap5 = C0430e.f1254c;
                    C0426d c0426d = (C0426d) concurrentHashMap5.get(num10);
                    if (c0426d != null) {
                        Activity activity = (Activity) c0426d.f1223a.get();
                        if (activity == null) {
                            concurrentHashMap5.remove(num10, c0426d);
                            break;
                        } else if (methodHookParam.thisObject == activity && concurrentHashMap5.remove(num10, c0426d)) {
                            Object[] objArr4 = methodHookParam.args;
                            objArr4.getClass();
                            Object objM8366C04 = AbstractC4165l.m8366C0(1, objArr4);
                            Integer num11 = objM8366C04 instanceof Integer ? (Integer) objM8366C04 : null;
                            int iIntValue12 = num11 != null ? num11.intValue() : 0;
                            Object[] objArr5 = methodHookParam.args;
                            objArr5.getClass();
                            Object objM8366C05 = AbstractC4165l.m8366C0(2, objArr5);
                            Intent intent = objM8366C05 instanceof Intent ? (Intent) objM8366C05 : null;
                            Uri data = intent != null ? intent.getData() : null;
                            if (iIntValue12 != -1 || data == null) {
                                c0426d.m1415a(new C0477p2(HttpUrl.FRAGMENT_ENCODE_SET, false));
                            } else {
                                new Thread(new RunnableC0059l((C0430e) obj, activity, c0426d, data, 3), "Hchat-ConversationGroupDocument").start();
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                m896b(methodHookParam);
                break;
            case 6:
                m897c(methodHookParam);
                break;
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 22:
            case 25:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 9:
                methodHookParam.getClass();
                Object objectExtra = methodHookParam.getObjectExtra("hchat_send_text_decoration");
                C0871h0 c0871h0 = objectExtra instanceof C0871h0 ? (C0871h0) objectExtra : null;
                if (c0871h0 != null) {
                    try {
                        C0881m0.m2193b((C0881m0) obj, c0871h0);
                        c3959f = C3967n.f12976a;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        AbstractC0921a.m2261x("[Hchat:Script] 恢复未发送文字失败: ", thM8182b.getMessage(), thM8182b);
                    }
                }
                break;
            case 11:
                m898d(methodHookParam);
                break;
            case 14:
                m899e(methodHookParam);
                break;
            case 18:
                m900f(methodHookParam);
                break;
            case 21:
                m901g(methodHookParam);
                break;
            case 23:
                C5995c.m10733d(methodHookParam.thisObject, (C3447b) obj);
                break;
            case 24:
                m902h(methodHookParam);
                break;
            case 26:
                m903i(methodHookParam);
                break;
            case 27:
                m904j(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018a A[Catch: all -> 0x01ae, TryCatch #9 {all -> 0x01ae, blocks: (B:112:0x017c, B:114:0x017f, B:116:0x0185, B:117:0x018a, B:119:0x018e, B:122:0x0195, B:124:0x01a3), top: B:603:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0723 A[PHI: r0
  0x0723: PHI (r0v29 android.app.Activity) = (r0v28 android.app.Activity), (r0v56 android.app.Activity) binds: [B:450:0x0706, B:460:0x0721] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object tag;
        Object obj2;
        boolean z9;
        Object c3959f;
        Field field;
        boolean zContainsKey;
        Object next;
        Object field2;
        Object[] objArr;
        C3958e c3958e;
        Object[] objArr2;
        C2954w c2954w;
        ContentValues contentValues;
        int iIndexOf;
        int iIndexOf2;
        Object c3959f2;
        View viewM7851u;
        String stringExtra;
        strValueOf = null;
        strValueOf = null;
        String strValueOf = null;
        Integer numValueOf = null;
        int iIntValue = 0;
        iIntValue = 0;
        iIntValue = 0;
        switch (this.f535a) {
            case 1:
                methodHookParam.getClass();
                C0233m c0233m = (C0233m) this.f536b;
                Object[] objArr3 = methodHookParam.args;
                c0233m.getClass();
                ThreadLocal threadLocal = c0233m.f605l;
                if (objArr3 != null) {
                    int length = objArr3.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        obj = objArr3[i9];
                        if (obj == null || c0233m.m941f(obj) == null) {
                        }
                    }
                    obj = null;
                } else {
                    obj = null;
                }
                View viewM941f = obj != null ? c0233m.m941f(obj) : null;
                if (viewM941f == null || (tag = viewM941f.getTag()) == null || !AbstractC0921a.m2263z("com.tencent.mm.ui.chatting.viewitems.", tag, false)) {
                    tag = null;
                }
                C0228h c0228h = new C0228h(viewM941f, tag);
                if (viewM941f != null) {
                    Object tag2 = viewM941f.getTag(R.id.hchat_message_bubble_target);
                    if (tag2 instanceof View) {
                        C0233m.m938x((View) tag2);
                    } else if (tag2 instanceof Collection) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (Iterable) tag2) {
                            if (obj3 instanceof View) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C0233m.m938x((View) it.next());
                        }
                    }
                    viewM941f.setTag(R.id.hchat_message_bubble_target, null);
                }
                ArrayDeque arrayDeque = (ArrayDeque) threadLocal.get();
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    threadLocal.set(arrayDeque);
                }
                arrayDeque.addLast(c0228h);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
            case 14:
            case 18:
            case 21:
            case 23:
            case 26:
            case 27:
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
            case 7:
                methodHookParam.getClass();
                if (AbstractC4302b.m8640c(((C3742g) ((C0851c) this.f536b).f2602a).f12143a, "Hchat_fake_mini_program_base_lib_config").getBoolean("fake_mini_program_base_lib_enable", false)) {
                    Object[] objArr4 = methodHookParam.args;
                    if (objArr4.length <= 6) {
                        return;
                    }
                    objArr4[6] = 9999;
                    return;
                }
                return;
            case 8:
                methodHookParam.getClass();
                methodHookParam.setResult(((Function) this.f536b).apply(methodHookParam));
                return;
            case 9:
                methodHookParam.getClass();
                Object obj4 = methodHookParam.thisObject;
                if (obj4 == null) {
                    obj2 = null;
                } else {
                    Class<?> cls = obj4.getClass();
                    LinkedHashMap linkedHashMap = C0881m0.f2709c;
                    synchronized (linkedHashMap) {
                        field = linkedHashMap.containsKey(cls) ? (Field) linkedHashMap.get(cls) : null;
                        break;
                    }
                    if (field != null) {
                        field2 = KavaReflector.readField(field, obj4);
                    } else {
                        synchronized (linkedHashMap) {
                            zContainsKey = linkedHashMap.containsKey(cls);
                        }
                        if (!zContainsKey) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                AbstractC4171r.m8432h1(arrayList2, KavaReflector.declaredFields(superclass));
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((Field) next).getType().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            Field field3 = (Field) next;
                            Field fieldAccessible = field3 != null ? KavaReflector.accessible(field3) : null;
                            LinkedHashMap linkedHashMap2 = C0881m0.f2709c;
                            synchronized (linkedHashMap2) {
                                linkedHashMap2.put(cls, fieldAccessible);
                            }
                            if (fieldAccessible != null) {
                                field2 = KavaReflector.readField(fieldAccessible, obj4);
                            }
                        }
                        obj2 = null;
                    }
                    obj2 = field2;
                }
                if (obj2 != null) {
                    C0881m0.f2716j = new WeakReference(obj2);
                    View view = obj2 instanceof View ? (View) obj2 : null;
                    Activity activityM2194c = C0881m0.m2194c(view != null ? view.getContext() : null);
                    if (activityM2194c != null) {
                        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                        if (c3460oCurrentActivity != null && !activityM2194c.isFinishing()) {
                            c3460oCurrentActivity.f11226b = new WeakReference(activityM2194c);
                        }
                    } else {
                        Object objM2195d = C0881m0.m2195d(obj2);
                        View view2 = objM2195d instanceof View ? (View) objM2195d : null;
                        activityM2194c = C0881m0.m2194c(view2 != null ? view2.getContext() : null);
                        if (activityM2194c != null) {
                        }
                    }
                    String strM2199i = C0881m0.m2199i(obj2);
                    Iterator it3 = C0881m0.f2713g.iterator();
                    it3.getClass();
                    while (true) {
                        if (it3.hasNext()) {
                            C0875j0 c0875j0 = (C0875j0) it3.next();
                            try {
                            } catch (Throwable th2) {
                                AbstractC0921a.m2260w("[Hchat:Script] 发送按钮模块回调失败: ", c0875j0.f2685a, " ", th2.getMessage(), th2);
                            }
                            if (c0875j0.f2686b.mo2174b(strM2199i)) {
                                z9 = true;
                            }
                        } else {
                            z9 = false;
                        }
                    }
                    boolean z10 = z9 ? false : ScriptPluginRuntime.INSTANCE.dispatchOnClickSendBtn(strM2199i).f2653a;
                    if (!z9 && !z10) {
                        try {
                            c3959f = C0881m0.m2192a((C0881m0) this.f536b, obj2, C0881m0.m2199i(obj2));
                            break;
                        } catch (Throwable th3) {
                            c3959f = new C3959f(th3);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC0921a.m2261x("[Hchat:Script] 发送文字装饰失败: ", thM8182b.getMessage(), thM8182b);
                        }
                        C0871h0 c0871h0 = (C0871h0) (c3959f instanceof C3959f ? null : c3959f);
                        if (c0871h0 != null) {
                            methodHookParam.setObjectExtra("hchat_send_text_decoration", c0871h0);
                            return;
                        }
                        return;
                    }
                    Object objM2195d2 = C0881m0.m2195d(obj2);
                    if (objM2195d2 != null) {
                        C0881m0 c0881m0 = C0881m0.f2707a;
                        if (objM2195d2 instanceof TextView) {
                            ((TextView) objM2195d2).setText(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
                            Object objM2198h = C0881m0.m2198h(objM2195d2);
                            Method methodM2196e = C0881m0.m2196e(objM2198h != null ? objM2198h.getClass() : null, "clear");
                            if (objM2198h == null || methodM2196e == null) {
                                Method methodM2197f = C0881m0.m2197f(objM2195d2.getClass(), CharSequence.class);
                                if (methodM2197f == null) {
                                    methodM2197f = C0881m0.m2197f(objM2195d2.getClass(), String.class);
                                }
                                if (methodM2197f != null) {
                                    KavaReflector.invoke(methodM2197f, objM2195d2, HttpUrl.FRAGMENT_ENCODE_SET);
                                } else {
                                    Method methodM2197f2 = C0881m0.m2197f(obj2.getClass(), HttpUrl.FRAGMENT_ENCODE_SET.getClass());
                                    if (methodM2197f2 != null) {
                                        KavaReflector.invoke(methodM2197f2, obj2, HttpUrl.FRAGMENT_ENCODE_SET);
                                    }
                                }
                            } else {
                                KavaReflector.invoke(methodM2196e, objM2198h, new Object[0]);
                            }
                        }
                    }
                    methodHookParam.setResult((Object) null);
                    return;
                }
                return;
            case 10:
                methodHookParam.getClass();
                SharedPreferences sharedPreferences = ((C1649j0) this.f536b).f5423b;
                if (sharedPreferences.getBoolean("sns_anti_recall_enable", false) && sharedPreferences.getBoolean("sns_force_legacy_profile_enable", false)) {
                    methodHookParam.setResult(Boolean.FALSE);
                    return;
                }
                return;
            case 12:
                methodHookParam.getClass();
                if (((SharedPreferences) ((C0851c) this.f536b).f2603b).getBoolean("fake_scan_camera_enable", false) && (objArr = methodHookParam.args) != null && objArr.length >= 5) {
                    int length2 = objArr.length;
                    if (length2 == 15) {
                        c3958e = new C3958e(2, 3);
                    } else if (length2 != 16) {
                        return;
                    } else {
                        c3958e = new C3958e(3, 4);
                    }
                    int iIntValue2 = ((Number) c3958e.f12961g).intValue();
                    int iIntValue3 = ((Number) c3958e.f12962h).intValue();
                    Object obj5 = objArr[iIntValue2];
                    Integer numValueOf2 = obj5 instanceof Integer ? (Integer) obj5 : obj5 instanceof Number ? Integer.valueOf(((Number) obj5).intValue()) : null;
                    if (numValueOf2 != null) {
                        int iIntValue4 = numValueOf2.intValue();
                        Object obj6 = objArr[iIntValue3];
                        if (obj6 instanceof Integer) {
                            numValueOf = (Integer) obj6;
                        } else if (obj6 instanceof Number) {
                            numValueOf = Integer.valueOf(((Number) obj6).intValue());
                        }
                        if (numValueOf != null) {
                            int iIntValue5 = numValueOf.intValue();
                            if ((iIntValue4 == 1 && iIntValue5 == 34) || (iIntValue4 == 4 && iIntValue5 == 37)) {
                                objArr[iIntValue2] = 0;
                                objArr[iIntValue3] = 4;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                methodHookParam.getClass();
                if (AbstractC4302b.m8640c(((C3742g) ((C0851c) this.f536b).f2602a).f12143a, "Hchat_fake_voice_duration_config").getBoolean("fake_voice_duration_enable", false)) {
                    methodHookParam.setResult(Long.valueOf(AbstractC3754e0.m7909r(AbstractC4302b.m8640c(((C3742g) r4.f2602a).f12143a, "Hchat_fake_voice_duration_config").getInt("fake_voice_duration_seconds", 5), 1, 60) * 1000));
                    return;
                }
                return;
            case 15:
                methodHookParam.getClass();
                C2340d c2340d = (C2340d) ((C2341e) this.f536b).f7670b.get();
                if (c2340d == null || (objArr2 = methodHookParam.args) == null) {
                    return;
                }
                Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr2);
                String str = objM8366C0 instanceof String ? (String) objM8366C0 : null;
                if (str == null || !str.equals(c2340d.f7667a)) {
                    return;
                }
                methodHookParam.setResult(Long.valueOf(c2340d.f7668b));
                return;
            case 16:
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                Object[] objArr5 = methodHookParam.args;
                if (objArr5 == null || objArr5.length < 1) {
                    return;
                }
                C2347k c2347k = (C2347k) this.f536b;
                Object obj7 = objArr5[0];
                Object obj8 = objArr5.length > 1 ? objArr5[1] : null;
                ConcurrentHashMap concurrentHashMap = c2347k.f7708h;
                if (obj7 == null) {
                    return;
                }
                try {
                    Object field4 = KavaReflector.readField(obj7, "d");
                    String strValueOf2 = field4 != null ? String.valueOf(field4) : HttpUrl.FRAGMENT_ENCODE_SET;
                    Object field5 = KavaReflector.readField(obj7, "e");
                    String strValueOf3 = field5 != null ? String.valueOf(field5) : HttpUrl.FRAGMENT_ENCODE_SET;
                    Object field6 = KavaReflector.readField(obj7, "f");
                    String strValueOf4 = field6 != null ? String.valueOf(field6) : HttpUrl.FRAGMENT_ENCODE_SET;
                    long jM5609e = KavaReflector.findFieldRecursive(obj7.getClass(), "g") != null ? C2347k.m5609e(obj7, "g") : C2347k.m5609e(obj7, "i");
                    long jM5609e2 = KavaReflector.findFieldRecursive(obj7.getClass(), "g") != null ? C2347k.m5609e(obj7, "i") : C2347k.m5609e(obj7, "n");
                    if (!TextUtils.isEmpty(strValueOf2) && !TextUtils.isEmpty(strValueOf3)) {
                        if (jM5609e > 0) {
                            if (Math.abs(System.currentTimeMillis() - (jM5609e > 100000000000L ? jM5609e : 1000 * jM5609e)) > 300000) {
                                return;
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Long l10 = (Long) concurrentHashMap.put(strValueOf2 + ":" + strValueOf3 + ":" + jM5609e2 + ":" + jM5609e + ":" + strValueOf4, Long.valueOf(jCurrentTimeMillis));
                        if (l10 == null || jCurrentTimeMillis - l10.longValue() >= 300000) {
                            if (concurrentHashMap.size() >= 128) {
                                concurrentHashMap.entrySet().removeIf(new C2346j(jCurrentTimeMillis, 0));
                            }
                            if (obj8 instanceof String) {
                                str2 = (String) obj8;
                            }
                            c2347k.f7704d.m2715b(new C1088h(strValueOf2, strValueOf3, strValueOf4, str2, jM5609e, jM5609e2));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    c2347k.m5613d("派发拍一拍事件失败: " + th4.getMessage());
                    return;
                }
            case 17:
                methodHookParam.getClass();
                if (((SharedPreferences) ((C0545f) this.f536b).f1721d).getBoolean("disable_pat_enable", false)) {
                    methodHookParam.setResult(Boolean.TRUE);
                    return;
                }
                return;
            case 19:
                methodHookParam.getClass();
                Object[] objArr6 = methodHookParam.args;
                objArr6.getClass();
                Object objM8366C02 = AbstractC4165l.m8366C0(0, objArr6);
                KeyEvent keyEvent = objM8366C02 instanceof KeyEvent ? (KeyEvent) objM8366C02 : null;
                if (keyEvent == null || (c2954w = (C2954w) ((C0215a) this.f536b).f524f) == null) {
                    return;
                }
                Handler handler = c2954w.f9675b;
                if (keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24) {
                    if (keyEvent.getAction() == 1 && c2954w.f9693t == keyEvent.getKeyCode()) {
                        c2954w.f9693t = 0;
                    } else {
                        if (keyEvent.getAction() != 0) {
                            return;
                        }
                        if (c2954w.f9693t != keyEvent.getKeyCode() || keyEvent.getRepeatCount() <= 0) {
                            if (keyEvent.getRepeatCount() == 0) {
                                c2954w.f9693t = 0;
                            }
                            if (keyEvent.getRepeatCount() != 0) {
                                return;
                            }
                            C2957z c2957zM6374y = c2954w.m6374y();
                            if (!c2957zM6374y.m6377b("text_speech_enable") || !c2957zM6374y.m6377b("text_speech_volume_control")) {
                                return;
                            }
                            if (c2954w.f9688o == null && !c2954w.f9691r) {
                                return;
                            }
                            int keyCode = keyEvent.getKeyCode();
                            if (keyCode != 24) {
                                if (keyCode != 25) {
                                    return;
                                }
                                c2954w.f9693t = keyEvent.getKeyCode();
                                handler.post(new RunnableC2932e(c2954w, 7));
                            } else {
                                if (!c2954w.f9691r) {
                                    return;
                                }
                                c2954w.f9693t = keyEvent.getKeyCode();
                                handler.post(new RunnableC2932e(c2954w, 8));
                            }
                        }
                    }
                    methodHookParam.setResult(Boolean.TRUE);
                    return;
                }
                return;
            case 20:
                C3106a c3106a = (C3106a) this.f536b;
                C2914b c2914b = (C2914b) c3106a.f10079f;
                Object[] objArr7 = methodHookParam.args;
                if (objArr7 == null) {
                    contentValues = null;
                } else {
                    for (Object obj9 : objArr7) {
                        if (obj9 instanceof ContentValues) {
                            contentValues = (ContentValues) obj9;
                        }
                    }
                    contentValues = null;
                }
                if (contentValues == null) {
                    return;
                }
                Object[] objArr8 = methodHookParam.args;
                if (objArr8 != null) {
                    try {
                        if (objArr8.length > 0) {
                            Object obj10 = objArr8[0];
                            if (obj10 instanceof String) {
                                strValueOf = String.valueOf(obj10);
                            } else {
                                for (Object obj11 : objArr8) {
                                    if (obj11 instanceof String) {
                                        String strValueOf5 = String.valueOf(obj11);
                                        String lowerCase = strValueOf5.toLowerCase();
                                        if ("message".equals(lowerCase) || lowerCase.contains("message")) {
                                            strValueOf = strValueOf5;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (c3106a.f10074a.m5856e()) {
                    if (!TextUtils.isEmpty(strValueOf)) {
                        String lowerCase2 = strValueOf.toLowerCase();
                        if (!"message".equals(lowerCase2) && !lowerCase2.endsWith("message") && !lowerCase2.contains("message")) {
                            return;
                        }
                    }
                    try {
                        AbstractC3375a.m7154a(contentValues);
                        String strM6608a = C3106a.m6608a(contentValues, "content");
                        if (TextUtils.isEmpty(strM6608a)) {
                            strM6608a = C3106a.m6608a(contentValues, "msgContent");
                        }
                        if (!TextUtils.isEmpty(strM6608a) && strM6608a.contains("<wcpayinfo>")) {
                            Pattern pattern = AbstractC3107b.f10080a;
                            if (TextUtils.isEmpty(strM6608a)) {
                                return;
                            }
                            if (strM6608a.contains("receivehongbao") || strM6608a.contains("wxhb_personalreceive") || strM6608a.contains("<nativeurl>")) {
                                String strSubstring = (!TextUtils.isEmpty(strM6608a) && (iIndexOf = strM6608a.indexOf(":\n")) > 0 && strM6608a.indexOf("<") > iIndexOf) ? strM6608a.substring(iIndexOf + 2) : strM6608a;
                                String strM6615e = AbstractC3107b.m6615e(strSubstring, "nativeurl");
                                if (TextUtils.isEmpty(strM6615e)) {
                                    strM6615e = AbstractC3107b.m6615e(strM6608a, "nativeurl");
                                }
                                String str3 = strM6615e;
                                if (TextUtils.isEmpty(str3)) {
                                    return;
                                }
                                String strM6608a2 = C3106a.m6608a(contentValues, "talker");
                                if (TextUtils.isEmpty(strM6608a2)) {
                                    strM6608a2 = C3106a.m6608a(contentValues, "username");
                                }
                                String strM6608a3 = C3106a.m6608a(contentValues, "sendTalker");
                                if (TextUtils.isEmpty(strM6608a3) && (iIndexOf2 = strM6608a.indexOf(":\n")) > 0) {
                                    strM6608a3 = strM6608a.substring(0, iIndexOf2);
                                }
                                if (TextUtils.isEmpty(strM6608a3)) {
                                    try {
                                        Object obj12 = contentValues.get("isSend");
                                        if (obj12 instanceof Number) {
                                            iIntValue = ((Number) obj12).intValue();
                                        } else if (obj12 != null) {
                                            String strValueOf6 = String.valueOf(obj12);
                                            if (!TextUtils.isEmpty(strValueOf6)) {
                                                iIntValue = Integer.parseInt(strValueOf6);
                                            }
                                        }
                                        break;
                                    } catch (Throwable unused2) {
                                    }
                                    strM6608a3 = iIntValue == 1 ? ((C2914b) c3106a.f10077d).f9449h.m6324a() : strM6608a2;
                                }
                                String str4 = strM6608a3;
                                if (!AbstractC3107b.m6616f(strM6608a2) && (AbstractC3107b.m6616f(str4) || TextUtils.isEmpty(strM6608a2))) {
                                    strM6608a2 = str4;
                                }
                                String strM6615e2 = AbstractC3107b.m6615e(strSubstring, "exclusive_recv_username");
                                c2914b.f9449h.m6327d("数据库兜底红包: talker=" + strM6608a2 + " sender=" + str4);
                                ((C2914b) c3106a.f10078e).f9449h.m6328e("数据库兜底", strSubstring, str4, strM6608a2, str3, strM6615e2);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        c2914b.f9449h.m6327d("ERROR 数据库兜底处理失败: " + th5.getMessage());
                        return;
                    }
                }
                return;
            case 22:
                methodHookParam.getClass();
                if (((SharedPreferences) ((C0545f) this.f536b).f1721d).getBoolean("block_typing_report_enable", false)) {
                    methodHookParam.setResult((Object) null);
                    return;
                }
                return;
            case 24:
                methodHookParam.getClass();
                C3752d0 c3752d0 = (C3752d0) this.f536b;
                ThreadLocal threadLocal2 = c3752d0.f12184A;
                try {
                    Object objM7831V = c3752d0.m7831V(methodHookParam.args);
                    if (objM7831V == null || (viewM7851u = c3752d0.m7851u(objM7831V)) == null) {
                        c3959f2 = new C3774x(null);
                    } else {
                        Object tag3 = viewM7851u.getTag();
                        if (tag3 == null) {
                            tag3 = null;
                            c3959f2 = new C3774x(tag3);
                        } else {
                            TextView textViewM7808p = C3752d0.m7808p(tag3, c3752d0.f12200k);
                            if (textViewM7808p != null ? C3752d0.m7780P(textViewM7808p, viewM7851u) : false) {
                            }
                            c3959f2 = new C3774x(tag3);
                        }
                    }
                } catch (Throwable th6) {
                    c3959f2 = new C3959f(th6);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                Object c3774x = c3959f2;
                if (thM8182b2 != null) {
                    c3752d0.f12191b.invoke("消息显示时间绑定前状态读取失败", thM8182b2);
                    c3774x = new C3774x(null);
                }
                C3774x c3774x2 = (C3774x) c3774x;
                ArrayDeque arrayDeque2 = (ArrayDeque) threadLocal2.get();
                if (arrayDeque2 == null) {
                    arrayDeque2 = new ArrayDeque();
                    threadLocal2.set(arrayDeque2);
                }
                arrayDeque2.addLast(c3774x2);
                return;
            case 25:
                methodHookParam.getClass();
                Object[] objArr9 = methodHookParam.args;
                if (objArr9 == null || objArr9.length != 3) {
                    return;
                }
                C3795k c3795k = ((C3787c) this.f536b).f12411b;
                Object obj13 = methodHookParam.thisObject;
                obj13.getClass();
                Object obj14 = objArr9[0];
                Number number = obj14 instanceof Number ? (Number) obj14 : null;
                if (number != null) {
                    int iIntValue6 = number.intValue();
                    Object obj15 = objArr9[1];
                    String string = obj15 != null ? obj15.toString() : null;
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String str5 = string;
                    Object obj16 = objArr9[2];
                    JSONObject jSONObject = obj16 instanceof JSONObject ? (JSONObject) obj16 : null;
                    synchronized (c3795k.f12444d) {
                        try {
                            C3792h c3792h = c3795k.f12457q;
                            if (c3792h != null && c3792h.f12435b == obj13) {
                                ScheduledFuture scheduledFuture = c3792h.f12436c;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                c3795k.f12457q = null;
                                c3795k.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                                c3795k.f12445e.execute(new RunnableC2539a(c3795k, c3792h, iIntValue6, str5, jSONObject));
                                return;
                            }
                            return;
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
                return;
            case 28:
                methodHookParam.getClass();
                if (((C4688a) this.f536b).f15657b.getBoolean("auto_original_image_enable", false)) {
                    Object obj17 = methodHookParam.thisObject;
                    Activity activity = obj17 instanceof Activity ? (Activity) obj17 : null;
                    if (activity != null) {
                        Intent intent = activity.getIntent();
                        intent.getClass();
                        if (intent.getIntExtra("query_source_type", 3) != 3 || (stringExtra = intent.getStringExtra("GalleryUI_ToUser")) == null || AbstractC3149m.m6721t0(stringExtra)) {
                            return;
                        }
                        intent.putExtra("key_send_raw_image", true);
                        intent.putExtra("send_raw_img", true);
                        return;
                    }
                    return;
                }
                return;
            case 29:
                m905k(methodHookParam);
                return;
        }
    }

    public /* synthetic */ C0219e(Object obj, int i9) {
        this.f535a = i9;
        this.f536b = obj;
    }
}
