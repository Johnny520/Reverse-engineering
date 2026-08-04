.class public abstract Lyyds/ᛸᲇᛶᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛶᛲᛶᛲ;

    .line 2
    .line 3
    const/16 v1, 0x97

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛶᛲᛶᛲ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 9
    .line 10
    return-void
.end method

.method public static ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛲᛴᛷᲁ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lyyds/ᛶᛲᛶᛲ;->ᛱᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᛲᛴᛷᲁ;

    .line 8
    .line 9
    return-object p0
.end method

.method public static ᛵᛸᛸᛷ()Lyyds/ᛲᛴᛷᲁ;
    .locals 3

    .line 1
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛲᛴᛷᲁ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Lyyds/ᛵᛵᛷᛵ;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-object v1
.end method

.method public static ᲀᛲᛳᲀ()Lyyds/ᛲᛴᛷᲁ;
    .locals 3

    .line 1
    const-string v0, "android.permission.READ_MEDIA_AUDIO"

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛲᛴᛷᲁ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Lyyds/ᲁᛱᛶᛶ;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-object v1
.end method
