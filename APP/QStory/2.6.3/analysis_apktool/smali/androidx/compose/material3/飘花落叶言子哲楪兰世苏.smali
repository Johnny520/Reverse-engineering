.class public abstract Landroidx/compose/material3/飘花落叶言子哲楪兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    sget v0, L飘花落叶言子世楪兰哲苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Landroidx/collection/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰([I)Landroidx/collection/飘花落叶言子世楪哲兰苏;

    .line 11
    .line 12
    .line 13
    new-array v1, v0, [I

    .line 14
    .line 15
    fill-array-data v1, :array_1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Landroidx/collection/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰([I)Landroidx/collection/飘花落叶言子世楪哲兰苏;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget v2, v1, Landroidx/collection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:I

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    sget-object v3, Landroidx/collection/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:[I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-array v3, v2, [I

    .line 30
    .line 31
    :goto_0
    iget-object v1, v1, Landroidx/collection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:[I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    move v5, v4

    .line 35
    :goto_1
    if-ge v4, v2, :cond_2

    .line 36
    .line 37
    aget v6, v1, v4

    .line 38
    .line 39
    rem-int/2addr v6, v0

    .line 40
    add-int/2addr v6, v0

    .line 41
    add-int/lit8 v7, v5, 0x1

    .line 42
    .line 43
    array-length v8, v3

    .line 44
    if-ge v8, v7, :cond_1

    .line 45
    .line 46
    array-length v8, v3

    .line 47
    mul-int/lit8 v8, v8, 0x3

    .line 48
    .line 49
    div-int/lit8 v8, v8, 0x2

    .line 50
    .line 51
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([II)[I

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :cond_1
    aput v6, v3, v5

    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    move v5, v7

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    return-void

    .line 66
    nop

    .line 67
    :array_0
    .array-data 4
        0x0
        0x5
        0xa
        0xf
        0x14
        0x19
        0x1e
        0x23
        0x28
        0x2d
        0x32
        0x37
    .end array-data

    .line 68
    .line 69
    .line 70
    :array_1
    .array-data 4
        0xc
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
    .end array-data
.end method

.method public static final 飘花落叶言子楪世苏哲兰(FFJLkotlin/coroutines/jvm/internal/ContinuationImpl;)V
    .locals 4

    .line 1
    instance-of v0, p4, Landroidx/compose/material3/TimePickerKt$onTap$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/material3/TimePickerKt$onTap$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/material3/TimePickerKt$onTap$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/material3/TimePickerKt$onTap$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/material3/TimePickerKt$onTap$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/material3/TimePickerKt$onTap$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/material3/TimePickerKt$onTap$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v1, v0, Landroidx/compose/material3/TimePickerKt$onTap$1;->label:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_6

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    if-eq v1, p0, :cond_4

    .line 36
    .line 37
    const/4 p0, 0x2

    .line 38
    if-ne v1, p0, :cond_3

    .line 39
    .line 40
    iget-boolean p0, v0, Landroidx/compose/material3/TimePickerKt$onTap$1;->Z$0:Z

    .line 41
    .line 42
    iget-object p1, v0, Landroidx/compose/material3/TimePickerKt$onTap$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    if-nez p0, :cond_1

    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    throw v2

    .line 53
    :cond_2
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    iget-object p0, v0, Landroidx/compose/material3/TimePickerKt$onTap$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_5
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    throw v2

    .line 75
    :cond_6
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const-wide v0, 0xffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr v0, p2

    .line 84
    long-to-int p4, v0

    .line 85
    int-to-float p4, p4

    .line 86
    sub-float/2addr p1, p4

    .line 87
    const/16 p4, 0x20

    .line 88
    .line 89
    shr-long/2addr p2, p4

    .line 90
    long-to-int p2, p2

    .line 91
    int-to-float p2, p2

    .line 92
    sub-float/2addr p0, p2

    .line 93
    float-to-double p1, p1

    .line 94
    float-to-double p3, p0

    .line 95
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->atan2(DD)D

    .line 96
    .line 97
    .line 98
    throw v2
.end method
