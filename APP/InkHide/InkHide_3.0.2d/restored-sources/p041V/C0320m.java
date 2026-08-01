package p041V;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: V.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0320m extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0322o f707b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0320m(C0322o c0322o, int i2) {
        this.f706a = i2;
        this.f707b = c0322o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f706a) {
            case 0:
                this.f707b.clear();
                break;
            default:
                this.f707b.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C0321n c0321nM554a;
        switch (this.f706a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C0322o c0322o = this.f707b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0321n c0321n = null;
                if (key != null) {
                    try {
                        c0321nM554a = c0322o.m554a(key, false);
                    } catch (ClassCastException unused) {
                        c0321nM554a = null;
                    }
                    break;
                } else {
                    c0321nM554a = null;
                }
                if (c0321nM554a != null && Objects.equals(c0321nM554a.f715h, entry.getValue())) {
                    c0321n = c0321nM554a;
                }
                return c0321n != null;
            default:
                return this.f707b.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f706a) {
            case 0:
                return new C0319l(this.f707b, 0);
            default:
                return new C0319l(this.f707b, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0321n c0321nM554a;
        switch (this.f706a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C0322o c0322o = this.f707b;
                    Object key = entry.getKey();
                    C0321n c0321n = null;
                    if (key != null) {
                        try {
                            c0321nM554a = c0322o.m554a(key, false);
                        } catch (ClassCastException unused) {
                            c0321nM554a = null;
                        }
                    } else {
                        c0321nM554a = null;
                    }
                    if (c0321nM554a != null && Objects.equals(c0321nM554a.f715h, entry.getValue())) {
                        c0321n = c0321nM554a;
                    }
                    if (c0321n != null) {
                        c0322o.m556c(c0321n, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                C0322o c0322o2 = this.f707b;
                C0321n c0321nM554a2 = null;
                if (obj != null) {
                    try {
                        c0321nM554a2 = c0322o2.m554a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c0321nM554a2 != null) {
                    c0322o2.m556c(c0321nM554a2, true);
                }
                if (c0321nM554a2 != null) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f706a) {
        }
        return this.f707b.f721d;
    }
}
