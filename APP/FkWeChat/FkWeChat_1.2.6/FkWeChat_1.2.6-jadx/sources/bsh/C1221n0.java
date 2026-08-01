package bsh;

import bsh.C1281x0;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: bsh.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1221n0 extends AbstractC1195i4 implements C1281x0.a {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A */
    public Class f3705A;

    /* JADX INFO: renamed from: B */
    public boolean f3706B;

    /* JADX INFO: renamed from: C */
    public String f3707C;

    /* JADX INFO: renamed from: y */
    public Class f3708y;

    /* JADX INFO: renamed from: z */
    public int f3709z;

    public C1221n0(int i10) {
        super(i10);
        this.f3706B = false;
    }

    /* JADX INFO: renamed from: y */
    public static String m4923y(Class cls) {
        if (cls == Boolean.TYPE) {
            return "Z";
        }
        if (cls == Character.TYPE) {
            return "C";
        }
        if (cls == Byte.TYPE) {
            return "B";
        }
        if (cls == Short.TYPE) {
            return "S";
        }
        if (cls == Integer.TYPE) {
            return "I";
        }
        if (cls == Long.TYPE) {
            return "J";
        }
        if (cls == Float.TYPE) {
            return "F";
        }
        if (cls == Double.TYPE) {
            return "D";
        }
        if (cls == Void.TYPE) {
            return "V";
        }
        String strReplace = cls.getName().replace('.', '/');
        if (strReplace.startsWith("[") || strReplace.endsWith(";")) {
            return strReplace;
        }
        return "L" + strReplace.replace('.', '/') + ";";
    }

    @Override // bsh.C1281x0.a
    /* JADX INFO: renamed from: b */
    public void mo4283b() {
        this.f3705A = null;
        this.f3708y = null;
    }

    /* JADX INFO: renamed from: k */
    public void m4924k() {
        this.f3709z++;
    }

    /* JADX INFO: renamed from: l */
    public int m4925l() {
        return this.f3709z;
    }

    /* JADX INFO: renamed from: o */
    public Class m4926o() {
        return this.f3708y;
    }

    /* JADX INFO: renamed from: v */
    public Class m4927v(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        Class cls = this.f3705A;
        if (cls != null) {
            return cls;
        }
        InterfaceC1188h3 interfaceC1188h3M4929z = m4929z();
        Class<Object> cls2 = Object.class;
        if (interfaceC1188h3M4929z instanceof C1161d0) {
            this.f3708y = ((C1161d0) interfaceC1188h3M4929z).m4270k();
        } else {
            try {
                this.f3708y = ((C1138c) interfaceC1188h3M4929z).m4112l(c1174f1, runnableC1205k2);
            } catch (C1163d2 e10) {
                if (interfaceC1188h3M4929z.getText().trim().length() != 1 || !(e10.getCause() instanceof ClassNotFoundException)) {
                    throw e10;
                }
                this.f3708y = cls2;
            }
        }
        int i10 = this.f3709z;
        if (i10 > 0) {
            try {
                int[] iArr = new int[i10];
                Class<Object> cls3 = this.f3708y;
                if (cls3 != null) {
                    cls2 = cls3;
                }
                this.f3705A = Array.newInstance((Class<?>) cls2, iArr).getClass();
            } catch (Exception e11) {
                throw new C1169e2("Couldn't construct array type", this, c1174f1, e11);
            }
        } else {
            this.f3705A = this.f3708y;
        }
        if (!this.f3706B) {
            runnableC1205k2.m4492m().addListener(this);
            this.f3706B = true;
        }
        return this.f3705A;
    }

    /* JADX INFO: renamed from: x */
    public String m4928x(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2, String str) {
        String strM4923y;
        String str2 = this.f3707C;
        if (str2 != null) {
            return str2;
        }
        InterfaceC1188h3 interfaceC1188h3M4929z = m4929z();
        if (interfaceC1188h3M4929z instanceof C1161d0) {
            strM4923y = m4923y(((C1161d0) interfaceC1188h3M4929z).f3517y);
        } else {
            String strReplace = ((C1138c) interfaceC1188h3M4929z).f3466y;
            String str3 = (String) c1174f1.m4319h().f3580u.get(strReplace);
            Class clsM4112l = null;
            if (str3 == null) {
                try {
                    clsM4112l = ((C1138c) interfaceC1188h3M4929z).m4112l(c1174f1, runnableC1205k2);
                } catch (C1163d2 unused) {
                    if (strReplace.length() == 1) {
                        strReplace = "java.lang.Object";
                    }
                }
            } else {
                strReplace = str3.replace('.', '$');
            }
            if (clsM4112l != null) {
                strM4923y = m4923y(clsM4112l);
            } else if (str == null || C1130a3.m4074h(strReplace)) {
                strM4923y = "L" + strReplace.replace('.', '/') + ";";
            } else {
                strM4923y = "L" + str.replace('.', '/') + "/" + strReplace + ";";
            }
        }
        for (int i10 = 0; i10 < this.f3709z; i10++) {
            strM4923y = "[" + strM4923y;
        }
        this.f3707C = strM4923y;
        return strM4923y;
    }

    /* JADX INFO: renamed from: z */
    public InterfaceC1188h3 m4929z() {
        return mo4051s(0);
    }
}
