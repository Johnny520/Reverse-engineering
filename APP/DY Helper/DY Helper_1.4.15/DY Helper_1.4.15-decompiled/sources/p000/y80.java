package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y80 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.z80 f12490;

    public y80(p000.z80 r1) {
            r0 = this;
            r0.<init>()
            r0.f12490 = r1
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r11 = this;
            z80 r11 = r11.f12490
            java.util.ArrayList r11 = r11.f13003
            int r0 = r11.size()
            b21 r1 = new b21
            r1.<init>(r0)
            int r0 = r11.size()
            r2 = 0
            r3 = r2
        L13:
            if (r3 >= r0) goto L72
            java.lang.Object r4 = r11.get(r3)
            yo0 r4 = (p000.yo0) r4
            java.lang.Object r5 = r4.f12708
            int r6 = r4.f12707
            if (r5 == 0) goto L2d
            go0 r5 = new go0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r4.f12708
            r5.<init>(r6, r7)
            goto L31
        L2d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
        L31:
            int r6 = r1.m694(r5)
            if (r6 >= 0) goto L39
            r7 = 1
            goto L3a
        L39:
            r7 = r2
        L3a:
            if (r7 == 0) goto L3e
            r8 = 0
            goto L42
        L3e:
            java.lang.Object[] r8 = r1.f1429
            r8 = r8[r6]
        L42:
            if (r8 != 0) goto L45
            goto L5f
        L45:
            boolean r9 = r8 instanceof p000.v11
            if (r9 == 0) goto L50
            v11 r8 = (p000.v11) r8
            r8.m6015(r4)
            r4 = r8
            goto L5f
        L50:
            java.lang.Object[] r9 = p000.a41.f64
            v11 r9 = new v11
            r10 = 2
            r9.<init>(r10)
            r9.m6015(r8)
            r9.m6015(r4)
            r4 = r9
        L5f:
            if (r7 == 0) goto L6b
            int r6 = ~r6
            java.lang.Object[] r7 = r1.f1428
            r7[r6] = r5
            java.lang.Object[] r5 = r1.f1429
            r5[r6] = r4
            goto L6f
        L6b:
            java.lang.Object[] r5 = r1.f1429
            r5[r6] = r4
        L6f:
            int r3 = r3 + 1
            goto L13
        L72:
            i11 r11 = new i11
            r11.<init>(r1)
            return r11
    }
}
