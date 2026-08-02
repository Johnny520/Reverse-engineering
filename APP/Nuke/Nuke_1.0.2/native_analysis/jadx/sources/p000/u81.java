package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u81 extends z32 implements v41, xm0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f11129o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u81(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f11129o = i2;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f11129o;
        Object obj = this.f963i;
        switch (i) {
            case 0:
                return ((gu2) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }

    @Override // p000.AbstractC0063bp
    /* JADX INFO: renamed from: d */
    public final p41 mo581d() {
        d72.f1901a.getClass();
        return this;
    }
}
