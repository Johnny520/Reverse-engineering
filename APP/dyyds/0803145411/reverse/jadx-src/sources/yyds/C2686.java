package yyds;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᲈᛶᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2686 implements InterfaceC0375, InterfaceC1926 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Bundle f13154;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f13155;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Uri f13156;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13157 = 0;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f13158;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ClipData f13159;

    public C2686(C2686 c2686) {
        ClipData clipData = c2686.f13159;
        clipData.getClass();
        this.f13159 = clipData;
        int i = c2686.f13155;
        if (i < 0) {
            Locale locale = Locale.US;
            C0188.m798("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            C0188.m798("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f13155 = i;
        int i2 = c2686.f13158;
        if ((i2 & 1) == i2) {
            this.f13158 = i2;
            this.f13156 = c2686.f13156;
            this.f13154 = c2686.f13154;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // yyds.InterfaceC0375
    public C1167 build() {
        return new C1167(new C2686(this));
    }

    @Override // yyds.InterfaceC1926
    public int getSource() {
        return this.f13155;
    }

    @Override // yyds.InterfaceC0375
    public void setExtras(Bundle bundle) {
        this.f13154 = bundle;
    }

    public String toString() {
        String str;
        switch (this.f13157) {
            case 1:
                Uri uri = this.f13156;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f13159.getDescription());
                sb.append(", source=");
                int i = this.f13155;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f13158;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC2104.m4015(sb, this.f13154 != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // yyds.InterfaceC1926
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public ClipData mo387() {
        return this.f13159;
    }

    @Override // yyds.InterfaceC0375
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public void mo394(Uri uri) {
        this.f13156 = uri;
    }

    @Override // yyds.InterfaceC1926
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public int mo398() {
        return this.f13158;
    }

    @Override // yyds.InterfaceC0375
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public void mo403(int i) {
        this.f13158 = i;
    }

    @Override // yyds.InterfaceC1926
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public ContentInfo mo405() {
        return null;
    }

    public /* synthetic */ C2686() {
    }
}
