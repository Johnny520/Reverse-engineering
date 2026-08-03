package p115hh;

import java.util.ArrayList;
import p136j8.C2104o;

/* JADX INFO: renamed from: hh.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1720e extends ArrayList {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m4344a() {
        if (isEmpty()) {
            return null;
        }
        return first();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object first() {
        if (!isEmpty()) {
            return get(0);
        }
        C2104o.m5276A("list is empty");
        return null;
    }
}
