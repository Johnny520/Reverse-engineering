package p000;

import android.content.Context;

/* JADX INFO: renamed from: t8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0725t8 {

    /* JADX INFO: renamed from: a */
    public final Context f10599a;

    /* JADX INFO: renamed from: b */
    public final e70 f10600b;

    /* JADX INFO: renamed from: c */
    public final long f10601c;

    /* JADX INFO: renamed from: d */
    public final jw1 f10602d;

    public C0725t8(Context context, e70 e70Var, long j, jw1 jw1Var) {
        this.f10599a = context;
        this.f10600b = e70Var;
        this.f10601c = j;
        this.f10602d = jw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0725t8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C0725t8 c0725t8 = (C0725t8) obj;
        return t11.m5086l(this.f10599a, c0725t8.f10599a) && t11.m5086l(this.f10600b, c0725t8.f10600b) && C0363ju.m2566c(this.f10601c, c0725t8.f10601c) && t11.m5086l(this.f10602d, c0725t8.f10602d);
    }

    public final int hashCode() {
        int iHashCode = (this.f10600b.hashCode() + (this.f10599a.hashCode() * 31)) * 31;
        int i = C0363ju.f5218h;
        return this.f10602d.hashCode() + hk1.m2204c(iHashCode, 31, this.f10601c);
    }
}
