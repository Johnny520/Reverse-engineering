.class public final Lhh/k;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic i:Lhh/l;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lhh/l;II)V
    .locals 0

    .line 1
    iput p4, p0, Lhh/k;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhh/k;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput-object p2, p0, Lhh/k;->i:Lhh/l;

    .line 6
    .line 7
    iput p3, p0, Lhh/k;->j:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lhh/k;->g:I

    .line 2
    .line 3
    iget v1, p0, Lhh/k;->j:I

    .line 4
    .line 5
    iget-object v2, p0, Lhh/k;->i:Lhh/l;

    .line 6
    .line 7
    iget-object v3, p0, Lhh/k;->h:Lorg/luckypray/dexkit/DexKitBridge;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, v2, Lhh/l;->k:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lf1/n0;->k(II)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    new-array v2, v5, [J

    .line 21
    .line 22
    aput-wide v0, v2, v4

    .line 23
    .line 24
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 25
    .line 26
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-static {v0, v5, v6, v2}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Ljh/a;

    .line 42
    .line 43
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 47
    .line 48
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-int/2addr v5, v2

    .line 57
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lhh/j;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljh/a;->l()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :goto_0
    if-ge v4, v2, :cond_0

    .line 70
    .line 71
    invoke-virtual {v1, v4}, Ljh/a;->i(I)Ljh/d;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v3, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {v0}, Lhh/e;->first()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lhh/i;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_0
    iget v0, v2, Lhh/l;->h:I

    .line 96
    .line 97
    invoke-static {v1, v0}, Lf1/n0;->k(II)J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    new-array v2, v5, [J

    .line 102
    .line 103
    aput-wide v0, v2, v4

    .line 104
    .line 105
    sget-object v0, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lbh/a;

    .line 106
    .line 107
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->access$getSafeToken(Lorg/luckypray/dexkit/DexKitBridge;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    invoke-static {v0, v5, v6, v2}, Lbh/a;->a(Lbh/a;J[J)[B

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v1, Ljh/a;

    .line 123
    .line 124
    invoke-direct {v1}, Lg6/c;-><init>()V

    .line 125
    .line 126
    .line 127
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 128
    .line 129
    invoke-static {v0, v2}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    add-int/2addr v5, v2

    .line 138
    invoke-virtual {v1, v5, v0}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lhh/j;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljh/a;->l()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    :goto_1
    if-ge v4, v2, :cond_1

    .line 151
    .line 152
    invoke-virtual {v1, v4}, Ljh/a;->i(I)Ljh/d;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v3, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    add-int/lit8 v4, v4, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_1
    invoke-virtual {v0}, Lhh/e;->first()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lhh/i;

    .line 174
    .line 175
    return-object v0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
