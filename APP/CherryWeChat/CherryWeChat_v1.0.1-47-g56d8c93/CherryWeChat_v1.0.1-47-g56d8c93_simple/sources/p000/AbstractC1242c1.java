package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: c1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1242c1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f4220a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f4221b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f4222c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f4223d;

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f4224e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f4225f;

    /* JADX INFO: renamed from: g */
    public final Bundle f4226g;

    public AbstractC1242c1() {
        this.f4220a = new LinkedHashMap();
        this.f4221b = new LinkedHashMap();
        this.f4222c = new LinkedHashMap();
        this.f4223d = new ArrayList();
        this.f4224e = new LinkedHashMap();
        this.f4225f = new LinkedHashMap();
        this.f4226g = new Bundle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2363a(int r4, int r5, Intent r6) {
        String r42 = (String) this.f4220a.get(Integer.valueOf(r4));
        if (r42 != null) goto L6;
        return false;
    L6:
        C0989X0 r0 = (C0989X0) this.f4224e.get(r42);
        if (r0 == null) goto L9;
        InterfaceC0731R0 r1 = r0.f3158a;
    L10:
        if (r1 == null) goto L14;
        ArrayList r12 = this.f4223d;
        if (r12.contains(r42) == false) goto L14;
        r0.f3158a.mo1524a(r0.f3159b.mo1622c(r6, r5));
        r12.remove(r42);
        return true;
    L14:
        this.f4225f.remove(r42);
        C0689Q0 r02 = new C0689Q0(r6, r5);
        this.f4226g.putParcelable(r42, r02);
        return true;
    L9:
        r1 = null;
        goto L10
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1452b(int r1, AbstractC0817T0 r2, Object r3);

    /* JADX INFO: renamed from: c */
    public final C1199b1 m2364c(String r3, AbstractC0817T0 r4, InterfaceC0731R0 r5) {
        m2365d(r3);
        C0989X0 r0 = new C0989X0(r4, r5);
        this.f4224e.put(r3, r0);
        LinkedHashMap r02 = this.f4225f;
        if (r02.containsKey(r3) == false) goto L5;
        Object r1 = r02.get(r3);
        r02.remove(r3);
        r5.mo1524a(r1);
    L5:
        Bundle r03 = this.f4226g;
        C0689Q0 r12 = (C0689Q0) AbstractC0671Pj.m1353m(r03, r3);
        if (r12 == null) goto L9;
        r03.remove(r3);
        int r04 = r12.f2217a;
        r5.mo1524a(r4.mo1622c(r12.f2218b, r04));
    L9:
        return new C1199b1(this, r3, r4);
    }

    /* JADX INFO: renamed from: d */
    public final void m2365d(String r6) {
        LinkedHashMap r0 = this.f4221b;
        if (((Integer) r0.get(r6)) == null) goto L5;
        return;
    L5:
        C0848Tp r2 = new C0848Tp(27);
        Iterator r1 = new C1216bb(new C2763yj(C1075Z0.f3439b, r2)).iterator();
    L7:
        if (r1.hasNext() == false) goto L13;
        Number r22 = (Number) r1.next();
        Integer r3 = Integer.valueOf(r22.intValue());
        LinkedHashMap r4 = this.f4220a;
        if (r4.containsKey(r3) == true) goto L7;
        int r12 = r22.intValue();
        r4.put(Integer.valueOf(r12), r6);
        r0.put(r6, Integer.valueOf(r12));
        return;
    L13:
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: e */
    public final void m2366e(String r7) {
        if (this.f4223d.contains(r7) == true) goto L7;
        Integer r0 = (Integer) this.f4221b.remove(r7);
        if (r0 == null) goto L7;
        this.f4220a.remove(r0);
    L7:
        this.f4224e.remove(r7);
        LinkedHashMap r02 = this.f4225f;
        if (r02.containsKey(r7) == false) goto L10;
        Objects.toString(r02.get(r7));
        r02.remove(r7);
    L10:
        Bundle r03 = this.f4226g;
        if (r03.containsKey(r7) == false) goto L13;
        Objects.toString((C0689Q0) AbstractC0671Pj.m1353m(r03, r7));
        r03.remove(r7);
    L13:
        LinkedHashMap r04 = this.f4222c;
        C1032Y0 r1 = (C1032Y0) r04.get(r7);
        if (r1 == null) goto L22;
        ArrayList r2 = r1.f3302b;
        Iterator r3 = r2.iterator();
    L17:
        if (r3.hasNext() == false) goto L19;
        InterfaceC0889Un r4 = (InterfaceC0889Un) r3.next();
        r1.f3301a.mo1556b(r4);
        goto L17
    L19:
        r2.clear();
        r04.remove(r7);
        return;
    }
}
