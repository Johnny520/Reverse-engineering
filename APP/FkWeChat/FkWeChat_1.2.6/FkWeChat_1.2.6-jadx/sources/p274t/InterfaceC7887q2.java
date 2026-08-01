package p274t;

import p024b9.AbstractC1043k;
import p121i3.C3179i;
import p121i3.EnumC3191u;
import p288u.AbstractC8476a;

/* JADX INFO: renamed from: t.q2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7887q2 {
    /* JADX INFO: renamed from: a */
    float mo27239a();

    /* JADX INFO: renamed from: b */
    float mo27240b(EnumC3191u enumC3191u);

    /* JADX INFO: renamed from: c */
    float mo27241c();

    /* JADX INFO: renamed from: d */
    float mo27242d(EnumC3191u enumC3191u);

    /* JADX INFO: renamed from: t.q2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7887q2 {

        /* JADX INFO: renamed from: a */
        public final float f26286a;

        /* JADX INFO: renamed from: b */
        public final float f26287b;

        /* JADX INFO: renamed from: c */
        public final float f26288c;

        /* JADX INFO: renamed from: d */
        public final float f26289d;

        public a(float f10, float f11, float f12, float f13) {
            this.f26286a = f10;
            this.f26287b = f11;
            this.f26288c = f12;
            this.f26289d = f13;
            if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
                AbstractC8476a.m32537a("Padding must be non-negative");
            }
        }

        @Override // p274t.InterfaceC7887q2
        /* JADX INFO: renamed from: a */
        public float mo27239a() {
            return this.f26289d;
        }

        @Override // p274t.InterfaceC7887q2
        /* JADX INFO: renamed from: b */
        public float mo27240b(EnumC3191u enumC3191u) {
            return this.f26286a;
        }

        @Override // p274t.InterfaceC7887q2
        /* JADX INFO: renamed from: c */
        public float mo27241c() {
            return this.f26287b;
        }

        @Override // p274t.InterfaceC7887q2
        /* JADX INFO: renamed from: d */
        public float mo27242d(EnumC3191u enumC3191u) {
            return this.f26288c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C3179i.m12005m(this.f26286a, aVar.f26286a) && C3179i.m12005m(this.f26287b, aVar.f26287b) && C3179i.m12005m(this.f26288c, aVar.f26288c) && C3179i.m12005m(this.f26289d, aVar.f26289d);
        }

        public int hashCode() {
            return (((((C3179i.m12006n(this.f26286a) * 31) + C3179i.m12006n(this.f26287b)) * 31) + C3179i.m12006n(this.f26288c)) * 31) + C3179i.m12006n(this.f26289d);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) C3179i.m12007p(this.f26286a)) + ", top=" + ((Object) C3179i.m12007p(this.f26287b)) + ", right=" + ((Object) C3179i.m12007p(this.f26288c)) + ", bottom=" + ((Object) C3179i.m12007p(this.f26289d)) + ')';
        }

        public /* synthetic */ a(float f10, float f11, float f12, float f13, AbstractC1043k abstractC1043k) {
            this(f10, f11, f12, f13);
        }
    }
}
