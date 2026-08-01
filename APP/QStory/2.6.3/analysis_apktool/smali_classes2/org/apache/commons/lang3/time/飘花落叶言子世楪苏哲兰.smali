.class public final Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lorg/apache/commons/lang3/time/飘花落叶言子楪兰哲苏世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-lt p2, v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 8
    .line 9
    iput p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Appendable;I)V
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    invoke-static {p1, p2, p0}, Lorg/apache/commons/lang3/time/FastDatePrinter;->access$100(Ljava/lang/Appendable;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/util/Calendar;Ljava/lang/Appendable;)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p2, p1}, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Appendable;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    return p0
.end method
