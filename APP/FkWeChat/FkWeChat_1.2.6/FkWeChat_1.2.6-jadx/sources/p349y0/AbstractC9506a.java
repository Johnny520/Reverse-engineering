package p349y0;

import java.util.NoSuchElementException;
import p117i.C3076o0;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9506a {
    /* JADX INFO: renamed from: a */
    public static final Object m37011a(C3076o0 c3076o0) {
        if (c3076o0.m11589g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int iM11587e = c3076o0.m11587e() - 1;
        Object objM11586d = c3076o0.m11586d(iM11587e);
        c3076o0.m11454B(iM11587e);
        return objM11586d;
    }
}
