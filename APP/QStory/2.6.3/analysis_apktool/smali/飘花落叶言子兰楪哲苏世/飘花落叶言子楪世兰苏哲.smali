.class public final L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    new-instance v0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    invoke-direct {v0, p1}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object p0, p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子苏兰楪哲世()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-array v0, v2, [Lkotlin/Pair;

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ljava/lang/String;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    new-instance v5, Lkotlin/Pair;

    .line 57
    .line 58
    invoke-direct {v5, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-array v0, v2, [Lkotlin/Pair;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, [Lkotlin/Pair;

    .line 72
    .line 73
    :goto_1
    array-length v1, v0

    .line 74
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, [Lkotlin/Pair;

    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v1, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/os/Bundle;

    .line 85
    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    iget-object v1, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 92
    .line 93
    monitor-enter v1

    .line 94
    :try_start_0
    iget-object p0, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Ljava/util/Map$Entry;

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲苏兰;

    .line 127
    .line 128
    invoke-interface {v2}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()Landroid/os/Bundle;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catchall_0
    move-exception p0

    .line 143
    goto :goto_3

    .line 144
    :cond_3
    monitor-exit v1

    .line 145
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_4

    .line 150
    .line 151
    const-string p0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 152
    .line 153
    invoke-virtual {p1, p0, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 154
    .line 155
    .line 156
    :cond_4
    return-void

    .line 157
    :goto_3
    monitor-exit v1

    .line 158
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object p0, p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    iget-boolean v1, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 17
    .line 18
    iget-object v1, v1, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 19
    .line 20
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    iget-boolean v0, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Z

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-static {v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    iput-object v0, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/os/Bundle;

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Z

    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string p0, "SavedStateRegistry was already restored."

    .line 54
    .line 55
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-interface {v0}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 64
    .line 65
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 66
    .line 67
    const-string p1, "performRestore cannot be called when owner is "

    .line 68
    .line 69
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
