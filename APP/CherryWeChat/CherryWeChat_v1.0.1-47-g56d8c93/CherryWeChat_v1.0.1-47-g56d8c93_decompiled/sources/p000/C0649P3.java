package p000;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.Choreographer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.Toast;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: P3 */
/* JADX INFO: loaded from: classes.dex */
public class C0649P3 implements InterfaceC0302H0, InterfaceC2218m4, InterfaceC2647vw, InterfaceC0579Nd, InterfaceC2802zf {

    /* JADX INFO: renamed from: d */
    public static final int[] f2087d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2088a;

    /* JADX INFO: renamed from: b */
    public Object f2089b;

    /* JADX INFO: renamed from: c */
    public Object f2090c;

    public /* synthetic */ C0649P3(int i, Object obj) {
        this.f2088a = i;
        this.f2090c = obj;
    }

    /* JADX INFO: renamed from: H */
    public static int m1269H(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: l */
    public static C0304H2 m1270l(ImageDecoder.Source source, int i, int i2, C2644vt c2644vt) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C1454gd(i, i2, c2644vt));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C0304H2(0, (AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    /* JADX INFO: renamed from: A */
    public void m1271A(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1271A(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentViewDestroyed(abstractC2805zi, abstractComponentCallbacksC1503hi);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public Object m1272B(InterfaceC0938Vt interfaceC0938Vt) {
        HashMap map = (HashMap) this.f2090c;
        C1548ik c1548ik = (C1548ik) map.get(interfaceC0938Vt);
        if (c1548ik == null) {
            c1548ik = new C1548ik(interfaceC0938Vt);
            map.put(interfaceC0938Vt, c1548ik);
        } else {
            interfaceC0938Vt.mo1797a();
        }
        C1548ik c1548ik2 = c1548ik.f5501d;
        c1548ik2.f5500c = c1548ik.f5500c;
        c1548ik.f5500c.f5501d = c1548ik2;
        C1548ik c1548ik3 = (C1548ik) this.f2089b;
        c1548ik.f5501d = c1548ik3;
        C1548ik c1548ik4 = c1548ik3.f5500c;
        c1548ik.f5500c = c1548ik4;
        c1548ik4.f5501d = c1548ik;
        c1548ik.f5501d.f5500c = c1548ik;
        ArrayList arrayList = c1548ik.f5499b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c1548ik.f5499b.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public KeyListener m1273C(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0649P3) ((C0132D2) this.f2090c).f328b).getClass();
        if (keyListener instanceof C2759yf) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C2759yf(keyListener);
    }

    /* JADX INFO: renamed from: D */
    public synchronized List m1274D(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f2089b).contains(str)) {
                ((ArrayList) this.f2089b).add(str);
            }
            arrayList = (List) ((HashMap) this.f2090c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f2090c).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public ComponentCallbacks2C1473gw m1275E(Context context, ComponentCallbacks2C1273a componentCallbacks2C1273a, AbstractC0760Rn abstractC0760Rn, AbstractC2805zi abstractC2805zi, boolean z) {
        AbstractC2622vD.m5130a();
        AbstractC2622vD.m5130a();
        HashMap map = (HashMap) this.f2089b;
        ComponentCallbacks2C1473gw componentCallbacks2C1473gw = (ComponentCallbacks2C1473gw) map.get(abstractC0760Rn);
        if (componentCallbacks2C1473gw != null) {
            return componentCallbacks2C1473gw;
        }
        C0932Vn c0932Vn = new C0932Vn(abstractC0760Rn);
        C1517hw c1517hw = (C1517hw) this.f2090c;
        C0668Pg c0668Pg = new C0668Pg(this, abstractC2805zi);
        c1517hw.getClass();
        ComponentCallbacks2C1473gw componentCallbacks2C1473gw2 = new ComponentCallbacks2C1473gw(componentCallbacks2C1273a, c0932Vn, c0668Pg, context);
        map.put(abstractC0760Rn, componentCallbacks2C1473gw2);
        c0932Vn.mo1508l(new C1229bo(this, abstractC0760Rn));
        if (z) {
            componentCallbacks2C1473gw2.mo401k();
        }
        return componentCallbacks2C1473gw2;
    }

    /* JADX INFO: renamed from: F */
    public synchronized ArrayList m1276F(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f2089b).iterator();
        while (it.hasNext()) {
            List<C2561tw> list = (List) ((HashMap) this.f2090c).get((String) it.next());
            if (list != null) {
                for (C2561tw c2561tw : list) {
                    if ((c2561tw.f8880a.isAssignableFrom(cls) && cls2.isAssignableFrom(c2561tw.f8881b)) && !arrayList.contains(c2561tw.f8881b)) {
                        arrayList.add(c2561tw.f8881b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public String m1277G(InterfaceC0802Sm interfaceC0802Sm) {
        String str;
        synchronized (((C0118Cp) this.f2089b)) {
            str = (String) ((C0118Cp) this.f2089b).m186a(interfaceC0802Sm);
        }
        if (str == null) {
            C1070Yw c1070Yw = (C1070Yw) ((C2656w4) this.f2090c).mo1935c();
            try {
                interfaceC0802Sm.mo172b(c1070Yw.f3381a);
                byte[] bArrDigest = c1070Yw.f3381a.digest();
                char[] cArr = AbstractC2622vD.f9105b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = AbstractC2622vD.f9104a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C2656w4) this.f2090c).mo1934a(c1070Yw);
            }
        }
        synchronized (((C0118Cp) this.f2089b)) {
            ((C0118Cp) this.f2089b).m189d(interfaceC0802Sm, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: I */
    public void m1278I() {
        ((SparseIntArray) this.f2089b).clear();
    }

    /* JADX INFO: renamed from: J */
    public void mo1279J(AttributeSet attributeSet, int i) {
        switch (this.f2088a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2089b;
                C2656w4 c2656w4M5186A = C2656w4.m5186A(absSeekBar.getContext(), attributeSet, f2087d, i);
                Drawable drawableM5211r = c2656w4M5186A.m5211r(0);
                if (drawableM5211r != null) {
                    if (drawableM5211r instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM5211r;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM1290U = m1290U(animationDrawable.getFrame(i2), true);
                            drawableM1290U.setLevel(10000);
                            animationDrawable2.addFrame(drawableM1290U, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM5211r = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM5211r);
                }
                Drawable drawableM5211r2 = c2656w4M5186A.m5211r(1);
                if (drawableM5211r2 != null) {
                    absSeekBar.setProgressDrawable(m1290U(drawableM5211r2, false));
                }
                c2656w4M5186A.m5195E();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2089b).getContext().obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3074i, i, 0);
                try {
                    boolean z = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m1288S(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* JADX INFO: renamed from: K */
    public C2630vf m1280K(InputConnection inputConnection, EditorInfo editorInfo) {
        C0132D2 c0132d2 = (C0132D2) this.f2090c;
        if (inputConnection == null) {
            c0132d2.getClass();
            inputConnection = null;
        } else {
            C0649P3 c0649p3 = (C0649P3) c0132d2.f328b;
            c0649p3.getClass();
            if (!(inputConnection instanceof C2630vf)) {
                inputConnection = new C2630vf((EditText) c0649p3.f2089b, inputConnection, editorInfo);
            }
        }
        return (C2630vf) inputConnection;
    }

    /* JADX INFO: renamed from: L */
    public void m1281L(C0797Sh c0797Sh) {
        ExecutorC1341dw executorC1341dw = (ExecutorC1341dw) this.f2090c;
        C1017Xm c1017Xm = (C1017Xm) this.f2089b;
        int i = c0797Sh.f2499b;
        if (i == 0) {
            executorC1341dw.execute(new RunnableC0044B0(c1017Xm, c0797Sh.f2498a, 1, false));
        } else {
            executorC1341dw.execute(new RunnableC0308H6(i, 0, c1017Xm));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f7, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7 A[Catch: IOException | XmlPullParserException -> 0x01fd, IOException | XmlPullParserException -> 0x01fd, TryCatch #0 {IOException | XmlPullParserException -> 0x01fd, blocks: (B:18:0x0056, B:91:0x01f7, B:91:0x01f7, B:26:0x0068, B:27:0x0076, B:29:0x007b, B:32:0x0085, B:40:0x009f, B:35:0x008e, B:38:0x0097, B:41:0x00ad, B:45:0x00bc, B:45:0x00bc, B:47:0x00c4, B:47:0x00c4, B:48:0x00ce, B:48:0x00ce, B:57:0x00f7, B:57:0x00f7, B:58:0x00fe, B:58:0x00fe, B:59:0x0116, B:59:0x0116, B:51:0x00d7, B:51:0x00d7, B:53:0x00df, B:53:0x00df, B:54:0x00ed, B:54:0x00ed, B:60:0x0117, B:60:0x0117, B:62:0x011f, B:62:0x011f, B:63:0x012d, B:63:0x012d, B:66:0x0137, B:66:0x0137, B:67:0x0142, B:67:0x0142, B:68:0x015a, B:68:0x015a, B:69:0x015b, B:69:0x015b, B:72:0x0165, B:72:0x0165, B:73:0x0170, B:73:0x0170, B:74:0x0188, B:74:0x0188, B:75:0x0189, B:75:0x0189, B:77:0x0191, B:77:0x0191, B:78:0x019a, B:78:0x019a, B:81:0x01a4, B:81:0x01a4, B:82:0x01ae, B:82:0x01ae, B:83:0x01c6, B:83:0x01c6, B:84:0x01c7, B:84:0x01c7, B:87:0x01d1, B:87:0x01d1, B:88:0x01db, B:88:0x01db, B:89:0x01f3, B:89:0x01f3, B:90:0x01f4, B:90:0x01f4), top: B:98:0x0056 }] */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1282M(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C2188lb c2188lbM4849d;
        C2411qb c2411qb = new C2411qb();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c2188lbM4849d = null;
                } catch (IOException | XmlPullParserException unused) {
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (c2188lbM4849d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2188lbM4849d.f7635d.m4538a(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (c2188lbM4849d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2188lbM4849d.f7634c.m4603a(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2188lbM4849d = C2411qb.m4849d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (c2188lbM4849d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2188lbM4849d.f7633b.m4726a(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (c2188lbM4849d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2188lbM4849d.f7636e.m4796a(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2188lbM4849d = C2411qb.m4849d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c2188lbM4849d.f7635d.f7830a = true;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    if (c2188lbM4849d != null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C1321db.m2570a(context, xmlResourceParser, c2188lbM4849d.f7637f);
                                } else {
                                    continue;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2188lbM4849d = C2411qb.m4849d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c2188lbM4849d.f7635d.f7845h0 = 1;
                                }
                                break;
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (c2188lbM4849d != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2188lbM4849d = C2411qb.m4849d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                }
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c2411qb.f8456c.put(Integer.valueOf(c2188lbM4849d.f7632a), c2188lbM4849d);
                                    c2188lbM4849d = null;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c2411qb.f8456c.put(Integer.valueOf(c2188lbM4849d.f7632a), c2188lbM4849d);
                                    c2188lbM4849d = null;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c2411qb.f8456c.put(Integer.valueOf(c2188lbM4849d.f7632a), c2188lbM4849d);
                                    c2188lbM4849d = null;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.f2090c).put(identifier, c2411qb);
                                    return;
                                }
                                break;
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f2090c).put(identifier, c2411qb);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m1283N(InterfaceC0938Vt interfaceC0938Vt, Object obj) {
        HashMap map = (HashMap) this.f2090c;
        C1548ik c1548ik = (C1548ik) map.get(interfaceC0938Vt);
        if (c1548ik == null) {
            c1548ik = new C1548ik(interfaceC0938Vt);
            c1548ik.f5501d = c1548ik;
            C1548ik c1548ik2 = (C1548ik) this.f2089b;
            c1548ik.f5501d = c1548ik2.f5501d;
            c1548ik.f5500c = c1548ik2;
            c1548ik2.f5501d = c1548ik;
            c1548ik.f5501d.f5500c = c1548ik;
            map.put(interfaceC0938Vt, c1548ik);
        } else {
            interfaceC0938Vt.mo1797a();
        }
        if (c1548ik.f5499b == null) {
            c1548ik.f5499b = new ArrayList();
        }
        c1548ik.f5499b.add(obj);
    }

    /* JADX INFO: renamed from: O */
    public void m1284O(C2207lu c2207lu) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f2089b;
        C2387pu c2387pu = new C2387pu(c2207lu.f7693a, C2352p9.class);
        if (!map.containsKey(c2387pu)) {
            map.put(c2387pu, c2207lu);
            return;
        }
        C2207lu c2207lu2 = (C2207lu) map.get(c2387pu);
        if (c2207lu2.equals(c2207lu) && c2207lu.equals(c2207lu2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + c2387pu);
    }

    /* JADX INFO: renamed from: P */
    public void m1285P(InterfaceC2602uu interfaceC2602uu) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f2090c;
        if (interfaceC2602uu == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsMo30c = interfaceC2602uu.mo30c();
        if (!map.containsKey(clsMo30c)) {
            map.put(clsMo30c, interfaceC2602uu);
            return;
        }
        InterfaceC2602uu interfaceC2602uu2 = (InterfaceC2602uu) map.get(clsMo30c);
        if (interfaceC2602uu2.equals(interfaceC2602uu) && interfaceC2602uu.equals(interfaceC2602uu2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsMo30c);
    }

    /* JADX INFO: renamed from: Q */
    public void m1286Q(String str) {
        C0965Wd c0965Wd;
        synchronized (this) {
            try {
                c0965Wd = (C0965Wd) ((HashMap) this.f2089b).get(str);
                AbstractC0714Qj.m1488j("Argument must not be null", c0965Wd);
                int i = c0965Wd.f3007b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0965Wd.f3007b);
                }
                int i2 = i - 1;
                c0965Wd.f3007b = i2;
                if (i2 == 0) {
                    C0965Wd c0965Wd2 = (C0965Wd) ((HashMap) this.f2089b).remove(str);
                    if (!c0965Wd2.equals(c0965Wd)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0965Wd + ", but actually removed: " + c0965Wd2 + ", safeKey: " + str);
                    }
                    C2263n6 c2263n6 = (C2263n6) this.f2090c;
                    synchronized (c2263n6.f7981a) {
                        try {
                            if (c2263n6.f7981a.size() < 10) {
                                c2263n6.f7981a.offer(c0965Wd2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c0965Wd.f3006a.unlock();
    }

    /* JADX INFO: renamed from: R */
    public Object m1287R() {
        C1548ik c1548ik = (C1548ik) this.f2089b;
        C1548ik c1548ik2 = c1548ik.f5501d;
        while (true) {
            boolean zEquals = c1548ik2.equals(c1548ik);
            Object obj = c1548ik2.f5498a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c1548ik2.f5499b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c1548ik2.f5499b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C1548ik c1548ik3 = c1548ik2.f5501d;
            c1548ik3.f5500c = c1548ik2.f5500c;
            c1548ik2.f5500c.f5501d = c1548ik3;
            ((HashMap) this.f2090c).remove(obj);
            ((InterfaceC0938Vt) obj).mo1797a();
            c1548ik2 = c1548ik2.f5501d;
        }
    }

    /* JADX INFO: renamed from: S */
    public void m1288S(boolean z) {
        C0194Ef c0194Ef = (C0194Ef) ((C0649P3) ((C0132D2) this.f2090c).f328b).f2090c;
        if (c0194Ef.f595c != z) {
            if (c0194Ef.f594b != null) {
                C2372pf c2372pfM4798a = C2372pf.m4798a();
                C0151Df c0151Df = c0194Ef.f594b;
                c2372pfM4798a.getClass();
                AbstractC1293cr.m2548g("initCallback cannot be null", c0151Df);
                ReentrantReadWriteLock reentrantReadWriteLock = c2372pfM4798a.f8343a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c2372pfM4798a.f8344b.remove(c0151Df);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0194Ef.f595c = z;
            if (z) {
                C0194Ef.m387a(c0194Ef.f593a, C2372pf.m4798a().m4799b());
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m1289T(int i, int i2, int i3, int i4) {
        C0780S6 c0780s6 = (C0780S6) this.f2090c;
        c0780s6.f2465d.set(i, i2, i3, i4);
        Rect rect = c0780s6.f2464c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public Drawable m1290U(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0704QF) {
            ((AbstractC0746RF) ((InterfaceC0704QF) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m1290U(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f2090c) == null) {
                    this.f2090c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: a */
    public Object mo1291a() {
        return (C1316dD) this.f2089b;
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: b */
    public boolean mo642b(AbstractC0345I0 abstractC0345I0, Menu menu) {
        return ((InterfaceC0302H0) this.f2089b).mo642b(abstractC0345I0, menu);
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object obj, File file, C2644vt c2644vt) {
        return ((C0436K5) this.f2090c).mo892c(new C0608O5((InterfaceC0565N5) this.f2089b, ((BitmapDrawable) ((InterfaceC2389pw) obj).get()).getBitmap()), file, c2644vt);
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: d */
    public boolean mo643d(AbstractC0345I0 abstractC0345I0, MenuItem menuItem) {
        return ((InterfaceC0302H0) this.f2089b).mo643d(abstractC0345I0, menuItem);
    }

    @Override // p000.InterfaceC2218m4
    /* JADX INFO: renamed from: e */
    public void mo1292e(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // p000.InterfaceC2647vw
    /* JADX INFO: renamed from: f */
    public int mo893f(C2644vt c2644vt) {
        return 2;
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: g */
    public boolean mo644g(AbstractC0345I0 abstractC0345I0, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0176E3) this.f2090c).f460A;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(viewGroup);
        return ((InterfaceC0302H0) this.f2089b).mo644g(abstractC0345I0, menu);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g3, java.lang.Object] */
    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: h */
    public void mo645h(AbstractC0345I0 abstractC0345I0) {
        ((InterfaceC0302H0) this.f2089b).mo645h(abstractC0345I0);
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) this.f2090c;
        if (layoutInflaterFactory2C0176E3.f506w != null) {
            layoutInflaterFactory2C0176E3.f495l.getDecorView().removeCallbacks(layoutInflaterFactory2C0176E3.f507x);
        }
        if (layoutInflaterFactory2C0176E3.f505v != null) {
            C0273GE c0273ge = layoutInflaterFactory2C0176E3.f508y;
            if (c0273ge != null) {
                c0273ge.m554b();
            }
            C0273GE c0273geM4388a = AbstractC2185lE.m4388a(layoutInflaterFactory2C0176E3.f505v);
            c0273geM4388a.m553a(0.0f);
            layoutInflaterFactory2C0176E3.f508y = c0273geM4388a;
            c0273geM4388a.m556d(new C2526t3(2, this));
        }
        layoutInflaterFactory2C0176E3.f497n.onSupportActionModeFinished(layoutInflaterFactory2C0176E3.f504u);
        layoutInflaterFactory2C0176E3.f504u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0176E3.f460A;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(viewGroup);
        layoutInflaterFactory2C0176E3.m340I();
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: i */
    public boolean mo1293i(CharSequence charSequence, int i, int i2, C1043YB c1043yb) {
        if ((c1043yb.f3334c & 4) > 0) {
            return true;
        }
        if (((C1316dD) this.f2089b) == null) {
            this.f2089b = new C1316dD(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C2220m6) this.f2090c).getClass();
        ((C1316dD) this.f2089b).setSpan(new C1086ZB(c1043yb), i, i2, 33);
        return true;
    }

    @Override // p000.InterfaceC2218m4
    /* JADX INFO: renamed from: j */
    public void mo1294j(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // p000.InterfaceC2218m4
    /* JADX INFO: renamed from: k */
    public void mo1295k(int i, float f) {
    }

    /* JADX INFO: renamed from: m */
    public void m1296m(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, Bundle bundle, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1296m(abstractComponentCallbacksC1503hi, bundle, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentActivityCreated(abstractC2805zi, abstractComponentCallbacksC1503hi, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1297n(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractActivityC1244c3 abstractActivityC1244c3 = abstractC2805zi.f9512u.f7401m;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1297n(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentAttached(abstractC2805zi, abstractComponentCallbacksC1503hi, abstractActivityC1244c3);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1298o(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, Bundle bundle, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1298o(abstractComponentCallbacksC1503hi, bundle, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentCreated(abstractC2805zi, abstractComponentCallbacksC1503hi, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1299p(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1299p(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentDestroyed(abstractC2805zi, abstractComponentCallbacksC1503hi);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1300q(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1300q(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentDetached(abstractC2805zi, abstractComponentCallbacksC1503hi);
            }
        }
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText editText) {
        String strM625r;
        String string;
        switch (this.f2088a) {
            case 11:
                Activity activity = (Activity) this.f2089b;
                Editable text = editText.getText();
                if (text == null || (string = text.toString()) == null || (strM625r = AbstractC2564tz.m5070e0(string).toString()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-88781268973621L);
                }
                if (strM625r.length() <= 0) {
                    Toast.makeText(activity, AbstractC0295Gu.m625r(-88785563940917L), 0).show();
                } else {
                    C1498hd c1498hd = AbstractC1499he.f5282a;
                    AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C1451ga(strM625r, activity, (C1495ha) this.f2090c, null), 3);
                }
                break;
            default:
                String strValueOf = String.valueOf(editText.getText());
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1176e((String) ((C2648vx) this.f2089b).f9162a, strValueOf);
                View view = (View) this.f2090c;
                if (view instanceof C2748yA) {
                    ((C2748yA) view).setValue(strValueOf);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m1301s(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1301s(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentPaused(abstractC2805zi, abstractComponentCallbacksC1503hi);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1302t(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractActivityC1244c3 abstractActivityC1244c3 = abstractC2805zi.f9512u.f7401m;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1302t(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentPreAttached(abstractC2805zi, abstractComponentCallbacksC1503hi, abstractActivityC1244c3);
            }
        }
    }

    public String toString() {
        switch (this.f2088a) {
            case 21:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C1548ik c1548ik = (C1548ik) this.f2089b;
                C1548ik c1548ik2 = c1548ik.f5500c;
                boolean z = false;
                while (!c1548ik2.equals(c1548ik)) {
                    sb.append('{');
                    sb.append(c1548ik2.f5498a);
                    sb.append(':');
                    ArrayList arrayList = c1548ik2.f5499b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c1548ik2 = c1548ik2.f5500c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 27:
                String str = "[ ";
                if (((C0256Fy) this.f2089b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0256Fy) this.f2089b).f836h[i] + " ";
                    }
                }
                return str + "] " + ((C0256Fy) this.f2089b);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1303u(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, Bundle bundle, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1303u(abstractComponentCallbacksC1503hi, bundle, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentPreCreated(abstractC2805zi, abstractComponentCallbacksC1503hi, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1304v(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1304v(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentResumed(abstractC2805zi, abstractComponentCallbacksC1503hi);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m1305w(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, Bundle bundle, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1305w(abstractComponentCallbacksC1503hi, bundle, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentSaveInstanceState(abstractC2805zi, abstractComponentCallbacksC1503hi, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m1306x(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1306x(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentStarted(abstractC2805zi, abstractComponentCallbacksC1503hi);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1307y(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1307y(abstractComponentCallbacksC1503hi, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentStopped(abstractC2805zi, abstractComponentCallbacksC1503hi);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m1308z(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, View view, Bundle bundle, boolean z) {
        AbstractC2805zi abstractC2805zi = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = abstractC2805zi.f9514w;
        if (abstractComponentCallbacksC1503hi2 != null) {
            abstractComponentCallbacksC1503hi2.m2872f().f9504m.m1308z(abstractComponentCallbacksC1503hi, view, bundle, true);
        }
        for (C2324oi c2324oi : (CopyOnWriteArrayList) this.f2089b) {
            if (z) {
                c2324oi.getClass();
            } else {
                c2324oi.f8171a.onFragmentViewCreated(abstractC2805zi, abstractComponentCallbacksC1503hi, view, bundle);
            }
        }
    }

    public /* synthetic */ C0649P3(int i, Object obj, Object obj2) {
        this.f2088a = i;
        this.f2089b = obj;
        this.f2090c = obj2;
    }

    public C0649P3(C1517hw c1517hw) {
        this.f2088a = 23;
        this.f2089b = new HashMap();
        this.f2090c = c1517hw;
    }

    public C0649P3(C2656w4 c2656w4) {
        this.f2088a = 24;
        C0668Pg c0668Pg = C2428qs.f8518e;
        C2428qs c2428qs = new C2428qs();
        c2428qs.f8520a = new ArrayList();
        c2428qs.f8522c = new HashSet();
        c2428qs.f8523d = c2656w4;
        c2428qs.f8521b = c0668Pg;
        this.f2090c = new C2756yc(3);
        this.f2089b = c2428qs;
    }

    public C0649P3(C2430qu c2430qu) {
        this.f2088a = 26;
        this.f2089b = new HashMap(c2430qu.f8524a);
        this.f2090c = new HashMap(c2430qu.f8525b);
    }

    public C0649P3(AbsSeekBar absSeekBar) {
        this.f2088a = 0;
        this.f2089b = absSeekBar;
    }

    public C0649P3(EditText editText, int i) {
        this.f2088a = i;
        switch (i) {
            case 14:
                this.f2089b = editText;
                C0194Ef c0194Ef = new C0194Ef(editText);
                this.f2090c = c0194Ef;
                editText.addTextChangedListener(c0194Ef);
                if (C2544tf.f8859b == null) {
                    synchronized (C2544tf.f8858a) {
                        try {
                            if (C2544tf.f8859b == null) {
                                C2544tf c2544tf = new C2544tf();
                                try {
                                    C2544tf.f8860c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2544tf.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C2544tf.f8859b = c2544tf;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C2544tf.f8859b);
                return;
            default:
                this.f2089b = editText;
                this.f2090c = new C0132D2(editText);
                return;
        }
    }

    public C0649P3(AbstractC2805zi abstractC2805zi) {
        this.f2088a = 17;
        this.f2089b = new CopyOnWriteArrayList();
        this.f2090c = abstractC2805zi;
    }

    public C0649P3(Context context) {
        this.f2088a = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1293cr.m2539R(context, io.github.cherrywechat.R.attr.materialCalendarStyle, C0549Mq.class.getCanonicalName()).data, AbstractC0939Vu.f2944m);
        C2220m6.m4463e(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C2220m6.m4463e(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C2220m6.m4463e(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C2220m6.m4463e(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM1643j = AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 7);
        this.f2089b = C2220m6.m4463e(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C2220m6.m4463e(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f2090c = C2220m6.m4463e(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM1643j.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0649P3(Animation animation) {
        this.f2088a = 16;
        this.f2089b = animation;
        this.f2090c = null;
    }

    public C0649P3(Animator animator) {
        this.f2088a = 16;
        this.f2089b = null;
        this.f2090c = animator;
    }

    public C0649P3(ArrayList arrayList, ArrayList arrayList2) {
        this.f2088a = 19;
        int size = arrayList.size();
        this.f2089b = new int[size];
        this.f2090c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2089b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2090c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0649P3(int i, int i2) {
        this.f2088a = 19;
        this.f2089b = new int[]{i, i2};
        this.f2090c = new float[]{0.0f, 1.0f};
    }

    public C0649P3(int i) {
        this.f2088a = i;
        switch (i) {
            case 12:
                break;
            case 13:
                this.f2089b = new HashMap();
                this.f2090c = new C2263n6(1);
                break;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                this.f2089b = new SparseIntArray();
                this.f2090c = new SparseIntArray();
                break;
            case 21:
                this.f2089b = new C1548ik(null);
                this.f2090c = new HashMap();
                break;
            case 25:
                this.f2089b = new AtomicReference();
                this.f2090c = new C0521M4(0);
                break;
            case 26:
                this.f2089b = new HashMap();
                this.f2090c = new HashMap();
                break;
            case 28:
                this.f2089b = new ArrayList();
                this.f2090c = new HashMap();
                break;
            case 29:
                this.f2089b = new C0118Cp(1000L);
                this.f2090c = AbstractC0714Qj.m1478I(10, new C1517hw(1));
                break;
            default:
                this.f2089b = Choreographer.getInstance();
                this.f2090c = Looper.myLooper();
                break;
        }
    }

    public C0649P3(int i, int i2, int i3) {
        this.f2088a = 19;
        this.f2089b = new int[]{i, i2, i3};
        this.f2090c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0649P3(C2304o4 c2304o4) {
        this.f2088a = 6;
        this.f2090c = c2304o4;
        this.f2088a = 6;
        this.f2089b = c2304o4;
    }

    public C0649P3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3, InterfaceC0302H0 interfaceC0302H0) {
        this.f2088a = 4;
        this.f2090c = layoutInflaterFactory2C0176E3;
        this.f2089b = interfaceC0302H0;
    }
}
