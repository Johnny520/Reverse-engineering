package p015I;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p001A0.C0037m;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p006D.C0099f;
import p006D.C0103h;
import p006D.InterfaceC0097e;

/* JADX INFO: renamed from: I.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0208b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0037m f424a;

    public C0208b(InputConnection r1, C0037m r2) {
        this.f424a = r2;
        super(r1, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo r8, int r9, Bundle r10) {
        if (r8 != null) goto L4;
        C0095d r02 = null;
    L5:
        C0037m r1 = this.f424a;
        r1.getClass();
        if ((r9 & 1) != 0) goto L25;
        Bundle r3 = r10;
    L14:
        ClipDescription r4 = ((InputContentInfo) ((C0095d) r02.f251b).f251b).getDescription();
        C0095d r03 = (C0095d) r02.f251b;
        ClipData r2 = new ClipData(r4, new ClipData.Item(((InputContentInfo) r03.f251b).getContentUri()));
        if (Build.VERSION.SDK_INT < 31) goto L17;
        InterfaceC0097e r42 = new C0095d(r2, 2);
    L18:
        r42.mo342e(((InputContentInfo) r03.f251b).getLinkUri());
        r42.mo340b(r3);
        C0103h r04 = r42.mo347m();
        if (AbstractC0080Q.m287f((View) r1.f91a, r04) != null) goto L23;
        return true;
    L23:
        return super.commitContent(r8, r9, r10);
    L17:
        C0099f r43 = new C0099f();
        r43.f258b = r2;
        r43.f259c = 2;
        r42 = r43;
        goto L18
    L25:
        ((C0095d) r02.f251b).m359z();     // Catch: Exception -> L24
        InputContentInfo r22 = (InputContentInfo) ((C0095d) r02.f251b).f251b;
        if (r10 != null) goto L11;
        r3 = new Bundle();
    L12:
        r3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", r22);
        goto L14
    L11:
        r3 = new Bundle(r10);
        goto L12
    L4:
        int r23 = 6;
        r02 = new C0095d(r23, new C0095d(r8));
        goto L5
    }
}
