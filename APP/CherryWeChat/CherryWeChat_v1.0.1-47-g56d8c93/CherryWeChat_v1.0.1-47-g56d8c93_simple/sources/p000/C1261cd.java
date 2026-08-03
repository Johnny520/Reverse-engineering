package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1159h;
import androidx.recyclerview.widget.AbstractC1166o;
import java.util.ArrayList;

/* JADX INFO: renamed from: cd */
/* JADX INFO: loaded from: classes.dex */
public final class C1261cd extends AbstractC1159h {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f4275s;

    /* JADX INFO: renamed from: g */
    public boolean f4276g;

    /* JADX INFO: renamed from: h */
    public ArrayList f4277h;

    /* JADX INFO: renamed from: i */
    public ArrayList f4278i;

    /* JADX INFO: renamed from: j */
    public ArrayList f4279j;

    /* JADX INFO: renamed from: k */
    public ArrayList f4280k;

    /* JADX INFO: renamed from: l */
    public ArrayList f4281l;

    /* JADX INFO: renamed from: m */
    public ArrayList f4282m;

    /* JADX INFO: renamed from: n */
    public ArrayList f4283n;

    /* JADX INFO: renamed from: o */
    public ArrayList f4284o;

    /* JADX INFO: renamed from: p */
    public ArrayList f4285p;

    /* JADX INFO: renamed from: q */
    public ArrayList f4286q;

    /* JADX INFO: renamed from: r */
    public ArrayList f4287r;

    /* JADX INFO: renamed from: h */
    public static void m2392h(ArrayList r2) {
        int r0 = r2.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((AbstractC1166o) r2.get(r0)).itemView.animate().cancel();
        r0 = r0 - 1;
        goto L3
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: a */
    public final boolean mo2246a(AbstractC1166o r10, AbstractC1166o r11, C2208lv r12, C2208lv r13) {
        int r2 = r12.f7695a;
        int r3 = r12.f7696b;
        if (r11.shouldIgnore() == false) goto L5;
        int r132 = r12.f7695a;
        int r5 = r12.f7696b;
        int r4 = r132;
    L6:
        if (r10 == r11) goto L8;
        float r102 = r10.itemView.getTranslationX();
        float r122 = r10.itemView.getTranslationY();
        float r133 = r10.itemView.getAlpha();
        m2397l(r10);
        int r6 = (int) ((r4 - r2) - r102);
        int r7 = (int) ((r5 - r3) - r122);
        r10.itemView.setTranslationX(r102);
        r10.itemView.setTranslationY(r122);
        r10.itemView.setAlpha(r133);
        m2397l(r11);
        r11.itemView.setTranslationX(-r6);
        r11.itemView.setTranslationY(-r7);
        r11.itemView.setAlpha(0.0f);
        ArrayList r103 = this.f4280k;
        C1138ad r123 = new C1138ad();
        r123.f3593a = r10;
        r123.f3594b = r11;
        r123.f3595c = r2;
        r123.f3596d = r3;
        r123.f3597e = r4;
        r123.f3598f = r5;
        r103.add(r123);
        return true;
    L8:
        return m2393g(r10, r2, r3, r4, r5);
    L5:
        r4 = r13.f7695a;
        r5 = r13.f7696b;
        goto L6
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: d */
    public final void mo2248d(AbstractC1166o r10) {
        ArrayList r0 = this.f4281l;
        ArrayList r1 = this.f4282m;
        ArrayList r2 = this.f4283n;
        View r3 = r10.itemView;
        r3.animate().cancel();
        ArrayList r4 = this.f4279j;
        int r5 = r4.size();
    L3:
        r5 = r5 - 1;
        if (r5 < 0) goto L9;
        if (((C1218bd) r4.get(r5)).f4152a != r10) goto L3;
        r3.setTranslationY(0.0f);
        r3.setTranslationX(0.0f);
        m2247c(r10);
        r4.remove(r5);
        goto L3
    L9:
        m2395j(this.f4280k, r10);
        if (this.f4277h.remove(r10) == false) goto L13;
        r3.setAlpha(1.0f);
        m2247c(r10);
    L13:
        if (this.f4278i.remove(r10) == false) goto L15;
        r3.setAlpha(1.0f);
        m2247c(r10);
    L15:
        int r42 = r2.size() - 1;
    L16:
        if (r42 < 0) goto L21;
        ArrayList r7 = (ArrayList) r2.get(r42);
        m2395j(r7, r10);
        if (r7.isEmpty() == false) goto L20;
        r2.remove(r42);
    L20:
        r42 = r42 - 1;
        goto L16
    L21:
        int r22 = r1.size() - 1;
    L22:
        if (r22 < 0) goto L32;
        ArrayList r43 = (ArrayList) r1.get(r22);
        int r72 = r43.size() - 1;
    L24:
        if (r72 < 0) goto L31;
        if (((C1218bd) r43.get(r72)).f4152a == r10) goto L27;
        r72 = r72 - 1;
        goto L24
    L27:
        r3.setTranslationY(0.0f);
        r3.setTranslationX(0.0f);
        m2247c(r10);
        r43.remove(r72);
        if (r43.isEmpty() == false) goto L31;
        r1.remove(r22);
    L31:
        r22 = r22 - 1;
        goto L22
    L32:
        int r12 = r0.size() - 1;
    L33:
        if (r12 < 0) goto L40;
        ArrayList r23 = (ArrayList) r0.get(r12);
        if (r23.remove(r10) == false) goto L39;
        r3.setAlpha(1.0f);
        m2247c(r10);
        if (r23.isEmpty() == false) goto L39;
        r0.remove(r12);
    L39:
        r12 = r12 - 1;
        goto L33
    L40:
        this.f4286q.remove(r10);
        this.f4284o.remove(r10);
        this.f4287r.remove(r10);
        this.f4285p.remove(r10);
        m2394i();
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: e */
    public final void mo2249e() {
        ArrayList r0 = this.f4283n;
        ArrayList r1 = this.f4281l;
        ArrayList r2 = this.f4282m;
        ArrayList r3 = this.f4280k;
        ArrayList r4 = this.f4278i;
        ArrayList r5 = this.f4277h;
        ArrayList r6 = this.f4279j;
        int r7 = r6.size();
    L3:
        r7 = r7 - 1;
        if (r7 < 0) goto L6;
        C1218bd r9 = (C1218bd) r6.get(r7);
        View r10 = r9.f4152a.itemView;
        r10.setTranslationY(0.0f);
        r10.setTranslationX(0.0f);
        m2247c(r9.f4152a);
        r6.remove(r7);
        goto L3
    L6:
        int r62 = r5.size() - 1;
    L7:
        if (r62 < 0) goto L9;
        m2247c((AbstractC1166o) r5.get(r62));
        r5.remove(r62);
        r62 = r62 - 1;
        goto L7
    L9:
        int r52 = r4.size();
    L10:
        r52 = r52 - 1;
        if (r52 < 0) goto L13;
        AbstractC1166o r72 = (AbstractC1166o) r4.get(r52);
        r72.itemView.setAlpha(1.0f);
        m2247c(r72);
        r4.remove(r52);
        goto L10
    L13:
        int r42 = r3.size() - 1;
    L14:
        if (r42 < 0) goto L22;
        C1138ad r53 = (C1138ad) r3.get(r42);
        AbstractC1166o r73 = r53.f3593a;
        if (r73 == null) goto L18;
        m2396k(r53, r73);
    L18:
        AbstractC1166o r74 = r53.f3594b;
        if (r74 == null) goto L21;
        m2396k(r53, r74);
    L21:
        r42 = r42 - 1;
        goto L14
    L22:
        r3.clear();
        if (mo2250f() == true) goto L25;
        return;
    L25:
        int r32 = r2.size() - 1;
    L26:
        if (r32 < 0) goto L34;
        ArrayList r43 = (ArrayList) r2.get(r32);
        int r54 = r43.size() - 1;
    L28:
        if (r54 < 0) goto L33;
        C1218bd r75 = (C1218bd) r43.get(r54);
        View r92 = r75.f4152a.itemView;
        r92.setTranslationY(0.0f);
        r92.setTranslationX(0.0f);
        m2247c(r75.f4152a);
        r43.remove(r54);
        if (r43.isEmpty() == false) goto L32;
        r2.remove(r43);
    L32:
        r54 = r54 - 1;
        goto L28
    L33:
        r32 = r32 - 1;
        goto L26
    L34:
        int r22 = r1.size() - 1;
    L35:
        if (r22 < 0) goto L43;
        ArrayList r33 = (ArrayList) r1.get(r22);
        int r44 = r33.size() - 1;
    L37:
        if (r44 < 0) goto L42;
        AbstractC1166o r55 = (AbstractC1166o) r33.get(r44);
        r55.itemView.setAlpha(1.0f);
        m2247c(r55);
        r33.remove(r44);
        if (r33.isEmpty() == false) goto L41;
        r1.remove(r33);
    L41:
        r44 = r44 - 1;
        goto L37
    L42:
        r22 = r22 - 1;
        goto L35
    L43:
        int r12 = r0.size() - 1;
    L44:
        if (r12 < 0) goto L58;
        ArrayList r23 = (ArrayList) r0.get(r12);
        int r34 = r23.size() - 1;
    L46:
        if (r34 < 0) goto L57;
        C1138ad r45 = (C1138ad) r23.get(r34);
        AbstractC1166o r56 = r45.f3593a;
        if (r56 == null) goto L50;
        m2396k(r45, r56);
    L50:
        AbstractC1166o r57 = r45.f3594b;
        if (r57 == null) goto L54;
        m2396k(r45, r57);
    L54:
        if (r23.isEmpty() == false) goto L56;
        r0.remove(r23);
    L56:
        r34 = r34 - 1;
        goto L46
    L57:
        r12 = r12 - 1;
        goto L44
    L58:
        m2392h(this.f4286q);
        m2392h(this.f4285p);
        m2392h(this.f4284o);
        m2392h(this.f4287r);
        ArrayList r02 = this.f4034b;
        if (r02.size() > 0) goto L62;
        r02.clear();
        return;
    L62:
        r02.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: f */
    public final boolean mo2250f() {
        if (this.f4278i.isEmpty() == true) goto L5;
        return true;
    L5:
        if (this.f4280k.isEmpty() == true) goto L7;
        return true;
    L7:
        if (this.f4279j.isEmpty() == true) goto L9;
        return true;
    L9:
        if (this.f4277h.isEmpty() == true) goto L11;
        return true;
    L11:
        if (this.f4285p.isEmpty() == true) goto L13;
        return true;
    L13:
        if (this.f4286q.isEmpty() == true) goto L15;
        return true;
    L15:
        if (this.f4284o.isEmpty() == true) goto L17;
        return true;
    L17:
        if (this.f4287r.isEmpty() == true) goto L19;
        return true;
    L19:
        if (this.f4282m.isEmpty() == true) goto L21;
        return true;
    L21:
        if (this.f4281l.isEmpty() == true) goto L23;
        return true;
    L23:
        if (this.f4283n.isEmpty() == false) goto L38;
        return false;
    L38:
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2393g(AbstractC1166o r4, int r5, int r6, int r7, int r8) {
        View r0 = r4.itemView;
        int r52 = r5 + ((int) r0.getTranslationX());
        int r62 = r6 + ((int) r4.itemView.getTranslationY());
        m2397l(r4);
        int r1 = r7 - r52;
        int r2 = r8 - r62;
        if (r1 != 0) goto L7;
        if (r2 != 0) goto L7;
        m2247c(r4);
        return false;
    L7:
        if (r1 == 0) goto L9;
        r0.setTranslationX(-r1);
    L9:
        if (r2 == 0) goto L11;
        r0.setTranslationY(-r2);
    L11:
        ArrayList r02 = this.f4279j;
        C1218bd r12 = new C1218bd();
        r12.f4152a = r4;
        r12.f4153b = r52;
        r12.f4154c = r62;
        r12.f4155d = r7;
        r12.f4156e = r8;
        r02.add(r12);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2394i() {
        if (mo2250f() == true) goto L10;
        ArrayList r0 = this.f4034b;
        if (r0.size() > 0) goto L8;
        r0.clear();
        return;
    L8:
        r0.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: j */
    public final void m2395j(ArrayList r4, AbstractC1166o r5) {
        int r0 = r4.size() - 1;
    L3:
        if (r0 < 0) goto L12;
        C1138ad r1 = (C1138ad) r4.get(r0);
        if (m2396k(r1, r5) == false) goto L11;
        if (r1.f3593a != null) goto L11;
        if (r1.f3594b != null) goto L11;
        r4.remove(r1);
    L11:
        r0 = r0 - 1;
        goto L3
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2396k(C1138ad r3, AbstractC1166o r4) {
        if (r3.f3594b != r4) goto L6;
        r3.f3594b = null;
    L8:
        r4.itemView.setAlpha(1.0f);
        r4.itemView.setTranslationX(0.0f);
        r4.itemView.setTranslationY(0.0f);
        m2247c(r4);
        return true;
    L6:
        if (r3.f3593a != r4) goto L10;
        r3.f3593a = null;
        goto L8
    L10:
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m2397l(AbstractC1166o r3) {
        if (f4275s != null) goto L5;
        f4275s = new ValueAnimator().getInterpolator();
    L5:
        r3.itemView.animate().setInterpolator(f4275s);
        mo2248d(r3);
    }
}
