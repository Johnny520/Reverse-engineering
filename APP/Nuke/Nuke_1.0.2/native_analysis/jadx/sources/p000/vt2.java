package p000;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vt2 extends f50 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f12171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt2(int i, Class cls) {
        super(cls);
        this.f12171b = i;
    }

    @Override // p000.f50
    /* JADX INFO: renamed from: a */
    public final Date mo1254a(Date date) {
        switch (this.f12171b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
