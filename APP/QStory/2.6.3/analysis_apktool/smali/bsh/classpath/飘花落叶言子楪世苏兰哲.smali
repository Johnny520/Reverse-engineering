.class public final synthetic Lbsh/classpath/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbsh/classpath/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lbsh/classpath/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/classpath/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lbsh/classpath/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    check-cast p1, Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    new-instance v2, Lbsh/classpath/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    const/4 v3, 0x3

    .line 25
    invoke-direct {v2, v0, v3}, Lbsh/classpath/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->forEach(Ljava/util/function/Consumer;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/net/URL;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-void

    .line 63
    :pswitch_0
    check-cast p0, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 64
    .line 65
    check-cast p1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;->add(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_1
    check-cast p0, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 72
    .line 73
    check-cast p1, Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 74
    .line 75
    iget-object p1, p1, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v0, Lbsh/classpath/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-direct {v0, p0, v1}, Lbsh/classpath/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_2
    check-cast p0, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 92
    .line 93
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;->add(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
