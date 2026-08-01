.class public final synthetic Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:J

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-wide p1, p0, Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:J

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    iget-object p0, p1, Landroidx/compose/runtime/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object p1, p1, Landroidx/compose/runtime/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p0, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p0, v0

    .line 36
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_0
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->resumeWith(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_1
    return-object v1

    .line 44
    :pswitch_0
    check-cast p1, Landroidx/compose/ui/semantics/飘花落叶言子楪兰哲世苏;

    .line 45
    .line 46
    sget-object v0, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 47
    .line 48
    new-instance v2, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪兰哲苏;

    .line 49
    .line 50
    sget-object v3, Landroidx/compose/foundation/text/Handle;->Cursor:Landroidx/compose/foundation/text/Handle;

    .line 51
    .line 52
    sget-object v6, Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;->Middle:Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    iget-wide v4, p0, Landroidx/compose/foundation/text/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:J

    .line 56
    .line 57
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪兰哲苏;-><init>(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;Z)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0, v2}, Landroidx/compose/ui/semantics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_1
    check-cast p1, Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;

    .line 65
    .line 66
    iget-object p0, p1, Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/draw/飘花落叶言子楪世哲苏兰;

    .line 67
    .line 68
    invoke-interface {p0}, Landroidx/compose/ui/draw/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    const/16 p0, 0x20

    .line 73
    .line 74
    shr-long/2addr v0, p0

    .line 75
    long-to-int p0, v0

    .line 76
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    const/high16 v0, 0x40000000    # 2.0f

    .line 81
    .line 82
    div-float/2addr p0, v0

    .line 83
    invoke-static {p1, p0}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;F)Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;

    .line 88
    .line 89
    const/4 v4, 0x5

    .line 90
    invoke-direct {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;-><init>(JI)V

    .line 91
    .line 92
    .line 93
    new-instance v2, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪哲苏;

    .line 94
    .line 95
    const/4 v3, 0x2

    .line 96
    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪哲苏;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v2}, Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/draw/飘花落叶言子楪苏哲世兰;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
