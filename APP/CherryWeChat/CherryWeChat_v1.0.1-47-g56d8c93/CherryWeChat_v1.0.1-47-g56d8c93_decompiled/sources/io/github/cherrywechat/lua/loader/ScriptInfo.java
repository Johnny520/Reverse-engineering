package io.github.cherrywechat.lua.loader;

import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2374ph;

/* JADX INFO: loaded from: classes.dex */
public final class ScriptInfo {
    private final long lastModified;
    private final String name;
    private final String path;
    private final long size;

    public ScriptInfo(String str, String str2, long j, long j2) {
        AbstractC0295Gu.m625r(-327632990238773L);
        AbstractC0295Gu.m625r(-327654465075253L);
        this.name = str;
        this.path = str2;
        this.size = j;
        this.lastModified = j2;
    }

    public static /* synthetic */ ScriptInfo copy$default(ScriptInfo scriptInfo, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scriptInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = scriptInfo.path;
        }
        if ((i & 4) != 0) {
            j = scriptInfo.size;
        }
        if ((i & 8) != 0) {
            j2 = scriptInfo.lastModified;
        }
        long j3 = j2;
        return scriptInfo.copy(str, str2, j, j3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.path;
    }

    public final long component3() {
        return this.size;
    }

    public final long component4() {
        return this.lastModified;
    }

    public final ScriptInfo copy(String str, String str2, long j, long j2) {
        AbstractC0295Gu.m625r(-327173428738101L);
        AbstractC0295Gu.m625r(-327194903574581L);
        return new ScriptInfo(str, str2, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScriptInfo)) {
            return false;
        }
        ScriptInfo scriptInfo = (ScriptInfo) obj;
        return AbstractC0585Nj.m1134a(this.name, scriptInfo.name) && AbstractC0585Nj.m1134a(this.path, scriptInfo.path) && this.size == scriptInfo.size && this.lastModified == scriptInfo.lastModified;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getSizeFormatted() {
        long j = this.size;
        if (j < 1024) {
            return this.size + AbstractC0295Gu.m625r(-327126184097845L);
        }
        if (j < 1048576) {
            return (this.size / ((long) 1024)) + AbstractC0295Gu.m625r(-327139068999733L);
        }
        return (this.size / ((long) 1048576)) + AbstractC0295Gu.m625r(-327156248868917L);
    }

    public int hashCode() {
        return Long.hashCode(this.lastModified) + ((Long.hashCode(this.size) + AbstractC2374ph.m4810g(this.path, this.name.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0295Gu.m625r(-327216378411061L));
        AbstractC2374ph.m4817n(sb, this.name, -327289392855093L);
        AbstractC2374ph.m4817n(sb, this.path, -327323752593461L);
        sb.append(this.size);
        sb.append(AbstractC0295Gu.m625r(-327358112331829L));
        sb.append(this.lastModified);
        sb.append(')');
        return sb.toString();
    }
}
