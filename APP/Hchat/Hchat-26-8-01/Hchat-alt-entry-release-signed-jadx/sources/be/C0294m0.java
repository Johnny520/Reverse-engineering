package be;

import ae.C0076g;
import java.lang.reflect.Constructor;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import p246qd.AbstractC3506j;
import p289te.C4148b;
import p302ud.C4305a;
import p302ud.InterfaceC4312h;

/* JADX INFO: renamed from: be.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0294m0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f855b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0294m0(int i9, ArrayList arrayList) {
        this.f854a = i9;
        this.f855b = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f854a) {
            case 0:
                this.f855b.add((AbstractC3506j) obj);
                break;
            case 1:
                this.f855b.add((Path) obj);
                break;
            case 2:
                this.f855b.add((Constructor) obj);
                break;
            case 3:
                this.f855b.add((C4305a) obj);
                break;
            case 4:
                this.f855b.forEach(new C0076g((Map) obj, 13));
                break;
            case 5:
                this.f855b.add((C4148b) obj);
                break;
            case 6:
                this.f855b.addAll(((C4305a) obj).f14351l);
                break;
            default:
                this.f855b.addAll(((InterfaceC4312h) obj).mo8643g());
                break;
        }
    }
}
