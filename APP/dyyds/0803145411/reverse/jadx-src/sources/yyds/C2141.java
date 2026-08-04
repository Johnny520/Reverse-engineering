package yyds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲀᲈᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2141 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0972 f10571;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f10572;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f10574;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f10576;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2141 f10577;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0944 f10578;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public HashSet f10573 = null;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f10575 = 0;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f10570 = Integer.MIN_VALUE;

    public C2141(C0944 c0944, int i) {
        this.f10578 = c0944;
        this.f10572 = i;
    }

    public final String toString() {
        return this.f10578.f4387 + ":" + AbstractC2104.m4013(this.f10572);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m4080() {
        C0972 c0972 = this.f10571;
        if (c0972 == null) {
            this.f10571 = new C0972(1);
        } else {
            c0972.m2113();
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m4081(int i) {
        this.f10574 = i;
        this.f10576 = true;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m4082() {
        C2141 c2141;
        HashSet<C2141> hashSet = this.f10573;
        if (hashSet == null) {
            return false;
        }
        for (C2141 c21412 : hashSet) {
            C0944 c0944 = c21412.f10578;
            int i = c21412.f10572;
            switch (AbstractC2104.m4012(i)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    c2141 = null;
                    break;
                case 1:
                    c2141 = c0944.f4344;
                    break;
                case 2:
                    c2141 = c0944.f4341;
                    break;
                case 3:
                    c2141 = c0944.f4382;
                    break;
                case 4:
                    c2141 = c0944.f4403;
                    break;
                default:
                    throw new AssertionError(AbstractC2104.m4013(i));
            }
            if (c2141.m4087()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4083(C2141 c2141, int i, int i2) {
        if (c2141 == null) {
            m4085();
            return;
        }
        this.f10577 = c2141;
        if (c2141.f10573 == null) {
            c2141.f10573 = new HashSet();
        }
        HashSet hashSet = this.f10577.f10573;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f10575 = i;
        this.f10570 = i2;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4084(int i, ArrayList arrayList, C2183 c2183) {
        HashSet hashSet = this.f10573;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0395.m1138(((C2141) it.next()).f10578, i, arrayList, c2183);
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4085() {
        HashSet hashSet;
        C2141 c2141 = this.f10577;
        if (c2141 != null && (hashSet = c2141.f10573) != null) {
            hashSet.remove(this);
            if (this.f10577.f10573.size() == 0) {
                this.f10577.f10573 = null;
            }
        }
        this.f10573 = null;
        this.f10577 = null;
        this.f10575 = 0;
        this.f10570 = Integer.MIN_VALUE;
        this.f10576 = false;
        this.f10574 = 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m4086() {
        if (this.f10576) {
            return this.f10574;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean m4087() {
        return this.f10577 != null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m4088() {
        C2141 c2141;
        if (this.f10578.f20 == 8) {
            return 0;
        }
        int i = this.f10570;
        return (i == Integer.MIN_VALUE || (c2141 = this.f10577) == null || c2141.f10578.f20 != 8) ? this.f10575 : i;
    }
}
