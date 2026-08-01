package p136j3;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p376zd.C9987e;

/* JADX INFO: renamed from: j3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3592c implements InterfaceC3590a {

    /* JADX INFO: renamed from: c */
    public static final a f9984c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f9985d = 8;

    /* JADX INFO: renamed from: a */
    public final float[] f9986a;

    /* JADX INFO: renamed from: b */
    public final float[] f9987b;

    public C3592c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C9987e.m38645a("Array lengths must match and be nonzero");
            throw null;
        }
        this.f9986a = fArr;
        this.f9987b = fArr2;
    }

    @Override // p136j3.InterfaceC3590a
    /* JADX INFO: renamed from: a */
    public float mo12094a(float f10) {
        return f9984c.m13444b(f10, this.f9987b, this.f9986a);
    }

    @Override // p136j3.InterfaceC3590a
    /* JADX INFO: renamed from: b */
    public float mo12095b(float f10) {
        return f9984c.m13444b(f10, this.f9986a, this.f9987b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3592c)) {
            return false;
        }
        C3592c c3592c = (C3592c) obj;
        return Arrays.equals(this.f9986a, c3592c.f9986a) && Arrays.equals(this.f9987b, c3592c.f9987b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f9986a) * 31) + Arrays.hashCode(this.f9987b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f9986a);
        string.getClass();
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f9987b);
        string2.getClass();
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j3.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final float m13444b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float fM13445a;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fM13445a = fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    f11 = fArr[0];
                    f13 = fArr2[0];
                    f12 = 0.0f;
                } else {
                    f14 = fArr[i11];
                    f11 = fArr[i10];
                    f12 = fArr2[i11];
                    f13 = fArr2[i10];
                }
                fM13445a = C3593d.f9988a.m13445a(f12, f13, f14, f11, fAbs);
            }
            return fSignum * fM13445a;
        }

        public a() {
        }
    }
}
