package p181;

import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p267.AbstractC9004;
import p321.InterfaceC9448;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC9004 f21165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC9448 f21166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f21169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8503 f21161 = new C8503(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C8503 f21162 = new C8503(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C8503 f21158 = new C8503(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C8503 f21157 = new C8503(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C8503 f21159 = new C8503(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C8503 f21160 = new C8503(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f21168 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f21167 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f21164 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f21163 = -3.4028235E38f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f21170 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f21171 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList f21172 = new ArrayList();

    public AbstractC8500(InterfaceC9448 interfaceC9448, AbstractC9004 abstractC9004) {
        this.f21166 = interfaceC9448;
        this.f21165 = abstractC9004;
        if (abstractC9004 == f21158 || abstractC9004 == f21157 || abstractC9004 == f21159) {
            this.f21169 = 0.1f;
            return;
        }
        if (abstractC9004 == f21160) {
            this.f21169 = 0.00390625f;
        } else if (abstractC9004 == f21161 || abstractC9004 == f21162) {
            this.f21169 = 0.002f;
        } else {
            this.f21169 = 1.0f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8504 m13540() {
        ThreadLocal threadLocal = C8504.f21174;
        if (threadLocal.get() == null) {
            threadLocal.set(new C8504(new C5703(19)));
        }
        return (C8504) threadLocal.get();
    }

    public void removeEndListener(InterfaceC8502 interfaceC8502) {
        ArrayList arrayList = this.f21171;
        int iIndexOf = arrayList.indexOf(interfaceC8502);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void removeUpdateListener(InterfaceC8501 interfaceC8501) {
        ArrayList arrayList = this.f21172;
        int iIndexOf = arrayList.indexOf(interfaceC8501);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13541(float f) {
        this.f21165.mo7619(this.f21166, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f21172;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                C3775.m6954();
                return;
            }
            i++;
        }
    }
}
