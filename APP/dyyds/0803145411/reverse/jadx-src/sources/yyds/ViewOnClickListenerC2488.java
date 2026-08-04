package yyds;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᲇᛷᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2488 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f12287;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12288;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Context f12289;

    public /* synthetic */ ViewOnClickListenerC2488(Context context, String str, int i) {
        this.f12288 = i;
        this.f12289 = context;
        this.f12287 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12288;
        String str = this.f12287;
        Context context = this.f12289;
        switch (i) {
            case 0:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C2474(context, str, null, 2), 3);
                break;
            case 1:
                try {
                    Object systemService = context.getSystemService(AbstractC2328.m4341(-1041640811299694L));
                    AbstractC2328.m4341(-1041683760972654L);
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC2328.m4341(-1041984408683374L), str));
                    AbstractC1960.m3789(AbstractC2328.m4341(-1042005883519854L));
                    C1327 c1327 = C1327.f6093;
                    C1327.m2618(context);
                } catch (Exception e) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-1042040243258222L) + e.getMessage());
                    return;
                }
                break;
            case 2:
                C0469.m1259(C0469.f2328, this.f12289, null, this.f12287, null, 58);
                break;
            default:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0715(context, str, null, 1), 3);
                break;
        }
    }
}
