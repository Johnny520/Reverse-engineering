.class final Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "()V",
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
.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子哲楪苏兰世;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子哲楪苏兰世;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子哲楪苏兰世;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子哲楪苏兰世;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-string v0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 19
    .line 20
    invoke-static {v0}, L飘花落叶言子世哲苏楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 28
    .line 29
    return-void
.end method
