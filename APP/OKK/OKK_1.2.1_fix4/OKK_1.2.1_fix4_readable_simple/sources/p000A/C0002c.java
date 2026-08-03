package p000A;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.C0485j;
import androidx.emoji2.text.C0497v;
import androidx.emoji2.text.C0498w;
import androidx.emoji2.text.C0500y;
import androidx.emoji2.text.InterfaceC0490o;
import androidx.lifecycle.C0543t;
import androidx.lifecycle.EnumC0536m;
import androidx.savedstate.Recreator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.AbstractC0040p;
import p002B.C0057g;
import p006D.C0095d;
import p006D.C0118o0;
import p006D.C0122q0;
import p006D.InterfaceC0121q;
import p025N.C0250a;
import p025N.C0251b;
import p025N.C0254e;
import p025N.C0257h;
import p025N.C0258i;
import p037U.AbstractC0355O;
import p037U.C0342B;
import p037U.C0363X;
import p037U.C0364Y;
import p037U.C0376l;
import p039V.C0393b;
import p039V.C0396e;
import p039V.InterfaceC0397f;
import p048b.AbstractC0550a;
import p063j.C0960e;
import p063j.C0966k;
import p075p.C1036b;
import p075p.C1043i;
import p075p.C1048n;
import p081s0.AbstractC1077k;
import p085v.C1102c;
import p089x0.C1121e;

/* JADX INFO: renamed from: A.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0002c implements InterfaceC0490o, InterfaceC0121q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6a;

    /* JADX INFO: renamed from: b */
    public Object f7b;

    /* JADX INFO: renamed from: c */
    public Object f8c;

    public /* synthetic */ C0002c(int r1) {
        this.f6a = r1;
    }

    /* JADX INFO: renamed from: a */
    public void m0a(int r5) {
        int[] r02 = (int[]) this.f7b;
        if (r02 != null) goto L6;
        int[] r52 = new int[Math.max(r5, 10) + 1];
        this.f7b = r52;
        Arrays.fill(r52, -1);
        return;
    L6:
        if (r5 < r02.length) goto L14;
        int r2 = r02.length;
    L8:
        if (r2 > r5) goto L10;
        r2 = r2 * 2;
        goto L8
    L10:
        int[] r53 = new int[r2];
        this.f7b = r53;
        System.arraycopy(r02, 0, r53, 0, r02.length);
        int[] r54 = (int[]) this.f7b;
        Arrays.fill(r54, r02.length, r54.length, -1);
        return;
    }

    /* JADX INFO: renamed from: b */
    public View m1b(int r10, int r11, int r12, int r13) {
        C0342B r02 = (C0342B) this.f7b;
        int r1 = r02.m764e();
        int r2 = r02.m763d();
        if (r11 <= r10) goto L5;
        int r3 = 1;
    L6:
        View r4 = null;
    L7:
        if (r10 == r11) goto L18;
        View r5 = r02.m760a(r10);
        int r6 = r02.m762c(r5);
        int r7 = r02.m761b(r5);
        C0363X r8 = (C0363X) this.f8c;
        r8.f768b = r1;
        r8.f769c = r2;
        r8.f770d = r6;
        r8.f771e = r7;
        if (r12 == 0) goto L13;
        r8.f767a = r12;
        if (r8.m935a() == false) goto L13;
        return r5;
    L13:
        if (r13 == 0) goto L17;
        r8.f767a = r13;
        if (r8.m935a() == false) goto L17;
        r4 = r5;
    L17:
        r10 = r10 + r3;
        goto L7
    L18:
        return r4;
    L5:
        r3 = -1;
        goto L6
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: c */
    public boolean mo2c(CharSequence r4, int r5, int r6, C0497v r7) {
        if ((r7.f1400c & 4) <= 0) goto L6;
        return true;
    L6:
        if (((C0500y) this.f7b) == null) goto L8;
    L12:
        ((C1121e) this.f8c).getClass();
        C0498w r42 = new C0498w(r7);
        ((C0500y) this.f7b).setSpan(r42, r5, r6, 33);
        return true;
    L8:
        if ((r4 instanceof Spannable) == false) goto L10;
        Spannable r43 = (Spannable) r4;
    L11:
        this.f7b = new C0500y(r43);
        goto L12
    L10:
        r43 = new SpannableString(r4);
        goto L11
    }

    /* JADX INFO: renamed from: d */
    public KeyListener m3d(KeyListener r2) {
        if ((!(r2 instanceof NumberKeyListener)) == false) goto L14;
        ((C0002c) ((C0095d) this.f8c).f251b).getClass();
        if ((r2 instanceof C0254e) == true) goto L16;
        if (r2 != null) goto L10;
        return null;
    L10:
        if ((r2 instanceof NumberKeyListener) == false) goto L13;
        return r2;
    L13:
        return new C0254e(r2);
    L16:
        return r2;
    L14:
        return r2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m4e(View r5) {
        C0342B r02 = (C0342B) this.f7b;
        int r1 = r02.m764e();
        int r2 = r02.m763d();
        int r3 = r02.m762c(r5);
        int r52 = r02.m761b(r5);
        C0363X r03 = (C0363X) this.f8c;
        r03.f768b = r1;
        r03.f769c = r2;
        r03.f770d = r3;
        r03.f771e = r52;
        r03.f767a = 24579;
        return r03.m935a();
    }

    /* JADX INFO: renamed from: f */
    public void m5f(AttributeSet r4, int r5) {
        TypedArray r42 = ((EditText) this.f7b).getContext().obtainStyledAttributes(r4, AbstractC0550a.f1622g, r5, 0);
        boolean r1 = true;
        if (r42.hasValue(14) == false) goto L9;
        r1 = r42.getBoolean(14, true);     // Catch: Throwable -> L7
    L9:
        r42.recycle();
        m14o(r1);
        return;
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: g */
    public Object mo6g() {
        return (C0500y) this.f7b;
    }

    /* JADX INFO: renamed from: h */
    public C0251b m7h(InputConnection r3, EditorInfo r4) {
        C0095d r02 = (C0095d) this.f8c;
        if (r3 != null) goto L5;
        r02.getClass();
        r3 = null;
    L10:
        return (C0251b) r3;
    L5:
        C0002c r03 = (C0002c) r02.f251b;
        r03.getClass();
        if ((r3 instanceof C0251b) == true) goto L10;
        r3 = new C0251b((EditText) r03.f7b, r3, r4);
        goto L10
    }

    @Override // p006D.InterfaceC0121q
    /* JADX INFO: renamed from: i */
    public C0122q0 mo8i(View r17, C0122q0 r18) {
        C0376l r3 = (C0376l) this.f8c;
        int r4 = r3.f824a;
        C0057g r5 = (C0057g) this.f7b;
        r5.getClass();
        C0118o0 r6 = r18.f309a;
        C1102c r7 = r6.mo381f(7);
        C1102c r8 = r6.mo381f(32);
        int r9 = r7.f4250b;
        BottomSheetBehavior r10 = (BottomSheetBehavior) r5.f198b;
        r10.f2333w = r9;
        boolean r92 = AbstractC1077k.m2557e(r17);
        int r11 = r17.getPaddingBottom();
        int r12 = r17.getPaddingLeft();
        int r13 = r17.getPaddingRight();
        boolean r14 = r10.f2325o;
        if (r14 == false) goto L5;
        int r62 = r6.mo382j().f4252d;
        r10.f2332v = r62;
        r11 = r3.f826c + r62;
    L5:
        int r32 = r3.f825b;
        boolean r63 = r10.f2326p;
        int r15 = r7.f4249a;
        if (r63 == false) goto L11;
        if (r92 == false) goto L9;
        int r64 = r32;
    L10:
        r12 = r64 + r15;
        goto L11
    L9:
        r64 = r4;
    L11:
        boolean r65 = r10.f2327q;
        int r02 = r7.f4251c;
        if (r65 == false) goto L17;
        if (r92 == true) goto L16;
        r4 = r32;
    L16:
        r13 = r4 + r02;
    L17:
        ViewGroup.MarginLayoutParams r33 = (ViewGroup.MarginLayoutParams) r17.getLayoutParams();
        boolean r66 = true;
        if (r10.f2329s == true) goto L20;
    L22:
        boolean r42 = false;
    L24:
        if (r10.f2330t == false) goto L29;
        if (r33.rightMargin == r02) goto L29;
        r33.rightMargin = r02;
        r42 = true;
    L29:
        if (r10.f2331u == false) goto L33;
        int r03 = r33.topMargin;
        int r72 = r7.f4250b;
        if (r03 == r72) goto L33;
        r33.topMargin = r72;
    L34:
        if (r66 == false) goto L36;
        r17.setLayoutParams(r33);
    L36:
        r17.setPadding(r12, r17.getPaddingTop(), r13, r11);
        boolean r04 = r5.f197a;
        if (r04 == false) goto L39;
        r10.f2323m = r8.f4252d;
    L39:
        if (r14 == true) goto L41;
        if (r04 == true) goto L41;
    L42:
        return r18;
    L41:
        r10.m1842I();
    L33:
        r66 = r42;
        goto L34
    L20:
        if (r33.leftMargin == r15) goto L22;
        r33.leftMargin = r15;
        r42 = true;
        goto L24
    }

    /* JADX INFO: renamed from: j */
    public void m9j(C0008i r5) {
        int r02 = r5.f23b;
        Handler r1 = (Handler) this.f8c;
        C0095d r2 = (C0095d) this.f7b;
        if (r02 != 0) goto L5;
        r1.post(new RunnableC0000a(r2, r5.f22a, 0));
        return;
    L5:
        r1.post(new RunnableC0001b(r2, r02));
    }

    /* JADX INFO: renamed from: k */
    public void m10k(Context r13, XmlResourceParser r14) {
        C1048n r02 = new C1048n();
        int r1 = r14.getAttributeCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L117;
        if ("id".equals(r14.getAttributeName(r3)) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        String r12 = r14.getAttributeValue(r3);
        if (r12.contains("/") == false) goto L9;
        int r32 = r13.getResources().getIdentifier(r12.substring(r12.indexOf(47) + 1), "id", r13.getPackageName());
    L10:
        if (r32 == (-1)) goto L12;
    L94:
        int r15 = r14.getEventType();     // Catch: IOException -> L28 XmlPullParserException -> L30
        C1043i r7 = null;
    L16:
        if (r15 == 1) goto L91;
        if (r15 == 0) goto L86;
        byte r9 = 3;
        if (r15 == 2) goto L32;
        if (r15 != 3) goto L87;
        String r16 = r14.getName();     // Catch: IOException -> L28 XmlPullParserException -> L30
        if ("ConstraintSet".equals(r16) == true) goto L91;
        if (r16.equalsIgnoreCase("Constraint") == false) goto L87;
        r02.f4049c.put(Integer.valueOf(r7.f3955a), r7);     // Catch: IOException -> L28 XmlPullParserException -> L30
        r7 = null;
    L87:
        r15 = r14.next();     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L16
    L32:
        String r17 = r14.getName();     // Catch: IOException -> L28 XmlPullParserException -> L30
        switch(r17.hashCode()) {
            case -2025855158: goto L57;
            case -1984451626: goto L54;
            case -1269513683: goto L51;
            case -1238332596: goto L48;
            case -71750448: goto L45;
            case 1331510167: goto L42;
            case 1791837707: goto L39;
            case 1803088381: goto L36;
            default: goto L59;
        };     // Catch: IOException -> L28 XmlPullParserException -> L30
    L59:
        r9 = -1;
    L61:
        switch(r9) {
            case 0: goto L85;
            case 1: goto L84;
            case 2: goto L83;
            case 3: goto L79;
            case 4: goto L75;
            case 5: goto L71;
            case 6: goto L67;
            case 7: goto L63;
            default: goto L87;
        };
    L63:
        if (r7 == null) goto L66;
        C1036b.m2511a(r13, r14, r7.f3960f);     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L66:
        throw new RuntimeException("XML parser error must be within a Constraint " + r14.getLineNumber());     // Catch: IOException -> L28 XmlPullParserException -> L30
    L67:
        if (r7 == null) goto L70;
        r7.f3957c.m2522a(r13, Xml.asAttributeSet(r14));     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L70:
        throw new RuntimeException("XML parser error must be within a Constraint " + r14.getLineNumber());     // Catch: IOException -> L28 XmlPullParserException -> L30
    L71:
        if (r7 == null) goto L74;
        r7.f3958d.m2521a(r13, Xml.asAttributeSet(r14));     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L74:
        throw new RuntimeException("XML parser error must be within a Constraint " + r14.getLineNumber());     // Catch: IOException -> L28 XmlPullParserException -> L30
    L75:
        if (r7 == null) goto L78;
        r7.f3959e.m2524a(r13, Xml.asAttributeSet(r14));     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L78:
        throw new RuntimeException("XML parser error must be within a Constraint " + r14.getLineNumber());     // Catch: IOException -> L28 XmlPullParserException -> L30
    L79:
        if (r7 == null) goto L82;
        r7.f3956b.m2523a(r13, Xml.asAttributeSet(r14));     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L82:
        throw new RuntimeException("XML parser error must be within a Constraint " + r14.getLineNumber());     // Catch: IOException -> L28 XmlPullParserException -> L30
    L83:
        r7 = C1048n.m2526d(r13, Xml.asAttributeSet(r14));     // Catch: IOException -> L28 XmlPullParserException -> L30
        r7.f3958d.f3993c0 = 1;     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L84:
        r7 = C1048n.m2526d(r13, Xml.asAttributeSet(r14));     // Catch: IOException -> L28 XmlPullParserException -> L30
        r7.f3958d.f3988a = true;     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L85:
        r7 = C1048n.m2526d(r13, Xml.asAttributeSet(r14));     // Catch: IOException -> L28 XmlPullParserException -> L30
        goto L87
    L36:
        if (r17.equals("Constraint") == false) goto L59;
        r9 = 0;
        goto L61
    L39:
        if (r17.equals("CustomAttribute") == false) goto L59;
        r9 = 7;
        goto L61
    L42:
        if (r17.equals("Barrier") == false) goto L59;
        r9 = 2;
        goto L61
    L45:
        if (r17.equals("Guideline") == false) goto L59;
        r9 = 1;
        goto L61
    L48:
        if (r17.equals("Transform") == false) goto L59;
        r9 = 4;
        goto L61
    L51:
        if (r17.equals("PropertySet") == false) goto L59;
    L54:
        if (r17.equals("Motion") == false) goto L59;
        r9 = 6;
        goto L61
    L57:
        if (r17.equals("Layout") == false) goto L59;
        r9 = 5;
        goto L61
    L86:
        r14.getName();     // Catch: IOException -> L28 XmlPullParserException -> L30
    L91:
        ((SparseArray) this.f8c).put(r32, r02);
        return;
    L28:
        e = move-exception;
        e.printStackTrace();
    L30:
        e = move-exception;
        e.printStackTrace();
        goto L91
    L12:
        if (r12.length() <= 1) goto L94;
        r32 = Integer.parseInt(r12.substring(1));
        goto L94
    L9:
        r32 = -1;
        goto L10
    }

    /* JADX INFO: renamed from: l */
    public void m11l() {
        InterfaceC0397f r02 = (InterfaceC0397f) this.f7b;
        C0543t r1 = r02.mo1231d();
        if (r1.f1493c != EnumC0536m.f1483b) goto L11;
        r1.m1254a(new Recreator(r02));
        final C0396e r03 = (C0396e) this.f8c;
        r03.getClass();
        if ((!r03.f885b) == false) goto L9;
        r1.m1254a(new C0393b(r03));
        r03.f885b = true;
        return;
    L9:
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    L11:
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* JADX INFO: renamed from: m */
    public void m12m(AbstractC0355O r3) {
        C0364Y r32 = (C0364Y) ((C0966k) this.f7b).getOrDefault(r3, null);
        if (r32 != null) goto L5;
        return;
    L5:
        r32.f773a &= -2;
    }

    /* JADX INFO: renamed from: n */
    public void m13n(AbstractC0355O r7) {
        C0960e r02 = (C0960e) this.f8c;
        int r1 = r02.m2311f() - 1;
    L3:
        if (r1 < 0) goto L10;
        if (r7 == r02.m2312g(r1)) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        Object[] r3 = r02.f3407c;
        Object r4 = r3[r1];
        Object r5 = C0960e.f3404e;
        if (r4 == r5) goto L10;
        r3[r1] = r5;
        r02.f3405a = true;
    L10:
        C0364Y r72 = (C0364Y) ((C0966k) this.f7b).remove(r7);
        if (r72 == null) goto L16;
        r72.f773a = 0;
        r72.getClass();
        r72.getClass();
        C0364Y.f772b.mo200c(r72);
        return;
    }

    /* JADX INFO: renamed from: o */
    public void m14o(boolean r6) {
        C0258i r02 = (C0258i) ((C0002c) ((C0095d) this.f8c).f251b).f8c;
        if (r02.f546d != r6) goto L5;
        return;
    L5:
        if (r02.f545c == null) goto L12;
        C0485j r1 = C0485j.m1199a();
        C0257h r2 = r02.f545c;
        r1.getClass();
        AbstractC0040p.m106i(r2, "initCallback cannot be null");
        ReentrantReadWriteLock r3 = r1.f1355a;
        r3.writeLock().lock();
        r1.f1356b.remove(r2);     // Catch: Throwable -> L9
        r3.writeLock().unlock();
    L9:
        th = move-exception;
        r3.writeLock().unlock();
        throw th;
    L12:
        r02.f546d = r6;
        if (r6 == false) goto L19;
        int r62 = C0485j.m1199a().m1200b();
        C0258i.m687a(r02.f543a, r62);
        return;
    }

    public String toString() {
        switch(this.f6a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "Bounds{lower=" + ((C1102c) this.f7b) + " upper=" + ((C1102c) this.f8c) + "}";
    }

    public C0002c(EditText r5, int r6) {
        this.f6a = r6;
        switch(r6) {
            case 8: goto L21;
            default: goto L4;
        };
    L4:
        this.f7b = r5;
        C0258i r62 = new C0258i(r5);
        this.f8c = r62;
        r5.addTextChangedListener(r62);
        if (C0250a.f527b != null) goto L19;
        Object r63 = C0250a.f526a;
        monitor-enter(r63);
    L13:
        th = move-exception;
        throw th;
    L9:
        if (C0250a.f527b != null) goto L15;
        C0250a r1 = new C0250a();     // Catch: Throwable -> L13
        C0250a.f528c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0250a.class.getClassLoader());     // Catch: Throwable -> L23
    L12:
        C0250a.f527b = r1;     // Catch: Throwable -> L13
    L15:
        monitor-exit(r63);     // Catch: Throwable -> L13
    L19:
        r5.setEditableFactory(C0250a.f527b);
        return;
    L21:
        this.f7b = r5;
        this.f8c = new C0095d(r5);
    }

    public /* synthetic */ C0002c(Object r1, Object r2, int r3) {
        this.f6a = r3;
        this.f7b = r1;
        this.f8c = r2;
    }

    public C0002c(InterfaceC0397f r2) {
        this.f6a = 6;
        this.f7b = r2;
        this.f8c = new C0396e();
    }

    public C0002c() {
        this.f6a = 5;
        this.f7b = new C0966k();
        this.f8c = new C0960e();
    }

    public C0002c(C0342B r2) {
        this.f6a = 4;
        this.f7b = r2;
        C0363X r22 = new C0363X();
        r22.f767a = 0;
        this.f8c = r22;
    }
}
