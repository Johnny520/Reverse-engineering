package p027E4;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;
import p011B4.AbstractC0231b;
import p208n4.C2706e;

/* JADX INFO: renamed from: E4.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0296J extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final Method f952d;

    /* JADX INFO: renamed from: e */
    public final int f953e;

    /* JADX INFO: renamed from: f */
    public final String f954f;

    /* JADX INFO: renamed from: g */
    public final C0314b f955g;

    /* JADX INFO: renamed from: h */
    public final boolean f956h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0296J(Method method, int i5, String str, boolean z5) {
        C0314b c0314b = C0314b.f1031e;
        this.f952d = method;
        this.f953e = i5;
        Objects.requireNonNull(str, "name == null");
        this.f954f = str;
        this.f955g = c0314b;
        this.f956h = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo515a(C0303Q c0303q, Object obj) throws EOFException {
        String strM4699A;
        String strReplace;
        char c5;
        String str = this.f954f;
        if (obj == null) {
            throw AbstractC0315b0.m543n(this.f952d, this.f953e, AbstractC0231b.m400k("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f955g.getClass();
        String string = obj.toString();
        if (c0303q.f970c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z5 = this.f956h;
            int i5 = 47;
            int i6 = -1;
            int i7 = 127;
            int i8 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z5 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C2706e c2706e = new C2706e();
                c2706e.m4710L(0, iCharCount, string);
                C2706e c2706e2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (z5 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                        c5 = '%';
                    } else if (iCodePointAt2 < i8 || iCodePointAt2 >= i7 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i6 || (!z5 && (iCodePointAt2 == i5 || iCodePointAt2 == 37))) {
                        if (c2706e2 == null) {
                            c2706e2 = new C2706e();
                        }
                        c2706e2.m4712N(iCodePointAt2);
                        long j5 = c2706e2.f8629e;
                        for (long j6 = 0; j6 < j5; j6++) {
                            byte bM4721n = c2706e2.m4721n(j6);
                            c2706e.m4705G(37);
                            char[] cArr = C0303Q.f966l;
                            c2706e.m4705G(cArr[((bM4721n & 255) >> 4) & 15]);
                            c2706e.m4705G(cArr[bM4721n & 15]);
                        }
                        c5 = '%';
                        c2706e2.m4715h();
                    } else {
                        c2706e.m4712N(iCodePointAt2);
                        c5 = '%';
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 47;
                    i6 = -1;
                    i7 = 127;
                    i8 = 32;
                }
                strM4699A = c2706e.m4699A();
                strReplace = c0303q.f970c.replace("{" + str + "}", strM4699A);
                if (!C0303Q.f967m.matcher(strReplace).matches()) {
                    throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
                }
                c0303q.f970c = strReplace;
                return;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        strM4699A = string;
        strReplace = c0303q.f970c.replace("{" + str + "}", strM4699A);
        if (!C0303Q.f967m.matcher(strReplace).matches()) {
        }
    }
}
