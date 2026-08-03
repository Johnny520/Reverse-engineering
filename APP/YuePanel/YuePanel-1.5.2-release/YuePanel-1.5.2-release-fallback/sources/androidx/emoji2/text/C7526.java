package androidx.emoji2.text;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC0412
public class C7526 implements androidx.emoji2.text.C7527.InterfaceC7534 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f29017 = 10;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<java.lang.StringBuilder> f29018 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.text.TextPaint f29019;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.emoji2.text.C7526.f29018 = r0
            return
    }

    public C7526() {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.f29019 = r0
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.StringBuilder m28933() {
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = androidx.emoji2.text.C7526.f29018
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.set(r1)
        L10:
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            return r0
    }

    @Override // androidx.emoji2.text.C7527.InterfaceC7534
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean mo28934(@Yue.InterfaceC4410 java.lang.CharSequence r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.StringBuilder r5 = m28933()
            r0 = 0
            r5.setLength(r0)
        L8:
            if (r3 >= r4) goto L14
            char r0 = r2.charAt(r3)
            r5.append(r0)
            int r3 = r3 + 1
            goto L8
        L14:
            android.text.TextPaint r2 = r1.f29019
            java.lang.String r3 = r5.toString()
            boolean r2 = Yue.C4673.m18530(r2, r3)
            return r2
    }
}
