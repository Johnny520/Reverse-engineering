package ba;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p011ab.C0041a;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p086fh.C1253k;
import p099h.Hchat.R;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p136j8.AbstractC2091b;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p300ub.AbstractC4302b;
import p304uf.C4333g;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4171r;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: ba.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0233m {

    /* JADX INFO: renamed from: o */
    public static final Set f585o = AbstractC4156d0.m8355W(50, 1000052, 1000053);

    /* JADX INFO: renamed from: p */
    public static final C3147k f586p = new C3147k("<type>\\s*2001\\s*</type>");

    /* JADX INFO: renamed from: q */
    public static final C3147k f587q = new C3147k("<type>\\s*(2000|2011)\\s*</type>");

    /* JADX INFO: renamed from: r */
    public static final C3147k f588r = new C3147k("<type>\\s*57\\s*</type>", 0);

    /* JADX INFO: renamed from: s */
    public static final C3147k f589s = new C3147k("<type>\\s*19\\s*</type>", 0);

    /* JADX INFO: renamed from: t */
    public static final Set f590t = AbstractC4156d0.m8355W(64, 570425393, 603979825, 889192497, 922746929, -1879048191, 1077936177);

    /* JADX INFO: renamed from: u */
    public static final Set f591u = AbstractC4156d0.m8355W(889192497, 922746929);

    /* JADX INFO: renamed from: v */
    public static final List f592v;

    /* JADX INFO: renamed from: w */
    public static final ArrayList f593w;

    /* JADX INFO: renamed from: a */
    public final C3742g f594a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f595b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f596c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f597d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f598e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f599f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f600g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f601h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap.KeySetView f602i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f603j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f604k;

    /* JADX INFO: renamed from: l */
    public final ThreadLocal f605l;

    /* JADX INFO: renamed from: m */
    public final C3962i f606m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f607n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listM101y0 = AbstractC0000a.m101y0("bkl", "brp", "brl", "bro", "bs0", "bs2");
        f592v = listM101y0;
        f593w = AbstractC4166m.m8397F1(AbstractC0000a.m101y0("bkg", "kpw"), listM101y0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0233m(C3742g c3742g) {
        c3742g.getClass();
        this.f594a = c3742g;
        Context context = c3742g.f12143a;
        this.f595b = AbstractC4302b.m8640c(context, "Hchat_message_bubble_config");
        this.f596c = AbstractC4302b.m8640c(context, "Hchat_message_text_color_config");
        this.f597d = AbstractC4302b.m8640c(context, "Hchat_message_bubble_method_cache");
        this.f598e = new ConcurrentHashMap();
        this.f599f = new ConcurrentHashMap();
        this.f600g = new ConcurrentHashMap();
        this.f601h = new ConcurrentHashMap();
        this.f602i = ConcurrentHashMap.newKeySet();
        this.f603j = new ConcurrentHashMap();
        this.f604k = new ConcurrentHashMap();
        this.f605l = new ThreadLocal();
        this.f606m = new C3962i(new C0041a(this, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m922a(View view, View view2, ArrayList arrayList) {
        if (view.getClass().getName().equals("com.tencent.mm.ui.widget.MMNeat7extView") && view.getBackground() != null && m931o(view, view2)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m922a(childAt, view2, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m923b(C0233m c0233m, View view, LinkedHashMap linkedHashMap, View view2) {
        c0233m.getClass();
        C0232l c0232lM939y = m939y(view2);
        if (c0232lM939y != null && (view2 == view || view2.getBackground() == null)) {
            linkedHashMap.putIfAbsent(c0232lM939y.f584b, c0232lM939y.f583a);
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                childAt.getClass();
                m923b(c0233m, view, linkedHashMap, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m924c(View view, int i9, ArrayList arrayList) {
        if (view.getId() == i9) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.getClass();
                m924c(childAt, i9, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static View m925d(View view, View view2) {
        if (view.getClass().getName().equals("com.tencent.mm.ui.chatting.viewitems.foldItem.ChattingItemFoldSys$ExpandTextView")) {
            if ((view instanceof TextView) && m931o(view, view2)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if ((childAt instanceof TextView) && m931o(childAt, view2)) {
                        return childAt;
                    }
                }
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        int childCount2 = viewGroup2.getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = viewGroup2.getChildAt(i10);
            childAt2.getClass();
            View viewM925d = m925d(childAt2, view2);
            if (viewM925d != null) {
                return viewM925d;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m926h(int i9, int i10) {
        int i11 = i10 == -16777216 ? -1 : -16777216;
        double dAlpha = ((double) Color.alpha(i9)) / 255.0d;
        if (dAlpha < 1.0d) {
            double d10 = 1.0d - dAlpha;
            i9 = Color.rgb((int) ((((double) Color.red(i11)) * d10) + (((double) Color.red(i9)) * dAlpha)), (int) ((((double) Color.green(i11)) * d10) + (((double) Color.green(i9)) * dAlpha)), (int) ((d10 * ((double) Color.blue(i11))) + (((double) Color.blue(i9)) * dAlpha)));
        }
        return (Math.max(m935t(i9), m935t(i11)) + 0.05d) / (Math.min(m935t(i9), m935t(i11)) + 0.05d) < 4.5d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m927j(View view, View view2) {
        return view.getBackground() != null && m931o(view, view2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m928k(Integer num, String str) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue > 0) {
                int i9 = iIntValue & 255;
                int i10 = 65535 & iIntValue;
                if ((iIntValue >>> 16) != 0) {
                    if (i10 == 10000 || i10 == 10002) {
                        iIntValue = i10;
                    } else if (i9 != 0 && i10 == i9) {
                        iIntValue = i9;
                    }
                }
            }
            if (iIntValue == 49) {
            }
        } else if (AbstractC3149m.m6709h0(str, "<appmsg", true)) {
            if (f589s.m6682a(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m929l(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.equals("com.tencent.mm.ui.widget.MMNeat7extView") || name.equals("com.tencent.neattextview.textview.view.NeatTextView") || AbstractC3149m.m6709h0(name, "NeatTextView", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m930n(int i9) {
        int i10;
        if (i9 <= 0) {
            i10 = i9;
        } else {
            i10 = i9 & 255;
            int i11 = 65535 & i9;
            if ((i9 >>> 16) != 0) {
                if (i11 == 10000 || i11 == 10002) {
                    i10 = i11;
                } else if (i10 == 0 || i11 != i10) {
                }
            }
        }
        return i10 == 10000 || i10 == 10002 || f590t.contains(Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m931o(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        for (int i9 = 0; (parent instanceof View) && i9 < 16; i9++) {
            if (parent == view2) {
                return true;
            }
            parent = ((View) parent).getParent();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m932q(String str) {
        for (int i9 = 0; i9 < 2; i9++) {
            str = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&lt;", "<", true), "&gt;", ">", true), "&quot;", "\"", true), "&apos;", "'", true), "&amp;", "&", true);
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == 160 || cCharAt == 8199 || cCharAt == 8239) {
                sb2.append(' ');
            } else if (cCharAt != 8288 && cCharAt != 65279 && cCharAt != 65532) {
                switch (cCharAt) {
                    case 8203:
                    case 8204:
                    case 8205:
                    case 8206:
                    case 8207:
                        break;
                    default:
                        sb2.append(cCharAt);
                        break;
                }
            }
        }
        String strM5161h = AbstractC2091b.m5161h("[ \\t\\x0B\\f\\r]+", sb2.toString(), " ");
        Pattern patternCompile = Pattern.compile(" *\\n *");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM5161h).replaceAll("\n");
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Integer m933r(Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6742f0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static Object m934s(Object obj, String str, String str2, String str3) {
        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), str, new Class[0]), obj, new Object[0]);
        if (objInvoke != null) {
            return objInvoke;
        }
        Object field = KavaReflector.readField(obj, str2);
        return field != null ? field : KavaReflector.readField(obj, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static double m935t(int i9) {
        return (m936u(Color.blue(i9)) * 0.0722d) + (m936u(Color.green(i9)) * 0.7152d) + (m936u(Color.red(i9)) * 0.2126d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final double m936u(int i9) {
        double d10 = ((double) i9) / 255.0d;
        return d10 <= 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC0221a m937v(Integer num, String str) {
        if (num != null && m930n(num.intValue())) {
            return EnumC0221a.SYSTEM;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        EnumC0221a enumC0221a = EnumC0221a.GENERAL;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue > 0) {
                int i9 = iIntValue & 255;
                int i10 = 65535 & iIntValue;
                if ((iIntValue >>> 16) != 0) {
                    if (i10 == 10000 || i10 == 10002) {
                        iIntValue = i10;
                    } else if (i9 != 0 && i10 == i9) {
                        iIntValue = i9;
                    }
                }
            }
            if (!(iIntValue == 49)) {
            }
        } else if (!AbstractC3149m.m6709h0(lowerCase, "<appmsg", false) && !AbstractC3149m.m6709h0(lowerCase, "<wcpayinfo", false)) {
            return enumC0221a;
        }
        return (AbstractC3149m.m6709h0(lowerCase, "receivehongbao", false) || AbstractC3149m.m6709h0(lowerCase, "wxhb_personalreceive", false) || AbstractC3149m.m6709h0(lowerCase, "hongbao", false) || AbstractC3149m.m6709h0(lowerCase, "/hongbao/", false) || f586p.m6682a(lowerCase)) ? EnumC0221a.RED_PACKET : ((AbstractC3149m.m6709h0(lowerCase, "<wcpayinfo", false) && (AbstractC3149m.m6709h0(lowerCase, "<transferid>", false) || AbstractC3149m.m6709h0(lowerCase, "<transcationid>", false) || AbstractC3149m.m6709h0(lowerCase, "<transactionid>", false) || AbstractC3149m.m6709h0(lowerCase, "transfer_id=", false) || AbstractC3149m.m6709h0(lowerCase, "trans_id=", false) || AbstractC3149m.m6709h0(lowerCase, "transferoperation", false))) || f587q.m6682a(lowerCase)) ? EnumC0221a.TRANSFER : enumC0221a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: x */
    public static void m938x(View view) {
        Object tag = view.getTag(R.id.hchat_message_bubble_original);
        C0230j c0230j = tag instanceof C0230j ? (C0230j) tag : null;
        if (c0230j != null) {
            view.setBackground(c0230j.f571a);
            view.setPadding(c0230j.f572b, c0230j.f573c, c0230j.f574d, c0230j.f575e);
            for (C0231k c0231k : c0230j.f576f) {
                C0232l c0232l = c0231k.f577a;
                ColorStateList colorStateList = c0231k.f578b;
                int i9 = c0231k.f582f;
                View view2 = c0232l.f583a;
                TextView textView = c0232l.f584b;
                Object tag2 = view2.getTag(R.id.hchat_message_text_color_applied);
                Boolean bool = Boolean.TRUE;
                boolean z9 = AbstractC1416l.m3825a(tag2, bool) || AbstractC1416l.m3825a(textView.getTag(R.id.hchat_message_text_color_applied), bool);
                if (c0231k.f580d && !z9 && textView.getCurrentTextColor() == i9) {
                    if (m929l(view2)) {
                        KavaReflector.invokeMethod(view2, "setTextColor", Integer.valueOf(colorStateList.getDefaultColor()));
                    }
                    textView.setTextColor(colorStateList);
                }
                if (c0231k.f581e && !z9 && textView.getLinkTextColors().getDefaultColor() == i9) {
                    textView.setLinkTextColor(c0231k.f579c);
                }
                textView.invalidate();
                view2.invalidate();
            }
            view.setTag(R.id.hchat_message_bubble_original, null);
            view.invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0232l m939y(View view) {
        TextView textView;
        if (m929l(view)) {
            Object objInvokeMethod = KavaReflector.invokeMethod(view, "getWrappedTextView", new Object[0]);
            textView = objInvokeMethod instanceof TextView ? (TextView) objInvokeMethod : null;
            if (textView == null) {
                textView = view instanceof TextView ? (TextView) view : null;
            }
        } else if (view instanceof TextView) {
            textView = (TextView) view;
        }
        if (textView != null) {
            return new C0232l(view, textView);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Field m940e(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f598e;
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
    /* JADX INFO: renamed from: f */
    public final View m941f(Object obj) {
        Object field = KavaReflector.readField(obj, "itemView");
        View view = field instanceof View ? (View) field : null;
        if (view != null) {
            return view;
        }
        Object field2 = KavaReflector.readField(m940e(obj.getClass()), obj);
        if (field2 instanceof View) {
            return (View) field2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Map m942g() {
        return (Map) this.f606m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Map m943i(Object obj) {
        if (obj == null) {
            return C4174u.f13711g;
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f600g;
        Collection arrayList = (List) concurrentHashMap.get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList();
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listDeclaredFields) {
                    if (View.class.isAssignableFrom(((Field) obj2).getType())) {
                        arrayList2.add(obj2);
                    }
                }
                AbstractC4171r.m8432h1(arrayList, arrayList2);
            }
            concurrentHashMap.putIfAbsent(obj.getClass(), arrayList);
        }
        C4333g c4333g = new C4333g();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object field = KavaReflector.readField((Field) it.next(), obj);
            View view = field instanceof View ? (View) field : null;
            if (view != null && view.getId() != -1) {
                c4333g.putIfAbsent(Integer.valueOf(view.getId()), view);
            }
        }
        return c4333g.m8780c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m944m(Method method) {
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
                    for (Class<?> cls2 : parameterTypes) {
                        cls2.getClass();
                        if (Boolean.valueOf(m940e(cls2) != null).booleanValue()) {
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
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x0092 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [sf.f] */
    /* JADX INFO: renamed from: p */
    public final Method m945p() {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f594a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        Object obj = null;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|message_bubble_v3") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = this.f597d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "adapter_bind");
        if (methodM2087c != null) {
            if (!m944m(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        String[] strArr = {"MicroMsg.MvvmChattingItem", "[onBindView]"};
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    c3959f.add(method);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj2 = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:MessageBubble] 定位聊天消息绑定方法异常: ", thM8182b.getMessage(), thM8182b);
            obj2 = C4173t.f13710g;
        }
        Iterator it2 = ((List) obj2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (m944m((Method) next)) {
                obj = next;
                break;
            }
        }
        Method method2 = (Method) obj;
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "adapter_bind", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("adapter_bind").apply();
            } catch (Throwable unused) {
            }
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final Object m946w(int i9, Object obj, Set set) {
        boolean zBooleanValue;
        Object objM946w;
        if (obj != null && i9 <= 4 && set.add(obj)) {
            String name = obj.getClass().getName();
            Class<?> cls = obj.getClass();
            ConcurrentHashMap concurrentHashMap = this.f604k;
            Boolean bool = (Boolean) concurrentHashMap.get(cls);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                boolean z9 = (KavaReflector.findFieldRecursive(cls, "field_msgId") == null || KavaReflector.findFieldRecursive(cls, "field_msgSvrId") == null || KavaReflector.findFieldRecursive(cls, "field_type") == null || KavaReflector.findFieldRecursive(cls, "field_isSend") == null) ? false : true;
                concurrentHashMap.putIfAbsent(cls, Boolean.valueOf(z9));
                zBooleanValue = z9;
            }
            if (zBooleanValue) {
                return obj;
            }
            if (AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false) || (obj instanceof View) || (obj instanceof ViewGroup)) {
                return null;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    Object objM946w2 = m946w(i9 + 1, it.next(), set);
                    if (objM946w2 != null) {
                        return objM946w2;
                    }
                }
            } else {
                Class<?> cls2 = obj.getClass();
                ConcurrentHashMap concurrentHashMap2 = this.f603j;
                List arrayList = (List) concurrentHashMap2.get(cls2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (Class<?> superclass = cls2; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listDeclaredFields) {
                            Class<?> type = ((Field) obj2).getType();
                            if ((type.isPrimitive() || type.isArray() || type.equals(String.class) || Number.class.isAssignableFrom(type)) ? false : true) {
                                arrayList2.add(obj2);
                            }
                        }
                        AbstractC4171r.m8432h1(arrayList, arrayList2);
                    }
                    concurrentHashMap2.putIfAbsent(cls2, arrayList);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object field = KavaReflector.readField((Field) it2.next(), obj);
                    if (field != null && (objM946w = m946w(i9 + 1, field, set)) != null) {
                        return objM946w;
                    }
                }
            }
        }
        return null;
    }
}
