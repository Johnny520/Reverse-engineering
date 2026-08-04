package yyds;

import android.content.ComponentName;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛳᲀᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0685 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3256;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f3257;

    public /* synthetic */ C0685(MainActivity mainActivity, int i) {
        this.f3256 = i;
        this.f3257 = mainActivity;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        int i = this.f3256;
        C2746 c2746 = C2746.f13459;
        MainActivity mainActivity = this.f3257;
        switch (i) {
            case 0:
                List list = MainActivity.f451;
                mainActivity.m324();
                return c2746;
            case 1:
                List list2 = MainActivity.f451;
                mainActivity.m339();
                return c2746;
            case 2:
                List list3 = MainActivity.f451;
                mainActivity.m339();
                return c2746;
            case 3:
                List list4 = MainActivity.f451;
                mainActivity.m339();
                return c2746;
            case 4:
                List list5 = MainActivity.f451;
                mainActivity.m324();
                return c2746;
            default:
                List list6 = MainActivity.f451;
                String packageName = mainActivity.getPackageName();
                String name = MainActivity.class.getName();
                AbstractC2328.m4341(-271527405323118L);
                int iM1307 = AbstractC0473.m1307(name, '.', 0, 6);
                if (iM1307 != -1) {
                    name = name.substring(0, iM1307);
                }
                return new ComponentName(packageName, name.concat(AbstractC2328.m4341(-271583239897966L)));
        }
    }
}
