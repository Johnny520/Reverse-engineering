package p248u3;

import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1924f;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import p041H0.C0630y0;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1976d;
import p191k4.C2475a;
import p225q3.AbstractC2930a;
import p225q3.AbstractC2932c;
import p225q3.C2934e;
import p225q3.C2935f;
import p225q3.C2936g;
import p225q3.InterfaceC2933d;
import p242t3.AbstractC3214c;
import p242t3.C3217f;
import p242t3.InterfaceC3218g;

/* JADX INFO: renamed from: u3.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3341e {

    /* JADX INFO: renamed from: a */
    public static final C3342f f10388a = new C3342f();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2933d m5582a(InterfaceC2933d interfaceC2933d, C2475a c2475a) {
        AbstractC1665j.m2985e(interfaceC2933d, "<this>");
        AbstractC1665j.m2985e(c2475a, "module");
        if (!AbstractC1665j.m2981a(interfaceC2933d.mo5132c(), C2934e.f9254h)) {
            return interfaceC2933d.mo5135f() ? m5582a(interfaceC2933d.mo5138j(0), c2475a) : interfaceC2933d;
        }
        AbstractC1923e.m3443A(interfaceC2933d);
        return interfaceC2933d;
    }

    /* JADX INFO: renamed from: b */
    public static final byte m5583b(char c5) {
        if (c5 < '~') {
            return C3339c.f10385b[c5];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: c */
    public static final String m5584c(int i5, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i5 >= 0) {
            sb.append("Unexpected JSON token at offset " + i5 + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC1976d.m3637e0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC1976d.m3637e0(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m5585d(InterfaceC2933d interfaceC2933d, AbstractC3214c abstractC3214c) {
        AbstractC1665j.m2985e(interfaceC2933d, "<this>");
        AbstractC1665j.m2985e(abstractC3214c, "json");
        if (abstractC3214c.f9997a.f10000a) {
            return true;
        }
        List annotations = interfaceC2933d.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC3218g) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final void m5586e(C0630y0 c0630y0, String str) {
        c0630y0.m1075k(c0630y0.f1999b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m5587f(InterfaceC2933d interfaceC2933d, AbstractC3214c abstractC3214c) {
        AbstractC1665j.m2985e(interfaceC2933d, "<this>");
        AbstractC1665j.m2985e(abstractC3214c, "json");
        AbstractC1665j.m2981a(interfaceC2933d.mo5132c(), C2936g.f9256h);
    }

    /* JADX INFO: renamed from: g */
    public static final EnumC3345i m5588g(InterfaceC2933d interfaceC2933d, AbstractC3214c abstractC3214c) {
        AbstractC1665j.m2985e(abstractC3214c, "<this>");
        AbstractC1665j.m2985e(interfaceC2933d, "desc");
        AbstractC1924f abstractC1924fMo5132c = interfaceC2933d.mo5132c();
        if (abstractC1924fMo5132c instanceof AbstractC2930a) {
            return EnumC3345i.f10401i;
        }
        if (AbstractC1665j.m2981a(abstractC1924fMo5132c, C2936g.f9257i)) {
            return EnumC3345i.f10399g;
        }
        if (!AbstractC1665j.m2981a(abstractC1924fMo5132c, C2936g.f9258j)) {
            return EnumC3345i.f10398f;
        }
        InterfaceC2933d interfaceC2933dM5582a = m5582a(interfaceC2933d.mo5138j(0), abstractC3214c.f9998b);
        AbstractC1924f abstractC1924fMo5132c2 = interfaceC2933dM5582a.mo5132c();
        if ((abstractC1924fMo5132c2 instanceof AbstractC2932c) || AbstractC1665j.m2981a(abstractC1924fMo5132c2, C2935f.f9255h)) {
            return EnumC3345i.f10400h;
        }
        String str = "Value of type '" + interfaceC2933dM5582a.mo5131b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC2933dM5582a.mo5132c() + '\'';
        interfaceC2933dM5582a.mo5131b();
        throw new C3217f(1, str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
