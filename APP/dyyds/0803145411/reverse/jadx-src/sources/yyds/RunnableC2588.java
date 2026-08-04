package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛱᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2588 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2028 f12765;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12766;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0397 f12767;

    public /* synthetic */ RunnableC2588(C2028 c2028, C0397 c0397, int i) {
        this.f12766 = i;
        this.f12765 = c2028;
        this.f12767 = c0397;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0953 c0953;
        switch (this.f12766) {
            case 0:
                C0397 c0397 = this.f12767;
                c0397.f2052.m2395();
                synchronized (c0397.f2064) {
                    synchronized (this.f12765) {
                        try {
                            if (this.f12765.f10123.f11163.contains(new C0792(this.f12767, AbstractC0319.f1692))) {
                                C2028 c2028 = this.f12765;
                                C0397 c03972 = this.f12767;
                                c2028.getClass();
                                try {
                                    c03972.m1153(c2028.f10114, 5);
                                } finally {
                                }
                            }
                            this.f12765.m3906();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                C0397 c03973 = this.f12767;
                c03973.f2052.m2395();
                synchronized (c03973.f2064) {
                    synchronized (this.f12765) {
                        try {
                            if (this.f12765.f10123.f11163.contains(new C0792(this.f12767, AbstractC0319.f1692))) {
                                this.f12765.f10112.m3918();
                                C2028 c20282 = this.f12765;
                                C0397 c03974 = this.f12767;
                                c20282.getClass();
                                try {
                                    c03974.m1151(c20282.f10112, c20282.f10124);
                                    this.f12765.m3907(this.f12767);
                                } finally {
                                }
                            }
                            this.f12765.m3906();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
