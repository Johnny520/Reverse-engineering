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

    public C2507sl(InputConnection r1, C2464rl r2) {
        this.f8795a = r2;
        super(r1, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo r8, int r9, Bundle r10) {
        if (r8 != null) goto L4;
        C0132D2 r0 = null;
    L5:
        C0348I3 r1 = (C0348I3) this.f8795a.f8687b;
        if ((r9 & 1) != 0) goto L25;
        Bundle r3 = r10;
    L14:
        InputContentInfo r02 = (InputContentInfo) ((C0132D2) r0.f328b).f328b;
        ClipData r2 = new ClipData(r02.getDescription(), new ClipData.Item(r02.getContentUri()));
        if (Build.VERSION.SDK_INT < 31) goto L17;
        InterfaceC2669wb r4 = new C0132D2(r2, 2);
    L18:
        r4.mo242o(r02.getLinkUri());
        r4.setExtras(r3);
        if (AbstractC2185lE.m4395h(r1, r4.build()) != null) goto L23;
        return true;
    L23:
        return super.commitContent(r8, r9, r10);
    L17:
        C2712xb r42 = new C2712xb();
        r42.f9286b = r2;
        r42.f9287c = 2;
        r4 = r42;
        goto L18
    L25:
        ((InputContentInfo) ((C0132D2) r0.f328b).f328b).requestPermission();     // Catch: Exception -> L24
        InputContentInfo r22 = (InputContentInfo) ((C0132D2) r0.f328b).f328b;
        if (r10 != null) goto L11;
        r3 = new Bundle();
    L12:
        r3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", r22);
        goto L14
    L11:
        r3 = new Bundle(r10);
        goto L12
    L4:
        C0132D2 r12 = new C0132D2(26, r8);
        r0 = new C0132D2(27, r12);
        goto L5
    }
}
