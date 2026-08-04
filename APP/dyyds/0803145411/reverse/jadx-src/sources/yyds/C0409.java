package yyds;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛲᛷᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0409 implements Iterable, InterfaceC0527 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2138;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f2139;

    public /* synthetic */ C0409(int i, Object obj) {
        this.f2138 = i;
        this.f2139 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f2138;
        Object obj = this.f2139;
        switch (i) {
            case 0:
                return new C0862(((Set) ((C1223) obj).f5605).iterator());
            default:
                return new C0533((C1406) obj);
        }
    }
}
