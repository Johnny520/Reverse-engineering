package androidx.transition;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.AbstractC1235e;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0003A2;
import p000a.C0108Ff;

/* JADX INFO: renamed from: androidx.transition.h */
/* JADX INFO: loaded from: classes.dex */
public class C1238h extends AbstractC1235e {

    /* JADX INFO: renamed from: E */
    public int f5283E;

    /* JADX INFO: renamed from: C */
    public ArrayList<AbstractC1235e> f5281C = new ArrayList<>();

    /* JADX INFO: renamed from: D */
    public boolean f5282D = true;

    /* JADX INFO: renamed from: F */
    public boolean f5284F = false;

    /* JADX INFO: renamed from: G */
    public int f5285G = 0;

    /* JADX INFO: renamed from: androidx.transition.h$a */
    public class a extends C1236f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1235e f5286a;

        public a(AbstractC1235e abstractC1235e) {
            this.f5286a = abstractC1235e;
        }

        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: f */
        public final void mo3022f(AbstractC1235e abstractC1235e) {
            this.f5286a.mo3030A();
            abstractC1235e.mo3058y(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.h$b */
    public class b extends C1236f {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: e */
        public final void mo3021e(AbstractC1235e abstractC1235e) {
            C1238h c1238h = C1238h.this;
            c1238h.f5281C.remove(abstractC1235e);
            if (c1238h.mo3052s()) {
                return;
            }
            c1238h.m3055v(c1238h, AbstractC1235e.g.f5271c, false);
            c1238h.f5255r = true;
            c1238h.m3055v(c1238h, AbstractC1235e.g.f5270b, false);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.h$c */
    public static class c extends C1236f {

        /* JADX INFO: renamed from: a */
        public C1238h f5288a;

        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: d */
        public final void mo3027d(AbstractC1235e abstractC1235e) {
            C1238h c1238h = this.f5288a;
            if (c1238h.f5284F) {
                return;
            }
            c1238h.m3038I();
            c1238h.f5284F = true;
        }

        @Override // androidx.transition.C1236f, androidx.transition.AbstractC1235e.f
        /* JADX INFO: renamed from: f */
        public final void mo3022f(AbstractC1235e abstractC1235e) {
            C1238h c1238h = this.f5288a;
            int i = c1238h.f5283E - 1;
            c1238h.f5283E = i;
            if (i == 0) {
                c1238h.f5284F = false;
                c1238h.m3048m();
            }
            abstractC1235e.mo3058y(this);
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: A */
    public final void mo3030A() {
        if (this.f5281C.isEmpty()) {
            m3038I();
            m3048m();
            return;
        }
        c cVar = new c();
        cVar.f5288a = this;
        Iterator<AbstractC1235e> it = this.f5281C.iterator();
        while (it.hasNext()) {
            it.next().m3040a(cVar);
        }
        this.f5283E = this.f5281C.size();
        if (this.f5282D) {
            Iterator<AbstractC1235e> it2 = this.f5281C.iterator();
            while (it2.hasNext()) {
                it2.next().mo3030A();
            }
            return;
        }
        for (int i = 1; i < this.f5281C.size(); i++) {
            this.f5281C.get(i - 1).m3040a(new a(this.f5281C.get(i)));
        }
        AbstractC1235e abstractC1235e = this.f5281C.get(0);
        if (abstractC1235e != null) {
            abstractC1235e.mo3030A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3031B(long j, long j2) {
        long j3;
        long j4 = this.f5260w;
        long j5 = 0;
        if (this.f5246i != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.f5255r = false;
            m3055v(this, AbstractC1235e.g.f5269a, z);
        }
        if (!this.f5282D) {
            int size = 1;
            while (true) {
                if (size >= this.f5281C.size()) {
                    size = this.f5281C.size();
                    break;
                } else if (this.f5281C.get(size).f5261x > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (i < this.f5281C.size()) {
                    AbstractC1235e abstractC1235e = this.f5281C.get(i);
                    long j6 = abstractC1235e.f5261x;
                    j3 = j5;
                    long j7 = j - j6;
                    if (j7 < j3) {
                        break;
                    }
                    abstractC1235e.mo3031B(j7, j2 - j6);
                    i++;
                    j5 = j3;
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    AbstractC1235e abstractC1235e2 = this.f5281C.get(i);
                    long j8 = abstractC1235e2.f5261x;
                    long j9 = j - j8;
                    abstractC1235e2.mo3031B(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.f5246i == null) {
                if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.f5255r = true;
                }
                m3055v(this, AbstractC1235e.g.f5270b, z);
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.f5281C.size(); i2++) {
            this.f5281C.get(i2).mo3031B(j, j2);
        }
        j3 = j5;
        if (this.f5246i == null) {
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: C */
    public final void mo3032C(long j) {
        ArrayList<AbstractC1235e> arrayList;
        this.f5240c = j;
        if (j < 0 || (arrayList = this.f5281C) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f5281C.get(i).mo3032C(j);
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: D */
    public final void mo3033D(AbstractC1235e.c cVar) {
        this.f5285G |= 8;
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            this.f5281C.get(i).mo3033D(cVar);
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: E */
    public final void mo3034E(TimeInterpolator timeInterpolator) {
        this.f5285G |= 1;
        ArrayList<AbstractC1235e> arrayList = this.f5281C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5281C.get(i).mo3034E(timeInterpolator);
            }
        }
        this.f5241d = timeInterpolator;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: F */
    public final void mo3035F(AbstractC1235e.a aVar) {
        super.mo3035F(aVar);
        this.f5285G |= 4;
        if (this.f5281C != null) {
            for (int i = 0; i < this.f5281C.size(); i++) {
                this.f5281C.get(i).mo3035F(aVar);
            }
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: G */
    public final void mo3036G() {
        this.f5285G |= 2;
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            this.f5281C.get(i).mo3036G();
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: H */
    public final void mo3037H(long j) {
        this.f5239b = j;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: J */
    public final String mo3039J(String str) {
        String strMo3039J = super.mo3039J(str);
        for (int i = 0; i < this.f5281C.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo3039J);
            sb.append("\n");
            sb.append(this.f5281C.get(i).mo3039J(str + "  "));
            strMo3039J = sb.toString();
        }
        return strMo3039J;
    }

    /* JADX INFO: renamed from: K */
    public final void m3066K(AbstractC1235e abstractC1235e) {
        this.f5281C.add(abstractC1235e);
        abstractC1235e.f5246i = this;
        long j = this.f5240c;
        if (j >= 0) {
            abstractC1235e.mo3032C(j);
        }
        if ((this.f5285G & 1) != 0) {
            abstractC1235e.mo3034E(this.f5241d);
        }
        if ((this.f5285G & 2) != 0) {
            abstractC1235e.mo3036G();
        }
        if ((this.f5285G & 4) != 0) {
            abstractC1235e.mo3035F(this.f5259v);
        }
        if ((this.f5285G & 8) != 0) {
            abstractC1235e.mo3033D(null);
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: c */
    public final void mo3041c() {
        super.mo3041c();
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            this.f5281C.get(i).mo3041c();
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: d */
    public final void mo3016d(C0108Ff c0108Ff) {
        if (m3054u(c0108Ff.f367b)) {
            for (AbstractC1235e abstractC1235e : this.f5281C) {
                if (abstractC1235e.m3054u(c0108Ff.f367b)) {
                    abstractC1235e.mo3016d(c0108Ff);
                    c0108Ff.f368c.add(abstractC1235e);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: f */
    public final void mo3043f(C0108Ff c0108Ff) {
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            this.f5281C.get(i).mo3043f(c0108Ff);
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: g */
    public final void mo3017g(C0108Ff c0108Ff) {
        if (m3054u(c0108Ff.f367b)) {
            for (AbstractC1235e abstractC1235e : this.f5281C) {
                if (abstractC1235e.m3054u(c0108Ff.f367b)) {
                    abstractC1235e.mo3017g(c0108Ff);
                    c0108Ff.f368c.add(abstractC1235e);
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: j */
    public final AbstractC1235e clone() {
        C1238h c1238h = (C1238h) super.clone();
        c1238h.f5281C = new ArrayList<>();
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            AbstractC1235e abstractC1235eClone = this.f5281C.get(i).clone();
            c1238h.f5281C.add(abstractC1235eClone);
            abstractC1235eClone.f5246i = c1238h;
        }
        return c1238h;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: l */
    public final void mo3047l(FrameLayout frameLayout, C0003A2 c0003a2, C0003A2 c0003a22, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f5239b;
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            AbstractC1235e abstractC1235e = this.f5281C.get(i);
            if (j > 0 && (this.f5282D || i == 0)) {
                long j2 = abstractC1235e.f5239b;
                if (j2 > 0) {
                    abstractC1235e.mo3037H(j2 + j);
                } else {
                    abstractC1235e.mo3037H(j);
                }
            }
            abstractC1235e.mo3047l(frameLayout, c0003a2, c0003a22, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: s */
    public final boolean mo3052s() {
        for (int i = 0; i < this.f5281C.size(); i++) {
            if (this.f5281C.get(i).mo3052s()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: w */
    public final void mo3056w(ViewGroup viewGroup) {
        super.mo3056w(viewGroup);
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            this.f5281C.get(i).mo3056w(viewGroup);
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: x */
    public final void mo3057x() {
        this.f5260w = 0L;
        b bVar = new b();
        for (int i = 0; i < this.f5281C.size(); i++) {
            AbstractC1235e abstractC1235e = this.f5281C.get(i);
            abstractC1235e.m3040a(bVar);
            abstractC1235e.mo3057x();
            long j = abstractC1235e.f5260w;
            if (this.f5282D) {
                this.f5260w = Math.max(this.f5260w, j);
            } else {
                long j2 = this.f5260w;
                abstractC1235e.f5261x = j2;
                this.f5260w = j2 + j;
            }
        }
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: y */
    public final AbstractC1235e mo3058y(AbstractC1235e.f fVar) {
        super.mo3058y(fVar);
        return this;
    }

    @Override // androidx.transition.AbstractC1235e
    /* JADX INFO: renamed from: z */
    public final void mo3059z(FrameLayout frameLayout) {
        super.mo3059z(frameLayout);
        int size = this.f5281C.size();
        for (int i = 0; i < size; i++) {
            this.f5281C.get(i).mo3059z(frameLayout);
        }
    }
}
