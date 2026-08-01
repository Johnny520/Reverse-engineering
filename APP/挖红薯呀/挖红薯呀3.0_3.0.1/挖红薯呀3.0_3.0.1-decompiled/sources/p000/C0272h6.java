package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: h6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0272h6 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2148a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b60.<clinit>():void, c6.a():float, j6.<init>(android.view.View):void, o30.<clinit>():void, pf1.<clinit>():void] */
    public /* synthetic */ C0272h6(int i) {
        this.f2148a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2148a) {
            case 0:
                return p30.m3008r(((ms0) obj2).f4030a, ((ms0) obj).f4030a);
            case 1:
                return p30.m3008r(((x30) obj).f7254b, ((x30) obj2).f7254b);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 3:
                uo0 uo0Var = (uo0) obj;
                uo0 uo0Var2 = (uo0) obj2;
                return (((Number) uo0Var.f6275e).intValue() - ((Number) uo0Var.f6274d).intValue()) - (((Number) uo0Var2.f6275e).intValue() - ((Number) uo0Var2.f6274d).intValue());
            case 4:
                b60 b60Var = (b60) obj;
                b60 b60Var2 = (b60) obj2;
                float f = b60Var.f396J.f1607p.f7088G;
                float f2 = b60Var2.f396J.f1607p.f7088G;
                return f == f2 ? p30.m3008r(b60Var.m316w(), b60Var2.m316w()) : Float.compare(f, f2);
            default:
                return p30.m3008r(((w80) obj).f7031a, ((w80) obj2).f7031a);
        }
    }
}
