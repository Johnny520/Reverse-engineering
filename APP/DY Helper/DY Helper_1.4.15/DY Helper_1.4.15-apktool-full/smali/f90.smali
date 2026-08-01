.class public final Lf90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Iterator;
.implements Llo0;


# instance fields
.field public final synthetic ε:I

.field public ζ:I

.field public η:Ljava/lang/Object;

.field public final θ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc12;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lf90;->ε:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lf90;->θ:Ljava/lang/Object;

    .line 27
    iget-object p1, p1, Lc12;->α:Lss1;

    .line 28
    invoke-interface {p1}, Lss1;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lf90;->η:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcu;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf90;->ε:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lf90;->θ:Ljava/lang/Object;

    const/4 p1, -0x2

    .line 31
    iput p1, p0, Lf90;->ζ:I

    return-void
.end method

.method public constructor <init>(Le21;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lf90;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf90;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lf90;->ζ:I

    .line 11
    .line 12
    new-instance v0, Ld21;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p1, p0, v1}, Ld21;-><init>(Le21;Lf90;Lop;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Le81;->ι(Le80;)Lts1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lf90;->η:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lf90;->ε:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf90;->η:Ljava/lang/Object;

    .line 33
    iput-object p2, p0, Lf90;->θ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly11;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lf90;->ε:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lf90;->θ:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 36
    iput v0, p0, Lf90;->ζ:I

    .line 37
    new-instance v0, Lx11;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lx11;-><init>(Ly11;Lf90;Lop;)V

    invoke-static {v0}, Le81;->ι(Le80;)Lts1;

    move-result-object p1

    iput-object p1, p0, Lf90;->η:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 5

    .line 1
    iget v0, p0, Lf90;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf90;->θ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lc12;

    .line 9
    .line 10
    iget-object v1, p0, Lf90;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/Iterator;

    .line 13
    .line 14
    :goto_0
    iget v2, p0, Lf90;->ζ:I

    .line 15
    .line 16
    iget v3, v0, Lc12;->β:I

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-ge v2, v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget v2, p0, Lf90;->ζ:I

    .line 31
    .line 32
    add-int/2addr v2, v4

    .line 33
    iput v2, p0, Lf90;->ζ:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget p0, p0, Lf90;->ζ:I

    .line 37
    .line 38
    iget v0, v0, Lc12;->γ:I

    .line 39
    .line 40
    if-ge p0, v0, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v4, 0x0

    .line 50
    :goto_1
    return v4

    .line 51
    :pswitch_0
    iget v0, p0, Lf90;->ζ:I

    .line 52
    .line 53
    iget-object p0, p0, Lf90;->θ:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-ge v0, p0, :cond_2

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/4 p0, 0x0

    .line 66
    :goto_2
    return p0

    .line 67
    :pswitch_1
    iget-object p0, p0, Lf90;->η:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lts1;

    .line 70
    .line 71
    invoke-virtual {p0}, Lts1;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    :pswitch_2
    iget-object p0, p0, Lf90;->η:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Lts1;

    .line 79
    .line 80
    invoke-virtual {p0}, Lts1;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :pswitch_3
    iget v0, p0, Lf90;->ζ:I

    .line 86
    .line 87
    if-gez v0, :cond_3

    .line 88
    .line 89
    invoke-virtual {p0}, Lf90;->α()V

    .line 90
    .line 91
    .line 92
    :cond_3
    iget p0, p0, Lf90;->ζ:I

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    if-ne p0, v0, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    const/4 v0, 0x0

    .line 99
    :goto_3
    return v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lf90;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf90;->θ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lc12;

    .line 9
    .line 10
    iget-object v1, p0, Lf90;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/Iterator;

    .line 13
    .line 14
    :goto_0
    iget v2, p0, Lf90;->ζ:I

    .line 15
    .line 16
    iget v3, v0, Lc12;->β:I

    .line 17
    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lf90;->ζ:I

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    iput v2, p0, Lf90;->ζ:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget v2, p0, Lf90;->ζ:I

    .line 37
    .line 38
    iget v0, v0, Lc12;->γ:I

    .line 39
    .line 40
    if-ge v2, v0, :cond_1

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    iput v2, p0, Lf90;->ζ:I

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {}, Lγ;->ο()V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    :goto_1
    return-object p0

    .line 56
    :pswitch_0
    invoke-virtual {p0}, Lf90;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Lf90;->η:Ljava/lang/Object;

    .line 63
    .line 64
    iget v1, p0, Lf90;->ζ:I

    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    iput v1, p0, Lf90;->ζ:I

    .line 69
    .line 70
    iget-object v1, p0, Lf90;->θ:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Ljava/util/Map;

    .line 73
    .line 74
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    check-cast v1, Lis0;

    .line 81
    .line 82
    iget-object v1, v1, Lis0;->β:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v1, p0, Lf90;->η:Ljava/lang/Object;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v2, "Hash code of an element ("

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, ") has changed after it was added to the persistent set."

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p0, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_3
    invoke-static {}, Lγ;->ο()V

    .line 113
    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    :goto_2
    return-object v0

    .line 117
    :pswitch_1
    iget-object p0, p0, Lf90;->η:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, Lts1;

    .line 120
    .line 121
    invoke-virtual {p0}, Lts1;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :pswitch_2
    iget-object p0, p0, Lf90;->η:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Lts1;

    .line 129
    .line 130
    invoke-virtual {p0}, Lts1;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :pswitch_3
    iget v0, p0, Lf90;->ζ:I

    .line 136
    .line 137
    if-gez v0, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0}, Lf90;->α()V

    .line 140
    .line 141
    .line 142
    :cond_4
    iget v0, p0, Lf90;->ζ:I

    .line 143
    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    iget-object v0, p0, Lf90;->η:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    const/4 v1, -0x1

    .line 152
    iput v1, p0, Lf90;->ζ:I

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    invoke-static {}, Lγ;->ο()V

    .line 156
    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    :goto_3
    return-object v0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, Lf90;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

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
    iget v0, p0, Lf90;->ζ:I

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, Lf90;->θ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Le21;

    .line 30
    .line 31
    iget-object v2, v2, Le21;->ζ:Lc21;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Lc21;->μ(I)V

    .line 34
    .line 35
    .line 36
    iput v1, p0, Lf90;->ζ:I

    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_2
    iget v0, p0, Lf90;->ζ:I

    .line 40
    .line 41
    const/4 v1, -0x1

    .line 42
    if-eq v0, v1, :cond_1

    .line 43
    .line 44
    iget-object v2, p0, Lf90;->θ:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ly11;

    .line 47
    .line 48
    iget-object v2, v2, Ly11;->ζ:Lw11;

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Lw11;->θ(I)V

    .line 51
    .line 52
    .line 53
    iput v1, p0, Lf90;->ζ:I

    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 57
    .line 58
    const-string v0, "Operation is not supported for read-only collection"

    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public α()V
    .locals 3

    .line 1
    iget v0, p0, Lf90;->ζ:I

    .line 2
    .line 3
    iget-object v1, p0, Lf90;->θ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcu;

    .line 6
    .line 7
    const/4 v2, -0x2

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v1, Lcu;->β:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lp70;

    .line 13
    .line 14
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v1, Lcu;->γ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La80;

    .line 22
    .line 23
    iget-object v1, p0, Lf90;->η:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    iput-object v0, p0, Lf90;->η:Ljava/lang/Object;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x1

    .line 39
    :goto_1
    iput v0, p0, Lf90;->ζ:I

    .line 40
    .line 41
    return-void
.end method
