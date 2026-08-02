package p000;

import java.io.File;

/* JADX INFO: renamed from: ao */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0025ao implements jh1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f311a;

    /* JADX INFO: renamed from: b */
    public final Object f312b;

    public /* synthetic */ C0025ao(int i, Object obj) {
        this.f311a = i;
        this.f312b = obj;
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: a */
    public final boolean mo235a(Object obj) {
        switch (this.f311a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p000.jh1
    /* JADX INFO: renamed from: b */
    public final ih1 mo236b(Object obj, int i, int i2, ov1 ov1Var) {
        int i3 = this.f311a;
        Object obj2 = this.f312b;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new ih1(new is1(bArr), new tf1(1, bArr, (C0953z8) obj2));
            case 1:
                return new ih1(new is1(obj), new tf1((C0953z8) obj2, obj.toString()));
            default:
                File file = (File) obj;
                return new ih1(new is1(file), new ti0(file, (ui0) obj2, 0));
        }
    }
}
