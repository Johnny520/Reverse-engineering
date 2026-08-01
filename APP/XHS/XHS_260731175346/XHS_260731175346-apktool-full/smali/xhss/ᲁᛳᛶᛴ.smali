.class public Lxhss/ᲁᛳᛶᛴ;
.super Lxhss/ᛸᛷᛳᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᲇᛴᲇᛵ:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lxhss/ᛸᛷᛳᲈ;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Lxhss/ᛸᛷᛳᲈ;->ᛱᛳᲁᲈ(Lxhss/ᛸᛷᛳᲈ;)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 10
    .line 11
    sget-wide v3, Lxhss/ᛸᛷᛳᲈ;->ᛱᛱᛲᲇ:J

    .line 12
    .line 13
    invoke-virtual {v2, p0, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lxhss/ᛶᛷᛴᛶ;

    .line 18
    .line 19
    instance-of v5, v2, Lxhss/ᛴᛴᛷᛲ;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    check-cast v2, Lxhss/ᛴᛴᛷᛲ;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v1

    .line 27
    :goto_0
    const/4 v5, 0x0

    .line 28
    if-eqz v2, :cond_6

    .line 29
    .line 30
    iget-object v2, v2, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v2, v1

    .line 36
    :goto_1
    if-nez v2, :cond_2

    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_2
    invoke-virtual {v2}, Lxhss/ᛸᛷᛳᲈ;->ᛴᲈᛱᛴ()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_3

    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_3
    sget-object v6, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 47
    .line 48
    invoke-virtual {v6, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lxhss/ᛶᛷᛴᛶ;

    .line 53
    .line 54
    instance-of v6, v2, Lxhss/ᛴᛴᛷᛲ;

    .line 55
    .line 56
    if-eqz v6, :cond_4

    .line 57
    .line 58
    check-cast v2, Lxhss/ᛴᛴᛷᛲ;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    move-object v2, v1

    .line 62
    :goto_2
    if-eqz v2, :cond_6

    .line 63
    .line 64
    iget-object v2, v2, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 65
    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_5
    move-object v2, v1

    .line 70
    :goto_3
    if-nez v2, :cond_2

    .line 71
    .line 72
    :cond_6
    :goto_4
    move v0, v5

    .line 73
    :goto_5
    iput-boolean v0, p0, Lxhss/ᲁᛳᛶᛴ;->ᲇᛴᲇᛵ:Z

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final ᛳᛶᛷᲀ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛴᲈᛱᛴ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lxhss/ᲁᛳᛶᛴ;->ᲇᛴᲇᛵ:Z

    .line 2
    .line 3
    return p0
.end method
