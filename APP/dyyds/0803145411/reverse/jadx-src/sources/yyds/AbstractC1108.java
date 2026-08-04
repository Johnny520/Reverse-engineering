package yyds;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: yyds.ᛵᛶᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1108 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final AtomicLong f5116 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2308(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String str = AbstractC2328.m4341(-383187965084526L) + (new SimpleDateFormat(AbstractC2328.m4341(-383123540575086L)).format(new Date()) + '_' + f5116.incrementAndGet()) + AbstractC2328.m4341(-383226619790190L);
            C2701.f13261.getClass();
            AbstractC2667.m4760(C2701.m4805(str), AbstractC2797.m4923().m515(obj));
        } catch (Exception e) {
            C2336.f11496.m4354(AbstractC2328.m4341(-383252389593966L) + e.getMessage());
        }
    }
}
