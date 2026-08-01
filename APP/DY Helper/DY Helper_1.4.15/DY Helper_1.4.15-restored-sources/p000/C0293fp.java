package p000;

/* JADX INFO: renamed from: fp */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0293fp implements p000.InterfaceC0256ep, p000.InterfaceC0330gp {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4055;

    /* JADX INFO: renamed from: ζ */
    public android.content.ClipData f4056;

    /* JADX INFO: renamed from: η */
    public int f4057;

    /* JADX INFO: renamed from: θ */
    public int f4058;

    /* JADX INFO: renamed from: ι */
    public android.net.Uri f4059;

    /* JADX INFO: renamed from: κ */
    public android.os.Bundle f4060;

    public /* synthetic */ C0293fp() {
            r1 = this;
            r0 = 0
            r1.f4055 = r0
            r1.<init>()
            return
    }

    public C0293fp(p000.C0293fp r4) {
            r3 = this;
            r0 = 1
            r3.f4055 = r0
            r3.<init>()
            android.content.ClipData r0 = r4.f4056
            r0.getClass()
            r3.f4056 = r0
            int r0 = r4.f4057
            if (r0 < 0) goto L5a
            r1 = 5
            if (r0 > r1) goto L51
            r3.f4057 = r0
            int r0 = r4.f4058
            r1 = r0 & 1
            if (r1 != r0) goto L27
            r3.f4058 = r0
            android.net.Uri r0 = r4.f4059
            r3.f4059 = r0
            android.os.Bundle r4 = r4.f4060
            r3.f4060 = r4
            return
        L27:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = java.lang.Integer.toHexString(r0)
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested flags 0x"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", but only 0x"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = " are allowed"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        L51:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = "source is out of range of [0, 5] (too high)"
            p000.C1080.m7275(r3)
            r3 = 0
            throw r3
        L5a:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = "source is out of range of [0, 5] (too low)"
            p000.C1080.m7275(r3)
            r3 = 0
            throw r3
    }

    @Override // p000.InterfaceC0256ep
    public p000.C0367hp build() {
            r2 = this;
            hp r0 = new hp
            fp r1 = new fp
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // p000.InterfaceC0256ep
    public void setExtras(android.os.Bundle r1) {
            r0 = this;
            r0.f4060 = r1
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f4055
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = super.toString()
            return r5
        La:
            android.net.Uri r0 = r5.f4059
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentInfoCompat{clip="
            r1.<init>(r2)
            android.content.ClipData r2 = r5.f4056
            android.content.ClipDescription r2 = r2.getDescription()
            r1.append(r2)
            java.lang.String r2 = ", source="
            r1.append(r2)
            int r2 = r5.f4057
            if (r2 == 0) goto L48
            r3 = 1
            if (r2 == r3) goto L45
            r3 = 2
            if (r2 == r3) goto L42
            r3 = 3
            if (r2 == r3) goto L3f
            r3 = 4
            if (r2 == r3) goto L3c
            r3 = 5
            if (r2 == r3) goto L39
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L4a
        L39:
            java.lang.String r2 = "SOURCE_PROCESS_TEXT"
            goto L4a
        L3c:
            java.lang.String r2 = "SOURCE_AUTOFILL"
            goto L4a
        L3f:
            java.lang.String r2 = "SOURCE_DRAG_AND_DROP"
            goto L4a
        L42:
            java.lang.String r2 = "SOURCE_INPUT_METHOD"
            goto L4a
        L45:
            java.lang.String r2 = "SOURCE_CLIPBOARD"
            goto L4a
        L48:
            java.lang.String r2 = "SOURCE_APP"
        L4a:
            r1.append(r2)
            java.lang.String r2 = ", flags="
            r1.append(r2)
            int r2 = r5.f4058
            r3 = r2 & 1
            if (r3 == 0) goto L5b
            java.lang.String r2 = "FLAG_CONVERT_TO_PLAIN_TEXT"
            goto L5f
        L5b:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L5f:
            r1.append(r2)
            java.lang.String r2 = ""
            if (r0 != 0) goto L68
            r0 = r2
            goto L83
        L68:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ", hasLinkUri("
            r3.<init>(r4)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L83:
            r1.append(r0)
            android.os.Bundle r5 = r5.f4060
            if (r5 != 0) goto L8b
            goto L8d
        L8b:
            java.lang.String r2 = ", hasExtras"
        L8d:
            java.lang.String r5 = "}"
            java.lang.String r5 = p000.lz1.m3691(r1, r2, r5)
            return r5
    }

    @Override // p000.InterfaceC0330gp
    /* JADX INFO: renamed from: β */
    public int mo2192() {
            r0 = this;
            int r0 = r0.f4057
            return r0
    }

    @Override // p000.InterfaceC0330gp
    /* JADX INFO: renamed from: γ */
    public android.content.ClipData mo2193() {
            r0 = this;
            android.content.ClipData r0 = r0.f4056
            return r0
    }

    @Override // p000.InterfaceC0330gp
    /* JADX INFO: renamed from: ε */
    public int mo2194() {
            r0 = this;
            int r0 = r0.f4058
            return r0
    }

    @Override // p000.InterfaceC0330gp
    /* JADX INFO: renamed from: η */
    public android.view.ContentInfo mo2195() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC0256ep
    /* JADX INFO: renamed from: ι */
    public void mo1946(android.net.Uri r1) {
            r0 = this;
            r0.f4059 = r1
            return
    }

    @Override // p000.InterfaceC0256ep
    /* JADX INFO: renamed from: μ */
    public void mo1947(int r1) {
            r0 = this;
            r0.f4058 = r1
            return
    }
}
