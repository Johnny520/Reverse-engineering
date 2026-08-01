package p181m4;

import android.os.Bundle;
import p181m4.C4966c;
import p207o4.C5635b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m4.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4970g {

    /* JADX INFO: renamed from: a */
    public final C5635b f15106a;

    /* JADX INFO: renamed from: b */
    public C4966c.b f15107b;

    /* JADX INFO: renamed from: m4.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2623a(InterfaceC4973j interfaceC4973j);
    }

    /* JADX INFO: renamed from: m4.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        Bundle mo2609a();
    }

    public C4970g(C5635b c5635b) {
        c5635b.getClass();
        this.f15106a = c5635b;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m20067a(String str) {
        str.getClass();
        return this.f15106a.m22812c(str);
    }

    /* JADX INFO: renamed from: b */
    public final b m20068b(String str) {
        str.getClass();
        return this.f15106a.m22813d(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m20069c(String str, b bVar) {
        str.getClass();
        bVar.getClass();
        this.f15106a.m22818i(str, bVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m20070d(Class cls) {
        cls.getClass();
        if (!this.f15106a.m22814e()) {
            C10010p0.m38820a("Can not perform this action after onSaveInstanceState");
            return;
        }
        C4966c.b bVar = this.f15107b;
        if (bVar == null) {
            bVar = new C4966c.b(this);
        }
        this.f15107b = bVar;
        try {
            cls.getDeclaredConstructor(null);
            C4966c.b bVar2 = this.f15107b;
            if (bVar2 != null) {
                bVar2.m20057b(cls.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m20071e(String str) {
        str.getClass();
        this.f15106a.m22819j(str);
    }
}
