package p259r9;

import ac.AbstractC0063p;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bsh.org.objectweb.asm.Opcodes;
import ch.C0568c;
import ch.C0570e;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1423s;
import gg.C1425u;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p036c9.C0454k;
import p036c9.C0456k1;
import p054dg.C0795n;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p070f0.RunnableC0972d;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p086fh.C1243a;
import p086fh.C1253k;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1724i;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p154k9.ViewOnClickListenerC2368l;
import p154k9.ViewOnClickListenerC2371o;
import p167l8.C2529d;
import p167l8.EnumC2528c;
import p172lg.C2566f;
import p174m.C2576b;
import p198nb.C2924a;
import p210o8.C3087k;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p218og.EnumC3148l;
import p222p.AbstractC3199a;
import p242q8.C3458m;
import p258r8.C3742g;
import p258r8.C3744i;
import p258r8.RunnableC3737b;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: r9.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3752d0 {

    /* JADX INFO: renamed from: G */
    public static final C3147k f12176G = new C3147k("\\$\\{([A-Za-z][A-Za-z0-9]*)\\}|\\$([A-Za-z][A-Za-z0-9]*)");

    /* JADX INFO: renamed from: H */
    public static final C3147k f12177H = new C3147k("<atuserlist><!\\[CDATA\\[(.*?)]]></atuserlist>|<atuserlist>(.*?)</atuserlist>", AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL));

    /* JADX INFO: renamed from: I */
    public static final DateTimeFormatter f12178I = DateTimeFormatter.ofPattern("HH:mm:ss");

    /* JADX INFO: renamed from: J */
    public static final C2566f f12179J = new C2566f(1262304000, 4102444800L);

    /* JADX INFO: renamed from: K */
    public static final C2566f f12180K = new C2566f(1262304000000L, 4102444800000L);

    /* JADX INFO: renamed from: L */
    public static final Set f12181L;

    /* JADX INFO: renamed from: M */
    public static final LinkedHashSet f12182M;

    /* JADX INFO: renamed from: N */
    public static final LinkedHashSet f12183N;

    /* JADX INFO: renamed from: A */
    public final ThreadLocal f12184A;

    /* JADX INFO: renamed from: B */
    public volatile C3776z f12185B;

    /* JADX INFO: renamed from: C */
    public volatile boolean f12186C;

    /* JADX INFO: renamed from: D */
    public volatile boolean f12187D;

    /* JADX INFO: renamed from: E */
    public Class f12188E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f12189F;

    /* JADX INFO: renamed from: a */
    public final C3742g f12190a;

    /* JADX INFO: renamed from: b */
    public final C2026t f12191b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f12192c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f12193d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f12194e;

    /* JADX INFO: renamed from: f */
    public final Set f12195f;

    /* JADX INFO: renamed from: g */
    public final Set f12196g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f12197h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f12198i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f12199j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f12200k;

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap f12201l;

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap f12202m;

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap f12203n;

    /* JADX INFO: renamed from: o */
    public final ConcurrentHashMap.KeySetView f12204o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentHashMap f12205p;

    /* JADX INFO: renamed from: q */
    public final ConcurrentHashMap f12206q;

    /* JADX INFO: renamed from: r */
    public final ConcurrentHashMap f12207r;

    /* JADX INFO: renamed from: s */
    public final ConcurrentHashMap f12208s;

    /* JADX INFO: renamed from: t */
    public final ConcurrentHashMap.KeySetView f12209t;

    /* JADX INFO: renamed from: u */
    public final Set f12210u;

    /* JADX INFO: renamed from: v */
    public final WeakHashMap f12211v;

    /* JADX INFO: renamed from: w */
    public final WeakHashMap f12212w;

    /* JADX INFO: renamed from: x */
    public final WeakHashMap f12213x;

    /* JADX INFO: renamed from: y */
    public final WeakHashMap f12214y;

    /* JADX INFO: renamed from: z */
    public final WeakHashMap f12215z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Set setM8355W = AbstractC4156d0.m8355W("message_details_light_bg", "message_details_light_text", "message_details_dark_bg", "message_details_dark_text");
        f12181L = setM8355W;
        LinkedHashSet linkedHashSetM8353U = AbstractC4156d0.m8353U(AbstractC4156d0.m8355W("message_details_position", "message_details_text_size", "message_details_avatar_gap", "message_details_left_margin", "message_details_right_margin"), AbstractC4156d0.m8355W("message_details_format", "message_details_time_format", "message_details_click_show"));
        f12182M = linkedHashSetM8353U;
        f12183N = AbstractC4156d0.m8353U(AbstractC4156d0.m8353U(setM8355W, linkedHashSetM8353U), AbstractC0063p.m404N("message_details_enable"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3752d0(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f12190a = c3742g;
        this.f12191b = c2026t;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_extra_config");
        this.f12192c = sharedPreferencesM8640c;
        SharedPreferences sharedPreferencesM8640c2 = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_hide_chat_avatar_config");
        this.f12193d = sharedPreferencesM8640c2;
        this.f12194e = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_extra_method_cache");
        this.f12195f = AbstractC2091b.m5168o();
        this.f12196g = AbstractC2091b.m5168o();
        this.f12197h = new ConcurrentHashMap();
        this.f12198i = new ConcurrentHashMap();
        this.f12199j = new ConcurrentHashMap();
        this.f12200k = new ConcurrentHashMap();
        this.f12201l = new ConcurrentHashMap();
        this.f12202m = new ConcurrentHashMap();
        this.f12203n = new ConcurrentHashMap();
        this.f12204o = ConcurrentHashMap.newKeySet();
        this.f12205p = new ConcurrentHashMap();
        this.f12206q = new ConcurrentHashMap();
        this.f12207r = new ConcurrentHashMap();
        this.f12208s = new ConcurrentHashMap();
        this.f12209t = ConcurrentHashMap.newKeySet();
        this.f12210u = Collections.newSetFromMap(new WeakHashMap());
        this.f12211v = new WeakHashMap();
        this.f12212w = new WeakHashMap();
        this.f12213x = new WeakHashMap();
        this.f12214y = new WeakHashMap();
        this.f12215z = new WeakHashMap();
        this.f12184A = new ThreadLocal();
        this.f12185B = m7840m0();
        final int i9 = 0;
        this.f12186C = sharedPreferencesM8640c2.getBoolean("hide_chat_avatar_self", false);
        this.f12187D = sharedPreferencesM8640c2.getBoolean("hide_chat_avatar_other", false);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: r9.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3752d0 f12160b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f12160b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                List<TextView> listM8407P1;
                switch (i9) {
                    case 0:
                        C3752d0 c3752d0 = this.f12160b;
                        if (AbstractC4166m.m8417o1(C3752d0.f12183N, str)) {
                            c3752d0.f12185B = c3752d0.m7840m0();
                        }
                        if (!AbstractC4166m.m8417o1(C3752d0.f12181L, str)) {
                            if (AbstractC4166m.m8417o1(C3752d0.f12182M, str)) {
                                c3752d0.m7845q0();
                                return;
                            }
                            return;
                        }
                        Set set = c3752d0.f12210u;
                        set.getClass();
                        synchronized (set) {
                            Set set2 = c3752d0.f12210u;
                            set2.getClass();
                            listM8407P1 = AbstractC4166m.m8407P1(set2);
                        }
                        for (TextView textView : listM8407P1) {
                            textView.post(new RunnableC3762l(textView, c3752d0, 1));
                        }
                        return;
                    default:
                        C3752d0 c3752d02 = this.f12160b;
                        if (str != null) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != -55559052) {
                                if (iHashCode != 1245238632 || !str.equals("hide_chat_avatar_self")) {
                                    return;
                                }
                            } else if (!str.equals("hide_chat_avatar_other")) {
                                return;
                            }
                            c3752d02.f12186C = c3752d02.f12193d.getBoolean("hide_chat_avatar_self", false);
                            c3752d02.f12187D = c3752d02.f12193d.getBoolean("hide_chat_avatar_other", false);
                            c3752d02.m7845q0();
                            return;
                        }
                        return;
                }
            }
        };
        final int i10 = 1;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: r9.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3752d0 f12160b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f12160b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                List<TextView> listM8407P1;
                switch (i10) {
                    case 0:
                        C3752d0 c3752d0 = this.f12160b;
                        if (AbstractC4166m.m8417o1(C3752d0.f12183N, str)) {
                            c3752d0.f12185B = c3752d0.m7840m0();
                        }
                        if (!AbstractC4166m.m8417o1(C3752d0.f12181L, str)) {
                            if (AbstractC4166m.m8417o1(C3752d0.f12182M, str)) {
                                c3752d0.m7845q0();
                                return;
                            }
                            return;
                        }
                        Set set = c3752d0.f12210u;
                        set.getClass();
                        synchronized (set) {
                            Set set2 = c3752d0.f12210u;
                            set2.getClass();
                            listM8407P1 = AbstractC4166m.m8407P1(set2);
                        }
                        for (TextView textView : listM8407P1) {
                            textView.post(new RunnableC3762l(textView, c3752d0, 1));
                        }
                        return;
                    default:
                        C3752d0 c3752d02 = this.f12160b;
                        if (str != null) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != -55559052) {
                                if (iHashCode != 1245238632 || !str.equals("hide_chat_avatar_self")) {
                                    return;
                                }
                            } else if (!str.equals("hide_chat_avatar_other")) {
                                return;
                            }
                            c3752d02.f12186C = c3752d02.f12193d.getBoolean("hide_chat_avatar_self", false);
                            c3752d02.f12187D = c3752d02.f12193d.getBoolean("hide_chat_avatar_other", false);
                            c3752d02.m7845q0();
                            return;
                        }
                        return;
                }
            }
        };
        if (sharedPreferencesM8640c.contains("message_details_format") && AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("message_details_format", null), "${time} | ${type}")) {
            sharedPreferencesM8640c.edit().putString("message_details_format", "${time}").apply();
        }
        this.f12185B = m7840m0();
        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        sharedPreferencesM8640c2.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static boolean m7764A0(final View view, View view2, final WeakHashMap weakHashMap, final InterfaceC1220a interfaceC1220a) {
        m7796h(view, weakHashMap);
        final ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return false;
        }
        final C1425u c1425u = new C1425u();
        c1425u.f4738g = new ViewTreeObserver.OnPreDrawListener() { // from class: r9.o
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                C1425u c1425u2 = c1425u;
                WeakHashMap weakHashMap2 = weakHashMap;
                InterfaceC1220a interfaceC1220a2 = interfaceC1220a;
                View view3 = view;
                if (viewTreeObserver2.isAlive()) {
                    Object obj = c1425u2.f4738g;
                    if (obj == null) {
                        AbstractC1416l.m3831g("listener");
                        throw null;
                    }
                    viewTreeObserver2.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) obj);
                }
                synchronized (weakHashMap2) {
                    try {
                        C3746a0 c3746a0 = (C3746a0) weakHashMap2.get(view3);
                        ViewTreeObserver.OnPreDrawListener onPreDrawListener = c3746a0 != null ? c3746a0.f12158b : null;
                        Object obj2 = c1425u2.f4738g;
                        if (obj2 == null) {
                            AbstractC1416l.m3831g("listener");
                            throw null;
                        }
                        if (onPreDrawListener == ((ViewTreeObserver.OnPreDrawListener) obj2)) {
                            weakHashMap2.remove(view3);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                interfaceC1220a2.invoke();
                return true;
            }
        };
        synchronized (weakHashMap) {
            Object obj = c1425u.f4738g;
            if (obj == null) {
                AbstractC1416l.m3831g("listener");
                throw null;
            }
            weakHashMap.put(view, new C3746a0(viewTreeObserver, (ViewTreeObserver.OnPreDrawListener) obj));
        }
        Object obj2 = c1425u.f4738g;
        if (obj2 != null) {
            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) obj2);
            return true;
        }
        AbstractC1416l.m3831g("listener");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static void m7765C0(Object obj) {
        Object next;
        KavaReflector.invokeMethod(obj, "setKey", "hchat_group_member_history");
        KavaReflector.writeField(obj, "r", "hchat_group_member_history");
        KavaReflector.writeField(obj, "q", "hchat_group_member_history");
        Iterator<T> it = KavaReflector.declaredFields(obj.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Field field = (Field) next;
            if (AbstractC1416l.m3825a(field.getType(), String.class) && !Modifier.isFinal(field.getModifiers())) {
                break;
            }
        }
        Field field2 = (Field) next;
        if (field2 != null) {
            KavaReflector.writeField(field2, obj, "hchat_group_member_history");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static void m7766D0(String str, Object obj, boolean z9) {
        Method method;
        if (z9) {
            KavaReflector.writeField(obj, "i", str);
            KavaReflector.writeField(obj, "h", str);
        } else {
            KavaReflector.writeField(obj, "n", str);
            KavaReflector.writeField(obj, "m", str);
        }
        ArrayList arrayListM7788b0 = m7788b0(obj.getClass());
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM7788b0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Method method2 = (Method) next;
            if (method2.getParameterTypes().length == 1 && (method2.getParameterTypes()[0].isAssignableFrom(String.class) || method2.getParameterTypes()[0].isAssignableFrom(CharSequence.class)) && AbstractC1416l.m3825a(method2.getReturnType(), Void.TYPE)) {
                arrayList.add(next);
            }
        }
        if (!z9 || (method = (Method) AbstractC4166m.m8425w1(1, arrayList)) == null) {
            method = (Method) AbstractC4166m.m8424v1(arrayList);
        }
        KavaReflector.invoke(method, obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static final TextView m7767F0(Context context, C3752d0 c3752d0, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(11.0f);
        textView.setGravity(17);
        textView.setTextColor(Color.rgb(33, 150, 243));
        int iM7804l = m7804l(context, 8.0f);
        int iM7804l2 = m7804l(context, 4.0f);
        textView.setPadding(iM7804l, iM7804l2, iM7804l, iM7804l2);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static final String m7768G0(EditText editText, String str, String str2, C3752d0 c3752d0) {
        Editable text = editText.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return string.equals(str) ? str2 : AbstractC2091b.m5161h(">\\s+<", string, "><");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static final void m7769H0(C1421q c1421q, ScrollView scrollView, C3752d0 c3752d0, TextView textView, LinearLayout linearLayout, EditText editText, int i9, TextView textView2, C1425u c1425u) {
        int iM7909r;
        if (c1421q.f4734g) {
            return;
        }
        c1421q.f4734g = true;
        int scrollY = scrollView.getScrollY();
        c3752d0.getClass();
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        Layout layout = textView.getLayout();
        if (layout == null || layout.getLineCount() <= 0) {
            iM7909r = 0;
        } else {
            iM7909r = AbstractC3754e0.m7909r(layout.getLineStart(AbstractC3754e0.m7909r(layout.getLineForVertical(scrollY < 0 ? 0 : scrollY), 0, layout.getLineCount() - 1)), 0, length);
        }
        linearLayout.removeView(scrollView);
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, i9));
        editText.requestFocus();
        Editable text2 = editText.getText();
        editText.setSelection(AbstractC3754e0.m7909r(iM7909r, 0, text2 != null ? text2.length() : 0));
        editText.post(new RunnableC0972d(scrollY, 2, editText));
        textView2.setText("编辑");
        Object obj = c1425u.f4738g;
        if (obj == null) {
            AbstractC1416l.m3831g("dialog");
            throw null;
        }
        Button button = ((AlertDialog) obj).getButton(-3);
        if (button != null) {
            button.setText(c1421q.f4734g ? "搜索" : "编辑");
        }
        Object obj2 = c1425u.f4738g;
        if (obj2 == null) {
            AbstractC1416l.m3831g("dialog");
            throw null;
        }
        Button button2 = ((AlertDialog) obj2).getButton(-1);
        if (button2 != null) {
            button2.setText(c1421q.f4734g ? "发送" : "关闭");
        }
        Object obj3 = c1425u.f4738g;
        if (obj3 == null) {
            AbstractC1416l.m3831g("dialog");
            throw null;
        }
        Button button3 = ((AlertDialog) obj3).getButton(-2);
        if (button3 != null) {
            button3.setText("复制");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static final List m7770I0(EditText editText, EditText editText2) {
        int iM6719r0;
        Editable text = editText.getText();
        String string = text != null ? text.toString() : null;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() == 0) {
            return C4173t.f13710g;
        }
        Editable text2 = editText2.getText();
        String string2 = text2 != null ? text2.toString() : null;
        if (string2 != null) {
            str = string2;
        }
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (length <= str.length() && (iM6719r0 = AbstractC3149m.m6719r0(str, string, length, false, 4)) >= 0) {
            arrayList.add(Integer.valueOf(iM6719r0));
            length = iM6719r0 + string.length();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static final void m7771J0(EditText editText, TextView textView, C1423s c1423s, EditText editText2, boolean z9) {
        Editable text = editText.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() == 0) {
            textView.setText("请输入搜索内容");
            return;
        }
        List listM7770I0 = m7770I0(editText, editText2);
        textView.setText("搜索结果: " + listM7770I0.size());
        if (listM7770I0.isEmpty()) {
            c1423s.f4736g = -1;
            textView.setText("未找到: ".concat(string));
            return;
        }
        int i9 = c1423s.f4736g;
        int size = i9 < 0 ? z9 ? 0 : listM7770I0.size() - 1 : z9 ? (i9 + 1) % listM7770I0.size() : (listM7770I0.size() + (i9 - 1)) % listM7770I0.size();
        c1423s.f4736g = size;
        int iIntValue = ((Number) listM7770I0.get(size)).intValue();
        editText2.setSelection(iIntValue, string.length() + iIntValue);
        textView.setText((c1423s.f4736g + 1) + "/" + listM7770I0.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static final void m7772K0(C1421q c1421q, LinearLayout linearLayout, TextView textView, int i9, EditText editText, C1425u c1425u, EditText editText2, C1423s c1423s, TextView textView2, ScrollView scrollView, C3752d0 c3752d0, TextView textView3, LinearLayout linearLayout2, C1425u c1425u2, Context context, boolean z9) {
        EditText editText3;
        TextView textView4;
        if (!z9 || c1421q.f4734g) {
            editText3 = editText;
            textView4 = textView2;
        } else {
            editText3 = editText;
            textView4 = textView2;
            m7769H0(c1421q, scrollView, c3752d0, textView3, linearLayout2, editText3, i9, textView4, c1425u2);
        }
        linearLayout.setVisibility(z9 ? 0 : 8);
        textView.setVisibility(z9 ? 0 : 8);
        if (i9 > 0 && c1421q.f4734g) {
            ViewGroup.LayoutParams layoutParams = editText3.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z9) {
                c3752d0.getClass();
                i9 -= m7804l(context, 96.0f);
                int iM7804l = m7804l(context, 420.0f);
                if (i9 < iM7804l) {
                    i9 = iM7804l;
                }
            }
            layoutParams2.height = i9;
            editText3.setLayoutParams(layoutParams2);
        }
        if (!z9) {
            textView4.setText("搜索");
            return;
        }
        Editable text = editText3.getText();
        String string = text != null ? text.toString() : null;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int iMin = Math.min(editText3.getSelectionStart(), editText3.getSelectionEnd());
        if (iMin < 0) {
            iMin = 0;
        }
        int iMax = Math.max(editText3.getSelectionStart(), editText3.getSelectionEnd());
        int length = string.length();
        if (iMax > length) {
            iMax = length;
        }
        if (iMax > iMin) {
            c1425u.f4738g = string.substring(iMin, iMax);
        }
        Editable text2 = editText3.getText();
        String string2 = text2 != null ? text2.toString() : null;
        if (string2 == null) {
            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Object obj = c1425u.f4738g;
        String str2 = (String) obj;
        String str3 = (String) (str2.length() > 0 && AbstractC3149m.m6709h0(string2, str2, false) ? obj : null);
        if (str3 != null) {
            str = str3;
        }
        if (str.length() > 0) {
            editText2.setText(str);
            Editable text3 = editText2.getText();
            editText2.setSelection(text3 != null ? text3.length() : 0);
            c1423s.f4736g = -1;
        }
        editText2.requestFocus();
        textView4.setText("搜索结果: " + m7770I0(editText2, editText3).size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m7773L(Object obj, String str) {
        if (AbstractC1416l.m3825a(str, "contact_info_sns") || AbstractC1416l.m3825a(str, "contact_info_more") || AbstractC3149m.m6709h0(str, "permission", false)) {
            return true;
        }
        String strM7803k0 = m7803k0(obj);
        return AbstractC3149m.m6709h0(strM7803k0, "设置备注", false) || AbstractC3149m.m6709h0(strM7803k0, "标签", false) || AbstractC3149m.m6709h0(strM7803k0, "朋友圈", false) || AbstractC3149m.m6709h0(strM7803k0, "添加到通讯录", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public static String m7774L0(String str) {
        int iM6719r0 = AbstractC3149m.m6719r0(str, ":\n", 0, false, 6);
        String strSubstring = iM6719r0 > 0 ? str.substring(0, iM6719r0) : HttpUrl.FRAGMENT_ENCODE_SET;
        return (AbstractC3149m.m6721t0(strSubstring) || AbstractC3149m.m6709h0(strSubstring, "<", false) || AbstractC3149m.m6709h0(strSubstring, "\n", false)) ? str : str.substring(iM6719r0 + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static boolean m7775M(Object obj) {
        if (obj == null) {
            return false;
        }
        if (m7801j0(obj).equals("hchat_profile_id")) {
            return true;
        }
        return AbstractC3156t.m6740d0(AbstractC3149m.m6703R0(m7803k0(obj)).toString(), "ID:", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static Long m7776M0(Number number) {
        long jLongValue = number.longValue();
        C2566f c2566f = f12179J;
        long j3 = c2566f.f8324g;
        if (jLongValue <= c2566f.f8325h && j3 <= jLongValue) {
            return Long.valueOf(jLongValue * 1000);
        }
        C2566f c2566f2 = f12180K;
        long j4 = c2566f2.f8324g;
        if (jLongValue > c2566f2.f8325h || j4 > jLongValue) {
            return null;
        }
        return Long.valueOf(jLongValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static boolean m7777N(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), String.class) && parameterTypes.length == 2 && Context.class.isAssignableFrom(parameterTypes[0]) && AbstractC1416l.m3825a(parameterTypes[1], Long.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Long m7778N0(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        boolean z9 = false;
        if (string.length() == 10) {
            for (int i9 = 0; i9 < string.length(); i9++) {
                if (!Character.isDigit(string.charAt(i9))) {
                    if (string.length() == 13) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= string.length()) {
                                Long lM6743g0 = AbstractC3156t.m6743g0(string);
                                if (lM6743g0 != null) {
                                    long jLongValue = lM6743g0.longValue();
                                    C2566f c2566f = f12180K;
                                    long j3 = c2566f.f8324g;
                                    if (jLongValue <= c2566f.f8325h && j3 <= jLongValue) {
                                        z9 = true;
                                    }
                                    if (z9) {
                                        return lM6743g0;
                                    }
                                }
                            } else {
                                if (!Character.isDigit(string.charAt(i10))) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
            Long lM6743g02 = AbstractC3156t.m6743g0(string);
            if (lM6743g02 != null) {
                long jLongValue2 = lM6743g02.longValue();
                C2566f c2566f2 = f12179J;
                long j4 = c2566f2.f8324g;
                if (jLongValue2 > c2566f2.f8325h || j4 > jLongValue2) {
                    lM6743g02 = null;
                }
                if (lM6743g02 != null) {
                    return Long.valueOf(lM6743g02.longValue() * 1000);
                }
            }
        } else if (string.length() == 13) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static boolean m7779O(ViewGroup viewGroup) {
        String name = viewGroup.getClass().getName();
        return AbstractC3149m.m6709h0(name, "RecyclerView", false) || AbstractC3149m.m6709h0(name, "ListView", false) || AbstractC3149m.m6709h0(name, "ScrollView", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static boolean m7780P(View view, View view2) {
        while (view != null) {
            if (view == view2) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r2
  0x001a: PHI (r2v34 java.lang.Integer) = (r2v1 java.lang.Integer), (r2v3 java.lang.Integer), (r2v5 java.lang.Integer) binds: [B:10:0x0018, B:19:0x0030, B:29:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b A[PHI: r6
  0x005b: PHI (r6v22 java.lang.Integer) = (r6v1 java.lang.Integer), (r6v3 java.lang.Integer), (r6v5 java.lang.Integer) binds: [B:39:0x0059, B:48:0x0071, B:58:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0084  */
    /* JADX INFO: renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m7781P0(View view) {
        int iIntValue;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = view.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        int iIntValue2 = 0;
        if (!(width > 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            int measuredWidth = view.getMeasuredWidth();
            numValueOf = Integer.valueOf(measuredWidth);
            if (!(measuredWidth > 0)) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                if (layoutParams != null) {
                    int i9 = layoutParams.width;
                    numValueOf = Integer.valueOf(i9);
                    if (!(i9 > 0)) {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        iIntValue = 0;
                    }
                }
            }
        }
        int height = view.getHeight();
        Integer numValueOf2 = Integer.valueOf(height);
        if (!(height > 0)) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            iIntValue2 = numValueOf2.intValue();
        } else {
            int measuredHeight = view.getMeasuredHeight();
            numValueOf2 = Integer.valueOf(measuredHeight);
            if (!(measuredHeight > 0)) {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                if (layoutParams != null) {
                    int i10 = layoutParams.height;
                    numValueOf2 = Integer.valueOf(i10);
                    if (!(i10 > 0)) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                    }
                }
            }
        }
        Context context = view.getContext();
        context.getClass();
        int iM7804l = m7804l(context, 420.0f);
        if (iIntValue <= iM7804l) {
            iM7804l = iIntValue;
        }
        Context context2 = view.getContext();
        context2.getClass();
        int iM7804l2 = m7804l(context2, 420.0f);
        if (iIntValue2 <= iM7804l2) {
            iM7804l2 = iIntValue2;
        }
        int i11 = iM7804l + iM7804l2;
        if (view instanceof TextView) {
            i11 += 80;
        }
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            if (childCount > 8) {
                childCount = 8;
            }
            i11 += childCount * 20;
        }
        if ((layoutParams != null && layoutParams.width == -2) || (layoutParams != null && layoutParams.width == -1)) {
            i11 += 40;
        }
        CharSequence contentDescription = view.getContentDescription();
        String string = contentDescription != null ? contentDescription.toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6709h0(string, "avatar", true)) {
            i11 -= 600;
        }
        if (1 > iIntValue) {
            return i11;
        }
        Context context3 = view.getContext();
        context3.getClass();
        if (iIntValue > m7804l(context3, 72.0f) || 1 > iIntValue2) {
            return i11;
        }
        Context context4 = view.getContext();
        context4.getClass();
        return iIntValue2 <= m7804l(context4, 72.0f) ? i11 - 500 : i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static boolean m7782Q(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        if (view.getWidth() > 0 || view.getMeasuredWidth() > 0) {
            return view.getHeight() > 0 || view.getMeasuredHeight() > 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static Object m7783R(int i9, Object obj) {
        if (obj == null || i9 < 0) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i9 < list.size()) {
                return list.get(i9);
            }
        }
        Class<?> cls = obj.getClass();
        Class cls2 = Integer.TYPE;
        cls2.getClass();
        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(cls, "get", cls2), obj, Integer.valueOf(i9));
        return objInvoke != null ? objInvoke : KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "get", cls2), obj, Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static Method m7784S(C3752d0 c3752d0, String str, List list) {
        Object c3959f;
        String strM7836a0 = c3752d0.m7836a0();
        SharedPreferences sharedPreferences = c3752d0.f12194e;
        C3742g c3742g = c3752d0.f12190a;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM7836a0, c3742g.f12145c, str);
        if (methodM2087c != null) {
            return methodM2087c;
        }
        Object obj = null;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, list);
            c0570e.f1764h = c1253k;
            Iterator it = dexKitBridge.findMethod(c0570e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c3959f = null;
                    break;
                }
                c3959f = c3752d0.m7829O0((C1730o) it.next());
                if (c3959f != null) {
                    break;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            obj = c3959f;
        } else {
            c3752d0.f12191b.invoke("DexKit定位失败: ".concat(str), thM8182b);
        }
        Method method = (Method) obj;
        if (method != null) {
            C0828b.m2092h(sharedPreferences, strM7836a0, str, method);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7836a0)) {
                    editorEdit.clear().putString("cache.key", strM7836a0);
                }
                editorEdit.remove(str).apply();
            } catch (Throwable unused) {
            }
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static boolean m7785U(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        return AbstractC3156t.m6740d0(string, "<", false) && AbstractC3156t.m6733W(string, ">", false) && AbstractC3149m.m6718q0(string, '>', 0, 6) > 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m7786a(Object obj) {
        Integer numValueOf;
        Iterator it = m7788b0(obj.getClass()).iterator();
        do {
            numValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            Method method = (Method) it.next();
            if (AbstractC1416l.m3825a(method.getName(), "getCount")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0) {
                    Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
                    Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                    if (number != null) {
                        numValueOf = Integer.valueOf(number.intValue());
                    }
                }
            }
        } while (numValueOf == null);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m7787b(Object obj, Object obj2) {
        int iM7786a = m7786a(obj);
        int i9 = 0;
        for (int i10 = 0; i10 < iM7786a; i10++) {
            Object objM7789c = m7789c(i10, obj);
            if (objM7789c == obj2) {
                i9++;
            } else {
                int i11 = i10 - i9;
                if (m7775M(objM7789c)) {
                    return i11 + 1;
                }
                if (m7773L(objM7789c, m7801j0(objM7789c))) {
                    return i11;
                }
            }
        }
        int i12 = iM7786a - i9;
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static ArrayList m7788b0(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            AbstractC4171r.m8432h1(arrayList, KavaReflector.declaredMethods(cls));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m7789c(int i9, Object obj) {
        Object objInvoke;
        Iterator it = m7788b0(obj.getClass()).iterator();
        do {
            objInvoke = null;
            if (!it.hasNext()) {
                break;
            }
            Method method = (Method) it.next();
            if (AbstractC1416l.m3825a(method.getName(), "getItem") && method.getParameterTypes().length == 1 && (AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.TYPE) || AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.class))) {
                objInvoke = KavaReflector.invoke(method, obj, Integer.valueOf(i9));
            }
        } while (objInvoke == null);
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static String m7790c0(CharSequence charSequence) {
        String string;
        String string2;
        String strM5161h = (charSequence == null || (string = charSequence.toString()) == null || (string2 = AbstractC3149m.m6703R0(string).toString()) == null) ? null : AbstractC2091b.m5161h("\\s+", string2, " ");
        return strM5161h == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM5161h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m7791d(Object obj, int i9, Object obj2) {
        ArrayList<Method> arrayListM7788b0 = m7788b0(obj.getClass());
        if (!arrayListM7788b0.isEmpty()) {
            for (Method method : arrayListM7788b0) {
                if ((method.getParameterTypes().length == 2 && AbstractC1416l.m3825a(method.getParameterTypes()[1], Integer.TYPE) && method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) ? KavaReflector.invokeSuccessfully(method, obj, obj2, Integer.valueOf(i9)) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7792d0(Object obj) {
        Object next;
        KavaReflector.invokeMethod(obj, "notifyDataSetChanged", new Object[0]);
        Iterator it = m7788b0(obj.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Method method = (Method) next;
            if (AbstractC1416l.m3825a(method.getName(), "notifyDataSetChanged")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                boolean z9 = parameterTypes.length == 0;
                if (z9) {
                    break;
                }
            }
        }
        Method method2 = (Method) next;
        if (method2 != null) {
            KavaReflector.invoke(method2, obj, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static EnumC2528c m7793f(C3756f0 c3756f0) {
        C2529d c2529d = WeChatMessage.Companion;
        String str = c3756f0.f12247h;
        String str2 = c3756f0.f12246g;
        C1360a c1360aAccount = WeChatApis.account();
        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
        if (strM3652c == null) {
            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        c2529d.getClass();
        return C2529d.m5937c(str, str2, strM3652c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static List m7794f0(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{',', ';', '|', ' '}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static Integer m7795g0(String str) {
        Object c3959f;
        try {
            c3959f = Integer.valueOf(Color.parseColor(AbstractC3149m.m6703R0(str).toString()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        return (Integer) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m7796h(View view, WeakHashMap weakHashMap) {
        C3746a0 c3746a0;
        synchronized (weakHashMap) {
            c3746a0 = (C3746a0) weakHashMap.remove(view);
        }
        if (c3746a0 == null || !c3746a0.f12157a.isAlive()) {
            return;
        }
        c3746a0.f12157a.removeOnPreDrawListener(c3746a0.f12158b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static Integer m7797h0(Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6742f0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m7798i(Context context, String str) {
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("消息详情", str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static Long m7799i0(Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6743g0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m7800j(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            Iterator it = AbstractC0000a.m101y0("Contact_User", "RoomInfo_Id", "room_name", "Contact_ChatRoomId", "Chat_User").iterator();
            while (it.hasNext()) {
                String stringExtra = intent.getStringExtra((String) it.next());
                if (stringExtra == null || AbstractC3149m.m6721t0(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    return stringExtra;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static String m7801j0(Object obj) {
        String str;
        if (obj == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String[] strArr = {"r", "q"};
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                for (Field field : KavaReflector.declaredFields(obj.getClass())) {
                    if (AbstractC1416l.m3825a(field.getType(), String.class)) {
                        Object field2 = KavaReflector.readField(field, obj);
                        String str2 = field2 instanceof String ? (String) field2 : null;
                        if (str2 != null && !AbstractC3149m.m6721t0(str2) && str2.equals("hchat_group_member_history")) {
                            return str2;
                        }
                    }
                }
                Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getKey", new Object[0]);
                str = objInvokeMethod instanceof String ? (String) objInvokeMethod : null;
                return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Object field3 = KavaReflector.readField(obj, strArr[i9]);
            String str3 = field3 instanceof String ? (String) field3 : null;
            if (str3 != null) {
                str = AbstractC3149m.m6721t0(str3) ? null : str3;
                if (str != null) {
                    return str;
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static View m7802k(View view, ViewGroup viewGroup) {
        if (view.getParent() == viewGroup) {
            return view;
        }
        for (int i9 = 0; i9 < 8; i9++) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            if (view.getParent() == viewGroup) {
                return view;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:1: B:8:0x001d->B:53:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m7803k0(Object obj) {
        String string;
        String string2;
        if (obj == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String[] strArr = {"i", "h"};
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                Iterator it = m7788b0(obj.getClass()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method method = (Method) it.next();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && CharSequence.class.isAssignableFrom(method.getReturnType())) {
                        Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
                        CharSequence charSequence = objInvoke instanceof CharSequence ? (CharSequence) objInvoke : null;
                        if (charSequence == null || (string = charSequence.toString()) == null || AbstractC3149m.m6721t0(string)) {
                        }
                        if (string == null) {
                        }
                    } else {
                        string = null;
                        if (string == null) {
                            str = string;
                            break;
                        }
                    }
                }
                return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
            }
            Object field = KavaReflector.readField(obj, strArr[i9]);
            CharSequence charSequence2 = field instanceof CharSequence ? (CharSequence) field : null;
            if (charSequence2 != null && (string2 = charSequence2.toString()) != null) {
                str = AbstractC3149m.m6721t0(string2) ? null : string2;
                if (str != null) {
                    return str;
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static int m7804l(Context context, float f3) {
        return (int) TypedValue.applyDimension(1, f3, context.getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static Integer m7805l0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            return null;
        }
        int i9 = byteBuffer.getShort() & 65535;
        Integer numValueOf = Integer.valueOf(i9);
        if (i9 <= 3072) {
            return numValueOf;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static ArrayList m7806m(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            AbstractC4171r.m8432h1(arrayList, KavaReflector.declaredFields(cls));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static View m7807n(View view, boolean z9) {
        if (view.getClass().getName().equals("com.tencent.mm.ui.chatting.view.ChattingAvatarImageView") && (!z9 || m7782Q(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.getClass();
            View viewM7807n = m7807n(childAt, z9);
            if (viewM7807n != null) {
                return viewM7807n;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static TextView m7808p(Object obj, ConcurrentHashMap concurrentHashMap) {
        Object next;
        Field field = (Field) concurrentHashMap.get(obj.getClass());
        if (field != null) {
            Object field2 = KavaReflector.readField(field, obj);
            if (field2 instanceof TextView) {
                return (TextView) field2;
            }
        } else {
            Iterator it = m7806m(obj.getClass()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Field field3 = (Field) next;
                if (AbstractC1416l.m3825a(field3.getName(), "timeTV") && TextView.class.isAssignableFrom(field3.getType())) {
                    break;
                }
            }
            Field field4 = (Field) next;
            if (field4 != null) {
                concurrentHashMap.put(obj.getClass(), field4);
                Object field5 = KavaReflector.readField(field4, obj);
                if (field5 instanceof TextView) {
                    return (TextView) field5;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static View m7809q(Object obj, ConcurrentHashMap concurrentHashMap) {
        Object next;
        Field field = (Field) concurrentHashMap.get(obj.getClass());
        if (field != null) {
            Object field2 = KavaReflector.readField(field, obj);
            if (field2 instanceof View) {
                return (View) field2;
            }
        } else {
            Iterator it = m7806m(obj.getClass()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Field field3 = (Field) next;
                if (AbstractC1416l.m3825a(field3.getName(), "clickArea") && View.class.isAssignableFrom(field3.getType())) {
                    break;
                }
            }
            Field field4 = (Field) next;
            if (field4 != null) {
                concurrentHashMap.put(obj.getClass(), field4);
                Object field5 = KavaReflector.readField(field4, obj);
                if (field5 instanceof View) {
                    return (View) field5;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static ListView m7810r(ViewGroup viewGroup) {
        ListView listViewM7810r;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof ListView) {
                return (ListView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (listViewM7810r = m7810r((ViewGroup) childAt)) != null) {
                return listViewM7810r;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static TextView m7811v(View view, C2576b c2576b) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getVisibility() == 0 && ((Boolean) c2576b.invoke(view)).booleanValue()) {
                return textView;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.getClass();
            TextView textViewM7811v = m7811v(childAt, c2576b);
            if (textViewM7811v != null) {
                return textViewM7811v;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static int m7812v0(int i9, String str, String str2, String str3, String str4) {
        Integer numM7795g0 = m7795g0(str);
        Integer numM7795g02 = m7795g0(str3);
        Integer numM7795g03 = m7795g0(str);
        Integer numM7795g04 = m7795g0(str2);
        boolean z9 = false;
        boolean z10 = (numM7795g03 == null || numM7795g04 == null || !numM7795g03.equals(numM7795g04)) ? false : true;
        Integer numM7795g05 = m7795g0(str3);
        Integer numM7795g06 = m7795g0(str4);
        if (numM7795g05 != null && numM7795g06 != null && numM7795g05.equals(numM7795g06)) {
            z9 = true;
        }
        return (numM7795g0 == null || z10) ? (numM7795g02 == null || z9) ? numM7795g0 != null ? numM7795g0.intValue() : numM7795g02 != null ? numM7795g02.intValue() : i9 : numM7795g02.intValue() : numM7795g0.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static Long m7813w(int i9, Object obj, Set set) {
        if (obj == null || i9 > 4 || !set.add(obj)) {
            return null;
        }
        if (obj instanceof String) {
            return m7778N0((String) obj);
        }
        if (obj instanceof Number) {
            return m7776M0((Number) obj);
        }
        Class<?> cls = obj.getClass();
        if (cls.isPrimitive() || cls.isArray() || AbstractC3156t.m6740d0(cls.getName(), "android.", false) || AbstractC3156t.m6740d0(cls.getName(), "java.", false) || AbstractC3156t.m6740d0(cls.getName(), "kotlin.", false)) {
            return null;
        }
        Iterator it = m7806m(cls).iterator();
        while (it.hasNext()) {
            Object field = KavaReflector.readField((Field) it.next(), obj);
            if (field != null) {
                if (field instanceof String) {
                    Long lM7778N0 = m7778N0((String) field);
                    if (lM7778N0 != null) {
                        return Long.valueOf(lM7778N0.longValue());
                    }
                } else if (field instanceof Number) {
                    Long lM7776M0 = m7776M0((Number) field);
                    if (lM7776M0 != null) {
                        return Long.valueOf(lM7776M0.longValue());
                    }
                } else {
                    Long lM7813w = m7813w(i9 + 1, field, set);
                    if (lM7813w != null) {
                        return Long.valueOf(lM7813w.longValue());
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m7814x(long j3) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault());
        LocalDate localDateNow = LocalDate.now();
        String str = localDateTimeOfInstant.format(DateTimeFormatter.ofPattern(AbstractC1416l.m3825a(localDateTimeOfInstant.toLocalDate(), localDateNow) ? "HH:mm:ss" : localDateTimeOfInstant.getYear() == localDateNow.getYear() ? "M月d日 HH:mm:ss" : "yyyy年M月d日 HH:mm:ss"));
        str.getClass();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m7815z(Class cls) {
        ArrayList<Method> arrayListM7788b0 = m7788b0(cls);
        if (!arrayListM7788b0.isEmpty()) {
            for (Method method : arrayListM7788b0) {
                if (AbstractC1416l.m3825a(method.getName(), "getItem") && method.getParameterTypes().length == 1 && (AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.TYPE) || AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.class))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m7816A(Object obj, ViewGroup viewGroup) {
        View view;
        Object next;
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f12203n;
        Method method = (Method) concurrentHashMap.get(cls);
        if (method != null) {
            Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
            view = !(objInvoke instanceof View) ? (View) objInvoke : null;
            if (view != null && view.getVisibility() != 8 && m7780P(view, viewGroup)) {
                if (view == m7809q(obj, this.f12202m)) {
                    if (view.getWidth() > 0 && viewGroup.getWidth() > 0 && m7780P(view, viewGroup)) {
                        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
                        viewGroup.offsetDescendantRectToMyCoords(view, rect);
                        Context context = view.getContext();
                        context.getClass();
                        int iM7804l = m7804l(context, 8.0f);
                        if (rect.width() < ((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - iM7804l || rect.left > viewGroup.getPaddingLeft() + iM7804l || rect.right < (viewGroup.getWidth() - viewGroup.getPaddingRight()) - iM7804l) {
                        }
                    }
                }
                return view;
            }
        } else {
            ConcurrentHashMap.KeySetView keySetView = this.f12204o;
            if (!keySetView.contains(cls)) {
                Iterator it = m7788b0(cls).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Method method2 = (Method) next;
                    if (AbstractC1416l.m3825a(method2.getName(), "getMainContainerView")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        boolean z9 = parameterTypes.length == 0 && View.class.isAssignableFrom(method2.getReturnType());
                        if (z9) {
                            break;
                        }
                    }
                }
                Method method3 = (Method) next;
                if (method3 == null) {
                    keySetView.add(cls);
                    return null;
                }
                concurrentHashMap.put(cls, method3);
                method = method3;
                Object objInvoke2 = KavaReflector.invoke(method, obj, new Object[0]);
                if (!(objInvoke2 instanceof View)) {
                }
                if (view != null) {
                    if (view == m7809q(obj, this.f12202m)) {
                    }
                    return view;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m7817B(Method method, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        Set set = this.f12195f;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(method, new C3748b0(interfaceC1231l, this, method, 0));
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            this.f12191b.invoke("Hchat扩展Hook安装失败: " + method.getName(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public final void m7818B0(Object obj, Activity activity) {
        Object next;
        Iterator it = m7788b0(obj.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Method method = (Method) next;
            boolean z9 = false;
            if (method.getParameterTypes().length == 1 && View.OnClickListener.class.isAssignableFrom(method.getParameterTypes()[0]) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
                z9 = true;
            }
            if (z9) {
                break;
            }
        }
        Method method2 = (Method) next;
        if (method2 != null) {
            KavaReflector.invoke(method2, obj, new ViewOnClickListenerC2371o(this, activity));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final boolean m7819C(Method method, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        Set set = this.f12195f;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(method, new C3748b0(interfaceC1231l, this, method, 1));
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            this.f12191b.invoke("Hchat扩展Hook安装失败: " + method.getName(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v23, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024a  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7820D(Activity activity, ListAdapter listAdapter) {
        Intent intent;
        String strM7800j;
        Object objNewInstance;
        Object objInvoke;
        Object objM7789c;
        Object objNewInstance2;
        Object objM7789c2;
        Object[] objArr;
        Integer numValueOf;
        Integer numValueOf2;
        String stringExtra;
        String stringExtra2;
        C3458m c3458mChatPage = WeChatApis.chatPage();
        Object obj = null;
        String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
        if (strM7258a == null) {
            strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i9 = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if ((AbstractC3156t.m6733W(strM7258a, "@chatroom", false) || AbstractC3156t.m6733W(strM7258a, "@im.chatroom", false)) && (intent = activity.getIntent()) != null && ((AbstractC1416l.m3825a(intent.getStringExtra("Contact_ChatRoomId"), strM7258a) || AbstractC1416l.m3825a(intent.getStringExtra("Chat_User"), strM7258a) || (!AbstractC1416l.m3825a(intent.getStringExtra("Contact_User"), strM7258a) && (((stringExtra = intent.getStringExtra("Contact_ChatRoomId")) != null && AbstractC3156t.m6733W(stringExtra, "@chatroom", false)) || ((stringExtra2 = intent.getStringExtra("Chat_User")) != null && AbstractC3156t.m6733W(stringExtra2, "@chatroom", false))))) && (strM7800j = m7800j(activity)) != null && !AbstractC3156t.m6733W(strM7800j, "@chatroom", false) && !strM7800j.equals(strM7258a))) {
            if (listAdapter != null) {
                int iM7786a = m7786a(listAdapter);
                int i10 = 0;
                while (true) {
                    if (i10 >= iM7786a) {
                        objM7789c = null;
                        break;
                    }
                    objM7789c = m7789c(i10, listAdapter);
                    if (objM7789c != null && (m7801j0(objM7789c).equals("hchat_group_member_history") || (!AbstractC3149m.m6721t0("历史发言记录") && m7803k0(objM7789c).equals("历史发言记录")))) {
                        break;
                    }
                    i10++;
                }
                if (objM7789c != null) {
                    m7765C0(objM7789c);
                    m7766D0("历史发言记录", objM7789c, true);
                    m7766D0(HttpUrl.FRAGMENT_ENCODE_SET, objM7789c, false);
                    m7818B0(objM7789c, activity);
                    int iM7787b = m7787b(listAdapter, objM7789c);
                    int iM7786a2 = m7786a(listAdapter);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iM7786a2) {
                            numValueOf = null;
                            break;
                        }
                        if (m7789c(i11, listAdapter) == objM7789c) {
                            numValueOf = Integer.valueOf(i11);
                            break;
                        }
                        i11++;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        int iM7786a3 = m7786a(listAdapter) - 1;
                        if (iM7786a3 < 0) {
                            iM7786a3 = 0;
                        }
                        if (iIntValue != AbstractC3754e0.m7909r(iM7787b, 0, iM7786a3)) {
                            ArrayList<Method> arrayListM7788b0 = m7788b0(listAdapter.getClass());
                            if (!arrayListM7788b0.isEmpty()) {
                                for (Method method : arrayListM7788b0) {
                                    if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0].isAssignableFrom(objM7789c.getClass()) && (AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Boolean.class))) {
                                        if (AbstractC1416l.m3825a(KavaReflector.invoke(method, listAdapter, objM7789c), Boolean.TRUE)) {
                                            int iM7786a4 = m7786a(listAdapter);
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= iM7786a4) {
                                                    numValueOf2 = null;
                                                    break;
                                                }
                                                if (m7789c(i12, listAdapter) == objM7789c) {
                                                    numValueOf2 = Integer.valueOf(i12);
                                                    break;
                                                }
                                                i12++;
                                            }
                                            if (numValueOf2 == null) {
                                                int iM7786a5 = m7786a(listAdapter);
                                                if (iM7786a5 < 0) {
                                                    iM7786a5 = 0;
                                                }
                                                m7791d(listAdapter, AbstractC3754e0.m7909r(iM7787b, 0, iM7786a5), objM7789c);
                                                return true;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
                if (!this.f12189F) {
                    this.f12189F = true;
                    try {
                        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.base.preference.Preference", this.f12190a.f12145c);
                        if (clsLoadClass != null && (objNewInstance2 = KavaReflector.newInstance(KavaReflector.findConstructor(clsLoadClass, Context.class), activity)) != null) {
                            m7765C0(objNewInstance2);
                            m7766D0("历史发言记录", objNewInstance2, true);
                            m7766D0(HttpUrl.FRAGMENT_ENCODE_SET, objNewInstance2, false);
                            m7818B0(objNewInstance2, activity);
                            int iM7786a6 = m7786a(listAdapter);
                            int i13 = 0;
                            while (true) {
                                if (i13 >= iM7786a6) {
                                    objM7789c2 = null;
                                    break;
                                }
                                objM7789c2 = m7789c(i13, listAdapter);
                                if (objM7789c2 != null) {
                                    break;
                                }
                                i13++;
                            }
                            if (objM7789c2 != null) {
                                Object objInvokeMethod = KavaReflector.invokeMethod(objM7789c2, "getLayoutResource", new Object[0]);
                                Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
                                if (number != null && number.intValue() != 0) {
                                    KavaReflector.invokeMethod(objNewInstance2, "setLayoutResource", Integer.valueOf(number.intValue()));
                                }
                            }
                            int iM7787b2 = m7787b(listAdapter, null);
                            ArrayList<Method> arrayListM7788b02 = m7788b0(listAdapter.getClass());
                            if (arrayListM7788b02.isEmpty()) {
                                objArr = false;
                                if (objArr != false) {
                                    this.f12189F = true;
                                    try {
                                        KavaReflector.invokeMethod(listAdapter, "notifyDataSetChanged", new Object[0]);
                                        Iterator it = m7788b0(listAdapter.getClass()).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            Method method2 = (Method) next;
                                            if (AbstractC1416l.m3825a(method2.getName(), "notifyDataSetChanged")) {
                                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                                parameterTypes.getClass();
                                                if (parameterTypes.length == 0) {
                                                    obj = next;
                                                    break;
                                                }
                                            }
                                        }
                                        Method method3 = (Method) obj;
                                        if (method3 != null) {
                                            KavaReflector.invoke(method3, listAdapter, new Object[0]);
                                        }
                                        return true;
                                    } finally {
                                    }
                                }
                            } else {
                                for (Method method4 : arrayListM7788b02) {
                                    if (method4.getParameterTypes().length == 2 && AbstractC1416l.m3825a(method4.getParameterTypes()[1], Integer.TYPE) && method4.getParameterTypes()[0].isAssignableFrom(objNewInstance2.getClass()) && KavaReflector.invokeSuccessfully(method4, listAdapter, objNewInstance2, Integer.valueOf(iM7787b2))) {
                                        objArr = true;
                                        break;
                                    }
                                }
                                objArr = false;
                                if (objArr != false) {
                                }
                            }
                        }
                    } finally {
                        this.f12189F = false;
                    }
                }
            }
            Object objInvokeMethod2 = KavaReflector.invokeMethod(activity, "getPreferenceScreen", new Object[0]);
            if (objInvokeMethod2 != null) {
                Iterator it2 = m7788b0(objInvokeMethod2.getClass()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Method method5 = (Method) it2.next();
                    if (method5.getParameterTypes().length != 1 || !AbstractC1416l.m3825a(method5.getParameterTypes()[0], String.class) || !AbstractC3149m.m6709h0(method5.getReturnType().getName(), "Preference", false) || (objInvoke = KavaReflector.invoke(method5, objInvokeMethod2, "hchat_group_member_history")) == null || !m7801j0(objInvoke).equals("hchat_group_member_history")) {
                        objInvoke = null;
                    }
                    if (objInvoke != null) {
                        obj = objInvoke;
                        break;
                    }
                }
                if (obj != null) {
                    m7818B0(obj, activity);
                    m7792d0(objInvokeMethod2);
                    return true;
                }
                Class<?> clsLoadClass2 = KavaReflector.loadClass("com.tencent.mm.ui.base.preference.Preference", this.f12190a.f12145c);
                if (clsLoadClass2 != null && (objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(clsLoadClass2, Context.class), activity)) != null) {
                    m7765C0(objNewInstance);
                    m7766D0("历史发言记录", objNewInstance, true);
                    m7818B0(objNewInstance, activity);
                    int iM7786a7 = m7786a(objInvokeMethod2);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= iM7786a7) {
                            int i15 = 0;
                            while (true) {
                                if (i15 < iM7786a7) {
                                    Object objM7789c3 = m7789c(i15, objInvokeMethod2);
                                    if (m7773L(objM7789c3, m7801j0(objM7789c3))) {
                                        i9 = i15;
                                        break;
                                    }
                                    i15++;
                                } else if (iM7786a7 >= 0) {
                                    i9 = iM7786a7;
                                }
                            }
                        } else {
                            if (m7775M(m7789c(i14, objInvokeMethod2))) {
                                i9 = i14 + 1;
                                break;
                            }
                            i14++;
                        }
                    }
                    boolean zM7791d = m7791d(objInvokeMethod2, i9, objNewInstance);
                    if (zM7791d) {
                        m7792d0(objInvokeMethod2);
                    }
                    return zM7791d;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x006a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x006d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:593:0x045f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00c8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[PHI: r6
  0x005d: PHI (r6v10 android.view.View) = (r6v1 android.view.View), (r6v15 android.view.View) binds: [B:36:0x006a, B:30:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0411 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.util.List] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7821E(View view, TextView textView, TextView textView2, Object obj, Object obj2, C3756f0 c3756f0) {
        View viewM7807n;
        C3767q c3767q;
        C3767q c3767q2;
        ViewGroup.LayoutParams layoutParams;
        C3771u c3771u;
        View view2;
        ViewGroup viewGroup;
        C3767q c3767q3;
        C3771u c3771u2;
        TextView textView3;
        Context context;
        C3767q c3767q4;
        C3771u c3771u3;
        ViewGroup viewGroup2;
        C3752d0 c3752d0;
        C3756f0 c3756f02;
        String strM6684e;
        TextView textView4;
        C3775y c3775y;
        C3756f0 c3756f03;
        ViewGroup viewGroup3;
        int i9;
        int i10;
        boolean z9;
        float f3;
        RelativeLayout.LayoutParams layoutParams2;
        int i11;
        float f10;
        C3769s c3769s;
        ?? arrayList;
        int i12;
        View view3;
        C3771u c3771u4;
        View viewM7802k;
        View viewM7802k2;
        C3752d0 c3752d02 = this;
        View view4 = view;
        TextView textView5 = textView;
        Object obj3 = obj2;
        C3756f0 c3756f04 = c3756f0;
        C3776z c3776z = c3752d02.f12185B;
        String str = c3776z.f12353b;
        boolean z10 = c3756f04.f12251l ? c3752d02.f12186C : c3752d02.f12187D;
        boolean z11 = z10 && str.equals("avatar_below");
        if (z11) {
            c3767q2 = null;
        } else {
            View viewM7842o = c3752d02.m7842o(obj);
            if (viewM7842o != null) {
                boolean zM7780P = m7780P(viewM7842o, view4);
                View view5 = viewM7842o;
                if (!zM7780P) {
                    view5 = null;
                }
                if (view5 == null) {
                    View viewM7807n2 = m7807n(view4, true);
                    viewM7807n = viewM7807n2;
                    if (viewM7807n2 == null) {
                        viewM7807n = m7807n(view4, false);
                    }
                    if (viewM7807n != null) {
                        view5 = viewM7807n;
                    } else if (view5 == null) {
                        c3767q = null;
                        c3767q2 = c3767q;
                    }
                    Object parent = view5.getParent();
                    View view6 = parent instanceof View ? (View) parent : null;
                    RelativeLayout relativeLayout = null;
                    ViewGroup viewGroup4 = null;
                    View view7 = view5;
                    while (true) {
                        if (view7 == view4) {
                            break;
                        }
                        ViewParent parent2 = view7.getParent();
                        ViewGroup viewGroup5 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                        if (viewGroup5 == null) {
                            break;
                        }
                        ViewGroup viewGroup6 = viewGroup4;
                        if (viewGroup5.getClass().getName().equals("com.tencent.mm.ui.base.MaskLayout")) {
                            viewGroup6 = viewGroup5;
                        }
                        if (viewGroup5 instanceof RelativeLayout) {
                            relativeLayout = (RelativeLayout) viewGroup5;
                        }
                        RelativeLayout relativeLayout2 = relativeLayout;
                        if (viewGroup5 == view4) {
                            if (relativeLayout2 != null) {
                                boolean z12 = (!z10 && view5.getVisibility() == 0 && (viewGroup6 == null || (layoutParams = viewGroup6.getLayoutParams()) == null || layoutParams.width != 0)) ? false : true;
                                if (z12) {
                                    if (viewGroup6 != null) {
                                        view5 = viewGroup6;
                                    } else if (view6 != null) {
                                        view5 = view6;
                                    }
                                }
                                c3767q = new C3767q(relativeLayout2, view5, z12);
                            }
                        } else {
                            if (m7779O(viewGroup5)) {
                                break;
                            }
                            relativeLayout = relativeLayout2;
                            view7 = viewGroup5;
                            viewGroup4 = viewGroup6;
                        }
                    }
                    c3767q2 = c3767q;
                } else {
                    viewM7807n = (view5.getClass().getName().equals("com.tencent.mm.ui.chatting.view.ChattingAvatarImageView") && (z10 || m7782Q(view5))) ? view5 : null;
                    if (viewM7807n != null) {
                    }
                }
            }
        }
        C3767q c3767q5 = (str.equals("message_bottom") || z11) ? null : c3767q2;
        if (c3767q5 == null) {
            c3752d02.m7856y0(view4, null);
        }
        if (c3767q5 != null) {
            c3771u = null;
        } else {
            if (textView5 == null) {
                return false;
            }
            ViewParent parent3 = textView5.getParent();
            ViewGroup viewGroup7 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
            if (viewGroup7 == null || !((viewGroup7 instanceof RelativeLayout) || (viewGroup7 instanceof LinearLayout))) {
                c3771u4 = null;
                c3771u = c3771u4;
            } else {
                View viewM7816A = c3752d02.m7816A(obj, viewGroup7);
                if (viewM7816A == null || (viewM7802k2 = m7802k(viewM7816A, viewGroup7)) == null) {
                    View viewM7832W = c3752d02.m7832W(obj, viewGroup7, textView5);
                    if (viewM7832W != null && (viewM7802k = m7802k(viewM7832W, viewGroup7)) != null) {
                        c3771u4 = new C3771u(viewGroup7, viewM7802k, viewM7832W);
                    }
                } else {
                    c3771u4 = new C3771u(viewGroup7, viewM7802k2, viewM7816A);
                }
                c3771u = c3771u4;
            }
        }
        if (c3767q5 == null) {
            view2 = null;
        } else {
            C3767q c3767q6 = c3767q5.f12323c ? c3767q5 : null;
            if (c3767q6 != null) {
                RelativeLayout relativeLayout3 = c3767q6.f12321a;
                View viewM7816A2 = c3752d02.m7816A(obj, relativeLayout3);
                if (viewM7816A2 == null) {
                    viewM7816A2 = c3752d02.m7832W(obj, relativeLayout3, null);
                }
                view2 = viewM7816A2;
            }
        }
        if (c3767q5 != null) {
            viewGroup = c3767q5.f12321a;
        } else {
            if (c3771u == null) {
                return false;
            }
            viewGroup = c3771u.f12336a;
        }
        boolean z13 = viewGroup instanceof RelativeLayout;
        if (!z13 && !(viewGroup instanceof LinearLayout)) {
            return false;
        }
        if (textView2 == null) {
            int childCount = viewGroup.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    c3767q3 = c3767q5;
                    c3771u2 = c3771u;
                    textView3 = null;
                    break;
                }
                c3767q3 = c3767q5;
                View childAt = viewGroup.getChildAt(i13);
                c3771u2 = c3771u;
                if (childAt instanceof TextView) {
                    TextView textView6 = (TextView) childAt;
                    if (AbstractC1416l.m3825a(textView6.getTag(), "hchat_message_details_view")) {
                        textView3 = textView6;
                        break;
                    }
                }
                i13++;
                c3752d02 = this;
                view4 = view;
                textView5 = textView;
                obj3 = obj2;
                c3771u = c3771u2;
                view2 = view2;
                str = str;
                viewGroup = viewGroup;
                z13 = z13;
                c3767q5 = c3767q3;
                c3756f04 = c3756f0;
            }
            if (textView3 == null) {
                if (textView5 == null || (context = textView5.getContext()) == null) {
                    context = view4.getContext();
                }
                textView3 = new TextView(context);
                textView3.setTag("hchat_message_details_view");
            }
        } else {
            textView3 = AbstractC1416l.m3825a(textView2.getTag(), "hchat_message_details_view") ? textView2 : null;
            if (textView3 != null) {
                c3767q3 = c3767q5;
                c3771u2 = c3771u;
            }
        }
        TextView textView7 = textView3;
        if (textView7.getParent() != viewGroup) {
            c3752d02.m7852u0(view4, textView7);
            ViewParent parent4 = textView7.getParent();
            ViewGroup viewGroup8 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
            if (viewGroup8 != null) {
                viewGroup8.removeView(textView7);
            }
        }
        Set set = c3752d02.f12210u;
        set.getClass();
        synchronized (set) {
            c3752d02.f12210u.add(textView7);
        }
        C3776z c3776z2 = c3752d02.f12185B;
        long j3 = c3756f04.f12250k;
        Long lValueOf = Long.valueOf(j3);
        if (j3 <= 0) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis();
        boolean z14 = z13;
        C1425u c1425u = new C1425u();
        ViewGroup viewGroup9 = viewGroup;
        C1425u c1425u2 = new C1425u();
        if (c3776z2.f12354c.equals("${time}")) {
            String str2 = (String) c1425u.f4738g;
            if (str2 == null) {
                str2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), ZoneId.systemDefault()).format(c3776z2.f12356e);
                c1425u.f4738g = str2;
                str2.getClass();
            }
            c3752d0 = this;
            strM6684e = str2;
            c3756f02 = c3756f04;
            c3767q4 = c3767q3;
            c3771u3 = c3771u2;
            viewGroup2 = viewGroup9;
        } else {
            c3767q4 = c3767q3;
            c3771u3 = c3771u2;
            viewGroup2 = viewGroup9;
            c3752d0 = this;
            c3756f02 = c3756f04;
            strM6684e = f12176G.m6684e(c3776z2.f12354c, new C2924a(new C3761k(c3752d0, jLongValue, c1425u2, c3756f04, c1425u, c3776z2), 4));
        }
        if (TextUtils.equals(textView7.getText(), strM6684e)) {
            textView4 = textView7;
        } else {
            textView4 = textView7;
            textView4.setText(strM6684e);
        }
        c3752d0.m7837e(textView4);
        if (textView4.getAlpha() != 1.0f) {
            textView4.setAlpha(1.0f);
        }
        if (!textView4.getIncludeFontPadding()) {
            textView4.setIncludeFontPadding(true);
        }
        Context context2 = textView4.getContext();
        context2.getClass();
        int iM7804l = m7804l(context2, 4.0f);
        Context context3 = textView4.getContext();
        context3.getClass();
        int iM7804l2 = m7804l(context3, 2.0f);
        if (textView4.getPaddingLeft() != iM7804l || textView4.getPaddingTop() != iM7804l2 || textView4.getPaddingRight() != iM7804l || textView4.getPaddingBottom() != iM7804l2) {
            textView4.setPadding(iM7804l, iM7804l2, iM7804l, iM7804l2);
        }
        float f11 = c3752d0.f12185B.f12357f;
        if (Math.abs((textView4.getTextSize() / textView4.getResources().getDisplayMetrics().scaledDensity) - f11) > 0.01f) {
            textView4.setTextSize(2, f11);
        }
        synchronized (c3752d0.f12211v) {
            c3775y = (C3775y) c3752d0.f12211v.get(textView4);
        }
        if (c3776z.f12361j) {
            if (textView4.isClickable()) {
                if ((c3775y != null ? c3775y.f12350d : null) != obj3) {
                }
                textView4.setClickable(true);
            } else {
                textView4.setOnClickListener(new ViewOnClickListenerC2368l(obj3, c3756f02, c3752d0, 1));
                textView4.setClickable(true);
            }
        } else if (textView4.isClickable()) {
            textView4.setOnClickListener(null);
            textView4.setClickable(false);
        }
        C3767q c3767q7 = c3767q4;
        if (c3767q7 != null) {
            boolean z15 = c3756f02.f12251l;
            RelativeLayout relativeLayout4 = c3767q7.f12321a;
            ViewParent parent5 = textView4.getParent();
            ViewGroup viewGroup10 = parent5 instanceof ViewGroup ? (ViewGroup) parent5 : null;
            boolean z16 = viewGroup10 == relativeLayout4;
            if (viewGroup10 != null && !z16) {
                viewGroup10.removeView(textView4);
            }
            Context context4 = textView4.getContext();
            context4.getClass();
            int iM7804l3 = m7804l(context4, c3752d0.f12185B.f12358g);
            if (z16) {
                ViewGroup.LayoutParams layoutParams3 = textView4.getLayoutParams();
                f3 = 0.0f;
                layoutParams2 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams2 == null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                }
                if (textView4.getMaxLines() == 1) {
                    textView4.setSingleLine(true);
                    textView4.setMaxLines(1);
                    i11 = 0;
                    textView4.setHorizontallyScrolling(false);
                } else {
                    i11 = 0;
                }
                if (textView4.getEllipsize() != null) {
                    textView4.setEllipsize(null);
                }
                if (textView4.getMinWidth() != 0) {
                    textView4.setMinWidth(i11);
                }
                if (textView4.getMaxWidth() != Integer.MAX_VALUE) {
                    textView4.setMaxWidth(Integer.MAX_VALUE);
                }
                if (textView4.getTranslationX() != f3) {
                    f10 = f3;
                } else {
                    f10 = f3;
                    textView4.setTranslationX(f10);
                }
                if (textView4.getTranslationY() != f10) {
                    textView4.setTranslationY(f10);
                }
                if (textView4.getGravity() != 17) {
                    textView4.setGravity(17);
                }
                if (textView4.getTextAlignment() != 4) {
                    textView4.setTextAlignment(4);
                }
                if (z16 || c3767q7.f12323c) {
                    textView4.setVisibility(4);
                }
                textView4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = !str.equals("avatar_above") ? textView4.getMeasuredHeight() + iM7804l3 : 0;
                c3752d0.m7856y0(view4, relativeLayout4);
                synchronized (c3752d0.f12212w) {
                    c3769s = (C3769s) c3752d0.f12212w.get(relativeLayout4);
                }
                int paddingTop = c3769s != null ? c3769s.f12326a : relativeLayout4.getPaddingTop();
                int paddingBottom = c3769s != null ? c3769s.f12327b : relativeLayout4.getPaddingBottom();
                if (measuredHeight < 0) {
                    measuredHeight = 0;
                }
                int i14 = paddingTop + (str.equals("avatar_above") ? measuredHeight : 0);
                int i15 = paddingBottom + (str.equals("avatar_below") ? measuredHeight : 0);
                boolean clipToPadding = c3769s != null ? c3769s.f12330e : relativeLayout4.getClipToPadding();
                if (c3769s != null) {
                    arrayList = c3769s.f12331f;
                } else {
                    arrayList = new ArrayList();
                    View view8 = relativeLayout4;
                    while (view8 != null && view8 != view4) {
                        boolean z17 = z15;
                        if (view8 instanceof ViewGroup) {
                            i12 = iM7804l3;
                            ViewGroup viewGroup11 = (ViewGroup) view8;
                            view3 = view8;
                            arrayList.add(new C3768r(new WeakReference(view8), viewGroup11.getClipChildren()));
                            viewGroup11.setClipChildren(false);
                        } else {
                            i12 = iM7804l3;
                            view3 = view8;
                        }
                        Object parent6 = view3.getParent();
                        view8 = parent6 instanceof View ? (View) parent6 : null;
                        view4 = view;
                        iM7804l3 = i12;
                        z15 = z17;
                    }
                }
                boolean z18 = z15;
                int i16 = iM7804l3;
                ?? r26 = arrayList;
                Iterator it = r26.iterator();
                while (it.hasNext()) {
                    ViewGroup viewGroup12 = (ViewGroup) ((C3768r) it.next()).f12324a.get();
                    if (viewGroup12 != null) {
                        viewGroup12.setClipChildren(false);
                    }
                }
                if (relativeLayout4.getPaddingTop() != i14 || relativeLayout4.getPaddingBottom() != i15) {
                    relativeLayout4.setPadding(relativeLayout4.getPaddingLeft(), i14, relativeLayout4.getPaddingRight(), i15);
                }
                relativeLayout4.setClipToPadding(false);
                synchronized (c3752d0.f12212w) {
                    c3752d0.f12212w.put(relativeLayout4, new C3769s(paddingTop, paddingBottom, i14, i15, clipToPadding, r26));
                }
                if (!z16) {
                    relativeLayout4.addView(textView4, layoutParams2);
                }
                String str3 = str;
                RelativeLayout relativeLayout5 = c3767q7.f12321a;
                TextView textView8 = textView4;
                c3756f03 = c3756f0;
                view4 = view;
                textView4 = textView8;
                if (m7764A0(textView4, relativeLayout5, c3752d0.f12214y, new C3763m(c3752d0, textView8, view, c3767q7, view2, str3, i16, z18, 0, relativeLayout5))) {
                    c3752d0.m7846r0(textView4, !z16);
                    z9 = true;
                } else {
                    relativeLayout4.removeView(textView4);
                    c3752d0.m7856y0(view4, null);
                    z9 = false;
                }
            } else {
                f3 = 0.0f;
            }
            if (layoutParams2 == null) {
            }
            if (textView4.getMaxLines() == 1) {
            }
            if (textView4.getEllipsize() != null) {
            }
            if (textView4.getMinWidth() != 0) {
            }
            if (textView4.getMaxWidth() != Integer.MAX_VALUE) {
            }
            if (textView4.getTranslationX() != f3) {
            }
            if (textView4.getTranslationY() != f10) {
            }
            if (textView4.getGravity() != 17) {
            }
            if (textView4.getTextAlignment() != 4) {
            }
            if (z16) {
                textView4.setVisibility(4);
                textView4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (!str.equals("avatar_above")) {
                }
                c3752d0.m7856y0(view4, relativeLayout4);
                synchronized (c3752d0.f12212w) {
                }
            }
        } else {
            c3756f03 = c3756f02;
            C3771u c3771u5 = c3771u3;
            if (c3771u5 == null) {
                return false;
            }
            View view9 = c3771u5.f12337b;
            View view10 = c3771u5.f12338c;
            boolean z19 = z10 || (c3767q2 != null && c3767q2.f12323c);
            if (textView4.getMaxLines() != Integer.MAX_VALUE) {
                textView4.setSingleLine(false);
                textView4.setMaxLines(Integer.MAX_VALUE);
                textView4.setHorizontallyScrolling(false);
            }
            if (textView4.getEllipsize() != null) {
                viewGroup3 = null;
                textView4.setEllipsize(null);
            } else {
                viewGroup3 = null;
            }
            if (textView4.getMaxWidth() != Integer.MAX_VALUE) {
                textView4.setMaxWidth(Integer.MAX_VALUE);
            }
            ViewParent parent7 = textView4.getParent();
            ViewGroup viewGroup13 = parent7 instanceof ViewGroup ? (ViewGroup) parent7 : viewGroup3;
            ViewGroup viewGroup14 = viewGroup2;
            boolean z20 = viewGroup13 == viewGroup14;
            if (viewGroup13 != null && !z20) {
                viewGroup13.removeView(textView4);
            }
            C3776z c3776z3 = c3752d0.f12185B;
            Context context5 = textView4.getContext();
            context5.getClass();
            int iM7804l4 = m7804l(context5, c3776z3.f12359h);
            Context context6 = textView4.getContext();
            context6.getClass();
            int iM7804l5 = m7804l(context6, c3776z3.f12360i);
            if (textView4.getTranslationX() != 0.0f) {
                textView4.setTranslationX(0.0f);
            }
            if (textView4.getTranslationY() != 0.0f) {
                textView4.setTranslationY(0.0f);
            }
            if (z14) {
                if (view9.getId() == -1) {
                    view9.setId(View.generateViewId());
                }
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(3, view9.getId());
                Context context7 = textView4.getContext();
                context7.getClass();
                layoutParams4.topMargin = m7804l(context7, 2.0f);
                if (c3756f03.f12251l) {
                    if (z19) {
                        layoutParams4.addRule(21);
                        ViewGroup.LayoutParams layoutParams5 = textView4.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams5 : null;
                        if (layoutParams6 != null) {
                            layoutParams4.setMarginEnd(layoutParams6.getMarginEnd());
                            layoutParams4.rightMargin = layoutParams6.rightMargin;
                        }
                    } else {
                        layoutParams4.addRule(21);
                        layoutParams4.setMarginEnd(iM7804l5);
                        layoutParams4.rightMargin = iM7804l5;
                    }
                    if (textView4.getGravity() != 8388613) {
                        textView4.setGravity(8388613);
                    }
                    if (textView4.getTextAlignment() != 3) {
                        textView4.setTextAlignment(3);
                    }
                } else {
                    if (z19) {
                        layoutParams4.addRule(20);
                        ViewGroup.LayoutParams layoutParams7 = textView4.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams7 : null;
                        if (layoutParams8 != null) {
                            layoutParams4.setMarginStart(layoutParams8.getMarginStart());
                            layoutParams4.leftMargin = layoutParams8.leftMargin;
                        }
                    } else {
                        layoutParams4.addRule(20);
                        layoutParams4.setMarginStart(iM7804l4);
                        layoutParams4.leftMargin = iM7804l4;
                    }
                    if (textView4.getGravity() != 8388611) {
                        textView4.setGravity(8388611);
                    }
                    if (textView4.getTextAlignment() != 2) {
                        textView4.setTextAlignment(2);
                    }
                }
                int i17 = z19 ? 4 : 0;
                if (textView4.getVisibility() != i17) {
                    textView4.setVisibility(i17);
                }
                if (z20) {
                    ViewGroup.LayoutParams layoutParams9 = textView4.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams10 = layoutParams9 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams9 : null;
                    if (layoutParams10 == null || layoutParams10.width != layoutParams4.width || layoutParams10.height != layoutParams4.height || layoutParams10.leftMargin != layoutParams4.leftMargin || layoutParams10.topMargin != layoutParams4.topMargin || layoutParams10.rightMargin != layoutParams4.rightMargin || layoutParams10.bottomMargin != layoutParams4.bottomMargin || layoutParams10.getMarginStart() != layoutParams4.getMarginStart() || layoutParams10.getMarginEnd() != layoutParams4.getMarginEnd() || !Arrays.equals(layoutParams10.getRules(), layoutParams4.getRules())) {
                        textView4.setLayoutParams(layoutParams4);
                    }
                } else {
                    viewGroup14.addView(textView4, layoutParams4);
                }
                if (z19) {
                    TextView textView9 = textView4;
                    c3752d0.m7857z0(textView9, viewGroup14, view10, c3756f03.f12251l, 0);
                    textView4 = textView9;
                } else {
                    m7796h(textView4, c3752d0.f12214y);
                }
                c3752d0.m7846r0(textView4, !z20);
                z9 = true;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                Context context8 = textView4.getContext();
                context8.getClass();
                marginLayoutParams.topMargin = m7804l(context8, 2.0f);
                if (c3756f03.f12251l) {
                    if (!z19) {
                        marginLayoutParams.setMarginEnd(iM7804l5);
                    }
                    i9 = 8388613;
                    if (textView4.getGravity() != 8388613) {
                        textView4.setGravity(8388613);
                    }
                    if (textView4.getTextAlignment() != 3) {
                        textView4.setTextAlignment(3);
                    }
                    i10 = 8388611;
                } else {
                    i9 = 8388613;
                    if (!z19) {
                        marginLayoutParams.setMarginStart(iM7804l4);
                    }
                    i10 = 8388611;
                    if (textView4.getGravity() != 8388611) {
                        textView4.setGravity(8388611);
                    }
                    if (textView4.getTextAlignment() != 2) {
                        textView4.setTextAlignment(2);
                    }
                }
                if (viewGroup14 instanceof LinearLayout) {
                    LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(marginLayoutParams);
                    if (z19) {
                        if (c3756f03.f12251l) {
                            i10 = i9;
                        }
                        layoutParams11.gravity = i10;
                        ViewGroup.LayoutParams layoutParams12 = textView4.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
                        if (marginLayoutParams2 != null) {
                            if (c3756f03.f12251l) {
                                layoutParams11.setMarginEnd(marginLayoutParams2.getMarginEnd());
                                layoutParams11.rightMargin = marginLayoutParams2.rightMargin;
                            } else {
                                layoutParams11.setMarginStart(marginLayoutParams2.getMarginStart());
                                layoutParams11.leftMargin = marginLayoutParams2.leftMargin;
                            }
                        }
                        if (textView4.getVisibility() != 4) {
                            textView4.setVisibility(4);
                        }
                    } else if (textView4.getVisibility() != 0) {
                        textView4.setVisibility(0);
                    }
                    int iIndexOfChild = viewGroup14.indexOfChild(view9);
                    Integer numValueOf = Integer.valueOf(iIndexOfChild);
                    if (iIndexOfChild < 0) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() + 1 : ((LinearLayout) viewGroup14).getChildCount();
                    if (!z20) {
                        viewGroup14.addView(textView4, iIntValue, layoutParams11);
                    } else if (viewGroup14.indexOfChild(textView4) != iIntValue) {
                        viewGroup14.removeView(textView4);
                        int iIndexOfChild2 = viewGroup14.indexOfChild(view9);
                        Integer numValueOf2 = iIndexOfChild2 >= 0 ? Integer.valueOf(iIndexOfChild2) : null;
                        viewGroup14.addView(textView4, numValueOf2 != null ? numValueOf2.intValue() + 1 : ((LinearLayout) viewGroup14).getChildCount(), layoutParams11);
                    } else {
                        ViewGroup.LayoutParams layoutParams13 = textView4.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams14 = layoutParams13 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams13 : null;
                        if (layoutParams14 == null || layoutParams14.width != layoutParams11.width || layoutParams14.height != layoutParams11.height || layoutParams14.leftMargin != layoutParams11.leftMargin || layoutParams14.topMargin != layoutParams11.topMargin || layoutParams14.rightMargin != layoutParams11.rightMargin || layoutParams14.bottomMargin != layoutParams11.bottomMargin || layoutParams14.getMarginStart() != layoutParams11.getMarginStart() || layoutParams14.getMarginEnd() != layoutParams11.getMarginEnd() || layoutParams14.gravity != layoutParams11.gravity || layoutParams14.weight != layoutParams11.weight) {
                            textView4.setLayoutParams(layoutParams11);
                        }
                    }
                    if (z19) {
                        TextView textView10 = textView4;
                        c3752d0.m7857z0(textView10, viewGroup14, view10, c3756f03.f12251l, 0);
                        textView4 = textView10;
                    } else {
                        m7796h(textView4, c3752d0.f12214y);
                    }
                    c3752d0.m7846r0(textView4, !z20);
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
        }
        if (z9) {
            c3752d0.m7848s0(view4, textView4, textView, obj, obj3, c3756f03);
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public final boolean m7822E0(Object obj, String str) {
        Integer numM7844p0;
        Object c3959f;
        if (obj == null || (numM7844p0 = m7844p0()) == null) {
            return false;
        }
        boolean z9 = false;
        for (Method method : m7788b0(obj.getClass())) {
            if (method.getParameterTypes().length == 2 && AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.TYPE) && method.getParameterTypes()[1].isAssignableFrom(String.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(obj, numM7844p0, str);
                    c3959f = Boolean.TRUE;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Object obj2 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = obj2;
                }
                if (((Boolean) c3959f).booleanValue()) {
                    z9 = true;
                }
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final boolean m7823F() {
        Object next;
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.profile.ui.ContactInfoUI", this.f12190a.f12145c);
        if (clsLoadClass == null) {
            return false;
        }
        Set set = this.f12196g;
        boolean zAdd = set.add(clsLoadClass);
        Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(clsLoadClass, "initView", new Class[0]);
        boolean zM7817B = methodFindMethodRecursive != null ? m7817B(methodFindMethodRecursive, new C3749c(this, 0)) : false;
        Iterator it = m7788b0(clsLoadClass).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((Method) next).getName(), "onPreferenceTreeClick")) {
                break;
            }
        }
        Method method = (Method) next;
        if (method != null) {
            zM7817B = m7819C(method, new C3749c(this, 1)) || zM7817B;
        }
        if (!zM7817B && zAdd) {
            set.remove(clsLoadClass);
        }
        return zM7817B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x0067 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sf.f] */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7824G() {
        Object c3959f;
        Object c3959f2;
        String strM7836a0 = m7836a0();
        C3742g c3742g = this.f12190a;
        ClassLoader classLoader = c3742g.f12145c;
        SharedPreferences sharedPreferences = this.f12194e;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM7836a0, classLoader, "chat_message_view_bind");
        C2026t c2026t = this.f12191b;
        Object obj = null;
        if (methodM2087c == null) {
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("MicroMsg.MvvmChattingItem", "[onBindView]"));
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                c3959f = new ArrayList();
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    Method methodM7829O0 = m7829O0((C1730o) it.next());
                    if (methodM7829O0 != null) {
                        c3959f.add(methodM7829O0);
                    }
                }
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            Object obj2 = c3959f;
            if (thM8182b != null) {
                c2026t.invoke("消息显示时间定位失败", thM8182b);
                obj2 = C4173t.f13710g;
            }
            Iterator it2 = ((List) obj2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (m7828K((Method) next)) {
                    obj = next;
                    break;
                }
            }
            methodM2087c = (Method) obj;
            if (methodM2087c != null) {
                C0828b.m2092h(sharedPreferences, strM7836a0, "chat_message_view_bind", methodM2087c);
            } else {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7836a0)) {
                        editorEdit.clear().putString("cache.key", strM7836a0);
                    }
                    editorEdit.remove("chat_message_view_bind").apply();
                } catch (Throwable unused) {
                }
            }
        } else {
            if (!m7828K(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c == null) {
            }
        }
        if (methodM2087c == null) {
            return false;
        }
        Set set = this.f12195f;
        if (!set.add(methodM2087c)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(methodM2087c, new C0219e(this, 24));
            c3959f2 = Boolean.TRUE;
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
        if (thM8182b2 != null) {
            set.remove(methodM2087c);
            c2026t.invoke("消息显示时间Hook安装失败: " + methodM2087c.getName(), thM8182b2);
            c3959f2 = Boolean.FALSE;
        }
        return ((Boolean) c3959f2).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:134:0x0273 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7825H() {
        Object c3959f;
        Object next;
        Object next2;
        Object c3959f2;
        Class<?> clsLoadClass;
        String strM7836a0 = m7836a0();
        C3742g c3742g = this.f12190a;
        ClassLoader classLoader = c3742g.f12145c;
        DexKitBridge dexKitBridge = c3742g.f12146d;
        SharedPreferences sharedPreferences = this.f12194e;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM7836a0, classLoader, "lucky_money_time_formatter");
        C2026t c2026t = this.f12191b;
        if (methodM2087c == null) {
            try {
                C0570e c0570e = new C0570e();
                c0570e.f1763g = AbstractC4165l.m8375L0(new String[]{"com.tencent.mm.plugin.luckymoney.model"});
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, AbstractC0000a.m99x0("HH:mm"));
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                ArrayList arrayList = new ArrayList();
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    Method methodM7829O0 = m7829O0((C1730o) it.next());
                    if (methodM7829O0 != null) {
                        arrayList.add(methodM7829O0);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (m7777N((Method) next)) {
                        break;
                    }
                }
                c3959f = (Method) next;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c2026t.invoke("红包详情时间格式化定位失败", thM8182b);
                c3959f = null;
            }
            methodM2087c = (Method) c3959f;
            if (methodM2087c != null) {
                C0828b.m2092h(sharedPreferences, strM7836a0, "lucky_money_time_formatter", methodM2087c);
            } else {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7836a0)) {
                        editorEdit.clear().putString("cache.key", strM7836a0);
                    }
                    editorEdit.remove("lucky_money_time_formatter").apply();
                } catch (Throwable unused) {
                }
            }
        } else {
            if (!m7777N(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c == null) {
            }
        }
        boolean z9 = false;
        boolean zM7817B = methodM2087c != null ? m7817B(methodM2087c, new C3749c(this, 4)) : false;
        Method methodM7784S = m7784S(this, "lucky_money_detail_bind_direct", AbstractC0000a.m101y0("MicroMsg.LuckyMoneyDetailUI", "try get user contact: %s"));
        boolean z10 = true;
        if (methodM7784S != null) {
            zM7817B = m7817B(methodM7784S, new C3749c(this, 5)) || zM7817B;
        }
        boolean z11 = zM7817B;
        char c10 = 2;
        List listM101y0 = AbstractC0000a.m101y0(AbstractC0000a.m101y0("MicroMsg.NetSceneOpenLuckyMoney", "/cgi-bin/mmpay-bin/openwxhb"), AbstractC0000a.m101y0("MicroMsg.NetSceneLuckyMoneyDetail", "/cgi-bin/mmpay-bin/qrydetailwxhb"));
        String strM7836a02 = m7836a0();
        Context context = c3742g.f12143a;
        ClassLoader classLoader2 = c3742g.f12145c;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_extra_class_cache");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i9 = 0;
        for (Object obj : listM101y0) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            List list = (List) obj;
            boolean z12 = z9;
            String strM2249l = AbstractC0921a.m2249l(i9, "lucky_money_scene_classes_");
            boolean z13 = z10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM7836a02);
            char c11 = c10;
            sb2.append("_");
            sb2.append(strM2249l);
            String string = sharedPreferencesM8640c.getString(sb2.toString(), null);
            if (string != null && (clsLoadClass = KavaReflector.loadClass(string, classLoader2)) != null) {
                linkedHashSet.add(clsLoadClass);
            }
            if (linkedHashSet.size() <= i9) {
                try {
                    C0568c c0568c = new C0568c();
                    C1243a c1243a = new C1243a();
                    C1243a.m3357r0(c1243a, list);
                    c0568c.f1762h = c1243a;
                    C1724i c1724i = (C1724i) dexKitBridge.findClass(c0568c).m4344a();
                    c3959f2 = c1724i != null ? KavaReflector.loadClass(c1724i.m4345p().f8327g, classLoader2) : null;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                if (thM8182b2 != null) {
                    c2026t.invoke("DexKit定位类失败: ".concat(strM2249l), thM8182b2);
                    c3959f2 = null;
                }
                Class cls = (Class) c3959f2;
                if (cls != null) {
                    linkedHashSet.add(cls);
                    sharedPreferencesM8640c.edit().putString(AbstractC4855en.m9264h(strM7836a02, "_", strM2249l), cls.getName()).apply();
                } else {
                    sharedPreferencesM8640c.edit().remove(strM7836a02 + "_" + strM2249l).apply();
                }
            }
            i9 = i10;
            z9 = z12;
            z10 = z13;
            c10 = c11;
        }
        boolean z14 = z9;
        boolean z15 = z10;
        char c12 = c10;
        Iterator it3 = AbstractC4166m.m8407P1(linkedHashSet).iterator();
        while (it3.hasNext()) {
            Iterator<T> it4 = KavaReflector.declaredMethods((Class) it3.next()).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
                Method method = (Method) next2;
                if (((AbstractC1416l.m3825a(method.getName(), "onGYNetEnd") && method.getParameterTypes().length == 3 && AbstractC1416l.m3825a(method.getParameterTypes()[z14 ? 1 : 0], Integer.TYPE) && AbstractC1416l.m3825a(method.getParameterTypes()[z15 ? 1 : 0], String.class) && JSONObject.class.isAssignableFrom(method.getParameterTypes()[c12])) ? z15 ? 1 : 0 : z14 ? 1 : 0) != null) {
                    break;
                }
            }
            Method method2 = (Method) next2;
            if (method2 != null) {
                z11 = (m7819C(method2, new C3749c(this, 6)) || z11) ? z15 ? 1 : 0 : z14 ? 1 : 0;
            }
        }
        return z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x00f3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x00b0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [e8.b] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v4, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Iterable] */
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
    /* JADX INFO: renamed from: I */
    public final boolean m7826I() {
        ?? c3959f;
        Object next;
        Method methodM7784S = m7784S(this, "web_risk_intercept_enabled", AbstractC0000a.m101y0("MicroMsg.WebViewHighRiskAdH5Interceptor", "isInterceptEnabled, expt="));
        if (methodM7784S == null) {
            return false;
        }
        boolean zM7819C = m7819C(methodM7784S, new C3749c(this, 2));
        Class<?> declaringClass = methodM7784S.getDeclaringClass();
        declaringClass.getClass();
        List listM101y0 = AbstractC0000a.m101y0("http", "https");
        String strM7836a0 = m7836a0();
        C3742g c3742g = this.f12190a;
        ClassLoader classLoader = c3742g.f12145c;
        SharedPreferences sharedPreferences = this.f12194e;
        List listM2090f = C0828b.m2090f(sharedPreferences, strM7836a0, classLoader, "web_risk_url_safe");
        ?? arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (AbstractC1416l.m3825a(((Method) obj).getDeclaringClass(), declaringClass)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3369l0(5, declaringClass.getName());
                C1253k.m3367u0(c1253k, listM101y0);
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                c3959f = new ArrayList();
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    Method methodM7829O0 = m7829O0((C1730o) it.next());
                    if (methodM7829O0 != null) {
                        c3959f.add(methodM7829O0);
                    }
                }
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            ?? r32 = c3959f;
            if (thM8182b != null) {
                this.f12191b.invoke("DexKit定位失败: ".concat("web_risk_url_safe"), thM8182b);
                r32 = C4173t.f13710g;
            }
            arrayList = (List) r32;
            if (arrayList.isEmpty()) {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM7836a0)) {
                        editorEdit.clear().putString("cache.key", strM7836a0);
                    }
                    editorEdit.remove("web_risk_url_safe").apply();
                } catch (Throwable unused) {
                }
            } else {
                C0828b.f2478a.m2097j(sharedPreferences, strM7836a0, "web_risk_url_safe", arrayList);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Method method = (Method) next;
            if (AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Boolean.class)) {
                break;
            }
        }
        Method method2 = (Method) next;
        return method2 != null ? m7819C(method2, new C3749c(this, 3)) || zM7819C : zM7819C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final boolean m7827J(Object obj) {
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f12207r;
        Boolean bool = (Boolean) concurrentHashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z9 = (KavaReflector.findFieldRecursive(cls, "field_msgId") == null || KavaReflector.findFieldRecursive(cls, "field_msgSvrId") == null || KavaReflector.findFieldRecursive(cls, "field_type") == null || KavaReflector.findFieldRecursive(cls, "field_content") == null) ? false : true;
        concurrentHashMap.putIfAbsent(cls, Boolean.valueOf(z9));
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m7828K(Method method) {
        boolean z9;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length >= 3) {
            int length = parameterTypes.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                Class<?> cls = parameterTypes[i9];
                if (Boolean.valueOf(AbstractC1416l.m3825a(cls, Integer.TYPE) || AbstractC1416l.m3825a(cls, Integer.class)).booleanValue()) {
                    for (Class<?> superclass : parameterTypes) {
                        if (superclass != null) {
                            if (m7849t(superclass) == null) {
                                while (superclass != null && !superclass.equals(Object.class)) {
                                    List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                                    if (listDeclaredFields == null || !listDeclaredFields.isEmpty()) {
                                        Iterator<T> it = listDeclaredFields.iterator();
                                        while (it.hasNext()) {
                                            if (AbstractC1416l.m3825a(((Field) it.next()).getType(), View.class)) {
                                            }
                                        }
                                    }
                                    superclass = superclass.getSuperclass();
                                }
                                z9 = false;
                            }
                            z9 = true;
                            break;
                        } else {
                            z9 = false;
                        }
                        if (Boolean.valueOf(z9).booleanValue()) {
                            return true;
                        }
                    }
                } else {
                    i9++;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public final Method m7829O0(C1730o c1730o) {
        Object c3959f;
        try {
            c3959f = c1730o.m4350r(this.f12190a.f12145c);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        return (Method) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7830T(String str, Object obj, View view) {
        boolean z9;
        String str2 = this.f12185B.f12353b;
        if (this.f12209t.add(AbstractC0255e.m1033v(str, "|", obj.getClass().getName(), "|", str2))) {
            boolean z10 = m7808p(obj, this.f12200k) != null;
            if (m7842o(obj) != null) {
                z9 = true;
            } else {
                View viewM7807n = m7807n(view, true);
                if (viewM7807n == null) {
                    viewM7807n = m7807n(view, false);
                }
                if (viewM7807n == null) {
                    z9 = false;
                }
            }
            boolean z11 = m7809q(obj, this.f12202m) != null;
            C2026t c2026t = this.f12191b;
            String name = obj.getClass().getName();
            String name2 = view.getClass().getName();
            StringBuilder sbM1027p = AbstractC0255e.m1027p("消息详情绑定失败 reason=", str, " holder=", name, " root=");
            AbstractC2091b.m5173t(sbM1027p, name2, " position=", str2, " time=");
            AbstractC3199a.m6851x(sbM1027p, z10, " avatar=", z9, " clickArea=");
            sbM1027p.append(z11);
            c2026t.invoke(sbM1027p.toString(), null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final Object m7831V(Object[] objArr) {
        if (objArr != null) {
            Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
            if (objM8366C0 != null) {
                if (!Boolean.valueOf(m7851u(objM8366C0) != null).booleanValue()) {
                    objM8366C0 = null;
                }
                if (objM8366C0 != null) {
                    return objM8366C0;
                }
            }
            int length = objArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                Object obj = objArr[i9];
                if (Boolean.valueOf((obj == null || m7851u(obj) == null) ? false : true).booleanValue()) {
                    return obj;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final View m7832W(Object obj, ViewGroup viewGroup, TextView textView) {
        Object next;
        View viewM7851u = m7851u(obj);
        View viewM7809q = m7809q(obj, this.f12202m);
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f12205p;
        Object obj2 = concurrentHashMap.get(cls);
        Object obj3 = obj2;
        if (obj2 == null) {
            ArrayList arrayListM7806m = m7806m(obj.getClass());
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : arrayListM7806m) {
                if (View.class.isAssignableFrom(((Field) obj4).getType())) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : arrayList) {
                String name = ((Field) obj5).getName();
                name.getClass();
                String lowerCase = name.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!(lowerCase.equals("timetv") || lowerCase.equals("avatariv") || lowerCase.equals("usertv") || lowerCase.equals("clickarea") || AbstractC3149m.m6709h0(lowerCase, "time", false) || AbstractC3149m.m6709h0(lowerCase, "avatar", false) || AbstractC3149m.m6709h0(lowerCase, "click", false) || AbstractC3149m.m6709h0(lowerCase, "history", false) || AbstractC3149m.m6709h0(lowerCase, "nomore", false) || AbstractC3149m.m6709h0(lowerCase, "mask", false) || AbstractC3149m.m6709h0(lowerCase, "checkbox", false) || AbstractC3149m.m6709h0(lowerCase, "check", false))) {
                    arrayList2.add(obj5);
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList2);
            obj3 = arrayList2;
            if (objPutIfAbsent != null) {
                obj3 = objPutIfAbsent;
            }
        }
        C3010h c3010h = new C3010h(new C3011i(AbstractC3015m.m6409S(AbstractC3015m.m6414X(new C0795n((List) obj3, 6), new C0456k1(obj, 23))), true, new C0454k(textView, viewM7851u, viewM7809q, this, viewGroup)));
        if (c3010h.hasNext()) {
            next = c3010h.next();
            if (c3010h.hasNext()) {
                Integer numValueOf = Integer.valueOf(m7781P0((View) next));
                do {
                    Object next2 = c3010h.next();
                    Integer numValueOf2 = Integer.valueOf(m7781P0((View) next2));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        next = next2;
                        numValueOf = numValueOf2;
                    }
                } while (c3010h.hasNext());
            }
        } else {
            next = null;
        }
        View view = (View) next;
        if (view != null) {
            if (m7781P0(view) > 0) {
                return view;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022b A[PHI: r11
  0x022b: PHI (r11v31 java.lang.String) = (r11v21 java.lang.String), (r11v25 java.lang.String), (r11v28 java.lang.String), (r11v29 java.lang.String) binds: [B:152:0x0229, B:158:0x0240, B:167:0x025f, B:170:0x0268] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124  */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3756f0 m7833X(Object obj, Integer num, boolean z9) {
        boolean z10;
        String str;
        Long lM7799i0;
        Long lM7799i02;
        int iIntValue;
        int iIntValue2;
        String strM5943i;
        int iM6719r0;
        Object c3959f;
        ByteBuffer byteBufferWrap;
        Integer numM7805l0;
        int iIntValue3;
        int iIntValue4;
        Set set = this.f12185B.f12355d;
        if (z9) {
            z10 = true;
            break;
        }
        Set<String> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (String str2 : set2) {
                if (AbstractC1416l.m3825a(str2, "atUserList") || AbstractC1416l.m3825a(str2, "rawAtUserList") || AbstractC1416l.m3825a(str2, "mentionedUsers")) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        boolean z11 = z9 || z10;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        String strM7841n0 = z11 ? m7841n0(obj, "getContent", "field_content", "content") : HttpUrl.FRAGMENT_ENCODE_SET;
        String strM7841n02 = z9 ? m7841n0(obj, "getTalker", "field_talker", "talker") : HttpUrl.FRAGMENT_ENCODE_SET;
        if (z10) {
            String strM7841n03 = m7841n0(obj, "getMsgSource", "field_msgSource", "msgSource");
            if (AbstractC3149m.m6721t0(strM7841n03)) {
                Object objM7843o0 = m7843o0(obj, "getLvBuffer", "field_lvbuffer", "lvbuffer");
                byte[] bArr = objM7843o0 instanceof byte[] ? (byte[]) objM7843o0 : null;
                if (bArr == null || bArr.length < 9) {
                    strM7841n03 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    if (bArr.length == 0) {
                        C2104o.m5287l("Array is empty.");
                        return null;
                    }
                    if (bArr[0] == 123) {
                        if (bArr.length == 0) {
                            C2104o.m5287l("Array is empty.");
                            return null;
                        }
                        if (bArr[bArr.length - 1] == 125) {
                            try {
                                byteBufferWrap = ByteBuffer.wrap(bArr);
                                byteBufferWrap.position(1);
                                numM7805l0 = m7805l0(byteBufferWrap);
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            if (numM7805l0 == null || byteBufferWrap.remaining() < (iIntValue3 = numM7805l0.intValue())) {
                                c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
                                if (c3959f instanceof C3959f) {
                                    c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                strM7841n03 = (String) c3959f;
                            } else {
                                byteBufferWrap.position(byteBufferWrap.position() + iIntValue3);
                                if (byteBufferWrap.remaining() >= 4) {
                                    byteBufferWrap.position(byteBufferWrap.position() + 4);
                                    Integer numM7805l02 = m7805l0(byteBufferWrap);
                                    if (numM7805l02 != null && (iIntValue4 = numM7805l02.intValue()) != 0 && byteBufferWrap.remaining() >= iIntValue4) {
                                        byte[] bArr2 = new byte[iIntValue4];
                                        byteBufferWrap.get(bArr2);
                                        c3959f = new String(bArr2, AbstractC3137a.f10177a);
                                    }
                                    if (c3959f instanceof C3959f) {
                                    }
                                    strM7841n03 = (String) c3959f;
                                }
                                c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
                                if (c3959f instanceof C3959f) {
                                }
                                strM7841n03 = (String) c3959f;
                            }
                        }
                    }
                }
            }
            str = strM7841n03;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM7774L0 = z11 ? m7774L0(strM7841n0) : HttpUrl.FRAGMENT_ENCODE_SET;
        long jLongValue = 0;
        long jLongValue2 = ((z9 || set.contains("msgSvrId")) && (lM7799i0 = m7799i0(m7843o0(obj, "getMsgSvrId", "field_msgSvrId", "msgSvrId"))) != null) ? lM7799i0.longValue() : 0L;
        long jM7834Y = set.contains("msgId") ? m7834Y(obj) : 0L;
        if ((set.contains("time") || set.contains("relativeTime")) && (lM7799i02 = m7799i0(m7843o0(obj, "getCreateTime", "field_createTime", "createTime"))) != null) {
            jLongValue = lM7799i02.longValue();
        }
        long j3 = jLongValue;
        if (num == null) {
            Integer numM7797h0 = m7797h0(m7843o0(obj, "getType", "field_type", "type"));
            if (numM7797h0 == null) {
                String[] strArr = {"field_type", "type"};
                int i9 = 0;
                while (true) {
                    if (i9 >= 2) {
                        iIntValue = 0;
                        break;
                    }
                    Object field = KavaReflector.readField(obj, strArr[i9]);
                    if (field instanceof Number) {
                        iIntValue = ((Number) field).intValue();
                        break;
                    }
                    i9++;
                }
            } else {
                iIntValue = numM7797h0.intValue();
            }
        } else {
            iIntValue = num.intValue();
        }
        int i10 = iIntValue;
        String strSubstring = (!AbstractC3156t.m6733W(strM7841n02, "@chatroom", false) || (iM6719r0 = AbstractC3149m.m6719r0(strM7841n0, ":\n", 0, false, 6)) <= 0) ? strM7841n02 : strM7841n0.substring(0, iM6719r0);
        if (z10) {
            String str4 = AbstractC3149m.m6721t0(str) ? strM7841n0 : str;
            C3145i c3145iM6680b = C3147k.m6680b(f12177H, str4);
            if (c3145iM6680b != null) {
                String str5 = (String) AbstractC4166m.m8425w1(1, c3145iM6680b.m6676a());
                if (str5 == null) {
                    str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(str5)) {
                    String str6 = (String) AbstractC4166m.m8425w1(2, c3145iM6680b.m6676a());
                    str5 = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
                }
                strM5943i = AbstractC3149m.m6703R0(str5).toString();
            } else {
                strM5943i = null;
            }
            if (strM5943i == null) {
                strM5943i = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(strM5943i)) {
                WeChatMessage.Companion.getClass();
                strM5943i = C2529d.m5943i(str4, ".msgsource.atuserlist");
                if (AbstractC3149m.m6721t0(strM5943i)) {
                    strM5943i = null;
                }
                if (strM5943i == null) {
                    String strM5943i2 = C2529d.m5943i(str4, "atuserlist");
                    String str7 = !AbstractC3149m.m6721t0(strM5943i2) ? strM5943i2 : null;
                    if (str7 != null) {
                        str3 = str7;
                    } else {
                        strM5943i = "announcement@all";
                        if (!AbstractC3149m.m6709h0(str4, "announcement@all", false)) {
                            strM5943i = "notify@all";
                            if (AbstractC3149m.m6709h0(str4, "notify@all", false)) {
                            }
                        }
                    }
                }
            } else {
                str3 = strM5943i;
            }
        }
        String str8 = str3;
        String simpleName = obj.getClass().getSimpleName();
        Integer numM7797h02 = m7797h0(m7843o0(obj, "isSend", "field_isSend", "isSend"));
        if (numM7797h02 == null && (numM7797h02 = m7797h0(m7843o0(obj, "getIsSend", "field_isSend", "isSend"))) == null) {
            String[] strArr2 = {"field_isSend", "isSend"};
            int i11 = 0;
            while (true) {
                if (i11 >= 2) {
                    iIntValue2 = 0;
                    break;
                }
                Object field2 = KavaReflector.readField(obj, strArr2[i11]);
                if (field2 instanceof Number) {
                    iIntValue2 = ((Number) field2).intValue();
                    break;
                }
                i11++;
            }
        } else {
            iIntValue2 = numM7797h02.intValue();
        }
        return new C3756f0(i10, jM7834Y, jLongValue2, strM7841n02, strSubstring, strM7841n0, strM7774L0, str, str8, simpleName, j3, iIntValue2 == 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final long m7834Y(Object obj) {
        Long lM7799i0 = m7799i0(m7843o0(obj, "getMsgId", "field_msgId", "msgId"));
        if (lM7799i0 != null) {
            if (!(lM7799i0.longValue() > 0)) {
                lM7799i0 = null;
            }
            if (lM7799i0 != null) {
                return lM7799i0.longValue();
            }
        }
        Long lM7799i02 = m7799i0(m7843o0(obj, "getMsgID", "msgID", "id"));
        if (lM7799i02 != null) {
            if (!(lM7799i02.longValue() > 0)) {
                lM7799i02 = null;
            }
            if (lM7799i02 != null) {
                return lM7799i02.longValue();
            }
        }
        Long lM7799i03 = m7799i0(m7843o0(obj, "getId", "id", "field_msgId"));
        if (lM7799i03 != null) {
            if (!(lM7799i03.longValue() > 0)) {
                lM7799i03 = null;
            }
            if (lM7799i03 != null) {
                return lM7799i03.longValue();
            }
        }
        Long lM7799i04 = m7799i0(m7843o0(obj, HttpUrl.FRAGMENT_ENCODE_SET, "field_msgId", "msgId"));
        if (lM7799i04 != null) {
            if (!(lM7799i04.longValue() > 0)) {
                lM7799i04 = null;
            }
            if (lM7799i04 != null) {
                return lM7799i04.longValue();
            }
        }
        Long lM7799i05 = m7799i0(m7843o0(obj, HttpUrl.FRAGMENT_ENCODE_SET, "msgID", "id"));
        if (lM7799i05 != null) {
            Long l10 = lM7799i05.longValue() > 0 ? lM7799i05 : null;
            if (l10 != null) {
                return l10.longValue();
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final List m7835Z(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f12208s;
        List list = (List) concurrentHashMap.get(cls);
        if (list != null) {
            return list;
        }
        ArrayList arrayListM7806m = m7806m(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM7806m) {
            Class<?> type = ((Field) obj).getType();
            if ((type.isPrimitive() || type.isArray() || type.equals(String.class) || Number.class.isAssignableFrom(type)) ? false : true) {
                arrayList.add(obj);
            }
        }
        concurrentHashMap.putIfAbsent(cls, arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final String m7836a0() {
        C3742g c3742g = this.f12190a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m7837e(TextView textView) {
        Context context = textView.getContext();
        context.getClass();
        C3776z c3776z = this.f12185B;
        int i9 = (context.getResources().getConfiguration().uiMode & 48) == 32 ? c3776z.f12363l : c3776z.f12362k;
        if (textView.getCurrentTextColor() != i9) {
            textView.setTextColor(i9);
        }
        Context context2 = textView.getContext();
        context2.getClass();
        C3776z c3776z2 = this.f12185B;
        int i10 = (context2.getResources().getConfiguration().uiMode & 48) == 32 ? c3776z2.f12365n : c3776z2.f12364m;
        Drawable background = textView.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        Integer numValueOf = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            return;
        }
        if (numValueOf == null && i10 == 0) {
            return;
        }
        textView.setBackgroundColor(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m7838e0(Activity activity) {
        String strM7800j;
        Class<?> clsLoadClass;
        C3458m c3458mChatPage = WeChatApis.chatPage();
        String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
        if (strM7258a == null) {
            strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((!AbstractC3156t.m6733W(strM7258a, "@chatroom", false) && !AbstractC3156t.m6733W(strM7258a, "@im.chatroom", false)) || (strM7800j = m7800j(activity)) == null || AbstractC3156t.m6733W(strM7800j, "@chatroom", false) || strM7800j.equals(strM7258a) || (clsLoadClass = KavaReflector.loadClass("com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI", this.f12190a.f12145c)) == null) {
            return;
        }
        Intent intent = new Intent(activity, clsLoadClass);
        intent.putExtra("RoomInfo_Id", strM7258a);
        intent.putExtra("room_member", strM7800j);
        intent.putExtra("title", "查看群成员消息历史");
        activity.startActivity(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7839g(int i9, final Object obj, final Object obj2, final Object[] objArr) {
        View viewM7851u;
        int iIntValue;
        int i10;
        Integer num;
        int i11;
        Integer num2;
        Object c3959f;
        Object field;
        Object objM7847s;
        Object next;
        Object objM7783R;
        Object next2;
        Object obj3;
        Object objM7831V = m7831V(objArr);
        if (objM7831V == null || (viewM7851u = m7851u(objM7831V)) == null) {
            return false;
        }
        WeakHashMap weakHashMap = this.f12213x;
        m7796h(viewM7851u, weakHashMap);
        Object objM7854x0 = m7854x0(objArr != null ? AbstractC4165l.m8366C0(1, objArr) : null);
        if (objM7854x0 == null) {
            if (objArr != null) {
                Object objM8366C0 = AbstractC4165l.m8366C0(2, objArr);
                Integer num3 = objM8366C0 instanceof Integer ? (Integer) objM8366C0 : null;
                if (num3 == null) {
                    int length = objArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            obj3 = null;
                            break;
                        }
                        obj3 = objArr[i12];
                        if (obj3 instanceof Integer) {
                            break;
                        }
                        i12++;
                    }
                    if (obj3 instanceof Integer) {
                        num3 = (Integer) obj3;
                    }
                    num = null;
                    if (obj == null || num == null) {
                        objM7854x0 = null;
                    } else {
                        Class<?> cls = obj.getClass();
                        ConcurrentHashMap concurrentHashMap = this.f12199j;
                        Field field2 = (Field) concurrentHashMap.get(cls);
                        if (field2 == null || (field = KavaReflector.readField(field2, obj)) == null) {
                            Class<?> clsLoadClass = this.f12188E;
                            if (clsLoadClass != null) {
                                num2 = num;
                                i11 = 0;
                            } else {
                                String strM7836a0 = m7836a0();
                                C3742g c3742g = this.f12190a;
                                Context context = c3742g.f12143a;
                                i11 = 0;
                                ClassLoader classLoader = c3742g.f12145c;
                                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_extra_class_cache");
                                String strConcat = strM7836a0.concat("_chatting_data_adapter");
                                String string = sharedPreferencesM8640c.getString(strConcat, null);
                                if (string == null || (clsLoadClass = KavaReflector.loadClass(string, classLoader)) == null) {
                                    try {
                                        DexKitBridge dexKitBridge = c3742g.f12146d;
                                        C0568c c0568c = new C0568c();
                                        C1243a c1243a = new C1243a();
                                        num2 = num;
                                        try {
                                            C1243a.m3357r0(c1243a, AbstractC0000a.m101y0("MicroMsg.ChattingDataAdapterV3", "[handleMsgChange] isLockNotify:"));
                                            c0568c.f1762h = c1243a;
                                            C1724i c1724i = (C1724i) dexKitBridge.findClass(c0568c).m4344a();
                                            c3959f = c1724i != null ? KavaReflector.loadClass(c1724i.m4345p().f8327g, classLoader) : null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c3959f = new C3959f(th);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        num2 = num;
                                    }
                                    Throwable thM8182b = C3960g.m8182b(c3959f);
                                    if (thM8182b != null) {
                                        this.f12191b.invoke("Hchat聊天消息Adapter定位失败", thM8182b);
                                        c3959f = null;
                                    }
                                    clsLoadClass = (Class) c3959f;
                                    if (clsLoadClass != null) {
                                        this.f12188E = clsLoadClass;
                                        sharedPreferencesM8640c.edit().putString(strConcat, clsLoadClass.getName()).apply();
                                    } else {
                                        sharedPreferencesM8640c.edit().remove(strConcat).apply();
                                    }
                                } else {
                                    this.f12188E = clsLoadClass;
                                    num2 = num;
                                }
                            }
                            loop4: for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                for (Field field3 : KavaReflector.declaredFields(superclass)) {
                                    if (clsLoadClass == null || clsLoadClass.isAssignableFrom(field3.getType())) {
                                        Object field4 = KavaReflector.readField(field3, obj);
                                        if (field4 != null && m7815z(field4.getClass())) {
                                            concurrentHashMap.put(obj.getClass(), field3);
                                            field = field4;
                                            break loop4;
                                        }
                                    }
                                }
                            }
                            if (clsLoadClass != null) {
                                field = null;
                            } else {
                                loop6: for (Class<?> superclass2 = obj.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                                    for (Field field5 : KavaReflector.declaredFields(superclass2)) {
                                        Object field6 = KavaReflector.readField(field5, obj);
                                        if (field6 != null && m7815z(field6.getClass())) {
                                            concurrentHashMap.put(obj.getClass(), field5);
                                            field = field6;
                                            break loop6;
                                        }
                                    }
                                }
                                field = null;
                            }
                        } else {
                            num2 = num;
                            i11 = 0;
                        }
                        if (field != null) {
                            int iIntValue2 = num2.intValue();
                            if (iIntValue2 < 0) {
                                objM7847s = null;
                            } else {
                                Class<?> cls2 = field.getClass();
                                ConcurrentHashMap concurrentHashMap2 = this.f12198i;
                                Method method = (Method) concurrentHashMap2.get(cls2);
                                if (method != null) {
                                    objM7847s = KavaReflector.invoke(method, field, num2);
                                } else {
                                    for (Class<?> superclass3 = field.getClass(); superclass3 != null && !superclass3.equals(Object.class); superclass3 = superclass3.getSuperclass()) {
                                        Iterator<T> it = KavaReflector.declaredMethods(superclass3).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it.next();
                                            Method method2 = (Method) next2;
                                            if (method2.getParameterTypes().length == 1) {
                                                Class<?> cls3 = method2.getParameterTypes()[i11];
                                                Class cls4 = Integer.TYPE;
                                                if ((AbstractC1416l.m3825a(cls3, cls4) || AbstractC1416l.m3825a(method2.getParameterTypes()[i11], cls4)) && (AbstractC1416l.m3825a(method2.getName(), "J0") || AbstractC1416l.m3825a(method2.getName(), "getItem") || AbstractC1416l.m3825a(method2.getName(), "get"))) {
                                                    break;
                                                }
                                            }
                                        }
                                        Method method3 = (Method) next2;
                                        if (method3 != null) {
                                            concurrentHashMap2.put(field.getClass(), method3);
                                            objM7783R = KavaReflector.invoke(method3, field, num2);
                                            if (objM7783R != null) {
                                                break;
                                            }
                                        }
                                    }
                                    Field field7 = (Field) concurrentHashMap.get(field.getClass());
                                    if (field7 == null || (objM7783R = m7783R(iIntValue2, KavaReflector.readField(field7, field))) == null) {
                                        for (Class<?> superclass4 = field.getClass(); superclass4 != null && !superclass4.equals(Object.class); superclass4 = superclass4.getSuperclass()) {
                                            Iterator<T> it2 = KavaReflector.declaredFields(superclass4).iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it2.next();
                                                Field field8 = (Field) next;
                                                if (AbstractC1416l.m3825a(field8.getName(), "K") || AbstractC1416l.m3825a(field8.getName(), "items") || AbstractC1416l.m3825a(field8.getName(), "data") || AbstractC1416l.m3825a(field8.getName(), "list")) {
                                                    break;
                                                }
                                            }
                                            Field field9 = (Field) next;
                                            if (field9 != null) {
                                                concurrentHashMap.put(field.getClass(), field9);
                                                objM7847s = m7783R(iIntValue2, KavaReflector.readField(field9, field));
                                                break;
                                            }
                                        }
                                        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
                                        setNewSetFromMap.getClass();
                                        objM7847s = m7847s(field, iIntValue2, setNewSetFromMap, i11);
                                    } else {
                                        objM7847s = objM7783R;
                                    }
                                }
                            }
                            objM7854x0 = m7854x0(objM7847s);
                        }
                    }
                }
                num = num3;
                if (obj == null) {
                    objM7854x0 = null;
                }
            } else {
                num = null;
                if (obj == null) {
                }
            }
        }
        if (objM7854x0 == null) {
            if (i9 >= 2) {
                m7852u0(viewM7851u, null);
                m7830T("message", objM7831V, viewM7851u);
            }
            if (i9 >= 2) {
                return false;
            }
            final int i13 = i9 + 1;
            m7764A0(viewM7851u, viewM7851u, weakHashMap, new InterfaceC1220a() { // from class: r9.d
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1220a
                public final Object invoke() {
                    this.f12171g.m7839g(i13, obj, obj2, objArr);
                    return C3967n.f12976a;
                }
            });
            return false;
        }
        final Object obj4 = obj2;
        Integer numM7797h0 = m7797h0(m7843o0(objM7854x0, "getType", "field_type", "type"));
        if (numM7797h0 == null) {
            String[] strArr = {"field_type", "type"};
            int i14 = 0;
            while (true) {
                if (i14 >= 2) {
                    iIntValue = 0;
                    break;
                }
                Object field10 = KavaReflector.readField(objM7854x0, strArr[i14]);
                if (field10 instanceof Number) {
                    iIntValue = ((Number) field10).intValue();
                    break;
                }
                i14++;
            }
        } else {
            iIntValue = numM7797h0.intValue();
        }
        if (iIntValue <= 0) {
            i10 = iIntValue;
        } else {
            i10 = iIntValue & 255;
            int i15 = 65535 & iIntValue;
            if ((iIntValue >>> 16) != 0) {
                if (i15 == 10000 || i15 == 10002) {
                    i10 = i15;
                } else if (i10 == 0 || i15 != i10) {
                }
            }
        }
        if (i10 == 10000 || i10 == 10002) {
            m7852u0(viewM7851u, null);
            m7856y0(viewM7851u, null);
            return true;
        }
        C3756f0 c3756f0M7833X = m7833X(objM7854x0, Integer.valueOf(iIntValue), false);
        ConcurrentHashMap concurrentHashMap3 = this.f12200k;
        if (obj4 == null) {
            Object tag = viewM7851u.getTag();
            if (tag == null) {
                tag = null;
                obj4 = tag == null ? tag : objM7831V;
            } else {
                TextView textViewM7808p = m7808p(tag, concurrentHashMap3);
                if (!(textViewM7808p != null ? m7780P(textViewM7808p, viewM7851u) : false)) {
                }
                if (tag == null) {
                }
            }
        } else {
            TextView textViewM7808p2 = m7808p(obj4, concurrentHashMap3);
            if (!(textViewM7808p2 != null ? m7780P(textViewM7808p2, viewM7851u) : false)) {
                obj4 = null;
            }
            if (obj4 == null) {
            }
        }
        TextView textViewM7808p3 = m7808p(obj4, concurrentHashMap3);
        boolean zM7821E = m7821E(viewM7851u, textViewM7808p3, null, obj4, objM7854x0, c3756f0M7833X);
        if (!zM7821E) {
            if (i9 >= 2) {
                m7852u0(viewM7851u, null);
                m7830T("layout", obj4, viewM7851u);
            }
            if (i9 < 2) {
                final int i16 = i9 + 1;
                m7764A0(viewM7851u, viewM7851u, weakHashMap, new InterfaceC1220a() { // from class: r9.d
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1220a
                    public final Object invoke() {
                        this.f12171g.m7839g(i16, obj, obj4, objArr);
                        return C3967n.f12976a;
                    }
                });
            }
        }
        if (textViewM7808p3 != null) {
            textViewM7808p3.setOnClickListener(null);
        }
        if (textViewM7808p3 != null) {
            textViewM7808p3.setClickable(false);
        }
        return zM7821E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r4
  0x0026: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v6 java.lang.String) binds: [B:14:0x002e, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3776z m7840m0() {
        String str;
        Object c3959f;
        String str2;
        SharedPreferences sharedPreferences = this.f12192c;
        String string = sharedPreferences.getString("message_details_position", "message_bottom");
        if (string == null) {
            str = "message_bottom";
        } else {
            int iHashCode = string.hashCode();
            if (iHashCode != -586538697) {
                if (iHashCode == -585528885) {
                    str2 = "avatar_below";
                    if (string.equals("avatar_below")) {
                        str = str2;
                    }
                }
                str = "message_bottom";
            } else {
                str2 = "avatar_above";
                if (!string.equals("avatar_above")) {
                }
            }
        }
        String string2 = sharedPreferences.getString("message_details_format", "${time}");
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string2 == null) {
            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = AbstractC3149m.m6721t0(string2) ? "${time}" : string2;
        String string3 = sharedPreferences.getString("message_details_time_format", "HH:mm:ss");
        if (string3 == null) {
            string3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            c3959f = DateTimeFormatter.ofPattern(AbstractC3149m.m6721t0(string3) ? "HH:mm:ss" : string3);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = f12178I;
        }
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) c3959f;
        String string4 = sharedPreferences.getString("message_details_light_text", "#FFFF0000");
        if (string4 == null) {
            string4 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string5 = sharedPreferences.getString("message_details_dark_text", "#FFFF0000");
        if (string5 == null) {
            string5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string6 = sharedPreferences.getString("message_details_light_bg", "#00000000");
        if (string6 == null) {
            string6 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string7 = sharedPreferences.getString("message_details_dark_bg", "#00000000");
        if (string7 != null) {
            str3 = string7;
        }
        boolean z9 = sharedPreferences.getBoolean("message_details_enable", false);
        Set setM6419c0 = AbstractC3015m.m6419c0(AbstractC3015m.m6413W(C3147k.m6681c(f12176G, str4), new C3766p(0)));
        dateTimeFormatter.getClass();
        return new C3776z(z9, str, str4, setM6419c0, dateTimeFormatter, sharedPreferences.getInt("message_details_text_size", 10), AbstractC3754e0.m7909r(sharedPreferences.getInt("message_details_avatar_gap", 2), 0, 64), sharedPreferences.getInt("message_details_left_margin", 64), sharedPreferences.getInt("message_details_right_margin", 64), sharedPreferences.getBoolean("message_details_click_show", true), m7812v0(Opcodes.V_PREVIEW_EXPERIMENTAL, string4, "#FFFF0000", string5, "#FFFF0000"), m7812v0(Opcodes.V_PREVIEW_EXPERIMENTAL, string5, "#FFFF0000", string4, "#FFFF0000"), m7812v0(0, string6, "#00000000", str3, "#00000000"), m7812v0(0, str3, "#00000000", string6, "#00000000"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final String m7841n0(Object obj, String str, String str2, String str3) {
        Object objM7843o0 = m7843o0(obj, str, str2, str3);
        String str4 = objM7843o0 instanceof String ? (String) objM7843o0 : null;
        return str4 != null ? str4 : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[PHI: r4
  0x0094: PHI (r4v5 java.lang.reflect.Field) = (r4v4 java.lang.reflect.Field), (r4v7 java.lang.reflect.Field) binds: [B:22:0x0069, B:32:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m7842o(Object obj) {
        Object next;
        Object next2;
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f12201l;
        Field field = (Field) concurrentHashMap.get(cls);
        if (field != null) {
            Object field2 = KavaReflector.readField(field, obj);
            if (field2 instanceof View) {
                return (View) field2;
            }
        } else {
            ArrayList arrayListM7806m = m7806m(obj.getClass());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListM7806m) {
                if (View.class.isAssignableFrom(((Field) obj2).getType())) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC3156t.m6734X(((Field) next).getName(), "avatarIV")) {
                    break;
                }
            }
            Field field3 = (Field) next;
            if (field3 != null) {
                concurrentHashMap.put(obj.getClass(), field3);
                Object field4 = KavaReflector.readField(field3, obj);
                if (field4 instanceof View) {
                    return (View) field4;
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    String name = ((Field) next2).getName();
                    name.getClass();
                    if (AbstractC3149m.m6709h0(name, "avatar", true)) {
                        break;
                    }
                }
                field3 = (Field) next2;
                if (field3 != null) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public final Object m7843o0(Object obj, String str, String str2, String str3) {
        C3773w c3773w = new C3773w(obj.getClass(), str, str2, str3);
        ConcurrentHashMap concurrentHashMap = this.f12206q;
        C3772v c3772v = (C3772v) concurrentHashMap.get(c3773w);
        if (c3772v == null) {
            c3772v = new C3772v(KavaReflector.findMethod(obj.getClass(), str, new Class[0]), KavaReflector.findFieldRecursive(obj.getClass(), str2), KavaReflector.findFieldRecursive(obj.getClass(), str3));
            concurrentHashMap.putIfAbsent(c3773w, c3772v);
        }
        Object objInvoke = KavaReflector.invoke(c3772v.f12339a, obj, new Object[0]);
        if (objInvoke != null) {
            return objInvoke;
        }
        Object field = KavaReflector.readField(c3772v.f12340b, obj);
        return field != null ? field : KavaReflector.readField(c3772v.f12341c, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public final Integer m7844p0() {
        Object c3959f;
        C3742g c3742g = this.f12190a;
        try {
            int identifier = c3742g.f12143a.getResources().getIdentifier("j6q", "id", c3742g.f12143a.getPackageName());
            c3959f = Integer.valueOf(identifier);
            if (!(identifier != 0)) {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Integer) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public final void m7845q0() {
        ArrayList<C3958e> arrayList;
        synchronized (this.f12211v) {
            Set setEntrySet = this.f12211v.entrySet();
            setEntrySet.getClass();
            Set<Map.Entry> set = setEntrySet;
            arrayList = new ArrayList(AbstractC4167n.m8429e1(set));
            for (Map.Entry entry : set) {
                arrayList.add(new C3958e(entry.getKey(), entry.getValue()));
            }
        }
        for (C3958e c3958e : arrayList) {
            TextView textView = (TextView) c3958e.f12961g;
            textView.post(new RunnableC3737b(this, (C3775y) c3958e.f12962h, textView, 2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public final void m7846r0(TextView textView, boolean z9) {
        if (z9) {
            m7837e(textView);
            m7764A0(textView, textView, this.f12215z, new C0035c(textView, 27, this));
            textView.post(new RunnableC3762l(textView, this, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final Object m7847s(Object obj, int i9, Set set, int i10) {
        Object objM7847s;
        if (i9 >= 0 && i10 <= 3 && set.add(obj)) {
            Object objM7783R = m7783R(i9, obj);
            if (objM7783R != null) {
                if (!(m7854x0(objM7783R) != null)) {
                    objM7783R = null;
                }
                if (objM7783R != null) {
                    return objM7783R;
                }
            }
            String name = obj.getClass().getName();
            if (!AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "android.", false) && !(obj instanceof View) && !(obj instanceof ViewGroup)) {
                Iterator it = m7835Z(obj.getClass()).iterator();
                while (it.hasNext()) {
                    Object field = KavaReflector.readField((Field) it.next(), obj);
                    if (field != null && (objM7847s = m7847s(field, i9, set, i10 + 1)) != null) {
                        return objM7847s;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public final void m7848s0(View view, TextView textView, TextView textView2, Object obj, Object obj2, C3756f0 c3756f0) {
        synchronized (this.f12211v) {
            this.f12211v.put(textView, new C3775y(view, textView2, obj, obj2, c3756f0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Field m7849t(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f12197h;
        Field field = (Field) concurrentHashMap.get(cls);
        if (field != null) {
            return field;
        }
        Class superclass = cls;
        while (true) {
            Object obj = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Field field2 = (Field) next;
                if (AbstractC1416l.m3825a(field2.getName(), "itemView") || AbstractC1416l.m3825a(field2.getType(), View.class)) {
                    obj = next;
                    break;
                }
            }
            Field field3 = (Field) obj;
            if (field3 != null) {
                concurrentHashMap.put(cls, field3);
                return field3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public final void m7850t0(View view, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt != view2 && (childAt instanceof TextView) && AbstractC1416l.m3825a(((TextView) childAt).getTag(), "hchat_message_details_view")) {
                    m7796h(childAt, this.f12214y);
                    m7796h(childAt, this.f12215z);
                    synchronized (this.f12211v) {
                    }
                    Set set = this.f12210u;
                    set.getClass();
                    synchronized (set) {
                        this.f12210u.remove(childAt);
                    }
                    viewGroup.removeViewAt(childCount);
                } else {
                    childAt.getClass();
                    m7850t0(childAt, view2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final View m7851u(Object obj) {
        Object field = KavaReflector.readField(obj, "itemView");
        View view = field instanceof View ? (View) field : null;
        if (view != null) {
            return view;
        }
        Object field2 = KavaReflector.readField(m7849t(obj.getClass()), obj);
        if (field2 instanceof View) {
            return (View) field2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public final void m7852u0(View view, TextView textView) {
        m7850t0(view, textView);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        for (int i9 = 0; viewGroup != null && i9 < 3 && !m7779O(viewGroup); i9++) {
            m7850t0(viewGroup, textView);
            ViewParent parent2 = viewGroup.getParent();
            viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final Object m7853w0(int i9, Object obj, Set set) {
        Object objM7853w0;
        if (obj != null && i9 <= 4 && set.add(obj)) {
            String name = obj.getClass().getName();
            if (m7827J(obj) && m7834Y(obj) > 0) {
                return obj;
            }
            if (AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false) || (obj instanceof View) || (obj instanceof ViewGroup)) {
                return null;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    Object objM7853w02 = m7853w0(i9 + 1, it.next(), set);
                    if (objM7853w02 != null) {
                        return objM7853w02;
                    }
                }
            } else {
                Iterator it2 = m7835Z(obj.getClass()).iterator();
                while (it2.hasNext()) {
                    Object field = KavaReflector.readField((Field) it2.next(), obj);
                    if (field != null && (objM7853w0 = m7853w0(i9 + 1, field, set)) != null) {
                        return objM7853w0;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final Object m7854x0(Object obj) {
        if (obj == null) {
            return null;
        }
        if (m7827J(obj) && m7834Y(obj) > 0) {
            return obj;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        return m7853w0(0, obj, setNewSetFromMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final TextView m7855y(Object obj, long j3) {
        Integer numM7844p0;
        TextView textView;
        Object c3959f;
        Object c3959f2;
        if (obj == null || (numM7844p0 = m7844p0()) == null) {
            textView = null;
        } else {
            for (Method method : m7788b0(obj.getClass())) {
                if (method.getParameterTypes().length == 1 && AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.TYPE) && View.class.isAssignableFrom(method.getReturnType())) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(obj, numM7844p0);
                        c3959f = objInvoke instanceof TextView ? (TextView) objInvoke : null;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = null;
                    }
                    textView = (TextView) c3959f;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    break;
                }
            }
            textView = null;
        }
        if (textView != null) {
            return textView;
        }
        View viewM7851u = obj != null ? m7851u(obj) : null;
        View childAt = viewM7851u instanceof ViewGroup ? (ViewGroup) viewM7851u : null;
        if (childAt == null) {
            return null;
        }
        try {
            int identifier = childAt.getResources().getIdentifier("j6q", "id", childAt.getContext().getPackageName());
            c3959f2 = identifier == 0 ? null : (TextView) childAt.findViewById(identifier);
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        if (c3959f2 instanceof C3959f) {
            c3959f2 = null;
        }
        TextView textView2 = (TextView) c3959f2;
        if (textView2 != null) {
            return textView2;
        }
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault());
        LocalDate localDateNow = LocalDate.now();
        LinkedHashSet linkedHashSetM8350R = AbstractC4156d0.m8350R("HH:mm");
        if (!AbstractC1416l.m3825a(localDateTimeOfInstant.toLocalDate(), localDateNow)) {
            linkedHashSetM8350R.add("M月d日 HH:mm");
            if (localDateTimeOfInstant.getYear() != localDateNow.getYear()) {
                linkedHashSetM8350R.add("yyyy年M月d日 HH:mm");
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = linkedHashSetM8350R.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(localDateTimeOfInstant.format(DateTimeFormatter.ofPattern((String) it.next())));
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(linkedHashSet));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(m7790c0((String) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
        TextView textViewM7811v = setM8412U1.isEmpty() ? null : m7811v(childAt, new C2576b(this, setM8412U1, LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm")), 10));
        if (textViewM7811v != null) {
            return textViewM7811v;
        }
        int[] iArr = {0, 1, 1, 1, 1};
        for (int i9 = 0; i9 < 5; i9++) {
            int i10 = iArr[i9];
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup == null || i10 < 0 || i10 >= viewGroup.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(i10);
            childAt.getClass();
        }
        if (childAt instanceof TextView) {
            return (TextView) childAt;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX INFO: renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7856y0(View view, RelativeLayout relativeLayout) {
        ArrayList<C3958e> arrayList;
        boolean z9;
        synchronized (this.f12212w) {
            try {
                Set setEntrySet = this.f12212w.entrySet();
                setEntrySet.getClass();
                ArrayList<Map.Entry> arrayList2 = new ArrayList();
                for (Object obj : setEntrySet) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    RelativeLayout relativeLayout2 = (RelativeLayout) entry.getKey();
                    if (relativeLayout2 != relativeLayout) {
                        relativeLayout2.getClass();
                        z9 = m7780P(relativeLayout2, view);
                    }
                    if (z9) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
                for (Map.Entry entry2 : arrayList2) {
                    arrayList.add(new C3958e(entry2.getKey(), entry2.getValue()));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f12212w.remove((RelativeLayout) ((C3958e) it.next()).f12961g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (C3958e c3958e : arrayList) {
            RelativeLayout relativeLayout3 = (RelativeLayout) c3958e.f12961g;
            C3769s c3769s = (C3769s) c3958e.f12962h;
            relativeLayout3.getClass();
            c3769s.getClass();
            int paddingTop = relativeLayout3.getPaddingTop() == c3769s.f12328c ? c3769s.f12326a : relativeLayout3.getPaddingTop();
            int paddingBottom = relativeLayout3.getPaddingBottom() == c3769s.f12329d ? c3769s.f12327b : relativeLayout3.getPaddingBottom();
            if (paddingTop != relativeLayout3.getPaddingTop() || paddingBottom != relativeLayout3.getPaddingBottom()) {
                relativeLayout3.setPadding(relativeLayout3.getPaddingLeft(), paddingTop, relativeLayout3.getPaddingRight(), paddingBottom);
            }
            relativeLayout3.setClipToPadding(c3769s.f12330e);
            for (C3768r c3768r : c3769s.f12331f) {
                ViewGroup viewGroup = (ViewGroup) c3768r.f12324a.get();
                if (viewGroup != null && !viewGroup.getClipChildren()) {
                    viewGroup.setClipChildren(c3768r.f12325b);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final void m7857z0(final TextView textView, final ViewGroup viewGroup, final View view, final boolean z9, final int i9) {
        if (m7764A0(textView, viewGroup, this.f12214y, new InterfaceC1220a() { // from class: r9.n
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
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
            @Override // p085fg.InterfaceC1220a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                TextView textView2 = textView;
                ViewParent parent = textView2.getParent();
                ViewGroup viewGroup2 = viewGroup;
                View view2 = view;
                boolean z10 = z9;
                if (parent != viewGroup2 || viewGroup2.getWidth() <= 0 || view2.getWidth() <= 0 || !C3752d0.m7780P(view2, viewGroup2)) {
                    int i10 = i9;
                    if (i10 < 4) {
                        this.f12309g.m7857z0(textView2, viewGroup2, view2, z10, i10 + 1);
                    } else {
                        textView2.setVisibility(0);
                    }
                } else {
                    Rect rect = new Rect(0, 0, view2.getWidth(), view2.getHeight());
                    viewGroup2.offsetDescendantRectToMyCoords(view2, rect);
                    ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        if (z10) {
                            int width = (viewGroup2.getWidth() - viewGroup2.getPaddingRight()) - rect.right;
                            if (width < 0) {
                                width = 0;
                            }
                            if (marginLayoutParams.getMarginEnd() != width || marginLayoutParams.rightMargin != width) {
                                marginLayoutParams.setMarginEnd(width);
                                marginLayoutParams.rightMargin = width;
                                textView2.setLayoutParams(marginLayoutParams);
                            }
                            textView2.setVisibility(0);
                        } else {
                            int paddingLeft = rect.left - viewGroup2.getPaddingLeft();
                            if (paddingLeft < 0) {
                                paddingLeft = 0;
                            }
                            if (marginLayoutParams.getMarginStart() != paddingLeft || marginLayoutParams.leftMargin != paddingLeft) {
                                marginLayoutParams.setMarginStart(paddingLeft);
                                marginLayoutParams.leftMargin = paddingLeft;
                                textView2.setLayoutParams(marginLayoutParams);
                            }
                            textView2.setVisibility(0);
                        }
                    }
                }
                return C3967n.f12976a;
            }
        })) {
            return;
        }
        textView.setVisibility(0);
    }
}
