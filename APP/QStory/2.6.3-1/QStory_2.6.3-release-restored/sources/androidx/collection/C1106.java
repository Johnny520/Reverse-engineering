package androidx.collection;

import bsh.C3466;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1106 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1104 f1281;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f1282 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f1283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f1284;

    public C1106(C1104 c1104) {
        this.f1281 = c1104;
        this.f1284 = c1104.f1339 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f1283) {
            C6755.m11870("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f1282;
            C1104 c1104 = this.f1281;
            if (AbstractC5227.m9466(key, c1104.m1422(i)) && AbstractC5227.m9466(entry.getValue(), c1104.m1431(this.f1282))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f1283) {
            return this.f1281.m1422(this.f1282);
        }
        C6755.m11870("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f1283) {
            return this.f1281.m1431(this.f1282);
        }
        C6755.m11870("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1282 < this.f1284;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f1283) {
            C6755.m11870("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f1282;
        C1104 c1104 = this.f1281;
        Object objM1422 = c1104.m1422(i);
        Object objM1431 = c1104.m1431(this.f1282);
        return (objM1422 == null ? 0 : objM1422.hashCode()) ^ (objM1431 != null ? objM1431.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        this.f1282++;
        this.f1283 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1283) {
            C3466.m5901();
            return;
        }
        this.f1281.mo1428(this.f1282);
        this.f1282--;
        this.f1284--;
        this.f1283 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f1283) {
            return this.f1281.mo1430(this.f1282, obj);
        }
        C6755.m11870("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
