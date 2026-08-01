.class final Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "top.yukonga.miuix.kmp.basic.ColorPaletteKt$ColorPalette$1$1"
    f = "ColorPalette.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $alpha$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u5170\u4e16\u54f2;"
        }
    .end annotation
.end field

.field final synthetic $color:J

.field final synthetic $grayV:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $hueColumns:I

.field final synthetic $includeGrayColumn:Z

.field final synthetic $lastAcceptedHSV$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u5170\u4e16\u54f2;"
        }
    .end annotation
.end field

.field final synthetic $rowSV:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $selectedCol$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

.field final synthetic $selectedRow$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

.field final synthetic $totalColumns:I

.field label:I


# direct methods
.method public constructor <init>(JZIILjava/util/List;Ljava/util/List;Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZII",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;>;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u5170\u4e16\u54f2;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u5170\u4e16\u54f2;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u54f2\u5170\u4e16;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u54f2\u5170\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$color:J

    .line 2
    .line 3
    iput-boolean p3, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$includeGrayColumn:Z

    .line 4
    .line 5
    iput p4, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$totalColumns:I

    .line 6
    .line 7
    iput p5, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$hueColumns:I

    .line 8
    .line 9
    iput-object p6, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$grayV:Ljava/util/List;

    .line 10
    .line 11
    iput-object p7, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$rowSV:Ljava/util/List;

    .line 12
    .line 13
    iput-object p8, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$lastAcceptedHSV$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 14
    .line 15
    iput-object p9, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$alpha$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 16
    .line 17
    iput-object p10, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$selectedCol$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 18
    .line 19
    iput-object p11, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$selectedRow$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p12}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;

    .line 2
    .line 3
    iget-wide v1, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$color:J

    .line 4
    .line 5
    iget-boolean v3, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$includeGrayColumn:Z

    .line 6
    .line 7
    iget v4, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$totalColumns:I

    .line 8
    .line 9
    iget v5, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$hueColumns:I

    .line 10
    .line 11
    iget-object v6, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$grayV:Ljava/util/List;

    .line 12
    .line 13
    iget-object v7, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$rowSV:Ljava/util/List;

    .line 14
    .line 15
    iget-object v8, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$lastAcceptedHSV$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 16
    .line 17
    iget-object v9, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$alpha$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 18
    .line 19
    iget-object v10, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$selectedCol$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 20
    .line 21
    iget-object v11, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$selectedRow$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 22
    .line 23
    move-object v12, p2

    .line 24
    invoke-direct/range {v0 .. v12}, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;-><init>(JZIILjava/util/List;Ljava/util/List;Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-wide v0, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$color:J

    .line 11
    .line 12
    sget p1, L飘花落叶言苏哲世兰楪子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(J)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/high16 v2, 0x437f0000    # 255.0f

    .line 19
    .line 20
    mul-float/2addr p1, v2

    .line 21
    float-to-int p1, p1

    .line 22
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    mul-float/2addr v3, v2

    .line 27
    float-to-int v3, v3

    .line 28
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(J)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    mul-float/2addr v0, v2

    .line 33
    float-to-int v0, v0

    .line 34
    int-to-float p1, p1

    .line 35
    div-float/2addr p1, v2

    .line 36
    int-to-float v1, v3

    .line 37
    div-float/2addr v1, v2

    .line 38
    int-to-float v0, v0

    .line 39
    div-float/2addr v0, v2

    .line 40
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {p1, v2}, Ljava/lang/Math;->max(FF)F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-static {p1, v3}, Ljava/lang/Math;->min(FF)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    sub-float v3, v2, v3

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    cmpg-float v5, v3, v4

    .line 60
    .line 61
    const/high16 v6, 0x43b40000    # 360.0f

    .line 62
    .line 63
    if-nez v5, :cond_0

    .line 64
    .line 65
    move v1, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    cmpg-float v5, v2, p1

    .line 68
    .line 69
    const/high16 v7, 0x42700000    # 60.0f

    .line 70
    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    sub-float/2addr v1, v0

    .line 74
    div-float/2addr v1, v3

    .line 75
    mul-float/2addr v1, v7

    .line 76
    add-float/2addr v1, v6

    .line 77
    rem-float/2addr v1, v6

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    cmpg-float v5, v2, v1

    .line 80
    .line 81
    if-nez v5, :cond_2

    .line 82
    .line 83
    sub-float/2addr v0, p1

    .line 84
    div-float/2addr v0, v3

    .line 85
    mul-float/2addr v0, v7

    .line 86
    const/high16 p1, 0x42f00000    # 120.0f

    .line 87
    .line 88
    add-float/2addr v0, p1

    .line 89
    rem-float v1, v0, v6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    sub-float/2addr p1, v1

    .line 93
    div-float/2addr p1, v3

    .line 94
    mul-float/2addr p1, v7

    .line 95
    const/high16 v0, 0x43700000    # 240.0f

    .line 96
    .line 97
    add-float/2addr p1, v0

    .line 98
    rem-float v1, p1, v6

    .line 99
    .line 100
    :goto_0
    invoke-static {v1, v4, v6}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(FFF)F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    cmpl-float v0, v2, v4

    .line 105
    .line 106
    if-lez v0, :cond_3

    .line 107
    .line 108
    div-float/2addr v3, v2

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move v3, v4

    .line 111
    :goto_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-static {v3, v4, v0}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(FFF)F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-static {v2, v4, v0}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(FFF)F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/4 v2, 0x3

    .line 122
    new-array v2, v2, [F

    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    aput p1, v2, v3

    .line 126
    .line 127
    const/4 p1, 0x1

    .line 128
    aput v1, v2, p1

    .line 129
    .line 130
    const/4 v1, 0x2

    .line 131
    aput v0, v2, v1

    .line 132
    .line 133
    aget v0, v2, v3

    .line 134
    .line 135
    aget v5, v2, p1

    .line 136
    .line 137
    const/high16 v7, 0x42c80000    # 100.0f

    .line 138
    .line 139
    mul-float/2addr v5, v7

    .line 140
    invoke-static {v5, v4, v7}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(FFF)F

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    aget v1, v2, v1

    .line 145
    .line 146
    mul-float/2addr v1, v7

    .line 147
    invoke-static {v1, v4, v7}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(FFF)F

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    div-float/2addr v5, v7

    .line 152
    div-float/2addr v1, v7

    .line 153
    new-instance v2, Lkotlin/Triple;

    .line 154
    .line 155
    new-instance v4, Ljava/lang/Float;

    .line 156
    .line 157
    invoke-direct {v4, v0}, Ljava/lang/Float;-><init>(F)V

    .line 158
    .line 159
    .line 160
    new-instance v7, Ljava/lang/Float;

    .line 161
    .line 162
    invoke-direct {v7, v5}, Ljava/lang/Float;-><init>(F)V

    .line 163
    .line 164
    .line 165
    new-instance v8, Ljava/lang/Float;

    .line 166
    .line 167
    invoke-direct {v8, v1}, Ljava/lang/Float;-><init>(F)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v2, v4, v7, v8}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget-object v4, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$lastAcceptedHSV$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 174
    .line 175
    invoke-interface {v4}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    check-cast v4, Lkotlin/Triple;

    .line 180
    .line 181
    sget-object v7, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 182
    .line 183
    if-eqz v4, :cond_4

    .line 184
    .line 185
    invoke-virtual {v4}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    check-cast v8, Ljava/lang/Number;

    .line 190
    .line 191
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    invoke-virtual {v2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    check-cast v9, Ljava/lang/Number;

    .line 200
    .line 201
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    sub-float/2addr v8, v9

    .line 206
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    sub-float v9, v6, v8

    .line 211
    .line 212
    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    const/high16 v9, 0x3fc00000    # 1.5f

    .line 217
    .line 218
    cmpg-float v8, v8, v9

    .line 219
    .line 220
    if-gtz v8, :cond_4

    .line 221
    .line 222
    invoke-virtual {v4}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    check-cast v8, Ljava/lang/Number;

    .line 227
    .line 228
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    invoke-virtual {v2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    check-cast v9, Ljava/lang/Number;

    .line 237
    .line 238
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    sub-float/2addr v8, v9

    .line 243
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    const v9, 0x3ca3d70a    # 0.02f

    .line 248
    .line 249
    .line 250
    cmpg-float v8, v8, v9

    .line 251
    .line 252
    if-gtz v8, :cond_4

    .line 253
    .line 254
    invoke-virtual {v4}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    check-cast v4, Ljava/lang/Number;

    .line 259
    .line 260
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    invoke-virtual {v2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    check-cast v8, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    sub-float/2addr v4, v8

    .line 275
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    cmpg-float v4, v4, v9

    .line 280
    .line 281
    if-gtz v4, :cond_4

    .line 282
    .line 283
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$alpha$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 284
    .line 285
    iget-wide v0, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$color:J

    .line 286
    .line 287
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏(J)F

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-interface {p1, v0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$lastAcceptedHSV$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 299
    .line 300
    invoke-interface {p0, v2}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    return-object v7

    .line 304
    :cond_4
    iget-boolean v4, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$includeGrayColumn:Z

    .line 305
    .line 306
    if-eqz v4, :cond_5

    .line 307
    .line 308
    const v4, 0x3d4ccccd    # 0.05f

    .line 309
    .line 310
    .line 311
    cmpg-float v4, v5, v4

    .line 312
    .line 313
    if-gez v4, :cond_5

    .line 314
    .line 315
    move v4, p1

    .line 316
    goto :goto_2

    .line 317
    :cond_5
    move v4, v3

    .line 318
    :goto_2
    if-eqz v4, :cond_6

    .line 319
    .line 320
    iget v0, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$totalColumns:I

    .line 321
    .line 322
    sub-int/2addr v0, p1

    .line 323
    goto :goto_3

    .line 324
    :cond_6
    rem-float/2addr v0, v6

    .line 325
    div-float/2addr v0, v6

    .line 326
    iget v6, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$hueColumns:I

    .line 327
    .line 328
    int-to-float v6, v6

    .line 329
    mul-float/2addr v0, v6

    .line 330
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世哲楪兰(F)I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    iget v6, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$hueColumns:I

    .line 335
    .line 336
    sub-int/2addr v6, p1

    .line 337
    invoke-static {v0, v3, v6}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(III)I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    :goto_3
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 342
    .line 343
    if-eqz v4, :cond_8

    .line 344
    .line 345
    iget-object v4, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$grayV:Ljava/util/List;

    .line 346
    .line 347
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    move v6, v3

    .line 352
    :goto_4
    if-ge v3, v5, :cond_b

    .line 353
    .line 354
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    check-cast v8, Ljava/lang/Number;

    .line 359
    .line 360
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    sub-float v8, v1, v8

    .line 365
    .line 366
    mul-float/2addr v8, v8

    .line 367
    cmpg-float v9, v8, p1

    .line 368
    .line 369
    if-gez v9, :cond_7

    .line 370
    .line 371
    move v6, v3

    .line 372
    move p1, v8

    .line 373
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_8
    iget-object v4, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$rowSV:Ljava/util/List;

    .line 377
    .line 378
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    move v8, v3

    .line 383
    :goto_5
    if-ge v3, v6, :cond_a

    .line 384
    .line 385
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    check-cast v9, Lkotlin/Pair;

    .line 390
    .line 391
    invoke-virtual {v9}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v9

    .line 395
    check-cast v9, Ljava/lang/Number;

    .line 396
    .line 397
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 398
    .line 399
    .line 400
    move-result v9

    .line 401
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v10

    .line 405
    check-cast v10, Lkotlin/Pair;

    .line 406
    .line 407
    invoke-virtual {v10}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    check-cast v10, Ljava/lang/Number;

    .line 412
    .line 413
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    sub-float v9, v5, v9

    .line 418
    .line 419
    sub-float v10, v1, v10

    .line 420
    .line 421
    mul-float/2addr v9, v9

    .line 422
    mul-float/2addr v10, v10

    .line 423
    add-float/2addr v10, v9

    .line 424
    cmpg-float v9, v10, p1

    .line 425
    .line 426
    if-gez v9, :cond_9

    .line 427
    .line 428
    move v8, v3

    .line 429
    move p1, v10

    .line 430
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 431
    .line 432
    goto :goto_5

    .line 433
    :cond_a
    move v6, v8

    .line 434
    :cond_b
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$selectedCol$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 435
    .line 436
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;

    .line 437
    .line 438
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪苏兰哲世(I)V

    .line 439
    .line 440
    .line 441
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$selectedRow$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 442
    .line 443
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;

    .line 444
    .line 445
    invoke-virtual {p1, v6}, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪苏兰哲世(I)V

    .line 446
    .line 447
    .line 448
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$alpha$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 449
    .line 450
    iget-wide v0, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$color:J

    .line 451
    .line 452
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏(J)F

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-interface {p1, v0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/basic/ColorPaletteKt$ColorPalette$1$1;->$lastAcceptedHSV$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 464
    .line 465
    invoke-interface {p0, v2}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-object v7

    .line 469
    :cond_c
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 470
    .line 471
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    const/4 p0, 0x0

    .line 475
    return-object p0
.end method
