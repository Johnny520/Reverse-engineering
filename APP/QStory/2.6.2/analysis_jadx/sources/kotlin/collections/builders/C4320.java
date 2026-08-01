package kotlin.collections.builders;

import androidx.core.view.AbstractC2192;
import bsh.C2632;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4320 extends AbstractC2192 implements Iterator, InterfaceC6566 {
    @Override // java.util.Iterator
    public final Object next() {
        m3990();
        int i = this.f6466;
        MapBuilder mapBuilder = (MapBuilder) this.f6463;
        if (i >= mapBuilder.length) {
            C2632.m5291();
            return null;
        }
        int i2 = this.f6466;
        this.f6466 = i2 + 1;
        this.f6464 = i2;
        Object[] objArr = mapBuilder.valuesArray;
        objArr.getClass();
        Object obj = objArr[this.f6464];
        m3987();
        return obj;
    }
}
