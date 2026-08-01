package p265s1;

import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p250r1.AbstractC6462l;
import p265s1.AbstractC7124p2;

/* JADX INFO: renamed from: s1.b3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7055b3 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7090i3 f23492a = new a();

    /* JADX INFO: renamed from: s1.b3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7090i3 {
        @Override // p265s1.InterfaceC7090i3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC7124p2.b mo4a(long j10, EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e) {
            return new AbstractC7124p2.b(AbstractC6462l.m25629b(j10));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7090i3 m27770a() {
        return f23492a;
    }
}
