package p179m2;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import okhttp3.internal.url._UrlKt;
import p319w2.C9058e;

/* JADX INFO: renamed from: m2.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4868l implements InterfaceC4855i1 {

    /* JADX INFO: renamed from: a */
    public final ClipboardManager f14492a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4868l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this((ClipboardManager) systemService);
    }

    @Override // p179m2.InterfaceC4855i1
    /* JADX INFO: renamed from: a */
    public void mo19398a(C9058e c9058e) {
        this.f14492a.setPrimaryClip(ClipData.newPlainText("plain text", AbstractC4873m.m19485a(c9058e)));
    }

    /* JADX INFO: renamed from: b */
    public C4845g1 m19431b() {
        ClipData primaryClip = this.f14492a.getPrimaryClip();
        if (primaryClip != null) {
            return new C4845g1(primaryClip);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m19432c() {
        ClipDescription primaryClipDescription = this.f14492a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m19433d(C4845g1 c4845g1) {
        if (c4845g1 != null) {
            this.f14492a.setPrimaryClip(c4845g1.m19353a());
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        ClipboardManager clipboardManager = this.f14492a;
        if (i10 >= 28) {
            C4929x0.m19914a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET));
        }
    }

    public C4868l(ClipboardManager clipboardManager) {
        this.f14492a = clipboardManager;
    }
}
