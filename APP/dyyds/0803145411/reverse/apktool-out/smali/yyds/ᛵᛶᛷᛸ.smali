.class public final Lyyds/ᛵᛶᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Iterator;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᛵᲈᛴᛷ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final ᲇᲈᛵᛷ:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛶᛷᲇ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 25
    iget-object p1, p1, Lyyds/ᛲᛶᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 26
    invoke-interface {p1}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛲᲈᲁᛱ;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 29
    iget-object p1, p1, Lyyds/ᛲᲈᲁᛱ;->ᛲᲈᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 30
    invoke-interface {p1}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    const/4 p1, -0x1

    .line 31
    iput p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛸᲀᛱ;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᲈᛸᲀᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lyyds/ᛵᲈᛴᛷ;

    .line 12
    .line 13
    invoke-interface {p1}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    iput p1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛵᛶᛷᛸ;->ᛵᛸᛸᛷ()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget p0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    return v0

    .line 22
    :pswitch_0
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 v1, 0x2

    .line 29
    if-ne v0, v1, :cond_3

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :goto_1
    return v1

    .line 38
    :pswitch_1
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 39
    .line 40
    const/4 v1, -0x1

    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, Lyyds/ᛵᛶᛷᛸ;->ᛲᲈᲁ()V

    .line 44
    .line 45
    .line 46
    :cond_4
    iget p0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    if-ne p0, v0, :cond_5

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_5
    const/4 v0, 0x0

    .line 53
    :goto_2
    return v0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛵᛶᛷᛸ;->ᛵᛸᛸᛷ()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 22
    .line 23
    iput v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :pswitch_0
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    if-eq v0, v1, :cond_4

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 53
    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 54
    .line 55
    iget-object p0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Ljava/util/Iterator;

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :pswitch_1
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 71
    .line 72
    const/4 v1, -0x1

    .line 73
    if-ne v0, v1, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0}, Lyyds/ᛵᛶᛷᛸ;->ᛲᲈᲁ()V

    .line 76
    .line 77
    .line 78
    :cond_5
    iget v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iget-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    iput-object v2, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 86
    .line 87
    iput v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_6
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 91
    .line 92
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲀᛲᛳᲀ:I

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

.method public ᛲᲈᲁ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛲᲈᲁᛱ;

    .line 4
    .line 5
    :cond_0
    iget-object v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, Lyyds/ᛲᲈᲁᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛴᲈᲀ;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-boolean v3, v0, Lyyds/ᛲᲈᲁᛱ;->ᛵᛸᛸᛷ:Z

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iput-object v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 41
    .line 42
    return-void
.end method

.method public ᛵᛸᛸᛷ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 14
    .line 15
    check-cast v1, Lyyds/ᲈᛸᲀᛱ;

    .line 16
    .line 17
    iget-object v1, v1, Lyyds/ᲈᛸᲀᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᲈᲀ;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    iput v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 33
    .line 34
    iput-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 39
    .line 40
    return-void
.end method

.method public ᲀᛲᛳᲀ()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Iterator;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, p0, Lyyds/ᛵᛶᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 30
    .line 31
    check-cast v2, Lyyds/ᛲᛶᛷᲇ;

    .line 32
    .line 33
    iget-object v3, v2, Lyyds/ᛲᛶᛷᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛴᲈᲀ;

    .line 34
    .line 35
    iget-object v2, v2, Lyyds/ᛲᛶᛷᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᲈᲀ;

    .line 36
    .line 37
    invoke-interface {v2, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v3, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/util/Iterator;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    iput-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 54
    .line 55
    iput v1, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 56
    .line 57
    return v1

    .line 58
    :cond_1
    const/4 v0, 0x2

    .line 59
    iput v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᛲᛴᛳᛲ:I

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lyyds/ᛵᛶᛷᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0
.end method
