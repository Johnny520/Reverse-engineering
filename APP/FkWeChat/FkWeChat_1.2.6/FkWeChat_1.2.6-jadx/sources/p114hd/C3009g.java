package p114hd;

import cd.C1517b;
import java.lang.reflect.Method;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;

/* JADX INFO: renamed from: hd.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3009g extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Class f7980e;

    public C3009g() {
        this.f6040c = "LocationHook";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m11103q(InterfaceC5154i interfaceC5154i) {
        if (m7973i()) {
            if (interfaceC5154i.getArgs().length >= 3 && interfaceC5154i.getArgs()[0].getClass().getName().contains("TencentLocation")) {
                m11107s(interfaceC5154i.getArgs()[0]);
            } else if (interfaceC5154i.getArgs().length == 10) {
                interfaceC5154i.setArg(1, Double.valueOf(m11105o()));
                interfaceC5154i.setArg(2, Double.valueOf(m11106p()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m11104r(InterfaceC5154i interfaceC5154i) {
        Object obj;
        if (interfaceC5154i.getArgs() == null || interfaceC5154i.getArgs().length < 2 || (obj = interfaceC5154i.getArgs()[1]) == null) {
            return;
        }
        for (Method method : obj.getClass().getDeclaredMethods()) {
            int length = method.getParameterTypes().length;
            if (length == 10 || length == 3) {
                HookEngine.hookBefore(method, new InterfaceC5156k() { // from class: hd.f
                    @Override // md.InterfaceC5156k
                    /* JADX INFO: renamed from: a */
                    public final void mo8716a(InterfaceC5154i interfaceC5154i2) {
                        this.f7979a.m11103q(interfaceC5154i2);
                    }
                });
            }
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f7980e = C1517b.findClass().usingStrings("TencentLocationManager", "tencentlocsapp").get();
        return true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAllMethodsBefore(this.f7980e, "requestLocationUpdates", new InterfaceC5156k() { // from class: hd.e
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7978a.m11104r(interfaceC5154i);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final double m11105o() {
        return m11108t()[0];
    }

    /* JADX INFO: renamed from: p */
    public final double m11106p() {
        return m11108t()[1];
    }

    /* JADX INFO: renamed from: s */
    public final void m11107s(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            try {
                AbstractC5161p.callMethod(obj, "setLatitude", Double.valueOf(m11105o()));
                AbstractC5161p.callMethod(obj, "setLongitude", Double.valueOf(m11106p()));
            } catch (Throwable unused) {
                AbstractC5161p.setDoubleField(obj, "a", m11105o());
                AbstractC5161p.setDoubleField(obj, "b", m11106p());
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: t */
    public final double[] m11108t() {
        try {
            String[] strArrSplit = m7970f("virtual_coords", "116.397,39.908").split(",");
            return new double[]{Double.parseDouble(strArrSplit[1].trim()), Double.parseDouble(strArrSplit[0].trim())};
        } catch (Exception unused) {
            return new double[]{39.908d, 116.397d};
        }
    }
}
