package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.C6192;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6058 extends C6192 {
    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean mo10865(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m11131(th);
    }
}
