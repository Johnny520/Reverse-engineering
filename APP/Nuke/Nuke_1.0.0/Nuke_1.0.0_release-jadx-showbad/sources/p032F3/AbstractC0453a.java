package p032F3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p093S1.InterfaceC1296h;
import p095T.AbstractC1327N;
import p095T.C1349a;
import p095T.C1371l;
import p107V1.C1504c;
import p107V1.C1524w;
import p107V1.C1527z;
import p107V1.InterfaceC1518q;
import p107V1.InterfaceC1519r;
import p117X2.AbstractC1665j;
import p163g0.C2170b;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: F3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0453a implements InterfaceC1519r {

    /* JADX INFO: renamed from: d */
    public final Object f1354d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.bumptech.glide.f.i(com.bumptech.glide.c, java.util.ArrayList):com.bumptech.glide.l] */
    public /* synthetic */ AbstractC0453a(Object obj) {
        this.f1354d = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static long m738c(int i5, int i6) {
        return ((long) i6) | (((long) i5) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean m739a(int i5, AbstractC1327N abstractC1327N, Object obj) {
        ArrayList arrayList = abstractC1327N.f4752a;
        if (arrayList == null) {
            m740b(i5, abstractC1327N, null);
            return true;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj2 = arrayList.get(i6);
            if (obj2 instanceof C1349a) {
                if (obj2.equals(obj)) {
                    m740b(0, abstractC1327N, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof AbstractC1327N)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (m739a(i5, (AbstractC1327N) obj2, obj)) {
                    m740b(0, abstractC1327N, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m740b(int i5, AbstractC1327N abstractC1327N, Object obj) {
        ((ArrayList) this.f1354d).add(new C2170b(i5, null, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m741d(InterfaceC1296h interfaceC1296h) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1354d;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC1296h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m742e(int i5, Object obj, AbstractC1327N abstractC1327N, Object obj2) {
        if (AbstractC1665j.m2981a(obj, C1371l.f4833a)) {
            m740b(i5, abstractC1327N, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1519r
    /* JADX INFO: renamed from: g */
    public InterfaceC1518q mo68g(C1524w c1524w) {
        return new C1504c(2, (C1527z) this.f1354d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC0453a(int i5) {
        switch (i5) {
            case 3:
                this.f1354d = new ArrayList();
                break;
            default:
                char[] cArr = AbstractC2511o.f8029a;
                this.f1354d = new ArrayDeque(20);
                break;
        }
    }

    public AbstractC0453a(DexKitBridge dexKitBridge, int i5, int i6) {
        AbstractC1665j.m2985e(dexKitBridge, "bridge");
        this.f1354d = dexKitBridge;
    }
}
