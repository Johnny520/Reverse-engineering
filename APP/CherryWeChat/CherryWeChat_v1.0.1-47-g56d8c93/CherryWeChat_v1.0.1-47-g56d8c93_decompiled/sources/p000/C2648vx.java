package p000;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: vx */
/* JADX INFO: loaded from: classes.dex */
public final class C2648vx {

    /* JADX INFO: renamed from: a */
    public Object f9162a;

    /* JADX INFO: renamed from: b */
    public Serializable f9163b;

    /* JADX INFO: renamed from: c */
    public Object f9164c;

    /* JADX INFO: renamed from: d */
    public Serializable f9165d;

    /* JADX INFO: renamed from: e */
    public Object f9166e;

    public C2648vx(Boolean bool, Double d) {
        this(bool, d, (Double) null, Boolean.FALSE, (Double) null);
    }

    /* JADX INFO: renamed from: a */
    public Object m5178a() {
        Field fieldM5179b = m5179b();
        if (fieldM5179b == null) {
            return null;
        }
        try {
            return fieldM5179b.get(this.f9164c);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r0 = r0.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r0 = r0.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Field m5179b() {
        Class superclass = (Class) this.f9163b;
        if (((Field) this.f9166e) == null) {
            Field field = null;
            if (TextUtils.isEmpty((String) this.f9162a)) {
                Class cls = (Class) this.f9165d;
                loop0: while (true) {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    AbstractC0295Gu.m625r(-577415403272245L);
                    int length = declaredFields.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Field field2 = declaredFields[i];
                        if (AbstractC0585Nj.m1134a(field2.getType(), cls)) {
                            field2.setAccessible(true);
                            field = field2;
                            break loop0;
                        }
                        i++;
                    }
                }
            } else {
                Class cls2 = (Class) this.f9165d;
                String str = (String) this.f9162a;
                loop2: while (true) {
                    Field[] declaredFields2 = superclass.getDeclaredFields();
                    AbstractC0295Gu.m625r(-577316619024437L);
                    int length2 = declaredFields2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        Field field3 = declaredFields2[i2];
                        if ((cls2 == null || AbstractC0585Nj.m1134a(field3.getType(), cls2)) && AbstractC0585Nj.m1134a(field3.getName(), str)) {
                            field3.setAccessible(true);
                            field = field3;
                            break loop2;
                        }
                        i2++;
                    }
                }
            }
            this.f9166e = field;
        }
        return (Field) this.f9166e;
    }

    /* JADX INFO: renamed from: c */
    public void m5180c(String str) {
        AbstractC0295Gu.m625r(-577295144187957L);
        this.f9162a = str;
    }

    /* JADX INFO: renamed from: d */
    public void m5181d(Object obj) {
        Object obj2 = this.f9164c;
        if (obj2 == null) {
            return;
        }
        if (((Field) this.f9166e) == null) {
            this.f9166e = m5179b();
        }
        Field field = (Field) this.f9166e;
        if (field != null) {
            try {
                field.setAccessible(true);
                ((Field) this.f9166e).set(obj2, obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5182e(String str) {
        AbstractC0295Gu.m625r(-577273669351477L);
        int i = AbstractC1450gG.f5067a;
        this.f9165d = AbstractC1406fG.m2718r0(str);
    }

    public C2648vx(String str, String str2, String str3, String str4, View.OnClickListener onClickListener) {
        AbstractC0295Gu.m625r(-47455093651509L);
        AbstractC0295Gu.m625r(-47472273520693L);
        AbstractC0295Gu.m625r(-47510928226357L);
        this.f9162a = str;
        this.f9163b = str2;
        this.f9164c = str3;
        this.f9165d = str4;
        this.f9166e = onClickListener;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C2648vx(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, android.view.View.OnClickListener r11, int r12) {
        /*
            r6 = this;
            r0 = r12 & 2
            if (r0 == 0) goto Ld
            r0 = -47536698030133(0xffffd4c4000007cb, double:NaN)
            java.lang.String r8 = p000.AbstractC0295Gu.m625r(r0)
        Ld:
            r2 = r8
            r8 = r12 & 8
            r0 = 0
            if (r8 == 0) goto L15
            r4 = r0
            goto L16
        L15:
            r4 = r10
        L16:
            r8 = r12 & 16
            if (r8 == 0) goto L1f
            r5 = r0
            r1 = r7
            r3 = r9
            r0 = r6
            goto L23
        L1f:
            r5 = r11
            r0 = r6
            r1 = r7
            r3 = r9
        L23:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2648vx.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.view.View$OnClickListener, int):void");
    }

    public C2648vx(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
        this.f9162a = bool;
        this.f9163b = d;
        this.f9164c = d2;
        this.f9165d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f9166e = d3;
    }
}
