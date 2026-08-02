package p000;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ut2 extends q43 {

    /* JADX INFO: renamed from: b */
    public static final tt2 f11478b = new tt2();

    /* JADX INFO: renamed from: a */
    public final q43 f11479a;

    public ut2(q43 q43Var) {
        this.f11479a = q43Var;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) {
        Date date = (Date) this.f11479a.mo97b(l41Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) {
        this.f11479a.mo98c(o41Var, (Timestamp) obj);
    }
}
