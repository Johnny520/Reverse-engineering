package androidx.collection;

import bsh.C2632;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            C5919.m11250("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f937;
            C0257 c0257 = this.f936;
            if (AbstractC4394.m8917(key, c0257.m861(i)) && AbstractC4394.m8917(entry.getValue(), c0257.m870(this.f937))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f938) {
            return this.f936.m861(this.f937);
        }
        C5919.m11250("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f938) {
            return this.f936.m870(this.f937);
        }
        C5919.m11250("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f937 < this.f939;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f938) {
            C5919.m11250("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f937;
        C0257 c0257 = this.f936;
        Object objM861 = c0257.m861(i);
        Object objM870 = c0257.m870(this.f937);
        return (objM861 == null ? 0 : objM861.hashCode()) ^ (objM870 != null ? objM870.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2632.m5291();
            return null;
        }
        this.f937++;
        this.f938 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f938) {
            C2632.m5296();
            return;
        }
        this.f936.mo867(this.f937);
        this.f937--;
        this.f939--;
        this.f938 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f938) {
            return this.f936.mo869(this.f937, obj);
        }
        C5919.m11250("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
