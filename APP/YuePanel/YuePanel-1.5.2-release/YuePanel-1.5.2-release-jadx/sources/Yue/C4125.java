package Yue;

import Yue.C7503;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۧ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4125 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean f8270 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f8271 = -1;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f699;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f8272;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C4128 f8273;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final EnumC0335 f8274;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C4125 f8275;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C7503 f8278;

    /* JADX INFO: renamed from: ۥ */
    public HashSet<C4125> f698 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f8276 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f8277 = -1;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧ۟۠$ۥ */
    public static /* synthetic */ class C0334 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f700;

        static {
            int[] iArr = new int[EnumC0335.values().length];
            f700 = iArr;
            try {
                iArr[EnumC0335.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f700[EnumC0335.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f700[EnumC0335.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f700[EnumC0335.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f700[EnumC0335.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f700[EnumC0335.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f700[EnumC0335.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f700[EnumC0335.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f700[EnumC0335.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧ۟۠$ۥ۟ */
    public enum EnumC0335 {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C4125(C4128 c4128, EnumC0335 enumC0335) {
        this.f8273 = c4128;
        this.f8274 = enumC0335;
    }

    public String toString() {
        return this.f8273.m11854() + ":" + this.f8274.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m1091(C4125 c4125, int i) {
        return m1092(c4125, i, -1, false);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m1092(C4125 c4125, int i, int i2, boolean z) {
        if (c4125 == null) {
            m11780();
            return true;
        }
        if (!z && !m11778(c4125)) {
            return false;
        }
        this.f8275 = c4125;
        if (c4125.f698 == null) {
            c4125.f698 = new HashSet<>();
        }
        HashSet<C4125> hashSet = this.f8275.f698;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f8276 = i;
        } else {
            this.f8276 = 0;
        }
        this.f8277 = i2;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m11759(C4125 c4125, HashMap<C4128, C4128> map) {
        HashSet<C4125> hashSet;
        C4125 c41252 = this.f8275;
        if (c41252 != null && (hashSet = c41252.f698) != null) {
            hashSet.remove(this);
        }
        C4125 c41253 = c4125.f8275;
        if (c41253 != null) {
            this.f8275 = map.get(c4125.f8275.f8273).mo11847(c41253.m11768());
        } else {
            this.f8275 = null;
        }
        C4125 c41254 = this.f8275;
        if (c41254 != null) {
            if (c41254.f698 == null) {
                c41254.f698 = new HashSet<>();
            }
            this.f8275.f698.add(this);
        }
        this.f8276 = c4125.f8276;
        this.f8277 = c4125.f8277;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m11760(int i, ArrayList<C8431> arrayList, C8431 c8431) {
        HashSet<C4125> hashSet = this.f698;
        if (hashSet != null) {
            Iterator<C4125> it = hashSet.iterator();
            while (it.hasNext()) {
                C5219.m1986(it.next().f8273, i, arrayList, c8431);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public HashSet<C4125> m11761() {
        return this.f698;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m11762() {
        if (this.f8272) {
            return this.f699;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m11763() {
        C4125 c4125;
        if (this.f8273.m11890() == 8) {
            return 0;
        }
        return (this.f8277 <= -1 || (c4125 = this.f8275) == null || c4125.f8273.m11890() != 8) ? this.f8276 : this.f8277;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C4125 m11764() {
        switch (C0334.f700[this.f8274.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f8273.f8388;
            case 3:
                return this.f8273.f8386;
            case 4:
                return this.f8273.f8389;
            case 5:
                return this.f8273.f8387;
            default:
                throw new AssertionError(this.f8274.name());
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C4128 m11765() {
        return this.f8273;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C7503 m11766() {
        return this.f8278;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C4125 m11767() {
        return this.f8275;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public EnumC0335 m11768() {
        return this.f8274;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m11769() {
        HashSet<C4125> hashSet = this.f698;
        if (hashSet == null) {
            return false;
        }
        Iterator<C4125> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m11764().m11772()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m11770() {
        HashSet<C4125> hashSet = this.f698;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m11771() {
        return this.f8272;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m11772() {
        return this.f8275 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m11773(C4128 c4128) {
        if (m11775(c4128, new HashSet<>())) {
            return false;
        }
        C4128 c4128M11876 = m11765().m11876();
        return c4128M11876 == c4128 || c4128.m11876() == c4128M11876;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m11774(C4128 c4128, C4125 c4125) {
        return m11773(c4128);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m11775(C4128 c4128, HashSet<C4128> hashSet) {
        if (hashSet.contains(c4128)) {
            return false;
        }
        hashSet.add(c4128);
        if (c4128 == m11765()) {
            return true;
        }
        ArrayList<C4125> arrayListM11848 = c4128.m11848();
        int size = arrayListM11848.size();
        for (int i = 0; i < size; i++) {
            C4125 c4125 = arrayListM11848.get(i);
            if (c4125.m11777(this) && c4125.m11772() && m11775(c4125.m11767().m11765(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m11776() {
        switch (C0334.f700[this.f8274.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f8274.name());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m11777(C4125 c4125) {
        EnumC0335 enumC0335M11768 = c4125.m11768();
        EnumC0335 enumC0335 = this.f8274;
        if (enumC0335M11768 == enumC0335) {
            return true;
        }
        switch (C0334.f700[enumC0335.ordinal()]) {
            case 1:
                return enumC0335M11768 != EnumC0335.BASELINE;
            case 2:
            case 3:
            case 7:
                return enumC0335M11768 == EnumC0335.LEFT || enumC0335M11768 == EnumC0335.RIGHT || enumC0335M11768 == EnumC0335.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return enumC0335M11768 == EnumC0335.TOP || enumC0335M11768 == EnumC0335.BOTTOM || enumC0335M11768 == EnumC0335.CENTER_Y || enumC0335M11768 == EnumC0335.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f8274.name());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m11778(C4125 c4125) {
        if (c4125 == null) {
            return false;
        }
        EnumC0335 enumC0335M11768 = c4125.m11768();
        EnumC0335 enumC0335 = this.f8274;
        if (enumC0335M11768 == enumC0335) {
            return enumC0335 != EnumC0335.BASELINE || (c4125.m11765().m11894() && m11765().m11894());
        }
        switch (C0334.f700[enumC0335.ordinal()]) {
            case 1:
                return (enumC0335M11768 == EnumC0335.BASELINE || enumC0335M11768 == EnumC0335.CENTER_X || enumC0335M11768 == EnumC0335.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = enumC0335M11768 == EnumC0335.LEFT || enumC0335M11768 == EnumC0335.RIGHT;
                if (c4125.m11765() instanceof C5226) {
                    return z || enumC0335M11768 == EnumC0335.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = enumC0335M11768 == EnumC0335.TOP || enumC0335M11768 == EnumC0335.BOTTOM;
                if (c4125.m11765() instanceof C5226) {
                    return z2 || enumC0335M11768 == EnumC0335.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f8274.name());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m11779() {
        switch (C0334.f700[this.f8274.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f8274.name());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m11780() {
        HashSet<C4125> hashSet;
        C4125 c4125 = this.f8275;
        if (c4125 != null && (hashSet = c4125.f698) != null) {
            hashSet.remove(this);
            if (this.f8275.f698.size() == 0) {
                this.f8275.f698 = null;
            }
        }
        this.f698 = null;
        this.f8275 = null;
        this.f8276 = 0;
        this.f8277 = -1;
        this.f8272 = false;
        this.f699 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m11781() {
        this.f8272 = false;
        this.f699 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m11782(C3639 c3639) {
        C7503 c7503 = this.f8278;
        if (c7503 == null) {
            this.f8278 = new C7503(C7503.EnumC1281.UNRESTRICTED, (String) null);
        } else {
            c7503.m23453();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m11783(int i) {
        this.f699 = i;
        this.f8272 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m11784(int i) {
        if (m11772()) {
            this.f8277 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m11785(int i) {
        if (m11772()) {
            this.f8276 = i;
        }
    }
}
