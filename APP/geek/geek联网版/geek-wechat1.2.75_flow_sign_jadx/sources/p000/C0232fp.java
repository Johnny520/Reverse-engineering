package p000;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: fp */
/* JADX INFO: loaded from: classes.dex */
public final class C0232fp extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0633qh f1817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232fp(InputConnection inputConnection, C0633qh c0633qh) {
        super(inputConnection, false);
        this.f1817a = c0633qh;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0370jd c0431l0;
        C0431l0 c0431l02 = inputContentInfo == null ? null : new C0431l0(17, new C0431l0(16, inputContentInfo));
        C0842w3 c0842w3 = (C0842w3) this.f1817a.f3907a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((C0431l0) c0431l02.f2886b).f2886b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0431l0) c0431l02.f2886b).f2886b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((C0431l0) c0431l02.f2886b).f2886b;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0431l0 = new C0431l0(clipData, 2);
        } else {
            C0407kd c0407kd = new C0407kd();
            c0407kd.f2819b = clipData;
            c0407kd.f2820c = 2;
            c0431l0 = c0407kd;
        }
        c0431l0.mo1602m(inputContentInfo3.getLinkUri());
        c0431l0.setExtras(bundle2);
        if (oa0.m2008h(c0842w3, c0431l0.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
