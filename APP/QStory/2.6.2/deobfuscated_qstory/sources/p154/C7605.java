package p154;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.app.C0113;
import androidx.appcompat.widget.C0128;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2244;
import androidx.core.view.InterfaceC2245;
import androidx.fragment.app.C2358;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7605 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2358 f20632;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7605(InputConnection inputConnection, C2358 c2358) {
        super(inputConnection, false);
        this.f20632 = c2358;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC2245 c0113;
        C5851 c5851 = inputContentInfo == null ? null : new C5851(new C5851(inputContentInfo, 13), 14);
        C0128 c0128 = (C0128) this.f20632.f6985;
        boolean z = false;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C5851) c5851.f16007).f16007).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C5851) c5851.f16007).f16007;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        C5851 c58512 = (C5851) c5851.f16007;
        C5851 c58513 = (C5851) c5851.f16007;
        ClipData clipData = new ClipData(((InputContentInfo) c58512.f16007).getDescription(), new ClipData.Item(((InputContentInfo) c58513.f16007).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0113 = new C0113(clipData, 2);
        } else {
            C2244 c2244 = new C2244();
            c2244.f6541 = clipData;
            c2244.f6542 = 2;
            c0113 = c2244;
        }
        c0113.mo436(((InputContentInfo) c58513.f16007).getLinkUri());
        c0113.setExtras(bundle2);
        if (AbstractC2270.m4237(c0128, c0113.build()) == null) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
