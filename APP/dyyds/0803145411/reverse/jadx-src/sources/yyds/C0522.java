package yyds;

import android.content.Intent;
import com.p000ss.android.ugc.awemes.WardDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: yyds.ᛳᛱᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0522 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Intent f2509;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C1735 f2510;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ReentrantLock f2511;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WardDatabase_Impl f2512;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String[] f2513;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2307 f2514;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Object f2515;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0682 f2516;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2307 f2517;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final LinkedHashMap f2518;

    public C0522(WardDatabase_Impl wardDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f2512 = wardDatabase_Impl;
        this.f2513 = strArr;
        C0682 c0682 = new C0682(wardDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, wardDatabase_Impl.f500, new C2635(1, this, C0522.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 8));
        this.f2516 = c0682;
        this.f2518 = new LinkedHashMap();
        this.f2511 = new ReentrantLock();
        this.f2517 = new C2307(this, 27);
        this.f2514 = new C2307(this, 28);
        Collections.newSetFromMap(new IdentityHashMap());
        this.f2515 = new Object();
        c0682.f3250 = new C1223(14, this);
    }
}
