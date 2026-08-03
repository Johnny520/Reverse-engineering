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
import com.abc.core.runtime.AbstractC0805P;
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

    public C0234d(C0386v r2) {
        this.f473a = 2;
        this.f474b = r2;
        this.f475c = new C0366b();
        this.f476d = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m637c(Editable r7, KeyEvent r8, boolean r9) {
        if ((!KeyEvent.metaStateHasNoModifiers(r8.getMetaState())) == false) goto L5;
        return false;
    L5:
        int r82 = Selection.getSelectionStart(r7);
        int r2 = Selection.getSelectionEnd(r7);
        if (r82 == (-1)) goto L26;
        if (r2 == (-1)) goto L26;
        if (r82 != r2) goto L26;
        C0498w[] r22 = (C0498w[]) r7.getSpans(r82, r2, C0498w.class);
        if (r22 == null) goto L26;
        if (r22.length <= 0) goto L26;
        int r3 = r22.length;
        int r4 = 0;
    L15:
        if (r4 >= r3) goto L26;
        C0498w r5 = r22[r4];
        int r6 = r7.getSpanStart(r5);
        int r52 = r7.getSpanEnd(r5);
        if (r9 == false) goto L19;
        if (r6 != r82) goto L19;
    L23:
        r7.delete(r6, r52);
        return true;
    L19:
        if (r9 == true) goto L21;
        if (r52 == r82) goto L23;
    L21:
        if (r82 <= r6) goto L25;
        if (r82 < r52) goto L23;
    L25:
        r4 = r4 + 1;
    L26:
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static C0234d m638s(Context r1, AttributeSet r2, int[] r3, int r4, int r5) {
        return new C0234d(r1, r1.obtainStyledAttributes(r2, r3, r4, r5));
    }

    /* JADX INFO: renamed from: a */
    public void m639a(View r3, int r4, boolean r5) {
        C0386v r02 = (C0386v) this.f474b;
        if (r4 >= 0) goto L5;
        int r42 = r02.f875a.getChildCount();
    L6:
        ((C0366b) this.f475c).m941e(r42, r5);
        if (r5 == false) goto L9;
        m653p(r3);
    L9:
        r02.f875a.addView(r3, r42);
        RecyclerView.m1301u(r3);
        return;
    L5:
        r42 = m648k(r4);
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public void m640b(View r3, int r4, ViewGroup.LayoutParams r5, boolean r6) {
        C0386v r02 = (C0386v) this.f474b;
        if (r4 >= 0) goto L5;
        int r42 = r02.f875a.getChildCount();
    L6:
        ((C0366b) this.f475c).m941e(r42, r6);
        if (r6 == false) goto L9;
        m653p(r3);
    L9:
        r02.getClass();
        RecyclerView.m1301u(r3);
        RecyclerView.m1297a(r02.f875a, r3, r42, r5);
        return;
    L5:
        r42 = m648k(r4);
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public void m641d(int r3) {
        int r32 = m648k(r3);
        ((C0366b) this.f475c).m942f(r32);
        RecyclerView r02 = ((C0386v) this.f474b).f875a;
        View r1 = r02.getChildAt(r32);
        if (r1 == null) goto L5;
        RecyclerView.m1301u(r1);
    L5:
        RecyclerView.m1298b(r02, r32);
    }

    /* JADX INFO: renamed from: e */
    public int m642e(int r4, int r5) {
        ArrayList r02 = (ArrayList) this.f476d;
        int r1 = r02.size();
    L3:
        if (r5 >= r1) goto L5;
        AbstractC0365a r2 = (AbstractC0365a) r02.get(r5);
        r2.getClass();
        r2.getClass();
        r5 = r5 + 1;
        goto L3
    L5:
        return r4;
    }

    /* JADX INFO: renamed from: f */
    public View m643f(int r2) {
        int r22 = m648k(r2);
        return ((C0386v) this.f474b).f875a.getChildAt(r22);
    }

    /* JADX INFO: renamed from: g */
    public int m644g() {
        return ((C0386v) this.f474b).f875a.getChildCount() - ((ArrayList) this.f476d).size();
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m645h(int r4) {
        TypedArray r02 = (TypedArray) this.f475c;
        if (r02.hasValue(r4) == false) goto L10;
        int r1 = r02.getResourceId(r4, 0);
        if (r1 == 0) goto L10;
        ColorStateList r12 = AbstractC0805P.m2049p((Context) this.f474b, r1);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r02.getColorStateList(r4);
    }

    /* JADX INFO: renamed from: i */
    public Drawable m646i(int r3) {
        TypedArray r02 = (TypedArray) this.f475c;
        if (r02.hasValue(r3) == false) goto L9;
        int r1 = r02.getResourceId(r3, 0);
        if (r1 == 0) goto L9;
        return AbstractC0358S.m916w((Context) this.f474b, r1);
    L9:
        return r02.getDrawable(r3);
    }

    /* JADX INFO: renamed from: j */
    public Typeface m647j(int r10, int r11, C0850B r12) {
        int r3 = ((TypedArray) this.f475c).getResourceId(r10, 0);
        if (r3 != 0) goto L6;
        return null;
    L6:
        if (((TypedValue) this.f476d) != null) goto L8;
        this.f476d = new TypedValue();
    L8:
        TypedValue r4 = (TypedValue) this.f476d;
        ThreadLocal r02 = AbstractC1094m.f4210a;
        Context r2 = (Context) this.f474b;
        if (r2.isRestricted() == false) goto L12;
        return null;
    L12:
        return AbstractC1094m.m2584b(r2, r3, r4, r11, r12, true, false);
    }

    /* JADX INFO: renamed from: k */
    public int m648k(int r6) {
        if (r6 >= 0) goto L5;
        return -1;
    L5:
        int r1 = ((C0386v) this.f474b).f875a.getChildCount();
        int r2 = r6;
    L6:
        if (r2 >= r1) goto L14;
        C0366b r3 = (C0366b) this.f475c;
        int r4 = r6 - (r2 - r3.m938b(r2));
        if (r4 == 0) goto L10;
        r2 = r2 + r4;
    L10:
        if (r3.m940d(r2) == false) goto L12;
        r2 = r2 + 1;
        goto L10
    L12:
        return r2;
    L14:
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public View m649l(int r2) {
        return ((C0386v) this.f474b).f875a.getChildAt(r2);
    }

    /* JADX INFO: renamed from: m */
    public int m650m() {
        return ((C0386v) this.f474b).f875a.getChildCount();
    }

    /* JADX INFO: renamed from: n */
    public boolean m651n(CharSequence r8, int r9, int r10, C0497v r11) {
        if ((r11.f1400c & 3) != 0) goto L19;
        InterfaceC0482g r1 = (InterfaceC0482g) this.f476d;
        C0247a r4 = r11.m1220c();
        int r5 = r4.m205a(8);
        if (r5 == 0) goto L7;
        ((ByteBuffer) r4.f214d).getShort(r5 + r4.f211a);
    L7:
        C0479d r12 = (C0479d) r1;
        r12.getClass();
        ThreadLocal r42 = C0479d.f1347b;
        if (r42.get() != null) goto L10;
        r42.set(new StringBuilder());
    L10:
        StringBuilder r43 = (StringBuilder) r42.get();
        r43.setLength(0);
    L11:
        if (r9 >= r10) goto L13;
        r43.append(r8.charAt(r9));
        r9 = r9 + 1;
        goto L11
    L13:
        TextPaint r82 = r12.f1348a;
        String r92 = r43.toString();
        int r102 = AbstractC1104e.f4253a;
        boolean r83 = AbstractC1103d.m2601a(r82, r92);
        int r93 = r11.f1400c & 4;
        if (r83 == false) goto L16;
        int r84 = r93 | 2;
    L17:
        r11.f1400c = r84;
        goto L19
    L16:
        r84 = r93 | 1;
    L19:
        if ((r11.f1400c & 3) != 2) goto L22;
        return true;
    L22:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m652o() {
        if (((ArrayList) this.f475c).size() <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m653p(View r2) {
        ((ArrayList) this.f476d).add(r2);
        ((C0386v) this.f474b).getClass();
        RecyclerView.m1301u(r2);
    }

    /* JADX INFO: renamed from: q */
    public boolean m654q(View r2) {
        return ((ArrayList) this.f476d).contains(r2);
    }

    /* JADX INFO: renamed from: r */
    public boolean m655r(C1040f r7, C0999d r8, boolean r9) {
        int[] r02 = r8.f3615c0;
        int r2 = r02[0];
        C1013b r3 = (C1013b) this.f475c;
        r3.f3724a = r2;
        boolean r22 = true;
        r3.f3725b = r02[1];
        r3.f3726c = r8.m2407l();
        r3.f3727d = r8.m2404i();
        r3.f3732i = false;
        r3.f3733j = r9;
        if (r3.f3724a != 3) goto L5;
        boolean r92 = true;
    L7:
        if (r3.f3725b != 3) goto L9;
        boolean r03 = true;
    L11:
        if (r92 == true) goto L13;
    L15:
        boolean r93 = false;
    L16:
        if (r03 == true) goto L18;
    L20:
        boolean r04 = false;
    L21:
        int[] r4 = r8.f3624l;
        if (r93 == true) goto L24;
    L26:
        if (r04 == true) goto L28;
    L30:
        r7.m2519a(r8, r3);
        r8.m2420y(r3.f3728e);
        r8.m2417v(r3.f3729f);
        r8.f3635w = r3.f3731h;
        int r72 = r3.f3730g;
        r8.f3599P = r72;
        if (r72 > 0) goto L34;
        r22 = false;
    L34:
        r8.f3635w = r22;
        r3.f3733j = false;
        return r3.f3732i;
    L28:
        if (r4[1] != 4) goto L30;
        r3.f3725b = 1;
        goto L30
    L24:
        if (r4[0] != 4) goto L26;
        r3.f3724a = 1;
        goto L26
    L18:
        if (r8.f3595L <= 0.0f) goto L20;
        r04 = true;
        goto L21
    L13:
        if (r8.f3595L <= 0.0f) goto L15;
        r93 = true;
        goto L16
    L9:
        r03 = false;
        goto L11
    L5:
        r92 = false;
        goto L7
    }

    /* JADX INFO: renamed from: t */
    public Object m656t(CharSequence r17, int r18, int r19, int r20, boolean r21, InterfaceC0490o r22) {
        C0494s r8 = null;
        C0491p r5 = new C0491p((C0494s) ((C0463v) this.f475c).f1046c, false, null);
        int r10 = Character.codePointAt(r17, r18);
        int r11 = 0;
        boolean r12 = true;
        int r6 = r18;
        int r7 = r6;
    L4:
        if (r6 >= r19) goto L56;
        if (r11 >= r20) goto L56;
        if (r12 == false) goto L56;
        SparseArray r14 = r5.f1373c.f1391a;
        if (r14 != null) goto L10;
        C0494s r142 = r8;
    L12:
        if (r5.f1371a == 2) goto L18;
        if (r142 != null) goto L16;
        r5.m1207a();
    L15:
        char r143 = 1;
    L37:
        r5.f1375e = r10;
        if (r143 == 1) goto L51;
        if (r143 == 2) goto L47;
        if (r143 != 3) goto L54;
        if (r21 == false) goto L44;
    L45:
        r12 = r22.mo2c(r17, r7, r6, r5.f1374d.f1392b);
        r11 = r11 + 1;
    L46:
        r7 = r6;
        goto L54
    L44:
        if (m651n(r17, r7, r6, r5.f1374d.f1392b) == true) goto L46;
    L54:
        r8 = null;
        goto L4
    L47:
        int r82 = Character.charCount(r10) + r6;
        if (r82 >= r19) goto L50;
        r10 = Character.codePointAt(r17, r82);
    L50:
        r6 = r82;
        goto L54
    L51:
        r6 = Character.charCount(Character.codePointAt(r17, r7)) + r7;
        if (r6 >= r19) goto L46;
        r10 = Character.codePointAt(r17, r6);
        goto L46
    L16:
        r5.f1371a = 2;
        r5.f1373c = r142;
        r5.f1376f = 1;
    L17:
        r143 = 2;
        goto L37
    L18:
        if (r142 == null) goto L21;
        r5.f1373c = r142;
        r5.f1376f++;
        goto L17
    L21:
        if (r10 != 65038) goto L24;
        r5.m1207a();
        goto L15
    L24:
        if (r10 == 65039) goto L17;
        C0494s r144 = r5.f1373c;
        if (r144.f1392b != null) goto L29;
        r5.m1207a();
        goto L15
    L29:
        if (r5.f1376f == 1) goto L31;
        r5.f1374d = r144;
        r5.m1207a();
    L33:
        r143 = 3;
        goto L37
    L31:
        if (r5.m1208b() == false) goto L34;
        r5.f1374d = r5.f1373c;
        r5.m1207a();
        goto L33
    L34:
        r5.m1207a();
        goto L15
    L10:
        r142 = (C0494s) r14.get(r10);
    L56:
        if (r5.f1371a != 2) goto L70;
        if (r5.f1373c.f1392b == null) goto L70;
        if (r5.f1376f <= 1) goto L62;
    L63:
        if (r11 >= r20) goto L70;
        if (r12 == false) goto L70;
        if (r21 == false) goto L67;
    L68:
        r22.mo2c(r17, r7, r6, r5.f1373c.f1392b);
        goto L70
    L67:
        if (m651n(r17, r7, r6, r5.f1373c.f1392b) == true) goto L70;
    L62:
        if (r5.m1208b() == true) goto L63;
    L70:
        return r22.mo6g();
    }

    public String toString() {
        switch(this.f473a) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return ((C0366b) this.f475c).toString() + ", hidden list:" + ((ArrayList) this.f476d).size();
    }

    /* JADX INFO: renamed from: u */
    public void m657u() {
        ((TypedArray) this.f475c).recycle();
    }

    /* JADX INFO: renamed from: v */
    public void m658v(List r5) {
        int r02 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        AbstractC0365a r2 = (AbstractC0365a) r5.get(r1);
        r2.f774a = null;
        ((C0061b) this.f474b).mo200c(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        r5.clear();
    }

    /* JADX INFO: renamed from: w */
    public void m659w(C1000e r4, int r5, int r6) {
        int r02 = r4.f3600Q;
        int r1 = r4.f3601R;
        r4.f3600Q = 0;
        r4.f3601R = 0;
        r4.m2420y(r5);
        r4.m2417v(r6);
        if (r02 >= 0) goto L5;
        r4.f3600Q = 0;
    L6:
        if (r1 >= 0) goto L8;
        r4.f3601R = 0;
    L9:
        ((C1000e) this.f476d).m2425E();
        return;
    L8:
        r4.f3601R = r1;
        goto L9
    L5:
        r4.f3600Q = r02;
        goto L6
    }

    /* JADX INFO: renamed from: x */
    public void m660x(View r2) {
        if (((ArrayList) this.f476d).remove(r2) == false) goto L6;
        ((C0386v) this.f474b).getClass();
        RecyclerView.m1301u(r2);
        return;
    }

    public C0234d(Method r2, Method r3, Method r4) {
        this.f473a = 0;
        this.f474b = r2;
        this.f475c = r3;
        this.f476d = r4;
    }

    public C0234d(Context r2, TypedArray r3) {
        this.f473a = 4;
        this.f474b = r2;
        this.f475c = r3;
    }

    public C0234d(C1000e r2) {
        this.f473a = 5;
        this.f474b = new ArrayList();
        this.f475c = new C1013b();
        this.f476d = r2;
    }

    public C0234d(C1121e r2) {
        this.f473a = 1;
        this.f474b = new C0061b(30);
        this.f475c = new ArrayList();
        this.f476d = new ArrayList();
        new C1121e(12, this);
    }

    public C0234d(C0463v r8, C1121e r9, InterfaceC0482g r10, Set r11) {
        this.f473a = 3;
        this.f474b = r9;
        this.f475c = r8;
        this.f476d = r10;
        if (r11.isEmpty() == true) goto L9;
        Iterator r82 = r11.iterator();
    L7:
        if (r82.hasNext() == false) goto L11;
        int[] r92 = (int[]) r82.next();
        String r1 = new String(r92, 0, r92.length);
        InterfaceC0490o r6 = new C0095d(13, r1);
        m656t(r1, 0, r1.length(), 1, true, r6);
        goto L7
    L11:
        return;
    }
}
