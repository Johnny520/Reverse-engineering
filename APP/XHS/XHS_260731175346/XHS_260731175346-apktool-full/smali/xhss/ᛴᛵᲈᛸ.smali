.class public final Lxhss/ᛴᛵᲈᛸ;
.super Lxhss/ᲇᛷᛱᛸ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛳᲁᲇᛸ:Ljava/lang/String;

.field public final ᛷᛴᛷᛱ:Lxhss/ᲁᛸᛵᛳ;

.field public final ᲇᛴᲇᛵ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLxhss/ᲁᛸᛵᛳ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᛵᲈᛸ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lxhss/ᛴᛵᲈᛸ;->ᲇᛴᲇᛵ:J

    .line 7
    .line 8
    iput-object p4, p0, Lxhss/ᛴᛵᲈᛸ;->ᛷᛴᛷᛱ:Lxhss/ᲁᛸᛵᛳ;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lxhss/ᛴᛵᲈᛸ;->ᲇᛴᲇᛵ:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ᲀᲇᛳᲁ()Lxhss/ᲀᛶᛷᛳ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛵᲈᛸ;->ᛷᛴᛷᛱ:Lxhss/ᲁᛸᛵᛳ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ()Lxhss/ᛱᛴᛲᛴ;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lxhss/ᛴᛵᲈᛸ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lxhss/ᛱᛴᛲᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᛴᲁ;

    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛶᛴᲀ(Ljava/lang/String;)Lxhss/ᛱᛴᛲᛴ;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    :cond_0
    return-object v0
.end method
