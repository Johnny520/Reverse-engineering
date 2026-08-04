package yyds;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲁᛲᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2183 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static int f10733;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f10734;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public ArrayList f10735;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f10736;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f10737;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ArrayList f10738;

    public final String toString() {
        int i = this.f10737;
        String str = (i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown") + " [" + this.f10736 + "] <";
        Iterator it = this.f10735.iterator();
        while (it.hasNext()) {
            str = str + " " + ((C0944) it.next()).f4387;
        }
        return str.concat(" >");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4172(ArrayList arrayList) {
        int size = this.f10735.size();
        if (this.f10734 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2183 c2183 = (C2183) arrayList.get(i);
                if (this.f10734 == c2183.f10736) {
                    m4174(this.f10737, c2183);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m4173(C2296 c2296, int i) {
        int iM4298;
        int iM42982;
        ArrayList arrayList = this.f10735;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0859 c0859 = ((C0944) arrayList.get(0)).f4342;
        c2296.m4304();
        c0859.mo1167(c2296, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0944) arrayList.get(i2)).mo1167(c2296, false);
        }
        if (i == 0 && c0859.f3943 > 0) {
            C2810.m4943(c0859, c2296, arrayList, 0);
        }
        if (i == 1 && c0859.f3950 > 0) {
            C2810.m4943(c0859, c2296, arrayList, 1);
        }
        try {
            c2296.m4315();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f10738 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0944 c0944 = (C0944) arrayList.get(i3);
            C0805 c0805 = new C0805(28);
            new WeakReference(c0944);
            C2296.m4298(c0944.f4382);
            C2296.m4298(c0944.f4403);
            C2296.m4298(c0944.f4344);
            C2296.m4298(c0944.f4341);
            C2296.m4298(c0944.f4385);
            this.f10738.add(c0805);
        }
        if (i == 0) {
            iM4298 = C2296.m4298(c0859.f4382);
            iM42982 = C2296.m4298(c0859.f4344);
            c2296.m4304();
        } else {
            iM4298 = C2296.m4298(c0859.f4403);
            iM42982 = C2296.m4298(c0859.f4341);
            c2296.m4304();
        }
        return iM42982 - iM4298;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m4174(int i, C2183 c2183) {
        int i2 = c2183.f10736;
        for (C0944 c0944 : this.f10735) {
            ArrayList arrayList = c2183.f10735;
            if (!arrayList.contains(c0944)) {
                arrayList.add(c0944);
            }
            if (i == 0) {
                c0944.f4397 = i2;
            } else {
                c0944.f4372 = i2;
            }
        }
        this.f10734 = i2;
    }
}
