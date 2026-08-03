package p255r4;

import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import p218og.C3147k;
import p227p4.C3309n;
import p227p4.C3317v;
import p258r8.C3739d;
import p304uf.C4330d;
import p363y7.AbstractC5999a;
import p366ya.C6015e;
import p366ya.C6017g;

/* JADX INFO: renamed from: r4.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3683m implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11970g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [r4.k0.<clinit>():void, r8.e.a(r8.c):void, y7.a.<clinit>():void] */
    public /* synthetic */ C3683m(int i9) {
        this.f11970g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11970g) {
            case 0:
                return ((C3317v) obj).f10687a - ((C3317v) obj2).f10687a;
            case 1:
                return ((C3309n) obj).f10670i.f13965g - ((C3309n) obj2).f10670i.f13965g;
            case 2:
                return ((AbstractC3682l0) obj).mo7639b().compareTo(((AbstractC3682l0) obj2).mo7639b());
            case 3:
                return Integer.valueOf(((C3739d) ((Map.Entry) obj).getValue()).f12131b.f12129g).compareTo(Integer.valueOf(((C3739d) ((Map.Entry) obj2).getValue()).f12131b.f12129g));
            case 4:
                Method method = (Method) obj;
                Method method2 = (Method) obj2;
                return (method.getDeclaringClass() + method.getName() + Arrays.toString(method.getParameterTypes()) + method.getReturnType()).compareTo(method2.getDeclaringClass() + method2.getName() + Arrays.toString(method2.getParameterTypes()) + method2.getReturnType());
            case 5:
                return AbstractC5999a.m10740c((Comparable) obj, (Comparable) obj2);
            case 6:
                C3147k c3147k = C6017g.f24443e;
                int iM8754d = C4330d.m8754d((ViewGroup) obj);
                Integer numValueOf = Integer.valueOf(iM8754d);
                if (!(iM8754d > 0)) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    numValueOf = num;
                }
                int iM8754d2 = C4330d.m8754d((ViewGroup) obj2);
                Integer numValueOf2 = iM8754d2 > 0 ? Integer.valueOf(iM8754d2) : null;
                return numValueOf.compareTo(numValueOf2 != null ? numValueOf2 : Integer.MAX_VALUE);
            default:
                return Float.valueOf(((C6015e) obj).f24437b).compareTo(Float.valueOf(((C6015e) obj2).f24437b));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        switch (this.f11970g) {
            case 0:
                return obj == this;
            case 1:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }
}
