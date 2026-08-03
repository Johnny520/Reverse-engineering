package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class SavedMusicItem {
    public static final Companion Companion = null;
    private final String album;
    private final long albumId;
    private final String artist;
    private final long duration;
    private final String imageUrl;
    private final long size;
    private final long songId;
    private final String title;
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return SavedMusicItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public SavedMusicItem() {
        long r1 = 0;
        long r3 = 0;
        String r5 = null;
        String r6 = null;
        long r7 = 0;
        String r9 = null;
        long r10 = 0;
        String r12 = null;
        String r13 = null;
        this(r1, r3, r5, r6, r7, r9, r10, r12, r13, 511, null);
    }

    public static /* synthetic */ SavedMusicItem copy$default(SavedMusicItem r13, long r14, long r16, String r18, String r19, long r20, String r22, long r23, String r25, String r26, int r27, Object r28) {
        if ((r27 & 1) == 0) goto L5;
        long r1 = r13.songId;
    L7:
        if ((r27 & 2) == 0) goto L9;
        long r3 = r13.albumId;
    L11:
        if ((r27 & 4) == 0) goto L13;
        String r5 = r13.title;
    L15:
        if ((r27 & 8) == 0) goto L17;
        String r6 = r13.artist;
    L19:
        if ((r27 & 16) == 0) goto L21;
        long r7 = r13.size;
    L23:
        if ((r27 & 32) == 0) goto L25;
        String r9 = r13.url;
    L27:
        if ((r27 & 64) == 0) goto L29;
        long r10 = r13.duration;
    L31:
        if ((r27 & 128) == 0) goto L33;
        String r12 = r13.album;
    L35:
        if ((r27 & 256) == 0) goto L38;
        String r272 = r13.imageUrl;
    L40:
        return r13.copy(r1, r3, r5, r6, r7, r9, r10, r12, r272);
    L38:
        r272 = r26;
        goto L40
    L33:
        r12 = r25;
        goto L35
    L29:
        r10 = r23;
        goto L31
    L25:
        r9 = r22;
        goto L27
    L21:
        r7 = r20;
        goto L23
    L17:
        r6 = r19;
        goto L19
    L13:
        r5 = r18;
        goto L15
    L9:
        r3 = r16;
        goto L11
    L5:
        r1 = r14;
        goto L7
    }

    public static final /* synthetic */ void write$Self$app_release(SavedMusicItem r5, InterfaceC0962Wa r6, InterfaceC0126Cx r7) {
        if (r6.m1845g() == false) goto L6;
    L7:
        long r2 = r5.songId;
        r6.m1841c();
    L9:
        if (r6.m1845g() == false) goto L12;
    L13:
        long r22 = r5.albumId;
        r6.m1841c();
    L15:
        if (r6.m1845g() == false) goto L18;
    L19:
        String r72 = r5.title;
        r6.m1842d();
    L21:
        if (r6.m1845g() == false) goto L24;
    L25:
        String r73 = r5.artist;
        r6.m1842d();
    L27:
        if (r6.m1845g() == false) goto L30;
    L31:
        long r3 = r5.size;
        r6.m1841c();
    L33:
        if (r6.m1845g() == false) goto L36;
    L37:
        String r74 = r5.url;
        r6.m1842d();
    L39:
        if (r6.m1845g() == false) goto L42;
    L43:
        long r0 = r5.duration;
        r6.m1841c();
    L45:
        if (r6.m1845g() == false) goto L48;
    L49:
        String r75 = r5.album;
        r6.m1842d();
    L51:
        if (r6.m1845g() == false) goto L54;
    L55:
        String r52 = r5.imageUrl;
        r6.m1842d();
        return;
    L54:
        if (AbstractC0585Nj.m1134a(r5.imageUrl, "") == false) goto L55;
        return;
    L48:
        if (AbstractC0585Nj.m1134a(r5.album, "") == true) goto L51;
    L42:
        if (r5.duration == 0) goto L45;
    L36:
        if (AbstractC0585Nj.m1134a(r5.url, "") == true) goto L39;
    L30:
        if (r5.size == 0) goto L33;
    L24:
        if (AbstractC0585Nj.m1134a(r5.artist, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r5.title, "") == true) goto L21;
    L12:
        if (r5.albumId == 0) goto L15;
    L6:
        if (r5.songId == 0) goto L9;
        goto L7
    }

    public final long component1() {
        return this.songId;
    }

    public final long component2() {
        return this.albumId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.artist;
    }

    public final long component5() {
        return this.size;
    }

    public final String component6() {
        return this.url;
    }

    public final long component7() {
        return this.duration;
    }

    public final String component8() {
        return this.album;
    }

    public final String component9() {
        return this.imageUrl;
    }

    public final SavedMusicItem copy(long r15, long r17, String r19, String r20, long r21, String r23, long r24, String r26, String r27) {
        return new SavedMusicItem(r15, r17, r19, r20, r21, r23, r24, r26, r27);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof SavedMusicItem) == true) goto L8;
        return false;
    L8:
        SavedMusicItem r82 = (SavedMusicItem) r8;
        if (this.songId == r82.songId) goto L12;
        return false;
    L12:
        if (this.albumId == r82.albumId) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.title, r82.title) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.artist, r82.artist) == true) goto L21;
        return false;
    L21:
        if (this.size == r82.size) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.url, r82.url) == true) goto L27;
        return false;
    L27:
        if (this.duration == r82.duration) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.album, r82.album) == true) goto L33;
        return false;
    L33:
        if (AbstractC0585Nj.m1134a(this.imageUrl, r82.imageUrl) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final long getSize() {
        return this.size;
    }

    public final long getSongId() {
        return this.songId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int r0 = Long.hashCode(this.songId) * 31;
        int r2 = (Long.hashCode(this.albumId) + r0) * 31;
        int r02 = AbstractC2374ph.m4810g(this.title, r2, 31);
        int r03 = AbstractC2374ph.m4810g(this.artist, r02, 31);
        int r22 = (Long.hashCode(this.size) + r03) * 31;
        int r04 = AbstractC2374ph.m4810g(this.url, r22, 31);
        int r23 = (Long.hashCode(this.duration) + r04) * 31;
        int r05 = AbstractC2374ph.m4810g(this.album, r23, 31);
        return this.imageUrl.hashCode() + r05;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("SavedMusicItem(songId=");
        r0.append(this.songId);
        r0.append(", albumId=");
        r0.append(this.albumId);
        r0.append(", title=");
        r0.append(this.title);
        r0.append(", artist=");
        r0.append(this.artist);
        r0.append(", size=");
        r0.append(this.size);
        r0.append(", url=");
        r0.append(this.url);
        r0.append(", duration=");
        r0.append(this.duration);
        r0.append(", album=");
        r0.append(this.album);
        r0.append(", imageUrl=");
        return AbstractC2374ph.m4815l(r0, this.imageUrl, ')');
    }

    public /* synthetic */ SavedMusicItem(int r4, long r5, long r7, String r9, String r10, long r11, String r13, long r14, String r16, String r17, AbstractC0298Gx r18) {
        if ((r4 & 1) != 0) goto L5;
        this.songId = 0;
    L7:
        if ((r4 & 2) != 0) goto L9;
        this.albumId = 0;
    L11:
        if ((r4 & 4) != 0) goto L13;
        this.title = "";
    L15:
        if ((r4 & 8) != 0) goto L17;
        this.artist = "";
    L19:
        if ((r4 & 16) != 0) goto L21;
        this.size = 0;
    L23:
        if ((r4 & 32) != 0) goto L25;
        this.url = "";
    L27:
        if ((r4 & 64) != 0) goto L29;
        this.duration = 0;
    L31:
        if ((r4 & 128) != 0) goto L33;
        this.album = "";
    L35:
        if ((r4 & 256) != 0) goto L38;
        this.imageUrl = "";
        return;
    L38:
        this.imageUrl = r17;
        return;
    L33:
        this.album = r16;
        goto L35
    L29:
        this.duration = r14;
        goto L31
    L25:
        this.url = r13;
        goto L27
    L21:
        this.size = r11;
        goto L23
    L17:
        this.artist = r10;
        goto L19
    L13:
        this.title = r9;
        goto L15
    L9:
        this.albumId = r7;
        goto L11
    L5:
        this.songId = r5;
        goto L7
    }

    public SavedMusicItem(long r1, long r3, String r5, String r6, long r7, String r9, long r10, String r12, String r13) {
        this.songId = r1;
        this.albumId = r3;
        this.title = r5;
        this.artist = r6;
        this.size = r7;
        this.url = r9;
        this.duration = r10;
        this.album = r12;
        this.imageUrl = r13;
    }

    public /* synthetic */ SavedMusicItem(long r15, long r17, String r19, String r20, long r21, String r23, long r24, String r26, String r27, int r28, AbstractC0621Oc r29) {
        long r2 = 0;
        if ((r28 & 1) == 0) goto L5;
        long r4 = 0;
    L7:
        if ((r28 & 2) == 0) goto L9;
        long r6 = 0;
    L11:
        if ((r28 & 4) == 0) goto L13;
        String r1 = "";
    L15:
        if ((r28 & 8) == 0) goto L17;
        String r9 = "";
    L19:
        if ((r28 & 16) == 0) goto L21;
        long r10 = 0;
    L23:
        if ((r28 & 32) == 0) goto L25;
        String r12 = "";
    L27:
        if ((r28 & 64) != 0) goto L31;
        r2 = r24;
    L31:
        if ((r28 & 128) == 0) goto L33;
        String r13 = "";
    L35:
        if ((r28 & 256) == 0) goto L38;
        String r282 = "";
    L39:
        this(r4, r6, r1, r9, r10, r12, r2, r13, r282);
        return;
    L38:
        r282 = r27;
        goto L39
    L33:
        r13 = r26;
        goto L35
    L25:
        r12 = r23;
        goto L27
    L21:
        r10 = r21;
        goto L23
    L17:
        r9 = r20;
        goto L19
    L13:
        r1 = r19;
        goto L15
    L9:
        r6 = r17;
        goto L11
    L5:
        r4 = r15;
        goto L7
    }
}
