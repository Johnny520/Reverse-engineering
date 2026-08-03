package p332wb;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import ca.RunnableC0537x;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p127ib.C2034b;
import p198nb.C2924a;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p218og.AbstractC3155s;
import p218og.C3145i;
import p218og.C3147k;
import p242q8.C3458m;
import p255r4.C3683m;
import p261rb.RunnableC3791g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p304uf.C4330d;
import p365y9.C6008d;
import p365y9.C6009e;
import p366ya.AbstractC6019i;
import p366ya.C6011a;
import p366ya.C6012b;
import p366ya.C6013c;
import p366ya.C6015e;
import p366ya.C6016f;
import p366ya.C6017g;
import p380z8.C6131g;
import p381zb.AbstractC6134c;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import th.C4212d;

/* JADX INFO: renamed from: wb.yo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5513yo extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f22233b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5513yo(Object obj, int i9) {
        this.f22232a = i9;
        this.f22233b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b A[PHI: r0
  0x012b: PHI (r0v68 java.lang.String) = (r0v52 java.lang.String), (r0v56 java.lang.String), (r0v69 java.lang.String) binds: [B:90:0x0146, B:100:0x018b, B:79:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C5481xo c5481xo;
        Object c3959f;
        Object next;
        String str;
        String str2;
        C3958e c3958eM9691v7;
        C4824dp c4824dp;
        Object c3959f2;
        Object[] objArr;
        Object objM8391z0;
        TextView textView;
        boolean zBooleanValue;
        Object next2;
        String string;
        switch (this.f22232a) {
            case 0:
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                objArr2.getClass();
                Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr2);
                C3958e c3958eM9691v72 = null;
                dM6731U = null;
                Double dM6731U = null;
                Integer num = objM8366C0 instanceof Integer ? (Integer) objM8366C0 : null;
                if (num == null || num.intValue() != 1212371549) {
                    return;
                }
                synchronized (((C5545zo) this.f22233b)) {
                    c5481xo = C5545zo.f22526c;
                    C5545zo.f22526c = null;
                }
                if (c5481xo != null) {
                    Object[] objArr3 = methodHookParam.args;
                    objArr3.getClass();
                    Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr3);
                    Integer num2 = objM8366C02 instanceof Integer ? (Integer) objM8366C02 : null;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        Object[] objArr4 = methodHookParam.args;
                        objArr4.getClass();
                        Object objM8366C03 = AbstractC4165l.m8366C0(2, objArr4);
                        Intent intent = objM8366C03 instanceof Intent ? (Intent) objM8366C03 : null;
                        if (iIntValue != -1 || intent == null) {
                            return;
                        }
                        C3958e c3958eM9691v73 = AbstractC4955ho.m9691v7(Double.valueOf(intent.getDoubleExtra("kwebmap_slat", Double.NaN)), Double.valueOf(intent.getDoubleExtra("kwebmap_lng", Double.NaN)));
                        if (c3958eM9691v73 == null) {
                            try {
                                c3959f = intent.getParcelableExtra("KLocationIntent");
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            boolean z9 = c3959f instanceof C3959f;
                            Object obj = c3959f;
                            if (z9) {
                                obj = null;
                            }
                            Parcelable parcelable = (Parcelable) obj;
                            if (parcelable != null) {
                                Object field = KavaReflector.readField(parcelable, "d");
                                Number number = field instanceof Number ? (Number) field : null;
                                Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
                                Object field2 = KavaReflector.readField(parcelable, "e");
                                Number number2 = field2 instanceof Number ? (Number) field2 : null;
                                Double dValueOf2 = number2 != null ? Double.valueOf(number2.doubleValue()) : null;
                                if (dValueOf == null || dValueOf2 == null || (c3958eM9691v7 = AbstractC4955ho.m9691v7(dValueOf, dValueOf2)) == null) {
                                    C3010h c3010h = new C3010h(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredMethods(parcelable.getClass())), true, new C5015jk(27)), new C2924a(parcelable, 26)));
                                    while (true) {
                                        if (c3010h.hasNext()) {
                                            next = c3010h.next();
                                            String str3 = (String) next;
                                            if (!AbstractC3149m.m6709h0(str3, "lat", true) || !AbstractC3149m.m6709h0(str3, "lng", true)) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    String string2 = (String) next;
                                    if (string2 == null) {
                                        string2 = parcelable.toString();
                                    }
                                    Pattern patternCompile = Pattern.compile("(?:lat|latitude)\\s*[:= ]\\s*([-+]?[0-9]*\\.?[0-9]+)", 66);
                                    patternCompile.getClass();
                                    string2.getClass();
                                    Matcher matcher = patternCompile.matcher(string2);
                                    matcher.getClass();
                                    C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, string2);
                                    Double dM6731U2 = (c3145iM238b == null || (str2 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a())) == null) ? null : AbstractC3155s.m6731U(str2);
                                    Pattern patternCompile2 = Pattern.compile("(?:lng|lon|longitude)\\s*[:= ]\\s*([-+]?[0-9]*\\.?[0-9]+)", 66);
                                    patternCompile2.getClass();
                                    Matcher matcher2 = patternCompile2.matcher(string2);
                                    matcher2.getClass();
                                    C3145i c3145iM238b2 = AbstractC0018a.m238b(matcher2, 0, string2);
                                    if (c3145iM238b2 != null && (str = (String) AbstractC4166m.m8425w1(1, c3145iM238b2.m6676a())) != null) {
                                        dM6731U = AbstractC3155s.m6731U(str);
                                    }
                                    c3958eM9691v72 = AbstractC4955ho.m9691v7(dM6731U2, dM6731U);
                                } else {
                                    c3958eM9691v72 = c3958eM9691v7;
                                }
                            }
                            c3958eM9691v73 = c3958eM9691v72;
                        }
                        if (c3958eM9691v73 == null) {
                            Toast.makeText(c5481xo.f22015a, "解析微信地图选点失败", 0).show();
                            return;
                        } else {
                            c5481xo.f22016b.invoke(c3958eM9691v73.f12961g, c3958eM9691v73.f12962h);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                methodHookParam.getClass();
                Object[] objArr5 = methodHookParam.args;
                objArr5.getClass();
                Object objM8366C04 = AbstractC4165l.m8366C0(0, objArr5);
                Integer num3 = objM8366C04 instanceof Integer ? (Integer) objM8366C04 : null;
                if (num3 == null || num3.intValue() != 1212371551) {
                    return;
                }
                synchronized (((C4857ep) this.f22233b)) {
                    c4824dp = C4857ep.f16970c;
                    C4857ep.f16970c = null;
                }
                if (c4824dp != null) {
                    Object[] objArr6 = methodHookParam.args;
                    objArr6.getClass();
                    Object objM8366C05 = AbstractC4165l.m8366C0(1, objArr6);
                    Integer num4 = objM8366C05 instanceof Integer ? (Integer) objM8366C05 : null;
                    if (num4 == null || num4.intValue() != -1) {
                        return;
                    }
                    Object[] objArr7 = methodHookParam.args;
                    objArr7.getClass();
                    Object objM8366C06 = AbstractC4165l.m8366C0(2, objArr7);
                    Intent intent2 = objM8366C06 instanceof Intent ? (Intent) objM8366C06 : null;
                    if (intent2 != null) {
                        ArrayList arrayList = new ArrayList();
                        Uri data = intent2.getData();
                        if (data != null) {
                            arrayList.add(data);
                        }
                        ClipData clipData = intent2.getClipData();
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i9 = 0; i9 < itemCount; i9++) {
                                try {
                                    ClipData.Item itemAt = clipData.getItemAt(i9);
                                    c3959f2 = itemAt != null ? itemAt.getUri() : null;
                                } catch (Throwable th3) {
                                    c3959f2 = new C3959f(th3);
                                }
                                boolean z10 = c3959f2 instanceof C3959f;
                                Object obj2 = c3959f2;
                                if (z10) {
                                    obj2 = null;
                                }
                                Uri uri = (Uri) obj2;
                                if (uri != null) {
                                    arrayList.add(uri);
                                }
                            }
                        }
                        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList));
                        if (listM8407P1.isEmpty()) {
                            return;
                        }
                        new Thread(new RunnableC3791g(listM8407P1, (C4857ep) this.f22233b, c4824dp), "Hchat-Plugin-Market-Files").start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                methodHookParam.getClass();
                C6009e c6009e = (C6009e) this.f22233b;
                String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                C2034b c2034b = c6009e.f24391b;
                Map map = c6009e.f24394e;
                int i10 = 0;
                if (c2034b.f6870a.getBoolean("enable", false)) {
                    C3458m c3458mChatPage = WeChatApis.chatPage();
                    String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                    if (strM7258a == null) {
                        strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (!C6009e.m10760g(strM7258a) || (objArr = methodHookParam.args) == null || (objM8391z0 = AbstractC4165l.m8391z0(objArr)) == null) {
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = c6009e.f24395f;
                    Field field3 = (Field) concurrentHashMap.get(objM8391z0.getClass());
                    if (field3 != null) {
                        Object field4 = KavaReflector.readField(field3, objM8391z0);
                        textView = field4 instanceof TextView ? (TextView) field4 : null;
                    } else {
                        Field fieldM10766d = c6009e.m10766d(objM8391z0.getClass());
                        concurrentHashMap.put(objM8391z0.getClass(), fieldM10766d);
                        Object field5 = KavaReflector.readField(fieldM10766d, objM8391z0);
                        if (field5 instanceof TextView) {
                            textView = (TextView) field5;
                        }
                    }
                    if (textView != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Object obj3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        Object obj4 = null;
                        for (Object obj5 : objArr) {
                            if (obj5 instanceof String) {
                                if (((CharSequence) obj3).length() == 0) {
                                    obj3 = obj5;
                                }
                                String string3 = AbstractC3149m.m6703R0((String) obj5).toString();
                                if (AbstractC6134c.m10905b(string3)) {
                                    arrayList2.add(string3);
                                }
                            }
                            if (obj5 != null && c6009e.m10767f(obj5.getClass())) {
                                obj4 = obj5;
                            }
                        }
                        if (obj4 == null) {
                            zBooleanValue = false;
                        } else {
                            String[] strArr = {"field_isSend", "isSend"};
                            int i11 = 0;
                            while (true) {
                                if (i11 < 2) {
                                    Object field6 = KavaReflector.readField(obj4, strArr[i11]);
                                    if (field6 instanceof Number) {
                                        zBooleanValue = true;
                                        if (((Number) field6).intValue() != 1) {
                                        }
                                    } else if (field6 instanceof Boolean) {
                                        zBooleanValue = ((Boolean) field6).booleanValue();
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        if (zBooleanValue) {
                            map.remove(textView);
                            c6009e.m10769l(textView);
                            return;
                        }
                        String str5 = (String) obj3;
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next2 = it.next();
                                if (!C6009e.m10761h((String) next2)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        String str6 = (String) next2;
                        if (str6 != null) {
                            str4 = str6;
                        } else {
                            String strM10758b = C6009e.m10758b(obj4);
                            if (strM10758b == null) {
                                Map map2 = c6009e.f24393d;
                                if (obj4 == null) {
                                    string = AbstractC6134c.m10905b(str5) ? str5 : null;
                                    if (string != null) {
                                        str4 = string;
                                    }
                                } else {
                                    strM10758b = (String) map2.get(obj4);
                                    if (strM10758b != null) {
                                        str4 = strM10758b;
                                    } else {
                                        String[] strArr2 = {"A0", "B0", "C0", "D0", "E0", "F0", "getSender", "getSendTalker", "getTalker", "j", "R1", "P1", "o0", "x0", "j0"};
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= 15) {
                                                String[] strArr3 = {"field_talker", "talker", "field_sender", "sender", "sendTalker", "field_talkerUsername", "P"};
                                                while (true) {
                                                    if (i10 >= 7) {
                                                        strM10758b = C6009e.m10758b(obj4);
                                                        if (strM10758b != null) {
                                                            map2.put(obj4, strM10758b);
                                                        } else {
                                                            string = AbstractC6134c.m10905b(str5) ? str5 : null;
                                                            if (string != null) {
                                                                str4 = string;
                                                            }
                                                            if (str4.length() > 0) {
                                                                map2.put(obj4, str4);
                                                            }
                                                        }
                                                    } else {
                                                        Object field7 = KavaReflector.readField(obj4, strArr3[i10]);
                                                        String str7 = field7 instanceof String ? (String) field7 : null;
                                                        if (AbstractC6134c.m10905b(str7)) {
                                                            string = str7 != null ? AbstractC3149m.m6703R0(str7).toString() : null;
                                                            if (string != null) {
                                                                str4 = string;
                                                            }
                                                            map2.put(obj4, str4);
                                                        } else {
                                                            i10++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj4.getClass(), strArr2[i12], new Class[0]), obj4, new Object[0]);
                                                String str8 = objInvoke instanceof String ? (String) objInvoke : null;
                                                if (AbstractC6134c.m10905b(str8)) {
                                                    string = str8 != null ? AbstractC3149m.m6703R0(str8).toString() : null;
                                                    if (string != null) {
                                                        str4 = string;
                                                    }
                                                    map2.put(obj4, str4);
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        str4 = strM10758b;
                                    }
                                }
                            } else {
                                if (C6009e.m10761h(strM10758b)) {
                                    strM10758b = null;
                                }
                                if (strM10758b != null) {
                                }
                            }
                        }
                        if (!AbstractC6134c.m10905b(str4) || C6009e.m10761h(str4)) {
                            map.remove(textView);
                            c6009e.m10769l(textView);
                            return;
                        } else {
                            if (c6009e.m10764a(textView, strM7258a, str4)) {
                                return;
                            }
                            C6008d c6008d = new C6008d(strM7258a, str4);
                            map.getClass();
                            map.put(textView, c6008d);
                            C3086j c3086jTasks = WeChatApis.tasks();
                            if (c3086jTasks != null) {
                                c3086jTasks.m6555f(AbstractC0921a.m2249l(System.identityHashCode(textView), "member_title_apply_"), 120L, new RunnableC0537x(c6009e, textView, c6008d, strM7258a, str4, 21));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r31v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r31v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C6012b c6012b;
        int i9;
        int i10;
        float f3;
        C6016f c6016f;
        View view;
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        boolean z9;
        Object c3959f;
        ViewParent parent;
        ViewParent parent2;
        int i11 = this.f22232a;
        boolean z10 = false;
        Object obj = this.f22233b;
        switch (i11) {
            case 3:
                methodHookParam.getClass();
                Object obj2 = methodHookParam.thisObject;
                Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null) {
                    Object[] objArr = methodHookParam.args;
                    Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(0, objArr) : null;
                    MotionEvent motionEvent = objM8366C0 instanceof MotionEvent ? (MotionEvent) objM8366C0 : null;
                    if (motionEvent != null) {
                        final C6017g c6017g = (C6017g) obj;
                        if (!activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI")) {
                            c6017g.m10779a();
                        } else {
                            AtomicBoolean atomicBoolean = AbstractC6019i.f24449a;
                            if (!AbstractC4302b.m8640c(activity, "Hchat_quick_mark_read_config").getBoolean("drag_read_enable", false)) {
                                c6017g.m10779a();
                            } else {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    Window window = activity.getWindow();
                                    View decorView = window != null ? window.getDecorView() : null;
                                    ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                                    if (viewGroup != null) {
                                        if (viewGroup.findViewWithTag("Hchat:MiuixSettingsPage") == null) {
                                            final float rawX = motionEvent.getRawX();
                                            final float rawY = motionEvent.getRawY();
                                            int height = viewGroup.getHeight();
                                            Integer numValueOf = Integer.valueOf(height);
                                            if (height <= 0) {
                                                numValueOf = null;
                                            }
                                            int iIntValue = numValueOf != null ? numValueOf.intValue() : viewGroup.getResources().getDisplayMetrics().heightPixels;
                                            ArrayList arrayList = new ArrayList();
                                            C6017g.m10778d(viewGroup, new C4212d(c6017g, iIntValue, arrayList));
                                            ViewGroup viewGroup2 = (ViewGroup) AbstractC4166m.m8396E1(arrayList, new C5051kn(new C3683m(6), 12));
                                            if (viewGroup2 != null) {
                                                int[] iArr = new int[2];
                                                viewGroup2.getLocationOnScreen(iArr);
                                                int i12 = iArr[0];
                                                int i13 = iArr[1];
                                                int iM8755e = C4330d.m8755e(viewGroup2);
                                                int iM8754d = C4330d.m8754d(viewGroup2);
                                                if (iM8755e <= 0 || iM8754d <= 0) {
                                                    i9 = 0;
                                                } else {
                                                    i9 = 0;
                                                    TextView textViewM10777c = C6017g.m10777c(viewGroup2);
                                                    if (textViewM10777c != null) {
                                                        textViewM10777c.getLocationOnScreen(new int[2]);
                                                        float fM8755e = (C4330d.m8755e(textViewM10777c) / 2.0f) + r6[0];
                                                        float f10 = iM8755e;
                                                        float size = f10 / C6017g.f24444f.size();
                                                        f3 = 2.0f;
                                                        float fM8752b = C4330d.m8752b(viewGroup2, 48.0f);
                                                        if (size < fM8752b) {
                                                            size = fM8752b;
                                                        }
                                                        float f11 = size / 2.0f;
                                                        float f12 = fM8755e - f11;
                                                        float f13 = i13;
                                                        float f14 = fM8755e + f11;
                                                        float f15 = iM8754d;
                                                        float f16 = i12;
                                                        i10 = 1;
                                                        c6016f = new C6016f(Math.max(f12, f16), Math.max(f13, f13), Math.min(f14, f10 + f16), Math.min((0.72f * f15) + f13, f15 + f13));
                                                    }
                                                    if (c6016f == null && c6016f.m10775a(rawX, rawY)) {
                                                        final ArrayList arrayList2 = new ArrayList();
                                                        C6017g.m10778d(viewGroup2, new InterfaceC1231l(c6017g, rawX, rawY, arrayList2) { // from class: ya.d

                                                            /* JADX INFO: renamed from: g */
                                                            public final /* synthetic */ float f24433g;

                                                            /* JADX INFO: renamed from: h */
                                                            public final /* synthetic */ float f24434h;

                                                            /* JADX INFO: renamed from: i */
                                                            public final /* synthetic */ ArrayList f24435i;

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            {
                                                                this.f24433g = rawX;
                                                                this.f24434h = rawY;
                                                                this.f24435i = arrayList2;
                                                            }

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
                                                            /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
                                                            /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
                                                            /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
                                                            @Override // p085fg.InterfaceC1231l
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object invoke(Object obj3) {
                                                                boolean z11;
                                                                CharSequence text;
                                                                String string;
                                                                View view2 = (View) obj3;
                                                                view2.getClass();
                                                                if (view2.isShown() && view2.getVisibility() == 0) {
                                                                    C3147k c3147k = C6017g.f24443e;
                                                                    int iM8755e2 = C4330d.m8755e(view2);
                                                                    int iM8754d2 = C4330d.m8754d(view2);
                                                                    if (iM8755e2 > 0 && iM8754d2 > 0) {
                                                                        String string2 = null;
                                                                        TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
                                                                        if (textView != null && (text = textView.getText()) != null && (string = text.toString()) != null) {
                                                                            string2 = AbstractC3149m.m6703R0(string).toString();
                                                                        }
                                                                        if (string2 == null) {
                                                                            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                                        }
                                                                        boolean z12 = textView != null && C6017g.f24443e.m6683d(string2);
                                                                        if (string2.length() != 0 || view2.getBackground() == null) {
                                                                            z11 = false;
                                                                            if (!z12 || z11) {
                                                                                if (!z12) {
                                                                                    int iM8752b = C4330d.m8752b(view2, 6.0f);
                                                                                    if (iM8755e2 <= C4330d.m8752b(view2, 72.0f) && iM8752b <= iM8755e2) {
                                                                                        int iM8752b2 = C4330d.m8752b(view2, 6.0f);
                                                                                        if (iM8754d2 <= C4330d.m8752b(view2, 36.0f) && iM8752b2 <= iM8754d2) {
                                                                                            int currentTextColor = textView.getCurrentTextColor();
                                                                                            if (Color.red(currentTextColor) >= 180 && Color.green(currentTextColor) >= 180 && Color.blue(currentTextColor) >= 180) {
                                                                                                int[] iArr2 = new int[2];
                                                                                                view2.getLocationOnScreen(iArr2);
                                                                                                int iM8752b3 = C4330d.m8752b(view2, 28.0f);
                                                                                                int i14 = iArr2[0];
                                                                                                int i15 = i14 - iM8752b3;
                                                                                                int i16 = iArr2[1] - iM8752b3;
                                                                                                int iM8755e3 = C4330d.m8755e(view2) + i14 + iM8752b3;
                                                                                                int iM8754d3 = C4330d.m8754d(view2) + iArr2[1] + iM8752b3;
                                                                                                float f17 = i15;
                                                                                                float f18 = this.f24433g;
                                                                                                if (f18 >= f17 && f18 <= iM8755e3) {
                                                                                                    float f19 = i16;
                                                                                                    float f20 = this.f24434h;
                                                                                                    if (f20 >= f19 && f20 <= iM8754d3) {
                                                                                                        int iM8755e4 = C4330d.m8755e(view2);
                                                                                                        int iM8754d4 = C4330d.m8754d(view2);
                                                                                                        view2.getLocationOnScreen(new int[2]);
                                                                                                        float f21 = f18 - ((iM8755e4 / 2.0f) + r0[0]);
                                                                                                        float f22 = f20 - ((iM8754d4 / 2.0f) + r0[1]);
                                                                                                        this.f24435i.add(new C6015e(view2, (f22 * f22) + (f21 * f21), iM8755e4 * iM8754d4));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int iM8752b4 = C4330d.m8752b(view2, 4.0f);
                                                                            if (iM8755e2 <= C4330d.m8752b(view2, 24.0f) && iM8752b4 <= iM8755e2) {
                                                                                int iM8752b5 = C4330d.m8752b(view2, 4.0f);
                                                                                if (iM8754d2 <= C4330d.m8752b(view2, 24.0f) && iM8752b5 <= iM8754d2 && iM8755e2 <= iM8754d2 * 2 && iM8754d2 <= iM8755e2 * 2) {
                                                                                    z11 = true;
                                                                                }
                                                                                if (!z12) {
                                                                                    if (!z12) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return C3967n.f12976a;
                                                            }
                                                        });
                                                        if (!arrayList2.isEmpty()) {
                                                            C6015e c6015e = (C6015e) AbstractC4166m.m8396E1(arrayList2, new C5051kn(new C3683m(7), 13));
                                                            if (c6015e != null && (view = c6015e.f24436a) != null) {
                                                                int[] iArr2 = new int[2];
                                                                view.getLocationOnScreen(iArr2);
                                                                TextView textView = view instanceof TextView ? (TextView) view : null;
                                                                int i14 = iArr2[i9];
                                                                int i15 = iArr2[i10];
                                                                int iM8755e2 = C4330d.m8755e(view);
                                                                int i16 = i10;
                                                                int i17 = iM8755e2 < i16 ? i16 : iM8755e2;
                                                                int iM8754d2 = C4330d.m8754d(view);
                                                                int i18 = iM8754d2 < i16 ? 1 : iM8754d2;
                                                                CharSequence text = textView != null ? textView.getText() : null;
                                                                int currentTextColor = textView != null ? textView.getCurrentTextColor() : -1;
                                                                float textSize = textView != null ? textView.getTextSize() : 0.0f;
                                                                Typeface typeface = textView != null ? textView.getTypeface() : null;
                                                                int gravity = textView != null ? textView.getGravity() : i9;
                                                                boolean includeFontPadding = textView != null ? textView.getIncludeFontPadding() : i9;
                                                                int paddingLeft = view.getPaddingLeft();
                                                                int paddingTop = view.getPaddingTop();
                                                                int paddingRight = view.getPaddingRight();
                                                                int paddingBottom = view.getPaddingBottom();
                                                                Drawable background = view.getBackground();
                                                                c6012b = new C6012b(view, view, i14, i15, i17, i18, text, currentTextColor, textSize, typeface, gravity, includeFontPadding, paddingLeft, paddingTop, paddingRight, paddingBottom, (background == null || (constantState = background.getConstantState()) == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate());
                                                            }
                                                        } else if (c6016f.m10775a(rawX, rawY)) {
                                                            int iM8752b = C4330d.m8752b(viewGroup, 10.0f);
                                                            int i19 = iM8752b < 1 ? 1 : iM8752b;
                                                            float f17 = i19 / f3;
                                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                                            gradientDrawable.setShape(1);
                                                            gradientDrawable.setColor(Color.rgb(250, 81, 81));
                                                            c6012b = new C6012b(viewGroup, null, (int) (rawX - f17), (int) (rawY - f17), i19, i19, null, -1, 0.0f, null, 0, false, 0, 0, 0, 0, gradientDrawable);
                                                        }
                                                    } else {
                                                        c6012b = null;
                                                    }
                                                }
                                                i10 = 1;
                                                f3 = 2.0f;
                                                c6016f = null;
                                                if (c6016f == null) {
                                                    c6012b = null;
                                                }
                                            }
                                            if (c6012b != null) {
                                                c6017g.m10779a();
                                                c6017g.f24447c = new C6013c(viewGroup, c6012b, motionEvent.getRawX(), motionEvent.getRawY());
                                            }
                                        } else {
                                            c6017g.m10779a();
                                        }
                                    }
                                } else {
                                    if (actionMasked == 1) {
                                        C6011a c6011a = c6017g.f24448d;
                                        if (c6011a == null) {
                                            c6017g.f24447c = null;
                                        } else {
                                            C6012b c6012b2 = c6011a.f24403b;
                                            c6011a.m10772b(motionEvent.getRawX(), motionEvent.getRawY());
                                            if (c6011a.m10774d()) {
                                                try {
                                                    z9 = AbstractC6019i.m10784e(c6012b2.f24412a.getContext(), true) >= 0;
                                                    if (z9) {
                                                        try {
                                                            c6011a.f24406e.animate().cancel();
                                                            c6011a.m10771a();
                                                            View view2 = c6012b2.f24413b;
                                                            if (view2 != null && (parent = view2.getParent()) != null) {
                                                                parent.requestDisallowInterceptTouchEvent(false);
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            z10 = z9;
                                                            z9 = z10;
                                                            c3959f = new C3959f(th);
                                                        }
                                                    }
                                                    c3959f = C3967n.f12976a;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                                if (thM8182b != null) {
                                                    c6017g.f24445a.invoke("快捷已读触发失败", thM8182b);
                                                }
                                                if (!z9) {
                                                    c6011a.m10773c();
                                                }
                                            } else {
                                                c6011a.m10773c();
                                            }
                                            c6017g.f24448d = null;
                                        }
                                        break;
                                    } else if (actionMasked == 2) {
                                        C6011a c6011a2 = c6017g.f24448d;
                                        if (c6011a2 == null) {
                                            C6013c c6013c = c6017g.f24447c;
                                            if (c6013c != null) {
                                                float f18 = c6013c.f24432d;
                                                float f19 = c6013c.f24431c;
                                                C6012b c6012b3 = c6013c.f24430b;
                                                float rawX2 = motionEvent.getRawX() - f19;
                                                float rawY2 = motionEvent.getRawY() - f18;
                                                View view3 = c6012b3.f24412a;
                                                View view4 = c6012b3.f24413b;
                                                if (rawY2 <= (-((int) TypedValue.applyDimension(1, 18.0f, view3.getResources().getDisplayMetrics()))) && Math.abs(rawY2) > Math.abs(rawX2) * 0.8f) {
                                                    c6017g.f24447c = null;
                                                    C6011a c6011a3 = new C6011a(c6013c.f24429a, c6012b3, f19, f18);
                                                    c6017g.f24448d = c6011a3;
                                                    if (view4 != null && (parent2 = view4.getParent()) != null) {
                                                        parent2.requestDisallowInterceptTouchEvent(true);
                                                    }
                                                    if (view4 != null) {
                                                        view4.bringToFront();
                                                    }
                                                    c6011a3.m10772b(motionEvent.getRawX(), motionEvent.getRawY());
                                                }
                                            }
                                        } else {
                                            c6011a2.m10772b(motionEvent.getRawX(), motionEvent.getRawY());
                                        }
                                    } else if (actionMasked == 3) {
                                        c6017g.f24447c = null;
                                        C6011a c6011a4 = c6017g.f24448d;
                                        if (c6011a4 != null) {
                                            c6011a4.m10773c();
                                            c6017g.f24448d = null;
                                        }
                                    } else if (c6017g.f24448d == null) {
                                    }
                                    methodHookParam.setResult(Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                Object objM8366C02 = objArr2 != null ? AbstractC4165l.m8366C0(2, objArr2) : null;
                Boolean bool = objM8366C02 instanceof Boolean ? (Boolean) objM8366C02 : null;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    SharedPreferences sharedPreferences = ((C6131g) obj).f24708c;
                    if (zBooleanValue ? sharedPreferences.getBoolean("call_block_outgoing_ringtone", false) : sharedPreferences.getBoolean("call_block_incoming_ringtone", false)) {
                        methodHookParam.setResult((Object) null);
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
