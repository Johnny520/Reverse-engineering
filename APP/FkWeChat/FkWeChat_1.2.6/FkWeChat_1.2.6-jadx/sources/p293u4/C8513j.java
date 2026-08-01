package p293u4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;

/* JADX INFO: renamed from: u4.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8513j {

    /* JADX INFO: renamed from: a */
    public static final C8513j f28405a = new C8513j();

    /* JADX INFO: renamed from: a */
    public final Context m32764a(Context context) {
        context.getClass();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return baseContext;
            }
            if (baseContext instanceof InputMethodService) {
                return baseContext;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                return baseContext;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        return context;
    }
}
