package p195n7;

import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: n7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2903b extends AbstractC2902a {

    /* JADX INFO: renamed from: b */
    public static final C2903b f9371b = new C2903b(0);

    /* JADX INFO: renamed from: c */
    public static final C2903b f9372c = new C2903b(1);

    /* JADX INFO: renamed from: d */
    public static final C2903b f9373d = new C2903b(2);

    /* JADX INFO: renamed from: e */
    public static final C2903b f9374e = new C2903b(3);

    /* JADX INFO: renamed from: f */
    public static final C2903b f9375f = new C2903b(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9376a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [n7.b.<clinit>():void] */
    public /* synthetic */ C2903b(int i9) {
        this.f9376a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p195n7.AbstractC2902a
    /* JADX INFO: renamed from: a */
    public final String mo6306a(int i9) {
        switch (this.f9376a) {
            case 0:
                return i9 == 0 ? "false" : "true";
            case 1:
                return Float.toString(Float.intBitsToFloat(i9));
            case 2:
                return AbstractC5999a.m10748k(i9, 8);
            case 3:
                return Integer.toString(i9);
            default:
                return i9 == 0 ? "@null" : "@empty";
        }
    }
}
