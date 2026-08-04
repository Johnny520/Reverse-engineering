package yyds;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛷᛱᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1479 extends AbstractC2242 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7014;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0728 f7015;

    public /* synthetic */ C1479(C0728 c0728, int i) {
        this.f7014 = i;
        this.f7015 = c0728;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f7014) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f7014) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
            case 0:
                c0728.clear();
                break;
            default:
                c0728.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iM1670 = c0728.m1670(entry.getKey());
                if (iM1670 < 0) {
                    return false;
                }
                return AbstractC1544.m3188(c0728.f3408[iM1670], entry.getValue());
            default:
                return c0728.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f7014) {
            case 0:
                C0728 c0728 = this.f7015;
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM1670 = c0728.m1670(entry.getKey());
                        if (!(iM1670 < 0 ? false : AbstractC1544.m3188(c0728.f3408[iM1670], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
        }
        return c0728.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
            case 0:
                return new C0523(c0728, 0);
            default:
                return new C0523(c0728, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    c0728.m1672();
                    int iM1670 = c0728.m1670(entry.getKey());
                    if (iM1670 >= 0 && AbstractC1544.m3188(c0728.f3408[iM1670], entry.getValue())) {
                        c0728.m1669(iM1670);
                    }
                }
                break;
            default:
                c0728.m1672();
                int iM16702 = c0728.m1670(obj);
                if (iM16702 >= 0) {
                    c0728.m1669(iM16702);
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
            case 0:
                c0728.m1672();
                break;
            default:
                c0728.m1672();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
            case 0:
                c0728.m1672();
                break;
            default:
                c0728.m1672();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // yyds.AbstractC2242
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo1576() {
        int i = this.f7014;
        C0728 c0728 = this.f7015;
        switch (i) {
        }
        return c0728.f3403;
    }
}
