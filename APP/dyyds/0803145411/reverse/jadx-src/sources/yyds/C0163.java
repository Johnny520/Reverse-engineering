package yyds;

import android.content.Context;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛱᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0163 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f981;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f982;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1323 f983;

    public /* synthetic */ C0163(C1323 c1323, Context context, int i) {
        this.f982 = i;
        this.f983 = c1323;
        this.f981 = context;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object mo731() {
        int i = this.f982;
        C2746 c2746 = C2746.f13459;
        Context context = this.f981;
        C1323 c1323 = this.f983;
        switch (i) {
            case 0:
                C0469 c0469 = C0469.f2328;
                StringBuilder sb = new StringBuilder(c1323.f6082);
                sb.append('\n');
                String str = c1323.f6083;
                if (!AbstractC0473.m1313(str)) {
                    sb.append(str);
                    sb.append('\n');
                }
                for (C1653 c1653 : c1323.f6084) {
                    sb.append('\n');
                    sb.append("[" + c1653.f8445 + ']');
                    sb.append('\n');
                    for (Pair pair : c1653.f8446) {
                        String str2 = (String) pair.component1();
                        String str3 = (String) pair.component2();
                        sb.append(str2);
                        sb.append(AbstractC2328.m4341(-113640112554862L));
                        sb.append(str3);
                        sb.append('\n');
                    }
                }
                c0469.m1276(context, AbstractC0473.m1314(sb.toString()).toString(), AbstractC2328.m4341(-212411475460974L));
                break;
            default:
                C0469.f2328.m1276(context, c1323.f6085, AbstractC2328.m4341(-212445835199342L));
                break;
        }
        return c2746;
    }
}
