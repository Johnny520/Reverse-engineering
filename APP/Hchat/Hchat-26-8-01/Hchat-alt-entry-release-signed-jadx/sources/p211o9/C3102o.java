package p211o9;

import java.util.Comparator;

/* JADX INFO: renamed from: o9.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3102o implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((String) obj2).length()).compareTo(Integer.valueOf(((String) obj).length()));
    }
}
