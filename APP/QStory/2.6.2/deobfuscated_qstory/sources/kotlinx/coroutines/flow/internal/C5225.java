package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.C5359;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5225 extends C5359 {
    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean mo10302(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m10569(th);
    }
}
