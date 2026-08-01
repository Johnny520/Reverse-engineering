package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4356;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.IllegalCallableAccessException;
import p047.InterfaceC6488;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5062 implements InterfaceC5063 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5073 f14603 = AbstractC3055.m6635(null, new ReflectKCallableImpl$_absentArguments$1(this));

    @Override // kotlin.reflect.InterfaceC5093
    public final Object call(Object... objArr) {
        objArr.getClass();
        try {
            return mo9944().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final Object callBy(Map map) throws IllegalCallableAccessException {
        Object objM10045;
        map.getClass();
        boolean z = false;
        if (AbstractC5061.m10029(this)) {
            List<InterfaceC5107> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(parameters, 10));
            for (InterfaceC5107 interfaceC5107 : parameters) {
                if (map.containsKey(interfaceC5107)) {
                    objM10045 = map.get(interfaceC5107);
                    if (objM10045 == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC5107 + ')');
                    }
                } else if (interfaceC5107.mo9957()) {
                    objM10045 = null;
                } else {
                    if (!interfaceC5107.mo9961()) {
                        C4210.m8614(interfaceC5107, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objM10045 = AbstractC5061.m10045(interfaceC5107.getType());
                }
                arrayList.add(objM10045);
            }
            InterfaceC6488 interfaceC6488Mo9942 = mo9942();
            if (interfaceC6488Mo9942 == null) {
                C4210.m8605(this, "This callable does not support a default call: ");
                return null;
            }
            try {
                return interfaceC6488Mo9942.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        List<InterfaceC5107> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return mo9944().call(isSuspend() ? new InterfaceC4356[]{null} : new InterfaceC4356[0]);
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
        for (InterfaceC5107 interfaceC51072 : parameters2) {
            if (map.containsKey(interfaceC51072)) {
                objArr[interfaceC51072.getIndex()] = map.get(interfaceC51072);
            } else if (interfaceC51072.mo9957()) {
                int i2 = (i / 32) + size;
                Object obj = objArr[i2];
                obj.getClass();
                objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                z = true;
            } else if (!interfaceC51072.mo9961()) {
                C4210.m8614(interfaceC51072, "No argument provided for a required parameter: ");
                return null;
            }
            if (interfaceC51072.getKind() == KParameter$Kind.VALUE || interfaceC51072.getKind() == KParameter$Kind.CONTEXT) {
                i++;
            }
        }
        if (!z) {
            try {
                return mo9944().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        InterfaceC6488 interfaceC6488Mo99422 = mo9942();
        if (interfaceC6488Mo99422 == null) {
            C4210.m8605(this, "This callable does not support a default call: ");
            return null;
        }
        try {
            return interfaceC6488Mo99422.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new IllegalCallableAccessException(e4);
        }
    }
}
