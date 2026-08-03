package p104h4;

import bsh.C0353j;
import p311v4.AbstractC4446a;

/* JADX INFO: renamed from: h4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1587a extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final AbstractC4446a f5252b;

    /* JADX INFO: renamed from: c */
    public final int f5253c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1587a(int i9, AbstractC4446a abstractC4446a) {
        super("AnnotationDefault");
        if (abstractC4446a == null) {
            C0353j.m1305c("value == null");
            throw null;
        }
        this.f5252b = abstractC4446a;
        this.f5253c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        return this.f5253c + 6;
    }
}
