.class public final Lk6/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lh6/o;


# instance fields
.field public final synthetic g:I

.field public final h:Lh0/q0;


# direct methods
.method public synthetic constructor <init>(Lh0/q0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk6/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk6/d;->h:Lh0/q0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lh6/f;Ln6/a;)Lh6/n;
    .locals 9

    .line 1
    iget v0, p0, Lk6/d;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lk6/d;->h:Lh0/q0;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p2, Ln6/a;->b:Ljava/lang/reflect/Type;

    .line 13
    .line 14
    iget-object v5, p2, Ln6/a;->a:Ljava/lang/Class;

    .line 15
    .line 16
    const-class v6, Ljava/util/Map;

    .line 17
    .line 18
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-nez v7, :cond_0

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    const-class v3, Ljava/util/Properties;

    .line 26
    .line 27
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v7, 0x2

    .line 32
    const/4 v8, 0x1

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    new-array v0, v7, [Ljava/lang/reflect/Type;

    .line 36
    .line 37
    const-class v2, Ljava/lang/String;

    .line 38
    .line 39
    aput-object v2, v0, v4

    .line 40
    .line 41
    aput-object v2, v0, v8

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v0, v5, v6}, Lj6/h;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

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
    new-array v0, v7, [Ljava/lang/reflect/Type;

    .line 60
    .line 61
    aput-object v2, v0, v4

    .line 62
    .line 63
    aput-object v2, v0, v8

    .line 64
    .line 65
    :goto_0
    aget-object v2, v0, v4

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
    new-instance v3, Ln6/a;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v3}, Lh6/f;->b(Ln6/a;)Lh6/n;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    sget-object v3, Lk6/c1;->c:Lk6/w0;

    .line 89
    .line 90
    :goto_2
    new-instance v5, Lk6/y;

    .line 91
    .line 92
    invoke-direct {v5, p1, v3, v2}, Lk6/y;-><init>(Lh6/f;Lh6/n;Ljava/lang/reflect/Type;)V

    .line 93
    .line 94
    .line 95
    new-instance v2, Ln6/a;

    .line 96
    .line 97
    invoke-direct {v2, v0}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v2}, Lh6/f;->b(Ln6/a;)Lh6/n;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v3, Lk6/y;

    .line 105
    .line 106
    invoke-direct {v3, p1, v2, v0}, Lk6/y;-><init>(Lh6/f;Lh6/n;Ljava/lang/reflect/Type;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p2, v4}, Lh0/q0;->c(Ln6/a;Z)Lj6/o;

    .line 110
    .line 111
    .line 112
    new-instance p1, Lk6/c;

    .line 113
    .line 114
    invoke-direct {p1, p0, v5, v3}, Lk6/c;-><init>(Lk6/d;Lk6/y;Lk6/y;)V

    .line 115
    .line 116
    .line 117
    move-object v3, p1

    .line 118
    :goto_3
    return-object v3

    .line 119
    :pswitch_0
    iget-object v0, p2, Ln6/a;->b:Ljava/lang/reflect/Type;

    .line 120
    .line 121
    iget-object v5, p2, Ln6/a;->a:Ljava/lang/Class;

    .line 122
    .line 123
    const-class v6, Ljava/util/Collection;

    .line 124
    .line 125
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-nez v7, :cond_5

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_5
    invoke-static {v0, v5, v6}, Lj6/h;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 137
    .line 138
    if-eqz v3, :cond_6

    .line 139
    .line 140
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    aget-object v2, v0, v4

    .line 147
    .line 148
    :cond_6
    new-instance v0, Ln6/a;

    .line 149
    .line 150
    invoke-direct {v0, v2}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v0}, Lh6/f;->b(Ln6/a;)Lh6/n;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    new-instance v3, Lk6/y;

    .line 158
    .line 159
    invoke-direct {v3, p1, v0, v2}, Lk6/y;-><init>(Lh6/f;Lh6/n;Ljava/lang/reflect/Type;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, p2, v4}, Lh0/q0;->c(Ln6/a;Z)Lj6/o;

    .line 163
    .line 164
    .line 165
    new-instance p1, Lk6/c;

    .line 166
    .line 167
    invoke-direct {p1, v3}, Lk6/c;-><init>(Lk6/y;)V

    .line 168
    .line 169
    .line 170
    move-object v3, p1

    .line 171
    :goto_4
    return-object v3

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
