package p272s8;

import java.io.Serializable;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s8.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7200d implements Serializable {

    /* JADX INFO: renamed from: r */
    public static final a f23878r = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: q */
    public final Class f23879q;

    public C7200d(Enum[] enumArr) {
        enumArr.getClass();
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.f23879q = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f23879q.getEnumConstants();
        enumConstants.getClass();
        return AbstractC7198b.m28437a((Enum[]) enumConstants);
    }

    /* JADX INFO: renamed from: s8.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
