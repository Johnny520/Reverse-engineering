package kotlin.reflect.jvm.internal;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4345;
import kotlin.coroutines.InterfaceC4357;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.IllegalCallableAccessException;
import p047.InterfaceC6489;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5063 implements InterfaceC5064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5074 f14603 = C8667.m14378(null, new ReflectKCallableImpl$_absentArguments$1(this));

    @Override // kotlin.reflect.InterfaceC5094
    public final Object call(Object... objArr) {
        objArr.getClass();
        try {
            return mo9941().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final Object callBy(Map map) throws IllegalCallableAccessException {
        Object objM10055;
        map.getClass();
        boolean z = false;
        if (AbstractC5062.m10038(this)) {
            List<InterfaceC5108> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(parameters, 10));
            for (InterfaceC5108 interfaceC5108 : parameters) {
                if (map.containsKey(interfaceC5108)) {
                    objM10055 = map.get(interfaceC5108);
                    if (objM10055 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC5108 + ')');
                    }
                } else if (interfaceC5108.mo9954()) {
                    objM10055 = null;
                } else {
                    if (!interfaceC5108.mo9958()) {
                        C4211.m8604(interfaceC5108, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objM10055 = AbstractC5062.m10055(interfaceC5108.getType());
                }
                arrayList.add(objM10055);
            }
            InterfaceC6489 interfaceC6489Mo9939 = mo9939();
            if (interfaceC6489Mo9939 == null) {
                C4211.m8595(this, "This callable does not support a default call: ");
                return null;
            }
            try {
                return interfaceC6489Mo9939.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        List<InterfaceC5108> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return mo9941().call(isSuspend() ? new InterfaceC4357[]{null} : new InterfaceC4357[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f14603.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (InterfaceC5108 interfaceC51082 : parameters2) {
            if (map.containsKey(interfaceC51082)) {
                objArr[interfaceC51082.getIndex()] = map.get(interfaceC51082);
            } else if (interfaceC51082.mo9954()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                obj.getClass();
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!interfaceC51082.mo9958()) {
                C4211.m8604(interfaceC51082, "No argument provided for a required parameter: ");
                return null;
            }
            if (interfaceC51082.getKind() == KParameter$Kind.VALUE || interfaceC51082.getKind() == KParameter$Kind.CONTEXT) {
                i++;
            }
        }
        if (!z) {
            try {
                return mo9941().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        InterfaceC6489 interfaceC6489Mo99392 = mo9939();
        if (interfaceC6489Mo99392 == null) {
            C4211.m8595(this, "This callable does not support a default call: ");
            return null;
        }
        try {
            return interfaceC6489Mo99392.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new IllegalCallableAccessException(e4);
        }
    }
}
