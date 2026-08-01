package androidx.core.view;

import android.os.Build;
import android.view.View;
import androidx.collection.C0276;
import java.nio.ByteBuffer;
import kotlin.collections.builders.MapBuilder;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f6464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6465;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f6467;

    public AbstractC2192(MapBuilder mapBuilder) {
        this.f6464 = mapBuilder;
        this.f6465 = -1;
        this.f6466 = mapBuilder.modCount;
        m3997();
    }

    public boolean hasNext() {
        return this.f6467 < ((MapBuilder) this.f6464).length;
    }

    public void remove() {
        MapBuilder mapBuilder = (MapBuilder) this.f6464;
        m4000();
        if (this.f6465 == -1) {
            C5925.m11311("Call next() before removing element from the iterator.");
            return;
        }
        mapBuilder.checkIsMutable$kotlin_stdlib();
        mapBuilder.removeEntryAt(this.f6465);
        this.f6465 = -1;
        this.f6466 = mapBuilder.modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m3997() {
        MapBuilder mapBuilder = (MapBuilder) this.f6464;
        while (this.f6467 < mapBuilder.length) {
            int[] iArr = mapBuilder.presenceArray;
            int i = this.f6467;
            if (iArr[i] >= 0) {
                return;
            } else {
                this.f6467 = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo3998(Object obj, View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract Object mo3999(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4000() {
        if (((MapBuilder) this.f6464).modCount == this.f6466) {
            return;
        }
        C0276.m840();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m4001(int i) {
        if (i < this.f6466) {
            return ((ByteBuffer) this.f6464).getShort(this.f6465 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract boolean mo4002(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m4003(Object obj, View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f6465) {
            mo3998(obj, view);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f6465) {
            tag = mo3999(view);
        } else {
            tag = view.getTag(this.f6467);
            if (!((Class) this.f6464).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo4002(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM4234 = AbstractC2270.m4234(view);
            C2246 c2246 = accessibilityDelegateM4234 != null ? accessibilityDelegateM4234 instanceof C2247 ? ((C2247) accessibilityDelegateM4234).f6548 : new C2246(accessibilityDelegateM4234) : null;
            if (c2246 == null) {
                c2246 = new C2246();
            }
            AbstractC2270.m4244(view, c2246);
            view.setTag(this.f6467, obj);
            AbstractC2270.m4249(view, this.f6466);
        }
    }

    public AbstractC2192() {
        if (C8623.f24219 == null) {
            C8623.f24219 = new C8623(7);
        }
    }
}
