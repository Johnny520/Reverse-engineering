package kotlin.text;

import androidx.window.area.AbstractC3400;
import bsh.C3466;
import java.util.Iterator;
import kotlin.Pair;
import p064.C7348;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5963 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15022;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7348 f15023;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C5962 f15024;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f15027 = -1;

    public C5963(C5962 c5962) {
        this.f15024 = c5962;
        int iM5650 = AbstractC3400.m5650(0, 0, c5962.f15021.length());
        this.f15025 = iM5650;
        this.f15026 = iM5650;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15027 == -1) {
            m10684();
        }
        return this.f15027 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15027 == -1) {
            m10684();
        }
        if (this.f15027 == 0) {
            C3466.m5896();
            return null;
        }
        C7348 c7348 = this.f15023;
        c7348.getClass();
        this.f15023 = null;
        this.f15027 = -1;
        return c7348;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10684() {
        Pair pair;
        C5962 c5962 = this.f15024;
        CharSequence charSequence = c5962.f15021;
        int i = this.f15026;
        if (i < 0) {
            this.f15027 = 0;
            this.f15023 = null;
            return;
        }
        int i2 = c5962.f15020;
        if (i2 > 0) {
            int i3 = this.f15022 + 1;
            this.f15022 = i3;
            if (i3 >= i2) {
                this.f15023 = new C7348(this.f15025, AbstractC5976.m10717(charSequence), 1);
                this.f15026 = -1;
            } else if (i <= charSequence.length() && (pair = (Pair) c5962.f15019.invoke(charSequence, Integer.valueOf(this.f15026))) != null) {
                int iIntValue = ((Number) pair.component1()).intValue();
                int iIntValue2 = ((Number) pair.component2()).intValue();
                this.f15023 = AbstractC3400.m5627(this.f15025, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f15025 = i4;
                this.f15026 = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f15023 = new C7348(this.f15025, AbstractC5976.m10717(charSequence), 1);
                this.f15026 = -1;
            }
        }
        this.f15027 = 1;
    }
}
