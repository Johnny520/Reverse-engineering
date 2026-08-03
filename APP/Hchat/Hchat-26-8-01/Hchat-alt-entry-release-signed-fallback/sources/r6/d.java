package r6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r6.c f11543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f11544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashSet f11545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashSet f11546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f11547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashSet f11548f;

    public d() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11545c = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11546d = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11547e = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f11548f = r0
            return
    }

    public java.util.Map a() {
            r12 = this;
            java.lang.String r0 = r12.f11544b
            sf.e r1 = new sf.e
            java.lang.String r2 = "name"
            r1.<init>(r2, r0)
            sf.e r2 = new sf.e
            java.lang.String r0 = "nameCondition"
            r3 = 0
            r2.<init>(r0, r3)
            r0 = r3
            sf.e r3 = new sf.e
            java.lang.String r4 = "modifiers"
            java.util.LinkedHashSet r5 = r12.f11545c
            r3.<init>(r4, r5)
            sf.e r4 = new sf.e
            java.lang.String r5 = "modifiersNot"
            java.util.LinkedHashSet r6 = r12.f11546d
            r4.<init>(r5, r6)
            sf.e r5 = new sf.e
            java.lang.String r6 = "modifiersCondition"
            r5.<init>(r6, r0)
            sf.e r6 = new sf.e
            java.lang.String r7 = "isSynthetic"
            r6.<init>(r7, r0)
            sf.e r7 = new sf.e
            java.lang.String r8 = "isSyntheticNot"
            r7.<init>(r8, r0)
            sf.e r8 = new sf.e
            java.lang.String r9 = "annotations"
            java.util.LinkedHashSet r10 = r12.f11547e
            r8.<init>(r9, r10)
            sf.e r9 = new sf.e
            java.lang.String r10 = "annotationsNot"
            java.util.LinkedHashSet r11 = r12.f11548f
            r9.<init>(r10, r11)
            sf.e r10 = new sf.e
            java.lang.String r11 = "genericString"
            r10.<init>(r11, r0)
            sf.e[] r0 = new sf.e[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r0 = tf.y.b0(r0)
            return r0
    }
}
