package p093v;

import java.util.Comparator;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1016a implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            byte b2 = bArr2[i2];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}
