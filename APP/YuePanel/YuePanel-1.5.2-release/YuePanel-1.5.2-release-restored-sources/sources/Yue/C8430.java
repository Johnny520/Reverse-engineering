package Yue;

import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۢۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8430 extends C4128 {

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public ArrayList<C4128> f25257;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8430() {
        this.f25257 = new ArrayList<>();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4410(C4128 c4128) {
        this.f25257.add(c4128);
        if (c4128.m11876() != null) {
            ((C8430) c4128.m11876()).m28194(c4128);
        }
        c4128.m11955(this);
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ */
    public void mo11911() {
        this.f25257.clear();
        super.mo11911();
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    public void mo11916(C3639 c3639) {
        super.mo11916(c3639);
        int size = this.f25257.size();
        for (int i = 0; i < size; i++) {
            this.f25257.get(i).mo11916(c3639);
        }
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۠۠ */
    public void mo11953(int i, int i2) {
        super.mo11953(i, i2);
        int size = this.f25257.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f25257.get(i3).mo11953(m11880(), m11881());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public void m28191(C4128... c4128Arr) {
        for (C4128 c4128 : c4128Arr) {
            m4410(c4128);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public ArrayList<C4128> m28192() {
        return this.f25257;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public C4129 m28193() {
        C4128 c4128M11876 = m11876();
        C4129 c4129 = this instanceof C4129 ? (C4129) this : null;
        while (c4128M11876 != null) {
            C4128 c4128M118762 = c4128M11876.m11876();
            if (c4128M11876 instanceof C4129) {
                c4129 = (C4129) c4128M11876;
            }
            c4128M11876 = c4128M118762;
        }
        return c4129;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ */
    public void mo11973() {
        ArrayList<C4128> arrayList = this.f25257;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4128 c4128 = this.f25257.get(i);
            if (c4128 instanceof C8430) {
                ((C8430) c4128).mo11973();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public void m28194(C4128 c4128) {
        this.f25257.remove(c4128);
        c4128.mo11911();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public void m28195() {
        this.f25257.clear();
    }

    public C8430(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f25257 = new ArrayList<>();
    }

    public C8430(int i, int i2) {
        super(i, i2);
        this.f25257 = new ArrayList<>();
    }
}
