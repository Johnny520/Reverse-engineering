package androidx.collection;

import bsh.C2633;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0259 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C0257 f936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f937 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f938;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f939;

    public C0259(C0257 c0257) {
        this.f936 = c0257;
        this.f939 = c0257.f994 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f938) {
            C5925.m11311("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f937;
            C0257 c0257 = this.f936;
            if (AbstractC4395.m8907(key, c0257.m862(i)) && AbstractC4395.m8907(entry.getValue(), c0257.m871(this.f937))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f938) {
            return this.f936.m862(this.f937);
        }
        C5925.m11311("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f938) {
            return this.f936.m871(this.f937);
        }
        C5925.m11311("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f937 < this.f939;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f938) {
            C5925.m11311("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f937;
        C0257 c0257 = this.f936;
        Object objM862 = c0257.m862(i);
        Object objM871 = c0257.m871(this.f937);
        return (objM862 == null ? 0 : objM862.hashCode()) ^ (objM871 != null ? objM871.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2633.m5336();
            return null;
        }
        this.f937++;
        this.f938 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f938) {
            C2633.m5341();
            return;
        }
        this.f936.mo868(this.f937);
        this.f937--;
        this.f939--;
        this.f938 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f938) {
            return this.f936.mo870(this.f937, obj);
        }
        C5925.m11311("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
