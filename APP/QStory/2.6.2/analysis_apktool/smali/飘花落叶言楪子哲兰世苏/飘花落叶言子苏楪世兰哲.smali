.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子苏楪世兰哲;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰哲苏楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(IJLjava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V
    .locals 2

    .line 1
    move-wide v0, p2

    .line 2
    move p2, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p6

    .line 5
    move-object p6, p7

    .line 6
    move-object p7, p10

    .line 7
    move-object p10, p9

    .line 8
    move-object p9, p8

    .line 9
    move-object p8, p4

    .line 10
    move-wide p3, v0

    .line 11
    invoke-direct/range {p0 .. p10}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 12
    .line 13
    .line 14
    iput-object p11, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏楪世兰哲;->飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;

    .line 15
    .line 16
    const-class p0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 17
    .line 18
    if-eq p8, p0, :cond_0

    .line 19
    .line 20
    const-class p0, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 21
    .line 22
    if-eq p8, p0, :cond_0

    .line 23
    .line 24
    const-class p0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 25
    .line 26
    if-eq p8, p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p8}, Ljava/lang/Class;->isArray()Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏楪世兰哲;->飘花落叶言子苏楪兰哲世:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
