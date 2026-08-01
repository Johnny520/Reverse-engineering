.class public final Ljd;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/graphics/Matrix;

.field public final β:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ljd;->α:Landroid/graphics/Matrix;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    iput-object v0, p0, Ljd;->β:[I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public α(Landroid/view/View;[F)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Ljd;->α:Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Landroid/view/View;->transformMatrixToGlobal(Landroid/graphics/Matrix;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    :goto_0
    instance-of v5, v4, Landroid/view/View;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    move-object v3, v4

    .line 24
    check-cast v3, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, v0, Ljd;->β:[I

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    aget v5, v0, v4

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    aget v7, v0, v6

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 43
    .line 44
    .line 45
    aget v3, v0, v4

    .line 46
    .line 47
    aget v0, v0, v6

    .line 48
    .line 49
    sub-int/2addr v3, v5

    .line 50
    int-to-float v3, v3

    .line 51
    sub-int/2addr v0, v7

    .line 52
    int-to-float v0, v0

    .line 53
    invoke-virtual {v2, v3, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 57
    .line 58
    .line 59
    aget v0, v1, v4

    .line 60
    .line 61
    aget v2, v1, v6

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    aget v5, v1, v3

    .line 65
    .line 66
    const/4 v7, 0x3

    .line 67
    aget v8, v1, v7

    .line 68
    .line 69
    const/4 v9, 0x4

    .line 70
    aget v10, v1, v9

    .line 71
    .line 72
    const/4 v11, 0x5

    .line 73
    aget v12, v1, v11

    .line 74
    .line 75
    const/4 v13, 0x6

    .line 76
    aget v14, v1, v13

    .line 77
    .line 78
    const/4 v15, 0x7

    .line 79
    aget v16, v1, v15

    .line 80
    .line 81
    const/16 v17, 0x8

    .line 82
    .line 83
    aget v18, v1, v17

    .line 84
    .line 85
    aput v0, v1, v4

    .line 86
    .line 87
    aput v8, v1, v6

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    aput v0, v1, v3

    .line 91
    .line 92
    aput v14, v1, v7

    .line 93
    .line 94
    aput v2, v1, v9

    .line 95
    .line 96
    aput v10, v1, v11

    .line 97
    .line 98
    aput v0, v1, v13

    .line 99
    .line 100
    aput v16, v1, v15

    .line 101
    .line 102
    aput v0, v1, v17

    .line 103
    .line 104
    const/16 v2, 0x9

    .line 105
    .line 106
    aput v0, v1, v2

    .line 107
    .line 108
    const/16 v2, 0xa

    .line 109
    .line 110
    const/high16 v3, 0x3f800000    # 1.0f

    .line 111
    .line 112
    aput v3, v1, v2

    .line 113
    .line 114
    const/16 v2, 0xb

    .line 115
    .line 116
    aput v0, v1, v2

    .line 117
    .line 118
    const/16 v2, 0xc

    .line 119
    .line 120
    aput v5, v1, v2

    .line 121
    .line 122
    const/16 v2, 0xd

    .line 123
    .line 124
    aput v12, v1, v2

    .line 125
    .line 126
    const/16 v2, 0xe

    .line 127
    .line 128
    aput v0, v1, v2

    .line 129
    .line 130
    const/16 v0, 0xf

    .line 131
    .line 132
    aput v18, v1, v0

    .line 133
    .line 134
    return-void
.end method
