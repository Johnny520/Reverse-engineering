package defpackage;

/* JADX INFO: renamed from: ᛵᲈᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0992 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f4427;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f4428;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0495 f4429;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C1380 f4430;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.String f4431;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f4432;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f4433;

    public AbstractC0992() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f4428 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f4427 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f4432 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f4433 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m1953(defpackage.AbstractC0992 r0) {
            java.util.List r0 = r0.mo1885()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m1954() {
            r1 = this;
            ᛷᲇᛱᲈ r1 = r1.f4430
            if (r1 == 0) goto L7
            r0 = 1
            r1.f6022 = r0
        L7:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public java.util.Map mo1884() {
            r11 = this;
            java.lang.String r0 = r11.f4431
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "name"
            r1.<init>(r2, r0)
            ᛳᛶᛱᛷ r0 = r11.f4429
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "nameCondition"
            r2.<init>(r3, r0)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r0 = "modifiers"
            java.util.LinkedHashSet r4 = r11.f4428
            r3.<init>(r0, r4)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r0 = "modifiersNot"
            java.util.LinkedHashSet r5 = r11.f4427
            r4.<init>(r0, r5)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r0 = "modifiersCondition"
            r6 = 0
            r5.<init>(r0, r6)
            r0 = r6
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r7 = "isSynthetic"
            r6.<init>(r7, r0)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "isSyntheticNot"
            r7.<init>(r8, r0)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r9 = "annotations"
            java.util.LinkedHashSet r10 = r11.f4432
            r8.<init>(r9, r10)
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r10 = "annotationsNot"
            java.util.LinkedHashSet r11 = r11.f4433
            r9.<init>(r10, r11)
            kotlin.Pair r10 = new kotlin.Pair
            java.lang.String r11 = "genericString"
            r10.<init>(r11, r0)
            kotlin.Pair[] r11 = new kotlin.Pair[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r11 = defpackage.AbstractC1893.m3321(r11)
            return r11
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public abstract java.util.List mo1885();
}
