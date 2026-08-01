package p116hf;

import java.util.HashMap;
import java.util.Map;
import p147jf.InterfaceC3861c;

/* JADX INFO: renamed from: hf.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3019b implements InterfaceC3861c {

    /* JADX INFO: renamed from: a */
    public final C3034q f8015a = new C3034q();

    /* JADX INFO: renamed from: b */
    public final InheritableThreadLocal f8016b = new a();

    /* JADX INFO: renamed from: hf.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a extends InheritableThreadLocal {
        public a() {
        }

        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
