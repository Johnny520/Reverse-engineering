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

    public C1214bG(Object obj, String str, Function2 function2) {
        AbstractC0295Gu.m625r(-820085350463541L);
        AbstractC0295Gu.m625r(-820102530332725L);
        this.f4146a = obj;
        this.f4147b = str;
        this.f4148c = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1214bG)) {
            return false;
        }
        C1214bG c1214bG = (C1214bG) obj;
        return AbstractC0585Nj.m1134a(this.f4146a, c1214bG.f4146a) && AbstractC0585Nj.m1134a(this.f4147b, c1214bG.f4147b) && AbstractC0585Nj.m1134a(this.f4148c, c1214bG.f4148c);
    }

    public final int hashCode() {
        Object obj = this.f4146a;
        return this.f4148c.hashCode() + AbstractC2374ph.m4810g(this.f4147b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-820179839744053L));
        sb.append(this.f4146a);
        sb.append(AbstractC0295Gu.m625r(-819694508439605L));
        AbstractC2374ph.m4817n(sb, this.f4147b, -819724573210677L);
        sb.append(this.f4148c);
        sb.append(')');
        return sb.toString();
    }
}
