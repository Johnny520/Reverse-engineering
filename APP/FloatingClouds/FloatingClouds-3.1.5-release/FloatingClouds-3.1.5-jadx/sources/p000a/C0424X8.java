package p000a;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000a.C0401W3;
import p000a.C0442Y8;

/* JADX INFO: renamed from: a.X8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0424X8 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0080E5 f1590a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0424X8(InputConnection inputConnection, C0080E5 c0080e5) {
        super(inputConnection, false);
        this.f1590a = c0080e5;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        C0401W3.b aVar;
        C0442Y8 c0442y8 = inputContentInfo == null ? null : new C0442Y8(new C0442Y8.a(inputContentInfo));
        C0080E5 c0080e5 = this.f1590a;
        if ((i & 1) != 0) {
            try {
                c0442y8.f1650a.f1651a.requestPermission();
                InputContentInfo inputContentInfo2 = c0442y8.f1650a.f1651a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = c0442y8.f1650a.f1651a.getDescription();
        C0442Y8.a aVar2 = c0442y8.f1650a;
        ClipData clipData = new ClipData(description, new ClipData.Item(aVar2.f1651a.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new C0401W3.a(clipData, 2);
        } else {
            C0401W3.c cVar = new C0401W3.c();
            cVar.f1530a = clipData;
            cVar.f1531b = 2;
            aVar = cVar;
        }
        aVar.mo1042b(aVar2.f1651a.getLinkUri());
        aVar.setExtras(bundle2);
        if (C0866ug.m1999f((C0452Z0) c0080e5.f260a, aVar.mo1041a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
