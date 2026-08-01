package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛷᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0490 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.String f1795;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f1796;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f1797;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0772 f1798;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f1799;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f1800;

    public AbstractC0490() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f1796 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f1799 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f1797 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f1800 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m898() {
            r1 = this;
            xhss.ᛸᛵᲇᲈ r1 = r1.f1798
            if (r1 == 0) goto L7
            r0 = 1
            r1.f2549 = r0
        L7:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.util.Map mo899() {
            r11 = this;
            java.lang.String r0 = r11.f1795
            xhss.ᲀᛴᛳᛸ r1 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r2 = "name"
            r1.<init>(r2, r0)
            xhss.ᲀᛴᛳᛸ r2 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r0 = "nameCondition"
            r3 = 0
            r2.<init>(r0, r3)
            r0 = r3
            xhss.ᲀᛴᛳᛸ r3 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r4 = "modifiers"
            java.util.LinkedHashSet r5 = r11.f1796
            r3.<init>(r4, r5)
            xhss.ᲀᛴᛳᛸ r4 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r5 = "modifiersNot"
            java.util.LinkedHashSet r6 = r11.f1799
            r4.<init>(r5, r6)
            xhss.ᲀᛴᛳᛸ r5 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r6 = "modifiersCondition"
            r5.<init>(r6, r0)
            xhss.ᲀᛴᛳᛸ r6 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r7 = "isSynthetic"
            r6.<init>(r7, r0)
            xhss.ᲀᛴᛳᛸ r7 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r8 = "isSyntheticNot"
            r7.<init>(r8, r0)
            xhss.ᲀᛴᛳᛸ r8 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r9 = "annotations"
            java.util.LinkedHashSet r10 = r11.f1797
            r8.<init>(r9, r10)
            xhss.ᲀᛴᛳᛸ r9 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r10 = "annotationsNot"
            java.util.LinkedHashSet r11 = r11.f1800
            r9.<init>(r10, r11)
            xhss.ᲀᛴᛳᛸ r10 = new xhss.ᲀᛴᛳᛸ
            java.lang.String r11 = "genericString"
            r10.<init>(r11, r0)
            xhss.ᲀᛴᛳᛸ[] r11 = new xhss.C0857[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r11 = xhss.AbstractC0955.m1569(r11)
            return r11
    }
}
