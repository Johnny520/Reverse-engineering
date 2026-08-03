.class public final Lv1/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final b:Lv1/l;

.field public final c:Lv1/l;

.field public final d:Lv1/l;

.field public final e:Lv1/l;

.field public final f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lv1/m;->a:I

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 162
    new-instance p1, Lv1/l;

    const/4 v1, 0x0

    .line 163
    invoke-direct {p1, v0, v1}, Lv1/l;-><init>(ILfg/p;)V

    .line 164
    iput-object p1, p0, Lv1/m;->b:Lv1/l;

    .line 165
    new-instance p1, Lv1/l;

    const/4 v0, 0x0

    .line 166
    invoke-direct {p1, v0, v1}, Lv1/l;-><init>(ILfg/p;)V

    .line 167
    iput-object p1, p0, Lv1/m;->c:Lv1/l;

    .line 168
    new-instance p1, Lv1/l;

    const/4 v0, 0x1

    .line 169
    invoke-direct {p1, v0, v1}, Lv1/l;-><init>(ILfg/p;)V

    .line 170
    iput-object p1, p0, Lv1/m;->d:Lv1/l;

    .line 171
    new-instance p1, Lv1/l;

    const/4 v0, 0x0

    .line 172
    invoke-direct {p1, v0, v1}, Lv1/l;-><init>(ILfg/p;)V

    .line 173
    iput-object p1, p0, Lv1/m;->e:Lv1/l;

    return-void
.end method

.method public constructor <init>([Lv1/m;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lv1/m;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 8
    .line 9
    array-length p1, p1

    .line 10
    new-array v0, p1, [Lv1/l;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, p1, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 17
    .line 18
    check-cast v3, [Lv1/m;

    .line 19
    .line 20
    aget-object v3, v3, v2

    .line 21
    .line 22
    invoke-virtual {v3}, Lv1/m;->b()Lv1/l;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    aput-object v3, v0, v2

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Lv1/m1;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {p1, v0, v2}, Lv1/m1;-><init>([Lv1/l;I)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lv1/l;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {v0, v2, p1}, Lv1/l;-><init>(ILfg/p;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lv1/m;->b:Lv1/l;

    .line 44
    .line 45
    iget-object p1, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 46
    .line 47
    check-cast p1, [Lv1/m;

    .line 48
    .line 49
    array-length p1, p1

    .line 50
    new-array v0, p1, [Lv1/l;

    .line 51
    .line 52
    move v2, v1

    .line 53
    :goto_1
    if-ge v2, p1, :cond_1

    .line 54
    .line 55
    iget-object v3, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 56
    .line 57
    check-cast v3, [Lv1/m;

    .line 58
    .line 59
    aget-object v3, v3, v2

    .line 60
    .line 61
    invoke-virtual {v3}, Lv1/m;->d()Lv1/l;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    aput-object v3, v0, v2

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    new-instance p1, Lv1/l;

    .line 71
    .line 72
    new-instance v2, Lv1/k;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-direct {v2, v0, v3}, Lv1/k;-><init>([Lv1/l;I)V

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-direct {p1, v0, v2}, Lv1/l;-><init>(ILfg/p;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lv1/m;->c:Lv1/l;

    .line 83
    .line 84
    iget-object p1, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 85
    .line 86
    check-cast p1, [Lv1/m;

    .line 87
    .line 88
    array-length p1, p1

    .line 89
    new-array v0, p1, [Lv1/l;

    .line 90
    .line 91
    move v2, v1

    .line 92
    :goto_2
    if-ge v2, p1, :cond_2

    .line 93
    .line 94
    iget-object v3, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 95
    .line 96
    check-cast v3, [Lv1/m;

    .line 97
    .line 98
    aget-object v3, v3, v2

    .line 99
    .line 100
    invoke-virtual {v3}, Lv1/m;->c()Lv1/l;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    aput-object v3, v0, v2

    .line 105
    .line 106
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    new-instance p1, Lv1/m1;

    .line 110
    .line 111
    const/4 v2, 0x1

    .line 112
    invoke-direct {p1, v0, v2}, Lv1/m1;-><init>([Lv1/l;I)V

    .line 113
    .line 114
    .line 115
    new-instance v0, Lv1/l;

    .line 116
    .line 117
    invoke-direct {v0, v2, p1}, Lv1/l;-><init>(ILfg/p;)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, Lv1/m;->d:Lv1/l;

    .line 121
    .line 122
    iget-object p1, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 123
    .line 124
    check-cast p1, [Lv1/m;

    .line 125
    .line 126
    array-length p1, p1

    .line 127
    new-array v0, p1, [Lv1/l;

    .line 128
    .line 129
    :goto_3
    if-ge v1, p1, :cond_3

    .line 130
    .line 131
    iget-object v2, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 132
    .line 133
    check-cast v2, [Lv1/m;

    .line 134
    .line 135
    aget-object v2, v2, v1

    .line 136
    .line 137
    invoke-virtual {v2}, Lv1/m;->a()Lv1/l;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    aput-object v2, v0, v1

    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    new-instance p1, Lv1/l;

    .line 147
    .line 148
    new-instance v1, Lv1/k;

    .line 149
    .line 150
    const/4 v2, 0x1

    .line 151
    invoke-direct {v1, v0, v2}, Lv1/k;-><init>([Lv1/l;I)V

    .line 152
    .line 153
    .line 154
    const/4 v0, 0x0

    .line 155
    invoke-direct {p1, v0, v1}, Lv1/l;-><init>(ILfg/p;)V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, Lv1/m;->e:Lv1/l;

    .line 159
    .line 160
    return-void
.end method


# virtual methods
.method public final a()Lv1/l;
    .locals 1

    .line 1
    iget v0, p0, Lv1/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/m;->e:Lv1/l;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lv1/m;->e:Lv1/l;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Lv1/l;
    .locals 1

    .line 1
    iget v0, p0, Lv1/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/m;->b:Lv1/l;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lv1/m;->b:Lv1/l;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Lv1/l;
    .locals 1

    .line 1
    iget v0, p0, Lv1/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/m;->d:Lv1/l;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lv1/m;->d:Lv1/l;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lv1/l;
    .locals 1

    .line 1
    iget v0, p0, Lv1/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/m;->c:Lv1/l;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lv1/m;->c:Lv1/l;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lv1/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "RectRulers("

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x29

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Lv1/m;->f:Ljava/io/Serializable;

    .line 31
    .line 32
    check-cast v0, [Lv1/m;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/16 v2, 0x39

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
