package p179m2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: m2.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4889p0 implements InterfaceC4837e3 {

    /* JADX INFO: renamed from: a */
    public final Context f14597a;

    public C4889p0(Context context) {
        this.f14597a = context;
    }

    @Override // p179m2.InterfaceC4837e3
    /* JADX INFO: renamed from: a */
    public void mo19336a(String str) {
        try {
            this.f14597a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
