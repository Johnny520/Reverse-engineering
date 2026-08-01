package p000;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* JADX INFO: renamed from: nd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0351nd implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteBuffer f605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0367od f606b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0351nd(AbstractC0367od abstractC0367od, ByteBuffer byteBuffer) {
        this.f606b = abstractC0367od;
        this.f605a = byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f606b.keysCompare((Integer) obj, (Integer) obj2, this.f605a);
    }
}
