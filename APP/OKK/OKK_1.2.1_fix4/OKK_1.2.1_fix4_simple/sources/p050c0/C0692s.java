package p050c0;

import java.lang.reflect.Method;
import java.util.Comparator;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0692s implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2186a;

    public /* synthetic */ C0692s(int r1) {
        this.f2186a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r5, Object r6) {
        switch(this.f2186a) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L8;
            case 3: goto L7;
            default: goto L5;
        };
    L8:
        Method r62 = (Method) r6;
        String r02 = r62.getName();
        AbstractC0307g.m702d(r02, "getName(...)");
        int r2 = r62.getParameterTypes().length;
        C0639a0 r3 = C0639a0.f1967a;
        Integer r63 = Integer.valueOf(AbstractC0358S.m876a0(r02, r2, C0639a0.m1564U(r62)));
        Method r52 = (Method) r5;
        String r03 = r52.getName();
        AbstractC0307g.m702d(r03, "getName(...)");
        return AbstractC0040p.m112q(r63, Integer.valueOf(AbstractC0358S.m876a0(r03, r52.getParameterTypes().length, C0639a0.m1564U(r52))));
    L5:
        return AbstractC0040p.m112q(Integer.valueOf(((Method) r5).getParameterTypes().length), Integer.valueOf(((Method) r6).getParameterTypes().length));
    L7:
        return AbstractC0040p.m112q(Integer.valueOf(((Method) r5).getParameterTypes().length), Integer.valueOf(((Method) r6).getParameterTypes().length));
    L11:
        return AbstractC0040p.m112q(Integer.valueOf(((Method) r5).getName().length()), Integer.valueOf(((Method) r6).getName().length()));
    L13:
        return AbstractC0040p.m112q(Boolean.valueOf(AbstractC0307g.m699a(((Method) r6).getName(), "initView")), Boolean.valueOf(AbstractC0307g.m699a(((Method) r5).getName(), "initView")));
    }
}
