package p205o2;

import android.R;
import android.os.Build;
import p165l1.AbstractC4511q;
import p215oc.C5729x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5629b {

    /* JADX INFO: renamed from: s */
    public static final EnumC5629b f17623s = new EnumC5629b("Copy", 0, 0);

    /* JADX INFO: renamed from: t */
    public static final EnumC5629b f17624t = new EnumC5629b("Paste", 1, 1);

    /* JADX INFO: renamed from: u */
    public static final EnumC5629b f17625u = new EnumC5629b("Cut", 2, 2);

    /* JADX INFO: renamed from: v */
    public static final EnumC5629b f17626v = new EnumC5629b("SelectAll", 3, 3);

    /* JADX INFO: renamed from: w */
    public static final EnumC5629b f17627w = new EnumC5629b("Autofill", 4, 4);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC5629b[] f17628x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC7197a f17629y;

    /* JADX INFO: renamed from: q */
    public final int f17630q;

    /* JADX INFO: renamed from: r */
    public final int f17631r;

    /* JADX INFO: renamed from: o2.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17632a;

        static {
            int[] iArr = new int[EnumC5629b.values().length];
            try {
                iArr[EnumC5629b.f17623s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5629b.f17624t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5629b.f17625u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5629b.f17626v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5629b.f17627w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17632a = iArr;
        }
    }

    static {
        EnumC5629b[] enumC5629bArrM22792a = m22792a();
        f17628x = enumC5629bArrM22792a;
        f17629y = AbstractC7198b.m28437a(enumC5629bArrM22792a);
    }

    public EnumC5629b(String str, int i10, int i11) {
        this.f17630q = i11;
        this.f17631r = i11;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC5629b[] m22792a() {
        return new EnumC5629b[]{f17623s, f17624t, f17625u, f17626v, f17627w};
    }

    public static EnumC5629b valueOf(String str) {
        return (EnumC5629b) Enum.valueOf(EnumC5629b.class, str);
    }

    public static EnumC5629b[] values() {
        return (EnumC5629b[]) f17628x.clone();
    }

    /* JADX INFO: renamed from: c */
    public final int m22793c() {
        return this.f17630q;
    }

    /* JADX INFO: renamed from: g */
    public final int m22794g() {
        return this.f17631r;
    }

    /* JADX INFO: renamed from: h */
    public final int m22795h() {
        int i10 = a.f17632a[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        if (i10 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? AbstractC4511q.f13138a : R.string.autofill;
        }
        C5729x.m23182a();
        return 0;
    }
}
