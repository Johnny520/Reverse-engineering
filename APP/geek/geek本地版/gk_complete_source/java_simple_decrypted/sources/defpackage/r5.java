package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements j8 {
    public static volatile r5 e;
    public static final Object f = null;
    public static r5 g;
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;

    static {
        f = new Object();
    }

    public r5() {
        this.a = 5;
        this.c = new ArrayList();
        this.b = new HashMap();
    }

    public static r5 q(Context r2) {
        if (e != null) goto L16;
        Object r0 = f;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (e != null) goto L11;
        e = new r5(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
    L16:
        return e;
    }

    public static r5 y(Context r2, AttributeSet r3, int[] r4, int r5) {
        return new r5(r2, r2.obtainStyledAttributes(r3, r4, r5, 0));
    }

    public void A(qc r4, int r5, int r6) {
        int r0 = r4.Q;
        int r1 = r4.R;
        r4.Q = 0;
        r4.R = 0;
        r4.y(r5);
        r4.v(r6);
        if (r0 >= 0) goto L5;
        r4.Q = 0;
    L6:
        if (r1 >= 0) goto L8;
        r4.R = 0;
    L9:
        ((qc) this.d).E();
        return;
    L8:
        r4.R = r1;
        goto L9
    L5:
        r4.Q = r0;
        goto L6
    }

    public void B(View r4) {
        if (((ArrayList) this.d).remove(r4) == false) goto L12;
        ez r0 = (ez) this.b;
        b00 r42 = RecyclerView.I(r4);
        if (r42 == null) goto L13;
        RecyclerView r02 = r0.a;
        int r1 = r42.p;
        if (r02.L() == false) goto L9;
        r42.q = r1;
        r02.p0.add(r42);
    L10:
        r42.p = 0;
        return;
    L9:
        View r03 = r42.a;
        WeakHashMap r2 = ja0.a;
        s90.s(r03, r1);
        goto L10
    L13:
        return;
    }

    public void a(ml r4) {
        if (((ArrayList) this.c).contains(r4) == true) goto L14;
        ArrayList r0 = (ArrayList) this.c;
        monitor-enter(r0);
        ((ArrayList) this.c).add(r4);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        r4.k = true;
        return;
    L10:
        th = move-exception;
        throw th;
    L14:
        throw new IllegalStateException("Fragment already added: " + r4);
    }

    public void b(View r3, int r4, boolean r5) {
        RecyclerView r0 = ((ez) this.b).a;
        if (r4 >= 0) goto L5;
        int r42 = r0.getChildCount();
    L6:
        ((fa) this.c).e(r42, r5);
        if (r5 == false) goto L9;
        u(r3);
    L9:
        r0.addView(r3, r42);
        RecyclerView.I(r3);
        return;
    L5:
        r42 = r(r4);
        goto L6
    }

    public void c(View r3, int r4, ViewGroup.LayoutParams r5, boolean r6) {
        RecyclerView r0 = ((ez) this.b).a;
        if (r4 >= 0) goto L5;
        int r42 = r0.getChildCount();
    L6:
        ((fa) this.c).e(r42, r6);
        if (r6 == false) goto L9;
        u(r3);
    L9:
        b00 r62 = RecyclerView.I(r3);
        if (r62 != null) goto L12;
    L19:
        RecyclerView.a(r0, r3, r42, r5);
        return;
    L12:
        if (r62.j() == false) goto L14;
    L18:
        r62.j &= -257;
        goto L19
    L14:
        if (r62.o() == true) goto L18;
        throw new IllegalArgumentException("Called attach on a child which is not detached: " + r62 + r0.y());
    L5:
        r42 = r(r4);
        goto L6
    }

    public void d(int r5) {
        int r52 = r(r5);
        ((fa) this.c).f(r52);
        RecyclerView r0 = ((ez) this.b).a;
        View r1 = r0.getChildAt(r52);
        if (r1 == null) goto L14;
        b00 r12 = RecyclerView.I(r1);
        if (r12 == null) goto L14;
        if (r12.j() == true) goto L9;
    L13:
        r12.a(256);
        goto L14
    L9:
        if (r12.o() == true) goto L13;
        throw new IllegalArgumentException("called detach on an already detached child " + r12 + r0.y());
    L14:
        RecyclerView.c(r0, r52);
    }

    public void e(Bundle r7) {
        HashSet r0 = (HashSet) this.c;
        String r1 = ((Context) this.d).getString(R.string.androidx_startup);
        if (r7 != null) goto L22;
        return;
    L22:
        HashSet r2 = new HashSet();     // Catch: ClassNotFoundException -> L12
        Iterator<String> r3 = r7.keySet().iterator();     // Catch: ClassNotFoundException -> L12
    L6:
        if (r3.hasNext() == false) goto L14;
        String r4 = r3.next();     // Catch: ClassNotFoundException -> L12
        if (r1.equals(r7.getString(r4, null)) == false) goto L6;
        Class<?> r42 = Class.forName(r4);     // Catch: ClassNotFoundException -> L12
        if (ap.class.isAssignableFrom(r42) == false) goto L6;
        r0.add(r42);     // Catch: ClassNotFoundException -> L12
        goto L6
    L14:
        Iterator r72 = r0.iterator();     // Catch: ClassNotFoundException -> L12
    L15:
        if (r72.hasNext() == false) goto L32;
        f((Class) r72.next(), r2);     // Catch: ClassNotFoundException -> L12
        goto L15
    L32:
        return;
    L12:
        e = move-exception;
        throw new pb(e);
    }

    public Object f(Class r6, HashSet r7) {
        HashMap r0 = (HashMap) this.b;
        if (ct.r() == false) goto L8;
        Trace.beginSection(r6.getSimpleName());     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        Trace.endSection();
        throw th;
    L8:
        if (r7.contains(r6) == true) goto L31;
        if (r0.containsKey(r6) == true) goto L27;
        r7.add(r6);     // Catch: Throwable -> L5
        ap r1 = (ap) r6.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L21
        List r2 = r1.a();     // Catch: Throwable -> L21
        if (r2.isEmpty() == true) goto L23;
        Iterator r22 = r2.iterator();     // Catch: Throwable -> L21
    L17:
        if (r22.hasNext() == false) goto L23;
        Class r3 = (Class) r22.next();     // Catch: Throwable -> L21
        if (r0.containsKey(r3) == true) goto L17;
        f(r3, r7);     // Catch: Throwable -> L21
    L23:
        Object r12 = r1.b((Context) this.d);     // Catch: Throwable -> L21
        r7.remove(r6);     // Catch: Throwable -> L21
        r0.put(r6, r12);     // Catch: Throwable -> L21
    L28:
        Trace.endSection();
        return r12;
    L21:
        th = move-exception;
        throw new pb(th);     // Catch: Throwable -> L5
    L27:
        r12 = r0.get(r6);     // Catch: Throwable -> L5
        goto L28
    L31:
        throw new IllegalStateException("Cannot initialize " + r6.getName() + ". Cycle detected.");     // Catch: Throwable -> L5
    }

    public ml g(String r2) {
        a r22 = (a) ((HashMap) this.b).get(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return r22.c;
    }

    public ml h(String r4) {
        Iterator r0 = ((HashMap) this.b).values().iterator();
    L4:
        if (r0.hasNext() == false) goto L13;
        a r1 = (a) r0.next();
        if (r1 == null) goto L4;
        ml r12 = r1.c;
        if (r4.equals(r12.e) == true) goto L11;
        r12 = r12.t.c.h(r4);
    L11:
        if (r12 == null) goto L4;
        return r12;
    L13:
        return null;
    }

    public ArrayList i() {
        ArrayList r0 = new ArrayList();
        Iterator r1 = ((HashMap) this.b).values().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        a r2 = (a) r1.next();
        if (r2 == null) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    public View j(int r2) {
        int r22 = r(r2);
        return ((ez) this.b).a.getChildAt(r22);
    }

    public int k() {
        return ((ez) this.b).a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList l(int r4) {
        TypedArray r0 = (TypedArray) this.b;
        if (r0.hasValue(r4) == false) goto L10;
        int r1 = r0.getResourceId(r4, 0);
        if (r1 == 0) goto L10;
        ColorStateList r12 = ip.v((Context) this.d, r1);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r0.getColorStateList(r4);
    }

    public Drawable m(int r3) {
        TypedArray r0 = (TypedArray) this.b;
        if (r0.hasValue(r3) == false) goto L9;
        int r1 = r0.getResourceId(r3, 0);
        if (r1 == 0) goto L9;
        return ff.r((Context) this.d, r1);
    L9:
        return r0.getDrawable(r3);
    }

    public Drawable n(int r5) {
        if (((TypedArray) this.b).hasValue(r5) == false) goto L14;
        int r52 = ((TypedArray) this.b).getResourceId(r5, 0);
        if (r52 == 0) goto L18;
        u3 r0 = u3.a();
        Context r1 = (Context) this.d;
        monitor-enter(r0);
        Drawable r53 = r0.a.d(r1, r52, true);     // Catch: Throwable -> L11
        monitor-exit(r0);
        return r53;
    L11:
        th = move-exception;
        throw th;
    L18:
        return null;
    L14:
        return null;
    }

    public Typeface o(int r10, int r11, x4 r12) {
        int r3 = ((TypedArray) this.b).getResourceId(r10, 0);
        if (r3 != 0) goto L6;
        return null;
    L6:
        if (((TypedValue) this.c) != null) goto L8;
        this.c = new TypedValue();
    L8:
        Context r2 = (Context) this.d;
        TypedValue r4 = (TypedValue) this.c;
        ThreadLocal r102 = c10.a;
        if (r2.isRestricted() == false) goto L13;
        return null;
    L13:
        return c10.b(r2, r3, r4, r11, r12, true, false);
    }

    @Override // defpackage.j8
    public void onCancel() {
        View r0 = (View) this.b;
        r0.clearAnimation();
        ((ViewGroup) this.c).endViewTransition(r0);
        ((ag) this.d).d();
    }

    public List p() {
        if (((ArrayList) this.c).isEmpty() == true) goto L5;
        ArrayList r0 = (ArrayList) this.c;
        monitor-enter(r0);
        ArrayList r1 = new ArrayList((ArrayList) this.c);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r1;
    L11:
        th = move-exception;
        throw th;
    L5:
        return Collections.EMPTY_LIST;
    }

    public int r(int r6) {
        fa r0 = (fa) this.c;
        if (r6 >= 0) goto L5;
        return -1;
    L5:
        int r2 = ((ez) this.b).a.getChildCount();
        int r3 = r6;
    L6:
        if (r3 >= r2) goto L14;
        int r4 = r6 - (r3 - r0.b(r3));
        if (r4 == 0) goto L10;
        r3 = r3 + r4;
    L10:
        if (r0.d(r3) == false) goto L12;
        r3 = r3 + 1;
        goto L10
    L12:
        return r3;
    L14:
        return -1;
    }

    public View s(int r2) {
        return ((ez) this.b).a.getChildAt(r2);
    }

    public int t() {
        return ((ez) this.b).a.getChildCount();
    }

    public String toString() {
        switch(this.a) {
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return ((fa) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
    }

    public void u(View r5) {
        ((ArrayList) this.d).add(r5);
        ez r0 = (ez) this.b;
        b00 r52 = RecyclerView.I(r5);
        if (r52 == null) goto L14;
        View r1 = r52.a;
        RecyclerView r02 = r0.a;
        int r2 = r52.q;
        if (r2 == (-1)) goto L7;
        r52.p = r2;
    L9:
        if (r02.L() == false) goto L12;
        r52.q = 4;
        r02.p0.add(r52);
        return;
    L12:
        WeakHashMap r53 = ja0.a;
        s90.s(r1, 4);
        return;
    L7:
        WeakHashMap r22 = ja0.a;
        r52.p = s90.c(r1);
        goto L9
    }

    public void v(a r4) {
        ml r0 = r4.c;
        String r1 = r0.e;
        HashMap r2 = (HashMap) this.b;
        if (r2.get(r1) == null) goto L5;
        return;
    L5:
        r2.put(r0.e, r4);
        if (yl.A(2) == false) goto L9;
        Log.v("FragmentManager", "Added fragment to active set " + r0);
        return;
    }

    public void w(a r4) {
        ml r42 = r4.c;
        if (r42.A == false) goto L6;
        ((am) this.d).b(r42);
    L6:
        if (((a) ((HashMap) this.b).put(r42.e, null)) != null) goto L9;
        return;
    L9:
        if (yl.A(2) == false) goto L12;
        Log.v("FragmentManager", "Removed fragment from active set " + r42);
        return;
    }

    public boolean x(hc r7, pc r8, boolean r9) {
        k7 r0 = (k7) this.c;
        int[] r1 = r8.c0;
        int[] r2 = r8.l;
        r0.a = r1[0];
        boolean r4 = true;
        r0.b = r1[1];
        r0.c = r8.l();
        r0.d = r8.i();
        r0.i = false;
        r0.j = r9;
        if (r0.a != 3) goto L5;
        boolean r92 = true;
    L7:
        if (r0.b != 3) goto L9;
        boolean r12 = true;
    L11:
        if (r92 == true) goto L13;
    L15:
        boolean r93 = false;
    L16:
        if (r12 == true) goto L18;
    L20:
        boolean r13 = false;
    L22:
        if (r93 == true) goto L24;
    L26:
        if (r13 == true) goto L28;
    L30:
        r7.a(r8, r0);
        r8.y(r0.e);
        r8.v(r0.f);
        r8.w = r0.h;
        int r72 = r0.g;
        r8.P = r72;
        if (r72 > 0) goto L34;
        r4 = false;
    L34:
        r8.w = r4;
        r0.j = false;
        return r0.i;
    L28:
        if (r2[1] != 4) goto L30;
        r0.b = 1;
        goto L30
    L24:
        if (r2[0] != 4) goto L26;
        r0.a = 1;
        goto L26
    L18:
        if (r8.L <= 0.0f) goto L20;
        r13 = true;
        goto L22
    L13:
        if (r8.L <= 0.0f) goto L15;
        r93 = true;
        goto L16
    L9:
        r12 = false;
        goto L11
    L5:
        r92 = false;
        goto L7
    }

    public void z() {
        ((TypedArray) this.b).recycle();
    }

    public r5(ez r2) {
        this.a = 3;
        this.b = r2;
        this.c = new fa();
        this.d = new ArrayList();
    }

    public r5(Context r2, TypedArray r3) {
        this.a = 6;
        this.d = r2;
        this.b = r3;
    }

    public r5(Context r2, LocationManager r3) {
        this.a = 7;
        this.c = new z70();
        this.d = r2;
        this.b = r3;
    }

    public r5(Context r2) {
        this.a = 0;
        this.d = r2.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public r5(qc r2) {
        this.a = 2;
        this.b = new ArrayList();
        this.c = new k7();
        this.d = r2;
    }

    public r5(l0 r2) {
        this.a = 1;
        this.a = 1;
        this.b = r2;
        this.c = Choreographer.getInstance();
        this.d = new o2(this);
    }

    public r5(ag r2, View r3, ViewGroup r4) {
        this.a = 4;
        this.b = r3;
        this.c = r4;
        this.d = r2;
    }
}
