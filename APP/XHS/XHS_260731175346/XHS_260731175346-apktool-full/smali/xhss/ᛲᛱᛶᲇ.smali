.class public final Lxhss/ᛲᛱᛶᲇ;
.super Lxhss/ᲁᛶᛶᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲇᛴᲇᛵ:Lxhss/ᛲᛱᛶᲇ;


# instance fields
.field public ᛳᲁᲇᛸ:Lxhss/ᛴᛱᲀᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lxhss/ᛲᛱᛶᲇ;

    .line 2
    .line 3
    sget v5, Lxhss/ᛷᛶᛲᛴ;->ᛳᲁᲇᛸ:I

    .line 4
    .line 5
    sget v6, Lxhss/ᛷᛶᛲᛴ;->ᲇᛴᲇᛵ:I

    .line 6
    .line 7
    sget-wide v2, Lxhss/ᛷᛶᛲᛴ;->ᛷᛴᛷᛱ:J

    .line 8
    .line 9
    sget-object v4, Lxhss/ᛷᛶᛲᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lxhss/ᛲᛶᲇᲇ;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lxhss/ᛴᛱᲀᛴ;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Lxhss/ᛴᛱᲀᛴ;-><init>(JLjava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lxhss/ᛲᛱᛶᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛱᲀᛴ;

    .line 20
    .line 21
    sput-object v0, Lxhss/ᛲᛱᛶᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛲᛱᛶᲇ;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᲁᲁ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛱᛶᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛱᲀᛴ;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p2, p1}, Lxhss/ᛴᛱᲀᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Runnable;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
