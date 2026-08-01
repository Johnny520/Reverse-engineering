.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子苏楪哲世兰:Ljava/util/function/Predicate;


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Predicate;)V
    .locals 11

    .line 1
    const-class v7, Ljava/lang/Boolean;

    .line 2
    .line 3
    const-class v8, Ljava/lang/Boolean;

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move v2, p2

    .line 8
    move-wide v3, p3

    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v6, p6

    .line 12
    .line 13
    move-object/from16 v9, p7

    .line 14
    .line 15
    move-object/from16 v10, p8

    .line 16
    .line 17
    invoke-direct/range {v0 .. v10}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 18
    .line 19
    .line 20
    move-object/from16 p1, p9

    .line 21
    .line 22
    iput-object p1, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪哲世兰:Ljava/util/function/Predicate;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪哲世兰:Ljava/util/function/Predicate;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
