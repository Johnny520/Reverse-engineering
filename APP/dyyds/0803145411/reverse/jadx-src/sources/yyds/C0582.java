package yyds;

import android.R;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: yyds.ᛳᛵᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0582 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final CharSequence f2784;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Bundle f2785;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public IconCompat f2786;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f2787;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final PendingIntent f2788;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2789;

    public C0582(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatM97 = IconCompat.m97(R.drawable.ic_delete);
        Bundle bundle = new Bundle();
        this.f2787 = true;
        this.f2786 = iconCompatM97;
        int i = iconCompatM97.f265;
        if ((i == -1 ? ((Icon) iconCompatM97.f266).getType() : i) == 2) {
            this.f2789 = iconCompatM97.m98();
        }
        this.f2784 = C2619.m4724(str);
        this.f2788 = pendingIntent;
        this.f2785 = bundle;
        this.f2787 = true;
    }
}
