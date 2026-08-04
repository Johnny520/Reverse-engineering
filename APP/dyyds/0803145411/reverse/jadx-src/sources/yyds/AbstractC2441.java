package yyds;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲇᛴᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2441 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C0903 f12002;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public String f12003;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C1844 f12005;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final LinkedHashSet f12007 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final LinkedHashSet f12001 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final LinkedHashSet f12006 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final LinkedHashSet f12004 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public abstract List mo736();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public Map mo1846() {
        return AbstractC2366.m4385(new Pair("name", this.f12003), new Pair("nameCondition", this.f12005), new Pair("modifiers", this.f12007), new Pair("modifiersNot", this.f12001), new Pair("modifiersCondition", null), new Pair("isSynthetic", null), new Pair("isSyntheticNot", null), new Pair("annotations", this.f12006), new Pair("annotationsNot", this.f12004), new Pair("genericString", null));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m4478() {
        C0903 c0903 = this.f12002;
        if (c0903 != null) {
            c0903.f4117 = true;
        }
    }
}
