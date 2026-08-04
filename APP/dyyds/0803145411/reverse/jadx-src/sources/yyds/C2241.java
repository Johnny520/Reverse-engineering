package yyds;

import androidx.activity.C0033;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᲁᛵᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2241 extends AbstractC0084 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f11069;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f11070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2241(int i, Object obj) {
        super(0);
        this.f11070 = i;
        this.f11069 = obj;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        int i = this.f11070;
        C2746 c2746 = C2746.f13459;
        Object obj = this.f11069;
        switch (i) {
            case 0:
                ((C0033) obj).m23();
                return c2746;
            case 1:
                ((C0033) obj).m22();
                return c2746;
            default:
                InterfaceC0538 interfaceC0538 = (InterfaceC0538) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0870(AbstractC1700.m3448(C0419.class).mo3993()));
                C0870[] c0870Arr = (C0870[]) arrayList.toArray(new C0870[0]);
                C0870[] c0870Arr2 = (C0870[]) Arrays.copyOf(c0870Arr, c0870Arr.length);
                C2225 c2225Mo19 = interfaceC0538.mo19();
                AbstractC0729 abstractC0729Mo17 = interfaceC0538 instanceof InterfaceC2657 ? ((InterfaceC2657) interfaceC0538).mo17() : C0298.f1572;
                LinkedHashMap linkedHashMap = c2225Mo19.f10988;
                C0419 c0419 = (C0419) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (!C0419.class.isInstance(c0419)) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll((LinkedHashMap) abstractC0729Mo17.f3409);
                    linkedHashMap2.put(C1586.f8036, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        c0419 = null;
                        for (C0870 c0870 : c0870Arr2) {
                            if (AbstractC1544.m3188(c0870.f3987, C0419.class)) {
                                c0419 = new C0419();
                            }
                        }
                        if (c0419 == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(C0419.class.getName()));
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return c0419;
        }
    }
}
