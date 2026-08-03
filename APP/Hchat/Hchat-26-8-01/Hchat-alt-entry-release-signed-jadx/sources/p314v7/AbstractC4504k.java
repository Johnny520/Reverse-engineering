package p314v7;

import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4504k implements Comparable {

    /* JADX INFO: renamed from: g */
    public final String f14859g;

    /* JADX INFO: renamed from: h */
    public final int f14860h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4504k(String str, int i9) {
        this.f14859g = str;
        this.f14860h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static AbstractC4504k m8940a(AbstractC4504k[] abstractC4504kArr, int i9, int i10) {
        int i11 = i9 & i10;
        for (AbstractC4504k abstractC4504k : abstractC4504kArr) {
            if (i11 == abstractC4504k.f14860h) {
                return abstractC4504k;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC4504k abstractC4504k = (AbstractC4504k) obj;
        if (abstractC4504k == null) {
            return 1;
        }
        return AbstractC5999a.m10739b(this.f14860h, abstractC4504k.f14860h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return obj == this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14859g;
    }
}
