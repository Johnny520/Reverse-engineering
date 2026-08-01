.class public final synthetic Lbsh/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbsh/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Lbsh/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, Lbsh/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/nio/file/Path;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFilter;->飘花落叶言子楪世苏哲兰(Ljava/nio/file/Path;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    check-cast p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏世兰;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏世兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :pswitch_1
    check-cast p0, Ljava/lang/Class;

    .line 33
    .line 34
    check-cast p1, Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, p0, :cond_0

    .line 41
    .line 42
    move v1, v2

    .line 43
    :cond_0
    return v1

    .line 44
    :pswitch_2
    check-cast p0, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    and-int/lit16 v0, v0, 0x402

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰([Ljava/lang/Class;[Ljava/lang/Class;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_1

    .line 83
    .line 84
    move v1, v2

    .line 85
    :cond_1
    return v1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
