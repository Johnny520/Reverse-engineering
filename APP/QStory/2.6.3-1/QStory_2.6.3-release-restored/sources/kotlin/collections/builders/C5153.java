package kotlin.collections.builders;

import androidx.core.view.AbstractC3025;
import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5153 extends AbstractC3025 implements Iterator, InterfaceC7396 {
    @Override // java.util.Iterator
    public final Object next() {
        m4560();
        int i = this.f6812;
        MapBuilder mapBuilder = (MapBuilder) this.f6809;
        if (i >= mapBuilder.length) {
            C3466.m5896();
            return null;
        }
        int i2 = this.f6812;
        this.f6812 = i2 + 1;
        this.f6810 = i2;
        Object[] objArr = mapBuilder.valuesArray;
        objArr.getClass();
        Object obj = objArr[this.f6810];
        m4557();
        return obj;
    }
}
