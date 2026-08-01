package androidx.core.view;

import android.os.Build;
import android.view.View;
import androidx.collection.C1123;
import java.nio.ByteBuffer;
import kotlin.collections.builders.MapBuilder;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f6809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f6812;

    public AbstractC3025(MapBuilder mapBuilder) {
        this.f6809 = mapBuilder;
        this.f6810 = -1;
        this.f6811 = mapBuilder.modCount;
        m4557();
    }

    public boolean hasNext() {
        return this.f6812 < ((MapBuilder) this.f6809).length;
    }

    public void remove() {
        MapBuilder mapBuilder = (MapBuilder) this.f6809;
        m4560();
        if (this.f6810 == -1) {
            C6755.m11870("Call next() before removing element from the iterator.");
            return;
        }
        mapBuilder.checkIsMutable$kotlin_stdlib();
        mapBuilder.removeEntryAt(this.f6810);
        this.f6810 = -1;
        this.f6811 = mapBuilder.modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m4557() {
        MapBuilder mapBuilder = (MapBuilder) this.f6809;
        while (this.f6812 < mapBuilder.length) {
            int[] iArr = mapBuilder.presenceArray;
            int i = this.f6812;
            if (iArr[i] >= 0) {
                return;
            } else {
                this.f6812 = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo4558(Object obj, View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract Object mo4559(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4560() {
        if (((MapBuilder) this.f6809).modCount == this.f6811) {
            return;
        }
        C1123.m1400();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m4561(int i) {
        if (i < this.f6811) {
            return ((ByteBuffer) this.f6809).getShort(this.f6810 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract boolean mo4562(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m4563(Object obj, View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f6810) {
            mo4558(obj, view);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f6810) {
            tag = mo4559(view);
        } else {
            tag = view.getTag(this.f6812);
            if (!((Class) this.f6809).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo4562(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM4794 = AbstractC3103.m4794(view);
            C3079 c3079 = accessibilityDelegateM4794 != null ? accessibilityDelegateM4794 instanceof C3080 ? ((C3080) accessibilityDelegateM4794).f6893 : new C3079(accessibilityDelegateM4794) : null;
            if (c3079 == null) {
                c3079 = new C3079();
            }
            AbstractC3103.m4804(view, c3079);
            view.setTag(this.f6812, obj);
            AbstractC3103.m4809(view, this.f6811);
        }
    }

    public AbstractC3025() {
        if (C9452.f24564 == null) {
            C9452.f24564 = new C9452(7);
        }
    }
}
