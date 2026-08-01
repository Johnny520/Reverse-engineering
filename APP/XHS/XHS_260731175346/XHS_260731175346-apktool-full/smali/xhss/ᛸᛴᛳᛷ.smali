.class public abstract Lxhss/ᛸᛴᛳᛷ;
.super Lxhss/ᛷᛲᛳᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

.field public transient ᲇᛴᲇᛵ:Lxhss/ᛱᛴᛶᛴ;


# direct methods
.method public constructor <init>(Lxhss/ᛱᛴᛶᛴ;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lxhss/ᛱᛴᛶᛴ;->ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1}, Lxhss/ᛷᛲᛳᛴ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛸᛷᲈᲈ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lxhss/ᛸᛴᛳᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eq v0, p0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 8
    .line 9
    sget-object v2, Lxhss/ᛳᛴᲀᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 10
    .line 11
    invoke-interface {v1, v2}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lxhss/ᛲᛶᲇᲇ;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, Lxhss/ᛸᲇᲁᛱ;

    .line 21
    .line 22
    :cond_0
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 23
    .line 24
    sget-wide v2, Lxhss/ᛸᲇᲁᛱ;->ᛸᛲᲀᛵ:J

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sget-object v5, Lxhss/ᲈᲀᲀᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛲᛷᛵ;

    .line 31
    .line 32
    if-eq v4, v5, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v1, v0, Lxhss/ᛲᛶᛳᲁ;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast v0, Lxhss/ᛲᛶᛳᲁ;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lxhss/ᛲᛶᛳᲁ;->ᛷᲁᲁ()V

    .line 49
    .line 50
    .line 51
    :cond_2
    sget-object v0, Lxhss/ᛶᲀᲁᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛶᲀᲁᲁ;

    .line 52
    .line 53
    iput-object v0, p0, Lxhss/ᛸᛴᛳᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛴᛶᛴ;

    .line 54
    .line 55
    return-void
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᛴᛳᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    return-object p0
.end method
