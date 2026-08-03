package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface NameSource {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Listener {
        void nameSourceChanged(bsh.NameSource r1);
    }

    void addNameSourceListener(bsh.NameSource.Listener r1);

    java.lang.String[] getAllNames();
}
