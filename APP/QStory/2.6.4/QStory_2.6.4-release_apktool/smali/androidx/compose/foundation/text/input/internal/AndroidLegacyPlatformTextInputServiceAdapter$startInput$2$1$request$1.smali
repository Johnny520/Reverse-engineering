.class final synthetic Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $node:Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪苏哲兰;)V
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1;->$node:Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    const-string v4, "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, Lkotlin/jvm/internal/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    const-string v3, "localToScreen"

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/compose/ui/graphics/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:[F

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1;->invoke-58bKbWc([F)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 9
    .line 10
    return-object p0
.end method

.method public final invoke-58bKbWc([F)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1;->$node:Landroidx/compose/foundation/text/input/internal/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲世苏;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰哲世苏;->飘花落叶言子世苏哲楪兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 14
    .line 15
    if-eqz p0, :cond_2

    .line 16
    .line 17
    invoke-interface {p0}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_0
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲([F)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_1
    return-void
.end method
