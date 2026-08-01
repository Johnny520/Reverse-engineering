package defpackage;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class nt implements Comparator {
    public final /* synthetic */ MaterialButtonToggleGroup a;

    public nt(MaterialButtonToggleGroup r1) {
        this.a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        MaterialButton r32 = (MaterialButton) r3;
        MaterialButton r42 = (MaterialButton) r4;
        int r0 = Boolean.valueOf(r32.o).compareTo(Boolean.valueOf(r42.o));
        if (r0 == 0) goto L5;
        return r0;
    L5:
        int r02 = Boolean.valueOf(r32.isPressed()).compareTo(Boolean.valueOf(r42.isPressed()));
        if (r02 == 0) goto L8;
        return r02;
    L8:
        MaterialButtonToggleGroup r03 = this.a;
        return Integer.valueOf(r03.indexOfChild(r32)).compareTo(Integer.valueOf(r03.indexOfChild(r42)));
    }
}
