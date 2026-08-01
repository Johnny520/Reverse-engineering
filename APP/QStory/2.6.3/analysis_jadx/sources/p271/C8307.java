package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8307 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8308 f22919 = new C8308();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8319 f22920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f22921;

    public C8307(C3253 c3253, AbstractC3251 abstractC3251, Class cls) {
        this.f22920 = new C8319(c3253, abstractC3251, cls);
        this.f22921 = cls;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        if (obj == null) {
            c8244.m13778();
            return;
        }
        c8244.m13773();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f22920.mo7322(c8244, Array.get(obj, i));
        }
        c8244.m13781();
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c8245.m13797();
        while (c8245.m13801()) {
            arrayList.add(this.f22920.f22946.mo7323(c8245));
        }
        c8245.m13804();
        int size = arrayList.size();
        Class cls = this.f22921;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }
}
