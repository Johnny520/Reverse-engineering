package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class bp extends InputConnectionWrapper {
    public final /* synthetic */ oh a;

    public bp(InputConnection r1, oh r2) {
        this.a = r2;
        super(r1, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo r8, int r9, Bundle r10) {
        if (r8 != null) goto L4;
        l0 r0 = null;
    L5:
        w3 r1 = (w3) this.a.a;
        if ((r9 & 1) != 0) goto L26;
        Bundle r3 = r10;
    L16:
        InputContentInfo r02 = (InputContentInfo) ((l0) r0.b).b;
        ClipData r2 = new ClipData(r02.getDescription(), new ClipData.Item(r02.getContentUri()));
        if (Build.VERSION.SDK_INT < 31) goto L19;
        zc r4 = new l0(r2, 2);
    L20:
        r4.m(r02.getLinkUri());
        r4.setExtras(r3);
        if (ja0.h(r1, r4.build()) != null) goto L25;
        return true;
    L25:
        return super.commitContent(r8, r9, r10);
    L19:
        ad r42 = new ad();
        r42.b = r2;
        r42.c = 2;
        r4 = r42;
        goto L20
    L26:
        ((InputContentInfo) ((l0) r0.b).b).requestPermission();     // Catch: Exception -> L13
        InputContentInfo r22 = (InputContentInfo) ((l0) r0.b).b;
        if (r10 != null) goto L11;
        r3 = new Bundle();
    L12:
        r3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", r22);
        goto L16
    L11:
        r3 = new Bundle(r10);
    L13:
        e = move-exception;
        Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
        goto L25
    L4:
        l0 r12 = new l0(16, r8);
        r0 = new l0(17, r12);
        goto L5
    }
}
