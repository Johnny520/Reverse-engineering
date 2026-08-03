.class public final L۟/ac$e;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/ac;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/ac;

.field public final synthetic ۥ۟:Landroid/widget/Button;


# direct methods
.method public constructor <init>(L۟/ac;Landroid/widget/Button;)V
    .locals 0

    iput-object p1, p0, L۟/ac$e;->ۥ:L۟/ac;

    iput-object p2, p0, L۟/ac$e;->ۥ۟:Landroid/widget/Button;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, L۟/ac$e;->ۥ:L۟/ac;

    .line 2
    .line 3
    iget-boolean v1, v0, L۟/ac;->ۥۣۡ:Z

    .line 4
    .line 5
    xor-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    iput-boolean v1, v0, L۟/ac;->ۥۣۡ:Z

    .line 8
    .line 9
    invoke-virtual {v0}, L۟/ac;->ۥۣ۠()L۟/ac$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, L۟/ac$e;->ۥ:L۟/ac;

    .line 17
    .line 18
    iget-boolean v0, v0, L۟/ac;->ۥۣۡ:Z

    .line 19
    .line 20
    const/16 v1, 0xc

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, L۟/ac$e;->ۥ۟:Landroid/widget/Button;

    .line 26
    .line 27
    new-array v1, v1, [B

    .line 28
    .line 29
    fill-array-data v1, :array_0

    .line 30
    .line 31
    .line 32
    new-array v3, v2, [B

    .line 33
    .line 34
    fill-array-data v3, :array_1

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, L۟/ac$e;->ۥ:L۟/ac;

    .line 45
    .line 46
    iget-object v1, v0, L۟/gb;->ۥ۠ۦ:Landroid/widget/Button;

    .line 47
    .line 48
    new-array v3, v2, [B

    .line 49
    .line 50
    fill-array-data v3, :array_2

    .line 51
    .line 52
    .line 53
    new-array v2, v2, [B

    .line 54
    .line 55
    fill-array-data v2, :array_3

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, L۟/fc;

    .line 66
    .line 67
    invoke-direct {v1, v0}, L۟/fc;-><init>(L۟/ac;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, L۟/gb;->ۥ۠ۡ(L۟/f3;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, L۟/ac$e;->ۥ۟:Landroid/widget/Button;

    .line 75
    .line 76
    new-array v1, v1, [B

    .line 77
    .line 78
    fill-array-data v1, :array_4

    .line 79
    .line 80
    .line 81
    new-array v3, v2, [B

    .line 82
    .line 83
    fill-array-data v3, :array_5

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, L۟/ac$e;->ۥ:L۟/ac;

    .line 94
    .line 95
    iget-object v1, v0, L۟/gb;->ۥ۠ۦ:Landroid/widget/Button;

    .line 96
    .line 97
    new-array v3, v2, [B

    .line 98
    .line 99
    fill-array-data v3, :array_6

    .line 100
    .line 101
    .line 102
    new-array v2, v2, [B

    .line 103
    .line 104
    fill-array-data v2, :array_7

    .line 105
    .line 106
    .line 107
    invoke-static {v3, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    sget-object v1, L۟/k2;->ۥ۟:L۟/k2;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, L۟/gb;->ۥ۠ۡ(L۟/f3;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 120
    .line 121
    return-object v0

    .line 122
    nop

    .line 123
    :array_0
    .array-data 1
        0x16t
        0x78t
        -0x6ct
        -0x50t
        0x60t
        0x7et
        0x14t
        0x59t
        -0x5dt
        -0x4ft
        0x46t
        0x70t
    .end array-data

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    :array_1
    .array-data 1
        -0xdt
        -0x9t
        0x2t
        0x56t
        -0x2at
        -0xat
    .end array-data

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    nop

    .line 141
    :array_2
    .array-data 1
        -0x23t
        -0x6dt
        -0x63t
        -0x3t
        -0x17t
        -0x2et
    .end array-data

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    nop

    .line 149
    :array_3
    .array-data 1
        0x38t
        0x1bt
        0x3dt
        0x14t
        0x70t
        0x76t
    .end array-data

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    nop

    .line 157
    :array_4
    .array-data 1
        -0x18t
        -0x6et
        0x47t
        -0x76t
        0x38t
        -0x3ft
        -0x16t
        -0x68t
        0x7ct
        -0x7ct
        0x28t
        -0x32t
    .end array-data

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    :array_5
    .array-data 1
        0xdt
        0x36t
        -0x23t
        0x63t
        -0x48t
        0x48t
    .end array-data

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    nop

    .line 175
    :array_6
    .array-data 1
        -0x15t
        -0x21t
        -0x67t
        0x3t
        -0x52t
        0x37t
    .end array-data

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    nop

    .line 183
    :array_7
    .array-data 1
        0x3t
        0x60t
        0xdt
        -0x1at
        0x35t
        -0x57t
    .end array-data
.end method
