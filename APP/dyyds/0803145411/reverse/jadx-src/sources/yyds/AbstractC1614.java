package yyds;

/* JADX INFO: renamed from: yyds.ᛷᛸᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1614 implements Comparable {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0706 f8231 = new C0706(null);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f8232;

    public AbstractC1614(Object obj) {
        this.f8232 = obj;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC1614 abstractC1614) {
        return mo882().toString().compareTo(abstractC1614.mo882().toString()) * (-1);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public abstract Object mo882();
}
