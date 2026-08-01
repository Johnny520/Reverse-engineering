package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ce implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ce(int r1) {
        this.a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r7, Object r8) {
        switch(this.a) {
            case 0: goto L36;
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L9;
            default: goto L4;
        };
    L4:
        Integer r72 = Integer.valueOf(((mb0) r7).b);
        Integer r82 = Integer.valueOf(((mb0) r8).b);
        if (r72 != r82) goto L8;
        return 0;
    L8:
        return r72.compareTo(r82);
    L9:
        int r73 = ((View) r7).getTop();
        int r83 = ((View) r8).getTop();
    L11:
        return r73 - r83;
    L12:
        r73 = ((a40) r7).b;
        r83 = ((a40) r8).b;
        goto L11
    L13:
        cn r74 = (cn) r7;
        cn r84 = (cn) r8;
        RecyclerView r0 = r74.d;
        if (r0 != null) goto L16;
        boolean r4 = true;
    L18:
        if (r84.d != null) goto L20;
        boolean r5 = true;
    L21:
        if (r4 == r5) goto L24;
        if (r0 != null) goto L46;
        return 1;
    L46:
        return -1;
    L24:
        boolean r02 = r74.a;
        if (r02 == r84.a) goto L28;
        if (r02 == true) goto L46;
        return 1;
    L28:
        int r1 = r84.b - r74.b;
        if (r1 != 0) goto L48;
        int r12 = r74.c - r84.c;
        if (r12 == 0) goto L35;
        return r12;
    L35:
        return 0;
    L48:
        return r1;
    L20:
        r5 = false;
        goto L21
    L16:
        r4 = false;
        goto L18
    L36:
        WeakHashMap r03 = ja0.a;
        float r75 = y90.m((View) r7);
        float r85 = y90.m((View) r8);
        if (r75 <= r85) goto L40;
        return -1;
    L40:
        if (r75 >= r85) goto L43;
        return 1;
    L43:
        return 0;
    }
}
