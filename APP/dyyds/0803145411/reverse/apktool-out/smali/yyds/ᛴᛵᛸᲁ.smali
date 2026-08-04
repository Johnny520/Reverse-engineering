.class public final Lyyds/ᛴᛵᛸᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Iterator;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲀᛲᛳᲀ:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛴᛵᛸᲁ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛲᛳᲁᛳ;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lyyds/ᛲᛳᲁᛳ;->ᛲᲈᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 8
    .line 9
    invoke-interface {v0}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 14
    .line 15
    iget p1, p1, Lyyds/ᛲᛳᲁᛳ;->ᛵᛸᛸᛷ:I

    .line 16
    .line 17
    iput p1, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lyyds/ᛳᛳᲀᲀ;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲀᛲᛳᲀ:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iget-object p1, p1, Lyyds/ᛳᛳᲀᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    check-cast p1, Lyyds/ᛲᲈᲁᛱ;

    .line 22
    new-instance v0, Lyyds/ᛵᛶᛷᛸ;

    invoke-direct {v0, p1}, Lyyds/ᛵᛶᛷᛸ;-><init>(Lyyds/ᛲᲈᲁᛱ;)V

    .line 23
    iput-object v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᛵᛸᲁ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :goto_0
    :pswitch_1
    iget v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    iput v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛴᛵᛸᲁ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛷᲇᛶᛴ;

    .line 10
    .line 11
    iget v3, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 12
    .line 13
    add-int/lit8 v4, v3, 0x1

    .line 14
    .line 15
    iput v4, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 16
    .line 17
    if-ltz v3, :cond_0

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, v3, p0}, Lyyds/ᛷᲇᛶᛴ;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᲀᛲᛲᲇ()V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :pswitch_0
    new-instance v0, Lyyds/ᛷᲇᛶᛴ;

    .line 32
    .line 33
    iget v3, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 34
    .line 35
    add-int/lit8 v4, v3, 0x1

    .line 36
    .line 37
    iput v4, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 38
    .line 39
    if-ltz v3, :cond_1

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, v3, p0}, Lyyds/ᛷᲇᛶᛴ;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    invoke-static {}, Lyyds/ᲈᛸᲁᛶ;->ᲀᛲᛲᲇ()V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :goto_0
    :pswitch_1
    iget v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 54
    .line 55
    if-lez v0, :cond_2

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    iget v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    iput v0, p0, Lyyds/ᛴᛵᛸᲁ;->ᛲᛴᛳᛲ:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lyyds/ᛴᛵᛸᲁ;->ᲀᛲᛳᲀ:I

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
