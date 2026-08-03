package p056f0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.widget.EditText;
import com.abc.core.hooks.ModuleLog;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p049b0.C0569s;
import p050c0.C0614O1;
import p050c0.C0617P1;

/* JADX INFO: renamed from: f0.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0840s implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3033b;

    public /* synthetic */ C0840s(int r1, Object r2) {
        this.f3032a = r1;
        this.f3033b = r2;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        C0146l r2 = C0146l.f339a;
        Object r3 = this.f3033b;
        switch(this.f3032a) {
            case 0: goto L25;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Context r32 = (Context) r3;
        AbstractC0307g.m703e(r32, "$appContext");
        C0569s r02 = AbstractC0358S.m882d0(r32);
        AtomicBoolean r1 = C0820c0.f2976a;
        C0820c0.m2130d("wechat " + r02.m1383a() + " range=微信 8.0.69–8.0.76（国服 / Play）");
        ModuleLog.INSTANCE.m1813i("当前微信: " + r02.m1383a());
        return r2;
    L6:
        AbstractC0307g.m703e((ClassLoader) r3, "$cl");
        C0617P1 r33 = C0617P1.f1903a;
        if (C0617P1.f1904b.compareAndSet(false, true) == true) goto L32;
    L24:
        return r2;
    L32:
        Object r03 = AbstractC0358S.m904q(Activity.class, "onResume", new Object[]{new C0614O1(1)});     // Catch: Throwable -> L11
    L13:
        Throwable r04 = AbstractC0141g.m465a(r03);
        C0617P1 r4 = C0617P1.f1903a;
        if (r04 == null) goto L30;
        C0617P1.m1515c("hook onResume failed: " + r04.getMessage());
    L30:
        Class r42 = Integer.TYPE;     // Catch: Throwable -> L18
        Object r05 = AbstractC0358S.m904q(Activity.class, "onActivityResult", new Object[]{r42, r42, Intent.class, new C0614O1(0)});     // Catch: Throwable -> L18
    L20:
        Throwable r06 = AbstractC0141g.m465a(r05);
        if (r06 == null) goto L23;
        C0617P1.m1515c("hook onActivityResult failed: " + r06.getMessage());
    L23:
        C0617P1.m1515c("map pick bridge installed");
    L18:
        th = move-exception;
        r05 = AbstractC0040p.m116u(th);
    L11:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L13
    L25:
        C0798I r34 = (C0798I) r3;
        AbstractC0307g.m703e(r34, "$template");
        EditText r07 = r34.f2899b;
        Editable r12 = r07.getText();
        if (r12 == null) goto L28;
        r12.clear();
    L28:
        r07.append("今日已发${totalMsg}条");
        return r2;
    }
}
