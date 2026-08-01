package p000;

/* JADX INFO: renamed from: o1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC0607o1 implements android.view.translation.ViewTranslationCallback {

    /* JADX INFO: renamed from: α */
    public static final p000.ViewTranslationCallbackC0607o1 f7857 = null;

    static {
            o1 r0 = new o1
            r0.<init>()
            p000.ViewTranslationCallbackC0607o1.f7857 = r0
            return
    }

    public final boolean onClearTranslation(android.view.View r13) {
            r12 = this;
            r13.getClass()
            androidx.compose.ui.platform.AndroidComposeView r13 = (androidx.compose.p001ui.platform.AndroidComposeView) r13
            z1 r12 = r13.getContentCaptureManager$ui()
            r12.getClass()
            v1 r13 = p000.EnumC0893v1.f11049
            r12.f12929 = r13
            sm0 r12 = r12.m7059()
            java.lang.Object[] r13 = r12.f9964
            long[] r12 = r12.f9962
            int r0 = r12.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L82
            r1 = 0
            r2 = r1
        L1f:
            r3 = r12[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L7d
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L39:
            if (r7 >= r5) goto L7b
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.3E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L77
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r13[r8]
            ds1 r8 = (p000.ds1) r8
            bs1 r8 = r8.f3268
            xr1 r8 = r8.f1824
            b21 r8 = r8.f12268
            is1 r9 = p000.fs1.f4087
            java.lang.Object r9 = r8.m695(r9)
            r10 = 0
            if (r9 != 0) goto L5b
            r9 = r10
        L5b:
            if (r9 == 0) goto L77
            is1 r9 = p000.wr1.f11824
            java.lang.Object r8 = r8.m695(r9)
            if (r8 != 0) goto L66
            goto L67
        L66:
            r10 = r8
        L67:
            м r10 = (p000.C1114) r10
            if (r10 == 0) goto L77
            m80 r8 = r10.f13447
            p70 r8 = (p000.p70) r8
            if (r8 == 0) goto L77
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L77:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L39
        L7b:
            if (r5 != r6) goto L82
        L7d:
            if (r2 == r0) goto L82
            int r2 = r2 + 1
            goto L1f
        L82:
            r12 = 1
            return r12
    }

    public final boolean onHideTranslation(android.view.View r13) {
            r12 = this;
            r13.getClass()
            androidx.compose.ui.platform.AndroidComposeView r13 = (androidx.compose.p001ui.platform.AndroidComposeView) r13
            z1 r12 = r13.getContentCaptureManager$ui()
            r12.getClass()
            v1 r13 = p000.EnumC0893v1.f11049
            r12.f12929 = r13
            sm0 r12 = r12.m7059()
            java.lang.Object[] r13 = r12.f9964
            long[] r12 = r12.f9962
            int r0 = r12.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L8a
            r1 = 0
            r2 = r1
        L1f:
            r3 = r12[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L85
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L39:
            if (r7 >= r5) goto L83
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.3E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L7f
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r13[r8]
            ds1 r8 = (p000.ds1) r8
            bs1 r8 = r8.f3268
            xr1 r8 = r8.f1824
            b21 r8 = r8.f12268
            is1 r9 = p000.fs1.f4087
            java.lang.Object r9 = r8.m695(r9)
            r10 = 0
            if (r9 != 0) goto L5b
            r9 = r10
        L5b:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r9 = p000.ln0.m3626(r9, r11)
            if (r9 == 0) goto L7f
            is1 r9 = p000.wr1.f11823
            java.lang.Object r8 = r8.m695(r9)
            if (r8 != 0) goto L6c
            goto L6d
        L6c:
            r10 = r8
        L6d:
            м r10 = (p000.C1114) r10
            if (r10 == 0) goto L7f
            m80 r8 = r10.f13447
            a80 r8 = (p000.a80) r8
            if (r8 == 0) goto L7f
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            java.lang.Object r8 = r8.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L7f:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L39
        L83:
            if (r5 != r6) goto L8a
        L85:
            if (r2 == r0) goto L8a
            int r2 = r2 + 1
            goto L1f
        L8a:
            r12 = 1
            return r12
    }

    public final boolean onShowTranslation(android.view.View r13) {
            r12 = this;
            r13.getClass()
            androidx.compose.ui.platform.AndroidComposeView r13 = (androidx.compose.p001ui.platform.AndroidComposeView) r13
            z1 r12 = r13.getContentCaptureManager$ui()
            r12.getClass()
            v1 r13 = p000.EnumC0893v1.f11050
            r12.f12929 = r13
            sm0 r12 = r12.m7059()
            java.lang.Object[] r13 = r12.f9964
            long[] r12 = r12.f9962
            int r0 = r12.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L8a
            r1 = 0
            r2 = r1
        L1f:
            r3 = r12[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L85
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L39:
            if (r7 >= r5) goto L83
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.3E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L7f
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r13[r8]
            ds1 r8 = (p000.ds1) r8
            bs1 r8 = r8.f3268
            xr1 r8 = r8.f1824
            b21 r8 = r8.f12268
            is1 r9 = p000.fs1.f4087
            java.lang.Object r9 = r8.m695(r9)
            r10 = 0
            if (r9 != 0) goto L5b
            r9 = r10
        L5b:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            boolean r9 = p000.ln0.m3626(r9, r11)
            if (r9 == 0) goto L7f
            is1 r9 = p000.wr1.f11823
            java.lang.Object r8 = r8.m695(r9)
            if (r8 != 0) goto L6c
            goto L6d
        L6c:
            r10 = r8
        L6d:
            м r10 = (p000.C1114) r10
            if (r10 == 0) goto L7f
            m80 r8 = r10.f13447
            a80 r8 = (p000.a80) r8
            if (r8 == 0) goto L7f
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L7f:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L39
        L83:
            if (r5 != r6) goto L8a
        L85:
            if (r2 == r0) goto L8a
            int r2 = r2 + 1
            goto L1f
        L8a:
            r12 = 1
            return r12
    }
}
