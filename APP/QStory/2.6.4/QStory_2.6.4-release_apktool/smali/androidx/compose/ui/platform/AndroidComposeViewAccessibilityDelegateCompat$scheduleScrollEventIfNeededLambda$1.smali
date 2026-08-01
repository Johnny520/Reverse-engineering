.class final Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/platform/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u82cf\u696a\u5170\u4e16;",
        "it",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/platform/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u82cf\u696a\u5170\u4e16;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    check-cast p1, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1;->invoke(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子苏世楪哲兰:Landroidx/collection/飘花落叶言子世楪哲兰苏;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getSnapshotObserver()Landroidx/compose/ui/node/飘花落叶言子苏哲兰世楪;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子苏楪兰哲世:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 24
    .line 25
    new-instance v2, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;

    .line 26
    .line 27
    invoke-direct {v2, p1, p0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1;-><init>(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪兰世;Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, v0, Landroidx/compose/ui/node/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v1, v2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
