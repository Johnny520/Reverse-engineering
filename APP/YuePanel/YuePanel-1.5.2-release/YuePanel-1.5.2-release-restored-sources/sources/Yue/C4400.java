package Yue;

import Yue.C4128;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4400 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Object f9058 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Object f9059 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Object f9060 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Object f9061 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final Object f9062 = new Object();

    /* JADX INFO: renamed from: ۥ */
    public final int f866;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f867;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f9063;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f9064;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f9065;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f9066;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Object f9067;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f9068;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۡ۠$ۥ */
    public enum EnumC0400 {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4400() {
        this.f866 = -2;
        this.f867 = 0;
        this.f9063 = Integer.MAX_VALUE;
        this.f9064 = 1.0f;
        this.f9065 = 0;
        this.f9066 = 1.0f;
        this.f9067 = f9059;
        this.f9068 = false;
    }

    /* JADX INFO: renamed from: ۥ */
    public static C4400 m1348(int i) {
        C4400 c4400 = new C4400(f9058);
        c4400.m12724(i);
        return c4400;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C4400 m1349(Object obj) {
        C4400 c4400 = new C4400(f9058);
        c4400.m12725(obj);
        return c4400;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C4400 m12717() {
        return new C4400(f9061);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C4400 m12718(Object obj, float f) {
        C4400 c4400 = new C4400(f9062);
        c4400.m12732(obj, f);
        return c4400;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C4400 m12719() {
        return new C4400(f9060);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C4400 m12720(int i) {
        C4400 c4400 = new C4400();
        c4400.m12736(i);
        return c4400;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C4400 m12721(Object obj) {
        C4400 c4400 = new C4400();
        c4400.m12737(obj);
        return c4400;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C4400 m12722() {
        return new C4400(f9059);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m12723(C7583 c7583, C4128 c4128, int i) {
        int i2 = 2;
        if (i == 0) {
            if (this.f9068) {
                c4128.m11940(C4128.EnumC0339.MATCH_CONSTRAINT);
                Object obj = this.f9067;
                if (obj == f9059) {
                    i2 = 1;
                } else if (obj != f9062) {
                    i2 = 0;
                }
                c4128.m11941(i2, this.f867, this.f9063, this.f9064);
                return;
            }
            int i3 = this.f867;
            if (i3 > 0) {
                c4128.m11952(i3);
            }
            int i4 = this.f9063;
            if (i4 < Integer.MAX_VALUE) {
                c4128.m11949(i4);
            }
            Object obj2 = this.f9067;
            if (obj2 == f9059) {
                c4128.m11940(C4128.EnumC0339.WRAP_CONTENT);
                return;
            }
            if (obj2 == f9061) {
                c4128.m11940(C4128.EnumC0339.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    c4128.m11940(C4128.EnumC0339.FIXED);
                    c4128.m11965(this.f9065);
                    return;
                }
                return;
            }
        }
        if (this.f9068) {
            c4128.m11961(C4128.EnumC0339.MATCH_CONSTRAINT);
            Object obj3 = this.f9067;
            if (obj3 == f9059) {
                i2 = 1;
            } else if (obj3 != f9062) {
                i2 = 0;
            }
            c4128.m11962(i2, this.f867, this.f9063, this.f9064);
            return;
        }
        int i5 = this.f867;
        if (i5 > 0) {
            c4128.m11951(i5);
        }
        int i6 = this.f9063;
        if (i6 < Integer.MAX_VALUE) {
            c4128.m11948(i6);
        }
        Object obj4 = this.f9067;
        if (obj4 == f9059) {
            c4128.m11961(C4128.EnumC0339.WRAP_CONTENT);
            return;
        }
        if (obj4 == f9061) {
            c4128.m11961(C4128.EnumC0339.MATCH_PARENT);
        } else if (obj4 == null) {
            c4128.m11961(C4128.EnumC0339.FIXED);
            c4128.m11935(this.f9065);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C4400 m12724(int i) {
        this.f9067 = null;
        this.f9065 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C4400 m12725(Object obj) {
        this.f9067 = obj;
        if (obj instanceof Integer) {
            this.f9065 = ((Integer) obj).intValue();
            this.f9067 = null;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float m12726() {
        return this.f9066;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m12727() {
        return this.f9065;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C4400 m12728(int i) {
        if (this.f9063 >= 0) {
            this.f9063 = i;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C4400 m12729(Object obj) {
        Object obj2 = f9059;
        if (obj == obj2 && this.f9068) {
            this.f9067 = obj2;
            this.f9063 = Integer.MAX_VALUE;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C4400 m12730(int i) {
        if (i >= 0) {
            this.f867 = i;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C4400 m12731(Object obj) {
        if (obj == f9059) {
            this.f867 = -2;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C4400 m12732(Object obj, float f) {
        this.f9064 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C4400 m12733(float f) {
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m12734(float f) {
        this.f9066 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m12735(int i) {
        this.f9068 = false;
        this.f9067 = null;
        this.f9065 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C4400 m12736(int i) {
        this.f9068 = true;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C4400 m12737(Object obj) {
        this.f9067 = obj;
        this.f9068 = true;
        return this;
    }

    public C4400(Object obj) {
        this.f866 = -2;
        this.f867 = 0;
        this.f9063 = Integer.MAX_VALUE;
        this.f9064 = 1.0f;
        this.f9065 = 0;
        this.f9066 = 1.0f;
        this.f9068 = false;
        this.f9067 = obj;
    }
}
