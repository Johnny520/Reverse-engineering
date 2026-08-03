package p000a;

import java.util.ArrayList;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: a.Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0459Z7 {

    /* JADX INFO: renamed from: a */
    public final Object f1726a;

    /* JADX INFO: renamed from: b */
    public Object f1727b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0459Z7(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f1726a = new int[size];
        this.f1727b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f1726a)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f1727b)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0459Z7(int i, int i2) {
        this.f1726a = new int[]{i, i2};
        this.f1727b = new float[]{0.0f, 1.0f};
    }

    public C0459Z7(int i, int i2, int i3) {
        this.f1726a = new int[]{i, i2, i3};
        this.f1727b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0459Z7(Matcher matcher, String str) {
        this.f1726a = matcher;
        new C0936ya(this);
    }
}
