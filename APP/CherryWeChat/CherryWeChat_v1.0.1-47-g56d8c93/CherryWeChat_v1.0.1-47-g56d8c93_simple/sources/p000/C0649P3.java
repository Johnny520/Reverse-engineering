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
import java.util.ArrayDeque;
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

/* JADX INFO: renamed from: P3 */
/* JADX INFO: loaded from: classes.dex */
public class C0649P3 implements InterfaceC0302H0, InterfaceC2218m4, InterfaceC2647vw, InterfaceC0579Nd, InterfaceC2802zf {

    /* JADX INFO: renamed from: d */
    public static final int[] f2087d = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2088a;

    /* JADX INFO: renamed from: b */
    public Object f2089b;

    /* JADX INFO: renamed from: c */
    public Object f2090c;

    static {
        f2087d = new int[]{R.attr.indeterminateDrawable, R.attr.progressDrawable};
    }

    public /* synthetic */ C0649P3(int r1, Object r2) {
        this.f2088a = r1;
        this.f2090c = r2;
    }

    /* JADX INFO: renamed from: H */
    public static int m1269H(int r5, int r6) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r1 >= r5) goto L12;
        r2 = r2 + 1;
        if (r2 != r6) goto L8;
        r3 = r3 + 1;
        r2 = 0;
    L10:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 <= r6) goto L10;
        r3 = r3 + 1;
        r2 = 1;
        goto L10
    L12:
        if ((r2 + 1) > r6) goto L14;
        return r3;
    L14:
        return r3 + 1;
    }

    /* JADX INFO: renamed from: l */
    public static C0304H2 m1270l(ImageDecoder.Source r1, int r2, int r3, C2644vt r4) {
        Drawable r12 = ImageDecoder.decodeDrawable(r1, new C1454gd(r2, r3, r4));
        if ((r12 instanceof AnimatedImageDrawable) == false) goto L7;
        return new C0304H2(0, (AnimatedImageDrawable) r12);
    L7:
        throw new IOException("Received unexpected drawable type for animated image, failing: " + r12);
    }

    /* JADX INFO: renamed from: A */
    public void m1271A(AbstractComponentCallbacksC1503hi r4, boolean r5) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1271A(r4, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r5 == true) goto L10;
        r2.f8171a.onFragmentViewDestroyed(r0, r4);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: B */
    public Object m1272B(InterfaceC0938Vt r3) {
        HashMap r0 = (HashMap) this.f2090c;
        C1548ik r1 = (C1548ik) r0.get(r3);
        if (r1 != null) goto L5;
        r1 = new C1548ik(r3);
        r0.put(r3, r1);
    L6:
        C1548ik r32 = r1.f5501d;
        r32.f5500c = r1.f5500c;
        r1.f5500c.f5501d = r32;
        C1548ik r33 = (C1548ik) this.f2089b;
        r1.f5501d = r33;
        C1548ik r34 = r33.f5500c;
        r1.f5500c = r34;
        r34.f5501d = r1;
        r1.f5501d.f5500c = r1;
        ArrayList r35 = r1.f5499b;
        if (r35 == null) goto L9;
        int r36 = r35.size();
    L10:
        if (r36 > 0) goto L12;
        return null;
    L12:
        return r1.f5499b.remove(r36 - 1);
    L9:
        r36 = 0;
        goto L10
    L5:
        r3.mo1797a();
        goto L6
    }

    /* JADX INFO: renamed from: C */
    public KeyListener m1273C(KeyListener r2) {
        if ((r2 instanceof NumberKeyListener) == true) goto L15;
        ((C0649P3) ((C0132D2) this.f2090c).f328b).getClass();
        if ((r2 instanceof C2759yf) == false) goto L7;
        return r2;
    L7:
        if (r2 != null) goto L11;
        return null;
    L11:
        if ((r2 instanceof NumberKeyListener) == false) goto L14;
        return r2;
    L14:
        return new C2759yf(r2);
    L15:
        return r2;
    }

    /* JADX INFO: renamed from: D */
    public synchronized List m1274D(String r3) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (((ArrayList) this.f2089b).contains(r3) == true) goto L8;
        ((ArrayList) this.f2089b).add(r3);     // Catch: Throwable -> L6
    L8:
        List r0 = (List) ((HashMap) this.f2090c).get(r3);     // Catch: Throwable -> L6
        if (r0 != null) goto L11;
        r0 = new ArrayList();     // Catch: Throwable -> L6
        ((HashMap) this.f2090c).put(r3, r0);     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
        return r0;
    }

    /* JADX INFO: renamed from: E */
    public ComponentCallbacks2C1473gw m1275E(Context r5, ComponentCallbacks2C1273a r6, AbstractC0760Rn r7, AbstractC2805zi r8, boolean r9) {
        AbstractC2622vD.m5130a();
        AbstractC2622vD.m5130a();
        HashMap r0 = (HashMap) this.f2089b;
        ComponentCallbacks2C1473gw r1 = (ComponentCallbacks2C1473gw) r0.get(r7);
        if (r1 != null) goto L8;
        C0932Vn r12 = new C0932Vn(r7);
        C1517hw r2 = (C1517hw) this.f2090c;
        C0668Pg r3 = new C0668Pg(this, r8);
        r2.getClass();
        ComponentCallbacks2C1473gw r82 = new ComponentCallbacks2C1473gw(r6, r12, r3, r5);
        r0.put(r7, r82);
        r12.mo1508l(new C1229bo(this, r7));
        if (r9 == false) goto L7;
        r82.mo401k();
    L7:
        return r82;
    L8:
        return r1;
    }

    /* JADX INFO: renamed from: F */
    public synchronized ArrayList m1276F(Class r6, Class r7) {
        monitor-enter(this);
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L23
        Iterator r1 = ((ArrayList) this.f2089b).iterator();     // Catch: Throwable -> L23
    L4:
        if (r1.hasNext() == false) goto L25;
        String r2 = (String) r1.next();     // Catch: Throwable -> L23
        List r22 = (List) ((HashMap) this.f2090c).get(r2);     // Catch: Throwable -> L23
        if (r22 == null) goto L4;
        Iterator r23 = r22.iterator();     // Catch: Throwable -> L23
    L11:
        if (r23.hasNext() == false) goto L4;
        C2561tw r3 = (C2561tw) r23.next();     // Catch: Throwable -> L23
        if (r3.f8880a.isAssignableFrom(r6) == true) goto L15;
    L17:
        boolean r4 = false;
    L18:
        if (r4 == false) goto L11;
        if (r0.contains(r3.f8881b) == true) goto L11;
        r0.add(r3.f8881b);     // Catch: Throwable -> L23
        goto L11
    L15:
        if (r7.isAssignableFrom(r3.f8881b) == false) goto L17;
        r4 = true;
        goto L18
    L25:
        monitor-exit(this);
        return r0;
    L23:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: G */
    public String m1277G(InterfaceC0802Sm r9) {
        C0118Cp r0 = (C0118Cp) this.f2089b;
        monitor-enter(r0);
        String r1 = (String) ((C0118Cp) this.f2089b).m186a(r9);     // Catch: Throwable -> L31
        monitor-exit(r0);     // Catch: Throwable -> L31
        if (r1 != null) goto L23;
        C1070Yw r02 = (C1070Yw) ((C2656w4) this.f2090c).mo1935c();
        r9.mo172b(r02.f3381a);     // Catch: Throwable -> L20
        byte[] r12 = r02.f3381a.digest();     // Catch: Throwable -> L20
        char[] r2 = AbstractC2622vD.f9105b;     // Catch: Throwable -> L20
        monitor-enter(r2);     // Catch: Throwable -> L20
        int r3 = 0;
    L38:
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L12:
        if (r3 >= r12.length) goto L14;
        byte r4 = r12[r3];     // Catch: Throwable -> L17
        int r6 = r3 * 2;     // Catch: Throwable -> L17
        char[] r7 = AbstractC2622vD.f9104a;     // Catch: Throwable -> L17
        r2[r6] = r7[(r4 & 255) >>> 4];     // Catch: Throwable -> L17
        r2[r6 + 1] = r7[r4 & 15];     // Catch: Throwable -> L17
        r3 = r3 + 1;     // Catch: Throwable -> L17
        goto L38
    L14:
        r1 = new String(r2);     // Catch: Throwable -> L17
        monitor-exit(r2);     // Catch: Throwable -> L17
        ((C2656w4) this.f2090c).mo1934a(r02);
        goto L23
    L20:
        th = move-exception;
        ((C2656w4) this.f2090c).mo1934a(r02);
        throw th;
    L23:
        C0118Cp r22 = (C0118Cp) this.f2089b;
        monitor-enter(r22);
        ((C0118Cp) this.f2089b).m189d(r9, r1);     // Catch: Throwable -> L28
        monitor-exit(r22);     // Catch: Throwable -> L28
        return r1;
    L28:
        th = move-exception;
        throw th;
    L31:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: I */
    public void m1278I() {
        ((SparseIntArray) this.f2089b).clear();
    }

    /* JADX INFO: renamed from: J */
    public void mo1279J(AttributeSet r9, int r10) {
        switch(this.f2088a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        TypedArray r92 = ((EditText) this.f2089b).getContext().obtainStyledAttributes(r9, AbstractC0982Wu.f3074i, r10, 0);
        boolean r1 = true;
        if (r92.hasValue(14) == false) goto L11;
        r1 = r92.getBoolean(14, true);     // Catch: Throwable -> L9
    L11:
        r92.recycle();
        m1288S(r1);
        return;
    L9:
        th = move-exception;
        r92.recycle();
        throw th;
    L15:
        AbsSeekBar r0 = (AbsSeekBar) this.f2089b;
        C2656w4 r93 = C2656w4.m5186A(r0.getContext(), r9, f2087d, r10);
        Drawable r12 = r93.m5211r(0);
        if (r12 != null) goto L18;
    L25:
        Drawable r13 = r93.m5211r(1);
        if (r13 == null) goto L28;
        r0.setProgressDrawable(m1290U(r13, false));
    L28:
        r93.m5195E();
        return;
    L18:
        if ((r12 instanceof AnimationDrawable) == false) goto L24;
        AnimationDrawable r14 = (AnimationDrawable) r12;
        int r3 = r14.getNumberOfFrames();
        AnimationDrawable r4 = new AnimationDrawable();
        r4.setOneShot(r14.isOneShot());
        int r5 = 0;
    L21:
        if (r5 >= r3) goto L23;
        Drawable r7 = m1290U(r14.getFrame(r5), true);
        r7.setLevel(10000);
        r4.addFrame(r7, r14.getDuration(r5));
        r5 = r5 + 1;
        goto L21
    L23:
        r4.setLevel(10000);
        r12 = r4;
    L24:
        r0.setIndeterminateDrawable(r12);
        goto L25
    }

    /* JADX INFO: renamed from: K */
    public C2630vf m1280K(InputConnection r3, EditorInfo r4) {
        C0132D2 r0 = (C0132D2) this.f2090c;
        if (r3 != null) goto L5;
        r0.getClass();
        r3 = null;
    L10:
        return (C2630vf) r3;
    L5:
        C0649P3 r02 = (C0649P3) r0.f328b;
        r02.getClass();
        if ((r3 instanceof C2630vf) == true) goto L10;
        r3 = new C2630vf((EditText) r02.f2089b, r3, r4);
        goto L10
    }

    /* JADX INFO: renamed from: L */
    public void m1281L(C0797Sh r6) {
        ExecutorC1341dw r0 = (ExecutorC1341dw) this.f2090c;
        C1017Xm r1 = (C1017Xm) this.f2089b;
        int r2 = r6.f2499b;
        if (r2 != 0) goto L6;
        r0.execute(new RunnableC0044B0(r1, r6.f2498a, 1, false));
        return;
    L6:
        r0.execute(new RunnableC0308H6(r2, 0, r1));
    }

    /* JADX INFO: renamed from: M */
    public void m1282M(Context r10, XmlResourceParser r11) {
        C2411qb r0 = new C2411qb();
        int r1 = r11.getAttributeCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L96;
        String r4 = r11.getAttributeName(r3);
        String r5 = r11.getAttributeValue(r3);
        if (r4 == null) goto L95;
        if (r5 == null) goto L95;
        if ("id".equals(r4) == false) goto L95;
        if (r5.contains("/") == false) goto L13;
        int r12 = r10.getResources().getIdentifier(r5.substring(r5.indexOf(47) + 1), "id", r10.getPackageName());
    L14:
        if (r12 == (-1)) goto L16;
    L98:
        int r32 = r11.getEventType();     // Catch: Throwable -> L97
        C2188lb r6 = null;
    L19:
        if (r32 == 1) goto L93;
        if (r32 != 0) goto L22;
        r11.getName();     // Catch: Throwable -> L97 Throwable -> L97
    L91:
        r32 = r11.next();     // Catch: Throwable -> L97 Throwable -> L97
        goto L19
    L22:
        if (r32 != 2) goto L24;
        String r33 = r11.getName();     // Catch: Throwable -> L97
        switch(r33.hashCode()) {
            case -2025855158: goto L85;
            case -1984451626: goto L79;
            case -1962203927: goto L76;
            case -1269513683: goto L70;
            case -1238332596: goto L64;
            case -71750448: goto L61;
            case 366511058: goto L55;
            case 1331510167: goto L52;
            case 1791837707: goto L49;
            case 1803088381: goto L46;
            default: goto L91;
        };
    L46:
        if (r33.equals("Constraint") == false) goto L91;
        r6 = C2411qb.m4849d(r10, Xml.asAttributeSet(r11), false);     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L49:
        if (r33.equals("CustomAttribute") == false) goto L91;
    L56:
        if (r6 == null) goto L59;
        C1321db.m2570a(r10, r11, r6.f7637f);     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L59:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: Throwable -> L97 Throwable -> L97
    L52:
        if (r33.equals("Barrier") == false) goto L91;
        r6 = C2411qb.m4849d(r10, Xml.asAttributeSet(r11), false);     // Catch: Throwable -> L97 Throwable -> L97
        r6.f7635d.f7845h0 = 1;     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L55:
        if (r33.equals("CustomMethod") == false) goto L91;
    L61:
        if (r33.equals("Guideline") == false) goto L91;
        r6 = C2411qb.m4849d(r10, Xml.asAttributeSet(r11), false);     // Catch: Throwable -> L97 Throwable -> L97
        r6.f7635d.f7830a = true;     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L64:
        if (r33.equals("Transform") == false) goto L91;
        if (r6 == null) goto L68;
        r6.f7636e.m4796a(r10, Xml.asAttributeSet(r11));     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L68:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: Throwable -> L97 Throwable -> L97
    L70:
        if (r33.equals("PropertySet") == false) goto L91;
        if (r6 == null) goto L74;
        r6.f7633b.m4726a(r10, Xml.asAttributeSet(r11));     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L74:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: Throwable -> L97 Throwable -> L97
    L76:
        if (r33.equals("ConstraintOverride") == false) goto L91;
        r6 = C2411qb.m4849d(r10, Xml.asAttributeSet(r11), true);     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L79:
        if (r33.equals("Motion") == false) goto L91;
        if (r6 == null) goto L83;
        r6.f7634c.m4603a(r10, Xml.asAttributeSet(r11));     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L83:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: Throwable -> L97 Throwable -> L97
    L85:
        if (r33.equals("Layout") == false) goto L91;
        if (r6 == null) goto L89;
        r6.f7635d.m4538a(r10, Xml.asAttributeSet(r11));     // Catch: Throwable -> L97 Throwable -> L97
        goto L91
    L89:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: Throwable -> L97 Throwable -> L97
    L24:
        if (r32 != 3) goto L91;
        String r34 = r11.getName().toLowerCase(Locale.ROOT);     // Catch: Throwable -> L97
        switch(r34.hashCode()) {
            case -2075718416: goto L39;
            case -190376483: goto L36;
            case 426575017: goto L33;
            case 2146106725: goto L30;
            default: goto L91;
        };     // Catch: Throwable -> L97
    L30:
        if (r34.equals("constraintset") == false) goto L91;
    L33:
        if (r34.equals("constraintoverride") == false) goto L91;
    L40:
        r0.f8456c.put(Integer.valueOf(r6.f7632a), r6);     // Catch: Throwable -> L97
        r6 = null;
        goto L91
    L36:
        if (r34.equals("constraint") == false) goto L91;
    L39:
        if (r34.equals("guideline") == false) goto L91;
    L93:
        ((SparseArray) this.f2090c).put(r12, r0);
        return;
    L16:
        if (r5.length() <= 1) goto L98;
        r12 = Integer.parseInt(r5.substring(1));
        goto L98
    L13:
        r12 = -1;
    L95:
        r3 = r3 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: N */
    public void m1283N(InterfaceC0938Vt r5, Object r6) {
        HashMap r0 = (HashMap) this.f2090c;
        C1548ik r1 = (C1548ik) r0.get(r5);
        if (r1 != null) goto L5;
        r1 = new C1548ik(r5);
        r1.f5501d = r1;
        C1548ik r2 = (C1548ik) this.f2089b;
        r1.f5501d = r2.f5501d;
        r1.f5500c = r2;
        r2.f5501d = r1;
        r1.f5501d.f5500c = r1;
        r0.put(r5, r1);
    L7:
        if (r1.f5499b != null) goto L9;
        r1.f5499b = new ArrayList();
    L9:
        r1.f5499b.add(r6);
        return;
    L5:
        r5.mo1797a();
        goto L7
    }

    /* JADX INFO: renamed from: O */
    public void m1284O(C2207lu r5) {
        HashMap r0 = (HashMap) this.f2089b;
        C2387pu r1 = new C2387pu(r5.f7693a, C2352p9.class);
        if (r0.containsKey(r1) == false) goto L11;
        C2207lu r02 = (C2207lu) r0.get(r1);
        if (r02.equals(r5) == false) goto L10;
        if (r5.equals(r02) == false) goto L10;
        return;
    L10:
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + r1);
    L11:
        r0.put(r1, r5);
    }

    /* JADX INFO: renamed from: P */
    public void m1285P(InterfaceC2602uu r4) {
        HashMap r0 = (HashMap) this.f2090c;
        if (r4 == null) goto L16;
        Class r1 = r4.mo30c();
        if (r0.containsKey(r1) == false) goto L13;
        InterfaceC2602uu r02 = (InterfaceC2602uu) r0.get(r1);
        if (r02.equals(r4) == false) goto L12;
        if (r4.equals(r02) == false) goto L12;
        return;
    L12:
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + r1);
    L13:
        r0.put(r1, r4);
        return;
    L16:
        throw new NullPointerException("wrapper must be non-null");
    }

    /* JADX INFO: renamed from: Q */
    public void m1286Q(String r6) {
        monitor-enter(this);
        C0965Wd r2 = (C0965Wd) ((HashMap) this.f2089b).get(r6);     // Catch: Throwable -> L23
        AbstractC0714Qj.m1488j("Argument must not be null", r2);     // Catch: Throwable -> L23
        int r3 = r2.f3007b;     // Catch: Throwable -> L23
        if (r3 < 1) goto L29;
        int r32 = r3 - 1;     // Catch: Throwable -> L23
        r2.f3007b = r32;     // Catch: Throwable -> L23
        if (r32 != 0) goto L25;
        C0965Wd r1 = (C0965Wd) ((HashMap) this.f2089b).remove(r6);     // Catch: Throwable -> L23
        if (r1.equals(r2) == false) goto L22;
        C2263n6 r62 = (C2263n6) this.f2090c;     // Catch: Throwable -> L23
        ArrayDeque r0 = r62.f7981a;     // Catch: Throwable -> L23
        monitor-enter(r0);     // Catch: Throwable -> L23
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L13:
        if (r62.f7981a.size() >= 10) goto L17;
        r62.f7981a.offer(r1);     // Catch: Throwable -> L15
    L17:
        monitor-exit(r0);     // Catch: Throwable -> L15
    L22:
        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + r2 + ", but actually removed: " + r1 + ", safeKey: " + r6);     // Catch: Throwable -> L23
    L25:
        monitor-exit(this);     // Catch: Throwable -> L23
        r2.f3006a.unlock();
        return;
    L29:
        throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + r6 + ", interestedThreads: " + r2.f3007b);     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: R */
    public Object m1287R() {
        C1548ik r0 = (C1548ik) this.f2089b;
        C1548ik r1 = r0.f5501d;
    L3:
        boolean r2 = r1.equals(r0);
        Object r3 = r1.f5498a;
        Object r4 = null;
        if (r2 == true) goto L14;
        ArrayList r22 = r1.f5499b;
        if (r22 == null) goto L8;
        int r23 = r22.size();
    L9:
        if (r23 <= 0) goto L11;
        r4 = r1.f5499b.remove(r23 - 1);
    L11:
        if (r4 != null) goto L12;
        C1548ik r24 = r1.f5501d;
        r24.f5500c = r1.f5500c;
        r1.f5500c.f5501d = r24;
        ((HashMap) this.f2090c).remove(r3);
        ((InterfaceC0938Vt) r3).mo1797a();
        r1 = r1.f5501d;
        goto L3
    L12:
        return r4;
    L8:
        r23 = 0;
        goto L9
    L14:
        return null;
    }

    /* JADX INFO: renamed from: S */
    public void m1288S(boolean r6) {
        C0194Ef r0 = (C0194Ef) ((C0649P3) ((C0132D2) this.f2090c).f328b).f2090c;
        if (r0.f595c != r6) goto L5;
        return;
    L5:
        if (r0.f594b == null) goto L12;
        C2372pf r1 = C2372pf.m4798a();
        C0151Df r2 = r0.f594b;
        r1.getClass();
        AbstractC1293cr.m2548g("initCallback cannot be null", r2);
        ReentrantReadWriteLock r3 = r1.f8343a;
        r3.writeLock().lock();
        r1.f8344b.remove(r2);     // Catch: Throwable -> L9
        r3.writeLock().unlock();
    L9:
        th = move-exception;
        r3.writeLock().unlock();
        throw th;
    L12:
        r0.f595c = r6;
        if (r6 == false) goto L19;
        C0194Ef.m387a(r0.f593a, C2372pf.m4798a().m4799b());
        return;
    }

    /* JADX INFO: renamed from: T */
    public void m1289T(int r4, int r5, int r6, int r7) {
        C0780S6 r0 = (C0780S6) this.f2090c;
        r0.f2465d.set(r4, r5, r6, r7);
        Rect r1 = r0.f2464c;
        C0780S6.m1602a(r0, r4 + r1.left, r5 + r1.top, r6 + r1.right, r7 + r1.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public Drawable m1290U(Drawable r8, boolean r9) {
        if ((r8 instanceof InterfaceC0704QF) == false) goto L6;
        ((AbstractC0746RF) ((InterfaceC0704QF) r8)).getClass();
    L31:
        return r8;
    L6:
        if ((r8 instanceof LayerDrawable) == false) goto L22;
        LayerDrawable r82 = (LayerDrawable) r8;
        int r92 = r82.getNumberOfLayers();
        Drawable[] r0 = new Drawable[r92];
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r3 >= r92) goto L17;
        int r4 = r82.getId(r3);
        Drawable r5 = r82.getDrawable(r3);
        if (r4 != 16908301) goto L12;
    L15:
        boolean r42 = true;
    L16:
        r0[r3] = m1290U(r5, r42);
        r3 = r3 + 1;
        goto L8
    L12:
        if (r4 == 16908303) goto L15;
        r42 = false;
        goto L16
    L17:
        LayerDrawable r1 = new LayerDrawable(r0);
    L18:
        if (r2 >= r92) goto L20;
        r1.setId(r2, r82.getId(r2));
        r1.setLayerGravity(r2, r82.getLayerGravity(r2));
        r1.setLayerWidth(r2, r82.getLayerWidth(r2));
        r1.setLayerHeight(r2, r82.getLayerHeight(r2));
        r1.setLayerInsetLeft(r2, r82.getLayerInsetLeft(r2));
        r1.setLayerInsetRight(r2, r82.getLayerInsetRight(r2));
        r1.setLayerInsetTop(r2, r82.getLayerInsetTop(r2));
        r1.setLayerInsetBottom(r2, r82.getLayerInsetBottom(r2));
        r1.setLayerInsetStart(r2, r82.getLayerInsetStart(r2));
        r1.setLayerInsetEnd(r2, r82.getLayerInsetEnd(r2));
        r2 = r2 + 1;
        goto L18
    L20:
        return r1;
    L22:
        if ((r8 instanceof BitmapDrawable) == false) goto L31;
        BitmapDrawable r83 = (BitmapDrawable) r8;
        Bitmap r02 = r83.getBitmap();
        if (((Bitmap) this.f2090c) != null) goto L26;
        this.f2090c = r02;
    L26:
        ShapeDrawable r22 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
        r22.getPaint().setShader(new BitmapShader(r02, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        r22.getPaint().setColorFilter(r83.getPaint().getColorFilter());
        if (r9 == true) goto L29;
        return r22;
    L29:
        return new ClipDrawable(r22, 3, 1);
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: a */
    public Object mo1291a() {
        return (C1316dD) this.f2089b;
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: b */
    public boolean mo642b(AbstractC0345I0 r2, Menu r3) {
        return ((InterfaceC0302H0) this.f2089b).mo642b(r2, r3);
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object r4, File r5, C2644vt r6) {
        C0436K5 r0 = (C0436K5) this.f2090c;
        Bitmap r42 = ((BitmapDrawable) ((InterfaceC2389pw) r4).get()).getBitmap();
        return r0.mo892c(new C0608O5((InterfaceC0565N5) this.f2089b, r42), r5, r6);
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: d */
    public boolean mo643d(AbstractC0345I0 r2, MenuItem r3) {
        return ((InterfaceC0302H0) this.f2089b).mo643d(r2, r3);
    }

    @Override // p000.InterfaceC2218m4
    /* JADX INFO: renamed from: e */
    public void mo1292e(int r2) {
        C2304o4.m4682e((C2304o4) this.f2090c, r2);
    }

    @Override // p000.InterfaceC2647vw
    /* JADX INFO: renamed from: f */
    public int mo893f(C2644vt r1) {
        return 2;
    }

    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: g */
    public boolean mo644g(AbstractC0345I0 r3, Menu r4) {
        ViewGroup r0 = ((LayoutInflaterFactory2C0176E3) this.f2090c).f460A;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r0);
        return ((InterfaceC0302H0) this.f2089b).mo644g(r3, r4);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g3, java.lang.Object] */
    @Override // p000.InterfaceC0302H0
    /* JADX INFO: renamed from: h */
    public void mo645h(AbstractC0345I0 r4) {
        ((InterfaceC0302H0) this.f2089b).mo645h(r4);
        LayoutInflaterFactory2C0176E3 r42 = (LayoutInflaterFactory2C0176E3) this.f2090c;
        if (r42.f506w == null) goto L6;
        r42.f495l.getDecorView().removeCallbacks(r42.f507x);
    L6:
        if (r42.f505v == null) goto L11;
        C0273GE r0 = r42.f508y;
        if (r0 == null) goto L10;
        r0.m554b();
    L10:
        C0273GE r02 = AbstractC2185lE.m4388a(r42.f505v);
        r02.m553a(0.0f);
        r42.f508y = r02;
        r02.m556d(new C2526t3(2, this));
    L11:
        r42.f497n.onSupportActionModeFinished(r42.f504u);
        r42.f504u = null;
        ViewGroup r03 = r42.f460A;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r03);
        r42.m340I();
    }

    @Override // p000.InterfaceC2802zf
    /* JADX INFO: renamed from: i */
    public boolean mo1293i(CharSequence r4, int r5, int r6, C1043YB r7) {
        if ((r7.f3334c & 4) <= 0) goto L6;
        return true;
    L6:
        if (((C1316dD) this.f2089b) == null) goto L8;
    L12:
        ((C2220m6) this.f2090c).getClass();
        C1086ZB r42 = new C1086ZB(r7);
        ((C1316dD) this.f2089b).setSpan(r42, r5, r6, 33);
        return true;
    L8:
        if ((r4 instanceof Spannable) == false) goto L10;
        Spannable r43 = (Spannable) r4;
    L11:
        this.f2089b = new C1316dD(r43);
        goto L12
    L10:
        r43 = new SpannableString(r4);
        goto L11
    }

    @Override // p000.InterfaceC2218m4
    /* JADX INFO: renamed from: j */
    public void mo1294j(int r2) {
        C2304o4.m4681d((C2304o4) this.f2090c, r2);
    }

    @Override // p000.InterfaceC2218m4
    /* JADX INFO: renamed from: k */
    public void mo1295k(int r1, float r2) {
    }

    /* JADX INFO: renamed from: m */
    public void m1296m(AbstractComponentCallbacksC1503hi r4, Bundle r5, boolean r6) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1296m(r4, r5, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r6 == true) goto L10;
        r2.f8171a.onFragmentActivityCreated(r0, r4, r5);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: n */
    public void m1297n(AbstractComponentCallbacksC1503hi r5, boolean r6) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractActivityC1244c3 r1 = r0.f9512u.f7401m;
        AbstractComponentCallbacksC1503hi r2 = r0.f9514w;
        if (r2 == null) goto L5;
        r2.m2872f().f9504m.m1297n(r5, true);
    L5:
        Iterator r22 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r22.hasNext() == false) goto L12;
        C2324oi r3 = (C2324oi) r22.next();
        if (r6 == true) goto L10;
        r3.f8171a.onFragmentAttached(r0, r5, r1);
        goto L7
    L10:
        r3.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: o */
    public void m1298o(AbstractComponentCallbacksC1503hi r4, Bundle r5, boolean r6) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1298o(r4, r5, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r6 == true) goto L10;
        r2.f8171a.onFragmentCreated(r0, r4, r5);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: p */
    public void m1299p(AbstractComponentCallbacksC1503hi r4, boolean r5) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1299p(r4, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r5 == true) goto L10;
        r2.f8171a.onFragmentDestroyed(r0, r4);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: q */
    public void m1300q(AbstractComponentCallbacksC1503hi r4, boolean r5) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1300q(r4, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r5 == true) goto L10;
        r2.f8171a.onFragmentDetached(r0, r4);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText r6) {
        switch(this.f2088a) {
            case 11: goto L8;
            default: goto L4;
        };
    L4:
        String r62 = String.valueOf(r6.getText());
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e((String) ((C2648vx) this.f2089b).f9162a, r62);
        View r02 = (View) this.f2090c;
        if ((r02 instanceof C2748yA) == false) goto L20;
        ((C2748yA) r02).setValue(r62);
        return;
    L20:
        return;
    L8:
        Activity r03 = (Activity) this.f2089b;
        Editable r63 = r6.getText();
        if (r63 == null) goto L14;
        String r64 = r63.toString();
        if (r64 == null) goto L14;
        String r65 = AbstractC2564tz.m5070e0(r64).toString();
        if (r65 == null) goto L14;
    L16:
        if (r65.length() <= 0) goto L18;
        C1498hd r1 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C1451ga(r65, r03, (C1495ha) this.f2090c, null), 3);
        return;
    L18:
        Toast.makeText(r03, AbstractC0295Gu.m625r(-88785563940917L), 0).show();
        return;
    L14:
        r65 = AbstractC0295Gu.m625r(-88781268973621L);
        goto L16
    }

    /* JADX INFO: renamed from: s */
    public void m1301s(AbstractComponentCallbacksC1503hi r4, boolean r5) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1301s(r4, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r5 == true) goto L10;
        r2.f8171a.onFragmentPaused(r0, r4);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: t */
    public void m1302t(AbstractComponentCallbacksC1503hi r5, boolean r6) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractActivityC1244c3 r1 = r0.f9512u.f7401m;
        AbstractComponentCallbacksC1503hi r2 = r0.f9514w;
        if (r2 == null) goto L5;
        r2.m2872f().f9504m.m1302t(r5, true);
    L5:
        Iterator r22 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r22.hasNext() == false) goto L12;
        C2324oi r3 = (C2324oi) r22.next();
        if (r6 == true) goto L10;
        r3.f8171a.onFragmentPreAttached(r0, r5, r1);
        goto L7
    L10:
        r3.getClass();
        goto L7
    }

    public String toString() {
        switch(this.f2088a) {
            case 21: goto L14;
            case 27: goto L6;
            default: goto L5;
        };
    L6:
        String r1 = "[ ";
        if (((C0256Fy) this.f2089b) == null) goto L13;
        int r0 = 0;
    L10:
        if (r0 >= 9) goto L13;
        r1 = r1 + ((C0256Fy) this.f2089b).f836h[r0] + " ";
        r0 = r0 + 1;
    L13:
        return r1 + "] " + ((C0256Fy) this.f2089b);
    L14:
        StringBuilder r02 = new StringBuilder("GroupedLinkedMap( ");
        C1548ik r12 = (C1548ik) this.f2089b;
        C1548ik r2 = r12.f5500c;
        boolean r4 = false;
    L16:
        if (r2.equals(r12) == true) goto L22;
        r02.append('{');
        r02.append(r2.f5498a);
        r02.append(':');
        ArrayList r42 = r2.f5499b;
        if (r42 == null) goto L20;
        int r43 = r42.size();
    L21:
        r02.append(r43);
        r02.append("}, ");
        r2 = r2.f5500c;
        r4 = true;
        goto L16
    L20:
        r43 = 0;
        goto L21
    L22:
        if (r4 == false) goto L24;
        r02.delete(r02.length() - 2, r02.length());
    L24:
        r02.append(" )");
        return r02.toString();
    L5:
        return super.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m1303u(AbstractComponentCallbacksC1503hi r4, Bundle r5, boolean r6) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1303u(r4, r5, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r6 == true) goto L10;
        r2.f8171a.onFragmentPreCreated(r0, r4, r5);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: v */
    public void m1304v(AbstractComponentCallbacksC1503hi r4, boolean r5) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1304v(r4, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r5 == true) goto L10;
        r2.f8171a.onFragmentResumed(r0, r4);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: w */
    public void m1305w(AbstractComponentCallbacksC1503hi r4, Bundle r5, boolean r6) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1305w(r4, r5, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r6 == true) goto L10;
        r2.f8171a.onFragmentSaveInstanceState(r0, r4, r5);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: x */
    public void m1306x(AbstractComponentCallbacksC1503hi r4, boolean r5) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1306x(r4, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r5 == true) goto L10;
        r2.f8171a.onFragmentStarted(r0, r4);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: y */
    public void m1307y(AbstractComponentCallbacksC1503hi r4, boolean r5) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1307y(r4, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r5 == true) goto L10;
        r2.f8171a.onFragmentStopped(r0, r4);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    /* JADX INFO: renamed from: z */
    public void m1308z(AbstractComponentCallbacksC1503hi r4, View r5, Bundle r6, boolean r7) {
        AbstractC2805zi r0 = (AbstractC2805zi) this.f2090c;
        AbstractComponentCallbacksC1503hi r1 = r0.f9514w;
        if (r1 == null) goto L5;
        r1.m2872f().f9504m.m1308z(r4, r5, r6, true);
    L5:
        Iterator r12 = ((CopyOnWriteArrayList) this.f2089b).iterator();
    L7:
        if (r12.hasNext() == false) goto L12;
        C2324oi r2 = (C2324oi) r12.next();
        if (r7 == true) goto L10;
        r2.f8171a.onFragmentViewCreated(r0, r4, r5, r6);
        goto L7
    L10:
        r2.getClass();
        goto L7
    }

    public /* synthetic */ C0649P3(int r1, Object r2, Object r3) {
        this.f2088a = r1;
        this.f2089b = r2;
        this.f2090c = r3;
    }

    public C0649P3(C1517hw r2) {
        this.f2088a = 23;
        this.f2089b = new HashMap();
        this.f2090c = r2;
    }

    public C0649P3(C2656w4 r4) {
        this.f2088a = 24;
        C0668Pg r1 = C2428qs.f8518e;
        C2428qs r0 = new C2428qs();
        r0.f8520a = new ArrayList();
        r0.f8522c = new HashSet();
        r0.f8523d = r4;
        r0.f8521b = r1;
        this.f2090c = new C2756yc(3);
        this.f2089b = r0;
    }

    public C0649P3(C2430qu r3) {
        this.f2088a = 26;
        this.f2089b = new HashMap(r3.f8524a);
        this.f2090c = new HashMap(r3.f8525b);
    }

    public C0649P3(AbsSeekBar r2) {
        this.f2088a = 0;
        this.f2089b = r2;
    }

    public C0649P3(EditText r5, int r6) {
        this.f2088a = r6;
        switch(r6) {
            case 14: goto L6;
            default: goto L4;
        };
    L4:
        this.f2089b = r5;
        this.f2090c = new C0132D2(r5);
        return;
    L6:
        this.f2089b = r5;
        C0194Ef r62 = new C0194Ef(r5);
        this.f2090c = r62;
        r5.addTextChangedListener(r62);
        if (C2544tf.f8859b != null) goto L21;
        Object r63 = C2544tf.f8858a;
        monitor-enter(r63);
    L15:
        th = move-exception;
        throw th;
    L11:
        if (C2544tf.f8859b != null) goto L17;
        C2544tf r0 = new C2544tf();     // Catch: Throwable -> L15
        C2544tf.f8860c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2544tf.class.getClassLoader());     // Catch: Throwable -> L23
    L14:
        C2544tf.f8859b = r0;     // Catch: Throwable -> L15
    L17:
        monitor-exit(r63);     // Catch: Throwable -> L15
    L21:
        r5.setEditableFactory(C2544tf.f8859b);
    }

    public C0649P3(AbstractC2805zi r2) {
        this.f2088a = 17;
        this.f2089b = new CopyOnWriteArrayList();
        this.f2090c = r2;
    }

    public C0649P3(Context r5) {
        this.f2088a = 8;
        TypedArray r0 = r5.obtainStyledAttributes(AbstractC1293cr.m2539R(r5, io.github.cherrywechat.R.attr.materialCalendarStyle, C0549Mq.class.getCanonicalName()).data, AbstractC0939Vu.f2944m);
        C2220m6.m4463e(r5, r0.getResourceId(4, 0));
        C2220m6.m4463e(r5, r0.getResourceId(2, 0));
        C2220m6.m4463e(r5, r0.getResourceId(3, 0));
        C2220m6.m4463e(r5, r0.getResourceId(5, 0));
        ColorStateList r1 = AbstractC0828TB.m1643j(r5, r0, 7);
        this.f2089b = C2220m6.m4463e(r5, r0.getResourceId(9, 0));
        C2220m6.m4463e(r5, r0.getResourceId(8, 0));
        this.f2090c = C2220m6.m4463e(r5, r0.getResourceId(10, 0));
        new Paint().setColor(r1.getDefaultColor());
        r0.recycle();
    }

    public C0649P3(Animation r2) {
        this.f2088a = 16;
        this.f2089b = r2;
        this.f2090c = null;
    }

    public C0649P3(Animator r2) {
        this.f2088a = 16;
        this.f2089b = null;
        this.f2090c = r2;
    }

    public C0649P3(ArrayList r5, ArrayList r6) {
        this.f2088a = 19;
        int r0 = r5.size();
        this.f2089b = new int[r0];
        this.f2090c = new float[r0];
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((int[]) this.f2089b)[r1] = ((Integer) r5.get(r1)).intValue();
        ((float[]) this.f2090c)[r1] = ((Float) r6.get(r1)).floatValue();
        r1 = r1 + 1;
        goto L3
    }

    public C0649P3(int r2, int r3) {
        this.f2088a = 19;
        this.f2089b = new int[]{r2, r3};
        this.f2090c = new float[]{0.0f, 1.0f};
    }

    public C0649P3(int r3) {
        this.f2088a = r3;
        switch(r3) {
            case 12: goto L21;
            case 13: goto L18;
            case 20: goto L16;
            case 21: goto L14;
            case 25: goto L12;
            case 26: goto L10;
            case 28: goto L8;
            case 29: goto L6;
            default: goto L4;
        };
    L4:
        this.f2089b = Choreographer.getInstance();
        this.f2090c = Looper.myLooper();
        return;
    L6:
        this.f2089b = new C0118Cp(1000);
        this.f2090c = AbstractC0714Qj.m1478I(10, new C1517hw(1));
        return;
    L8:
        this.f2089b = new ArrayList();
        this.f2090c = new HashMap();
        return;
    L10:
        this.f2089b = new HashMap();
        this.f2090c = new HashMap();
        return;
    L12:
        this.f2089b = new AtomicReference();
        this.f2090c = new C0521M4(0);
        return;
    L14:
        this.f2089b = new C1548ik(null);
        this.f2090c = new HashMap();
        return;
    L16:
        this.f2089b = new SparseIntArray();
        this.f2090c = new SparseIntArray();
        return;
    L18:
        this.f2089b = new HashMap();
        this.f2090c = new C2263n6(1);
        return;
    }

    public C0649P3(int r2, int r3, int r4) {
        this.f2088a = 19;
        this.f2089b = new int[]{r2, r3, r4};
        this.f2090c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0649P3(C2304o4 r2) {
        this.f2088a = 6;
        this.f2090c = r2;
        this.f2088a = 6;
        this.f2089b = r2;
    }

    public C0649P3(LayoutInflaterFactory2C0176E3 r2, InterfaceC0302H0 r3) {
        this.f2088a = 4;
        this.f2090c = r2;
        this.f2089b = r3;
    }
}
