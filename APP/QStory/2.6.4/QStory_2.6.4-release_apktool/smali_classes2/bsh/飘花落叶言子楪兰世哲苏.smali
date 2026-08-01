.class public final synthetic Lbsh/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
    check-cast p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏世兰;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏世兰;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :pswitch_2
    check-cast p0, Ljava/lang/Class;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/reflect/Field;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, p0, :cond_0

    .line 54
    .line 55
    move v1, v2

    .line 56
    :cond_0
    return v1

    .line 57
    :pswitch_3
    check-cast p0, Ljava/lang/reflect/Method;

    .line 58
    .line 59
    check-cast p1, Ljava/lang/reflect/Method;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    and-int/lit16 v0, v0, 0x402

    .line 80
    .line 81
    if-nez v0, :cond_1

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰([Ljava/lang/Class;[Ljava/lang/Class;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_1

    .line 96
    .line 97
    move v1, v2

    .line 98
    :cond_1
    return v1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
