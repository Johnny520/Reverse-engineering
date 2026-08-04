package yyds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: yyds.ᛱᛸᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0192 extends InterfaceC0454 {
    Activity getActivity();

    Bundle getArguments();

    boolean isAdded();

    boolean isRemoving();

    void requestPermissions(String[] strArr, int i);

    void setArguments(Bundle bundle);

    void setRetainInstance(boolean z);

    @Override // yyds.InterfaceC0454
    /* synthetic */ void startActivity(Intent intent);

    @Override // yyds.InterfaceC0454
    /* synthetic */ void startActivityForResult(Intent intent, int i);
}
