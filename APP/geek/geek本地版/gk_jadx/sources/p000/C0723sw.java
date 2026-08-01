package p000;

import androidx.activity.C0029a;
import androidx.activity.ComponentActivity;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;

/* JADX INFO: renamed from: sw */
/* JADX INFO: loaded from: classes.dex */
public final class C0723sw extends AbstractC0123cq implements InterfaceC0303hm {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0723sw(int i, Object obj) {
        super(0);
        this.f4465b = i;
        this.f4466c = obj;
    }

    @Override // p000.InterfaceC0303hm
    /* JADX INFO: renamed from: a */
    public final Object mo10a() {
        Object objPrevious;
        switch (this.f4465b) {
            case Base64.DEFAULT /* 0 */:
                ((C0029a) this.f4466c).m126b();
                return C0819vh.f4855n;
            case Base64.NO_PADDING /* 1 */:
                C0029a c0029a = (C0029a) this.f4466c;
                C0400k6 c0400k6 = c0029a.f184b;
                ListIterator listIterator = c0400k6.listIterator(c0400k6.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0712sl) objPrevious).f4446a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c0029a.f185c = null;
                return C0819vh.f4855n;
            case Base64.NO_WRAP /* 2 */:
                ((C0029a) this.f4466c).m126b();
                return C0819vh.f4855n;
            default:
                ComponentActivity componentActivity = (ComponentActivity) this.f4466c;
                ArrayList arrayList = new ArrayList();
                j00.f2515a.getClass();
                Class clsMo1238a = new C0478ma(q10.class).mo1238a();
                AbstractC0346ip.m1501m("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsMo1238a);
                arrayList.add(new qa0(clsMo1238a));
                qa0[] qa0VarArr = (qa0[]) arrayList.toArray(new qa0[0]);
                qa0[] qa0VarArr2 = (qa0[]) Arrays.copyOf(qa0VarArr, qa0VarArr.length);
                AbstractC0346ip.m1503o("initializers", qa0VarArr2);
                ra0 ra0VarMo119d = componentActivity.mo119d();
                AbstractC0742te abstractC0742teMo117a = componentActivity.mo117a();
                AbstractC0346ip.m1503o("store", ra0VarMo119d);
                AbstractC0346ip.m1503o("defaultCreationExtras", abstractC0742teMo117a);
                LinkedHashMap linkedHashMap = ra0VarMo119d.f4257a;
                pa0 q10Var = (pa0) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (q10.class.isInstance(q10Var)) {
                    AbstractC0346ip.m1501m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", q10Var);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(abstractC0742teMo117a.f4565a);
                    linkedHashMap2.put(C0819vh.f4857p, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        q10Var = null;
                        for (qa0 qa0Var : qa0VarArr2) {
                            if (qa0Var.f4050a.equals(q10.class)) {
                                q10Var = new q10();
                            }
                        }
                        if (q10Var == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(q10.class.getName()));
                        }
                        pa0 pa0Var = (pa0) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", q10Var);
                        if (pa0Var != null) {
                            pa0Var.mo113a();
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (q10) q10Var;
        }
    }
}
