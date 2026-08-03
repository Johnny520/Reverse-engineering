package Yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5281 extends C4128 implements InterfaceC5278 {

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public C4128[] f12575 = new C4128[4];

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public int f12576 = 0;

    @Override // Yue.InterfaceC5278
    /* JADX INFO: renamed from: ۥ */
    public void mo2054() {
        this.f12576 = 0;
        Arrays.fill(this.f12575, (Object) null);
    }

    @Override // Yue.InterfaceC5278
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2055(C4128 c4128) {
        if (c4128 == this || c4128 == null) {
            return;
        }
        int i = this.f12576 + 1;
        C4128[] c4128Arr = this.f12575;
        if (i > c4128Arr.length) {
            this.f12575 = (C4128[]) Arrays.copyOf(c4128Arr, c4128Arr.length * 2);
        }
        C4128[] c4128Arr2 = this.f12575;
        int i2 = this.f12576;
        c4128Arr2[i2] = c4128;
        this.f12576 = i2 + 1;
    }

    @Override // Yue.InterfaceC5278
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo16177(C4129 c4129) {
    }

    @Override // Yue.C4128
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo9342(C4128 c4128, HashMap<C4128, C4128> map) {
        super.mo9342(c4128, map);
        C5281 c5281 = (C5281) c4128;
        this.f12576 = 0;
        int i = c5281.f12576;
        for (int i2 = 0; i2 < i; i2++) {
            mo2055(map.get(c5281.f12575[i2]));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public void m16181(ArrayList<C8431> arrayList, int i, C8431 c8431) {
        for (int i2 = 0; i2 < this.f12576; i2++) {
            c8431.m4411(this.f12575[i2]);
        }
        for (int i3 = 0; i3 < this.f12576; i3++) {
            C5219.m1986(this.f12575[i3], i, arrayList, c8431);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public int m16182(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f12576; i4++) {
            C4128 c4128 = this.f12575[i4];
            if (i == 0 && (i3 = c4128.f8439) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = c4128.f8440) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
