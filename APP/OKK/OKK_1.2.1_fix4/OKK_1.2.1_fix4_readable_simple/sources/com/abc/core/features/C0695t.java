package com.abc.core.features;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.lang.reflect.Method;
import java.util.Comparator;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0695t implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2195b;

    public /* synthetic */ C0695t(int r1, Object r2) {
        this.f2194a = r1;
        this.f2195b = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        switch(this.f2194a) {
            case 0: goto L27;
            case 1: goto L22;
            case 2: goto L17;
            case 3: goto L12;
            default: goto L4;
        };
    L4:
        MaterialButton r32 = (MaterialButton) r3;
        MaterialButton r42 = (MaterialButton) r4;
        int r02 = Boolean.valueOf(r32.f2350o).compareTo(Boolean.valueOf(r42.f2350o));
        if (r02 != 0) goto L32;
        int r03 = Boolean.valueOf(r32.isPressed()).compareTo(Boolean.valueOf(r42.isPressed()));
        if (r03 != 0) goto L33;
        MaterialButtonToggleGroup r04 = (MaterialButtonToggleGroup) this.f2195b;
        return Integer.valueOf(r04.indexOfChild(r32)).compareTo(Integer.valueOf(r04.indexOfChild(r42)));
    L33:
        return r03;
    L32:
        return r02;
    L12:
        int r05 = ((Comparator) this.f2195b).compare(r3, r4);
        if (r05 == 0) goto L16;
        return r05;
    L16:
        return AbstractC0040p.m112q(Integer.valueOf(((Method) r3).getName().length()), Integer.valueOf(((Method) r4).getName().length()));
    L17:
        int r06 = ((Comparator) this.f2195b).compare(r3, r4);
        if (r06 == 0) goto L21;
        return r06;
    L21:
        return AbstractC0040p.m112q(Integer.valueOf(((Method) r3).getParameterTypes().length), Integer.valueOf(((Method) r4).getParameterTypes().length));
    L22:
        int r07 = ((Comparator) this.f2195b).compare(r3, r4);
        if (r07 == 0) goto L26;
        return r07;
    L26:
        return AbstractC0040p.m112q(Boolean.valueOf(AbstractC0307g.m699a(((Method) r4).getName(), "init")), Boolean.valueOf(AbstractC0307g.m699a(((Method) r3).getName(), "init")));
    L27:
        int r08 = ((Comparator) this.f2195b).compare(r3, r4);
        if (r08 == 0) goto L31;
        return r08;
    L31:
        return AbstractC0040p.m112q(Integer.valueOf(((Method) r3).getName().length()), Integer.valueOf(((Method) r4).getName().length()));
    }
}
