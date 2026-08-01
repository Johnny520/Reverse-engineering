package defpackage;

/* JADX INFO: renamed from: ᛱᛴᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0084 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean f826;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f827;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f828;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f829;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f830;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f831;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Integer f832;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC1781 f833;

    public C0084(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Integer r8, defpackage.InterfaceC1781 r9, boolean r10) {
            r2 = this;
            r0 = -128076209364526(0xffff8b83ef0961d2, double:NaN)
            r0 = -128101979168302(0xffff8b7def0961d2, double:NaN)
            r0 = -128136338906670(0xffff8b75ef0961d2, double:NaN)
            r0 = -128192173481518(0xffff8b68ef0961d2, double:NaN)
            r0 = -128243713089070(0xffff8b5cef0961d2, double:NaN)
            r2.<init>()
            r2.f830 = r3
            r2.f831 = r4
            r2.f829 = r5
            r2.f828 = r6
            r2.f827 = r7
            r2.f832 = r8
            r2.f833 = r9
            r2.f826 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5f
        L3:
            boolean r0 = r3 instanceof defpackage.C0084
            if (r0 != 0) goto L8
            goto L5d
        L8:
            ᛱᛴᲈᛸ r3 = (defpackage.C0084) r3
            java.lang.String r0 = r2.f830
            java.lang.String r1 = r3.f830
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L5d
        L15:
            java.lang.String r0 = r2.f831
            java.lang.String r1 = r3.f831
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L5d
        L20:
            java.lang.String r0 = r2.f829
            java.lang.String r1 = r3.f829
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L5d
        L2b:
            java.lang.String r0 = r2.f828
            java.lang.String r1 = r3.f828
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L5d
        L36:
            java.lang.String r0 = r2.f827
            java.lang.String r1 = r3.f827
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L5d
        L41:
            java.lang.Integer r0 = r2.f832
            java.lang.Integer r1 = r3.f832
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L4c
            goto L5d
        L4c:
            ᲀᲈᛵᲇ r0 = r2.f833
            ᲀᲈᛵᲇ r1 = r3.f833
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L57
            goto L5d
        L57:
            boolean r2 = r2.f826
            boolean r3 = r3.f826
            if (r2 == r3) goto L5f
        L5d:
            r2 = 0
            return r2
        L5f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f830
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f831
            r3 = 961(0x3c1, float:1.347E-42)
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r3)
            java.lang.String r2 = r4.f829
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r4.f828
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r1 = r4.f827
            r2 = 29791(0x745f, float:4.1746E-41)
            int r0 = defpackage.AbstractC1124.m2153(r1, r0, r2)
            r1 = 0
            java.lang.Integer r3 = r4.f832
            if (r3 != 0) goto L2c
            r3 = r1
            goto L30
        L2c:
            int r3 = r3.hashCode()
        L30:
            int r0 = r0 + r3
            int r0 = r0 * r2
            ᲀᲈᛵᲇ r3 = r4.f833
            if (r3 != 0) goto L37
            goto L3b
        L37:
            int r1 = r3.hashCode()
        L3b:
            int r0 = r0 + r1
            int r0 = r0 * r2
            boolean r4 = r4.f826
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -128544360799790(0xffff8b16ef0961d2, double:NaN)
            java.lang.String r1 = "Config(title="
            r0.<init>(r1)
            java.lang.String r1 = r5.f830
            r2 = -128604490341934(0xffff8b08ef0961d2, double:NaN)
            r0.append(r1); r0.append(", message=")
            java.lang.String r1 = r5.f831
            r0.append(r1)
            r1 = -128651734982190(0xffff8afdef0961d2, double:NaN)
            java.lang.String r1 = ", customView="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            r2 = -128711864524334(0xffff8aefef0961d2, double:NaN)
            java.lang.String r2 = ", positiveText="
            r0.append(r2)
            java.lang.String r2 = r5.f829
            r3 = -128780584001070(0xffff8adfef0961d2, double:NaN)
            r0.append(r2); r0.append(", neutralText=")
            java.lang.String r2 = r5.f828
            r3 = -128845008510510(0xffff8ad0ef0961d2, double:NaN)
            r0.append(r2); r0.append(", negativeText=")
            java.lang.String r2 = r5.f827
            r0.append(r2)
            r2 = -128913727987246(0xffff8ac0ef0961d2, double:NaN)
            java.lang.String r2 = ", titleTextColor="
            r0.append(r2)
            r0.append(r1)
            r2 = -128991037398574(0xffff8aaeef0961d2, double:NaN)
            java.lang.String r2 = ", messageTextColor="
            r0.append(r2)
            r0.append(r1)
            r2 = -129076936744494(0xffff8a9aef0961d2, double:NaN)
            java.lang.String r2 = ", positiveTextColor="
            r0.append(r2)
            java.lang.Integer r2 = r5.f832
            r0.append(r2)
            r2 = -129167131057710(0xffff8a85ef0961d2, double:NaN)
            java.lang.String r2 = ", neutralTextColor="
            r0.append(r2)
            r0.append(r1)
            r2 = -129253030403630(0xffff8a71ef0961d2, double:NaN)
            java.lang.String r2 = ", negativeTextColor="
            r0.append(r2)
            r0.append(r1)
            r2 = -129343224716846(0xffff8a5cef0961d2, double:NaN)
            java.lang.String r2 = ", onPositive="
            r0.append(r2)
            ᲀᲈᛵᲇ r2 = r5.f833
            r0.append(r2)
            r2 = -129403354258990(0xffff8a4eef0961d2, double:NaN)
            java.lang.String r2 = ", onNeutral="
            r0.append(r2)
            r0.append(r1)
            r2 = -129459188833838(0xffff8a41ef0961d2, double:NaN)
            java.lang.String r2 = ", onNegative="
            r0.append(r2)
            r0.append(r1)
            r1 = -129519318375982(0xffff8a33ef0961d2, double:NaN)
            java.lang.String r1 = ", cancelable="
            r0.append(r1)
            boolean r5 = r5.f826
            r0.append(r5)
            r5 = 41
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
