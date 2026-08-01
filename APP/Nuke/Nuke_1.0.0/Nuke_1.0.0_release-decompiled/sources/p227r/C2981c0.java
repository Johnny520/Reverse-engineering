package p227r;

import android.view.ViewConfiguration;
import com.bumptech.glide.AbstractC1924f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import p000A.C0086s0;
import p000A.C0099z;
import p007B0.C0200n;
import p007B0.C0209w;
import p011B4.AbstractC0231b;
import p013C0.C0236c;
import p013C0.C0238e;
import p027E4.C0330q;
import p061L2.AbstractC0973m;
import p074O2.InterfaceC1046d;
import p088R1.C1198H;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p128a.AbstractC1785a;
import p136b0.C1842d;
import p143c3.C1906h;
import p153e1.InterfaceC2007c;
import p154e2.C2023b;
import p172h3.AbstractC2250j;
import p172h3.C2243c;
import p172h3.C2249i;
import p204n0.C2683b;
import p214o3.InterfaceC2798a;
import p225q3.AbstractC2930a;
import p225q3.AbstractC2932c;
import p225q3.C2935f;
import p225q3.C2936g;
import p225q3.InterfaceC2933d;
import p231r3.InterfaceC3151a;
import p231r3.InterfaceC3153c;
import p236s3.AbstractC3194j;
import p236s3.C3201q;
import p242t3.AbstractC3214c;
import p242t3.C3216e;
import p242t3.C3217f;
import p242t3.EnumC3212a;
import p242t3.InterfaceC3215d;
import p248u3.AbstractC3341e;
import p248u3.AbstractC3344h;
import p248u3.EnumC3345i;

/* JADX INFO: renamed from: r.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2981c0 implements InterfaceC3153c, InterfaceC3151a {

    /* JADX INFO: renamed from: a */
    public boolean f9438a;

    /* JADX INFO: renamed from: b */
    public final Object f9439b;

    /* JADX INFO: renamed from: c */
    public final Object f9440c;

    /* JADX INFO: renamed from: d */
    public final Serializable f9441d;

    /* JADX INFO: renamed from: e */
    public Object f9442e;

    /* JADX INFO: renamed from: f */
    public final Object f9443f;

    /* JADX INFO: renamed from: g */
    public Object f9444g;

    /* JADX INFO: renamed from: h */
    public Object f9445h;

    public C2981c0(C1198H c1198h, AbstractC3214c abstractC3214c, EnumC3345i enumC3345i, C2981c0[] c2981c0Arr) {
        AbstractC1665j.m2985e(c1198h, "composer");
        AbstractC1665j.m2985e(abstractC3214c, "json");
        this.f9439b = c1198h;
        this.f9440c = abstractC3214c;
        this.f9441d = enumC3345i;
        this.f9442e = c2981c0Arr;
        this.f9443f = abstractC3214c.f9997a;
        int iOrdinal = enumC3345i.ordinal();
        if (c2981c0Arr != null) {
            C2981c0 c2981c0 = c2981c0Arr[iOrdinal];
            if (c2981c0 == null && c2981c0 == this) {
                return;
            }
            c2981c0Arr[iOrdinal] = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5174k(p227r.C2981c0 r16, p227r.C2940A0 r17, p227r.C2973X r18, float r19, float r20, p084Q2.AbstractC1178c r21) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2981c0.m5174k(r.c0, r.A0, r.X, float, float, Q2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5175l(p227r.C2981c0 r11, p117X2.C1675t r12, p117X2.C1672q r13, p227r.C2940A0 r14, p117X2.C1675t r15, long r16, p084Q2.AbstractC1178c r18) throws java.lang.Throwable {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof p227r.C2977a0
            if (r3 == 0) goto L17
            r3 = r2
            r.a0 r3 = (p227r.C2977a0) r3
            int r4 = r3.f9431m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f9431m = r4
            goto L1c
        L17:
            r.a0 r3 = new r.a0
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f9430l
            int r4 = r3.f9431m
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            X2.t r11 = r3.f9429k
            r.A0 r12 = r3.f9428j
            X2.q r0 = r3.f9427i
            X2.t r1 = r3.f9426h
            r.c0 r3 = r3.f9425g
            p127Z2.AbstractC1784a.m3205S(r2)
            r7 = r11
            r6 = r12
            r12 = r1
            r11 = r3
            goto L6a
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            p127Z2.AbstractC1784a.m3205S(r2)
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4b
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4b:
            A.y0 r2 = new A.y0
            r4 = 0
            r6 = 7
            r2.<init>(r11, r4, r6)
            r3.f9425g = r11
            r3.f9426h = r12
            r3.f9427i = r13
            r3.f9428j = r14
            r3.f9429k = r15
            r3.f9431m = r5
            java.lang.Object r2 = p160f3.AbstractC2162v.m4002x(r0, r2, r3)
            P2.a r0 = p079P2.EnumC1152a.f3788d
            if (r2 != r0) goto L67
            return r0
        L67:
            r0 = r13
            r6 = r14
            r7 = r15
        L6a:
            r.X r2 = (p227r.C2973X) r2
            if (r2 == 0) goto La4
            java.lang.Object r1 = r12.f5710e
            r.X r1 = (p227r.C2973X) r1
            boolean r1 = r1.f9405c
            long r3 = r2.f9403a
            long r8 = r2.f9404b
            r.X r10 = new r.X
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.f5710e = r1
            long r3 = r6.m5145e(r3)
            float r12 = r6.m5149i(r3)
            r0.f5706d = r12
            r12 = 0
            r1 = 30
            n.j r12 = p203n.AbstractC2649d.m4608a(r12, r1)
            r7.f5710e = r12
            r11.m5195v(r2)
            float r11 = r0.f5706d
            boolean r11 = p227r.AbstractC2972W.m5170a(r11)
            r11 = r11 ^ r5
            goto La5
        La4:
            r11 = 0
        La5:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2981c0.m5175l(r.c0, X2.t, X2.q, r.A0, X2.t, long, Q2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static C2973X m5176u(C2243c c2243c) {
        C2973X c2973x = null;
        C1906h c1906hM3252m = AbstractC1785a.m3252m(new C0086s0((Object) new C0099z(23, c2243c), (InterfaceC1046d) (0 == true ? 1 : 0), 2));
        while (c1906hM3252m.hasNext()) {
            C2973X c2973xM5171a = (C2973X) c1906hM3252m.next();
            if (c2973x != null) {
                c2973xM5171a = c2973x.m5171a(c2973xM5171a);
            }
            c2973x = c2973xM5171a;
        }
        return c2973x;
    }

    @Override // p231r3.InterfaceC3153c
    /* JADX INFO: renamed from: a */
    public InterfaceC3151a mo5177a(InterfaceC2933d interfaceC2933d) {
        C2981c0 c2981c0;
        C2981c0[] c2981c0Arr = (C2981c0[]) this.f9442e;
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        AbstractC3214c abstractC3214c = (AbstractC3214c) this.f9440c;
        EnumC3345i enumC3345iM5588g = AbstractC3341e.m5588g(interfaceC2933d, abstractC3214c);
        char c5 = enumC3345iM5588g.f10404d;
        C1198H c1198h = (C1198H) this.f9439b;
        c1198h.m2259b(c5);
        c1198h.f3937d = true;
        String str = (String) this.f9444g;
        if (str != null) {
            String strMo5131b = (String) this.f9445h;
            if (strMo5131b == null) {
                strMo5131b = interfaceC2933d.mo5131b();
            }
            c1198h.m2258a();
            mo5186j(str);
            c1198h.m2259b(':');
            mo5186j(strMo5131b);
            this.f9444g = null;
            this.f9445h = null;
        }
        return ((EnumC3345i) this.f9441d) == enumC3345iM5588g ? this : (c2981c0Arr == null || (c2981c0 = c2981c0Arr[enumC3345iM5588g.ordinal()]) == null) ? new C2981c0(c1198h, abstractC3214c, enumC3345iM5588g, c2981c0Arr) : c2981c0;
    }

    @Override // p231r3.InterfaceC3153c
    /* JADX INFO: renamed from: b */
    public void mo5178b() {
        C1198H c1198h = (C1198H) this.f9439b;
        c1198h.getClass();
        AbstractC1665j.m2985e("null", "v");
        ((C0236c) c1198h.f3938e).m421j("null");
    }

    @Override // p231r3.InterfaceC3153c
    /* JADX INFO: renamed from: c */
    public void mo5179c(InterfaceC2798a interfaceC2798a, Object obj) {
        String strDiscriminator;
        String str;
        AbstractC1665j.m2985e(interfaceC2798a, "serializer");
        AbstractC3214c abstractC3214c = (AbstractC3214c) this.f9440c;
        C3216e c3216e = abstractC3214c.f9997a;
        C3216e c3216e2 = abstractC3214c.f9997a;
        int iOrdinal = c3216e.f10005f.ordinal();
        if (iOrdinal == 0) {
            strDiscriminator = null;
        } else {
            if (iOrdinal == 1) {
                AbstractC1924f abstractC1924fMo5132c = interfaceC2798a.mo1486e().mo5132c();
                if (AbstractC1665j.m2981a(abstractC1924fMo5132c, C2936g.f9256h) || AbstractC1665j.m2981a(abstractC1924fMo5132c, C2936g.f9259k)) {
                    InterfaceC2933d interfaceC2933dMo1486e = interfaceC2798a.mo1486e();
                    AbstractC1665j.m2985e(interfaceC2933dMo1486e, "<this>");
                    Iterator it = interfaceC2933dMo1486e.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = c3216e2.f10003d;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof InterfaceC3215d) {
                            strDiscriminator = ((InterfaceC3215d) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                throw new C0330q();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            InterfaceC2933d interfaceC2933dMo1486e2 = interfaceC2798a.mo1486e();
            AbstractC1665j.m2985e(interfaceC2933dMo1486e2, "<this>");
            AbstractC3341e.m5587f(interfaceC2933dMo1486e2, abstractC3214c);
            if (AbstractC3194j.m5459a(interfaceC2933dMo1486e2).contains(strDiscriminator)) {
                String strMo5131b = interfaceC2798a.mo1486e().mo5131b();
                String strMo5131b2 = interfaceC2798a.mo1486e().mo5131b();
                if (c3216e2.f10005f == EnumC3212a.f9993d && AbstractC1665j.m2981a(strMo5131b, strMo5131b2)) {
                    str = "in ALL_JSON_OBJECTS class discriminator mode";
                } else {
                    str = "as base class '" + strMo5131b + '\'';
                }
                throw new C3217f(1, AbstractC0231b.m403n(AbstractC0231b.m405p("Class '", strMo5131b2, "' cannot be serialized ", str, " because it has property name that conflicts with JSON class discriminator '"), strDiscriminator, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            AbstractC1924f abstractC1924fMo5132c2 = interfaceC2798a.mo1486e().mo5132c();
            AbstractC1665j.m2985e(abstractC1924fMo5132c2, "kind");
            if (abstractC1924fMo5132c2 instanceof C2935f) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (abstractC1924fMo5132c2 instanceof AbstractC2932c) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (abstractC1924fMo5132c2 instanceof AbstractC2930a) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            String strMo5131b3 = interfaceC2798a.mo1486e().mo5131b();
            this.f9444g = strDiscriminator;
            this.f9445h = strMo5131b3;
        }
        interfaceC2798a.mo1484c(this, obj);
    }

    @Override // p231r3.InterfaceC3151a
    /* JADX INFO: renamed from: d */
    public boolean mo5180d(InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        return false;
    }

    @Override // p231r3.InterfaceC3151a
    /* JADX INFO: renamed from: e */
    public void mo5181e(InterfaceC2933d interfaceC2933d, int i5, Object obj) {
        C3201q c3201q = C3201q.f9974a;
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        if (obj != null || ((C3216e) this.f9443f).f10001b) {
            C3201q c3201q2 = C3201q.f9974a;
            AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
            m5189o(interfaceC2933d, i5);
            C3201q.f9975b.getClass();
            if (obj == null) {
                mo5178b();
            } else {
                mo5179c(c3201q2, obj);
            }
        }
    }

    @Override // p231r3.InterfaceC3153c
    /* JADX INFO: renamed from: f */
    public void mo5182f(boolean z5) {
        if (this.f9438a) {
            mo5186j(String.valueOf(z5));
        } else {
            ((C0236c) ((C1198H) this.f9439b).f3938e).m421j(String.valueOf(z5));
        }
    }

    @Override // p231r3.InterfaceC3153c
    /* JADX INFO: renamed from: g */
    public void mo5183g(int i5) {
        if (this.f9438a) {
            mo5186j(String.valueOf(i5));
        } else {
            ((C0236c) ((C1198H) this.f9439b).f3938e).m421j(String.valueOf(i5));
        }
    }

    @Override // p231r3.InterfaceC3153c
    /* JADX INFO: renamed from: h */
    public void mo5184h(long j5) {
        if (this.f9438a) {
            mo5186j(String.valueOf(j5));
        } else {
            ((C0236c) ((C1198H) this.f9439b).f3938e).m421j(String.valueOf(j5));
        }
    }

    @Override // p231r3.InterfaceC3151a
    /* JADX INFO: renamed from: i */
    public void mo5185i(InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        EnumC3345i enumC3345i = (EnumC3345i) this.f9441d;
        C1198H c1198h = (C1198H) this.f9439b;
        c1198h.getClass();
        c1198h.f3937d = false;
        c1198h.m2259b(enumC3345i.f10405e);
    }

    @Override // p231r3.InterfaceC3153c
    /* JADX INFO: renamed from: j */
    public void mo5186j(String str) {
        byte b2;
        AbstractC1665j.m2985e(str, "value");
        C1198H c1198h = (C1198H) this.f9439b;
        c1198h.getClass();
        AbstractC1665j.m2985e(str, "value");
        C0236c c0236c = (C0236c) c1198h.f3938e;
        c0236c.m416e(c0236c.f793e, str.length() + 2);
        char[] cArr = (char[]) c0236c.f794f;
        int i5 = c0236c.f793e;
        int i6 = i5 + 1;
        cArr[i5] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i6);
        int i7 = length + i6;
        int i8 = i6;
        while (i8 < i7) {
            char c5 = cArr[i8];
            byte[] bArr = AbstractC3344h.f10397b;
            if (c5 < bArr.length && bArr[c5] != 0) {
                int length2 = str.length();
                for (int i9 = i8 - i6; i9 < length2; i9++) {
                    c0236c.m416e(i8, 2);
                    char cCharAt = str.charAt(i9);
                    byte[] bArr2 = AbstractC3344h.f10397b;
                    if (cCharAt >= bArr2.length || (b2 = bArr2[cCharAt]) == 0) {
                        int i10 = i8 + 1;
                        ((char[]) c0236c.f794f)[i8] = cCharAt;
                        i8 = i10;
                    } else {
                        if (b2 == 1) {
                            String str2 = AbstractC3344h.f10396a[cCharAt];
                            AbstractC1665j.m2982b(str2);
                            c0236c.m416e(i8, str2.length());
                            str2.getChars(0, str2.length(), (char[]) c0236c.f794f, i8);
                            int length3 = str2.length() + i8;
                            c0236c.f793e = length3;
                            i8 = length3;
                        } else {
                            char[] cArr2 = (char[]) c0236c.f794f;
                            cArr2[i8] = '\\';
                            cArr2[i8 + 1] = (char) b2;
                            i8 += 2;
                            c0236c.f793e = i8;
                        }
                    }
                }
                c0236c.m416e(i8, 1);
                ((char[]) c0236c.f794f)[i8] = '\"';
                c0236c.f793e = i8 + 1;
                return;
            }
            i8++;
        }
        cArr[i7] = '\"';
        c0236c.f793e = i7 + 1;
    }

    /* JADX INFO: renamed from: m */
    public float m5187m(C3025y0 c3025y0, float f2) {
        C2940A0 c2940a0 = (C2940A0) this.f9439b;
        long jM5148h = c2940a0.m5148h(c2940a0.m5144d(f2));
        C2940A0 c2940a02 = c3025y0.f9592a;
        return c2940a0.m5147g(c2940a0.m5145e(c2940a02.m5143c(c2940a02.f9280k, jM5148h, 1)));
    }

    /* JADX INFO: renamed from: n */
    public void m5188n(InterfaceC2933d interfaceC2933d, int i5, boolean z5) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        m5189o(interfaceC2933d, i5);
        mo5182f(z5);
    }

    /* JADX INFO: renamed from: o */
    public void m5189o(InterfaceC2933d interfaceC2933d, int i5) {
        C1198H c1198h = (C1198H) this.f9439b;
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        int iOrdinal = ((EnumC3345i) this.f9441d).ordinal();
        boolean z5 = true;
        if (iOrdinal == 1) {
            if (!c1198h.f3937d) {
                c1198h.m2259b(',');
            }
            c1198h.m2258a();
            return;
        }
        if (iOrdinal == 2) {
            if (c1198h.f3937d) {
                this.f9438a = true;
                c1198h.m2258a();
                return;
            }
            if (i5 % 2 == 0) {
                c1198h.m2259b(',');
                c1198h.m2258a();
            } else {
                c1198h.m2259b(':');
                c1198h.m2261d();
                z5 = false;
            }
            this.f9438a = z5;
            return;
        }
        if (iOrdinal == 3) {
            if (i5 == 0) {
                this.f9438a = true;
            }
            if (i5 == 1) {
                c1198h.m2259b(',');
                c1198h.m2261d();
                this.f9438a = false;
                return;
            }
            return;
        }
        if (!c1198h.f3937d) {
            c1198h.m2259b(',');
        }
        c1198h.m2258a();
        AbstractC3214c abstractC3214c = (AbstractC3214c) this.f9440c;
        AbstractC1665j.m2985e(abstractC3214c, "json");
        AbstractC3341e.m5587f(interfaceC2933d, abstractC3214c);
        mo5186j(interfaceC2933d.mo5134e(i5));
        c1198h.m2259b(':');
        c1198h.m2261d();
    }

    /* JADX INFO: renamed from: p */
    public void m5190p(int i5, int i6, InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        m5189o(interfaceC2933d, i5);
        mo5183g(i6);
    }

    /* JADX INFO: renamed from: q */
    public void m5191q(InterfaceC2933d interfaceC2933d, int i5, long j5) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        m5189o(interfaceC2933d, i5);
        mo5184h(j5);
    }

    /* JADX INFO: renamed from: r */
    public void m5192r(InterfaceC2933d interfaceC2933d, int i5, InterfaceC2798a interfaceC2798a, Object obj) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        AbstractC1665j.m2985e(interfaceC2798a, "serializer");
        m5189o(interfaceC2933d, i5);
        mo5179c(interfaceC2798a, obj);
    }

    /* JADX INFO: renamed from: s */
    public void m5193s(InterfaceC2933d interfaceC2933d, int i5, String str) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        AbstractC1665j.m2985e(str, "value");
        m5189o(interfaceC2933d, i5);
        mo5186j(str);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: t */
    public boolean m5194t(C0200n c0200n) {
        long j5;
        ViewConfiguration viewConfiguration = (ViewConfiguration) ((C1753n) this.f9440c).f6028e;
        float f2 = -viewConfiguration.getScaledVerticalScrollFactor();
        float f5 = -viewConfiguration.getScaledHorizontalScrollFactor();
        ?? r22 = c0200n.f696a;
        C2683b c2683b = new C2683b(0L);
        int size = r22.size();
        int i5 = 0;
        while (true) {
            j5 = c2683b.f8556a;
            if (i5 >= size) {
                break;
            }
            c2683b = new C2683b(C2683b.m4647e(j5, ((C0209w) r22.get(i5)).f720j));
            i5++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32)) * f5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) * f2)) & 4294967295L);
        C2940A0 c2940a0 = (C2940A0) this.f9439b;
        float fM5149i = c2940a0.m5149i(c2940a0.m5145e(jFloatToRawIntBits));
        return fM5149i != 0.0f ? (fM5149i > 0.0f ? 1 : (fM5149i == 0.0f ? 0 : -1)) > 0 ? c2940a0.f9270a.mo13d() : c2940a0.f9270a.mo10a() : false ? !(((C2243c) this.f9443f).mo4090o(new C2973X(jFloatToRawIntBits, ((C0209w) AbstractC0973m.m2012S(c0200n.f696a)).f712b, false)) instanceof C2249i) : this.f9438a;
    }

    /* JADX INFO: renamed from: v */
    public void m5195v(C2973X c2973x) {
        C2023b c2023b = (C2023b) this.f9445h;
        long j5 = c2973x.f9404b;
        long j6 = c2973x.f9403a;
        ((C0238e) c2023b.f6752e).m422a(Float.intBitsToFloat((int) (j6 >> 32)), j5);
        ((C0238e) c2023b.f6753f).m422a(Float.intBitsToFloat((int) (j6 & 4294967295L)), j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m5196w(p227r.C2940A0 r5, p227r.C2975Z r6, p084Q2.AbstractC1178c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p227r.C2979b0
            if (r0 == 0) goto L13
            r0 = r7
            r.b0 r0 = (p227r.C2979b0) r0
            int r1 = r0.f9434i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9434i = r1
            goto L18
        L13:
            r.b0 r0 = new r.b0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f9432g
            int r1 = r0.f9434i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            p127Z2.AbstractC1784a.m3205S(r7)
            goto L4f
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            p127Z2.AbstractC1784a.m3205S(r7)
            r4.f9438a = r2
            A.U r7 = new A.U
            r1 = 0
            r3 = 20
            r7.<init>(r5, r6, r1, r3)
            r0.f9434i = r2
            f3.h0 r5 = new f3.h0
            O2.i r6 = r0.f3866e
            p117X2.AbstractC1665j.m2982b(r6)
            r5.<init>(r0, r6)
            java.lang.Object r5 = p179i4.AbstractC2352g.m4183F(r5, r5, r7)
            P2.a r6 = p079P2.EnumC1152a.f3788d
            if (r5 != r6) goto L4f
            return r6
        L4f:
            r5 = 0
            r4.f9438a = r5
            K2.q r5 = p056K2.C0891q.f2780a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2981c0.m5196w(r.A0, r.Z, Q2.c):java.lang.Object");
    }

    public C2981c0(C2940A0 c2940a0, C1753n c1753n, C1842d c1842d, InterfaceC2007c interfaceC2007c) {
        this.f9439b = c2940a0;
        this.f9440c = c1753n;
        this.f9441d = c1842d;
        this.f9442e = interfaceC2007c;
        this.f9443f = AbstractC2250j.m4101a(Integer.MAX_VALUE, 6, null);
        this.f9445h = new C2023b(7);
    }
}
