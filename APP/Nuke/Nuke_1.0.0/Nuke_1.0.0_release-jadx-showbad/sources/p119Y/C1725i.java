package p119Y;

import java.util.Iterator;
import java.util.Map;
import p061L2.AbstractC0969i;

/* JADX INFO: renamed from: Y.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1725i extends AbstractC0969i {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5972d;

    /* JADX INFO: renamed from: e */
    public final C1719c f5973e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1725i(C1719c c1719c, int i5) {
        this.f5972d = i5;
        this.f5973e = c1719c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        switch (this.f5972d) {
            case 0:
                C1719c c1719c = this.f5973e;
                c1719c.getClass();
                return c1719c.f5960e;
            default:
                C1719c c1719c2 = this.f5973e;
                c1719c2.getClass();
                return c1719c2.f5960e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5972d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C1719c c1719c = this.f5973e;
                Object obj2 = c1719c.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c1719c.containsKey(entry.getKey());
            default:
                return this.f5973e.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5972d) {
            case 0:
                C1728l c1728l = this.f5973e.f5959d;
                AbstractC1729m[] abstractC1729mArr = new AbstractC1729m[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    abstractC1729mArr[i5] = new C1730n(0);
                }
                return new C1726j(c1728l, abstractC1729mArr);
            default:
                C1728l c1728l2 = this.f5973e.f5959d;
                AbstractC1729m[] abstractC1729mArr2 = new AbstractC1729m[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    abstractC1729mArr2[i6] = new C1730n(1);
                }
                return new C1726j(c1728l2, abstractC1729mArr2);
        }
    }
}
