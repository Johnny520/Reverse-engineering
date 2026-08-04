.class public final Lyyds/ᛴᲁᛸᛶ;
.super Lyyds/ᛲᛴᛷᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lyyds/\u16f4\u1c81\u16f8\u16f6;",
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
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛷᛲᛸᛵ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛴᲁᛸᛶ;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "image_and_video_media_group"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()I
    .locals 0

    .line 1
    const/16 p0, 0x22

    .line 2
    .line 3
    return p0
.end method

.method public final ᛷᲈᲈᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    const-string p0, "android.permission.READ_MEDIA_IMAGES"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const-string p0, "android.permission.READ_MEDIA_VIDEO"

    .line 10
    .line 11
    invoke-static {p0, p2}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "You cannot request the \"android.permission.READ_MEDIA_VISUAL_USER_SELECTED\" permission alone. must add either \"android.permission.READ_MEDIA_IMAGES\" or \"android.permission.READ_MEDIA_VIDEO\" permission, or maybe both"

    .line 19
    .line 20
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/app/Activity;)I
    .locals 0

    .line 1
    const/16 p0, 0x21

    .line 2
    .line 3
    return p0
.end method
