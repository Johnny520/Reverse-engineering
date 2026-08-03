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

    public ScriptInfo(String r3, String r4, long r5, long r7) {
        AbstractC0295Gu.m625r(-327632990238773L);
        AbstractC0295Gu.m625r(-327654465075253L);
        this.name = r3;
        this.path = r4;
        this.size = r5;
        this.lastModified = r7;
    }

    public static /* synthetic */ ScriptInfo copy$default(ScriptInfo r0, String r1, String r2, long r3, long r5, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.path;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.size;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r5 = r0.lastModified;
    L14:
        long r72 = r5;
        long r52 = r3;
        return r0.copy(r1, r2, r52, r72);
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

    public final ScriptInfo copy(String r10, String r11, long r12, long r14) {
        AbstractC0295Gu.m625r(-327173428738101L);
        AbstractC0295Gu.m625r(-327194903574581L);
        return new ScriptInfo(r10, r11, r12, r14);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ScriptInfo) == true) goto L8;
        return false;
    L8:
        ScriptInfo r82 = (ScriptInfo) r8;
        if (AbstractC0585Nj.m1134a(this.name, r82.name) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.path, r82.path) == true) goto L15;
        return false;
    L15:
        if (this.size == r82.size) goto L18;
        return false;
    L18:
        if (this.lastModified == r82.lastModified) goto L20;
        return false;
    L20:
        return true;
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
        long r0 = this.size;
        if (r0 >= 1024) goto L7;
        return this.size + AbstractC0295Gu.m625r(-327126184097845L);
    L7:
        if (r0 >= 1048576) goto L11;
        return (this.size / ((long) 1024)) + AbstractC0295Gu.m625r(-327139068999733L);
    L11:
        return (this.size / ((long) 1048576)) + AbstractC0295Gu.m625r(-327156248868917L);
    }

    public int hashCode() {
        int r0 = this.name.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.path, r0, 31);
        int r2 = (Long.hashCode(this.size) + r02) * 31;
        return Long.hashCode(this.lastModified) + r2;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-327216378411061L));
        AbstractC2374ph.m4817n(r0, this.name, -327289392855093L);
        AbstractC2374ph.m4817n(r0, this.path, -327323752593461L);
        r0.append(this.size);
        r0.append(AbstractC0295Gu.m625r(-327358112331829L));
        r0.append(this.lastModified);
        r0.append(')');
        return r0.toString();
    }
}
