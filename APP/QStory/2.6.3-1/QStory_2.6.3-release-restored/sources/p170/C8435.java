package p170;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.app.C0960;
import androidx.appcompat.widget.C0975;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3077;
import androidx.core.view.InterfaceC3078;
import androidx.fragment.app.C3191;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8435 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3191 f20972;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8435(InputConnection inputConnection, C3191 c3191) {
        super(inputConnection, false);
        this.f20972 = c3191;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC3078 c0960;
        C6686 c6686 = inputContentInfo == null ? null : new C6686(new C6686(inputContentInfo, 13), 14);
        C0975 c0975 = (C0975) this.f20972.f7331;
        boolean z = false;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C6686) c6686.f16359).f16359).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C6686) c6686.f16359).f16359;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        C6686 c66862 = (C6686) c6686.f16359;
        C6686 c66863 = (C6686) c6686.f16359;
        ClipData clipData = new ClipData(((InputContentInfo) c66862.f16359).getDescription(), new ClipData.Item(((InputContentInfo) c66863.f16359).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0960 = new C0960(clipData, 2);
        } else {
            C3077 c3077 = new C3077();
            c3077.f6887 = clipData;
            c3077.f6888 = 2;
            c0960 = c3077;
        }
        c0960.mo997(((InputContentInfo) c66863.f16359).getLinkUri());
        c0960.setExtras(bundle2);
        if (AbstractC3103.m4807(c0975, c0960.build()) == null) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
