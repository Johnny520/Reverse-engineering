package yyds;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᛳᲈᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0758 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final ThreadLocal f3506 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f3507;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0299 f3508;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile int f3509 = 0;

    public C0758(C0299 c0299, int i) {
        this.f3508 = c0299;
        this.f3507 = i;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0960 c0960M1706 = m1706();
        int iM3645 = c0960M1706.m3645(4);
        sb.append(Integer.toHexString(iM3645 != 0 ? ((ByteBuffer) c0960M1706.f9366).getInt(iM3645 + c0960M1706.f9365) : 0));
        sb.append(", codepoints:");
        C0960 c0960M17062 = m1706();
        int iM36452 = c0960M17062.m3645(16);
        if (iM36452 != 0) {
            int i2 = iM36452 + c0960M17062.f9365;
            i = ((ByteBuffer) c0960M17062.f9366).getInt(((ByteBuffer) c0960M17062.f9366).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m1705(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m1705(int i) {
        C0960 c0960M1706 = m1706();
        int iM3645 = c0960M1706.m3645(16);
        if (iM3645 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0960M1706.f9366;
        int i2 = iM3645 + c0960M1706.f9365;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0960 m1706() {
        ThreadLocal threadLocal = f3506;
        C0960 c0960 = (C0960) threadLocal.get();
        if (c0960 == null) {
            c0960 = new C0960();
            threadLocal.set(c0960);
        }
        C2308 c2308 = (C2308) this.f3508.f1577;
        int iM3645 = c2308.m3645(6);
        if (iM3645 != 0) {
            int i = iM3645 + c2308.f9365;
            int i2 = (this.f3507 * 4) + ((ByteBuffer) c2308.f9366).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c2308.f9366).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c2308.f9366;
            c0960.f9366 = byteBuffer;
            if (byteBuffer != null) {
                c0960.f9365 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0960.f9367 = i4;
                c0960.f9364 = ((ByteBuffer) c0960.f9366).getShort(i4);
                return c0960;
            }
            c0960.f9365 = 0;
            c0960.f9367 = 0;
            c0960.f9364 = 0;
        }
        return c0960;
    }
}
