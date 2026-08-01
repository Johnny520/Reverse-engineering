package p146jd;

import android.graphics.Bitmap;
import cd.C1517b;
import java.lang.reflect.Method;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;

/* JADX INFO: renamed from: jd.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3842g extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Method f11029e;

    public C3842g() {
        this.f6040c = "CircleAvatarHook";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m15276n(InterfaceC5154i interfaceC5154i) {
        Bitmap bitmap;
        if (m7973i()) {
            Object[] args = interfaceC5154i.getArgs();
            if (!(args[2] instanceof Float) || (bitmap = (Bitmap) args[0]) == null || bitmap.isRecycled()) {
                return;
            }
            args[2] = Float.valueOf((Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2.0f) * m7968d("circle_arc", 0.1f) * 2.0f);
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        Method method = C1517b.findMethod().pkg("com.tencent.mm.sdk.platformtools").returnType("android.graphics.Bitmap").usingStrings("MicroMsg.BitmapUtil", "getRoundedCornerBitmap in bitmap is null").paramCount(5).get();
        this.f11029e = method;
        return method != null;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookBefore(this.f11029e, new InterfaceC5156k() { // from class: jd.f
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f11028a.m15276n(interfaceC5154i);
            }
        });
    }
}
