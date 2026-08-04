package yyds;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: yyds.ᲈᛵᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2653 extends AbstractC0280 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C0644 f13053;

    public C2653(C0644 c0644) {
        this.f13053 = c0644;
    }

    @Override // yyds.AbstractC0280, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C0092) {
            return super.contains((C0092) obj);
        }
        return false;
    }

    @Override // yyds.AbstractC0280, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0945(new C1125(new C0558(1, AbstractC2725.m4849(this)), new C2713(8, this)));
    }

    @Override // yyds.AbstractC0280
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo927() {
        return ((Matcher) this.f13053.f3099).groupCount() + 1;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0092 m4751(int i) {
        Matcher matcher = (Matcher) this.f13053.f3099;
        C2807 c2807M1485 = AbstractC0598.m1485(matcher.start(i), matcher.end(i));
        if (c2807M1485.f12492 >= 0) {
            return new C0092(matcher.group(i), c2807M1485);
        }
        return null;
    }
}
