package p284t9;

import p024b9.AbstractC1061t;
import p229p9.AbstractC6051w1;
import p229p9.C6048v1;

/* JADX INFO: renamed from: t9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8207b extends AbstractC6051w1 {

    /* JADX INFO: renamed from: c */
    public static final C8207b f27518c = new C8207b();

    public C8207b() {
        super("protected_and_package", true);
    }

    @Override // p229p9.AbstractC6051w1
    /* JADX INFO: renamed from: a */
    public Integer mo24106a(AbstractC6051w1 abstractC6051w1) {
        abstractC6051w1.getClass();
        if (AbstractC1061t.m3842c(this, abstractC6051w1)) {
            return 0;
        }
        if (abstractC6051w1 == C6048v1.b.f19004c) {
            return null;
        }
        return C6048v1.f19000a.m24101b(abstractC6051w1) ? 1 : -1;
    }

    @Override // p229p9.AbstractC6051w1
    /* JADX INFO: renamed from: b */
    public String mo24102b() {
        return "protected/*protected and package*/";
    }

    @Override // p229p9.AbstractC6051w1
    /* JADX INFO: renamed from: d */
    public AbstractC6051w1 mo24108d() {
        return C6048v1.g.f19009c;
    }
}
