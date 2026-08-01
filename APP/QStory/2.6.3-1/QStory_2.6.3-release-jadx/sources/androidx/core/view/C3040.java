package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import io.ktor.util.C5053;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC5176;
import kotlin.sequences.C5953;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3040 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Iterator f6831;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6832;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6833;

    public C3040(C5053 c5053) {
        this.f6833 = 1;
        this.f6832 = c5053;
        this.f6831 = c5053.f13061.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6833) {
        }
        return this.f6831.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6833;
        Object obj = this.f6832;
        switch (i) {
            case 0:
                Object next = this.f6831.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C3101 c3101 = viewGroup != null ? new C3101(viewGroup, 0) : null;
                if (c3101 == null || !c3101.hasNext()) {
                    while (!this.f6831.hasNext() && !arrayList.isEmpty()) {
                        this.f6831 = (Iterator) AbstractC5176.m9367(arrayList);
                        AbstractC5176.m9351(arrayList);
                    }
                } else {
                    arrayList.add(this.f6831);
                    this.f6831 = c3101;
                }
                return next;
            case 1:
                return ((C5053) obj).f13059.invoke(this.f6831.next());
            default:
                return ((C5953) obj).f15001.invoke(this.f6831.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6833) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                this.f6831.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3040(C3101 c3101) {
        this.f6833 = 0;
        this.f6832 = new ArrayList();
        this.f6831 = c3101;
    }

    public C3040(C5953 c5953) {
        this.f6833 = 2;
        this.f6832 = c5953;
        this.f6831 = c5953.f15002.iterator();
    }
}
