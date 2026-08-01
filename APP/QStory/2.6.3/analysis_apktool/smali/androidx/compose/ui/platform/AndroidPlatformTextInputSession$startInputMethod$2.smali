.class final Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "it",
        "Landroidx/compose/ui/platform/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u696a\u4e16;",
        "invoke",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)Landroidx/compose/ui/platform/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u54f2\u696a\u4e16;",
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
.field final synthetic $request:Landroidx/compose/ui/platform/飘花落叶言子哲世苏楪兰;

.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子哲世苏楪兰;Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->$request:Landroidx/compose/ui/platform/飘花落叶言子哲世苏楪兰;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->this$0:Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;

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
.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;
    .locals 2

    .line 1
    new-instance p1, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->$request:Landroidx/compose/ui/platform/飘花落叶言子哲世苏楪兰;

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2$1;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->this$0:Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2$1;-><init>(Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;-><init>(Landroidx/compose/ui/platform/飘花落叶言子哲世苏楪兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 16
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroidx/compose/ui/platform/飘花落叶言子苏兰哲楪世;

    move-result-object p0

    return-object p0
.end method
