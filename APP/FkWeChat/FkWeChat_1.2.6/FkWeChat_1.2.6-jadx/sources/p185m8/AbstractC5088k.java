package p185m8;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p036c9.InterfaceC1404e;

/* JADX INFO: renamed from: m8.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5088k extends AbstractMap implements Map, InterfaceC1404e {
    /* JADX INFO: renamed from: a */
    public abstract Set mo478a();

    /* JADX INFO: renamed from: c */
    public abstract /* bridge */ Set mo479c();

    /* JADX INFO: renamed from: e */
    public abstract /* bridge */ int mo480e();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo478a();
    }

    /* JADX INFO: renamed from: g */
    public abstract /* bridge */ Collection mo481g();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return mo479c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return mo480e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return mo481g();
    }
}
