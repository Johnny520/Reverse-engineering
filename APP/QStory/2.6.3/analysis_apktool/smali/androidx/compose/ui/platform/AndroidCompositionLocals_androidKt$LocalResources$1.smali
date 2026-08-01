.class final Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$LocalResources$1;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
        "Landroid/content/res/Resources;",
        "invoke",
        "(Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;)Landroid/content/res/Resources;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$LocalResources$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$LocalResources$1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$LocalResources$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$LocalResources$1;->INSTANCE:Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$LocalResources$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪哲苏兰世;)Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget-object p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    check-cast v0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲楪兰(Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    sget-object p0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 13
    .line 14
    check-cast p1, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 15
    .line 16
    invoke-static {p1, p0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲楪兰(Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪哲苏兰世;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$LocalResources$1;->invoke(Landroidx/compose/runtime/飘花落叶言子楪哲苏兰世;)Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method
