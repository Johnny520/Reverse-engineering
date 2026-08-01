package p146jd;

import android.app.Activity;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p053dd.C1951c;
import p068ed.InterfaceC2214c;
import p315vd.AbstractC8921a;
import p315vd.AbstractC8924d;
import sd.C7599pg;

/* JADX INFO: renamed from: jd.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3838c implements InterfaceC2214c {

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f11027b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15269e(View.OnClickListener onClickListener, View view) {
        Activity activityM34259a;
        Object tag = view.getTag(2131829299);
        if (tag instanceof String[]) {
            String[] strArr = (String[]) tag;
            if (strArr.length == 2 && (activityM34259a = AbstractC8921a.m34259a()) != null) {
                C7599pg.m29493d(activityM34259a, strArr[0], strArr[1]);
                return;
            }
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15270f(InterfaceC5154i interfaceC5154i) {
        View view = (View) interfaceC5154i.getThisObject();
        if (view == null) {
            return;
        }
        String name = view.getClass().getName();
        if (name.contains("MaskLayout") || name.contains("AvatarImageView") || name.contains("ChattingAvatarImageView")) {
            final View.OnClickListener onClickListener = (View.OnClickListener) interfaceC5154i.getArgs()[0];
            interfaceC5154i.setArg(0, new View.OnClickListener() { // from class: jd.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3838c.m15269e(onClickListener, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m15271g() {
        if (f11027b.compareAndSet(false, true)) {
            try {
                HookEngine.hookBefore(AbstractC5161p.findMethodExact(View.class, "setOnClickListener", View.OnClickListener.class), new InterfaceC5156k() { // from class: jd.a
                    @Override // md.InterfaceC5156k
                    /* JADX INFO: renamed from: a */
                    public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                        C3838c.m15270f(interfaceC5154i);
                    }
                });
                AbstractC8924d.m34267g("AvatarHandler", "Successfully registered crash-free View.setOnClickListener hook with Keyed-Tag");
            } catch (Throwable th) {
                AbstractC8924d.m34264d("AvatarHandler", "Hook View.setOnClickListener failed", th);
            }
        }
    }

    @Override // p068ed.InterfaceC2214c
    /* JADX INFO: renamed from: b */
    public void mo7977b(View view, C1951c c1951c) {
        m15271g();
        View viewM7978c = m7978c("MaskLayout", view);
        View viewM7978c2 = m7978c("ChattingAvatarImageView", view);
        if (viewM7978c2 == null) {
            viewM7978c2 = m7978c("AvatarImageView", view);
        }
        String[] strArr = {c1951c.talker, c1951c.sendTalker};
        if (viewM7978c2 != null) {
            viewM7978c2.setTag(2131829299, strArr);
        }
        if (viewM7978c != null) {
            viewM7978c.setTag(2131829299, strArr);
        }
    }
}
