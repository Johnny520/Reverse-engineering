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
import p006D.InterfaceC0097e;

/* JADX INFO: renamed from: I.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0208b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0037m f424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208b(InputConnection inputConnection, C0037m c0037m) {
        super(inputConnection, false);
        this.f424a = c0037m;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0097e c0095d;
        C0095d c0095d2 = inputContentInfo == null ? null : new C0095d(6, new C0095d(inputContentInfo));
        C0037m c0037m = this.f424a;
        c0037m.getClass();
        if ((i2 & 1) != 0) {
            try {
                ((C0095d) c0095d2.f251b).m359z();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0095d) c0095d2.f251b).f251b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((C0095d) c0095d2.f251b).f251b).getDescription();
        C0095d c0095d3 = (C0095d) c0095d2.f251b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) c0095d3.f251b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0095d = new C0095d(clipData, 2);
        } else {
            C0099f c0099f = new C0099f();
            c0099f.f258b = clipData;
            c0099f.f259c = 2;
            c0095d = c0099f;
        }
        c0095d.mo342e(((InputContentInfo) c0095d3.f251b).getLinkUri());
        c0095d.mo340b(bundle2);
        if (AbstractC0080Q.m287f((View) c0037m.f91a, c0095d.mo347m()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
