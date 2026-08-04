package yyds;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: yyds.ᛶᛲᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1280 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1908 f5882;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280(InputConnection inputConnection, C1908 c1908) {
        super(inputConnection, false);
        this.f5882 = c1908;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0375 c0052;
        C0052 c00522 = inputContentInfo == null ? null : new C0052(29, new C0052(28, inputContentInfo));
        C0555 c0555 = (C0555) this.f5882.f9647;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C0052) c00522.f551).f551).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0052) c00522.f551).f551;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((C0052) c00522.f551).f551;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0052 = new C0052(clipData, 2);
        } else {
            C2686 c2686 = new C2686();
            c2686.f13159 = clipData;
            c2686.f13155 = 2;
            c0052 = c2686;
        }
        c0052.mo394(inputContentInfo3.getLinkUri());
        c0052.setExtras(bundle2);
        if (AbstractC1640.m3345(c0555, c0052.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
