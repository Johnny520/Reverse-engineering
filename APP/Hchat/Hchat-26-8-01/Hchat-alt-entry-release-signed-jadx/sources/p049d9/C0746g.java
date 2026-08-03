package p049d9;

import gg.C1425u;
import java.lang.reflect.Field;
import java.util.List;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.utils.KavaReflector;
import p265s.C3832g1;
import p265s.C3844m0;
import p339x1.EnumC5596d2;
import p339x1.InterfaceC5600e2;

/* JADX INFO: renamed from: d9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0746g implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2220g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1425u f2221h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0746g(C1425u c1425u, int i9) {
        this.f2220g = i9;
        this.f2221h = c1425u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2220g) {
            case 0:
                Field field = (Field) obj;
                field.getClass();
                return KavaReflector.readField(field, this.f2221h.f4738g);
            default:
                InterfaceC5600e2 interfaceC5600e2 = (InterfaceC5600e2) obj;
                interfaceC5600e2.getClass();
                C3844m0 c3844m0 = ((C3832g1) interfaceC5600e2).f12553u;
                C1425u c1425u = this.f2221h;
                List listM5C0 = (List) c1425u.f4738g;
                if (listM5C0 != null) {
                    listM5C0.add(c3844m0);
                } else {
                    listM5C0 = AbstractC0000a.m5C0(c3844m0);
                }
                c1425u.f4738g = listM5C0;
                return EnumC5596d2.f22748h;
        }
    }
}
