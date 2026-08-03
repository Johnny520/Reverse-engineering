.class public final L۟/w6;
.super L۟/gb;
.source "SourceFile"


# instance fields
.field public final ۥۡ۠:Ljava/lang/CharSequence;

.field public ۥۡۡ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v1, v1, [B

    fill-array-data v1, :array_5

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-direct {p0, p1, p2}, L۟/gb;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object p3, p0, L۟/w6;->ۥۡ۠:Ljava/lang/CharSequence;

    return-void

    nop

    :array_0
    .array-data 1
        -0x5ct
        -0x10t
        0x4bt
    .end array-data

    :array_1
    .array-data 1
        -0x39t
        -0x78t
        0x3ft
        -0x23t
        -0x16t
        -0x15t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x7at
        -0xct
        -0x7bt
        -0x66t
        0x7t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0xet
        -0x63t
        -0xft
        -0xat
        0x62t
        -0x34t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x2at
        0x0t
        -0x1at
        0x37t
    .end array-data

    :array_5
    .array-data 1
        0x49t
        0x6ft
        -0x78t
        0x43t
        -0x1bt
        0x75t
    .end array-data
.end method


# virtual methods
.method public final ۥ۟ۦ()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    const/high16 v1, 0x41800000    # 16.0f

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 11
    .line 12
    .line 13
    const v1, -0xbbbbbc

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, L۟/w6;->ۥۡ۠:Ljava/lang/CharSequence;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const v2, 0x3f8ccccd    # 1.1f

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 29
    .line 30
    .line 31
    sget v1, L۟/ya;->ۥ۟ۥ:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 35
    .line 36
    .line 37
    sget v1, L۟/o;->ۥ:I

    .line 38
    .line 39
    invoke-static {v0}, L۟/o;->ۥ۟ۧ(Landroid/widget/TextView;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x7

    .line 43
    new-array v1, v1, [B

    .line 44
    .line 45
    fill-array-data v1, :array_0

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x6

    .line 49
    new-array v4, v3, [B

    .line 50
    .line 51
    fill-array-data v4, :array_1

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, L۟/w6;->ۥۡۡ:Landroid/widget/TextView;

    .line 58
    .line 59
    new-instance v0, Landroid/widget/ScrollView;

    .line 60
    .line 61
    iget-object v1, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 62
    .line 63
    invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 67
    .line 68
    const/4 v4, -0x2

    .line 69
    invoke-direct {v1, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 70
    .line 71
    .line 72
    const/high16 v5, 0x3f800000    # 1.0f

    .line 73
    .line 74
    iput v5, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Landroid/widget/LinearLayout;

    .line 80
    .line 81
    iget-object v5, p0, L۟/ya;->ۥ:Landroid/content/Context;

    .line 82
    .line 83
    invoke-direct {v1, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 87
    .line 88
    invoke-direct {v5, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    .line 93
    .line 94
    const/4 v4, 0x1

    .line 95
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 96
    .line 97
    .line 98
    iget-object v5, p0, L۟/w6;->ۥۡۡ:Landroid/widget/TextView;

    .line 99
    .line 100
    if-eqz v5, :cond_0

    .line 101
    .line 102
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    new-array v1, v4, [Landroid/widget/ScrollView;

    .line 109
    .line 110
    aput-object v0, v1, v2

    .line 111
    .line 112
    invoke-static {v1}, L۟/jb;->ۥ([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0

    .line 117
    :cond_0
    const/16 v0, 0x9

    .line 118
    .line 119
    new-array v0, v0, [B

    .line 120
    .line 121
    fill-array-data v0, :array_2

    .line 122
    .line 123
    .line 124
    new-array v1, v3, [B

    .line 125
    .line 126
    fill-array-data v1, :array_3

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    throw v0

    .line 138
    nop

    .line 139
    :array_0
    .array-data 1
        -0x3ct
        0x33t
        -0x44t
        0x39t
        -0x1at
        0x16t
        -0x3at
    .end array-data

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    :array_1
    .array-data 1
        -0x8t
        0x40t
        -0x27t
        0x4dt
        -0x35t
        0x29t
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
    :array_2
    .array-data 1
        -0x34t
        0x29t
        -0x33t
        0x44t
        0x8t
        0x1bt
        -0x38t
        0x18t
        -0x21t
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
    :array_3
    .array-data 1
        -0x5ft
        0x7dt
        -0x58t
        0x3ct
        0x7ct
        0x4dt
    .end array-data
.end method
