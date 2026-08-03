package th;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1231l;
import p101h1.InterfaceC1567d;
import p218og.C3147k;
import p242q8.C3446a;
import p276sf.C3967n;
import p304uf.C4330d;
import p308v1.InterfaceC4428t;
import p366ya.C6017g;

/* JADX INFO: renamed from: th.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4212d implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13814g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13815h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13816i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4212d(int i9, Collection collection) {
        this.f13814g = 1;
        this.f13815h = i9;
        this.f13816i = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006c, code lost:
    
        continue;
     */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i9 = this.f13814g;
        C3967n c3967n = C3967n.f12976a;
        int i10 = this.f13815h;
        Object obj2 = this.f13816i;
        switch (i9) {
            case 0:
                C4217i c4217i = (C4217i) obj2;
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                interfaceC1567d.getClass();
                c4217i.f13874u.mo8471a(interfaceC1567d, c4217i.f13865C, (InterfaceC4428t) c4217i.f13872J.getValue(), c4217i.f13877x, this.f13815h);
                return c3967n;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(i10, (Collection) obj2));
            case 2:
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                imageView.setContentDescription((String) obj2);
                imageView.setImageDrawable(new C3446a(i10, 2));
                return c3967n;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    int[] iArr = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    int i11 = iArr[1];
                    C3147k c3147k = C6017g.f24443e;
                    int iM8754d = C4330d.m8754d(viewGroup) + i11;
                    int iM8754d2 = C4330d.m8754d(viewGroup);
                    float f3 = i10;
                    if (i11 >= 0.62f * f3 && iM8754d >= 0.88f * f3 && iM8754d2 <= f3 * 0.28f) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i12 = 0;
                        C6017g.m10776b(viewGroup, 0, linkedHashSet);
                        Set<String> set = C6017g.f24444f;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                if (!linkedHashSet.isEmpty()) {
                                    Iterator it = linkedHashSet.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                        if (AbstractC1416l.m3825a((String) it.next(), str)) {
                                            i12++;
                                            if (i12 < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        if (i12 >= 2) {
                            arrayList.add(viewGroup);
                        }
                    }
                }
                return c3967n;
        }
    }

    public /* synthetic */ C4212d(int i9, int i10, Object obj) {
        this.f13814g = i10;
        this.f13816i = obj;
        this.f13815h = i9;
    }

    public /* synthetic */ C4212d(C6017g c6017g, int i9, ArrayList arrayList) {
        this.f13814g = 3;
        this.f13815h = i9;
        this.f13816i = arrayList;
    }
}
