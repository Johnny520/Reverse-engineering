package androidx.core.view;

import android.os.Build;
import android.view.View;
import androidx.collection.C0276;
import java.nio.ByteBuffer;
import kotlin.collections.builders.MapBuilder;
import p305.C8631;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f6463;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6465;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f6466;

    public AbstractC2192(MapBuilder mapBuilder) {
        this.f6463 = mapBuilder;
        this.f6464 = -1;
        this.f6465 = mapBuilder.modCount;
        m3987();
    }

    public boolean hasNext() {
        return this.f6466 < ((MapBuilder) this.f6463).length;
    }

    public void remove() {
        MapBuilder mapBuilder = (MapBuilder) this.f6463;
        m3990();
        if (this.f6464 == -1) {
            C5919.m11250("Call next() before removing element from the iterator.");
            return;
        }
        mapBuilder.checkIsMutable$kotlin_stdlib();
        mapBuilder.removeEntryAt(this.f6464);
        this.f6464 = -1;
        this.f6465 = mapBuilder.modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m3987() {
        MapBuilder mapBuilder = (MapBuilder) this.f6463;
        while (this.f6466 < mapBuilder.length) {
            int[] iArr = mapBuilder.presenceArray;
            int i = this.f6466;
            if (iArr[i] >= 0) {
                return;
            } else {
                this.f6466 = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo3988(Object obj, View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract Object mo3989(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m3990() {
        if (((MapBuilder) this.f6463).modCount == this.f6465) {
            return;
        }
        C0276.m839();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m3991(int i) {
        if (i < this.f6465) {
            return ((ByteBuffer) this.f6463).getShort(this.f6464 + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract boolean mo3992(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m3993(Object obj, View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f6464) {
            mo3988(obj, view);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f6464) {
            tag = mo3989(view);
        } else {
            tag = view.getTag(this.f6466);
            if (!((Class) this.f6463).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo3992(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM4224 = AbstractC2270.m4224(view);
            C2246 c2246 = accessibilityDelegateM4224 != null ? accessibilityDelegateM4224 instanceof C2247 ? ((C2247) accessibilityDelegateM4224).f6547 : new C2246(accessibilityDelegateM4224) : null;
            if (c2246 == null) {
                c2246 = new C2246();
            }
            AbstractC2270.m4234(view, c2246);
            view.setTag(this.f6466, obj);
            AbstractC2270.m4239(view, this.f6465);
        }
    }

    public AbstractC2192() {
        if (C8631.f24228 == null) {
            C8631.f24228 = new C8631(7);
        }
    }
}
