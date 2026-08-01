package p099y;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: y.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1070e implements InterfaceC1068d, InterfaceC1072f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3694b = 0;

    /* JADX INFO: renamed from: c */
    public ClipData f3695c;

    /* JADX INFO: renamed from: d */
    public int f3696d;

    /* JADX INFO: renamed from: e */
    public int f3697e;

    /* JADX INFO: renamed from: f */
    public Uri f3698f;

    /* JADX INFO: renamed from: g */
    public Bundle f3699g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1070e() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: a */
    public void mo131a(Bundle bundle) {
        this.f3699g = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: c */
    public void mo133c(Uri uri) {
        this.f3698f = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: d */
    public int mo134d() {
        return this.f3696d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: i */
    public ClipData mo138i() {
        return this.f3695c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: k */
    public C1074g mo140k() {
        return new C1074g(new C1070e(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: p */
    public int mo144p() {
        return this.f3697e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1072f
    /* JADX INFO: renamed from: t */
    public ContentInfo mo148t() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str;
        switch (this.f3694b) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f3695c.getDescription());
                sb.append(", source=");
                int i2 = this.f3696d;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f3697e;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                Uri uri = this.f3698f;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0174d.m356l(sb, this.f3699g != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1068d
    /* JADX INFO: renamed from: v */
    public void mo150v(int i2) {
        this.f3697e = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1070e(C1070e c1070e) {
        ClipData clipData = c1070e.f3695c;
        clipData.getClass();
        this.f3695c = clipData;
        int i2 = c1070e.f3696d;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f3696d = i2;
        int i3 = c1070e.f3697e;
        if ((i3 & 1) == i3) {
            this.f3697e = i3;
            this.f3698f = c1070e.f3698f;
            this.f3699g = c1070e.f3699g;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
