.class public Lxhss/ᛸᛲᲀᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Iterator;
.implements Lxhss/ᛱᛶᲈᛵ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:I

.field public final ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 20
    iput p1, p0, Lxhss/ᛸᛲᲀᛵ;->ᛱᛱᛲᲇ:I

    iput-object p2, p0, Lxhss/ᛸᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lxhss/ᛷᛸᛷᛴ;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lxhss/ᛷᛸᛷᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲁᛷᛴᲇ;

    .line 8
    .line 9
    invoke-interface {v0}, Lxhss/ᲁᛷᛴᲇ;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 14
    .line 15
    iget p1, p1, Lxhss/ᛷᛸᛷᛴ;->ᛱᛱᛲᲇ:I

    .line 16
    .line 17
    iput p1, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lxhss/ᛸᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v3, Ljava/util/Iterator;

    .line 11
    .line 12
    :goto_0
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    iput v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :pswitch_0
    iget p0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 38
    .line 39
    check-cast v3, [Ljava/lang/Object;

    .line 40
    .line 41
    array-length v0, v3

    .line 42
    if-ge p0, v0, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    :cond_1
    return v1

    .line 46
    :pswitch_1
    iget p0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 47
    .line 48
    check-cast v3, Lxhss/ᛷᲁᲁ;

    .line 49
    .line 50
    invoke-virtual {v3}, Lxhss/ᛷᛴᛷᛱ;->ᛷᛵᛵᲈ()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ge p0, v0, :cond_2

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_2
    return v1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛸᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/util/Iterator;

    .line 9
    .line 10
    :goto_0
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    iput v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    :try_start_0
    check-cast v1, [Ljava/lang/Object;

    .line 36
    .line 37
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 38
    .line 39
    add-int/lit8 v2, v0, 0x1

    .line 40
    .line 41
    iput v2, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 42
    .line 43
    aget-object p0, v1, v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    return-object p0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    iget v1, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    iput v1, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 52
    .line 53
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :pswitch_1
    invoke-virtual {p0}, Lxhss/ᛸᛲᲀᛵ;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    check-cast v1, Lxhss/ᛷᲁᲁ;

    .line 70
    .line 71
    iget v0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 72
    .line 73
    add-int/lit8 v2, v0, 0x1

    .line 74
    .line 75
    iput v2, p0, Lxhss/ᛸᛲᲀᛵ;->ᛳᲁᲇᛸ:I

    .line 76
    .line 77
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 83
    .line 84
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 85
    .line 86
    .line 87
    throw p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lxhss/ᛸᛲᲀᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :pswitch_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v0, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
