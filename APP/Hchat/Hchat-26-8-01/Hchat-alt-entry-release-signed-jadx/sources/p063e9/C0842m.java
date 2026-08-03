package p063e9;

import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: e9.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0842m implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C0842m f2564h = new C0842m(0);

    /* JADX INFO: renamed from: i */
    public static final C0842m f2565i = new C0842m(1);

    /* JADX INFO: renamed from: j */
    public static final C0842m f2566j = new C0842m(2);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2567g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [e9.m.<clinit>():void] */
    public /* synthetic */ C0842m(int i9) {
        this.f2567g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2567g) {
            case 0:
                return Boolean.valueOf(obj instanceof String);
            case 1:
                return Boolean.valueOf(obj instanceof String);
            default:
                return Boolean.valueOf(obj instanceof Long);
        }
    }
}
