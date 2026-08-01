package p040U0;

import p011F0.AbstractC0118f;

/* JADX INFO: renamed from: U0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0293c extends AbstractC0118f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0294d f669a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0293c(C0294d c0294d) {
        this.f669a = c0294d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p011F0.AbstractC0118f
    /* JADX INFO: renamed from: a */
    public final int mo250a() {
        return this.f669a.f670a.groupCount() + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p011F0.AbstractC0118f, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i2) {
        String strGroup = this.f669a.f670a.group(i2);
        return strGroup == null ? "" : strGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p011F0.AbstractC0118f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p011F0.AbstractC0118f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
