.class public final Lxhss/ᲇᲈᛸᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᲀᛵ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:Lxhss/ᛳᛱᛲᲀ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛳᛱᛲᲀ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲇᲈᛸᛱ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᲇᲈᛸᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛱᛲᲀ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 9

    .line 1
    iget v0, p0, Lxhss/ᲇᲈᛸᛱ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲇᲈᛸᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛱᛲᲀ;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Type;

    .line 14
    .line 15
    iget-object v6, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 16
    .line 17
    const-class v7, Ljava/util/Map;

    .line 18
    .line 19
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    if-nez v8, :cond_0

    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    const-class v3, Ljava/util/Properties;

    .line 27
    .line 28
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v8, 0x1

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    new-array v0, v4, [Ljava/lang/reflect/Type;

    .line 36
    .line 37
    const-class v2, Ljava/lang/String;

    .line 38
    .line 39
    aput-object v2, v0, v5

    .line 40
    .line 41
    aput-object v2, v0, v8

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v0, v6, v7}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛳᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 49
    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    new-array v0, v4, [Ljava/lang/reflect/Type;

    .line 60
    .line 61
    aput-object v2, v0, v5

    .line 62
    .line 63
    aput-object v2, v0, v8

    .line 64
    .line 65
    :goto_0
    aget-object v2, v0, v5

    .line 66
    .line 67
    aget-object v0, v0, v8

    .line 68
    .line 69
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    if-eq v2, v3, :cond_4

    .line 72
    .line 73
    const-class v3, Ljava/lang/Boolean;

    .line 74
    .line 75
    if-ne v2, v3, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    new-instance v3, Lxhss/ᛱᛳᲈᛷ;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v3}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    sget-object v3, Lxhss/ᛱᛸᛴᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛴᲈᲁᛱ;

    .line 89
    .line 90
    :goto_2
    new-instance v6, Lxhss/ᲈᛱᛲᛴ;

    .line 91
    .line 92
    invoke-direct {v6, p1, v3, v2, v4}, Lxhss/ᲈᛱᛲᛴ;-><init>(Ljava/lang/Object;Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    new-instance v2, Lxhss/ᛱᛳᲈᛷ;

    .line 96
    .line 97
    invoke-direct {v2, v0}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v2}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v3, Lxhss/ᲈᛱᛲᛴ;

    .line 105
    .line 106
    invoke-direct {v3, p1, v2, v0, v4}, Lxhss/ᲈᛱᛲᛴ;-><init>(Ljava/lang/Object;Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p2, v5}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛳᲈᛷ;Z)Lxhss/ᲁᲀᛶᛲ;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance p2, Lxhss/ᲈᛱᛲᛴ;

    .line 114
    .line 115
    invoke-direct {p2, p0, v6, v3, p1}, Lxhss/ᲈᛱᛲᛴ;-><init>(Lxhss/ᲇᲈᛸᛱ;Lxhss/ᲈᛱᛲᛴ;Lxhss/ᲈᛱᛲᛴ;Lxhss/ᲁᲀᛶᛲ;)V

    .line 116
    .line 117
    .line 118
    move-object v3, p2

    .line 119
    :goto_3
    return-object v3

    .line 120
    :pswitch_0
    iget-object p0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Type;

    .line 121
    .line 122
    iget-object v0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 123
    .line 124
    const-class v6, Ljava/util/Collection;

    .line 125
    .line 126
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-nez v7, :cond_5

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    invoke-static {p0, v0, v6}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛳᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 138
    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 142
    .line 143
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    aget-object v2, p0, v5

    .line 148
    .line 149
    :cond_6
    new-instance p0, Lxhss/ᛱᛳᲈᛷ;

    .line 150
    .line 151
    invoke-direct {p0, v2}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p0}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    new-instance v0, Lxhss/ᲈᛱᛲᛴ;

    .line 159
    .line 160
    invoke-direct {v0, p1, p0, v2, v4}, Lxhss/ᲈᛱᛲᛴ;-><init>(Ljava/lang/Object;Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Object;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, p2, v5}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᲈᛶ(Lxhss/ᛱᛳᲈᛷ;Z)Lxhss/ᲁᲀᛶᛲ;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    new-instance v3, Lxhss/ᛸᛴᛴᛳ;

    .line 168
    .line 169
    invoke-direct {v3, v0, p0, v5}, Lxhss/ᛸᛴᛴᛳ;-><init>(Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Object;I)V

    .line 170
    .line 171
    .line 172
    :goto_4
    return-object v3

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
