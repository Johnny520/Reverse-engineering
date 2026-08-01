.class public final Ljf;
.super Ldo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic η:I

.field public θ:Ljava/lang/Class;

.field public ι:[Ljava/lang/Object;

.field public κ:I

.field public λ:I

.field public μ:I

.field public ν:I

.field public synthetic ξ:Ljava/lang/Object;

.field public final synthetic ο:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Lop;I)V
    .locals 0

    .line 1
    iput p3, p0, Ljf;->η:I

    .line 2
    .line 3
    iput-object p1, p0, Ljf;->ο:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ldo1;-><init>(Lop;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ljf;->η:I

    .line 2
    .line 3
    check-cast p1, Lts1;

    .line 4
    .line 5
    check-cast p2, Lop;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Ljf;->η(Lop;Ljava/lang/Object;)Lop;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljf;

    .line 15
    .line 16
    sget-object p1, Ls62;->α:Ls62;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljf;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ljf;->η(Lop;Ljava/lang/Object;)Lop;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljf;

    .line 28
    .line 29
    sget-object p1, Ls62;->α:Ls62;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljf;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 2

    .line 1
    iget v0, p0, Ljf;->η:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljf;

    .line 7
    .line 8
    iget-object p0, p0, Ljf;->ο:Ljava/lang/Class;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, Ljf;-><init>(Ljava/lang/Class;Lop;I)V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, Ljf;->ξ:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Ljf;

    .line 18
    .line 19
    iget-object p0, p0, Ljf;->ο:Ljava/lang/Class;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p1, v1}, Ljf;-><init>(Ljava/lang/Class;Lop;I)V

    .line 23
    .line 24
    .line 25
    iput-object p2, v0, Ljf;->ξ:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ljf;->η:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljf;->ξ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lts1;

    .line 9
    .line 10
    iget v1, p0, Ljf;->ν:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget v1, p0, Ljf;->μ:I

    .line 18
    .line 19
    iget v3, p0, Ljf;->λ:I

    .line 20
    .line 21
    iget v4, p0, Ljf;->κ:I

    .line 22
    .line 23
    iget-object v5, p0, Ljf;->ι:[Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v6, p0, Ljf;->θ:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    add-int/2addr v3, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Ljf;->ο:Ljava/lang/Class;

    .line 43
    .line 44
    move-object v6, p1

    .line 45
    :goto_0
    if-eqz v6, :cond_3

    .line 46
    .line 47
    const-class p1, Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    array-length v1, v5

    .line 63
    const/4 v4, 0x0

    .line 64
    move v3, v4

    .line 65
    :goto_1
    if-ge v3, v1, :cond_2

    .line 66
    .line 67
    aget-object p1, v5, v3

    .line 68
    .line 69
    check-cast p1, Ljava/lang/reflect/Field;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Ljf;->ξ:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v6, p0, Ljf;->θ:Ljava/lang/Class;

    .line 77
    .line 78
    iput-object v5, p0, Ljf;->ι:[Ljava/lang/Object;

    .line 79
    .line 80
    iput v4, p0, Ljf;->κ:I

    .line 81
    .line 82
    iput v3, p0, Ljf;->λ:I

    .line 83
    .line 84
    iput v1, p0, Ljf;->μ:I

    .line 85
    .line 86
    iput v2, p0, Ljf;->ν:I

    .line 87
    .line 88
    invoke-virtual {v0, p0, p1}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lcq;->ε:Lcq;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    goto :goto_0

    .line 99
    :cond_3
    sget-object p0, Ls62;->α:Ls62;

    .line 100
    .line 101
    :goto_2
    return-object p0

    .line 102
    :pswitch_0
    iget-object v0, p0, Ljf;->ξ:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Lts1;

    .line 105
    .line 106
    iget v1, p0, Ljf;->ν:I

    .line 107
    .line 108
    const/4 v2, 0x1

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    if-ne v1, v2, :cond_4

    .line 112
    .line 113
    iget v1, p0, Ljf;->μ:I

    .line 114
    .line 115
    iget v3, p0, Ljf;->λ:I

    .line 116
    .line 117
    iget v4, p0, Ljf;->κ:I

    .line 118
    .line 119
    iget-object v5, p0, Ljf;->ι:[Ljava/lang/Object;

    .line 120
    .line 121
    iget-object v6, p0, Ljf;->θ:Ljava/lang/Class;

    .line 122
    .line 123
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    add-int/2addr v3, v2

    .line 127
    goto :goto_4

    .line 128
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 129
    .line 130
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/4 p0, 0x0

    .line 134
    goto :goto_5

    .line 135
    :cond_5
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Ljf;->ο:Ljava/lang/Class;

    .line 139
    .line 140
    move-object v6, p1

    .line 141
    :goto_3
    if-eqz v6, :cond_7

    .line 142
    .line 143
    const-class p1, Ljava/lang/Object;

    .line 144
    .line 145
    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-nez p1, :cond_7

    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    array-length v1, v5

    .line 159
    const/4 v4, 0x0

    .line 160
    move v3, v4

    .line 161
    :goto_4
    if-ge v3, v1, :cond_6

    .line 162
    .line 163
    aget-object p1, v5, v3

    .line 164
    .line 165
    check-cast p1, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iput-object v0, p0, Ljf;->ξ:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v6, p0, Ljf;->θ:Ljava/lang/Class;

    .line 173
    .line 174
    iput-object v5, p0, Ljf;->ι:[Ljava/lang/Object;

    .line 175
    .line 176
    iput v4, p0, Ljf;->κ:I

    .line 177
    .line 178
    iput v3, p0, Ljf;->λ:I

    .line 179
    .line 180
    iput v1, p0, Ljf;->μ:I

    .line 181
    .line 182
    iput v2, p0, Ljf;->ν:I

    .line 183
    .line 184
    invoke-virtual {v0, p0, p1}, Lts1;->β(Lop;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object p0, Lcq;->ε:Lcq;

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_6
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    goto :goto_3

    .line 195
    :cond_7
    sget-object p0, Ls62;->α:Ls62;

    .line 196
    .line 197
    :goto_5
    return-object p0

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
