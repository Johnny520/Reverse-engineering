package io.github.cherrywechat.lua.loader;

import io.github.cherrywechat.lua.LuaContext;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;

/* JADX INFO: loaded from: classes.dex */
public final class LoadedScript {
    private final String author;
    private final boolean autoRelease;
    private final String description;
    private final String filePath;

    /* JADX INFO: renamed from: id */
    private final String f5562id;
    private String lastError;
    private String lastResult;
    private final long loadTime;
    private final LuaContext luaContext;
    private final String name;
    private final String scriptDir;
    private ScriptState state;
    private final String version;

    public LoadedScript(String r3, String r4, String r5, String r6, String r7, String r8, String r9, LuaContext r10, boolean r11, ScriptState r12, String r13, String r14, long r15) {
        AbstractC0295Gu.m625r(-328487688730677L);
        AbstractC0295Gu.m625r(-328500573632565L);
        AbstractC0295Gu.m625r(-328522048469045L);
        AbstractC0295Gu.m625r(-328552113240117L);
        AbstractC0295Gu.m625r(-328586472978485L);
        AbstractC0295Gu.m625r(-328638012586037L);
        AbstractC0295Gu.m625r(-328676667291701L);
        AbstractC0295Gu.m625r(-328719616964661L);
        AbstractC0295Gu.m625r(-328217105791029L);
        this.f5562id = r3;
        this.name = r4;
        this.author = r5;
        this.version = r6;
        this.description = r7;
        this.filePath = r8;
        this.scriptDir = r9;
        this.luaContext = r10;
        this.autoRelease = r11;
        this.state = r12;
        this.lastResult = r13;
        this.lastError = r14;
        this.loadTime = r15;
    }

    public static /* synthetic */ LoadedScript copy$default(LoadedScript r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, LuaContext r24, boolean r25, ScriptState r26, String r27, String r28, long r29, int r31, Object r32) {
        if ((r31 & 1) == 0) goto L5;
        String r2 = r16.f5562id;
    L7:
        if ((r31 & 2) == 0) goto L9;
        String r3 = r16.name;
    L11:
        if ((r31 & 4) == 0) goto L13;
        String r4 = r16.author;
    L15:
        if ((r31 & 8) == 0) goto L17;
        String r5 = r16.version;
    L19:
        if ((r31 & 16) == 0) goto L21;
        String r6 = r16.description;
    L23:
        if ((r31 & 32) == 0) goto L25;
        String r7 = r16.filePath;
    L27:
        if ((r31 & 64) == 0) goto L29;
        String r8 = r16.scriptDir;
    L31:
        if ((r31 & 128) == 0) goto L33;
        LuaContext r9 = r16.luaContext;
    L35:
        if ((r31 & 256) == 0) goto L37;
        boolean r10 = r16.autoRelease;
    L39:
        if ((r31 & 512) == 0) goto L41;
        ScriptState r11 = r16.state;
    L43:
        if ((r31 & 1024) == 0) goto L45;
        String r12 = r16.lastResult;
    L47:
        if ((r31 & 2048) == 0) goto L49;
        String r13 = r16.lastError;
    L51:
        if ((r31 & 4096) == 0) goto L54;
        long r30 = r16.loadTime;
    L56:
        return r16.copy(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r30);
    L54:
        r30 = r29;
        goto L56
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final String component1() {
        return this.f5562id;
    }

    public final ScriptState component10() {
        return this.state;
    }

    public final String component11() {
        return this.lastResult;
    }

    public final String component12() {
        return this.lastError;
    }

    public final long component13() {
        return this.loadTime;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.version;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.filePath;
    }

    public final String component7() {
        return this.scriptDir;
    }

    public final LuaContext component8() {
        return this.luaContext;
    }

    public final boolean component9() {
        return this.autoRelease;
    }

    public final LoadedScript copy(String r18, String r19, String r20, String r21, String r22, String r23, String r24, LuaContext r25, boolean r26, ScriptState r27, String r28, String r29, long r30) {
        AbstractC0295Gu.m625r(-328277235333173L);
        AbstractC0295Gu.m625r(-328290120235061L);
        AbstractC0295Gu.m625r(-328311595071541L);
        AbstractC0295Gu.m625r(-328341659842613L);
        AbstractC0295Gu.m625r(-328376019580981L);
        AbstractC0295Gu.m625r(-328427559188533L);
        AbstractC0295Gu.m625r(-328466213894197L);
        AbstractC0295Gu.m625r(-326859896125493L);
        AbstractC0295Gu.m625r(-326907140765749L);
        return new LoadedScript(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof LoadedScript) == true) goto L8;
        return false;
    L8:
        LoadedScript r82 = (LoadedScript) r8;
        if (AbstractC0585Nj.m1134a(this.f5562id, r82.f5562id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r82.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.author, r82.author) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.version, r82.version) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.description, r82.description) == true) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.filePath, r82.filePath) == true) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.scriptDir, r82.scriptDir) == true) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.luaContext, r82.luaContext) == true) goto L33;
        return false;
    L33:
        if (this.autoRelease == r82.autoRelease) goto L36;
        return false;
    L36:
        if (this.state == r82.state) goto L39;
        return false;
    L39:
        if (AbstractC0585Nj.m1134a(this.lastResult, r82.lastResult) == true) goto L42;
        return false;
    L42:
        if (AbstractC0585Nj.m1134a(this.lastError, r82.lastError) == true) goto L45;
        return false;
    L45:
        if (this.loadTime == r82.loadTime) goto L47;
        return false;
    L47:
        return true;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final boolean getAutoRelease() {
        return this.autoRelease;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getId() {
        return this.f5562id;
    }

    public final String getLastError() {
        return this.lastError;
    }

    public final String getLastResult() {
        return this.lastResult;
    }

    public final long getLoadTime() {
        return this.loadTime;
    }

    public final LuaContext getLuaContext() {
        return this.luaContext;
    }

    public final String getName() {
        return this.name;
    }

    public final String getScriptDir() {
        return this.scriptDir;
    }

    public final ScriptState getState() {
        return this.state;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int r2 = (this.state.hashCode() + ((Boolean.hashCode(this.autoRelease) + ((this.luaContext.hashCode() + AbstractC2374ph.m4810g(this.scriptDir, AbstractC2374ph.m4810g(this.filePath, AbstractC2374ph.m4810g(this.description, AbstractC2374ph.m4810g(this.version, AbstractC2374ph.m4810g(this.author, AbstractC2374ph.m4810g(this.name, this.f5562id.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31;
        String r0 = this.lastResult;
        int r3 = 0;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        int r22 = (r2 + r02) * 31;
        String r03 = this.lastError;
        if (r03 == null) goto L11;
        r3 = r03.hashCode();
    L11:
        return Long.hashCode(this.loadTime) + ((r22 + r3) * 31);
    L5:
        r02 = r0.hashCode();
        goto L6
    }

    public final void setLastError(String r1) {
        this.lastError = r1;
    }

    public final void setLastResult(String r1) {
        this.lastResult = r1;
    }

    public final void setState(ScriptState r3) {
        AbstractC0295Gu.m625r(-328242875594805L);
        this.state = r3;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-326932910569525L));
        AbstractC2374ph.m4817n(r0, this.f5562id, -327005925013557L);
        AbstractC2374ph.m4817n(r0, this.name, -327040284751925L);
        AbstractC2374ph.m4817n(r0, this.author, -327083234424885L);
        AbstractC2374ph.m4817n(r0, this.version, -326580723251253L);
        AbstractC2374ph.m4817n(r0, this.description, -326645147760693L);
        AbstractC2374ph.m4817n(r0, this.filePath, -326696687368245L);
        AbstractC2374ph.m4817n(r0, this.scriptDir, -326752521943093L);
        r0.append(this.luaContext);
        r0.append(AbstractC0295Gu.m625r(-326812651485237L));
        r0.append(this.autoRelease);
        r0.append(AbstractC0295Gu.m625r(-327426831808565L));
        r0.append(this.state);
        r0.append(AbstractC0295Gu.m625r(-327465486514229L));
        AbstractC2374ph.m4817n(r0, this.lastResult, -327525616056373L);
        AbstractC2374ph.m4817n(r0, this.lastError, -327581450631221L);
        r0.append(this.loadTime);
        r0.append(')');
        return r0.toString();
    }

    public /* synthetic */ LoadedScript(String r19, String r20, String r21, String r22, String r23, String r24, String r25, LuaContext r26, boolean r27, ScriptState r28, String r29, String r30, long r31, int r33, AbstractC0621Oc r34) {
        if ((r33 & 1024) == 0) goto L5;
        String r14 = null;
    L7:
        if ((r33 & 2048) == 0) goto L9;
        String r15 = null;
    L11:
        if ((r33 & 4096) == 0) goto L14;
        long r16 = System.currentTimeMillis();
    L15:
        this(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r14, r15, r16);
        return;
    L14:
        r16 = r31;
        goto L15
    L9:
        r15 = r30;
        goto L11
    L5:
        r14 = r29;
        goto L7
    }
}
