package yyds;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: yyds.ᲀᛶᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2021 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f10091;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10092 = 0;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f10093;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10094;

    public /* synthetic */ ViewOnClickListenerC2021(C1182 c1182, Context context, boolean z) {
        this.f10091 = c1182;
        this.f10093 = context;
        this.f10094 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM784;
        int i = this.f10092;
        Object obj = this.f10093;
        Object obj2 = this.f10091;
        boolean z = this.f10094;
        switch (i) {
            case 0:
                ((C1182) obj2).mo511((Context) obj, Boolean.valueOf(z));
                break;
            default:
                C1526 c1526 = (C1526) obj2;
                C2673 c2673 = (C2673) obj;
                if (z && (iM784 = c1526.m784()) != -1) {
                    ArrayList arrayList = c2673.f13120;
                    LinkedHashSet linkedHashSet = c2673.f13121;
                    String strM4765 = C2673.m4765((Aweme) arrayList.get(iM784));
                    if (!linkedHashSet.add(strM4765)) {
                        linkedHashSet.remove(strM4765);
                    }
                    c2673.m1059(iM784);
                    c2673.m4767();
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2021(boolean z, C1526 c1526, C2673 c2673) {
        this.f10094 = z;
        this.f10091 = c1526;
        this.f10093 = c2673;
    }
}
