package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa0 {
    /* JADX INFO: renamed from: a */
    public static String[] m1152a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0100cd m1153b(View view, C0100cd c0100cd) {
        ContentInfo contentInfoMo90h = c0100cd.f951a.mo90h();
        Objects.requireNonNull(contentInfoMo90h);
        ContentInfo contentInfoM2053h = AbstractC0587p7.m2053h(contentInfoMo90h);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM2053h);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM2053h ? c0100cd : new C0100cd(new C0431l0(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: c */
    public static void m1154c(View view, String[] strArr, InterfaceC0047ax interfaceC0047ax) {
        if (interfaceC0047ax == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new ga0(interfaceC0047ax));
        }
    }
}
