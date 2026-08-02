package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: fg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0202fg implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: h */
    public int f2975h;

    /* JADX INFO: renamed from: i */
    public int f2976i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f2977j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0276hg f2978k;

    public C0202fg(C0276hg c0276hg) {
        this.f2978k = c0276hg;
        this.f2975h = c0276hg.f11446j - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2977j) {
            C0676s.m4653l("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f2976i;
            C0276hg c0276hg = this.f2978k;
            if (t11.m5086l(key, c0276hg.m5569f(i)) && t11.m5086l(entry.getValue(), c0276hg.m5570j(this.f2976i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f2977j) {
            return this.f2978k.m5569f(this.f2976i);
        }
        C0676s.m4653l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2977j) {
            return this.f2978k.m5570j(this.f2976i);
        }
        C0676s.m4653l("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2976i < this.f2975h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2977j) {
            C0676s.m4653l("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f2976i;
        C0276hg c0276hg = this.f2978k;
        Object objM5569f = c0276hg.m5569f(i);
        Object objM5570j = c0276hg.m5570j(this.f2976i);
        return (objM5569f == null ? 0 : objM5569f.hashCode()) ^ (objM5570j != null ? objM5570j.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            um2.m5513b();
            return null;
        }
        this.f2976i++;
        this.f2977j = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2977j) {
            throw new IllegalStateException();
        }
        this.f2978k.mo4514h(this.f2976i);
        this.f2976i--;
        this.f2975h--;
        this.f2977j = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f2977j) {
            return this.f2978k.mo4515i(this.f2976i, obj);
        }
        C0676s.m4653l("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
