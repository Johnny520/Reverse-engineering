package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: sl */
/* JADX INFO: loaded from: classes.dex */
public final class C2507sl extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2464rl f8795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2507sl(InputConnection inputConnection, C2464rl c2464rl) {
        super(inputConnection, false);
        this.f8795a = c2464rl;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC2669wb c0132d2;
        C0132D2 c0132d22 = inputContentInfo == null ? null : new C0132D2(27, new C0132D2(26, inputContentInfo));
        C0348I3 c0348i3 = (C0348I3) this.f8795a.f8687b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C0132D2) c0132d22.f328b).f328b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0132D2) c0132d22.f328b).f328b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((C0132D2) c0132d22.f328b).f328b;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0132d2 = new C0132D2(clipData, 2);
        } else {
            C2712xb c2712xb = new C2712xb();
            c2712xb.f9286b = clipData;
            c2712xb.f9287c = 2;
            c0132d2 = c2712xb;
        }
        c0132d2.mo242o(inputContentInfo3.getLinkUri());
        c0132d2.setExtras(bundle2);
        if (AbstractC2185lE.m4395h(c0348i3, c0132d2.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
