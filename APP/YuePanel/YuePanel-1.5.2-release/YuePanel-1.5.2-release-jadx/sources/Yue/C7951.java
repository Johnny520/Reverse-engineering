package Yue;

import android.os.Trace;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7951 {
    @InterfaceC4372(message = "Use androidx.tracing.Trace instead", replaceWith = @InterfaceC7097(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    /* JADX INFO: renamed from: ۥ */
    public static final <T> T m3974(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        Trace.beginSection(str);
        try {
            return interfaceC5122.invoke();
        } finally {
            C5437.m16930(1);
            Trace.endSection();
            C5437.m16929(1);
        }
    }
}
