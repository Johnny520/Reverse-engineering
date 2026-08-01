package ac;

import java.util.Map;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: ac.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0213a extends AbstractC5090l {
    /* JADX INFO: renamed from: c */
    public final boolean m449c(Map.Entry entry) {
        entry.getClass();
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return mo450e(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m449c((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo450e(Map.Entry entry);

    /* JADX INFO: renamed from: l */
    public final boolean m451l(Map.Entry entry) {
        entry.getClass();
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return mo452o(entry);
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo452o(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return m451l((Map.Entry) obj);
        }
        return false;
    }
}
