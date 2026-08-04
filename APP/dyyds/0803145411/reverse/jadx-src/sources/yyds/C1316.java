package yyds;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛶᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1316 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f6032;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f6033;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C1505 f6034;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f6035 = -1;

    public C1316(C1505 c1505) {
        this.f6034 = c1505;
        this.f6033 = c1505.f4500 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f6032) {
            C0188.m800("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f6035;
            C1505 c1505 = this.f6034;
            if (AbstractC1544.m3188(key, c1505.m2173(i)) && AbstractC1544.m3188(entry.getValue(), c1505.m2171(this.f6035))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f6032) {
            return this.f6034.m2173(this.f6035);
        }
        C0188.m800("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f6032) {
            return this.f6034.m2171(this.f6035);
        }
        C0188.m800("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6035 < this.f6033;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f6032) {
            C0188.m800("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f6035;
        C1505 c1505 = this.f6034;
        Object objM2173 = c1505.m2173(i);
        Object objM2171 = c1505.m2171(this.f6035);
        return (objM2173 == null ? 0 : objM2173.hashCode()) ^ (objM2171 != null ? objM2171.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6035++;
        this.f6032 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6032) {
            throw new IllegalStateException();
        }
        this.f6034.mo1163(this.f6035);
        this.f6035--;
        this.f6033--;
        this.f6032 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f6032) {
            return this.f6034.mo1164(this.f6035, obj);
        }
        C0188.m800("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
