package defpackage;

/* JADX INFO: renamed from: ᲇᛲᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2011 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("voice_wave")
    public java.util.List<java.lang.Float> f8694;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("resource_url")
    public defpackage.C1987 f8695;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("md5")
    public java.lang.String f8696;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("audio_content_type")
    public java.lang.String f8697;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("duration")
    public long f8698;

    public C2011() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1156974279826990(0xfffbe3bcef0961d2, double:NaN)
            java.lang.String r1 = "AudioContent{audioContentType='"
            r0.<init>(r1)
            java.lang.String r1 = r4.f8697
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r2 = -1157111718780462(0xfffbe39cef0961d2, double:NaN)
            java.lang.String r2 = ", duration="
            r0.append(r2)
            long r2 = r4.f8698
            r0.append(r2)
            r2 = -1157163258388014(0xfffbe390ef0961d2, double:NaN)
            java.lang.String r2 = ", md5='"
            r0.append(r2)
            java.lang.String r2 = r4.f8696
            r0.append(r2)
            r0.append(r1)
            r1 = -1157197618126382(0xfffbe388ef0961d2, double:NaN)
            java.lang.String r1 = ", url="
            r0.append(r1)
            ᲇᛱᲀᛲ r1 = r4.f8695
            r0.append(r1)
            r1 = -1157227682897454(0xfffbe381ef0961d2, double:NaN)
            java.lang.String r1 = ", waveList="
            r0.append(r1)
            java.util.List<java.lang.Float> r4 = r4.f8694
            r0.append(r4)
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
