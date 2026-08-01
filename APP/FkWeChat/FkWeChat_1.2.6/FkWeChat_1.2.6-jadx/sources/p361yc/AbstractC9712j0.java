package p361yc;

import java.lang.annotation.Annotation;
import p185m8.AbstractC5106t;
import p300uc.InterfaceC8647b;

/* JADX INFO: renamed from: yc.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9712j0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC8647b m37931a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        str.getClass();
        enumArr.getClass();
        strArr.getClass();
        annotationArr.getClass();
        C9697g0 c9697g0 = new C9697g0(str, enumArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                c9697g0.m37943v(annotation);
            }
        }
        int length = enumArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum r42 = enumArr[i10];
            int i12 = i11 + 1;
            String strName = (String) AbstractC5106t.m20736h0(strArr, i11);
            if (strName == null) {
                strName = r42.name();
            }
            C9714j2.m37936p(c9697g0, strName, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) AbstractC5106t.m20736h0(annotationArr, i11);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    c9697g0.m37942u(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new C9707i0(str, enumArr, c9697g0);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC8647b m37932b(String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        return new C9707i0(str, enumArr);
    }
}
