package p358y9;

import java.util.List;
import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5112w;

/* JADX INFO: renamed from: y9.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9622g0 {

    /* JADX INFO: renamed from: a */
    public final EnumC9638o0 f32750a;

    /* JADX INFO: renamed from: b */
    public final EnumC9638o0 f32751b;

    /* JADX INFO: renamed from: c */
    public final Map f32752c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4705l f32753d;

    /* JADX INFO: renamed from: e */
    public final boolean f32754e;

    public C9622g0(EnumC9638o0 enumC9638o0, EnumC9638o0 enumC9638o02, Map map) {
        enumC9638o0.getClass();
        map.getClass();
        this.f32750a = enumC9638o0;
        this.f32751b = enumC9638o02;
        this.f32752c = map;
        this.f32753d = AbstractC4706m.m18787a(new C9620f0(this));
        EnumC9638o0 enumC9638o03 = EnumC9638o0.f32827s;
        this.f32754e = enumC9638o0 == enumC9638o03 && enumC9638o02 == enumC9638o03 && map.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public static final String[] m37635b(C9622g0 c9622g0) {
        List listM20787c = AbstractC5112w.m20787c();
        listM20787c.add(c9622g0.f32750a.m37699c());
        EnumC9638o0 enumC9638o0 = c9622g0.f32751b;
        if (enumC9638o0 != null) {
            listM20787c.add("under-migration:" + enumC9638o0.m37699c());
        }
        for (Map.Entry entry : c9622g0.f32752c.entrySet()) {
            listM20787c.add("@" + entry.getKey() + ':' + ((EnumC9638o0) entry.getValue()).m37699c());
        }
        return (String[]) AbstractC5112w.m20785a(listM20787c).toArray(new String[0]);
    }

    /* JADX INFO: renamed from: c */
    public final EnumC9638o0 m37636c() {
        return this.f32750a;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC9638o0 m37637d() {
        return this.f32751b;
    }

    /* JADX INFO: renamed from: e */
    public final Map m37638e() {
        return this.f32752c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9622g0)) {
            return false;
        }
        C9622g0 c9622g0 = (C9622g0) obj;
        return this.f32750a == c9622g0.f32750a && this.f32751b == c9622g0.f32751b && AbstractC1061t.m3842c(this.f32752c, c9622g0.f32752c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m37639f() {
        return this.f32754e;
    }

    public int hashCode() {
        int iHashCode = this.f32750a.hashCode() * 31;
        EnumC9638o0 enumC9638o0 = this.f32751b;
        return ((iHashCode + (enumC9638o0 == null ? 0 : enumC9638o0.hashCode())) * 31) + this.f32752c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f32750a + ", migrationLevel=" + this.f32751b + ", userDefinedLevelForSpecificAnnotation=" + this.f32752c + ')';
    }

    public /* synthetic */ C9622g0(EnumC9638o0 enumC9638o0, EnumC9638o0 enumC9638o02, Map map, int i10, AbstractC1043k abstractC1043k) {
        this(enumC9638o0, (i10 & 2) != 0 ? null : enumC9638o02, (i10 & 4) != 0 ? AbstractC5109u0.m20768i() : map);
    }
}
