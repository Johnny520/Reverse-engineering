package yyds;

import android.os.Handler;
import android.widget.TextView;
import com.android.app.CustomRecyclerView;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᲁᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0958 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ List f4425;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f4426;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ TextView f4427;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f4428;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Handler f4429;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashSet f4430;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2454 f4431;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ TextView f4432;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ CustomRecyclerView f4433;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1271 f4434;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f4435;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f4436;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f4437;

    public /* synthetic */ RunnableC0958(Handler handler, TextView textView, TextView textView2, CustomRecyclerView customRecyclerView, LinkedHashSet linkedHashSet, List list, C2454 c2454, C1271 c1271, C1417 c1417, C1417 c14172, C0172 c0172, C0172 c01722, C0172 c01723) {
        this.f4435 = c1417;
        this.f4437 = c0172;
        this.f4429 = handler;
        this.f4436 = c01722;
        this.f4431 = c2454;
        this.f4426 = c01723;
        this.f4428 = c14172;
        this.f4434 = c1271;
        this.f4432 = textView;
        this.f4433 = customRecyclerView;
        this.f4427 = textView2;
        this.f4425 = list;
        this.f4430 = linkedHashSet;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
