package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: bG */
/* JADX INFO: loaded from: classes.dex */
public final class C1214bG {

    /* JADX INFO: renamed from: a */
    public Object f4146a;

    /* JADX INFO: renamed from: b */
    public final String f4147b;

    /* JADX INFO: renamed from: c */
    public final Function2 f4148c;

    public C1214bG(Object r3, String r4, Function2 r5) {
        AbstractC0295Gu.m625r(-820085350463541L);
        AbstractC0295Gu.m625r(-820102530332725L);
        this.f4146a = r3;
        this.f4147b = r4;
        this.f4148c = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1214bG) == true) goto L8;
        return false;
    L8:
        C1214bG r52 = (C1214bG) r5;
        if (AbstractC0585Nj.m1134a(this.f4146a, r52.f4146a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f4147b, r52.f4147b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f4148c, r52.f4148c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        Object r0 = this.f4146a;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        String r2 = this.f4147b;
        int r03 = AbstractC2374ph.m4810g(r2, r02 * 31, 31);
        return this.f4148c.hashCode() + r03;
    L5:
        r02 = r0.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-820179839744053L));
        r0.append(this.f4146a);
        r0.append(AbstractC0295Gu.m625r(-819694508439605L));
        AbstractC2374ph.m4817n(r0, this.f4147b, -819724573210677L);
        r0.append(this.f4148c);
        r0.append(')');
        return r0.toString();
    }
}
