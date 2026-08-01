package kotlin.collections.builders;

import androidx.core.view.AbstractC2192;
import bsh.C2633;
import java.util.Iterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4313 extends AbstractC2192 implements Iterator, InterfaceC6567 {
    @Override // java.util.Iterator
    public final Object next() {
        m4000();
        int i = this.f6467;
        MapBuilder mapBuilder = (MapBuilder) this.f6464;
        if (i >= mapBuilder.length) {
            C2633.m5336();
            return null;
        }
        int i2 = this.f6467;
        this.f6467 = i2 + 1;
        this.f6465 = i2;
        Object obj = mapBuilder.keysArray[this.f6465];
        m3997();
        return obj;
    }
}
