.class public final Lle0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/ListIterator;
.implements Llo0;


# instance fields
.field public final synthetic ε:I

.field public ζ:I

.field public η:I

.field public θ:I

.field public final ι:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lix1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lle0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 8
    .line 9
    add-int/lit8 p2, p2, -0x1

    .line 10
    .line 11
    iput p2, p0, Lle0;->ζ:I

    .line 12
    .line 13
    const/4 p2, -0x1

    .line 14
    iput p2, p0, Lle0;->η:I

    .line 15
    .line 16
    invoke-static {p1}, Lbd;->ψ(Lix1;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lle0;->θ:I

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lne0;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lle0;->ε:I

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    move p2, v0

    .line 28
    :cond_0
    iget-object p3, p1, Lne0;->ε:Lv11;

    .line 29
    iget p3, p3, Lv11;->β:I

    .line 30
    invoke-direct {p0, p1, p2, v0, p3}, Lle0;-><init>(Lne0;III)V

    return-void
.end method

.method public constructor <init>(Lne0;III)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lle0;->ε:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 32
    iput p2, p0, Lle0;->ζ:I

    .line 33
    iput p3, p0, Lle0;->η:I

    .line 34
    iput p4, p0, Lle0;->θ:I

    return-void
.end method

.method public constructor <init>(Lyt0;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lle0;->ε:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 37
    iput p2, p0, Lle0;->ζ:I

    const/4 p2, -0x1

    .line 38
    iput p2, p0, Lle0;->η:I

    .line 39
    invoke-static {p1}, Lyt0;->γ(Lyt0;)I

    move-result p1

    iput p1, p0, Lle0;->θ:I

    return-void
.end method

.method public constructor <init>(Lzt0;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lle0;->ε:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 25
    iput p2, p0, Lle0;->ζ:I

    const/4 p2, -0x1

    .line 26
    iput p2, p0, Lle0;->η:I

    .line 27
    invoke-static {p1}, Lzt0;->γ(Lzt0;)I

    move-result p1

    iput p1, p0, Lle0;->θ:I

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lle0;->γ()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lix1;

    .line 12
    .line 13
    iget v1, p0, Lle0;->ζ:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Lix1;->add(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, -0x1

    .line 21
    iput p1, p0, Lle0;->η:I

    .line 22
    .line 23
    iget p1, p0, Lle0;->ζ:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    iput p1, p0, Lle0;->ζ:I

    .line 28
    .line 29
    invoke-static {v0}, Lbd;->ψ(Lix1;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lle0;->θ:I

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    invoke-virtual {p0}, Lle0;->β()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lzt0;

    .line 42
    .line 43
    iget v1, p0, Lle0;->ζ:I

    .line 44
    .line 45
    add-int/lit8 v2, v1, 0x1

    .line 46
    .line 47
    iput v2, p0, Lle0;->ζ:I

    .line 48
    .line 49
    invoke-virtual {v0, v1, p1}, Lzt0;->add(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, -0x1

    .line 53
    iput p1, p0, Lle0;->η:I

    .line 54
    .line 55
    invoke-static {v0}, Lzt0;->γ(Lzt0;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput p1, p0, Lle0;->θ:I

    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    invoke-virtual {p0}, Lle0;->α()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lyt0;

    .line 68
    .line 69
    iget v1, p0, Lle0;->ζ:I

    .line 70
    .line 71
    add-int/lit8 v2, v1, 0x1

    .line 72
    .line 73
    iput v2, p0, Lle0;->ζ:I

    .line 74
    .line 75
    invoke-virtual {v0, v1, p1}, Lyt0;->add(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, -0x1

    .line 79
    iput p1, p0, Lle0;->η:I

    .line 80
    .line 81
    invoke-static {v0}, Lyt0;->γ(Lyt0;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput p1, p0, Lle0;->θ:I

    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 89
    .line 90
    const-string p1, "Operation is not supported for read-only collection"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lle0;->ζ:I

    .line 7
    .line 8
    iget-object p0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lix1;

    .line 11
    .line 12
    invoke-virtual {p0}, Lix1;->size()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 v1, 0x1

    .line 17
    sub-int/2addr p0, v1

    .line 18
    if-ge v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    return v1

    .line 23
    :pswitch_0
    iget v0, p0, Lle0;->ζ:I

    .line 24
    .line 25
    iget-object p0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lzt0;

    .line 28
    .line 29
    iget p0, p0, Lzt0;->ζ:I

    .line 30
    .line 31
    if-ge v0, p0, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_1
    return p0

    .line 37
    :pswitch_1
    iget v0, p0, Lle0;->ζ:I

    .line 38
    .line 39
    iget-object p0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lyt0;

    .line 42
    .line 43
    iget p0, p0, Lyt0;->η:I

    .line 44
    .line 45
    if-ge v0, p0, :cond_2

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    :goto_2
    return p0

    .line 51
    :pswitch_2
    iget v0, p0, Lle0;->ζ:I

    .line 52
    .line 53
    iget p0, p0, Lle0;->θ:I

    .line 54
    .line 55
    if-ge v0, p0, :cond_3

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 p0, 0x0

    .line 60
    :goto_3
    return p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lle0;->ζ:I

    .line 7
    .line 8
    if-ltz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    return p0

    .line 14
    :pswitch_0
    iget p0, p0, Lle0;->ζ:I

    .line 15
    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    :goto_1
    return p0

    .line 22
    :pswitch_1
    iget p0, p0, Lle0;->ζ:I

    .line 23
    .line 24
    if-lez p0, :cond_2

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    const/4 p0, 0x0

    .line 29
    :goto_2
    return p0

    .line 30
    :pswitch_2
    iget v0, p0, Lle0;->ζ:I

    .line 31
    .line 32
    iget p0, p0, Lle0;->η:I

    .line 33
    .line 34
    if-le v0, p0, :cond_3

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    const/4 p0, 0x0

    .line 39
    :goto_3
    return p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lle0;->γ()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lle0;->ζ:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lle0;->η:I

    .line 14
    .line 15
    iget-object v1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lix1;

    .line 18
    .line 19
    invoke-virtual {v1}, Lix1;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v0, v2}, Lbd;->β(II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lix1;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput v0, p0, Lle0;->ζ:I

    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_0
    invoke-virtual {p0}, Lle0;->β()V

    .line 34
    .line 35
    .line 36
    iget v0, p0, Lle0;->ζ:I

    .line 37
    .line 38
    iget-object v1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lzt0;

    .line 41
    .line 42
    iget v2, v1, Lzt0;->ζ:I

    .line 43
    .line 44
    if-ge v0, v2, :cond_0

    .line 45
    .line 46
    add-int/lit8 v2, v0, 0x1

    .line 47
    .line 48
    iput v2, p0, Lle0;->ζ:I

    .line 49
    .line 50
    iput v0, p0, Lle0;->η:I

    .line 51
    .line 52
    iget-object p0, v1, Lzt0;->ε:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object p0, p0, v0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {}, Lγ;->ο()V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    :goto_0
    return-object p0

    .line 62
    :pswitch_1
    invoke-virtual {p0}, Lle0;->α()V

    .line 63
    .line 64
    .line 65
    iget v0, p0, Lle0;->ζ:I

    .line 66
    .line 67
    iget-object v1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lyt0;

    .line 70
    .line 71
    iget v2, v1, Lyt0;->η:I

    .line 72
    .line 73
    if-ge v0, v2, :cond_1

    .line 74
    .line 75
    add-int/lit8 v2, v0, 0x1

    .line 76
    .line 77
    iput v2, p0, Lle0;->ζ:I

    .line 78
    .line 79
    iput v0, p0, Lle0;->η:I

    .line 80
    .line 81
    iget-object p0, v1, Lyt0;->ε:[Ljava/lang/Object;

    .line 82
    .line 83
    iget v1, v1, Lyt0;->ζ:I

    .line 84
    .line 85
    add-int/2addr v1, v0

    .line 86
    aget-object p0, p0, v1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-static {}, Lγ;->ο()V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    :goto_1
    return-object p0

    .line 94
    :pswitch_2
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lne0;

    .line 97
    .line 98
    iget-object v0, v0, Lne0;->ε:Lv11;

    .line 99
    .line 100
    iget v1, p0, Lle0;->ζ:I

    .line 101
    .line 102
    add-int/lit8 v2, v1, 0x1

    .line 103
    .line 104
    iput v2, p0, Lle0;->ζ:I

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lv11;->ζ(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast p0, Lq01;

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lle0;->ζ:I

    .line 7
    .line 8
    add-int/lit8 p0, p0, 0x1

    .line 9
    .line 10
    return p0

    .line 11
    :pswitch_0
    iget p0, p0, Lle0;->ζ:I

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_1
    iget p0, p0, Lle0;->ζ:I

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_2
    iget v0, p0, Lle0;->ζ:I

    .line 18
    .line 19
    iget p0, p0, Lle0;->η:I

    .line 20
    .line 21
    sub-int/2addr v0, p0

    .line 22
    return v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lle0;->γ()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lle0;->ζ:I

    .line 10
    .line 11
    iget-object v1, p0, Lle0;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lix1;

    .line 14
    .line 15
    invoke-virtual {v1}, Lix1;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v0, v2}, Lbd;->β(II)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lle0;->ζ:I

    .line 23
    .line 24
    iput v0, p0, Lle0;->η:I

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lix1;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v1, p0, Lle0;->ζ:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    iput v1, p0, Lle0;->ζ:I

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    invoke-virtual {p0}, Lle0;->β()V

    .line 38
    .line 39
    .line 40
    iget v0, p0, Lle0;->ζ:I

    .line 41
    .line 42
    if-lez v0, :cond_0

    .line 43
    .line 44
    add-int/lit8 v0, v0, -0x1

    .line 45
    .line 46
    iput v0, p0, Lle0;->ζ:I

    .line 47
    .line 48
    iput v0, p0, Lle0;->η:I

    .line 49
    .line 50
    iget-object p0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lzt0;

    .line 53
    .line 54
    iget-object p0, p0, Lzt0;->ε:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object p0, p0, v0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-static {}, Lγ;->ο()V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    :goto_0
    return-object p0

    .line 64
    :pswitch_1
    invoke-virtual {p0}, Lle0;->α()V

    .line 65
    .line 66
    .line 67
    iget v0, p0, Lle0;->ζ:I

    .line 68
    .line 69
    if-lez v0, :cond_1

    .line 70
    .line 71
    add-int/lit8 v0, v0, -0x1

    .line 72
    .line 73
    iput v0, p0, Lle0;->ζ:I

    .line 74
    .line 75
    iput v0, p0, Lle0;->η:I

    .line 76
    .line 77
    iget-object p0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Lyt0;

    .line 80
    .line 81
    iget-object v1, p0, Lyt0;->ε:[Ljava/lang/Object;

    .line 82
    .line 83
    iget p0, p0, Lyt0;->ζ:I

    .line 84
    .line 85
    add-int/2addr p0, v0

    .line 86
    aget-object p0, v1, p0

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-static {}, Lγ;->ο()V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    :goto_1
    return-object p0

    .line 94
    :pswitch_2
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lne0;

    .line 97
    .line 98
    iget-object v0, v0, Lne0;->ε:Lv11;

    .line 99
    .line 100
    iget v1, p0, Lle0;->ζ:I

    .line 101
    .line 102
    add-int/lit8 v1, v1, -0x1

    .line 103
    .line 104
    iput v1, p0, Lle0;->ζ:I

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lv11;->ζ(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast p0, Lq01;

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lle0;->ζ:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lle0;->ζ:I

    .line 10
    .line 11
    :goto_0
    add-int/lit8 p0, p0, -0x1

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_1
    iget p0, p0, Lle0;->ζ:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_2
    iget v0, p0, Lle0;->ζ:I

    .line 18
    .line 19
    iget p0, p0, Lle0;->η:I

    .line 20
    .line 21
    sub-int/2addr v0, p0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    return v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lle0;->γ()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lix1;

    .line 12
    .line 13
    iget v1, p0, Lle0;->η:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lix1;->remove(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lle0;->ζ:I

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    add-int/2addr v1, v2

    .line 22
    iput v1, p0, Lle0;->ζ:I

    .line 23
    .line 24
    iput v2, p0, Lle0;->η:I

    .line 25
    .line 26
    invoke-static {v0}, Lbd;->ψ(Lix1;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lle0;->θ:I

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lzt0;

    .line 36
    .line 37
    invoke-virtual {p0}, Lle0;->β()V

    .line 38
    .line 39
    .line 40
    iget v1, p0, Lle0;->η:I

    .line 41
    .line 42
    const/4 v2, -0x1

    .line 43
    if-eq v1, v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lzt0;->β(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lle0;->η:I

    .line 49
    .line 50
    iput v1, p0, Lle0;->ζ:I

    .line 51
    .line 52
    iput v2, p0, Lle0;->η:I

    .line 53
    .line 54
    invoke-static {v0}, Lzt0;->γ(Lzt0;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iput v0, p0, Lle0;->θ:I

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string p0, "Call next() or previous() before removing element from the iterator."

    .line 62
    .line 63
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void

    .line 67
    :pswitch_1
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lyt0;

    .line 70
    .line 71
    invoke-virtual {p0}, Lle0;->α()V

    .line 72
    .line 73
    .line 74
    iget v1, p0, Lle0;->η:I

    .line 75
    .line 76
    const/4 v2, -0x1

    .line 77
    if-eq v1, v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lyt0;->β(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    iget v1, p0, Lle0;->η:I

    .line 83
    .line 84
    iput v1, p0, Lle0;->ζ:I

    .line 85
    .line 86
    iput v2, p0, Lle0;->η:I

    .line 87
    .line 88
    invoke-static {v0}, Lyt0;->γ(Lyt0;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Lle0;->θ:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    const-string p0, "Call next() or previous() before removing element from the iterator."

    .line 96
    .line 97
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void

    .line 101
    :pswitch_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 102
    .line 103
    const-string v0, "Operation is not supported for read-only collection"

    .line 104
    .line 105
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lle0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lix1;

    .line 9
    .line 10
    invoke-virtual {p0}, Lle0;->γ()V

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lle0;->η:I

    .line 14
    .line 15
    if-ltz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Lix1;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lbd;->ψ(Lix1;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lle0;->θ:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"

    .line 28
    .line 29
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_0
    invoke-virtual {p0}, Lle0;->β()V

    .line 34
    .line 35
    .line 36
    iget v0, p0, Lle0;->η:I

    .line 37
    .line 38
    const/4 v1, -0x1

    .line 39
    if-eq v0, v1, :cond_1

    .line 40
    .line 41
    iget-object p0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lzt0;

    .line 44
    .line 45
    invoke-virtual {p0, v0, p1}, Lzt0;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "Call next() or previous() before replacing element from the iterator."

    .line 50
    .line 51
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    return-void

    .line 55
    :pswitch_1
    invoke-virtual {p0}, Lle0;->α()V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Lle0;->η:I

    .line 59
    .line 60
    const/4 v1, -0x1

    .line 61
    if-eq v0, v1, :cond_2

    .line 62
    .line 63
    iget-object p0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lyt0;

    .line 66
    .line 67
    invoke-virtual {p0, v0, p1}, Lyt0;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const-string p0, "Call next() or previous() before replacing element from the iterator."

    .line 72
    .line 73
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    return-void

    .line 77
    :pswitch_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 78
    .line 79
    const-string p1, "Operation is not supported for read-only collection"

    .line 80
    .line 81
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public α()V
    .locals 1

    .line 1
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyt0;

    .line 4
    .line 5
    iget-object v0, v0, Lyt0;->ι:Lzt0;

    .line 6
    .line 7
    invoke-static {v0}, Lzt0;->γ(Lzt0;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget p0, p0, Lle0;->θ:I

    .line 12
    .line 13
    if-ne v0, p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p0
.end method

.method public β()V
    .locals 1

    .line 1
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzt0;

    .line 4
    .line 5
    invoke-static {v0}, Lzt0;->γ(Lzt0;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget p0, p0, Lle0;->θ:I

    .line 10
    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public γ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lle0;->ι:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lix1;

    .line 4
    .line 5
    invoke-static {v0}, Lbd;->ψ(Lix1;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget p0, p0, Lle0;->θ:I

    .line 10
    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p0
.end method
