.class public final L۟/g$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/g;->ۥ۟ۧ()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "L\u06df/p0;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/g;


# direct methods
.method public constructor <init>(L۟/g;)V
    .locals 0

    iput-object p1, p0, L۟/g$a;->ۥ:L۟/g;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, L۟/p0;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v1, v0, [B

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    fill-array-data v3, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, L۟/d0;

    .line 23
    .line 24
    iget-object v3, p0, L۟/g$a;->ۥ:L۟/g;

    .line 25
    .line 26
    iget-object v4, p1, L۟/p0;->ۥ:L۟/w3;

    .line 27
    .line 28
    invoke-static {v4}, L۟/e1;->ۥ۟۟(L۟/w3;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-array v0, v0, [L۟/p0;

    .line 36
    .line 37
    new-instance v3, L۟/j0;

    .line 38
    .line 39
    sget-object v5, L۟/lb;->ۥ۟:Ljava/lang/String;

    .line 40
    .line 41
    new-array v6, v2, [B

    .line 42
    .line 43
    fill-array-data v6, :array_2

    .line 44
    .line 45
    .line 46
    new-array v7, v2, [B

    .line 47
    .line 48
    fill-array-data v7, :array_3

    .line 49
    .line 50
    .line 51
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-direct {v3, v5, v6, v4}, L۟/j0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 56
    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    aput-object v3, v0, v5

    .line 60
    .line 61
    new-instance v3, L۟/j0;

    .line 62
    .line 63
    sget-object v5, L۟/lb;->ۥ۟۟:Ljava/lang/String;

    .line 64
    .line 65
    new-array v6, v2, [B

    .line 66
    .line 67
    fill-array-data v6, :array_4

    .line 68
    .line 69
    .line 70
    new-array v7, v2, [B

    .line 71
    .line 72
    fill-array-data v7, :array_5

    .line 73
    .line 74
    .line 75
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-direct {v3, v5, v6, v4}, L۟/j0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x1

    .line 83
    aput-object v3, v0, v4

    .line 84
    .line 85
    invoke-static {v0}, L۟/jb;->ۥ۟ۨ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v3, p0, L۟/g$a;->ۥ:L۟/g;

    .line 90
    .line 91
    iget-object v3, v3, L۟/ya;->ۥ:Landroid/content/Context;

    .line 92
    .line 93
    const/16 v4, 0x15

    .line 94
    .line 95
    new-array v4, v4, [B

    .line 96
    .line 97
    fill-array-data v4, :array_6

    .line 98
    .line 99
    .line 100
    new-array v2, v2, [B

    .line 101
    .line 102
    fill-array-data v2, :array_7

    .line 103
    .line 104
    .line 105
    invoke-static {v4, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-direct {v1, p1, v0, v3, v2}, L۟/d0;-><init>(L۟/p0;Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, L۟/g$a;->ۥ:L۟/g;

    .line 113
    .line 114
    iget-boolean p1, p1, L۟/ya;->ۥ۟ۡ:Z

    .line 115
    .line 116
    invoke-virtual {v1, p1}, L۟/ya;->ۥ۟ۤ(Z)V

    .line 117
    .line 118
    .line 119
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 120
    .line 121
    return-object p1

    .line 122
    nop

    .line 123
    :array_0
    .array-data 1
        -0x1t
        0x0t
    .end array-data

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    nop

    .line 129
    :array_1
    .array-data 1
        -0x6at
        0x74t
        0x1t
        0x6bt
        0x78t
        -0x74t
    .end array-data

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    nop

    .line 137
    :array_2
    .array-data 1
        -0x24t
        -0x58t
        -0x3et
        -0x28t
        -0x3ct
        0x30t
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    nop

    .line 145
    :array_3
    .array-data 1
        0x39t
        0x3dt
        0x44t
        0x3dt
        0x5bt
        -0x42t
    .end array-data

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    nop

    .line 153
    :array_4
    .array-data 1
        -0x25t
        0x7t
        -0x42t
        -0x70t
        -0x35t
        -0x66t
    .end array-data

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    nop

    .line 161
    :array_5
    .array-data 1
        0x3et
        -0x78t
        0x2ft
        0x75t
        0x73t
        0x19t
    .end array-data

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    nop

    .line 169
    :array_6
    .array-data 1
        0x50t
        0x72t
        0x68t
        -0x64t
        0x3t
        0x70t
        0x5ct
        0x65t
        0x56t
        -0x63t
        0x25t
        0x78t
        0x50t
        0x77t
        0x6dt
        -0x64t
        0x1at
        0x5dt
        0x52t
        0x63t
        0x52t
    .end array-data

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    nop

    .line 185
    :array_7
    .array-data 1
        -0x4bt
        -0x7t
        -0x2at
        0x75t
        -0x7dt
        -0x7t
    .end array-data
.end method
