.class public final L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;
.super Landroid/text/style/CharacterStyle;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

.field public final 飘花落叶言子楪哲兰世苏:F

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:F

    .line 7
    .line 8
    new-instance p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;-><init>(J)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 23
    .line 24
    new-instance p1, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    const/4 p2, 0x7

    .line 27
    invoke-direct {p1, p0, p2}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:F

    .line 2
    .line 3
    invoke-static {p1, v0}, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Landroid/text/TextPaint;F)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言子苏哲楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子楪兰苏哲世;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/graphics/Shader;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    return-void
.end method
