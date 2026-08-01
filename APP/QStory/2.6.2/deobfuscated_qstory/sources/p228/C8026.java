package p228;

import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.HashSet;
import p193.C7827;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8026 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7827 f22167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8017 f22166 = new C8017(10);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8016 f22165 = new C8016(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22170 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f22168 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8017 f22169 = f22166;

    public C8026(C7827 c7827) {
        this.f22167 = c7827;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized ArrayList m13482(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C8029 c8029 : this.f22170) {
            if (!arrayList.contains(c8029.f22181) && c8029.f22182.isAssignableFrom(cls)) {
                arrayList.add(c8029.f22181);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized InterfaceC8032 m13483(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C8029 c8029 : this.f22170) {
                if (this.f22168.contains(c8029)) {
                    z = true;
                } else if (c8029.f22182.isAssignableFrom(cls) && c8029.f22181.isAssignableFrom(cls2)) {
                    this.f22168.add(c8029);
                    arrayList.add(c8029.f22180.mo316(this));
                    this.f22168.remove(c8029);
                }
            }
            if (arrayList.size() > 1) {
                C8017 c8017 = this.f22169;
                C7827 c7827 = this.f22167;
                c8017.getClass();
                return new C8022(arrayList, 2, c7827);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC8032) arrayList.get(0);
            }
            if (!z) {
                throw new Registry$NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f22165;
        } catch (Throwable th) {
            this.f22168.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized ArrayList m13484(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C8029 c8029 : this.f22170) {
                if (!this.f22168.contains(c8029) && c8029.f22182.isAssignableFrom(cls)) {
                    this.f22168.add(c8029);
                    arrayList.add(c8029.f22180.mo316(this));
                    this.f22168.remove(c8029);
                }
            }
        } finally {
        }
        return arrayList;
    }
}
