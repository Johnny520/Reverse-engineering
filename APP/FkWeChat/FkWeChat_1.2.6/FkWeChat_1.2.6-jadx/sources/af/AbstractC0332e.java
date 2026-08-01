package af;

import java.util.ArrayList;
import p376zd.C10010p0;

/* JADX INFO: renamed from: af.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0332e extends ArrayList {
    /* JADX INFO: renamed from: a */
    public final Object m1012a() {
        if (isEmpty()) {
            return null;
        }
        return first();
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ int m1013c() {
        return super.size();
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ Object m1014d(int i10) {
        return super.remove(i10);
    }

    public final Object first() {
        if (!isEmpty()) {
            return get(0);
        }
        C10010p0.m38820a("list is empty");
        return null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return m1014d(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m1013c();
    }
}
