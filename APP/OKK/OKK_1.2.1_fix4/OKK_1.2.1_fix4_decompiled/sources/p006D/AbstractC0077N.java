package p006D;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: D.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0077N {
    /* JADX INFO: renamed from: a */
    public static String[] m279a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0103h m280b(View view, C0103h c0103h) {
        ContentInfo contentInfoMo354t = c0103h.f270a.mo354t();
        Objects.requireNonNull(contentInfoMo354t);
        ContentInfo contentInfoM330g = AbstractC0093c.m330g(contentInfoMo354t);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM330g);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM330g ? c0103h : new C0103h(new C0095d(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: c */
    public static void m281c(View view, String[] strArr, InterfaceC0123r interfaceC0123r) {
        if (interfaceC0123r == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0078O(interfaceC0123r));
        }
    }
}
