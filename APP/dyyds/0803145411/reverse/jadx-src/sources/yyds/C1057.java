package yyds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: yyds.ᛵᛳᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1057 extends AbstractC1311 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4826;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f4827;

    public /* synthetic */ C1057(int i, Object obj) {
        this.f4826 = i;
        this.f4827 = obj;
    }

    @Override // yyds.AbstractC0280, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f4826) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f4826;
        Object obj = this.f4827;
        switch (i2) {
            case 0:
                String strGroup = ((Matcher) ((C0644) obj).f3099).group(i);
                return strGroup == null ? "" : strGroup;
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (i >= 0 && i <= AbstractC2725.m4850(this)) {
                    return arrayList.get(AbstractC2725.m4850(this) - i);
                }
                throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C2807(0, AbstractC2725.m4850(this), 1) + "].");
        }
    }

    @Override // yyds.AbstractC1311, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f4826) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // yyds.AbstractC1311, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f4826) {
            case 1:
                return new C0995(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // yyds.AbstractC1311, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f4826) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // yyds.AbstractC1311, java.util.List
    public ListIterator listIterator() {
        switch (this.f4826) {
            case 1:
                return new C0995(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // yyds.AbstractC0280
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo927() {
        int i = this.f4826;
        Object obj = this.f4827;
        switch (i) {
            case 0:
                return ((Matcher) ((C0644) obj).f3099).groupCount() + 1;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override // yyds.AbstractC1311, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f4826) {
            case 1:
                return new C0995(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
