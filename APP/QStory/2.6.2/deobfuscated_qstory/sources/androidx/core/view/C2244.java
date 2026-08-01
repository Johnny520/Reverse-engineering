package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.activity.AbstractC0053;
import java.util.Locale;
import p022.C6267;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2244 implements InterfaceC2245, InterfaceC2261 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Uri f6538;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6539;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Bundle f6540;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ClipData f6541;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6542;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6543 = 0;

    public C2244(C2244 c2244) {
        ClipData clipData = c2244.f6541;
        clipData.getClass();
        this.f6541 = clipData;
        int i = c2244.f6542;
        if (i < 0) {
            Locale locale = Locale.US;
            C5919.m11249("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            C5919.m11249("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f6542 = i;
        int i2 = c2244.f6539;
        if ((i2 & 1) != i2) {
            C6267.m11758("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.f6539 = i2;
        this.f6538 = c2244.f6538;
        this.f6540 = c2244.f6540;
    }

    @Override // androidx.core.view.InterfaceC2245
    public C2260 build() {
        return new C2260(new C2244(this));
    }

    @Override // androidx.core.view.InterfaceC2245
    public void setExtras(Bundle bundle) {
        this.f6540 = bundle;
    }

    public String toString() {
        String str;
        switch (this.f6543) {
            case 1:
                Uri uri = this.f6538;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f6541.getDescription());
                sb.append(", source=");
                int i = this.f6542;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f6539;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0053.m146(sb, this.f6540 != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // androidx.core.view.InterfaceC2261
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public ContentInfo mo4144() {
        return null;
    }

    @Override // androidx.core.view.InterfaceC2245
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo436(Uri uri) {
        this.f6538 = uri;
    }

    @Override // androidx.core.view.InterfaceC2261
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public ClipData mo4151() {
        return this.f6541;
    }

    @Override // androidx.core.view.InterfaceC2261
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public int mo4152() {
        return this.f6542;
    }

    @Override // androidx.core.view.InterfaceC2261
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo4153() {
        return this.f6539;
    }

    @Override // androidx.core.view.InterfaceC2245
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo448(int i) {
        this.f6539 = i;
    }

    public /* synthetic */ C2244() {
    }
}
