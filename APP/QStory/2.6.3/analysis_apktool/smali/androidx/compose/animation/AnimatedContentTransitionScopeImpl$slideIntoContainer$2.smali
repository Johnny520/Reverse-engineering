.class final Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "invoke",
        "(I)Ljava/lang/Integer;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $initialOffset:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Landroidx/compose/animation/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2;->$initialOffset:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2;->this$0:Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(I)Ljava/lang/Integer;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2;->$initialOffset:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2;->this$0:Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    shl-long v4, v1, v3

    .line 9
    .line 10
    const-wide v6, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr v1, v6

    .line 16
    or-long/2addr v1, v4

    .line 17
    invoke-static {p0}, Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-static {p0, v1, v2, v4, v5}, Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏(Landroidx/compose/animation/飘花落叶言子楪苏兰世哲;JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    shr-long/2addr v1, v3

    .line 26
    long-to-int p0, v1

    .line 27
    neg-int p0, p0

    .line 28
    sub-int/2addr p0, p1

    .line 29
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {v0, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/Integer;

    .line 38
    .line 39
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 40
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$slideIntoContainer$2;->invoke(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
