package Yue;

import Yue.InterfaceC7144;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public enum EnumC4403 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
