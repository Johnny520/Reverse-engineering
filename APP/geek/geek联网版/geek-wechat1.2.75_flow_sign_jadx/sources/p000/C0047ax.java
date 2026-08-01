package p000;

import androidx.activity.C0029a;
import androidx.activity.ComponentActivity;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;

/* JADX INFO: renamed from: ax */
/* JADX INFO: loaded from: classes.dex */
public final class C0047ax extends AbstractC0270gq implements InterfaceC0379jm {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f644b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0047ax(int i, Object obj) {
        super(0);
        this.f644b = i;
        this.f645c = obj;
    }

    @Override // p000.InterfaceC0379jm
    /* JADX INFO: renamed from: a */
    public final Object mo474a() {
        Object objPrevious;
        switch (this.f644b) {
            case Base64.DEFAULT /* 0 */:
                ((C0029a) this.f645c).m111b();
                return C0893xh.f5258n;
            case Base64.NO_PADDING /* 1 */:
                C0029a c0029a = (C0029a) this.f645c;
                C0400k6 c0400k6 = c0029a.f147b;
                ListIterator listIterator = c0400k6.listIterator(c0400k6.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0785ul) objPrevious).f4836a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                c0029a.f148c = null;
                return C0893xh.f5258n;
            case Base64.NO_WRAP /* 2 */:
                ((C0029a) this.f645c).m111b();
                return C0893xh.f5258n;
            default:
                ComponentActivity componentActivity = (ComponentActivity) this.f645c;
                ArrayList arrayList = new ArrayList();
                q00.f3767a.getClass();
                Class clsMo1964a = new C0774ua(x10.class).mo1964a();
                AbstractC0493mp.m1855e("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsMo1964a);
                arrayList.add(new va0(clsMo1964a));
                va0[] va0VarArr = (va0[]) arrayList.toArray(new va0[0]);
                va0[] va0VarArr2 = (va0[]) Arrays.copyOf(va0VarArr, va0VarArr.length);
                AbstractC0493mp.m1857g("initializers", va0VarArr2);
                wa0 wa0VarMo104d = componentActivity.mo104d();
                AbstractC0778ue abstractC0778ueMo102a = componentActivity.mo102a();
                AbstractC0493mp.m1857g("store", wa0VarMo104d);
                AbstractC0493mp.m1857g("defaultCreationExtras", abstractC0778ueMo102a);
                LinkedHashMap linkedHashMap = wa0VarMo104d.f5077a;
                ua0 x10Var = (ua0) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (x10.class.isInstance(x10Var)) {
                    AbstractC0493mp.m1855e("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", x10Var);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(abstractC0778ueMo102a.f4820a);
                    linkedHashMap2.put(C0893xh.f5260p, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        x10Var = null;
                        for (va0 va0Var : va0VarArr2) {
                            if (va0Var.f4924a.equals(x10.class)) {
                                x10Var = new x10();
                            }
                        }
                        if (x10Var == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(x10.class.getName()));
                        }
                        ua0 ua0Var = (ua0) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", x10Var);
                        if (ua0Var != null) {
                            ua0Var.mo651a();
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (x10) x10Var;
        }
    }
}
