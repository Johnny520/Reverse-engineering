package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka0 {
    /* JADX INFO: renamed from: a */
    public static String[] m1672a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0481md m1673b(View view, C0481md c0481md) {
        ContentInfo contentInfoMo1679h = c0481md.f3129a.mo1679h();
        Objects.requireNonNull(contentInfoMo1679h);
        ContentInfo contentInfoM2805h = AbstractC0957z7.m2805h(contentInfoMo1679h);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM2805h);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM2805h ? c0481md : new C0481md(new C0431l0(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: c */
    public static void m1674c(View view, String[] strArr, InterfaceC0353ix interfaceC0353ix) {
        if (interfaceC0353ix == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new la0(interfaceC0353ix));
        }
    }
}
