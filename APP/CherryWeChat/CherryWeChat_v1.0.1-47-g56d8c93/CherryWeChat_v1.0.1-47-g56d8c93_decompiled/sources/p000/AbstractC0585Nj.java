package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: Nj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0585Nj {

    /* JADX INFO: renamed from: c */
    public static final C2656w4 f1898c;

    /* JADX INFO: renamed from: d */
    public static C2656w4 f1899d;

    /* JADX INFO: renamed from: f */
    public static Method f1901f;

    /* JADX INFO: renamed from: g */
    public static boolean f1902g;

    /* JADX INFO: renamed from: h */
    public static boolean f1903h;

    /* JADX INFO: renamed from: i */
    public static Method f1904i;

    /* JADX INFO: renamed from: a */
    public static final Object f1896a = new Object();

    /* JADX INFO: renamed from: b */
    public static final String[] f1897b = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: e */
    public static final Object f1900e = new Object();

    static {
        Object obj = null;
        f1898c = new C2656w4(obj, obj, obj, 20);
    }

    /* JADX INFO: renamed from: A */
    public static void m1122A(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m1127F(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m1127F(b3) && !m1127F(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: B */
    public static void m1123B(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m1127F(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m1127F(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: C */
    public static void m1124C(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (m1127F(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: D */
    public static final void m1125D(InterfaceC1137ac interfaceC1137ac, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC1260cc.f4274a.iterator();
        while (it.hasNext()) {
            try {
                ((C0046B2) it.next()).getClass();
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0148Dc.m268b(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0148Dc.m268b(th, new C0278Gd(interfaceC1137ac));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX INFO: renamed from: E */
    public static final int m1126E(InterfaceC0126Cx interfaceC0126Cx, InterfaceC0126Cx[] interfaceC0126CxArr) {
        int iHashCode = (interfaceC0126Cx.mo203b().hashCode() * 31) + Arrays.hashCode(interfaceC0126CxArr);
        int iMo205d = interfaceC0126Cx.mo205d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo205d > 0)) {
                break;
            }
            int i2 = iMo205d - 1;
            int i3 = i * 31;
            String strMo203b = interfaceC0126Cx.mo210j(interfaceC0126Cx.mo205d() - iMo205d).mo203b();
            if (strMo203b != null) {
                iHashCode2 = strMo203b.hashCode();
            }
            i = i3 + iHashCode2;
            iMo205d = i2;
        }
        int iMo205d2 = interfaceC0126Cx.mo205d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo205d2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo205d2 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC1406fG abstractC1406fGMo204c = interfaceC0126Cx.mo210j(interfaceC0126Cx.mo205d() - iMo205d2).mo204c();
            iHashCode3 = i5 + (abstractC1406fGMo204c != null ? abstractC1406fGMo204c.hashCode() : 0);
            iMo205d2 = i4;
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1127F(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: G */
    public static void m1128G(InterfaceC1409fc interfaceC1409fc, Function2 function2, int i) {
        InterfaceC1137ac interfaceC1137ac = ExecutorC0921Vc.f2876b;
        if ((i & 1) != 0) {
            interfaceC1137ac = C0366If.f1247a;
        }
        InterfaceC1137ac interfaceC1137acM276j = AbstractC0148Dc.m276j(interfaceC1409fc.mo152a(), interfaceC1137ac, true);
        C1498hd c1498hd = AbstractC1499he.f5282a;
        if (interfaceC1137acM276j != c1498hd && interfaceC1137acM276j.mo24m(C1456gf.f5158b) == null) {
            interfaceC1137acM276j = interfaceC1137acM276j.mo23l(c1498hd);
        }
        C0943Vy c0943Vy = new C0943Vy(interfaceC1137acM276j, true);
        int iM424v = AbstractC0213Ey.m424v(1);
        C0829TC c0829tc = C0829TC.f2620a;
        if (iM424v == 0) {
            try {
                AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(AbstractC0628Oj.m1242k(c0943Vy, c0943Vy, function2)), c0829tc);
                return;
            } finally {
                th = th;
                if (th instanceof C1324de) {
                    th = ((C1324de) th).f4800a;
                }
                c0943Vy.mo264f(new C0297Gw(th));
            }
        }
        if (iM424v != 1) {
            if (iM424v == 2) {
                AbstractC0628Oj.m1225E(AbstractC0628Oj.m1242k(c0943Vy, c0943Vy, function2)).mo264f(c0829tc);
                return;
            }
            if (iM424v != 3) {
                throw new C0232Fa();
            }
            try {
                InterfaceC1137ac interfaceC1137ac2 = c0943Vy.f8910c;
                Object objM604E = AbstractC0295Gu.m604E(interfaceC1137ac2, null);
                try {
                    AbstractC0828TB.m1636c(2, function2);
                    Object objMo446d = function2.mo446d(c0943Vy, c0943Vy);
                    if (objMo446d != EnumC1453gc.f5148a) {
                        c0943Vy.mo264f(objMo446d);
                    }
                } finally {
                    AbstractC0295Gu.m601B(interfaceC1137ac2, objM604E);
                }
            } catch (Throwable th) {
                th = th;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m1129H(Object obj, InterfaceC2253mx interfaceC2253mx, byte[] bArr, int i, int i2, C0091C4 c0091c4) throws C0673Pl {
        int iM1151s = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM1151s = m1151s(i3, bArr, iM1151s, c0091c4);
            i3 = c0091c4.f204a;
        }
        int i4 = iM1151s;
        if (i3 < 0 || i3 > i2 - i4) {
            throw C0673Pl.m1370g();
        }
        int i5 = i4 + i3;
        interfaceC2253mx.mo1077g(obj, bArr, i4, i5, c0091c4);
        c0091c4.f206c = obj;
        return i5;
    }

    /* JADX INFO: renamed from: K */
    public static void m1130K(Context context, String str) {
        synchronized (f1896a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                } catch (Exception unused) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1131L(Context context) {
        String attributeValue;
        synchronized (f1896a) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX INFO: renamed from: M */
    public static void m1132M(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                HashMap map = AbstractC0999XA.f3193a;
                int iM2889a = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-167885976631349L));
                textView.setTag(R.id.tag_textview_color_ban, null);
                textView.setTextColor(iM2889a);
                textView.setTag(R.id.tag_textview_color_ban, TextView.class);
            } else if (childAt instanceof ViewGroup) {
                m1132M((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static final Object m1133N(AbstractC1217bc abstractC1217bc, Function2 function2, InterfaceC0190Eb interfaceC0190Eb) throws Throwable {
        InterfaceC1418fl interfaceC1418fl;
        InterfaceC1137ac interfaceC1137acMo263e = interfaceC0190Eb.mo263e();
        abstractC1217bc.getClass();
        InterfaceC1137ac interfaceC1137acMo23l = interfaceC1137acMo263e.mo23l(abstractC1217bc);
        InterfaceC1332dm interfaceC1332dm = (InterfaceC1332dm) interfaceC1137acMo23l.mo24m(C1456gf.f5162f);
        if (interfaceC1332dm != null && !interfaceC1332dm.mo1745d()) {
            throw interfaceC1332dm.mo1748p();
        }
        if (interfaceC1137acMo23l == interfaceC1137acMo263e) {
            C2339ox c2339ox = new C2339ox(interfaceC0190Eb, interfaceC1137acMo23l);
            return AbstractC0148Dc.m286t(c2339ox, c2339ox, function2);
        }
        C1456gf c1456gf = C1456gf.f5158b;
        if (m1134a(interfaceC1137acMo23l.mo24m(c1456gf), interfaceC1137acMo263e.mo24m(c1456gf))) {
            C2664wC c2664wC = new C2664wC(interfaceC0190Eb, interfaceC1137acMo23l);
            InterfaceC1137ac interfaceC1137ac = c2664wC.f8910c;
            Object objM604E = AbstractC0295Gu.m604E(interfaceC1137ac, null);
            try {
                return AbstractC0148Dc.m286t(c2664wC, c2664wC, function2);
            } finally {
                AbstractC0295Gu.m601B(interfaceC1137ac, objM604E);
            }
        }
        C1411fe c1411fe = new C1411fe(interfaceC0190Eb, interfaceC1137acMo23l);
        try {
            AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(AbstractC0628Oj.m1242k(c1411fe, c1411fe, function2)), C0829TC.f2620a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1411fe.f4992e;
            do {
                int i = atomicIntegerFieldUpdater.get(c1411fe);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object obj = C2152km.f7529a.get(c1411fe);
                    C1462gl c1462gl = obj instanceof C1462gl ? (C1462gl) obj : null;
                    if (c1462gl != null && (interfaceC1418fl = c1462gl.f5181a) != null) {
                        obj = interfaceC1418fl;
                    }
                    if (obj instanceof C0189Ea) {
                        throw ((C0189Ea) obj).f575a;
                    }
                    return obj;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c1411fe, 0, 1));
            return EnumC1453gc.f5148a;
        } catch (Throwable th) {
            th = th;
            if (th instanceof C1324de) {
                th = ((C1324de) th).f4800a;
            }
            c1411fe.mo264f(new C0297Gw(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1134a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static final void m1135b(AbstractC2580uE abstractC2580uE, C1518hx c1518hx, AbstractC0760Rn abstractC0760Rn) {
        Object obj;
        boolean z;
        HashMap map = abstractC2580uE.f8938a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = abstractC2580uE.f8938a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        C1238bx c1238bx = (C1238bx) obj;
        if (c1238bx == null || (z = c1238bx.f4209c)) {
            return;
        }
        if (z) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        c1238bx.f4209c = true;
        abstractC0760Rn.mo1555a(c1238bx);
        c1518hx.m2898c(c1238bx.f4207a, c1238bx.f4208b.f4096e);
        EnumC0675Pn enumC0675Pn = ((C1185ao) abstractC0760Rn).f4064c;
        if (enumC0675Pn == EnumC0675Pn.f2148b || enumC0675Pn.m1371a(EnumC0675Pn.f2150d)) {
            c1518hx.m2899d();
        } else {
            abstractC0760Rn.mo1555a(new C1366ed(1, abstractC0760Rn, c1518hx));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1136d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    /* JADX INFO: renamed from: e */
    public static int m1137e(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: f */
    public static final void m1138f(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0148Dc.m268b(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m1139g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static long[] m1140h(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: i */
    public static LinearLayout m1141i(Context context) {
        AbstractC0295Gu.m625r(-92234422679605L);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(AbstractC0295Gu.m616i(56));
        frameLayout.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        textView.setText(AbstractC0295Gu.m625r(-92268782417973L));
        textView.setId(android.R.id.title);
        HashMap map = AbstractC0999XA.f3193a;
        textView.setTextColor(C1517hw.m2894f(context) ? -1 : -16777216);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setText(AbstractC0295Gu.m625r(-92333206927413L));
        textView2.setGravity(5);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        textView2.setId(android.R.id.summary);
        textView2.setTextColor(C1517hw.m2894f(context) ? -1929379841 : -1946157056);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 19;
        frameLayout.addView(textView, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 21;
        frameLayout.addView(textView2, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(context), -1, AbstractC0295Gu.m616i(10));
        linearLayout.addView(frameLayout, -1, -2);
        linearLayout.addView(new Space(context), -1, AbstractC0295Gu.m616i(5));
        C0183EA.f539a.getClass();
        if (C0183EA.m373a().equals(AbstractC0295Gu.m625r(-91865055492149L))) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(C1517hw.m2894f(context) ? -14408668 : -1710619));
            stateListDrawable.addState(new int[0], new ColorDrawable(C1517hw.m2894f(context) ? -15132391 : -1));
            frameLayout.setBackground(stateListDrawable);
        }
        linearLayout.setOnClickListener(new ViewOnClickListenerC1477h(9, frameLayout));
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public static void m1142j(ViewGroup viewGroup) {
        AbstractC0295Gu.m625r(-167469364803637L);
        m1132M(viewGroup);
        ArrayList<View> arrayList = new ArrayList<>();
        viewGroup.findViewsWithText(arrayList, AbstractC0295Gu.m625r(-167512314476597L), 2);
        if (arrayList.isEmpty()) {
            return;
        }
        View view = arrayList.get(0);
        AbstractC0295Gu.m625r(-167525199378485L);
        arrayList.clear();
        ViewParent parent = view.getParent();
        AbstractC0295Gu.m625r(-167563854084149L);
        View childAt = ((LinearLayout) parent).getChildAt(1);
        AbstractC0295Gu.m625r(-167293271144501L);
        TextView textView = (TextView) childAt;
        HashMap map = AbstractC0999XA.f3193a;
        Drawable drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-168105019963445L));
        if (textView != null) {
            textView.setTag(R.id.tag_view_bg_ban, null);
            textView.setBackground(drawableM2890b);
            textView.setTag(R.id.tag_view_bg_ban, Object.class);
        }
        int iM2889a = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-167731357808693L));
        if (textView != null) {
            textView.setTag(R.id.tag_textview_color_ban, null);
            textView.setTextColor(iM2889a);
            textView.setTag(R.id.tag_textview_color_ban, TextView.class);
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m1143k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: l */
    public static int m1144l(byte[] bArr, int i, C0091C4 c0091c4) throws C0673Pl {
        int iM1152t = m1152t(bArr, i, c0091c4);
        int i2 = c0091c4.f204a;
        if (i2 < 0) {
            throw C0673Pl.m1368e();
        }
        if (i2 > bArr.length - iM1152t) {
            throw C0673Pl.m1370g();
        }
        if (i2 == 0) {
            c0091c4.f206c = AbstractC2744y6.f9369b;
            return iM1152t;
        }
        c0091c4.f206c = AbstractC2744y6.m5328c(bArr, iM1152t, i2);
        return iM1152t + i2;
    }

    /* JADX INFO: renamed from: m */
    public static int m1145m(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: n */
    public static long m1146n(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: o */
    public static int m1147o(InterfaceC2253mx interfaceC2253mx, int i, byte[] bArr, int i2, int i3, InterfaceC0458Kl interfaceC0458Kl, C0091C4 c0091c4) throws C0673Pl {
        Object objMo1080j = interfaceC2253mx.mo1080j();
        InterfaceC2253mx interfaceC2253mx2 = interfaceC2253mx;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C0091C4 c0091c42 = c0091c4;
        int iM1129H = m1129H(objMo1080j, interfaceC2253mx2, bArr2, i2, i4, c0091c42);
        interfaceC2253mx2.mo1074d(objMo1080j);
        c0091c42.f206c = objMo1080j;
        interfaceC0458Kl.add(objMo1080j);
        while (iM1129H < i4) {
            C0091C4 c0091c43 = c0091c42;
            int i5 = i4;
            int iM1152t = m1152t(bArr2, iM1129H, c0091c43);
            if (i != c0091c43.f204a) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC2253mx interfaceC2253mx3 = interfaceC2253mx2;
            Object objMo1080j2 = interfaceC2253mx3.mo1080j();
            iM1129H = m1129H(objMo1080j2, interfaceC2253mx3, bArr3, iM1152t, i5, c0091c43);
            interfaceC2253mx2 = interfaceC2253mx3;
            bArr2 = bArr3;
            i4 = i5;
            c0091c42 = c0091c43;
            interfaceC2253mx2.mo1074d(objMo1080j2);
            c0091c42.f206c = objMo1080j2;
            interfaceC0458Kl.add(objMo1080j2);
        }
        return iM1129H;
    }

    /* JADX INFO: renamed from: p */
    public static int m1148p(byte[] bArr, int i, C0091C4 c0091c4) throws C0673Pl {
        int iM1152t = m1152t(bArr, i, c0091c4);
        int i2 = c0091c4.f204a;
        if (i2 < 0) {
            throw C0673Pl.m1368e();
        }
        if (i2 == 0) {
            c0091c4.f206c = "";
            return iM1152t;
        }
        c0091c4.f206c = new String(bArr, iM1152t, i2, AbstractC0501Ll.f1637a);
        return iM1152t + i2;
    }

    /* JADX INFO: renamed from: q */
    public static int m1149q(byte[] bArr, int i, C0091C4 c0091c4) throws C0673Pl {
        int iM1152t = m1152t(bArr, i, c0091c4);
        int i2 = c0091c4.f204a;
        if (i2 < 0) {
            throw C0673Pl.m1368e();
        }
        if (i2 == 0) {
            c0091c4.f206c = "";
            return iM1152t;
        }
        c0091c4.f206c = AbstractC2536tD.f8842a.mo1360i(bArr, iM1152t, i2);
        return iM1152t + i2;
    }

    /* JADX INFO: renamed from: r */
    public static int m1150r(int i, byte[] bArr, int i2, int i3, C1001XC c1001xc, C0091C4 c0091c4) throws C0673Pl {
        if ((i >>> 3) == 0) {
            throw C0673Pl.m1364a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM1154v = m1154v(bArr, i2, c0091c4);
            c1001xc.m1894d(i, Long.valueOf(c0091c4.f205b));
            return iM1154v;
        }
        if (i4 == 1) {
            c1001xc.m1894d(i, Long.valueOf(m1146n(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM1152t = m1152t(bArr, i2, c0091c4);
            int i5 = c0091c4.f204a;
            if (i5 < 0) {
                throw C0673Pl.m1368e();
            }
            if (i5 > bArr.length - iM1152t) {
                throw C0673Pl.m1370g();
            }
            if (i5 == 0) {
                c1001xc.m1894d(i, AbstractC2744y6.f9369b);
            } else {
                c1001xc.m1894d(i, AbstractC2744y6.m5328c(bArr, iM1152t, i5));
            }
            return iM1152t + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C0673Pl.m1364a();
            }
            c1001xc.m1894d(i, Integer.valueOf(m1145m(i2, bArr)));
            return i2 + 4;
        }
        C1001XC c1001xcM1891c = C1001XC.m1891c();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iM1152t2 = m1152t(bArr, i2, c0091c4);
            i7 = c0091c4.f204a;
            if (i7 == i6) {
                i2 = iM1152t2;
                break;
            }
            i2 = m1150r(i7, bArr, iM1152t2, i3, c1001xcM1891c, c0091c4);
        }
        if (i2 > i3 || i7 != i6) {
            throw C0673Pl.m1369f();
        }
        c1001xc.m1894d(i, c1001xcM1891c);
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public static int m1151s(int i, byte[] bArr, int i2, C0091C4 c0091c4) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c0091c4.f204a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c0091c4.f204a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0091c4.f204a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0091c4.f204a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0091c4.f204a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m1152t(byte[] bArr, int i, C0091C4 c0091c4) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m1151s(b, bArr, i2, c0091c4);
        }
        c0091c4.f204a = b;
        return i2;
    }

    /* JADX INFO: renamed from: u */
    public static int m1153u(int i, byte[] bArr, int i2, int i3, InterfaceC0458Kl interfaceC0458Kl, C0091C4 c0091c4) {
        AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) interfaceC0458Kl;
        int iM1152t = m1152t(bArr, i2, c0091c4);
        abstractC0071Bl.m119b(c0091c4.f204a);
        while (iM1152t < i3) {
            int iM1152t2 = m1152t(bArr, iM1152t, c0091c4);
            if (i != c0091c4.f204a) {
                break;
            }
            iM1152t = m1152t(bArr, iM1152t2, c0091c4);
            abstractC0071Bl.m119b(c0091c4.f204a);
        }
        return iM1152t;
    }

    /* JADX INFO: renamed from: v */
    public static int m1154v(byte[] bArr, int i, C0091C4 c0091c4) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c0091c4.f205b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c0091c4.f205b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: w */
    public static String m1155w(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static Map m1156x() {
        return AbstractC2598uq.m5110L(new C0208Et(AbstractC0295Gu.m625r(-746564100290613L), AbstractC0295Gu.m625r(-746121718659125L)), new C0208Et(AbstractC0295Gu.m625r(-744648544876597L), AbstractC0295Gu.m625r(-744734444222517L)), new C0208Et(AbstractC0295Gu.m625r(-744889063045173L), AbstractC0295Gu.m625r(-744459566315573L)), new C0208Et(AbstractC0295Gu.m625r(-744622775072821L), AbstractC0295Gu.m625r(-745279905069109L)), new C0208Et(AbstractC0295Gu.m625r(-745434523891765L), AbstractC0295Gu.m625r(-744962077489205L)), new C0208Et(AbstractC0295Gu.m625r(-745116696311861L), AbstractC0295Gu.m625r(-743549033248821L)), new C0208Et(AbstractC0295Gu.m625r(-743703652071477L), AbstractC0295Gu.m625r(-743802436319285L)), new C0208Et(AbstractC0295Gu.m625r(-743420184229941L), AbstractC0295Gu.m625r(-743536148346933L)), new C0208Et(AbstractC0295Gu.m625r(-744249112918069L), AbstractC0295Gu.m625r(-744356487100469L)), new C0208Et(AbstractC0295Gu.m625r(-743961350109237L), AbstractC0295Gu.m625r(-744047249455157L)), new C0208Et(AbstractC0295Gu.m625r(-742608435410997L), AbstractC0295Gu.m625r(-742174643714101L)), new C0208Et(AbstractC0295Gu.m625r(-742385097111605L), AbstractC0295Gu.m625r(-742402276980789L)));
    }

    /* JADX INFO: renamed from: y */
    public static Map m1157y() {
        return AbstractC2598uq.m5110L(new C0208Et(AbstractC0295Gu.m625r(-756859136899125L), AbstractC0295Gu.m625r(-756923561408565L)), new C0208Et(AbstractC0295Gu.m625r(-756511244548149L), AbstractC0295Gu.m625r(-756588553959477L)), new C0208Et(AbstractC0295Gu.m625r(-756730287880245L), AbstractC0295Gu.m625r(-757348763170869L)), new C0208Et(AbstractC0295Gu.m625r(-757507676960821L), AbstractC0295Gu.m625r(-757048115460149L)), new C0208Et(AbstractC0295Gu.m625r(-757207029250101L), AbstractC0295Gu.m625r(-773240142166069L)), new C0208Et(AbstractC0295Gu.m625r(-773399055956021L), AbstractC0295Gu.m625r(-773484955301941L)), new C0208Et(AbstractC0295Gu.m625r(-773085523343413L), AbstractC0295Gu.m625r(-773180012623925L)), new C0208Et(AbstractC0295Gu.m625r(-773888682227765L), AbstractC0295Gu.m625r(-773974581573685L)), new C0208Et(AbstractC0295Gu.m625r(-773575149615157L), AbstractC0295Gu.m625r(-773669638895669L)), new C0208Et(AbstractC0295Gu.m625r(-772183580211253L), AbstractC0295Gu.m625r(-772248004720693L)), new C0208Et(AbstractC0295Gu.m625r(-772402623543349L), AbstractC0295Gu.m625r(-771947357009973L)), new C0208Et(AbstractC0295Gu.m625r(-772114860734517L), AbstractC0295Gu.m625r(-772771990730805L)), new C0208Et(AbstractC0295Gu.m625r(-772905134716981L), AbstractC0295Gu.m625r(-772432688314421L)), new C0208Et(AbstractC0295Gu.m625r(-772570127267893L), AbstractC0295Gu.m625r(-772668911515701L)), new C0208Et(AbstractC0295Gu.m625r(-771182852831285L), AbstractC0295Gu.m625r(-770761946036277L)), new C0208Et(AbstractC0295Gu.m625r(-770899384989749L), AbstractC0295Gu.m625r(-770968104466485L)), new C0208Et(AbstractC0295Gu.m625r(-771651004266549L), AbstractC0295Gu.m625r(-771719723743285L)), new C0208Et(AbstractC0295Gu.m625r(-771852867729461L), AbstractC0295Gu.m625r(-771419076032565L)));
    }

    /* JADX INFO: renamed from: z */
    public static ColorStateList m1158z(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0688Q.m1417u(drawable)) {
            return null;
        }
        return AbstractC0688Q.m1401e(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo1159I(int i);

    /* JADX INFO: renamed from: J */
    public abstract void mo1160J(Typeface typeface);

    /* JADX INFO: renamed from: c */
    public void m1161c(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2371pe(i, 1, this));
    }
}
