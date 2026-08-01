package qa;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: qa.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6356m implements Iterator {

    /* JADX INFO: renamed from: q */
    public Iterator f20024q;

    public C6356m(Iterator it) {
        this.f20024q = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f20024q.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20024q.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f20024q.remove();
    }
}
