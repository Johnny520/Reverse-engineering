package com.p001mr.elaris;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.mr.elaris.r */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0164r implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f150b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0164r(Context context, Object obj) {
        this.f149a = context;
        this.f150b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if ("invoke".equals(method.getName())) {
            QQSettingsEntryHooks.openModuleSettings(this.f149a);
        }
        return this.f150b;
    }
}
