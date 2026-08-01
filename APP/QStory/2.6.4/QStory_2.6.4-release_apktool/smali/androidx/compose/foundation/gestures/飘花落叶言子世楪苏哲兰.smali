.class public final Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏兰哲;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(F)F
    .locals 5

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏兰哲;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 28
    .line 29
    cmpl-float v2, p1, v1

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-lez v2, :cond_1

    .line 34
    .line 35
    move v2, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v2, v3

    .line 38
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 48
    .line 49
    cmpg-float v0, p1, v1

    .line 50
    .line 51
    if-gez v0, :cond_2

    .line 52
    .line 53
    move v3, v4

    .line 54
    :cond_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return p1
.end method
