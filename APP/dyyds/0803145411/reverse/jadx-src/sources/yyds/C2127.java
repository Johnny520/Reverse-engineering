package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᲈᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2127 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    @InterfaceC0770("voice_wave")
    public List<Float> f10515;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("audio_content_type")
    public String f10516;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    @InterfaceC0770("duration")
    public long f10517;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    @InterfaceC0770("md5")
    public String f10518;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    @InterfaceC0770("resource_url")
    public C2099 f10519;

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1738159952659310L));
        sb.append(this.f10516);
        sb.append('\'');
        sb.append(AbstractC2328.m4341(-1738297391612782L));
        AbstractC0897.m1994(sb, this.f10517, -1738348931220334L);
        sb.append(this.f10518);
        sb.append('\'');
        sb.append(AbstractC2328.m4341(-1738383290958702L));
        sb.append(this.f10519);
        sb.append(AbstractC2328.m4341(-1738413355729774L));
        sb.append(this.f10515);
        sb.append('}');
        return sb.toString();
    }
}
