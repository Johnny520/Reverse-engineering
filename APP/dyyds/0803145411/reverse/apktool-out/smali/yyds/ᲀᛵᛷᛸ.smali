.class public final synthetic Lyyds/ᲀᛵᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:J

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛴᲀᛷᛷ;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᲀᛷᛷ;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛵᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲀᛷᛷ;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᲀᛵᛷᛸ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    iput-wide p3, p0, Lyyds/ᲀᛵᛷᛸ;->ᛲᛴᛳᛲ:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛵᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲀᛷᛷ;

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᲀᛵᛷᛸ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    iget-wide v2, p0, Lyyds/ᲀᛵᛷᛸ;->ᛲᛴᛳᛲ:J

    .line 6
    .line 7
    :try_start_0
    iget-object p0, v0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 8
    .line 9
    invoke-virtual {p0, v1, v2, v3}, Lyyds/ᛲᛱᛷᲀ;->ᛳᛸᛴᛶ(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-virtual {v0, v1, v1, p0}, Lyyds/ᛴᲀᛷᛷ;->ᛲᲈᲁ(IILjava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 19
    .line 20
    return-object p0
.end method
