package p332wb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: wb.cp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4792cp {

    /* JADX INFO: renamed from: a */
    public final String f16420a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f16421b;

    /* JADX INFO: renamed from: c */
    public final int f16422c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1231l f16423d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4792cp(String str, ArrayList arrayList, int i9, InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        this.f16420a = str;
        this.f16421b = arrayList;
        this.f16422c = i9;
        this.f16423d = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4792cp)) {
            return false;
        }
        C4792cp c4792cp = (C4792cp) obj;
        return this.f16420a.equals(c4792cp.f16420a) && this.f16421b.equals(c4792cp.f16421b) && this.f16422c == c4792cp.f16422c && AbstractC1416l.m3825a(this.f16423d, c4792cp.f16423d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16423d.hashCode() + AbstractC0921a.m2242e(this.f16422c, (this.f16421b.hashCode() + (this.f16420a.hashCode() * 31)) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OptionPickerRequest(title=" + this.f16420a + ", options=" + this.f16421b + ", currentValue=" + this.f16422c + ", onSelected=" + this.f16423d + ")";
    }
}
