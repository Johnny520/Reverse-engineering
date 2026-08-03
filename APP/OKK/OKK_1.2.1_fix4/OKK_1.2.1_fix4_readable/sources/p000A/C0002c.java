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
import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.EnumC0536m;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;
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
import p031Q0.AbstractC0307g;
import p037U.AbstractC0355O;
import p037U.C0342B;
import p037U.C0363X;
import p037U.C0364Y;
import p037U.C0376l;
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

    public /* synthetic */ C0002c(int i2) {
        this.f6a = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m0a(int i2) {
        int[] iArr = (int[]) this.f7b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.f7b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f7b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f7b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: b */
    public View m1b(int i2, int i3, int i4, int i5) {
        C0342B c0342b = (C0342B) this.f7b;
        int iM764e = c0342b.m764e();
        int iM763d = c0342b.m763d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewM760a = c0342b.m760a(i2);
            int iM762c = c0342b.m762c(viewM760a);
            int iM761b = c0342b.m761b(viewM760a);
            C0363X c0363x = (C0363X) this.f8c;
            c0363x.f768b = iM764e;
            c0363x.f769c = iM763d;
            c0363x.f770d = iM762c;
            c0363x.f771e = iM761b;
            if (i4 != 0) {
                c0363x.f767a = i4;
                if (c0363x.m935a()) {
                    return viewM760a;
                }
            }
            if (i5 != 0) {
                c0363x.f767a = i5;
                if (c0363x.m935a()) {
                    view = viewM760a;
                }
            }
            i2 += i6;
        }
        return view;
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: c */
    public boolean mo2c(CharSequence charSequence, int i2, int i3, C0497v c0497v) {
        if ((c0497v.f1400c & 4) > 0) {
            return true;
        }
        if (((C0500y) this.f7b) == null) {
            this.f7b = new C0500y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C1121e) this.f8c).getClass();
        ((C0500y) this.f7b).setSpan(new C0498w(c0497v), i2, i3, 33);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public KeyListener m3d(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((C0002c) ((C0095d) this.f8c).f251b).getClass();
        if (keyListener instanceof C0254e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0254e(keyListener);
    }

    /* JADX INFO: renamed from: e */
    public boolean m4e(View view) {
        C0342B c0342b = (C0342B) this.f7b;
        int iM764e = c0342b.m764e();
        int iM763d = c0342b.m763d();
        int iM762c = c0342b.m762c(view);
        int iM761b = c0342b.m761b(view);
        C0363X c0363x = (C0363X) this.f8c;
        c0363x.f768b = iM764e;
        c0363x.f769c = iM763d;
        c0363x.f770d = iM762c;
        c0363x.f771e = iM761b;
        c0363x.f767a = 24579;
        return c0363x.m935a();
    }

    /* JADX INFO: renamed from: f */
    public void m5f(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f7b).getContext().obtainStyledAttributes(attributeSet, AbstractC0550a.f1622g, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m14o(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: g */
    public Object mo6g() {
        return (C0500y) this.f7b;
    }

    /* JADX INFO: renamed from: h */
    public C0251b m7h(InputConnection inputConnection, EditorInfo editorInfo) {
        C0095d c0095d = (C0095d) this.f8c;
        if (inputConnection == null) {
            c0095d.getClass();
            inputConnection = null;
        } else {
            C0002c c0002c = (C0002c) c0095d.f251b;
            c0002c.getClass();
            if (!(inputConnection instanceof C0251b)) {
                inputConnection = new C0251b((EditText) c0002c.f7b, inputConnection, editorInfo);
            }
        }
        return (C0251b) inputConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    @Override // p006D.InterfaceC0121q
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0122q0 mo8i(View view, C0122q0 c0122q0) {
        boolean z2;
        C0376l c0376l = (C0376l) this.f8c;
        int i2 = c0376l.f824a;
        C0057g c0057g = (C0057g) this.f7b;
        c0057g.getClass();
        C0118o0 c0118o0 = c0122q0.f309a;
        C1102c c1102cMo381f = c0118o0.mo381f(7);
        C1102c c1102cMo381f2 = c0118o0.mo381f(32);
        int i3 = c1102cMo381f.f4250b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0057g.f198b;
        bottomSheetBehavior.f2333w = i3;
        boolean zM2557e = AbstractC1077k.m2557e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.f2325o;
        if (z3) {
            int i4 = c0118o0.mo382j().f4252d;
            bottomSheetBehavior.f2332v = i4;
            paddingBottom = c0376l.f826c + i4;
        }
        int i5 = c0376l.f825b;
        boolean z4 = bottomSheetBehavior.f2326p;
        int i6 = c1102cMo381f.f4249a;
        if (z4) {
            paddingLeft = (zM2557e ? i5 : i2) + i6;
        }
        boolean z5 = bottomSheetBehavior.f2327q;
        int i7 = c1102cMo381f.f4251c;
        if (z5) {
            if (!zM2557e) {
                i2 = i5;
            }
            paddingRight = i2 + i7;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z6 = true;
        if (!bottomSheetBehavior.f2329s || marginLayoutParams.leftMargin == i6) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z2 = true;
        }
        if (bottomSheetBehavior.f2330t && marginLayoutParams.rightMargin != i7) {
            marginLayoutParams.rightMargin = i7;
            z2 = true;
        }
        if (bottomSheetBehavior.f2331u) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = c1102cMo381f.f4250b;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
            } else {
                z6 = z2;
            }
        }
        if (z6) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z7 = c0057g.f197a;
        if (z7) {
            bottomSheetBehavior.f2323m = c1102cMo381f2.f4252d;
        }
        if (z3 || z7) {
            bottomSheetBehavior.m1842I();
        }
        return c0122q0;
    }

    /* JADX INFO: renamed from: j */
    public void m9j(C0008i c0008i) {
        int i2 = c0008i.f23b;
        Handler handler = (Handler) this.f8c;
        C0095d c0095d = (C0095d) this.f7b;
        if (i2 == 0) {
            handler.post(new RunnableC0000a(c0095d, c0008i.f22a, 0));
        } else {
            handler.post(new RunnableC0001b(c0095d, i2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m10k(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C1043i c1043iM2526d;
        C1048n c1048n = new C1048n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i2))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c1043iM2526d = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (XmlPullParserException e3) {
                    e3.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        byte b2 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    b2 = name.equals("Layout") ? (byte) 5 : (byte) -1;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        b2 = 6;
                                        break;
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        break;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        b2 = 4;
                                        break;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        b2 = 1;
                                        break;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        b2 = 2;
                                        break;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        b2 = 7;
                                        break;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        b2 = 0;
                                        break;
                                    }
                                    break;
                                default:
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    c1043iM2526d = C1048n.m2526d(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 1:
                                    c1043iM2526d = C1048n.m2526d(context, Xml.asAttributeSet(xmlResourceParser));
                                    c1043iM2526d.f3958d.f3988a = true;
                                    break;
                                case 2:
                                    c1043iM2526d = C1048n.m2526d(context, Xml.asAttributeSet(xmlResourceParser));
                                    c1043iM2526d.f3958d.f3993c0 = 1;
                                    break;
                                case 3:
                                    if (c1043iM2526d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1043iM2526d.f3956b.m2523a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 4:
                                    if (c1043iM2526d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1043iM2526d.f3959e.m2524a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 5:
                                    if (c1043iM2526d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1043iM2526d.f3958d.m2521a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 6:
                                    if (c1043iM2526d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c1043iM2526d.f3957c.m2522a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case 7:
                                    if (c1043iM2526d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C1036b.m2511a(context, xmlResourceParser, c1043iM2526d.f3960f);
                                    break;
                                    break;
                            }
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name2 = xmlResourceParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                ((SparseArray) this.f8c).put(identifier, c1048n);
                                return;
                            } else if (name2.equalsIgnoreCase("Constraint")) {
                                c1048n.f4049c.put(Integer.valueOf(c1043iM2526d.f3955a), c1043iM2526d);
                                c1043iM2526d = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f8c).put(identifier, c1048n);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11l() {
        InterfaceC0397f interfaceC0397f = (InterfaceC0397f) this.f7b;
        C0543t c0543tMo1231d = interfaceC0397f.mo1231d();
        if (c0543tMo1231d.f1493c != EnumC0536m.f1483b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        c0543tMo1231d.m1254a(new Recreator(interfaceC0397f));
        final C0396e c0396e = (C0396e) this.f8c;
        c0396e.getClass();
        if (!(!c0396e.f885b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        c0543tMo1231d.m1254a(new InterfaceC0539p() { // from class: V.b
            @Override // androidx.lifecycle.InterfaceC0539p
            /* JADX INFO: renamed from: b */
            public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
                C0396e c0396e2 = c0396e;
                AbstractC0307g.m703e(c0396e2, "this$0");
                if (enumC0535l == EnumC0535l.ON_START) {
                    c0396e2.f888e = true;
                } else if (enumC0535l == EnumC0535l.ON_STOP) {
                    c0396e2.f888e = false;
                }
            }
        });
        c0396e.f885b = true;
    }

    /* JADX INFO: renamed from: m */
    public void m12m(AbstractC0355O abstractC0355O) {
        C0364Y c0364y = (C0364Y) ((C0966k) this.f7b).getOrDefault(abstractC0355O, null);
        if (c0364y == null) {
            return;
        }
        c0364y.f773a &= -2;
    }

    /* JADX INFO: renamed from: n */
    public void m13n(AbstractC0355O abstractC0355O) {
        C0960e c0960e = (C0960e) this.f8c;
        int iM2311f = c0960e.m2311f() - 1;
        while (true) {
            if (iM2311f < 0) {
                break;
            }
            if (abstractC0355O == c0960e.m2312g(iM2311f)) {
                Object[] objArr = c0960e.f3407c;
                Object obj = objArr[iM2311f];
                Object obj2 = C0960e.f3404e;
                if (obj != obj2) {
                    objArr[iM2311f] = obj2;
                    c0960e.f3405a = true;
                }
            } else {
                iM2311f--;
            }
        }
        C0364Y c0364y = (C0364Y) ((C0966k) this.f7b).remove(abstractC0355O);
        if (c0364y != null) {
            c0364y.f773a = 0;
            c0364y.getClass();
            c0364y.getClass();
            C0364Y.f772b.mo200c(c0364y);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m14o(boolean z2) {
        C0258i c0258i = (C0258i) ((C0002c) ((C0095d) this.f8c).f251b).f8c;
        if (c0258i.f546d != z2) {
            if (c0258i.f545c != null) {
                C0485j c0485jM1199a = C0485j.m1199a();
                C0257h c0257h = c0258i.f545c;
                c0485jM1199a.getClass();
                AbstractC0040p.m106i(c0257h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0485jM1199a.f1355a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0485jM1199a.f1356b.remove(c0257h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0258i.f546d = z2;
            if (z2) {
                C0258i.m687a(c0258i.f543a, C0485j.m1199a().m1200b());
            }
        }
    }

    public String toString() {
        switch (this.f6a) {
            case 1:
                return "Bounds{lower=" + ((C1102c) this.f7b) + " upper=" + ((C1102c) this.f8c) + "}";
            default:
                return super.toString();
        }
    }

    public C0002c(EditText editText, int i2) {
        this.f6a = i2;
        switch (i2) {
            case 8:
                this.f7b = editText;
                this.f8c = new C0095d(editText);
                return;
            default:
                this.f7b = editText;
                C0258i c0258i = new C0258i(editText);
                this.f8c = c0258i;
                editText.addTextChangedListener(c0258i);
                if (C0250a.f527b == null) {
                    synchronized (C0250a.f526a) {
                        try {
                            if (C0250a.f527b == null) {
                                C0250a c0250a = new C0250a();
                                try {
                                    C0250a.f528c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0250a.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C0250a.f527b = c0250a;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C0250a.f527b);
                return;
        }
    }

    public /* synthetic */ C0002c(Object obj, Object obj2, int i2) {
        this.f6a = i2;
        this.f7b = obj;
        this.f8c = obj2;
    }

    public C0002c(InterfaceC0397f interfaceC0397f) {
        this.f6a = 6;
        this.f7b = interfaceC0397f;
        this.f8c = new C0396e();
    }

    public C0002c() {
        this.f6a = 5;
        this.f7b = new C0966k();
        this.f8c = new C0960e();
    }

    public C0002c(C0342B c0342b) {
        this.f6a = 4;
        this.f7b = c0342b;
        C0363X c0363x = new C0363X();
        c0363x.f767a = 0;
        this.f8c = c0363x;
    }
}
