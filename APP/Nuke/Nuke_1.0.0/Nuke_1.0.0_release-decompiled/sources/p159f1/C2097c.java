package p159f1;

import java.util.Arrays;
import p110W0.C1577b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: f1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2097c implements InterfaceC2095a {

    /* JADX INFO: renamed from: a */
    public final float[] f7025a;

    /* JADX INFO: renamed from: b */
    public final float[] f7026b;

    public C2097c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f7025a = fArr;
        this.f7026b = fArr2;
    }

    @Override // p159f1.InterfaceC2095a
    /* JADX INFO: renamed from: a */
    public final float mo3706a(float f2) {
        return C1577b.m2843i(f2, this.f7026b, this.f7025a);
    }

    @Override // p159f1.InterfaceC2095a
    /* JADX INFO: renamed from: b */
    public final float mo3707b(float f2) {
        return C1577b.m2843i(f2, this.f7025a, this.f7026b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2097c)) {
            return false;
        }
        C2097c c2097c = (C2097c) obj;
        return Arrays.equals(this.f7025a, c2097c.f7025a) && Arrays.equals(this.f7026b, c2097c.f7026b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7026b) + (Arrays.hashCode(this.f7025a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f7025a);
        AbstractC1665j.m2984d(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f7026b);
        AbstractC1665j.m2984d(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
