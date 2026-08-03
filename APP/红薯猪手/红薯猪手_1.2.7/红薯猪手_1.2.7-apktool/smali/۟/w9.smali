.class public final L۟/w9;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/b2;


# direct methods
.method public constructor <init>(L۟/b2;)V
    .locals 0

    iput-object p1, p0, L۟/w9;->ۥ:L۟/b2;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, L۟/w9;->ۥ:L۟/b2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [B

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/16 v3, 0x34

    .line 8
    .line 9
    aput-byte v3, v1, v2

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    new-array v3, v2, [B

    .line 13
    .line 14
    fill-array-data v3, :array_0

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    new-array v3, v3, [B

    .line 26
    .line 27
    fill-array-data v3, :array_1

    .line 28
    .line 29
    .line 30
    new-array v4, v2, [B

    .line 31
    .line 32
    fill-array-data v4, :array_2

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    iget-object v3, v0, L۟/b2;->ۥۣۡ:Landroid/widget/EditText;

    .line 39
    .line 40
    const/16 v4, 0x9

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v7, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, L۟/b2;->ۥۣۡ:Landroid/widget/EditText;

    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_0
    new-array v0, v4, [B

    .line 86
    .line 87
    fill-array-data v0, :array_3

    .line 88
    .line 89
    .line 90
    new-array v1, v2, [B

    .line 91
    .line 92
    fill-array-data v1, :array_4

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v5

    .line 103
    :cond_1
    new-array v0, v4, [B

    .line 104
    .line 105
    fill-array-data v0, :array_5

    .line 106
    .line 107
    .line 108
    new-array v1, v2, [B

    .line 109
    .line 110
    fill-array-data v1, :array_6

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v5

    .line 121
    :array_0
    .array-data 1
        0x48t
        0x4t
        0x6t
        -0x2ft
        0x2t
        0x22t
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
        0x5at
        -0xdt
        -0x3ft
        -0x1at
    .end array-data

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    :array_2
    .array-data 1
        0x2et
        -0x6at
        -0x47t
        -0x6et
        0x3at
        0x67t
    .end array-data

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    nop

    .line 143
    :array_3
    .array-data 1
        -0x17t
        0x15t
        -0x27t
        0x2at
        0x54t
        -0x3ft
        -0x1ft
        0x28t
        -0x37t
    .end array-data

    .line 144
    .line 145
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
        -0x7ct
        0x50t
        -0x43t
        0x43t
        0x20t
        -0x6bt
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
        0x1at
        0x3ct
        -0x3bt
        0x68t
        0x1et
        0x78t
        0x12t
        0x1t
        -0x2bt
    .end array-data

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    nop

    .line 171
    :array_6
    .array-data 1
        0x77t
        0x79t
        -0x5ft
        0x1t
        0x6at
        0x2ct
    .end array-data
.end method
