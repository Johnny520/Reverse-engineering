.class public final Lyyds/ᲁᛱᛶᛶ;
.super Lyyds/ᛲᛴᛷᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lyyds/\u1c81\u16f1\u16f6\u16f6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛷᛲᛸᛵ;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛷᛲᛸᛵ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᲁᛱᛶᛶ;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᛲᲈᲈ(Landroid/content/Context;Z)Z
    .locals 0

    .line 1
    invoke-static {}, Lyyds/ᛸᲇᛶᛵ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᛷᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᛲᛴᛳᛲ()I
    .locals 0

    .line 1
    const/16 p0, 0x21

    .line 2
    .line 3
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lyyds/ᛲᛴᛷᲁ;->ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 9
    .line 10
    const/16 p1, 0x21

    .line 11
    .line 12
    if-le p1, p0, :cond_0

    .line 13
    .line 14
    const/16 p0, 0x20

    .line 15
    .line 16
    const-string p1, "android.permission.READ_EXTERNAL_STORAGE"

    .line 17
    .line 18
    invoke-static {p1, p4}, Lyyds/ᛲᛴᛷᲁ;->ᲇᲈᛵᛷ(Ljava/lang/String;Ljava/util/ArrayList;)Lyyds/ᛸᲀᛴᛸ;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {p2, p1, p0}, Lyyds/ᛲᛴᛷᲁ;->ᛲᲈᲁ(Lyyds/ᛸᲀᛴᛸ;Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final ᛶᛷᛲᲁ()Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {}, Lyyds/ᛸᲇᛶᛵ;->ᛵᛸᛸᛷ()Lyyds/ᛲᛴᛷᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Lyyds/ᛲᛴᛷᲁ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lyyds/ᛴᛶᲀᛲ;->ᛲᲈᲁ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "android.permission.READ_MEDIA_AUDIO"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    const-string p0, "android.permission.READ_EXTERNAL_STORAGE"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "You have added the \"android.permission.READ_MEDIA_AUDIO\" permission, please do not add the \"android.permission.READ_EXTERNAL_STORAGE\" permission, this conflicts with the framework\'s automatic compatibility policy."

    .line 11
    .line 12
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
