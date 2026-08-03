package ba;

import android.graphics.Bitmap;
import android.graphics.Rect;
import gg.AbstractC1416l;
import java.util.Arrays;

/* JADX INFO: renamed from: ba.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0235o {

    /* JADX INFO: renamed from: a */
    public final Bitmap f619a;

    /* JADX INFO: renamed from: b */
    public final byte[] f620b;

    /* JADX INFO: renamed from: c */
    public final Rect f621c;

    /* JADX INFO: renamed from: d */
    public final int f622d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0235o(Bitmap bitmap, byte[] bArr, Rect rect, int i9) {
        this.f619a = bitmap;
        this.f620b = bArr;
        this.f621c = rect;
        this.f622d = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0235o)) {
            return false;
        }
        C0235o c0235o = (C0235o) obj;
        return this.f619a.equals(c0235o.f619a) && AbstractC1416l.m3825a(this.f620b, c0235o.f620b) && AbstractC1416l.m3825a(this.f621c, c0235o.f621c) && this.f622d == c0235o.f622d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f619a.hashCode() * 31;
        byte[] bArr = this.f620b;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Rect rect = this.f621c;
        return Integer.hashCode(this.f622d) + ((iHashCode2 + (rect != null ? rect.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BubbleAsset(bitmap=" + this.f619a + ", ninePatchChunk=" + Arrays.toString(this.f620b) + ", padding=" + this.f621c + ", textColor=" + this.f622d + ")";
    }
}
