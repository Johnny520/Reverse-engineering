package p244;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.HashSet;
import p209.C8657;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8856 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8657 f22509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8847 f22508 = new C8847(10);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8846 f22507 = new C8846(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22512 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f22510 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8847 f22511 = f22508;

    public C8856(C8657 c8657) {
        this.f22509 = c8657;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized ArrayList m14069(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C8859 c8859 : this.f22512) {
            if (!arrayList.contains(c8859.f22523) && c8859.f22524.isAssignableFrom(cls)) {
                arrayList.add(c8859.f22523);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized InterfaceC8862 m14070(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C8859 c8859 : this.f22512) {
                if (this.f22510.contains(c8859)) {
                    z = true;
                } else if (c8859.f22524.isAssignableFrom(cls) && c8859.f22523.isAssignableFrom(cls2)) {
                    this.f22510.add(c8859);
                    arrayList.add(c8859.f22522.mo877(this));
                    this.f22510.remove(c8859);
                }
            }
            if (arrayList.size() > 1) {
                C8847 c8847 = this.f22511;
                C8657 c8657 = this.f22509;
                c8847.getClass();
                return new C8852(arrayList, 2, c8657);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC8862) arrayList.get(0);
            }
            if (!z) {
                throw new Registry$NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f22507;
        } catch (Throwable th) {
            this.f22510.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized ArrayList m14071(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C8859 c8859 : this.f22512) {
                if (!this.f22510.contains(c8859) && c8859.f22524.isAssignableFrom(cls)) {
                    this.f22510.add(c8859);
                    arrayList.add(c8859.f22522.mo877(this));
                    this.f22510.remove(c8859);
                }
            }
        } finally {
        }
        return arrayList;
    }
}
