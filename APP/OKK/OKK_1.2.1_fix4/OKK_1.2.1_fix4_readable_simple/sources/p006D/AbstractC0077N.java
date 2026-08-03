package p006D;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: D.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0077N {
    /* JADX INFO: renamed from: a */
    public static String[] m279a(View r02) {
        return r02.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0103h m280b(View r1, C0103h r2) {
        ContentInfo r02 = r2.f270a.mo354t();
        Objects.requireNonNull(r02);
        ContentInfo r03 = AbstractC0093c.m330g(r02);
        ContentInfo r12 = r1.performReceiveContent(r03);
        if (r12 != null) goto L6;
        return null;
    L6:
        if (r12 != r03) goto L9;
        return r2;
    L9:
        return new C0103h(new C0095d(r12));
    }

    /* JADX INFO: renamed from: c */
    public static void m281c(View r1, String[] r2, InterfaceC0123r r3) {
        if (r3 != null) goto L4;
        r1.setOnReceiveContentListener(r2, null);
        return;
    L4:
        r1.setOnReceiveContentListener(r2, new OnReceiveContentListenerC0078O(r3));
    }
}
