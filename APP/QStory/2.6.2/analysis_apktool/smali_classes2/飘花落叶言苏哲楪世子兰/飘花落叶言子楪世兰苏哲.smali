.class public final L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Landroid/os/Handler;

.field public 飘花落叶言子楪世苏兰哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    invoke-direct {v0}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Handler;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 4

    .line 1
    iget-object p0, p0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    move v0, v1

    .line 23
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-wide v2, -0x36a4331d051405a7L    # -2.4798730561503856E45

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    new-instance p0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-wide v2, -0x36a4331a051405a7L    # -2.4798771395387887E45

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const/16 p1, 0x29

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    if-lez v0, :cond_3

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    :cond_3
    invoke-virtual {p2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 113
    .line 114
    .line 115
    if-lez v0, :cond_4

    .line 116
    .line 117
    const/high16 p0, 0x3f800000    # 1.0f

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    const/high16 p0, 0x3f000000    # 0.5f

    .line 121
    .line 122
    :goto_2
    invoke-virtual {p2, p0}, Landroid/view/View;->setAlpha(F)V

    .line 123
    .line 124
    .line 125
    return-void
.end method
