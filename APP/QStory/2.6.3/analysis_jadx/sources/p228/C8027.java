package p228;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.HashSet;
import p193.C7828;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7828 f22164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8018 f22163 = new C8018(10);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8017 f22162 = new C8017(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22167 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f22165 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8018 f22166 = f22163;

    public C8027(C7828 c7828) {
        this.f22164 = c7828;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized ArrayList m13510(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C8030 c8030 : this.f22167) {
            if (!arrayList.contains(c8030.f22178) && c8030.f22179.isAssignableFrom(cls)) {
                arrayList.add(c8030.f22178);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized InterfaceC8033 m13511(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C8030 c8030 : this.f22167) {
                if (this.f22165.contains(c8030)) {
                    z = true;
                } else if (c8030.f22179.isAssignableFrom(cls) && c8030.f22178.isAssignableFrom(cls2)) {
                    this.f22165.add(c8030);
                    arrayList.add(c8030.f22177.mo317(this));
                    this.f22165.remove(c8030);
                }
            }
            if (arrayList.size() > 1) {
                C8018 c8018 = this.f22166;
                C7828 c7828 = this.f22164;
                c8018.getClass();
                return new C8023(arrayList, 2, c7828);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC8033) arrayList.get(0);
            }
            if (!z) {
                throw new Registry$NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f22162;
        } catch (Throwable th) {
            this.f22165.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized ArrayList m13512(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C8030 c8030 : this.f22167) {
                if (!this.f22165.contains(c8030) && c8030.f22179.isAssignableFrom(cls)) {
                    this.f22165.add(c8030);
                    arrayList.add(c8030.f22177.mo317(this));
                    this.f22165.remove(c8030);
                }
            }
        } finally {
        }
        return arrayList;
    }
}
