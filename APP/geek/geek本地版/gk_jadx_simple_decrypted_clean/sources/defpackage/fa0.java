package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa0 {
    public static String[] a(View r0) {
        return r0.getReceiveContentMimeTypes();
    }

    public static cd b(View r1, cd r2) {
        ContentInfo r0 = r2.a.h();
        Objects.requireNonNull(r0);
        ContentInfo r02 = p7.h(r0);
        ContentInfo r12 = r1.performReceiveContent(r02);
        if (r12 != null) goto L6;
        return null;
    L6:
        if (r12 != r02) goto L9;
        return r2;
    L9:
        return new cd(new l0(r12));
    }

    public static void c(View r1, String[] r2, ax r3) {
        if (r3 != null) goto L5;
        r1.setOnReceiveContentListener(r2, null);
        return;
    L5:
        r1.setOnReceiveContentListener(r2, new ga0(r3));
    }
}
