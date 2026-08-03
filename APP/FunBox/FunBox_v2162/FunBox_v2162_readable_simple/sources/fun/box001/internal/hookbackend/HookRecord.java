package fun.box001.internal.hookbackend;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: loaded from: classes.dex */
public final class HookRecord {

    /* JADX INFO: renamed from: a */
    public final Member f818a;

    /* JADX INFO: renamed from: b */
    public Method f819b;

    /* JADX INFO: renamed from: c */
    public RuntimeDexGenerator f820c;

    public HookRecord(Member r1) {
        this.f818a = r1;
    }
}
