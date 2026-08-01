package p377ze;

import p024b9.AbstractC1043k;
import p331we.InterfaceC9233c;
import p347xe.EnumC9493d;
import ye.C9799c;
import ye.C9800d;
import ye.C9801e;
import ye.C9802f;
import ye.C9803g;
import ye.C9804h;

/* JADX INFO: renamed from: ze.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10033c {

    /* JADX INFO: renamed from: c */
    public static final a f33654c = new a(null);

    /* JADX INFO: renamed from: a */
    public /* synthetic */ InterfaceC9233c f33655a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ EnumC9493d f33656b;

    /* JADX INFO: renamed from: a */
    public final C10033c m38854a(byte b10) {
        this.f33655a = new C9799c(b10);
        this.f33656b = EnumC9493d.ByteValue;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C10033c m38855b(double d10) {
        this.f33655a = new C9800d(d10);
        this.f33656b = EnumC9493d.DoubleValue;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C10033c m38856c(float f10) {
        this.f33655a = new C9801e(f10);
        this.f33656b = EnumC9493d.FloatValue;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC9493d m38857d() {
        return this.f33656b;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC9233c m38858e() {
        return this.f33655a;
    }

    /* JADX INFO: renamed from: f */
    public final C10033c m38859f(int i10) {
        this.f33655a = new C9802f(i10);
        this.f33656b = EnumC9493d.IntValue;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C10033c m38860g(long j10) {
        this.f33655a = new C9803g(j10);
        this.f33656b = EnumC9493d.LongValue;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C10033c m38861h(short s10) {
        this.f33655a = new C9804h(s10);
        this.f33656b = EnumC9493d.ShortValue;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C10033c m38862i(Number number) {
        number.getClass();
        if (number instanceof Byte) {
            m38854a(number.byteValue());
            return this;
        }
        if (number instanceof Short) {
            m38861h(number.shortValue());
            return this;
        }
        if (number instanceof Integer) {
            m38859f(number.intValue());
            return this;
        }
        if (number instanceof Long) {
            m38860g(number.longValue());
            return this;
        }
        if (number instanceof Float) {
            m38856c(number.floatValue());
            return this;
        }
        if (number instanceof Double) {
            m38855b(number.doubleValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: ze.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
