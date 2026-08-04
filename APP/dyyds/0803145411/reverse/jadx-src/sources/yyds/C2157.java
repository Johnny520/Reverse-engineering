package yyds;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᛱᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2157 extends AbstractC0333 {
    public static final Parcelable.Creator<C2157> CREATOR = new C1499(6);

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final boolean mo1013(Context context, boolean z) {
        return AbstractC1897.m3679().mo1020(context, z);
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1015() {
        return 33;
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1017(Activity activity, ArrayList arrayList, C0913 c0913, ArrayList arrayList2, C1859 c1859) {
        super.mo1017(activity, arrayList, c0913, arrayList2, c1859);
        if (33 > activity.getApplicationInfo().minSdkVersion) {
            AbstractC0333.m1009(AbstractC0333.m1010("android.permission.READ_EXTERNAL_STORAGE", arrayList2), "android.permission.READ_EXTERNAL_STORAGE", 32);
        }
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final List mo1018() {
        return AbstractC0879.m1963(AbstractC1897.m3679());
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final String mo1021() {
        return "android.permission.READ_MEDIA_AUDIO";
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1022(Activity activity, ArrayList arrayList) {
        if (AbstractC0879.m1962("android.permission.READ_EXTERNAL_STORAGE", arrayList)) {
            C0188.m798("You have added the \"android.permission.READ_MEDIA_AUDIO\" permission, please do not add the \"android.permission.READ_EXTERNAL_STORAGE\" permission, this conflicts with the framework's automatic compatibility policy.");
        }
    }
}
