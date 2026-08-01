package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum ProbeType extends java.lang.Enum<com.example.dyhelper.hook.comment.bookmark.ProbeType> {
    private static final /* synthetic */ p000.InterfaceC0742qz $ENTRIES = null;
    private static final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProbeType[] $VALUES = null;
    public static final com.example.dyhelper.hook.comment.bookmark.ProbeType COMMENT = null;
    public static final com.example.dyhelper.hook.comment.bookmark.ProbeType PROFILE = null;

    private static final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProbeType[] $values() {
            com.example.dyhelper.hook.comment.bookmark.ProbeType r0 = com.example.dyhelper.hook.comment.bookmark.ProbeType.COMMENT
            com.example.dyhelper.hook.comment.bookmark.ProbeType r1 = com.example.dyhelper.hook.comment.bookmark.ProbeType.PROFILE
            com.example.dyhelper.hook.comment.bookmark.ProbeType[] r0 = new com.example.dyhelper.hook.comment.bookmark.ProbeType[]{r0, r1}
            return r0
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.ProbeType r0 = new com.example.dyhelper.hook.comment.bookmark.ProbeType
            java.lang.String r1 = "COMMENT"
            r2 = 0
            r0.<init>(r1, r2)
            com.example.dyhelper.hook.comment.bookmark.ProbeType.COMMENT = r0
            com.example.dyhelper.hook.comment.bookmark.ProbeType r0 = new com.example.dyhelper.hook.comment.bookmark.ProbeType
            java.lang.String r1 = "PROFILE"
            r2 = 1
            r0.<init>(r1, r2)
            com.example.dyhelper.hook.comment.bookmark.ProbeType.PROFILE = r0
            com.example.dyhelper.hook.comment.bookmark.ProbeType[] r0 = $values()
            com.example.dyhelper.hook.comment.bookmark.ProbeType.$VALUES = r0
            rz r0 = p000.kn0.m3375(r0)
            com.example.dyhelper.hook.comment.bookmark.ProbeType.$ENTRIES = r0
            return
    }

    ProbeType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static p000.InterfaceC0742qz getEntries() {
            qz r0 = com.example.dyhelper.hook.comment.bookmark.ProbeType.$ENTRIES
            return r0
    }

    public static com.example.dyhelper.hook.comment.bookmark.ProbeType valueOf(java.lang.String r1) {
            java.lang.Class<com.example.dyhelper.hook.comment.bookmark.ProbeType> r0 = com.example.dyhelper.hook.comment.bookmark.ProbeType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.example.dyhelper.hook.comment.bookmark.ProbeType r1 = (com.example.dyhelper.hook.comment.bookmark.ProbeType) r1
            return r1
    }

    public static com.example.dyhelper.hook.comment.bookmark.ProbeType[] values() {
            com.example.dyhelper.hook.comment.bookmark.ProbeType[] r0 = com.example.dyhelper.hook.comment.bookmark.ProbeType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.example.dyhelper.hook.comment.bookmark.ProbeType[] r0 = (com.example.dyhelper.hook.comment.bookmark.ProbeType[]) r0
            return r0
    }
}
