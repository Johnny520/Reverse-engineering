.class final Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
    c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$6$1$1"
    f = "ScrollBar.kt"
    l = {
        0x19b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $displayedThumbLength$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;

.field final synthetic $startValue:F

.field final synthetic $targetThumbLength:F

.field label:I


# direct methods
.method public constructor <init>(FFLandroidx/compose/runtime/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u54f2\u4e16\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$startValue:F

    .line 2
    .line 3
    iput p2, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$targetThumbLength:F

    .line 4
    .line 5
    iput-object p3, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$displayedThumbLength$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;FF)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏楪世兰;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪苏兰哲世(F)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 7
    .line 8
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;FF)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->invokeSuspend$lambda$0(Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;FF)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
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
    new-instance p1, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;

    .line 2
    .line 3
    iget v0, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$startValue:F

    .line 4
    .line 5
    iget v1, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$targetThumbLength:F

    .line 6
    .line 7
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$displayedThumbLength$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p0, p2}, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;-><init>(FFLandroidx/compose/runtime/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move p1, v3

    .line 25
    iget v3, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$startValue:F

    .line 26
    .line 27
    iget v4, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$targetThumbLength:F

    .line 28
    .line 29
    const/16 v1, 0x96

    .line 30
    .line 31
    const/4 v5, 0x6

    .line 32
    invoke-static {v1, v5, v2}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(IILandroidx/compose/animation/core/飘花落叶言子楪兰哲世苏;)Landroidx/compose/animation/core/飘花落叶言子苏兰楪哲世;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v1, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->$displayedThumbLength$delegate:Landroidx/compose/runtime/飘花落叶言子苏楪哲世兰;

    .line 37
    .line 38
    new-instance v6, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世苏兰楪哲;

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-direct {v6, v1, v2}, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世苏兰楪哲;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    iput p1, p0, Ltop/yukonga/miuix/kmp/basic/ScrollBarKt$ScrollBar$6$1$1;->label:I

    .line 45
    .line 46
    const/4 v8, 0x4

    .line 47
    move-object v7, p0

    .line 48
    invoke-static/range {v3 .. v8}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(FFLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/SuspendLambda;I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 56
    .line 57
    return-object p0
.end method
