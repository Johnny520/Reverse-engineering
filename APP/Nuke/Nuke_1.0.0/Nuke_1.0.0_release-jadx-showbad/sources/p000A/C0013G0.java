package p000A;

import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p090R3.C1228a;
import p095T.InterfaceC1347Y;
import p104U3.EnumC1477a;
import p108V3.C1544Q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2016l;
import p198m0.EnumC2594y;
import p204n0.C2683b;

/* JADX INFO: renamed from: A.G0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0013G0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f54d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1347Y f55e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0013G0(InterfaceC1347Y interfaceC1347Y, int i5) {
        this.f54d = i5;
        this.f55e = interfaceC1347Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f54d) {
            case 0:
                return new C0028O(1, this.f55e);
            case BuildConfig.VERSION_CODE /* 1 */:
                ((InterfaceC1601c) this.f55e.getValue()).mo1h((C2683b) obj);
                return C0891q.f2780a;
            case 2:
                this.f55e.setValue((InterfaceC0430v) obj);
                return C0891q.f2780a;
            case 3:
                this.f55e.setValue((InterfaceC0430v) obj);
                return C0891q.f2780a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f55e.setValue(bool);
                return C0891q.f2780a;
            case 5:
                EnumC2594y enumC2594y = (EnumC2594y) obj;
                AbstractC1665j.m2985e(enumC2594y, "it");
                this.f55e.setValue(Boolean.valueOf(enumC2594y.m4540a()));
                return C0891q.f2780a;
            case 6:
                this.f55e.setValue((InterfaceC0430v) obj);
                return C0891q.f2780a;
            case 7:
                this.f55e.setValue(new C2016l(((C2016l) obj).f6741a));
                return C0891q.f2780a;
            case 8:
                String str = (String) obj;
                AbstractC1665j.m2985e(str, "value");
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = str.charAt(i5);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                this.f55e.setValue(sb.toString());
                return C0891q.f2780a;
            case 9:
                this.f55e.setValue(new C2016l(((C2016l) obj).f6741a));
                return C0891q.f2780a;
            case 10:
                this.f55e.setValue(new C2016l(((C2016l) obj).f6741a));
                return C0891q.f2780a;
            case 11:
                C1228a c1228a = (C1228a) obj;
                AbstractC1665j.m2985e(c1228a, "preference");
                this.f55e.setValue(Integer.valueOf(c1228a.f4095a));
                return C0891q.f2780a;
            case 12:
                String str2 = (String) obj;
                AbstractC1665j.m2985e(str2, "it");
                this.f55e.setValue(str2);
                return C0891q.f2780a;
            case 13:
                EnumC1477a enumC1477a = (EnumC1477a) obj;
                AbstractC1665j.m2985e(enumC1477a, "location");
                this.f55e.setValue(enumC1477a.name());
                return C0891q.f2780a;
            case 14:
                String str3 = (String) obj;
                AbstractC1665j.m2985e(str3, "value");
                this.f55e.setValue(str3);
                return C0891q.f2780a;
            case 15:
                C1544Q c1544q = (C1544Q) obj;
                AbstractC1665j.m2985e(c1544q, "item");
                this.f55e.setValue(c1544q);
                return C0891q.f2780a;
            default:
                Float f2 = (Float) obj;
                f2.getClass();
                return Float.valueOf(((Number) ((InterfaceC1601c) this.f55e.getValue()).mo1h(f2)).floatValue());
        }
    }
}
