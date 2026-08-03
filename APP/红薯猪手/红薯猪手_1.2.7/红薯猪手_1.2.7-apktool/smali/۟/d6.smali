.class public final L۟/d6;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/d6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/d6;

    invoke-direct {v0}, L۟/d6;-><init>()V

    sput-object v0, L۟/d6;->ۥ:L۟/d6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method

.method public static ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/16 v1, 0xa

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v2, v0, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v1, L۟/k8;->ۥۣ۟:L۟/k;

    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    move-result-object v1

    iget-object v1, v1, L۟/k;->ۥۦۢ:Ljava/lang/String;

    invoke-static {p0, v1}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x3

    if-eqz p0, :cond_0

    new-array v2, v1, [B

    fill-array-data v2, :array_4

    new-array v3, v0, [B

    fill-array-data v3, :array_5

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    :cond_0
    const-string v2, ""

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-lez v3, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_5

    if-eqz p0, :cond_3

    const/4 v3, 0x4

    new-array v3, v3, [B

    fill-array-data v3, :array_6

    new-array v5, v0, [B

    fill-array-data v5, :array_7

    invoke-static {v3, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_3
    const/4 p0, 0x2

    if-ne v4, p0, :cond_4

    new-array p0, v1, [B

    fill-array-data p0, :array_8

    new-array v0, v0, [B

    fill-array-data v0, :array_9

    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_4
    new-array p0, v1, [B

    fill-array-data p0, :array_a

    new-array v0, v0, [B

    fill-array-data v0, :array_b

    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p0

    :goto_1
    sget-object v0, L۟/w1;->ۥ:Ljava/lang/String;

    invoke-static {v2}, L۟/jb;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0}, L۟/w1;->ۥ۟(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_2

    :cond_5
    sget p0, L۟/o;->ۥ:I

    const/16 p0, 0x18

    new-array p0, p0, [B

    fill-array-data p0, :array_c

    new-array v0, v0, [B

    fill-array-data v0, :array_d

    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, L۟/o;->ۥ۠(Ljava/lang/String;)V

    :goto_2
    return-void

    nop

    :array_0
    .array-data 1
        0x6bt
        0x8t
        0x32t
        -0x75t
        0x6ct
        -0xet
    .end array-data

    nop

    :array_1
    .array-data 1
        0x4ft
        0x78t
        0x53t
        -0x7t
        0xdt
        -0x61t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x12t
        -0x6ct
        0x32t
        0x79t
        -0x24t
        -0x2et
        -0x10t
        -0x67t
        0x38t
        0x7et
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x66t
        -0x4t
        0x5bt
        0xat
        -0x6dt
        -0x50t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x43t
        0x7at
        -0x77t
    .end array-data

    :array_5
    .array-data 1
        0x36t
        0x8t
        -0x1bt
        0x13t
        0x3at
        -0x50t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x74t
        -0x1dt
        0x31t
        0x50t
    .end array-data

    :array_7
    .array-data 1
        0x0t
        -0x66t
        0x41t
        0x35t
        -0x36t
        -0x3ct
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x62t
        -0x33t
        -0x3ft
    .end array-data

    :array_9
    .array-data 1
        -0xdt
        -0x43t
        -0xbt
        -0x60t
        -0x28t
        -0x4at
    .end array-data

    nop

    :array_a
    .array-data 1
        -0x29t
        -0x7ct
        0x5ft
    .end array-data

    :array_b
    .array-data 1
        -0x43t
        -0xct
        0x38t
        0x31t
        0x76t
        -0xbt
    .end array-data

    nop

    :array_c
    .array-data 1
        0x34t
        -0x18t
        0x62t
        -0x49t
        -0x1bt
        -0x7t
        0x3bt
        -0x8t
        0x79t
        -0x45t
        -0x3t
        -0x25t
        0x35t
        -0xbt
        0x6bt
        -0x4ct
        -0x1ct
        -0x36t
        0x39t
        -0x3et
        0x64t
        -0x46t
        -0x22t
        -0x36t
    .end array-data

    :array_d
    .array-data 1
        -0x24t
        0x66t
        -0x2bt
        0x52t
        0x6at
        0x6ft
    .end array-data
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    const/16 v2, 0xa

    .line 25
    .line 26
    new-array v2, v2, [B

    .line 27
    .line 28
    fill-array-data v2, :array_2

    .line 29
    .line 30
    .line 31
    new-array v3, v1, [B

    .line 32
    .line 33
    fill-array-data v3, :array_3

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, L۟/k8;->ۥۣ۟:L۟/k;

    .line 44
    .line 45
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v2, v2, L۟/k;->ۥۦۣ:Ljava/lang/String;

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    new-array v3, v3, [Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iget-object v4, v4, L۟/k;->ۥ۟۠:Ljava/lang/String;

    .line 59
    .line 60
    const/16 v5, 0x9

    .line 61
    .line 62
    new-array v5, v5, [B

    .line 63
    .line 64
    fill-array-data v5, :array_4

    .line 65
    .line 66
    .line 67
    new-array v6, v1, [B

    .line 68
    .line 69
    fill-array-data v6, :array_5

    .line 70
    .line 71
    .line 72
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v5, v4}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const/16 v5, 0x18

    .line 80
    .line 81
    new-array v5, v5, [B

    .line 82
    .line 83
    fill-array-data v5, :array_6

    .line 84
    .line 85
    .line 86
    new-array v1, v1, [B

    .line 87
    .line 88
    fill-array-data v1, :array_7

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v4, v1}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const/4 v4, 0x0

    .line 100
    aput-object v1, v3, v4

    .line 101
    .line 102
    invoke-static {v0, v2, v3}, L۟/r3;->ۥ۟(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Landroid/view/View;

    .line 107
    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    new-instance v1, L۟/c6;

    .line 111
    .line 112
    invoke-direct {v1, p1}, L۟/c6;-><init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 119
    .line 120
    return-object p1

    .line 121
    :array_0
    .array-data 1
        -0x6dt
        -0x59t
        -0x1et
        -0x5bt
        -0x2ft
    .end array-data

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    nop

    .line 129
    :array_1
    .array-data 1
        -0x1dt
        -0x3at
        -0x70t
        -0x3ct
        -0x44t
        0x36t
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
        0x9t
        -0x5et
        0x33t
        0x6bt
        0x3t
        -0x54t
        0x17t
        -0x51t
        0x39t
        0x6ct
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    nop

    .line 147
    :array_3
    .array-data 1
        0x7dt
        -0x36t
        0x5at
        0x18t
        0x4ct
        -0x32t
    .end array-data

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    nop

    .line 155
    :array_4
    .array-data 1
        -0x74t
        -0x6ct
        -0x29t
        0x54t
        0x6et
        0x52t
        -0x79t
        -0x63t
        -0x23t
    .end array-data

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    nop

    .line 165
    :array_5
    .array-data 1
        -0x3ct
        -0xft
        -0x52t
        0x6t
        0x27t
        0x36t
    .end array-data

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    nop

    .line 173
    :array_6
    .array-data 1
        0x7ft
        -0x35t
        -0x71t
        0x22t
        -0x69t
        -0xdt
        0x76t
        -0x39t
        -0x66t
        0x25t
        -0x62t
        -0x12t
        0x74t
        -0x3bt
        -0x5bt
        0x11t
        -0x65t
        -0xdt
        0x74t
        -0x3at
        -0x60t
        0xft
        -0x69t
        -0x10t
    .end array-data

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
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    :array_7
    .array-data 1
        0x17t
        -0x52t
        -0xat
        0x66t
        -0xet
        -0x79t
    .end array-data
.end method
