package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pi0 extends l01 {

    /* JADX INFO: renamed from: j */
    public final Field f8357j;

    public pi0(Field field) {
        this.f8357j = field;
    }

    @Override // p000.AbstractC0738tl
    /* JADX INFO: renamed from: H */
    public final Member mo2762H() {
        return this.f8357j;
    }

    @Override // p000.l01
    /* JADX INFO: renamed from: f0 */
    public final l01 mo2782f0(Object obj) {
        m2781e0(obj);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public final Object m3867g0() {
        m5328R();
        return this.f8357j.get(this.f5866i);
    }
}
