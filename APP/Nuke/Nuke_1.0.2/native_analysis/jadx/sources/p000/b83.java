package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b83 implements jh1 {

    /* JADX INFO: renamed from: b */
    public static final b83 f738b = new b83(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f739a;

    public /* synthetic */ b83(int i) {
        this.f739a = i;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final boolean mo235a(Object obj) {
        switch (this.f739a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        switch (this.f739a) {
            case 0:
                return new ih1(new is1(obj), new C0173eo(1, obj));
            case 1:
                File file = (File) obj;
                return new ih1(new is1(file), new C0173eo(0, file));
            default:
                return null;
        }
    }
}
