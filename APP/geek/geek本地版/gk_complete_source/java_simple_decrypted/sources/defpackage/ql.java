package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ql implements LayoutInflater.Factory2 {
    public final yl a;

    public ql(yl r1) {
        this.a = r1;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String r2, Context r3, AttributeSet r4) {
        return onCreateView(null, r2, r3, r4);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View r19, String r20, Context r21, AttributeSet r22) {
        yl r4 = this.a;
        r5 r5 = r4.c;
        int r8 = 0;
        ml r10 = null;
        if (FragmentContainerView.class.getName().equals(r20) == false) goto L83;
        FragmentContainerView r0 = new FragmentContainerView(r21, r22);
        r0.d = true;
        String r6 = r22.getClassAttribute();
        TypedArray r3 = r21.obtainStyledAttributes(r22, uy.b);
        if (r6 != null) goto L7;
        r6 = r3.getString(0);
    L7:
        String r12 = r3.getString(1);
        r3.recycle();
        int r32 = r0.getId();
        ml r13 = r4.v(r32);
        if (r6 == null) goto L72;
        if (r13 != null) goto L72;
        if (r32 > 0) goto L17;
        if (r12 == null) goto L14;
        String r02 = " with tag ".concat(r12);
    L16:
        throw new IllegalStateException(z30.j("FragmentContainerView must have an android:id to add Fragment ", r6, r02));
    L14:
        r02 = "";
        goto L16
    L17:
        tl r33 = r4.x();
        r21.getClassLoader();
        ml r2 = r33.a(r6);
        r2.C = true;
        nl r34 = r2.s;
        if (r34 != null) goto L20;
        FragmentActivity r35 = null;
    L21:
        if (r35 == null) goto L23;
        r2.C = true;
    L23:
        b7 r36 = new b7(r4);
        r36.o = true;
        r2.D = r0;
        int r42 = r0.getId();
        Class<?> r62 = r2.getClass();
        int r14 = r62.getModifiers();
        if (r62.isAnonymousClass() == true) goto L71;
        if (Modifier.isPublic(r14) == false) goto L71;
        if (r62.isMemberClass() == false) goto L32;
        if (Modifier.isStatic(r14) == false) goto L71;
    L32:
        if (r12 == null) goto L41;
        String r142 = r2.x;
        if (r142 != null) goto L36;
    L40:
        r2.x = r12;
        goto L41
    L36:
        if (r12.equals(r142) == true) goto L40;
        throw new IllegalStateException("Can't change tag of fragment " + r2 + ": was " + r2.x + " now " + r12);
    L41:
        if (r42 == 0) goto L52;
        if (r42 == (-1)) goto L51;
        int r9 = r2.v;
        if (r9 == 0) goto L49;
        if (r9 == r42) goto L49;
        throw new IllegalStateException("Can't change container ID of fragment " + r2 + ": was " + r2.v + " now " + r42);
    L49:
        r2.v = r42;
        r2.w = r42;
        goto L52
    L51:
        throw new IllegalArgumentException("Can't add fragment " + r2 + " with tag " + r12 + " to container view with no id");
    L52:
        r36.b(new em(1, r2));
        yl r43 = r36.p;
        r2.r = r43;
        if (r36.g == true) goto L69;
        if (r43.n == null) goto L72;
        if (r43.A == true) goto L72;
        r43.s(true);
        r36.a(r43.C, r43.D);
        r43.b = true;
        r43.J(r43.C, r43.D);     // Catch: Throwable -> L65
        r43.d();
        r43.T();
        if (r43.B == false) goto L64;
        r43.B = false;
        r43.S();
    L64:
        ((HashMap) r43.c.b).values().removeAll(Collections.singleton(null));
    L65:
        th = move-exception;
        r43.d();
        throw th;
    L69:
        throw new IllegalStateException("This transaction is already being added to the back stack");
    L71:
        throw new IllegalStateException("Fragment " + r62.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    L20:
        r35 = r34.C;
    L72:
        ArrayList r23 = r5.i();
        int r37 = r23.size();
    L73:
        if (r8 >= r37) goto L81;
        Object r44 = r23.get(r8);
        r8 = r8 + 1;
        a r45 = (a) r44;
        ml r52 = r45.c;
        if (r52.w != r0.getId()) goto L73;
        View r63 = r52.E;
        if (r63 == null) goto L73;
        if (r63.getParent() != null) goto L73;
        r52.D = r0;
        r45.b();
        goto L73
    L81:
        return r0;
    L83:
        if ("fragment".equals(r20) == false) goto L169;
        String r03 = r22.getAttributeValue(null, "class");
        TypedArray r64 = r21.obtainStyledAttributes(r22, uy.a);
        if (r03 != null) goto L88;
        r03 = r64.getString(0);
    L88:
        int r122 = r64.getResourceId(1, -1);
        int r132 = 2;
        String r143 = r64.getString(2);
        r64.recycle();
        if (r03 == null) goto L169;
        boolean r65 = ml.class.isAssignableFrom(tl.b(r21.getClassLoader(), r03));     // Catch: ClassNotFoundException -> L93
    L94:
        if (r65 == false) goto L169;
        if (r19 == null) goto L98;
        r8 = r19.getId();
    L98:
        if (r8 != (-1)) goto L104;
        if (r122 != (-1)) goto L104;
        if (r143 != null) goto L104;
        throw new IllegalArgumentException(r22.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + r03);
    L104:
        if (r122 == (-1)) goto L106;
        ml r66 = r4.v(r122);
    L107:
        if (r66 != null) goto L126;
        if (r143 == null) goto L126;
        ArrayList r67 = (ArrayList) r5.c;
        int r15 = r67.size() - 1;
    L110:
        if (r15 < 0) goto L117;
        ml r17 = r10;
        ml r102 = (ml) r67.get(r15);
        int r202 = r132;
        if (r102 == null) goto L116;
        if (r143.equals(r102.x) == false) goto L116;
        r66 = r102;
    L127:
        if (r66 != null) goto L131;
        if (r8 == (-1)) goto L131;
        r66 = r4.v(r8);
    L131:
        if (r66 != null) goto L146;
        tl r38 = r4.x();
        r21.getClassLoader();
        r66 = r38.a(r03);
        r66.m = true;
        if (r122 == 0) goto L135;
        int r24 = r122;
    L136:
        r66.v = r24;
        r66.w = r8;
        r66.x = r143;
        r66.n = true;
        r66.r = r4;
        nl r25 = r4.n;
        r66.s = r25;
        FragmentActivity r39 = r25.D;
        r66.C = true;
        if (r25 != null) goto L139;
        oq r103 = r17;
    L140:
        if (r103 == null) goto L142;
        r66.C = true;
    L142:
        a r26 = r4.a(r66);
        if (yl.A(r202) == false) goto L156;
        Log.v("FragmentManager", "Fragment " + r66 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(r122));
    L156:
        r66.D = (ViewGroup) r19;
        r26.k();
        r26.j();
        View r310 = r66.E;
        if (r310 == null) goto L166;
        if (r122 == 0) goto L161;
        r310.setId(r122);
    L161:
        if (r66.E.getTag() != null) goto L163;
        r66.E.setTag(r143);
    L163:
        r66.E.addOnAttachStateChangeListener(new pl(this, r26));
        return r66.E;
    L166:
        throw new IllegalStateException(z30.j("Fragment ", r03, " did not create a view."));
    L139:
        r103 = r25.C;
        goto L140
    L135:
        r24 = r8;
        goto L136
    L146:
        if (r66.n == true) goto L168;
        r66.n = true;
        r66.r = r4;
        nl r27 = r4.n;
        r66.s = r27;
        FragmentActivity r311 = r27.D;
        r66.C = true;
        if (r27 != null) goto L150;
        oq r104 = r17;
    L151:
        if (r104 == null) goto L153;
        r66.C = true;
    L153:
        r26 = r4.f(r66);
        if (yl.A(r202) == false) goto L156;
        Log.v("FragmentManager", "Retained Fragment " + r66 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(r122));
        goto L156
    L150:
        r104 = r27.C;
        goto L151
    L168:
        throw new IllegalArgumentException(r22.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(r122) + ", tag " + r143 + ", or parent id 0x" + Integer.toHexString(r8) + " with another fragment for " + r03);
    L116:
        r15 = r15 - 1;
        r132 = r202;
        r10 = r17;
        goto L110
    L117:
        r17 = r10;
        r202 = r132;
        Iterator r53 = ((HashMap) r5.b).values().iterator();
    L119:
        if (r53.hasNext() == false) goto L125;
        a r68 = (a) r53.next();
        if (r68 == null) goto L119;
        r66 = r68.c;
        if (r143.equals(r66.x) == false) goto L119;
    L125:
        r66 = r17;
    L126:
        r17 = null;
        r202 = 2;
        goto L127
    L106:
        r66 = null;
    L93:
        r65 = false;
    L169:
        return null;
    }
}
