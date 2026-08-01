package p313v9;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1061t;
import p213oa.C5692c;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: v9.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8873k {
    /* JADX INFO: renamed from: a */
    public static final C8867g m34045a(Annotation[] annotationArr, C5692c c5692c) {
        Annotation annotation;
        annotationArr.getClass();
        c5692c.getClass();
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (AbstractC1061t.m3842c(AbstractC8865f.m34029e(AbstractC9886a.m38367b(AbstractC9886a.m38366a(annotation))).m22982a(), c5692c)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new C8867g(annotation);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final List m34046b(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C8867g(annotation));
        }
        return arrayList;
    }
}
