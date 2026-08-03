package p006g;

import java.util.Comparator;
import p004e.AbstractC0041r;
import p004e.AbstractC0048y;

/* JADX INFO: renamed from: g.h */
/* JADX INFO: loaded from: classes.dex */
final class C0097h implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f363a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f363a) {
            case 0:
                return ((AbstractC0048y) obj).m213a() - ((AbstractC0048y) obj2).m213a();
            default:
                ((AbstractC0041r) obj).getClass();
                throw null;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        switch (this.f363a) {
            case 0:
                if (obj != this) {
                    break;
                }
                break;
            default:
                if (obj != this) {
                    break;
                }
                break;
        }
        return false;
    }
}
