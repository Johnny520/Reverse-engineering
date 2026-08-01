package p237q3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: q3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6239e {

    /* JADX INFO: renamed from: q3.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m24610a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m24607a(TypedArray typedArray, int i10) {
        return a.m24610a(typedArray, i10);
    }

    /* JADX INFO: renamed from: b */
    public static List m24608b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (m24607a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(m24609c(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m24609c(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public static List m24609c(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
