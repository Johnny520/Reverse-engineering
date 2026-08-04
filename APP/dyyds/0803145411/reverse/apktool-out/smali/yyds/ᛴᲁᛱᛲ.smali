.class public final Lyyds/ᛴᲁᛱᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Iterator;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Lyyds/ᛲᲀᛵᛷ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲀᛲᛳᲀ:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lyyds/ᛴᲁᛱᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 20
    iput-object p1, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Lyyds/ᛵᛶᲀᛶ;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛴᲁᛱᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᛵᛶᲀᛶ;->ᛲᲈᲁ:Lyyds/ᛵᲈᛴᛷ;

    .line 10
    .line 11
    invoke-interface {p1}, Lyyds/ᛵᲈᛴᛷ;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᲁᛱᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Landroid/view/View;

    .line 18
    .line 19
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v2, v4

    .line 28
    :goto_0
    if-eqz v2, :cond_1

    .line 29
    .line 30
    new-instance v4, Lyyds/ᛲᲀᛵᛷ;

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-direct {v4, v3, v2}, Lyyds/ᛲᲀᛵᛷ;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object v2, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iput-object v4, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    iget-object v2, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛲᛱᲁᛳ(Ljava/util/List;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/util/Iterator;

    .line 71
    .line 72
    iput-object v2, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    invoke-static {v1}, Lyyds/ᲈᛸᲁᛶ;->ᛳᲁᲁᲇ(Ljava/util/List;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 89
    .line 90
    const-string v0, "List is empty."

    .line 91
    .line 92
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_4
    :goto_2
    return-object v0

    .line 97
    :pswitch_0
    check-cast v1, Lyyds/ᛵᛶᲀᛶ;

    .line 98
    .line 99
    iget-object v0, v1, Lyyds/ᛵᛶᲀᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᲈᲀ;

    .line 100
    .line 101
    iget-object p0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲇᲈᛵᛷ:Ljava/util/Iterator;

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-interface {v0, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lyyds/ᛴᲁᛱᛲ;->ᲀᛲᛳᲀ:I

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
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
