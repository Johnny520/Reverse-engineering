package p198n8;

import java.util.Map;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: n8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5508a extends AbstractC5090l {
    /* JADX INFO: renamed from: c */
    public final boolean m22376c(Map.Entry entry) {
        entry.getClass();
        return mo22377e(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m22376c((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo22377e(Map.Entry entry);

    /* JADX INFO: renamed from: l */
    public abstract /* bridge */ boolean mo22378l(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo22378l((Map.Entry) obj);
        }
        return false;
    }
}
