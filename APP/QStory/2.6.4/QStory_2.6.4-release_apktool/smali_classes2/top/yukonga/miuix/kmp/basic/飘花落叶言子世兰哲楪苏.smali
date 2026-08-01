.class public final synthetic Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世兰哲楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:F

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(FLandroidx/compose/runtime/飘花落叶言子哲兰世楪苏;I)V
    .locals 0

    .line 1
    iput p3, p0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput p1, p0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰世苏:F

    .line 4
    .line 5
    iput-object p2, p0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/high16 v1, 0x40400000    # 3.0f

    .line 4
    .line 5
    iget-object v2, p0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 6
    .line 7
    iget p0, p0, Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰世苏:F

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v2}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    div-float/2addr v0, p0

    .line 28
    mul-float/2addr v0, v1

    .line 29
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    invoke-interface {v2}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v0, v0

    .line 49
    div-float/2addr v0, p0

    .line 50
    mul-float/2addr v0, v1

    .line 51
    const/4 p0, 0x0

    .line 52
    const/high16 v1, 0x3f800000    # 1.0f

    .line 53
    .line 54
    invoke-static {v0, p0, v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(FFF)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    sub-float/2addr v1, p0

    .line 59
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
