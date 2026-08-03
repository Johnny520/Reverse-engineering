package androidx.media;

import android.util.SparseIntArray;
import p000.InterfaceC0787SD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC0787SD {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3973b = 0;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f3974a;

    static {
        SparseIntArray r0 = new SparseIntArray();
        r0.put(5, 1);
        r0.put(6, 2);
        r0.put(7, 2);
        r0.put(8, 1);
        r0.put(9, 1);
        r0.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof AudioAttributesCompat) == true) goto L5;
        return false;
    L5:
        AudioAttributesCompat r32 = (AudioAttributesCompat) r3;
        AudioAttributesImpl r0 = this.f3974a;
        if (r0 != null) goto L13;
        if (r32.f3974a != null) goto L11;
        return true;
    L11:
        return false;
    L13:
        return r0.equals(r32.f3974a);
    }

    public final int hashCode() {
        return this.f3974a.hashCode();
    }

    public final String toString() {
        return this.f3974a.toString();
    }
}
