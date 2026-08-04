package yyds;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛴᲁᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f4405;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4406;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Iterator f4407;

    public C0945(C1125 c1125) {
        this.f4406 = 0;
        this.f4405 = c1125;
        this.f4407 = c1125.f5181.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4406) {
        }
        return this.f4407.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4406;
        Object obj = this.f4405;
        switch (i) {
            case 0:
                return ((C1125) obj).f5182.mo371(this.f4407.next());
            default:
                Object next = this.f4407.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C0437 c0437 = viewGroup != null ? new C0437(2, viewGroup) : null;
                if (c0437 == null || !c0437.hasNext()) {
                    while (!this.f4407.hasNext() && !arrayList.isEmpty()) {
                        this.f4407 = (Iterator) AbstractC1595.m3263(arrayList);
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.remove(AbstractC2725.m4850(arrayList));
                    }
                } else {
                    arrayList.add(this.f4407);
                    this.f4407 = c0437;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4406) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0945(C0437 c0437) {
        this.f4406 = 1;
        this.f4405 = new ArrayList();
        this.f4407 = c0437;
    }
}
