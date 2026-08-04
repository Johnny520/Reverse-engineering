package yyds;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: yyds.ᲈᲇᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2787 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public C0105 f13611;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public C0469 f13612;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public InterfaceC2656 f13613;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public ProxySelector f13614;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public long f13615;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f13616;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C1693 f13617;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int f13618;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public HostnameVerifier f13620;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public SocketFactory f13621;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public List f13622;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C0052 f13623;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public int f13624;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public int f13625;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public X509TrustManager f13626;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f13627;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public AbstractC0181 f13628;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public C2342 f13629;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C1985 f13630;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C0135 f13631;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public C2014 f13632;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f13633;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public List f13634;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public SSLSocketFactory f13636;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f13637;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public int f13639;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C0299 f13619 = new C0299(6);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f13635 = new ArrayList();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f13638 = new ArrayList();

    public C2787() {
        TimeZone timeZone = AbstractC0795.f3653;
        this.f13617 = new C1693(29);
        this.f13637 = true;
        this.f13627 = true;
        C0469 c0469 = InterfaceC2656.f13057;
        this.f13613 = c0469;
        this.f13616 = true;
        this.f13633 = true;
        this.f13630 = C1985.f9941;
        this.f13631 = C0135.f838;
        this.f13612 = c0469;
        this.f13621 = SocketFactory.getDefault();
        this.f13622 = C1284.f5894;
        this.f13634 = C1284.f5893;
        this.f13620 = C2745.f13458;
        this.f13629 = C2342.f11508;
        this.f13625 = 10000;
        this.f13618 = 10000;
        this.f13639 = 10000;
        this.f13624 = 60000;
        this.f13615 = 1024L;
    }
}
