package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: kE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2137kE {
    /* JADX INFO: renamed from: a */
    public static String[] m4319a(View r0) {
        return r0.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C2798zb m4320b(View r1, C2798zb r2) {
        ContentInfo r0 = r2.f9467a.mo240m();
        Objects.requireNonNull(r0);
        ContentInfo r12 = r1.performReceiveContent(r0);
        if (r12 != null) goto L6;
        return null;
    L6:
        if (r12 != r0) goto L9;
        return r2;
    L9:
        return new C2798zb(new C0132D2(r12));
    }
}
