.class public final L۟/z1$c;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/z1;->ۥ(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/z1;


# direct methods
.method public constructor <init>(L۟/z1;)V
    .locals 0

    iput-object p1, p0, L۟/z1$c;->ۥ:L۟/z1;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x2

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
    const/16 v0, 0x1c

    .line 23
    .line 24
    new-array v0, v0, [B

    .line 25
    .line 26
    fill-array-data v0, :array_2

    .line 27
    .line 28
    .line 29
    new-array v2, v1, [B

    .line 30
    .line 31
    fill-array-data v2, :array_3

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/16 v2, 0x15

    .line 39
    .line 40
    new-array v2, v2, [B

    .line 41
    .line 42
    fill-array-data v2, :array_4

    .line 43
    .line 44
    .line 45
    new-array v1, v1, [B

    .line 46
    .line 47
    fill-array-data v1, :array_5

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v0, v1}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 59
    .line 60
    instance-of v1, p1, Landroid/view/View;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    check-cast p1, Landroid/view/View;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move-object p1, v2

    .line 69
    :goto_0
    if-eqz p1, :cond_6

    .line 70
    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Landroid/widget/LinearLayout;

    .line 83
    .line 84
    if-nez p1, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    instance-of v1, v0, Landroid/widget/LinearLayout;

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    move-object v2, v0

    .line 96
    check-cast v2, Landroid/widget/LinearLayout;

    .line 97
    .line 98
    :cond_3
    if-nez v2, :cond_4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    sget-object v0, L۟/z1;->ۥ۟:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {}, L۟/z1$a;->ۥ()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    new-instance v0, Landroid/widget/LinearLayout;

    .line 119
    .line 120
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, L۟/z1$c;->ۥ:L۟/z1;

    .line 128
    .line 129
    invoke-static {}, L۟/z1$a;->ۥ()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    invoke-virtual {v0, v3}, Landroid/view/View;->setId(I)V

    .line 134
    .line 135
    .line 136
    const/4 v3, 0x1

    .line 137
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v1}, L۟/z1;->ۥ۟۟(Landroid/widget/LinearLayout;L۟/z1;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_1
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 147
    .line 148
    return-object p1

    .line 149
    :array_0
    .array-data 1
        0x20t
        0x7ft
    .end array-data

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    nop

    .line 155
    :array_1
    .array-data 1
        0x49t
        0xbt
        -0x7at
        0x5ct
        -0x49t
        0x70t
    .end array-data

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    nop

    .line 163
    :array_2
    .array-data 1
        -0xft
        -0x43t
        0x5at
        0x51t
        0x43t
        -0x2ct
        -0x4t
        -0x4bt
        0x5et
        0x11t
        0x15t
        -0x3bt
        -0x6t
        -0x5ft
        0x19t
        0x17t
        0x54t
        -0x30t
        -0x9t
        -0x5et
        0x56t
        0x18t
        0x5et
        -0x6dt
        -0x40t
        -0xat
        0x5et
        0x1bt
    .end array-data

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
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
    :array_3
    .array-data 1
        -0x6et
        -0x2et
        0x37t
        0x7ft
        0x3bt
        -0x43t
    .end array-data

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    nop

    .line 189
    :array_4
    .array-data 1
        0x8t
        -0x13t
        -0x3t
        -0x1at
        -0xct
        0x26t
        0x12t
        -0x1bt
        -0x1ct
        -0x1ft
        -0x34t
        0x25t
        0x9t
        -0x8t
        -0x1t
        -0x20t
        -0x2t
        0x18t
        0x4t
        -0x13t
        -0x7t
    .end array-data

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    nop

    .line 205
    :array_5
    .array-data 1
        0x66t
        -0x74t
        -0x75t
        -0x71t
        -0x6dt
        0x47t
    .end array-data
.end method
