package io.github.cherrywechat.lua.api;

import de.robv.android.xposed.XC_MethodHook;
import io.github.cherrywechat.lua.LuaLocks;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.C0829TC;
import p000.C1399f9;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class HookAPI$doHook$callback$1 extends XC_MethodHook {
    final /* synthetic */ int $afterRef;
    final /* synthetic */ int $beforeRef;
    final /* synthetic */ boolean $hasAfterCallback;
    final /* synthetic */ boolean $hasBeforeCallback;
    final /* synthetic */ boolean $hasReplaceCallback;
    final /* synthetic */ boolean $isReplace;
    final /* synthetic */ Lua $lua;
    final /* synthetic */ int $replaceRef;

    public HookAPI$doHook$callback$1(boolean r1, boolean r2, Lua r3, boolean r4, int r5, int r6, boolean r7, int r8) {
        this.$isReplace = r1;
        this.$hasReplaceCallback = r2;
        this.$lua = r3;
        this.$hasBeforeCallback = r4;
        this.$replaceRef = r5;
        this.$beforeRef = r6;
        this.$hasAfterCallback = r7;
        this.$afterRef = r8;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C0829TC m3432a(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
        return beforeHookedMethod$lambda$0(r0, r1, r2);
    }

    private static final C0829TC afterHookedMethod$lambda$2(Lua r5, int r6, XC_MethodHook.MethodHookParam r7) {
        r5.refGet(r6);     // Catch: Exception -> L5
        HookAPI.access$pushMethodParam(HookAPI.INSTANCE, r5, r7);     // Catch: Exception -> L5
        r5.pCall(1, 0);     // Catch: Exception -> L5
    L8:
        return C0829TC.f2620a;
    L5:
        e = move-exception;
        AbstractC0213Ey.m411i(-283480726435893L, -283527971076149L, e);
        r5.setTop(0);
        goto L8
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0829TC m3433b(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
        return beforeHookedMethod$lambda$1(r0, r1, r2);
    }

    private static final C0829TC beforeHookedMethod$lambda$0(Lua r4, int r5, XC_MethodHook.MethodHookParam r6) {
        r4.refGet(r5);     // Catch: Exception -> L4
        HookAPI.access$pushMethodParam(HookAPI.INSTANCE, r4, r6);     // Catch: Exception -> L4
        r4.pCall(1, 1);     // Catch: Exception -> L4
        Object r0 = r4.toObject(-1);     // Catch: Exception -> L4
        r4.pop(1);     // Catch: Exception -> L4
        r6.setResult(r0);     // Catch: Exception -> L4
    L7:
        return C0829TC.f2620a;
    L4:
        e = move-exception;
        AbstractC0213Ey.m411i(-282626027943989L, -282673272584245L, e);
        r4.setTop(0);
        goto L7
    }

    private static final C0829TC beforeHookedMethod$lambda$1(Lua r5, int r6, XC_MethodHook.MethodHookParam r7) {
        r5.refGet(r6);     // Catch: Exception -> L5
        HookAPI.access$pushMethodParam(HookAPI.INSTANCE, r5, r7);     // Catch: Exception -> L5
        r5.pCall(1, 0);     // Catch: Exception -> L5
    L8:
        return C0829TC.f2620a;
    L5:
        e = move-exception;
        AbstractC0213Ey.m411i(-282780646766645L, -282827891406901L, e);
        r5.setTop(0);
        goto L8
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C0829TC m3434c(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
        return afterHookedMethod$lambda$2(r0, r1, r2);
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam r6) {
        AbstractC0295Gu.m625r(-282600258140213L);
        if (this.$isReplace == false) goto L6;
        return;
    L6:
        if (this.$hasAfterCallback == false) goto L9;
        LuaLocks r0 = LuaLocks.INSTANCE;
        Lua r1 = this.$lua;
        r0.withLock(r1, new C1399f9(r1, this.$afterRef, r6, 6));
        return;
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam r6) {
        AbstractC0295Gu.m625r(-283124244150325L);
        if (this.$isReplace == false) goto L9;
        if (this.$hasReplaceCallback == false) goto L9;
        LuaLocks r0 = LuaLocks.INSTANCE;
        Lua r1 = this.$lua;
        r0.withLock(r1, new C1399f9(r1, this.$replaceRef, r6, 4));
        return;
    L9:
        if (this.$hasBeforeCallback == false) goto L12;
        LuaLocks r02 = LuaLocks.INSTANCE;
        Lua r12 = this.$lua;
        r02.withLock(r12, new C1399f9(r12, this.$beforeRef, r6, 5));
        return;
    }
}
