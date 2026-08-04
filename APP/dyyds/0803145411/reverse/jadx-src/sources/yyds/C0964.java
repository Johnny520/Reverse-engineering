package yyds;

import android.app.Activity;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛴᲁᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0964 extends AbstractC0333 {
    public static final Parcelable.Creator<C0964> CREATOR = new C1499(9);

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final String mo1014() {
        return "image_and_video_media_group";
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1015() {
        return 34;
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final String mo1021() {
        return "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1022(Activity activity, ArrayList arrayList) {
        if (AbstractC0879.m1962("android.permission.READ_MEDIA_IMAGES", arrayList) || AbstractC0879.m1962("android.permission.READ_MEDIA_VIDEO", arrayList)) {
            return;
        }
        C0188.m798("You cannot request the \"android.permission.READ_MEDIA_VISUAL_USER_SELECTED\" permission alone. must add either \"android.permission.READ_MEDIA_IMAGES\" or \"android.permission.READ_MEDIA_VIDEO\" permission, or maybe both");
    }

    @Override // yyds.AbstractC0333
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo1023(Activity activity) {
        return 33;
    }
}
