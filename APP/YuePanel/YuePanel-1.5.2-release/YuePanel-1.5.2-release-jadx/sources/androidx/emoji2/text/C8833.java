package androidx.emoji2.text;

import Yue.C6213;
import Yue.C6214;
import Yue.C6740;
import Yue.C7950;
import Yue.C8033;
import Yue.InterfaceC3262;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3262
@InterfaceC7113(19)
public final class C8833 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f29566 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f29567 = "EmojiCompat.MetadataRepo.create";

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final C6213 f3786;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final char[] f3787;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final C1677 f29568 = new C1677(1024);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final Typeface f29569;

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۠$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C1677 {

        /* JADX INFO: renamed from: ۥ */
        public final SparseArray<C1677> f3788;

        /* JADX INFO: renamed from: ۥ۟ */
        public C8033 f3789;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1677() {
            this(1);
        }

        /* JADX INFO: renamed from: ۥ */
        public C1677 m4802(int i) {
            SparseArray<C1677> sparseArray = this.f3788;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final C8033 m4803() {
            return this.f3789;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29705(@InterfaceC6391 C8033 c8033, int i, int i2) {
            C1677 c1677M4802 = m4802(c8033.m4051(i));
            if (c1677M4802 == null) {
                c1677M4802 = new C1677();
                this.f3788.put(c8033.m4051(i), c1677M4802);
            }
            if (i2 > i) {
                c1677M4802.m29705(c8033, i + 1, i2);
            } else {
                c1677M4802.f3789 = c8033;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1677(int i) {
            this.f3788 = new SparseArray<>(i);
        }
    }

    public C8833(@InterfaceC6391 Typeface typeface, @InterfaceC6391 C6213 c6213) {
        this.f29569 = typeface;
        this.f3786 = c6213;
        this.f3787 = new char[c6213.m19164() * 2];
        m4801(c6213);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C8833 m4800(@InterfaceC6391 AssetManager assetManager, @InterfaceC6391 String str) throws IOException {
        try {
            C7950.m3971(f29567);
            return new C8833(Typeface.createFromAsset(assetManager, str), C6214.m2708(assetManager, str));
        } finally {
            C7950.m25086();
        }
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.TESTS})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C8833 m29696(@InterfaceC6391 Typeface typeface) {
        try {
            C7950.m3971(f29567);
            return new C8833(typeface, new C6213());
        } finally {
            C7950.m25086();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C8833 m29697(@InterfaceC6391 Typeface typeface, @InterfaceC6391 InputStream inputStream) throws IOException {
        try {
            C7950.m3971(f29567);
            return new C8833(typeface, C6214.m19174(inputStream));
        } finally {
            C7950.m25086();
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C8833 m29698(@InterfaceC6391 Typeface typeface, @InterfaceC6391 ByteBuffer byteBuffer) throws IOException {
        try {
            C7950.m3971(f29567);
            return new C8833(typeface, C6214.m19175(byteBuffer));
        } finally {
            C7950.m25086();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4801(C6213 c6213) {
        int iM19164 = c6213.m19164();
        for (int i = 0; i < iM19164; i++) {
            C8033 c8033 = new C8033(this, i);
            Character.toChars(c8033.m25400(), this.f3787, i * 2);
            m29704(c8033);
        }
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public char[] m29699() {
        return this.f3787;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C6213 m29700() {
        return this.f3786;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m29701() {
        return this.f3786.m19170();
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C1677 m29702() {
        return this.f29568;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Typeface m29703() {
        return this.f29569;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29704(@InterfaceC6391 C8033 c8033) {
        C6740.m21416(c8033, "emoji metadata cannot be null");
        C6740.m3227(c8033.m25396() > 0, "invalid metadata codepoint length");
        this.f29568.m29705(c8033, 0, c8033.m25396() - 1);
    }
}
