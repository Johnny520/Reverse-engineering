package com.abc.core.features;

import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;

/* JADX INFO: renamed from: c0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0650e extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MomentsCommentProtectHook f2019b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2020c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f2021d;

    public C0650e(MomentsCommentProtectHook r1, String r2, boolean r3) {
        this.f2019b = r1;
        this.f2020c = r2;
        this.f2021d = r3;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b r5) {
        MomentsCommentProtectHook r02 = this.f2019b;
        r02.getClass();
        if (MomentsCommentProtectHook.m1649j() == true) goto L15;
        return;
    L15:
        MomentsCommentProtectHook.m1641a(r02, r5, this.f2021d);     // Catch: Throwable -> L8
        Object r03 = C0146l.f339a;     // Catch: Throwable -> L8
    L10:
        Throwable r04 = AbstractC0141g.m465a(r03);
        String r1 = this.f2020c;
        if (r04 == null) goto L13;
        MomentsCommentProtectHook.m1657r("markAndBlockDelete fail " + r1 + ": " + r04.getMessage());
    L13:
        r5.m1946c(Boolean.TRUE);
        MomentsCommentProtectHook.m1657r("BLOCKED " + r1 + " + marked");
        ModuleLog.INSTANCE.m1813i("拦截朋友圈评论删除并标记[已删除](" + r1 + ")");
        return;
    L8:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L10
    }
}
