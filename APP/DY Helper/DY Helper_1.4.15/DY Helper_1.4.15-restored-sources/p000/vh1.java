package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vh1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f11293;

    /* JADX INFO: renamed from: β */
    public final p000.C0574n5 f11294;

    /* JADX INFO: renamed from: γ */
    public final int f11295;

    /* JADX INFO: renamed from: δ */
    public int f11296;

    public vh1(java.util.List r10, p000.C0574n5 r11) {
            r9 = this;
            r9.<init>()
            r9.f11293 = r10
            r9.f11294 = r11
            android.view.MotionEvent r11 = r9.m6246()
            r0 = 0
            if (r11 == 0) goto L13
            int r11 = r11.getClassification()
            goto L14
        L13:
            r11 = r0
        L14:
            r9.f11295 = r11
            android.view.MotionEvent r11 = r9.m6246()
            if (r11 == 0) goto L1f
            r11.getButtonState()
        L1f:
            android.view.MotionEvent r11 = r9.m6246()
            if (r11 == 0) goto L28
            r11.getMetaState()
        L28:
            android.view.MotionEvent r11 = r9.m6246()
            r1 = 3
            r2 = 2
            r3 = 1
            if (r11 == 0) goto L8e
            int r10 = r11.getClassification()
            if (r10 != r1) goto L39
            r10 = r3
            goto L3a
        L39:
            r10 = r0
        L3a:
            int r4 = r11.getClassification()
            r5 = 5
            if (r4 != r5) goto L43
            r4 = r3
            goto L44
        L43:
            r4 = r0
        L44:
            int r11 = r11.getActionMasked()
            r6 = 10
            if (r11 == 0) goto L87
            r7 = 12
            if (r11 == r3) goto L7f
            r8 = 8
            if (r11 == r2) goto L75
            switch(r11) {
                case 5: goto L6c;
                case 6: goto L62;
                case 7: goto L75;
                case 8: goto L5f;
                case 9: goto L5c;
                case 10: goto L59;
                default: goto L57;
            }
        L57:
            goto Lab
        L59:
            r0 = r5
            goto Lab
        L5c:
            r0 = 4
            goto Lab
        L5f:
            r0 = 6
            goto Lab
        L62:
            if (r10 == 0) goto L66
        L64:
            r0 = r7
            goto Lab
        L66:
            if (r4 == 0) goto L6a
        L68:
            r0 = r8
            goto Lab
        L6a:
            r0 = r2
            goto Lab
        L6c:
            if (r10 == 0) goto L70
        L6e:
            r0 = r6
            goto Lab
        L70:
            if (r4 == 0) goto L73
            goto L68
        L73:
            r0 = r3
            goto Lab
        L75:
            if (r10 == 0) goto L7a
            r0 = 11
            goto Lab
        L7a:
            if (r4 == 0) goto L7d
            goto L68
        L7d:
            r0 = r1
            goto Lab
        L7f:
            if (r10 == 0) goto L82
            goto L64
        L82:
            if (r4 == 0) goto L6a
            r0 = 9
            goto Lab
        L87:
            if (r10 == 0) goto L8a
            goto L6e
        L8a:
            if (r4 == 0) goto L73
            r0 = 7
            goto Lab
        L8e:
            int r11 = r10.size()
        L92:
            if (r0 >= r11) goto L7d
            java.lang.Object r4 = r10.get(r0)
            ai1 r4 = (p000.ai1) r4
            boolean r5 = p000.j81.m2902(r4)
            if (r5 == 0) goto La1
            goto L6a
        La1:
            boolean r4 = p000.j81.m2901(r4)
            if (r4 == 0) goto La8
            goto L73
        La8:
            int r0 = r0 + 1
            goto L92
        Lab:
            r9.f11296 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.view.MotionEvent m6246() {
            r0 = this;
            n5 r0 = r0.f11294
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7388
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
