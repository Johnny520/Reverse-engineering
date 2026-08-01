package p159ka;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import la.AbstractC4721a;
import p024b9.AbstractC1043k;
import p080f9.C2363j;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5101q0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: ka.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4218a extends AbstractC4721a {

    /* JADX INFO: renamed from: g */
    public static final a f12395g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final C4218a f12396h = new C4218a(1, 0, 7);

    /* JADX INFO: renamed from: i */
    public static final C4218a f12397i = new C4218a(new int[0]);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4218a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
    }

    /* JADX INFO: renamed from: h */
    public boolean m16707h() {
        return m18848f(f12396h);
    }

    /* JADX INFO: renamed from: ka.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4218a m16708a(InputStream inputStream) {
            inputStream.getClass();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C2363j c2363j = new C2363j(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c2363j, 10));
            Iterator it = c2363j.iterator();
            while (it.hasNext()) {
                ((AbstractC5101q0) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrM20552W0 = AbstractC5081g0.m20552W0(arrayList);
            return new C4218a(Arrays.copyOf(iArrM20552W0, iArrM20552W0.length));
        }

        public a() {
        }
    }
}
