package yyds;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: yyds.ᛴᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0957 extends DataSetObserver {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4423;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f4424;

    public /* synthetic */ C0957(int i, Object obj) {
        this.f4423 = i;
        this.f4424 = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.f4423;
        Object obj = this.f4424;
        switch (i) {
            case 0:
                ViewOnClickListenerC1975 viewOnClickListenerC1975 = (ViewOnClickListenerC1975) obj;
                viewOnClickListenerC1975.f8082 = true;
                viewOnClickListenerC1975.notifyDataSetChanged();
                break;
            default:
                AbstractC2352 abstractC2352 = (AbstractC2352) obj;
                if (abstractC2352.f11541.isShowing()) {
                    abstractC2352.show();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.f4423;
        Object obj = this.f4424;
        switch (i) {
            case 0:
                ViewOnClickListenerC1975 viewOnClickListenerC1975 = (ViewOnClickListenerC1975) obj;
                viewOnClickListenerC1975.f8082 = false;
                viewOnClickListenerC1975.notifyDataSetInvalidated();
                break;
            default:
                ((AbstractC2352) obj).dismiss();
                break;
        }
    }
}
