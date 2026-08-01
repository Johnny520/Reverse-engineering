package p292u3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: u3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8502e {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m32739a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
