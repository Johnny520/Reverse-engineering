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
    public static final Companion Companion = new Companion(null);
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

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public SavedMusicItem() {
        this(0L, 0L, (String) null, (String) null, 0L, (String) null, 0L, (String) null, (String) null, 511, (AbstractC0621Oc) null);
    }

    public static final /* synthetic */ void write$Self$app_release(SavedMusicItem savedMusicItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || savedMusicItem.songId != 0) {
            long j = savedMusicItem.songId;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || savedMusicItem.albumId != 0) {
            long j2 = savedMusicItem.albumId;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicItem.title, "")) {
            String str = savedMusicItem.title;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicItem.artist, "")) {
            String str2 = savedMusicItem.artist;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || savedMusicItem.size != 0) {
            long j3 = savedMusicItem.size;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicItem.url, "")) {
            String str3 = savedMusicItem.url;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || savedMusicItem.duration != 0) {
            long j4 = savedMusicItem.duration;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicItem.album, "")) {
            String str4 = savedMusicItem.album;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(savedMusicItem.imageUrl, "")) {
            return;
        }
        String str5 = savedMusicItem.imageUrl;
        interfaceC0962Wa.m1842d();
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

    public final SavedMusicItem copy(long j, long j2, String str, String str2, long j3, String str3, long j4, String str4, String str5) {
        return new SavedMusicItem(j, j2, str, str2, j3, str3, j4, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedMusicItem)) {
            return false;
        }
        SavedMusicItem savedMusicItem = (SavedMusicItem) obj;
        return this.songId == savedMusicItem.songId && this.albumId == savedMusicItem.albumId && AbstractC0585Nj.m1134a(this.title, savedMusicItem.title) && AbstractC0585Nj.m1134a(this.artist, savedMusicItem.artist) && this.size == savedMusicItem.size && AbstractC0585Nj.m1134a(this.url, savedMusicItem.url) && this.duration == savedMusicItem.duration && AbstractC0585Nj.m1134a(this.album, savedMusicItem.album) && AbstractC0585Nj.m1134a(this.imageUrl, savedMusicItem.imageUrl);
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
        return this.imageUrl.hashCode() + AbstractC2374ph.m4810g(this.album, (Long.hashCode(this.duration) + AbstractC2374ph.m4810g(this.url, (Long.hashCode(this.size) + AbstractC2374ph.m4810g(this.artist, AbstractC2374ph.m4810g(this.title, (Long.hashCode(this.albumId) + (Long.hashCode(this.songId) * 31)) * 31, 31), 31)) * 31, 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SavedMusicItem(songId=");
        sb.append(this.songId);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", artist=");
        sb.append(this.artist);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", album=");
        sb.append(this.album);
        sb.append(", imageUrl=");
        return AbstractC2374ph.m4815l(sb, this.imageUrl, ')');
    }

    public /* synthetic */ SavedMusicItem(int i, long j, long j2, String str, String str2, long j3, String str3, long j4, String str4, String str5, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.songId = 0L;
        } else {
            this.songId = j;
        }
        if ((i & 2) == 0) {
            this.albumId = 0L;
        } else {
            this.albumId = j2;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 8) == 0) {
            this.artist = "";
        } else {
            this.artist = str2;
        }
        if ((i & 16) == 0) {
            this.size = 0L;
        } else {
            this.size = j3;
        }
        if ((i & 32) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
        if ((i & 64) == 0) {
            this.duration = 0L;
        } else {
            this.duration = j4;
        }
        if ((i & 128) == 0) {
            this.album = "";
        } else {
            this.album = str4;
        }
        if ((i & 256) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str5;
        }
    }

    public SavedMusicItem(long j, long j2, String str, String str2, long j3, String str3, long j4, String str4, String str5) {
        this.songId = j;
        this.albumId = j2;
        this.title = str;
        this.artist = str2;
        this.size = j3;
        this.url = str3;
        this.duration = j4;
        this.album = str4;
        this.imageUrl = str5;
    }

    public /* synthetic */ SavedMusicItem(long j, long j2, String str, String str2, long j3, String str3, long j4, String str4, String str5, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? "" : str3, (i & 64) == 0 ? j4 : 0L, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5);
    }
}
