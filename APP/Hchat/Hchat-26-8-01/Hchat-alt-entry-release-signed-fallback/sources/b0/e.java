package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.f f356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.b f357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.b f358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.view.View f359d;

    public e(b0.f r1, b0.b r2, b0.b r3, android.view.View r4) {
            r0 = this;
            r0.<init>()
            r0.f356a = r1
            r0.f357b = r2
            r0.f358c = r3
            r0.f359d = r4
            return
    }

    public final boolean a(android.view.Menu r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            b0.b r2 = r0.f357b
            java.lang.Object r2 = r2.invoke()
            z.c r2 = (z.c) r2
            r3 = 0
            boolean r3 = gg.l.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L15
            return r4
        L15:
            r1.clear()
            java.lang.Object r2 = r2.f22462a
            int r3 = r2.size()
            r5 = 1
            r6 = r4
            r7 = r5
            r8 = r7
        L22:
            if (r6 >= r3) goto L10a
            java.lang.Object r9 = r2.get(r6)
            z.b r9 = (z.b) r9
            boolean r10 = r9 instanceof z.d
            r11 = 2
            if (r10 == 0) goto L87
            int r10 = r7 + 1
            java.lang.Object r12 = r9.f22460a
            java.lang.Object r13 = z.e.f22466a
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L3f
            r12 = 16908320(0x1020020, float:2.387732E-38)
            goto L70
        L3f:
            java.lang.Object r13 = z.e.f22467b
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L4b
            r12 = 16908321(0x1020021, float:2.3877321E-38)
            goto L70
        L4b:
            java.lang.Object r13 = z.e.f22468c
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L57
            r12 = 16908322(0x1020022, float:2.3877324E-38)
            goto L70
        L57:
            java.lang.Object r13 = z.e.f22469d
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L63
            r12 = 16908319(0x102001f, float:2.3877316E-38)
            goto L70
        L63:
            java.lang.Object r13 = z.e.f22470e
            boolean r12 = gg.l.a(r12, r13)
            if (r12 == 0) goto L6f
            r12 = 16908355(0x1020043, float:2.3877417E-38)
            goto L70
        L6f:
            r12 = r7
        L70:
            z.d r9 = (z.d) r9
            java.lang.String r13 = r9.f22463b
            android.view.MenuItem r7 = r1.add(r8, r12, r7, r13)
            r7.setShowAsAction(r11)
            b0.d r11 = new b0.d
            r12 = 0
            r11.<init>(r9, r12, r0)
            r7.setOnMenuItemClickListener(r11)
        L84:
            r7 = r10
            goto L105
        L87:
            boolean r10 = r9 instanceof z.h
            if (r10 == 0) goto Lff
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r10 < r12) goto L105
            int r10 = r7 + 1
            android.view.View r12 = r0.f359d
            android.content.Context r12 = r12.getContext()
            z.h r9 = (z.h) r9
            android.view.textclassifier.TextClassification r13 = r9.f22472b
            int r9 = r9.f22473c
            r14 = 16908353(0x1020041, float:2.387741E-38)
            if (r9 >= 0) goto Lc0
            java.lang.CharSequence r9 = r13.getLabel()
            android.view.MenuItem r7 = r1.add(r14, r14, r7, r9)
            r7.setShowAsAction(r11)
            android.graphics.drawable.Drawable r9 = r13.getIcon()
            r7.setIcon(r9)
            b0.d r9 = new b0.d
            r11 = 1
            r9.<init>(r12, r11, r13)
            r7.setOnMenuItemClickListener(r9)
            goto L84
        Lc0:
            if (r9 != 0) goto Lc4
            r15 = r5
            goto Lc5
        Lc4:
            r15 = r4
        Lc5:
            java.util.List r13 = b0.b0.r(r13)
            java.lang.Object r9 = r13.get(r9)
            android.app.RemoteAction r9 = (android.app.RemoteAction) r9
            if (r15 == 0) goto Ld3
            r13 = r14
            goto Ld4
        Ld3:
            r13 = r4
        Ld4:
            java.lang.CharSequence r4 = r9.getTitle()
            android.view.MenuItem r4 = r1.add(r14, r13, r7, r4)
            if (r15 == 0) goto Ldf
            goto Le0
        Ldf:
            r11 = 0
        Le0:
            r4.setShowAsAction(r11)
            if (r15 != 0) goto Leb
            boolean r7 = b0.b0.v(r9)
            if (r7 == 0) goto Lf6
        Leb:
            android.graphics.drawable.Icon r7 = r9.getIcon()
            android.graphics.drawable.Drawable r7 = r7.loadDrawable(r12)
            r4.setIcon(r7)
        Lf6:
            b0.f0 r7 = new b0.f0
            r7.<init>(r9)
            r4.setOnMenuItemClickListener(r7)
            goto L84
        Lff:
            boolean r4 = r9 instanceof z.f
            if (r4 == 0) goto L105
            int r8 = r8 + 1
        L105:
            int r6 = r6 + 1
            r4 = 0
            goto L22
        L10a:
            return r5
    }
}
