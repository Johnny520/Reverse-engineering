package yyds;

/* JADX INFO: renamed from: yyds.ᛴᲀᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0939 extends AbstractC0677 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f4322 = 1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f4323;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0939(C2142 c2142, String str) {
        super(str);
        this.f4323 = c2142;
    }

    @Override // yyds.AbstractC0677
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final long mo426() {
        switch (this.f4322) {
            case 0:
                C2142 c2142 = (C2142) this.f4323;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - c2142.f10579) + 1;
                C2723 c2723 = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                C2723 c27232 = null;
                C2723 c27233 = null;
                int i2 = 0;
                for (C2723 c27234 : c2142.f10582) {
                    synchronized (c27234) {
                        if (c2142.m4089(c27234, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = c27234.f13382;
                            if (j3 < j) {
                                j = j3;
                                c27232 = c27234;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                c27233 = c27234;
                            }
                        }
                    }
                }
                if (c27232 != null) {
                    c2723 = c27232;
                } else if (i > 5) {
                    j = j2;
                    c2723 = c27233;
                } else {
                    j = -1;
                }
                if (c2723 == null) {
                    if (c27233 != null) {
                        return (j2 + c2142.f10579) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return c2142.f10579;
                    }
                    return -1L;
                }
                synchronized (c2723) {
                    if (c2723.f13388.isEmpty() && c2723.f13382 == j) {
                        c2723.f13386 = true;
                        c2142.f10582.remove(c2723);
                        AbstractC0795.m1808(c2723.f13379);
                        if (!c2142.f10582.isEmpty()) {
                            return 0L;
                        }
                        C0153 c0153 = c2142.f10580;
                        synchronized (c0153.f950) {
                            if (c0153.m696()) {
                                c0153.f950.m509(c0153);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((InterfaceC2266) this.f4323).mo731();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0939(String str, InterfaceC2266 interfaceC2266) {
        super(str);
        this.f4323 = interfaceC2266;
    }
}
