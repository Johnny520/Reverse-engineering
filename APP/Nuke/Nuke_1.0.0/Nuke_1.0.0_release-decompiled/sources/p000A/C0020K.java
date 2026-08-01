package p000A;

import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p238t.AbstractC3204b;
import p255w.C3375f;
import p255w.C3377h;

/* JADX INFO: renamed from: A.K */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0020K implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f110d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1347Y f111e;

    public /* synthetic */ C0020K(InterfaceC1347Y interfaceC1347Y, int i5) {
        this.f110d = i5;
        this.f111e = interfaceC1347Y;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f110d) {
            case 0:
                Boolean bool = (Boolean) this.f111e.getValue();
                bool.booleanValue();
                return bool;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC0430v interfaceC0430v = (InterfaceC0430v) this.f111e.getValue();
                if (interfaceC0430v != null) {
                    return interfaceC0430v;
                }
                AbstractC3204b.m5478d("Required value was null.");
                throw new C0330q();
            case 2:
                InterfaceC0430v interfaceC0430v2 = (InterfaceC0430v) this.f111e.getValue();
                if (interfaceC0430v2 != null) {
                    return interfaceC0430v2;
                }
                AbstractC3204b.m5478d("Required value was null.");
                throw new C0330q();
            case 3:
                InterfaceC0430v interfaceC0430v3 = (InterfaceC0430v) this.f111e.getValue();
                if (interfaceC0430v3 != null) {
                    return interfaceC0430v3;
                }
                AbstractC3204b.m5478d("Required value was null.");
                throw new C0330q();
            case 4:
                this.f111e.setValue(null);
                return C0891q.f2780a;
            case 5:
                this.f111e.setValue(Boolean.TRUE);
                return C0891q.f2780a;
            case 6:
                this.f111e.setValue(null);
                return C0891q.f2780a;
            case 7:
                this.f111e.setValue(null);
                return C0891q.f2780a;
            case 8:
                this.f111e.setValue(null);
                return C0891q.f2780a;
            case 9:
                this.f111e.setValue(null);
                return C0891q.f2780a;
            case 10:
                this.f111e.setValue(null);
                return C0891q.f2780a;
            case 11:
                this.f111e.setValue(Boolean.FALSE);
                return C0891q.f2780a;
            case 12:
                this.f111e.setValue(null);
                return C0891q.f2780a;
            case 13:
                this.f111e.setValue(Boolean.FALSE);
                return C0891q.f2780a;
            case 14:
                return new C3375f((InterfaceC1601c) this.f111e.getValue());
            case 15:
                return (C3377h) ((InterfaceC1599a) this.f111e.getValue()).mo6a();
            case 16:
                this.f111e.setValue(Boolean.TRUE);
                return C0891q.f2780a;
            case 17:
                this.f111e.setValue(Boolean.TRUE);
                return C0891q.f2780a;
            case 18:
                this.f111e.setValue(Boolean.FALSE);
                return C0891q.f2780a;
            case 19:
                this.f111e.setValue(Boolean.FALSE);
                return C0891q.f2780a;
            case 20:
                this.f111e.setValue(Boolean.FALSE);
                return C0891q.f2780a;
            default:
                this.f111e.setValue(Boolean.TRUE);
                return C0891q.f2780a;
        }
    }
}
