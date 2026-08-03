package p242q8;

import android.content.Intent;
import android.text.TextUtils;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: q8.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3455j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3458m f11206a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a1.a.e():void] */
    public /* synthetic */ C3455j(C3458m c3458m) {
        this.f11206a = c3458m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7255a(Intent intent, Method method) {
        C3458m c3458m = this.f11206a;
        c3458m.getClass();
        String className = intent.getComponent() != null ? intent.getComponent().getClassName() : HttpUrl.FRAGMENT_ENCODE_SET;
        String strM7257g = C3458m.m7257g(intent);
        if (TextUtils.isEmpty(strM7257g)) {
            return;
        }
        c3458m.f11221k = strM7257g;
        if ((TextUtils.isEmpty(className) || !("com.tencent.mm.ui.chatting.ChattingUI".equals(className) || className.contains(".ui.chatting."))) && TextUtils.isEmpty(C3458m.m7257g(intent))) {
            return;
        }
        if (TextUtils.isEmpty(className)) {
            method.getName();
        }
        c3458m.m7260c(strM7257g);
    }
}
