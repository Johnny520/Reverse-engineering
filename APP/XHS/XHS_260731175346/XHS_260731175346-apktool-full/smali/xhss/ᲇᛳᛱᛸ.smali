.class public final synthetic Lxhss/ᲇᛳᛱᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᲁᛲᛵ;

.field public final synthetic ᛳᲁᲇᛸ:I

.field public final synthetic ᲇᛴᲇᛵ:J


# direct methods
.method public synthetic constructor <init>(Lxhss/ᲁᛲᛵ;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲇᛳᛱᛸ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛲᛵ;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᲇᛳᛱᛸ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    iput-wide p3, p0, Lxhss/ᲇᛳᛱᛸ;->ᲇᛴᲇᛵ:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᲇᛳᛱᛸ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛲᛵ;

    .line 2
    .line 3
    iget v1, p0, Lxhss/ᲇᛳᛱᛸ;->ᛳᲁᲇᛸ:I

    .line 4
    .line 5
    iget-wide v2, p0, Lxhss/ᲇᛳᛱᛸ;->ᲇᛴᲇᛵ:J

    .line 6
    .line 7
    :try_start_0
    iget-object p0, v0, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 8
    .line 9
    invoke-virtual {p0, v2, v3, v1}, Lxhss/ᲀᛱᛶᛳ;->ᲇᛸᛳᲁ(JI)V
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
    invoke-virtual {v0, v1, v1, p0}, Lxhss/ᲁᛲᛵ;->ᛱᛱᛲᲇ(IILjava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 19
    .line 20
    return-object p0
.end method
