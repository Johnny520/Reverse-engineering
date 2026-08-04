package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲁᛳᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2212 implements InterfaceC1886 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10948;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f10949;

    public /* synthetic */ C2212(int i, Object obj) {
        this.f10948 = i;
        this.f10949 = obj;
    }

    @Override // yyds.InterfaceC1886
    public final void accept(Object obj) {
        switch (this.f10948) {
            case 0:
                C2246 c2246 = (C2246) obj;
                if (c2246 == null) {
                    c2246 = new C2246(-3);
                }
                ((C2133) this.f10949).m4057(c2246);
                return;
            default:
                C2246 c22462 = (C2246) obj;
                synchronized (AbstractC2672.f13116) {
                    try {
                        C0988 c0988 = AbstractC2672.f13117;
                        ArrayList arrayList = (ArrayList) c0988.get((String) this.f10949);
                        if (arrayList == null) {
                            return;
                        }
                        c0988.remove((String) this.f10949);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC1886) arrayList.get(i)).accept(c22462);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
