package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: Qt */
/* JADX INFO: loaded from: classes.dex */
public final class C0724Qt extends AbstractC0086C {
    @Override // p000.AbstractC0086C
    /* JADX INFO: renamed from: a */
    public final Random mo134a() {
        return ThreadLocalRandom.current();
    }
}
