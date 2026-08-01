package p016b1;

import java.util.Map;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: b1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0905a extends AbstractC5090l {
    /* JADX INFO: renamed from: c */
    public final boolean m3318c(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return mo3319e(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m3318c((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo3319e(Map.Entry entry);

    /* JADX INFO: renamed from: l */
    public final boolean m3320l(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return mo3321o(entry);
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo3321o(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return m3320l((Map.Entry) obj);
        }
        return false;
    }
}
