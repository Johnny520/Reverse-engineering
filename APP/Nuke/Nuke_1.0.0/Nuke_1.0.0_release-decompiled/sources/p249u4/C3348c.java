package p249u4;

import p179i4.AbstractC2352g;
import p206n2.C2690b;

/* JADX INFO: renamed from: u4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3348c extends AbstractC2352g {

    /* JADX INFO: renamed from: b */
    public String f10408b;

    /* JADX INFO: renamed from: c */
    public int f10409c;

    @Override // p179i4.AbstractC2352g
    /* JADX INFO: renamed from: w */
    public final int mo4213w(C2690b c2690b) {
        String str = this.f10408b;
        if (str == null) {
            throw new IllegalArgumentException("value must be specified");
        }
        if (str.length() == 0 && this.f10409c != 5) {
            this.f10409c = 5;
        }
        int iM4675e = c2690b.m4675e(str);
        int i5 = this.f10409c;
        byte b2 = 1;
        if (i5 != 1) {
            byte b5 = 2;
            if (i5 != 2) {
                b2 = 3;
                if (i5 != 3) {
                    b5 = 4;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            throw null;
                        }
                        b2 = b5;
                    }
                } else {
                    b2 = b5;
                }
            }
        } else {
            b2 = 0;
        }
        c2690b.m4682l(3);
        c2690b.m4673c(0, iM4675e);
        if (b2 != 0) {
            c2690b.m4671a(b2);
            c2690b.m4681k(1);
        }
        int iM4676f = c2690b.m4676f();
        c2690b.m4678h(iM4676f);
        return iM4676f;
    }
}
