package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8306 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8307 f22920 = new C8307();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8318 f22921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f22922;

    public C8306(C3252 c3252, AbstractC3250 abstractC3250, Class cls) {
        this.f22921 = new C8318(c3252, abstractC3250, cls);
        this.f22922 = cls;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        if (obj == null) {
            c8243.m13762();
            return;
        }
        c8243.m13756();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f22921.mo7335(c8243, Array.get(obj, i));
        }
        c8243.m13764();
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c8244.m13779();
        while (c8244.m13784()) {
            arrayList.add(this.f22921.f22947.mo7336(c8244));
        }
        c8244.m13786();
        int size = arrayList.size();
        Class cls = this.f22922;
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
