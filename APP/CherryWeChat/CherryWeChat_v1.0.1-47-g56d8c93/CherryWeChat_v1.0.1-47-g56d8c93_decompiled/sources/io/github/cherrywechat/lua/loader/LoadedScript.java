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

    public LoadedScript(String str, String str2, String str3, String str4, String str5, String str6, String str7, LuaContext luaContext, boolean z, ScriptState scriptState, String str8, String str9, long j) {
        AbstractC0295Gu.m625r(-328487688730677L);
        AbstractC0295Gu.m625r(-328500573632565L);
        AbstractC0295Gu.m625r(-328522048469045L);
        AbstractC0295Gu.m625r(-328552113240117L);
        AbstractC0295Gu.m625r(-328586472978485L);
        AbstractC0295Gu.m625r(-328638012586037L);
        AbstractC0295Gu.m625r(-328676667291701L);
        AbstractC0295Gu.m625r(-328719616964661L);
        AbstractC0295Gu.m625r(-328217105791029L);
        this.f5562id = str;
        this.name = str2;
        this.author = str3;
        this.version = str4;
        this.description = str5;
        this.filePath = str6;
        this.scriptDir = str7;
        this.luaContext = luaContext;
        this.autoRelease = z;
        this.state = scriptState;
        this.lastResult = str8;
        this.lastError = str9;
        this.loadTime = j;
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

    public final LoadedScript copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, LuaContext luaContext, boolean z, ScriptState scriptState, String str8, String str9, long j) {
        AbstractC0295Gu.m625r(-328277235333173L);
        AbstractC0295Gu.m625r(-328290120235061L);
        AbstractC0295Gu.m625r(-328311595071541L);
        AbstractC0295Gu.m625r(-328341659842613L);
        AbstractC0295Gu.m625r(-328376019580981L);
        AbstractC0295Gu.m625r(-328427559188533L);
        AbstractC0295Gu.m625r(-328466213894197L);
        AbstractC0295Gu.m625r(-326859896125493L);
        AbstractC0295Gu.m625r(-326907140765749L);
        return new LoadedScript(str, str2, str3, str4, str5, str6, str7, luaContext, z, scriptState, str8, str9, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadedScript)) {
            return false;
        }
        LoadedScript loadedScript = (LoadedScript) obj;
        return AbstractC0585Nj.m1134a(this.f5562id, loadedScript.f5562id) && AbstractC0585Nj.m1134a(this.name, loadedScript.name) && AbstractC0585Nj.m1134a(this.author, loadedScript.author) && AbstractC0585Nj.m1134a(this.version, loadedScript.version) && AbstractC0585Nj.m1134a(this.description, loadedScript.description) && AbstractC0585Nj.m1134a(this.filePath, loadedScript.filePath) && AbstractC0585Nj.m1134a(this.scriptDir, loadedScript.scriptDir) && AbstractC0585Nj.m1134a(this.luaContext, loadedScript.luaContext) && this.autoRelease == loadedScript.autoRelease && this.state == loadedScript.state && AbstractC0585Nj.m1134a(this.lastResult, loadedScript.lastResult) && AbstractC0585Nj.m1134a(this.lastError, loadedScript.lastError) && this.loadTime == loadedScript.loadTime;
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
        int iHashCode = (this.state.hashCode() + ((Boolean.hashCode(this.autoRelease) + ((this.luaContext.hashCode() + AbstractC2374ph.m4810g(this.scriptDir, AbstractC2374ph.m4810g(this.filePath, AbstractC2374ph.m4810g(this.description, AbstractC2374ph.m4810g(this.version, AbstractC2374ph.m4810g(this.author, AbstractC2374ph.m4810g(this.name, this.f5562id.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31;
        String str = this.lastResult;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastError;
        return Long.hashCode(this.loadTime) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void setLastError(String str) {
        this.lastError = str;
    }

    public final void setLastResult(String str) {
        this.lastResult = str;
    }

    public final void setState(ScriptState scriptState) {
        AbstractC0295Gu.m625r(-328242875594805L);
        this.state = scriptState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-326932910569525L));
        AbstractC2374ph.m4817n(sb, this.f5562id, -327005925013557L);
        AbstractC2374ph.m4817n(sb, this.name, -327040284751925L);
        AbstractC2374ph.m4817n(sb, this.author, -327083234424885L);
        AbstractC2374ph.m4817n(sb, this.version, -326580723251253L);
        AbstractC2374ph.m4817n(sb, this.description, -326645147760693L);
        AbstractC2374ph.m4817n(sb, this.filePath, -326696687368245L);
        AbstractC2374ph.m4817n(sb, this.scriptDir, -326752521943093L);
        sb.append(this.luaContext);
        sb.append(AbstractC0295Gu.m625r(-326812651485237L));
        sb.append(this.autoRelease);
        sb.append(AbstractC0295Gu.m625r(-327426831808565L));
        sb.append(this.state);
        sb.append(AbstractC0295Gu.m625r(-327465486514229L));
        AbstractC2374ph.m4817n(sb, this.lastResult, -327525616056373L);
        AbstractC2374ph.m4817n(sb, this.lastError, -327581450631221L);
        sb.append(this.loadTime);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ LoadedScript(String str, String str2, String str3, String str4, String str5, String str6, String str7, LuaContext luaContext, boolean z, ScriptState scriptState, String str8, String str9, long j, int i, AbstractC0621Oc abstractC0621Oc) {
        this(str, str2, str3, str4, str5, str6, str7, luaContext, z, scriptState, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? System.currentTimeMillis() : j);
    }
}
