package yyds;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛵᲀᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1182 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f5417;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5418;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f5419;

    public /* synthetic */ C1182(C0488 c0488, Dialog dialog, Object obj) {
        this.f5418 = 2;
        this.f5419 = dialog;
        this.f5417 = obj;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        C0312 c0312;
        Object c2658;
        switch (this.f5418) {
            case 0:
                C1633 c1633 = (C1633) this.f5419;
                C0172 c0172 = (C0172) this.f5417;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC2328.m4341(-214958391067502L);
                C1937 c1937 = C1937.f9742;
                String str = ((C0324) obj).f1704;
                c1937.getClass();
                AbstractC2328.m4341(-602068088423278L);
                synchronized (C1937.f9746) {
                    C2565 c2565 = (C2565) C1937.m3733().get(str);
                    if (c2565 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C1937.m3733());
                        linkedHashMap.put(str, C2565.m4642(c2565, null, zBooleanValue, System.currentTimeMillis(), 7));
                        C1937.m3735(linkedHashMap);
                    }
                }
                Object obj3 = c0172.f997;
                if (obj3 == null) {
                    AbstractC2328.m4341(-214984160871278L);
                    c0312 = null;
                } else {
                    c0312 = (C0312) obj3;
                }
                AbstractC2071.m3949(c1633, c0312);
                AbstractC1960.m3789(AbstractC2328.m4341(zBooleanValue ? -215018520609646L : -215087240086382L));
                return C2746.f13459;
            case 1:
                String str2 = (String) this.f5419;
                C1829 c1829 = (C1829) this.f5417;
                File file = (File) obj;
                AlertDialog alertDialog = (AlertDialog) obj2;
                AbstractC2328.m4341(-954732148065134L);
                AbstractC2328.m4341(-954753622901614L);
                try {
                    C2336 c2336 = C2336.f11496;
                    c2336.m4354(AbstractC2328.m4341(-954783687672686L) + file.getAbsolutePath() + AbstractC2328.m4341(-954852407149422L) + str2);
                    File file2 = new File(str2);
                    AbstractC2667.m4761(file, file2);
                    c2336.m4354(AbstractC2328.m4341(-954912536691566L) + file2);
                    AbstractC1960.m3789(AbstractC2328.m4341(-954938306495342L));
                    C2701.f13261.getClass();
                    C2701.m4792(c1829);
                    alertDialog.dismiss();
                    break;
                } catch (Exception e) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-954959781331822L) + e, e);
                    AbstractC1960.m3791(AbstractC2328.m4341(-955041385710446L) + e.getMessage());
                }
                return C2746.f13459;
            default:
                Dialog dialog = (Dialog) this.f5419;
                Object obj4 = this.f5417;
                Context context = (Context) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AbstractC2328.m4341(-1065129987441518L);
                try {
                    c2658 = C1988.f9997.m3873(obj4);
                    break;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1065164347179886L), thM4249);
                }
                Throwable thM42492 = C2248.m4249(c2658);
                if (thM42492 != null) {
                    String strM4341 = AbstractC2328.m4341(-1065207296852846L);
                    String strM43412 = AbstractC2328.m4341(-1065233066656622L);
                    String strM43413 = AbstractC2328.m4341(-1065254541493102L);
                    String strM43414 = AbstractC2328.m4341(-1065267426394990L);
                    String message = thM42492.getMessage();
                    if (message == null) {
                        message = thM42492.getClass().getName();
                    }
                    c2658 = new C1323(strM4341, strM43412, Collections.singletonList(new C1653(strM43413, Collections.singletonList(new Pair(strM43414, message)))), AbstractC2328.m4341(-1065280311296878L));
                }
                C1323 c1323 = (C1323) c2658;
                if (dialog != null) {
                    dialog.dismiss();
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC1880(context, c1323, zBooleanValue2, 1));
                return C2746.f13459;
        }
    }

    public /* synthetic */ C1182(Object obj, int i, Object obj2) {
        this.f5418 = i;
        this.f5419 = obj;
        this.f5417 = obj2;
    }
}
