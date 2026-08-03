package io.github.cherrywechat.lua;

import android.app.Activity;
import android.content.Context;
import io.github.cherrywechat.lua.api.CherryAPIRegistry;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.bridge.JavaImporter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0621Oc;
import p000.C0247Fp;
import p000.C0297Gw;
import p000.C0340Hw;
import p000.C0525M8;
import p000.C0829TC;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class LuaContext implements Closeable {
    private Activity activity;
    private boolean closed;

    /* JADX INFO: renamed from: id */
    private final String f5550id;
    private final Lua lua;
    private final List<Object> refs;

    public LuaContext(String r3, Lua r4, List<? extends ClassLoader> r5, Activity r6) {
        AbstractC0295Gu.m625r(-352354821994549L);
        AbstractC0295Gu.m625r(-352367706896437L);
        AbstractC0295Gu.m625r(-352384886765621L);
        this.f5550id = r3;
        this.lua = r4;
        this.activity = r6;
        this.refs = new ArrayList();
        r4.openLibraries();
        JavaImporter.INSTANCE.register(r4, r5);
        Activity r32 = this.activity;
        if (r32 == null) goto L5;
        CherryGlobalAPI.INSTANCE.setCurrentActivity(r32);
    L5:
        CherryGlobalAPI r33 = CherryGlobalAPI.INSTANCE;
        Activity r62 = this.activity;
        if (r62 == null) goto L8;
        Context r63 = r62.getApplicationContext();
    L9:
        r33.setCurrentContext(r63);
        CherryAPIRegistry.INSTANCE.registerAll(r4, r5);
        Activity r34 = this.activity;
        if (r34 == null) goto L13;
        r4.push(r34, Lua.Conversion.SEMI);
        r4.setGlobal(AbstractC0295Gu.m625r(-351890965526581L));
        return;
    L13:
        return;
    L8:
        r63 = null;
        goto L9
    }

    private static final C0340Hw callFunction_gIAlu_s$lambda$6(LuaContext r7, String r8, Object[] r9) {
        r7.lua.getGlobal(r8);     // Catch: Exception -> L7
        if (r7.lua.isFunction(-1) == true) goto L9;
        r7.lua.pop(1);     // Catch: Exception -> L7
        return new C0340Hw(new C0297Gw(new LuaException("'" + r8 + AbstractC0295Gu.m625r(-352470786111541L))));
    L9:
        int r82 = r9.length;     // Catch: Exception -> L7
        int r0 = 0;
    L10:
        if (r0 >= r82) goto L16;
        Object r3 = r9[r0];     // Catch: Exception -> L7
        if (r3 == null) goto L14;
        r7.lua.push(r3, Lua.Conversion.SEMI);     // Catch: Exception -> L7
    L15:
        r0 = r0 + 1;     // Catch: Exception -> L7
        goto L10
    L14:
        r7.lua.pushNil();     // Catch: Exception -> L7
        goto L15
    L16:
        r7.lua.pCall(r9.length, 1);     // Catch: Exception -> L7
        Object r83 = r7.lua.toObject(-1);     // Catch: Exception -> L7
        r7.lua.pop(1);     // Catch: Exception -> L7
    L28:
        return new C0340Hw(r83);
    L7:
        e = move-exception;
        String r92 = r7.lua.toString(-1);     // Catch: Exception -> L20
    L21:
        r7.lua.setTop(0);
        if (r92 != null) goto L26;
        r92 = e.getMessage();
        if (r92 != null) goto L26;
        r92 = AbstractC0295Gu.m625r(-352556685457461L);
    L26:
        r83 = new C0297Gw(new LuaException(r92));
    L20:
        r92 = null;
        goto L21
    }

    private final void checkClosed() {
        if (this.closed == true) goto L6;
        return;
    L6:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-352814383495221L) + this.f5550id + AbstractC0295Gu.m625r(-352870218070069L));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0829TC m2976d(Object r0, LuaContext r1, String r2) {
        return setGlobal$lambda$3(r0, r1, r2);
    }

    private static final C0340Hw executeFile_IoAF18A$lambda$2(LuaContext r4, String r5) {
        String r0 = null;
        r4.lua.load(r5);     // Catch: Exception -> L6
        r4.lua.pCall(0, -1);     // Catch: Exception -> L6
        if (r4.lua.getTop() <= 0) goto L8;
        Object r52 = r4.lua.toObject(-1);     // Catch: Exception -> L6
    L9:
        r4.lua.setTop(0);     // Catch: Exception -> L6
    L19:
        return new C0340Hw(r52);
    L8:
        r52 = null;
    L6:
        e = move-exception;
        r0 = r4.lua.toString(-1);     // Catch: Exception -> L20
    L12:
        r4.lua.setTop(0);
        if (r0 != null) goto L17;
        r0 = e.getMessage();
        if (r0 != null) goto L17;
        r0 = AbstractC0295Gu.m625r(-352921757677621L);
    L17:
        r52 = new C0297Gw(new LuaException(r0));
        goto L19
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m2977f(LuaContext r0, String r1) {
        return getGlobal$lambda$4(r0, r1);
    }

    private static final Object getGlobal$lambda$4(LuaContext r1, String r2) {
        r1.lua.getGlobal(r2);
        Object r22 = r1.lua.toObject(-1);
        r1.lua.pop(1);
        return r22;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C0340Hw m2978i(LuaContext r0, String r1, Object[] r2) {
        return callFunction_gIAlu_s$lambda$6(r0, r1, r2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C0340Hw m2979l(LuaContext r0, String r1) {
        return executeFile_IoAF18A$lambda$2(r0, r1);
    }

    private static final C0829TC setGlobal$lambda$3(Object r2, LuaContext r3, String r4) {
        if (r2 == null) goto L4;
        r3.lua.push(r2, Lua.Conversion.SEMI);
    L5:
        r3.lua.setGlobal(r4);
        return C0829TC.f2620a;
    L4:
        r3.lua.pushNil();
        goto L5
    }

    /* JADX INFO: renamed from: callFunction-gIAlu-s, reason: not valid java name */
    public final Object m5462callFunctiongIAlus(String r4, Object... r5) {
        AbstractC0295Gu.m625r(-352015519578165L);
        AbstractC0295Gu.m625r(-352036994414645L);
        checkClosed();
        return ((C0340Hw) LuaLocks.INSTANCE.withLock(this.lua, new C0525M8(this, r4, r5))).f1148a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed == false) goto L5;
        return;
    L5:
        this.closed = true;
        CherryAPIRegistry.INSTANCE.cleanupFor(this.lua);     // Catch: Exception -> L8
    L10:
        this.refs.clear();
        this.activity = null;
        this.lua.close();
        return;
    L8:
        e = move-exception;
        AbstractC0295Gu.m625r(-352075649120309L);
        AbstractC0213Ey.m411i(-352672649574453L, -352797203626037L, e);
        goto L10
    }

    /* JADX INFO: renamed from: execute-IoAF18A, reason: not valid java name */
    public final Object m5463executeIoAF18A(String r3) {
        AbstractC0295Gu.m625r(-351929620232245L);
        checkClosed();
        return LuaEngine.INSTANCE.m5466executeInternalgIAlus$app_release(this.lua, r3);
    }

    /* JADX INFO: renamed from: executeFile-IoAF18A, reason: not valid java name */
    public final Object m5464executeFileIoAF18A(String r5) {
        AbstractC0295Gu.m625r(-351951095068725L);
        checkClosed();
        return ((C0340Hw) LuaLocks.INSTANCE.withLock(this.lua, new C0247Fp(this, r5, 0))).f1148a;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final Object getGlobal(String r5) {
        AbstractC0295Gu.m625r(-351994044741685L);
        checkClosed();
        return LuaLocks.INSTANCE.withLock(this.lua, new C0247Fp(this, r5, 1));
    }

    public final String getId() {
        return this.f5550id;
    }

    public final void hold(Object r3) {
        AbstractC0295Gu.m625r(-352058469251125L);
        this.refs.add(r3);
    }

    public final void setActivity(Activity r1) {
        this.activity = r1;
    }

    public final void setGlobal(String r5, Object r6) {
        AbstractC0295Gu.m625r(-351972569905205L);
        checkClosed();
        LuaLocks.INSTANCE.withLock(this.lua, new C0525M8(r6, this, r5, 1));
    }

    public /* synthetic */ LuaContext(String r1, Lua r2, List r3, Activity r4, int r5, AbstractC0621Oc r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        this(r1, r2, r3, r4);
    }
}
