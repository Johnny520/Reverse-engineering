package yyds;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: yyds.ᛱᛵᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0122 implements Callable {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f814;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f815;

    public /* synthetic */ CallableC0122(int i, Object obj) {
        this.f814 = i;
        this.f815 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f814) {
            case 0:
                synchronized (((C0016) this.f815)) {
                    try {
                        C0016 c0016 = (C0016) this.f815;
                        if (c0016.f2688 == null) {
                            return null;
                        }
                        c0016.m1431();
                        if (((C0016) this.f815).m1423()) {
                            ((C0016) this.f815).m1426();
                            ((C0016) this.f815).f2679 = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                return (C0644) this.f815;
        }
    }
}
