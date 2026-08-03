package p198nb;

import gg.AbstractC1416l;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: nb.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2953v implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Boolean.valueOf(AbstractC1416l.m3825a(((Map.Entry) obj).getValue(), "initial")).compareTo(Boolean.valueOf(AbstractC1416l.m3825a(((Map.Entry) obj2).getValue(), "initial")));
    }
}
