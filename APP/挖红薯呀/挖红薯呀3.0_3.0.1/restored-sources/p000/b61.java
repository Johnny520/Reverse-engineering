package p000;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b61 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteBuffer f428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c61 f429b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b61(c61 c61Var, ByteBuffer byteBuffer) {
        this.f429b = c61Var;
        this.f428a = byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f429b.keysCompare((Integer) obj, (Integer) obj2, this.f428a);
    }
}
