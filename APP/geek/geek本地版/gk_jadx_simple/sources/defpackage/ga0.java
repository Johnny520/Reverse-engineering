package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements OnReceiveContentListener {
    public final ax a;

    public ga0(ax r1) {
        this.a = r1;
    }

    public final ContentInfo onReceiveContent(View r3, ContentInfo r4) {
        cd r0 = new cd(new l0(r4));
        cd r32 = ((p60) this.a).a(r3, r0);
        if (r32 != null) goto L6;
        return null;
    L6:
        if (r32 != r0) goto L8;
        return r4;
    L8:
        ContentInfo r33 = r32.a.h();
        Objects.requireNonNull(r33);
        return p7.h(r33);
    }
}
