package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.activity.AbstractC0900;
import java.util.Locale;
import p035.C7092;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3077 implements InterfaceC3078, InterfaceC3094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Uri f6884;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6885;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Bundle f6886;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ClipData f6887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6888;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6889 = 0;

    public C3077(C3077 c3077) {
        ClipData clipData = c3077.f6887;
        clipData.getClass();
        this.f6887 = clipData;
        int i = c3077.f6888;
        if (i < 0) {
            Locale locale = Locale.US;
            C6755.m11869("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            C6755.m11869("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f6888 = i;
        int i2 = c3077.f6885;
        if ((i2 & 1) != i2) {
            C7092.m12334("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.f6885 = i2;
        this.f6884 = c3077.f6884;
        this.f6886 = c3077.f6886;
    }

    @Override // androidx.core.view.InterfaceC3078
    public C3093 build() {
        return new C3093(new C3077(this));
    }

    @Override // androidx.core.view.InterfaceC3078
    public void setExtras(Bundle bundle) {
        this.f6886 = bundle;
    }

    public String toString() {
        String str;
        switch (this.f6889) {
            case 1:
                Uri uri = this.f6884;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f6887.getDescription());
                sb.append(", source=");
                int i = this.f6888;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f6885;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC0900.m711(sb, this.f6886 != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public ContentInfo mo4714() {
        return null;
    }

    @Override // androidx.core.view.InterfaceC3078
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo997(Uri uri) {
        this.f6884 = uri;
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public ClipData mo4721() {
        return this.f6887;
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public int mo4722() {
        return this.f6888;
    }

    @Override // androidx.core.view.InterfaceC3094
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo4723() {
        return this.f6885;
    }

    @Override // androidx.core.view.InterfaceC3078
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo1009(int i) {
        this.f6885 = i;
    }

    public /* synthetic */ C3077() {
    }
}
