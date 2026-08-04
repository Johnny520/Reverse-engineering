.class public Lyyds/ᛲᲀᛵᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Iterator;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛲᲀᛵᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛲᲀᛵᛷ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lyyds/ᛲᲀᛵᛷ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget p0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    check-cast v3, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ge p0, v0, :cond_0

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_0
    return v1

    .line 22
    :pswitch_0
    iget p0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 23
    .line 24
    check-cast v3, [Ljava/lang/Object;

    .line 25
    .line 26
    array-length v0, v3

    .line 27
    if-ge p0, v0, :cond_1

    .line 28
    .line 29
    move v1, v2

    .line 30
    :cond_1
    return v1

    .line 31
    :pswitch_1
    iget p0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 32
    .line 33
    check-cast v3, Lyyds/ᛶᛴᛱᛲ;

    .line 34
    .line 35
    invoke-virtual {v3}, Lyyds/ᛲᛱᲁᛳ;->ᛲᲈᲁ()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ge p0, v0, :cond_2

    .line 40
    .line 41
    move v1, v2

    .line 42
    :cond_2
    return v1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛲᲀᛵᛷ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Landroid/view/ViewGroup;

    .line 9
    .line 10
    iget v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    add-int/lit8 v2, v0, 0x1

    .line 13
    .line 14
    iput v2, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :pswitch_0
    :try_start_0
    check-cast v1, [Ljava/lang/Object;

    .line 30
    .line 31
    iget v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 32
    .line 33
    add-int/lit8 v2, v0, 0x1

    .line 34
    .line 35
    iput v2, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 36
    .line 37
    aget-object p0, v1, v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    return-object p0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    iget v1, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 42
    .line 43
    add-int/lit8 v1, v1, -0x1

    .line 44
    .line 45
    iput v1, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 46
    .line 47
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :pswitch_1
    invoke-virtual {p0}, Lyyds/ᛲᲀᛵᛷ;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    check-cast v1, Lyyds/ᛶᛴᛱᛲ;

    .line 64
    .line 65
    iget v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 66
    .line 67
    add-int/lit8 v2, v0, 0x1

    .line 68
    .line 69
    iput v2, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 70
    .line 71
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 77
    .line 78
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    iget v1, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    iput v1, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 21
    .line 22
    const-string v0, "Operation is not supported for read-only collection"

    .line 23
    .line 24
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :pswitch_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 29
    .line 30
    const-string v0, "Operation is not supported for read-only collection"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
