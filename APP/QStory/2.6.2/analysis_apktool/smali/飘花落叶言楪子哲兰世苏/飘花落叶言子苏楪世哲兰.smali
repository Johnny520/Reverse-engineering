.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子苏楪世哲兰;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(IJLjava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V
    .locals 12

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move v2, p1

    .line 4
    move-wide v3, p2

    .line 5
    move-object/from16 v9, p4

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    move-object/from16 v5, p6

    .line 10
    .line 11
    move-object/from16 v7, p7

    .line 12
    .line 13
    move-object/from16 v10, p8

    .line 14
    .line 15
    move-object/from16 v11, p9

    .line 16
    .line 17
    move-object/from16 v8, p10

    .line 18
    .line 19
    invoke-direct/range {v0 .. v11}, L飘花落叶言楪子哲兰世苏/飘花落叶言子世兰苏哲楪;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 20
    .line 21
    .line 22
    move-object/from16 p1, p11

    .line 23
    .line 24
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

    .line 25
    .line 26
    const-class p0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 27
    .line 28
    if-eq v9, p0, :cond_0

    .line 29
    .line 30
    const-class p0, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 31
    .line 32
    if-eq v9, p0, :cond_0

    .line 33
    .line 34
    const-class p0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 35
    .line 36
    if-eq v9, p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v9}, Ljava/lang/Class;->isArray()Z

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()Ljava/util/function/Function;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏楪世哲兰;->飘花落叶言子苏楪世兰哲:Ljava/util/function/Function;

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
