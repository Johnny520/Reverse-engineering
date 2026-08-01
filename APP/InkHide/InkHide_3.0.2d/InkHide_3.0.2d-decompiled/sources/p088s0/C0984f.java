package p088s0;

import android.graphics.Bitmap;
import android.util.LruCache;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: s0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0984f extends LruCache {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3524a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0984f(int i2, int i3) {
        super(i2);
        this.f3524a = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.f3524a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj2;
                AbstractC0223g.m418e((String) obj, "key");
                AbstractC0223g.m418e(bitmap, "value");
                return bitmap.getByteCount();
            default:
                Bitmap bitmap2 = (Bitmap) obj2;
                AbstractC0223g.m418e((String) obj, "key");
                AbstractC0223g.m418e(bitmap2, "value");
                return bitmap2.getByteCount();
        }
    }
}
