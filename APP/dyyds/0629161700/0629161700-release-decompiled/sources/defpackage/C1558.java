package defpackage;

/* JADX INFO: renamed from: ᛸᲀᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1558 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f6894;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f6895;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1023 f6896;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6897;

    public /* synthetic */ C1558(defpackage.C1023 r1, defpackage.InterfaceC0140 r2, int r3) {
            r0 = this;
            r0.f6897 = r3
            r0.f6896 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f6897
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            ᛷᛸᛱ r3 = (defpackage.InterfaceC1324) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛸᲀᛶᲁ r2 = (defpackage.C1558) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛵᲀᛷᛲ r3 = (defpackage.C0959) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛸᲀᛶᲁ r2 = (defpackage.C1558) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f6897
            ᛶᛲᛵᲀ r2 = r2.f6896
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            ᛸᲀᛶᲁ r0 = new ᛸᲀᛶᲁ
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.f6895 = r4
            return r0
        L10:
            ᛸᲀᛶᲁ r0 = new ᛸᲀᛶᲁ
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.f6895 = r4
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f6897
            ᛶᛲᛵᲀ r1 = r7.f6896
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L5d;
                default: goto Ld;
            }
        Ld:
            int r0 = r7.f6894
            r6 = 2
            if (r0 == 0) goto L27
            if (r0 == r4) goto L1f
            if (r0 != r6) goto L1a
            defpackage.AbstractC0762.m1680(r8)     // Catch: android.database.SQLException -> L5a
            goto L56
        L1a:
            defpackage.C2264.m3676(r2)
            r3 = r5
            goto L5c
        L1f:
            java.lang.Object r0 = r7.f6895
            ᛷᛸᛱ r0 = (defpackage.InterfaceC1324) r0
            defpackage.AbstractC0762.m1680(r8)
            goto L3a
        L27:
            defpackage.AbstractC0762.m1680(r8)
            java.lang.Object r8 = r7.f6895
            r0 = r8
            ᛷᛸᛱ r0 = (defpackage.InterfaceC1324) r0
            r7.f6895 = r0
            r7.f6894 = r4
            java.lang.Boolean r8 = r0.mo1989(r7)
            if (r8 != r3) goto L3a
            goto L5c
        L3a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L43
            goto L5a
        L43:
            ᛳᛴᲈᛶ r8 = defpackage.EnumC0469.f2347     // Catch: android.database.SQLException -> L5a
            ᛸᲀᛶᲁ r2 = new ᛸᲀᛶᲁ     // Catch: android.database.SQLException -> L5a
            r4 = 0
            r2.<init>(r1, r5, r4)     // Catch: android.database.SQLException -> L5a
            r7.f6895 = r5     // Catch: android.database.SQLException -> L5a
            r7.f6894 = r6     // Catch: android.database.SQLException -> L5a
            java.lang.Object r8 = r0.mo1990(r8, r2, r7)     // Catch: android.database.SQLException -> L5a
            if (r8 != r3) goto L56
            goto L5c
        L56:
            r3 = r8
            java.util.Set r3 = (java.util.Set) r3     // Catch: android.database.SQLException -> L5a
            goto L5c
        L5a:
            ᛵᲈᛳᲀ r3 = defpackage.C0993.f4434
        L5c:
            return r3
        L5d:
            int r0 = r7.f6894
            if (r0 == 0) goto L6c
            if (r0 != r4) goto L67
            defpackage.AbstractC0762.m1680(r8)
            goto L7c
        L67:
            defpackage.C2264.m3676(r2)
            r8 = r5
            goto L7c
        L6c:
            defpackage.AbstractC0762.m1680(r8)
            java.lang.Object r8 = r7.f6895
            ᛵᲀᛷᛲ r8 = (defpackage.C0959) r8
            r7.f6894 = r4
            java.lang.Object r8 = r1.m1976(r8, r7)
            if (r8 != r3) goto L7c
            r8 = r3
        L7c:
            return r8
    }
}
