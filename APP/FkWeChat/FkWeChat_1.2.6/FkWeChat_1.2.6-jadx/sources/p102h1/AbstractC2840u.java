package p102h1;

import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p117i.C3082r0;
import p299ub.AbstractC8610a;

/* JADX INFO: renamed from: h1.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2840u {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f7401a = AbstractC0552o0.m1980h(new InterfaceC0173a() { // from class: h1.t
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC2840u.m10078a();
        }
    });

    /* JADX INFO: renamed from: a */
    public static InterfaceC2837r m10078a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2837r m10079b(Map map, InterfaceC0184l interfaceC0184l) {
        return new C2838s(map, interfaceC0184l);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m10082e(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC8610a.m33055c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC0506h3 m10083f() {
        return f7401a;
    }

    /* JADX INFO: renamed from: g */
    public static final C3082r0 m10084g(Map map) {
        C3082r0 c3082r0 = new C3082r0(map.size());
        c3082r0.m11525t(map);
        return c3082r0;
    }
}
