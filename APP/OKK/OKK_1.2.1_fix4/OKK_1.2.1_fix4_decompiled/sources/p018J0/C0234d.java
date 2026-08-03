package p018J0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.C0479d;
import androidx.emoji2.text.C0491p;
import androidx.emoji2.text.C0494s;
import androidx.emoji2.text.C0497v;
import androidx.emoji2.text.C0498w;
import androidx.emoji2.text.InterfaceC0482g;
import androidx.emoji2.text.InterfaceC0490o;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p004C.C0061b;
import p006D.C0095d;
import p023M.C0247a;
import p037U.AbstractC0358S;
import p037U.AbstractC0365a;
import p037U.C0366b;
import p037U.C0386v;
import p043Y.C0463v;
import p056f0.AbstractC0805P;
import p057g.C0850B;
import p071n.C0999d;
import p071n.C1000e;
import p073o.C1013b;
import p075p.C1040f;
import p083u.AbstractC1094m;
import p085v.AbstractC1103d;
import p085v.AbstractC1104e;
import p089x0.C1121e;

/* JADX INFO: renamed from: J0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0234d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f473a;

    /* JADX INFO: renamed from: b */
    public final Object f474b;

    /* JADX INFO: renamed from: c */
    public final Object f475c;

    /* JADX INFO: renamed from: d */
    public Object f476d;

    public C0234d(C0386v c0386v) {
        this.f473a = 2;
        this.f474b = c0386v;
        this.f475c = new C0366b();
        this.f476d = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m637c(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0498w[] c0498wArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0498wArr = (C0498w[]) editable.getSpans(selectionStart, selectionEnd, C0498w.class)) != null && c0498wArr.length > 0) {
            for (C0498w c0498w : c0498wArr) {
                int spanStart = editable.getSpanStart(c0498w);
                int spanEnd = editable.getSpanEnd(c0498w);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static C0234d m638s(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new C0234d(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    /* JADX INFO: renamed from: a */
    public void m639a(View view, int i2, boolean z2) {
        C0386v c0386v = (C0386v) this.f474b;
        int childCount = i2 < 0 ? c0386v.f875a.getChildCount() : m648k(i2);
        ((C0366b) this.f475c).m941e(childCount, z2);
        if (z2) {
            m653p(view);
        }
        c0386v.f875a.addView(view, childCount);
        RecyclerView.m1301u(view);
    }

    /* JADX INFO: renamed from: b */
    public void m640b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        C0386v c0386v = (C0386v) this.f474b;
        int childCount = i2 < 0 ? c0386v.f875a.getChildCount() : m648k(i2);
        ((C0366b) this.f475c).m941e(childCount, z2);
        if (z2) {
            m653p(view);
        }
        c0386v.getClass();
        RecyclerView.m1301u(view);
        c0386v.f875a.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m641d(int i2) {
        int iM648k = m648k(i2);
        ((C0366b) this.f475c).m942f(iM648k);
        RecyclerView recyclerView = ((C0386v) this.f474b).f875a;
        View childAt = recyclerView.getChildAt(iM648k);
        if (childAt != null) {
            RecyclerView.m1301u(childAt);
        }
        recyclerView.detachViewFromParent(iM648k);
    }

    /* JADX INFO: renamed from: e */
    public int m642e(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f476d;
        int size = arrayList.size();
        while (i3 < size) {
            AbstractC0365a abstractC0365a = (AbstractC0365a) arrayList.get(i3);
            abstractC0365a.getClass();
            abstractC0365a.getClass();
            i3++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public View m643f(int i2) {
        return ((C0386v) this.f474b).f875a.getChildAt(m648k(i2));
    }

    /* JADX INFO: renamed from: g */
    public int m644g() {
        return ((C0386v) this.f474b).f875a.getChildCount() - ((ArrayList) this.f476d).size();
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m645h(int i2) {
        int resourceId;
        ColorStateList colorStateListM2049p;
        TypedArray typedArray = (TypedArray) this.f475c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM2049p = AbstractC0805P.m2049p((Context) this.f474b, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM2049p;
    }

    /* JADX INFO: renamed from: i */
    public Drawable m646i(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f475c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0358S.m916w((Context) this.f474b, resourceId);
    }

    /* JADX INFO: renamed from: j */
    public Typeface m647j(int i2, int i3, C0850B c0850b) {
        int resourceId = ((TypedArray) this.f475c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f476d) == null) {
            this.f476d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f476d;
        ThreadLocal threadLocal = AbstractC1094m.f4210a;
        Context context = (Context) this.f474b;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC1094m.m2584b(context, resourceId, typedValue, i3, c0850b, true, false);
    }

    /* JADX INFO: renamed from: k */
    public int m648k(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((C0386v) this.f474b).f875a.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            C0366b c0366b = (C0366b) this.f475c;
            int iM938b = i2 - (i3 - c0366b.m938b(i3));
            if (iM938b == 0) {
                while (c0366b.m940d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iM938b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public View m649l(int i2) {
        return ((C0386v) this.f474b).f875a.getChildAt(i2);
    }

    /* JADX INFO: renamed from: m */
    public int m650m() {
        return ((C0386v) this.f474b).f875a.getChildCount();
    }

    /* JADX INFO: renamed from: n */
    public boolean m651n(CharSequence charSequence, int i2, int i3, C0497v c0497v) {
        if ((c0497v.f1400c & 3) == 0) {
            InterfaceC0482g interfaceC0482g = (InterfaceC0482g) this.f476d;
            C0247a c0247aM1220c = c0497v.m1220c();
            int iM205a = c0247aM1220c.m205a(8);
            if (iM205a != 0) {
                ((ByteBuffer) c0247aM1220c.f214d).getShort(iM205a + c0247aM1220c.f211a);
            }
            C0479d c0479d = (C0479d) interfaceC0482g;
            c0479d.getClass();
            ThreadLocal threadLocal = C0479d.f1347b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = c0479d.f1348a;
            String string = sb.toString();
            int i4 = AbstractC1104e.f4253a;
            boolean zM2601a = AbstractC1103d.m2601a(textPaint, string);
            int i5 = c0497v.f1400c & 4;
            c0497v.f1400c = zM2601a ? i5 | 2 : i5 | 1;
        }
        return (c0497v.f1400c & 3) == 2;
    }

    /* JADX INFO: renamed from: o */
    public boolean m652o() {
        return ((ArrayList) this.f475c).size() > 0;
    }

    /* JADX INFO: renamed from: p */
    public void m653p(View view) {
        ((ArrayList) this.f476d).add(view);
        ((C0386v) this.f474b).getClass();
        RecyclerView.m1301u(view);
    }

    /* JADX INFO: renamed from: q */
    public boolean m654q(View view) {
        return ((ArrayList) this.f476d).contains(view);
    }

    /* JADX INFO: renamed from: r */
    public boolean m655r(C1040f c1040f, C0999d c0999d, boolean z2) {
        int[] iArr = c0999d.f3615c0;
        int i2 = iArr[0];
        C1013b c1013b = (C1013b) this.f475c;
        c1013b.f3724a = i2;
        c1013b.f3725b = iArr[1];
        c1013b.f3726c = c0999d.m2407l();
        c1013b.f3727d = c0999d.m2404i();
        c1013b.f3732i = false;
        c1013b.f3733j = z2;
        boolean z3 = c1013b.f3724a == 3;
        boolean z4 = c1013b.f3725b == 3;
        boolean z5 = z3 && c0999d.f3595L > 0.0f;
        boolean z6 = z4 && c0999d.f3595L > 0.0f;
        int[] iArr2 = c0999d.f3624l;
        if (z5 && iArr2[0] == 4) {
            c1013b.f3724a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            c1013b.f3725b = 1;
        }
        c1040f.m2519a(c0999d, c1013b);
        c0999d.m2420y(c1013b.f3728e);
        c0999d.m2417v(c1013b.f3729f);
        c0999d.f3635w = c1013b.f3731h;
        int i3 = c1013b.f3730g;
        c0999d.f3599P = i3;
        c0999d.f3635w = i3 > 0;
        c1013b.f3733j = false;
        return c1013b.f3732i;
    }

    /* JADX INFO: renamed from: t */
    public Object m656t(CharSequence charSequence, int i2, int i3, int i4, boolean z2, InterfaceC0490o interfaceC0490o) {
        char c;
        C0494s c0494s = null;
        C0491p c0491p = new C0491p((C0494s) ((C0463v) this.f475c).f1046c, false, null);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i5 = 0;
        boolean zMo2c = true;
        int iCharCount = i2;
        int i6 = iCharCount;
        while (iCharCount < i3 && i5 < i4 && zMo2c) {
            SparseArray sparseArray = c0491p.f1373c.f1391a;
            C0494s c0494s2 = sparseArray == null ? c0494s : (C0494s) sparseArray.get(iCodePointAt);
            if (c0491p.f1371a == 2) {
                if (c0494s2 != null) {
                    c0491p.f1373c = c0494s2;
                    c0491p.f1376f++;
                } else {
                    if (iCodePointAt == 65038) {
                        c0491p.m1207a();
                    } else if (iCodePointAt != 65039) {
                        C0494s c0494s3 = c0491p.f1373c;
                        if (c0494s3.f1392b != null) {
                            if (c0491p.f1376f != 1) {
                                c0491p.f1374d = c0494s3;
                                c0491p.m1207a();
                            } else if (c0491p.m1208b()) {
                                c0491p.f1374d = c0491p.f1373c;
                                c0491p.m1207a();
                            } else {
                                c0491p.m1207a();
                            }
                            c = 3;
                        } else {
                            c0491p.m1207a();
                        }
                    }
                    c = 1;
                }
                c = 2;
            } else if (c0494s2 == null) {
                c0491p.m1207a();
                c = 1;
            } else {
                c0491p.f1371a = 2;
                c0491p.f1373c = c0494s2;
                c0491p.f1376f = 1;
                c = 2;
            }
            c0491p.f1375e = iCodePointAt;
            if (c != 1) {
                if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z2 || !m651n(charSequence, i6, iCharCount, c0491p.f1374d.f1392b)) {
                        zMo2c = interfaceC0490o.mo2c(charSequence, i6, iCharCount, c0491p.f1374d.f1392b);
                        i5++;
                    }
                }
                c0494s = null;
            } else {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                if (iCharCount < i3) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            }
            i6 = iCharCount;
            c0494s = null;
        }
        if (c0491p.f1371a == 2 && c0491p.f1373c.f1392b != null && ((c0491p.f1376f > 1 || c0491p.m1208b()) && i5 < i4 && zMo2c && (z2 || !m651n(charSequence, i6, iCharCount, c0491p.f1373c.f1392b)))) {
            interfaceC0490o.mo2c(charSequence, i6, iCharCount, c0491p.f1373c.f1392b);
        }
        return interfaceC0490o.mo6g();
    }

    public String toString() {
        switch (this.f473a) {
            case 2:
                return ((C0366b) this.f475c).toString() + ", hidden list:" + ((ArrayList) this.f476d).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m657u() {
        ((TypedArray) this.f475c).recycle();
    }

    /* JADX INFO: renamed from: v */
    public void m658v(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0365a abstractC0365a = (AbstractC0365a) list.get(i2);
            abstractC0365a.f774a = null;
            ((C0061b) this.f474b).mo200c(abstractC0365a);
        }
        list.clear();
    }

    /* JADX INFO: renamed from: w */
    public void m659w(C1000e c1000e, int i2, int i3) {
        int i4 = c1000e.f3600Q;
        int i5 = c1000e.f3601R;
        c1000e.f3600Q = 0;
        c1000e.f3601R = 0;
        c1000e.m2420y(i2);
        c1000e.m2417v(i3);
        if (i4 < 0) {
            c1000e.f3600Q = 0;
        } else {
            c1000e.f3600Q = i4;
        }
        if (i5 < 0) {
            c1000e.f3601R = 0;
        } else {
            c1000e.f3601R = i5;
        }
        ((C1000e) this.f476d).m2425E();
    }

    /* JADX INFO: renamed from: x */
    public void m660x(View view) {
        if (((ArrayList) this.f476d).remove(view)) {
            ((C0386v) this.f474b).getClass();
            RecyclerView.m1301u(view);
        }
    }

    public C0234d(Method method, Method method2, Method method3) {
        this.f473a = 0;
        this.f474b = method;
        this.f475c = method2;
        this.f476d = method3;
    }

    public C0234d(Context context, TypedArray typedArray) {
        this.f473a = 4;
        this.f474b = context;
        this.f475c = typedArray;
    }

    public C0234d(C1000e c1000e) {
        this.f473a = 5;
        this.f474b = new ArrayList();
        this.f475c = new C1013b();
        this.f476d = c1000e;
    }

    public C0234d(C1121e c1121e) {
        this.f473a = 1;
        this.f474b = new C0061b(30);
        this.f475c = new ArrayList();
        this.f476d = new ArrayList();
        new C1121e(12, this);
    }

    public C0234d(C0463v c0463v, C1121e c1121e, InterfaceC0482g interfaceC0482g, Set set) {
        this.f473a = 3;
        this.f474b = c1121e;
        this.f475c = c0463v;
        this.f476d = interfaceC0482g;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m656t(str, 0, str.length(), 1, true, new C0095d(13, str));
        }
    }
}
