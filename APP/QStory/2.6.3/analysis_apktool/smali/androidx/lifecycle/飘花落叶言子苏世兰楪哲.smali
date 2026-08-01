.class public final Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Lkotlin/飘花落叶言子楪苏世哲兰;

.field public 飘花落叶言子楪世哲苏兰:Landroid/os/Bundle;

.field public 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    new-instance p1, Landroidx/lifecycle/飘花落叶言子苏世哲兰楪;

    .line 10
    .line 11
    invoke-direct {p1, p2}, Landroidx/lifecycle/飘花落叶言子苏世哲兰楪;-><init>(Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世哲兰苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子苏兰楪哲世()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    new-array v1, v3, [Lkotlin/Pair;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-instance v6, Lkotlin/Pair;

    .line 67
    .line 68
    invoke-direct {v6, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    new-array v1, v3, [Lkotlin/Pair;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, [Lkotlin/Pair;

    .line 82
    .line 83
    :goto_1
    array-length v2, v1

    .line 84
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, [Lkotlin/Pair;

    .line 89
    .line 90
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v2, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Bundle;

    .line 95
    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    iput-object v1, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Bundle;

    .line 107
    .line 108
    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 110
    .line 111
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世哲兰苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 112
    .line 113
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Landroidx/lifecycle/飘花落叶言子苏世兰哲楪;

    .line 118
    .line 119
    :cond_4
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Landroid/os/Bundle;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子苏兰楪哲世()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-array v0, v2, [Lkotlin/Pair;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v5, Lkotlin/Pair;

    .line 55
    .line 56
    invoke-direct {v5, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-array v0, v2, [Lkotlin/Pair;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, [Lkotlin/Pair;

    .line 70
    .line 71
    :goto_1
    array-length v1, v0

    .line 72
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, [Lkotlin/Pair;

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世哲苏兰:Landroid/os/Bundle;

    .line 83
    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世哲兰苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 90
    .line 91
    invoke-interface {v1}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Landroidx/lifecycle/飘花落叶言子苏世兰哲楪;

    .line 96
    .line 97
    iget-object v1, v1, Landroidx/lifecycle/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Ljava/util/Map$Entry;

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Ljava/lang/String;

    .line 124
    .line 125
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Landroidx/lifecycle/飘花落叶言子苏世楪哲兰;

    .line 130
    .line 131
    iget-object v3, v3, Landroidx/lifecycle/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 132
    .line 133
    iget-object v3, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v3, Landroidx/fragment/app/飘花落叶言子楪兰哲世苏;

    .line 136
    .line 137
    invoke-virtual {v3}, Landroidx/fragment/app/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰()Landroid/os/Bundle;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-nez v5, :cond_3

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    iput-boolean v2, p0, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 155
    .line 156
    return-object v0
.end method
