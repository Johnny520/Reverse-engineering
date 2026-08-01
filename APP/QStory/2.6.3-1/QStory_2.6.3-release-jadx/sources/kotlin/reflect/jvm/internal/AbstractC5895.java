package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.InterfaceC5189;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.IllegalCallableAccessException;
import p063.InterfaceC7318;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5895 implements InterfaceC5896 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5906 f14948 = C9496.m14937(null, new ReflectKCallableImpl$_absentArguments$1(this));

    @Override // kotlin.reflect.InterfaceC5926
    public final Object call(Object... objArr) {
        objArr.getClass();
        try {
            return mo10500().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final Object callBy(Map map) throws IllegalCallableAccessException {
        Object objM10614;
        map.getClass();
        boolean z = false;
        if (AbstractC5894.m10597(this)) {
            List<InterfaceC5940> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(parameters, 10));
            for (InterfaceC5940 interfaceC5940 : parameters) {
                if (map.containsKey(interfaceC5940)) {
                    objM10614 = map.get(interfaceC5940);
                    if (objM10614 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC5940 + ')');
                    }
                } else if (interfaceC5940.mo10513()) {
                    objM10614 = null;
                } else {
                    if (!interfaceC5940.mo10517()) {
                        C5043.m9163(interfaceC5940, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objM10614 = AbstractC5894.m10614(interfaceC5940.getType());
                }
                arrayList.add(objM10614);
            }
            InterfaceC7318 interfaceC7318Mo10498 = mo10498();
            if (interfaceC7318Mo10498 == null) {
                C5043.m9154(this, "This callable does not support a default call: ");
                return null;
            }
            try {
                return interfaceC7318Mo10498.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        List<InterfaceC5940> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return mo10500().call(isSuspend() ? new InterfaceC5189[]{null} : new InterfaceC5189[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f14948.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (InterfaceC5940 interfaceC59402 : parameters2) {
            if (map.containsKey(interfaceC59402)) {
                objArr[interfaceC59402.getIndex()] = map.get(interfaceC59402);
            } else if (interfaceC59402.mo10513()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                obj.getClass();
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!interfaceC59402.mo10517()) {
                C5043.m9163(interfaceC59402, "No argument provided for a required parameter: ");
                return null;
            }
            if (interfaceC59402.getKind() == KParameter$Kind.VALUE || interfaceC59402.getKind() == KParameter$Kind.CONTEXT) {
                i++;
            }
        }
        if (!z) {
            try {
                return mo10500().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        InterfaceC7318 interfaceC7318Mo104982 = mo10498();
        if (interfaceC7318Mo104982 == null) {
            C5043.m9154(this, "This callable does not support a default call: ");
            return null;
        }
        try {
            return interfaceC7318Mo104982.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new IllegalCallableAccessException(e4);
        }
    }
}
