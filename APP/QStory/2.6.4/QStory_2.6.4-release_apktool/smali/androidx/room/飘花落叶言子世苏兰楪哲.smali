.class public final Landroidx/room/飘花落叶言子世苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪苏兰哲世:[Ljava/lang/String;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

.field public final 飘花落叶言子楪苏世兰哲:Landroidx/room/飘花落叶言子楪哲苏世兰;

.field public final 飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

.field public 飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪苏哲世兰:Landroidx/room/飘花落叶言子楪哲苏兰世;

.field public final 飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "UPDATE"

    .line 2
    .line 3
    const-string v1, "DELETE"

    .line 4
    .line 5
    const-string v2, "INSERT"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ltop/suzhelan/qstory/database/RecallDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    iput-boolean p5, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Z

    .line 11
    .line 12
    iput-object p6, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    new-instance p1, Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    const/4 p3, 0x2

    .line 25
    invoke-direct {p1, p3}, Landroidx/room/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    array-length p1, p4

    .line 38
    new-array p3, p1, [Ljava/lang/String;

    .line 39
    .line 40
    :goto_0
    if-ge p2, p1, :cond_2

    .line 41
    .line 42
    aget-object p5, p4, p2

    .line 43
    .line 44
    sget-object p6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 45
    .line 46
    invoke-virtual {p5, p6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v0, p5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    aget-object v1, p4, p2

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    invoke-virtual {v0, p6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p6

    .line 78
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_0
    const/4 p6, 0x0

    .line 83
    :goto_1
    if-nez p6, :cond_1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_1
    move-object p5, p6

    .line 87
    :goto_2
    aput-object p5, p3, p2

    .line 88
    .line 89
    add-int/lit8 p2, p2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iput-object p3, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 93
    .line 94
    iget-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_4

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    check-cast p2, Ljava/util/Map$Entry;

    .line 115
    .line 116
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    check-cast p3, Ljava/lang/String;

    .line 121
    .line 122
    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 123
    .line 124
    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object p5, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-interface {p5, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p5

    .line 137
    if-eqz p5, :cond_3

    .line 138
    .line 139
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object p4, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-static {p3, p4}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世哲楪苏兰(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_4
    new-instance p1, Landroidx/room/飘花落叶言子楪哲苏世兰;

    .line 163
    .line 164
    iget-object p2, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 165
    .line 166
    array-length p2, p2

    .line 167
    invoke-direct {p1, p2}, Landroidx/room/飘花落叶言子楪哲苏世兰;-><init>(I)V

    .line 168
    .line 169
    .line 170
    iput-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/room/飘花落叶言子楪哲苏世兰;

    .line 171
    .line 172
    new-instance p1, Landroidx/room/飘花落叶言子楪哲苏兰世;

    .line 173
    .line 174
    iget-object p2, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 175
    .line 176
    array-length p2, p2

    .line 177
    invoke-direct {p1, p2}, Landroidx/room/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 178
    .line 179
    .line 180
    iput-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroidx/room/飘花落叶言子楪哲苏兰世;

    .line 181
    .line 182
    return-void
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/room/飘花落叶言子世苏兰楪哲;Landroidx/room/飘花落叶言子世苏楪兰哲;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p3, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p3

    .line 9
    check-cast v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;

    .line 10
    .line 11
    iget v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p3}, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p3, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->label:I

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p0, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->I$1:I

    .line 40
    .line 41
    iget p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->I$0:I

    .line 42
    .line 43
    iget-object p2, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->L$2:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, [Ljava/lang/String;

    .line 46
    .line 47
    iget-object v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v4, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, Landroidx/room/飘花落叶言子楪哲兰苏世;

    .line 54
    .line 55
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object p3, p2

    .line 59
    move-object p2, v4

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    return-object p0

    .line 68
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 72
    .line 73
    aget-object p0, p0, p2

    .line 74
    .line 75
    sget-object p2, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;

    .line 76
    .line 77
    const/4 p3, 0x0

    .line 78
    const/4 v2, 0x3

    .line 79
    move v7, v2

    .line 80
    move-object v2, p0

    .line 81
    move p0, v7

    .line 82
    move-object v7, p2

    .line 83
    move-object p2, p1

    .line 84
    move p1, p3

    .line 85
    move-object p3, v7

    .line 86
    :goto_1
    if-ge p1, p0, :cond_4

    .line 87
    .line 88
    aget-object v4, p3, p1

    .line 89
    .line 90
    new-instance v5, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v6, "room_table_modification_trigger_"

    .line 93
    .line 94
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const/16 v6, 0x5f

    .line 101
    .line 102
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    const-string v5, "DROP TRIGGER IF EXISTS `"

    .line 113
    .line 114
    const/16 v6, 0x60

    .line 115
    .line 116
    invoke-static {v6, v5, v4}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    iput-object p2, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->L$0:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->L$1:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p3, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    iput p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->I$0:I

    .line 127
    .line 128
    iput p0, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->I$1:I

    .line 129
    .line 130
    iput v3, v0, Landroidx/room/TriggerBasedInvalidationTracker$stopTrackingTable$1;->label:I

    .line 131
    .line 132
    invoke-static {p2, v4, v0}, Landroidx/room/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/room/飘花落叶言子楪哲兰苏世;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-ne v4, v1, :cond_3

    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_3
    :goto_2
    add-int/2addr p1, v3

    .line 140
    goto :goto_1

    .line 141
    :cond_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 142
    .line 143
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroidx/room/飘花落叶言子世苏兰楪哲;Landroidx/room/飘花落叶言子世苏楪兰哲;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v4, v3, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;

    .line 18
    .line 19
    iget v5, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->label:I

    .line 20
    .line 21
    const/high16 v6, -0x80000000

    .line 22
    .line 23
    and-int v7, v5, v6

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v5, v6

    .line 28
    iput v5, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->label:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;

    .line 32
    .line 33
    invoke-direct {v4, v0, v3}, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v3, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->result:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object v5, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 39
    .line 40
    iget v6, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->label:I

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    const/4 v8, 0x1

    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    if-eq v6, v8, :cond_2

    .line 47
    .line 48
    if-ne v6, v7, :cond_1

    .line 49
    .line 50
    iget v1, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$2:I

    .line 51
    .line 52
    iget v2, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$1:I

    .line 53
    .line 54
    iget v6, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$0:I

    .line 55
    .line 56
    iget-object v9, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, [Ljava/lang/String;

    .line 59
    .line 60
    iget-object v10, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v11, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Landroidx/room/飘花落叶言子楪哲兰苏世;

    .line 67
    .line 68
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move/from16 p3, v8

    .line 72
    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    return-object v0

    .line 82
    :cond_2
    iget v1, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$0:I

    .line 83
    .line 84
    iget-object v2, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Landroidx/room/飘花落叶言子楪哲兰苏世;

    .line 87
    .line 88
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object/from16 v16, v2

    .line 92
    .line 93
    move v2, v1

    .line 94
    move-object/from16 v1, v16

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v3, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v6, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 103
    .line 104
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v6, ", 0)"

    .line 111
    .line 112
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iput-object v1, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    iput v2, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$0:I

    .line 122
    .line 123
    iput v8, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->label:I

    .line 124
    .line 125
    invoke-static {v1, v3, v4}, Landroidx/room/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/room/飘花落叶言子楪哲兰苏世;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-ne v3, v5, :cond_4

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    :goto_1
    iget-object v3, v0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 133
    .line 134
    aget-object v3, v3, v2

    .line 135
    .line 136
    sget-object v6, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v10, 0x3

    .line 140
    move-object v11, v6

    .line 141
    move v6, v2

    .line 142
    move v2, v9

    .line 143
    move-object v9, v11

    .line 144
    move-object v11, v1

    .line 145
    move v1, v10

    .line 146
    move-object v10, v3

    .line 147
    :goto_2
    if-ge v2, v1, :cond_7

    .line 148
    .line 149
    aget-object v3, v9, v2

    .line 150
    .line 151
    iget-boolean v12, v0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Z

    .line 152
    .line 153
    if-eqz v12, :cond_5

    .line 154
    .line 155
    const-string v12, "TEMP"

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    const-string v12, ""

    .line 159
    .line 160
    :goto_3
    new-instance v13, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v14, "room_table_modification_trigger_"

    .line 163
    .line 164
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const/16 v14, 0x5f

    .line 171
    .line 172
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    const-string v14, " TRIGGER IF NOT EXISTS `"

    .line 183
    .line 184
    const-string v15, "` AFTER "

    .line 185
    .line 186
    move/from16 p3, v8

    .line 187
    .line 188
    const-string v8, "CREATE "

    .line 189
    .line 190
    invoke-static {v8, v12, v14, v13, v15}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    const-string v12, " ON `"

    .line 195
    .line 196
    const-string v13, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    .line 197
    .line 198
    invoke-static {v8, v3, v12, v10, v13}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string v3, " AND invalidated = 0; END"

    .line 202
    .line 203
    invoke-static {v8, v3, v6}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    iput-object v11, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$0:Ljava/lang/Object;

    .line 208
    .line 209
    iput-object v10, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$1:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v9, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->L$2:Ljava/lang/Object;

    .line 212
    .line 213
    iput v6, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$0:I

    .line 214
    .line 215
    iput v2, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$1:I

    .line 216
    .line 217
    iput v1, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->I$2:I

    .line 218
    .line 219
    iput v7, v4, Landroidx/room/TriggerBasedInvalidationTracker$startTrackingTable$1;->label:I

    .line 220
    .line 221
    invoke-static {v11, v3, v4}, Landroidx/room/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/room/飘花落叶言子楪哲兰苏世;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    if-ne v3, v5, :cond_6

    .line 226
    .line 227
    :goto_4
    return-object v5

    .line 228
    :cond_6
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    move/from16 v8, p3

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_7
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 234
    .line 235
    return-object v0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/room/飘花落叶言子世苏兰楪哲;Landroidx/room/飘花落叶言子楪哲兰苏世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;

    .line 10
    .line 11
    iget v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p0, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->label:I

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/util/Set;

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    iget-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroidx/room/飘花落叶言子楪哲兰苏世;

    .line 60
    .line 61
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance p0, Landroidx/compose/foundation/text/飘花落叶言子苏世楪兰哲;

    .line 69
    .line 70
    const/16 v1, 0xf

    .line 71
    .line 72
    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/飘花落叶言子苏世楪兰哲;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput v3, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->label:I

    .line 78
    .line 79
    const-string v1, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    .line 80
    .line 81
    invoke-interface {p1, v1, p0, v0}, Landroidx/room/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, p2, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    check-cast p0, Ljava/util/Set;

    .line 89
    .line 90
    move-object v1, p0

    .line 91
    check-cast v1, Ljava/util/Collection;

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_5

    .line 98
    .line 99
    iput-object p0, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    iput v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$checkInvalidatedTables$1;->label:I

    .line 102
    .line 103
    const-string v1, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    .line 104
    .line 105
    invoke-static {p1, v1, v0}, Landroidx/room/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/room/飘花落叶言子楪哲兰苏世;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, p2, :cond_5

    .line 110
    .line 111
    :goto_2
    return-object p2

    .line 112
    :cond_5
    return-object p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object v2, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance v1, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 28
    .line 29
    const-string v2, "Room Invalidation Tracker Refresh"

    .line 30
    .line 31
    invoke-direct {v1, v2}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidationAsync$3;

    .line 35
    .line 36
    invoke-direct {v2, p0, p2, v0}, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidationAsync$3;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x2

    .line 40
    invoke-static {p1, v1, v0, v2, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p0, "coroutineScope"

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲([Ljava/lang/String;Landroidx/room/飘花落叶言子楪苏世兰哲;Landroidx/room/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, [I

    .line 41
    .line 42
    iget-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    move-object p3, p1

    .line 45
    check-cast p3, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto/16 :goto_9

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance p4, Lkotlin/collections/builders/SetBuilder;

    .line 68
    .line 69
    invoke-direct {p4}, Lkotlin/collections/builders/SetBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    array-length v2, p1

    .line 73
    move v6, v4

    .line 74
    :goto_1
    if-ge v6, v2, :cond_4

    .line 75
    .line 76
    aget-object v7, p1, v6

    .line 77
    .line 78
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 79
    .line 80
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v9, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, Ljava/util/Set;

    .line 94
    .line 95
    if-eqz v8, :cond_3

    .line 96
    .line 97
    check-cast v8, Ljava/util/Collection;

    .line 98
    .line 99
    invoke-interface {p4, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    invoke-interface {p4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    invoke-virtual {p4}, Lkotlin/collections/builders/SetBuilder;->build()Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Ljava/util/Collection;

    .line 114
    .line 115
    new-array p4, v4, [Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {p1, p4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, [Ljava/lang/String;

    .line 122
    .line 123
    array-length p4, p1

    .line 124
    new-array v2, p4, [I

    .line 125
    .line 126
    move v6, v4

    .line 127
    :goto_3
    if-ge v6, p4, :cond_6

    .line 128
    .line 129
    aget-object v7, p1, v6

    .line 130
    .line 131
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 132
    .line 133
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v9, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Ljava/util/LinkedHashMap;

    .line 141
    .line 142
    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    check-cast v8, Ljava/lang/Integer;

    .line 147
    .line 148
    if-eqz v8, :cond_5

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    aput v7, v2, v6

    .line 155
    .line 156
    add-int/lit8 v6, v6, 0x1

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    const-string p1, "There is no table with name "

    .line 160
    .line 161
    invoke-virtual {p1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_6
    new-instance v3, Lkotlin/Pair;

    .line 170
    .line 171
    invoke-direct {v3, p1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :goto_4
    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, [I

    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    :try_start_1
    iput-object p3, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    iput v5, v0, Landroidx/room/TriggerBasedInvalidationTracker$refreshInvalidation$1;->label:I

    .line 188
    .line 189
    invoke-virtual {p0, v0}, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p4

    .line 193
    if-ne p4, v1, :cond_7

    .line 194
    .line 195
    return-object v1

    .line 196
    :cond_7
    move-object p0, p1

    .line 197
    :goto_5
    check-cast p4, Ljava/util/Set;

    .line 198
    .line 199
    array-length p1, p0

    .line 200
    if-nez p1, :cond_8

    .line 201
    .line 202
    check-cast p4, Ljava/util/Collection;

    .line 203
    .line 204
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-nez p0, :cond_a

    .line 209
    .line 210
    :goto_6
    move v4, v5

    .line 211
    goto :goto_8

    .line 212
    :cond_8
    array-length p1, p0

    .line 213
    move p2, v4

    .line 214
    :goto_7
    if-ge p2, p1, :cond_a

    .line 215
    .line 216
    aget v0, p0, p2

    .line 217
    .line 218
    new-instance v1, Ljava/lang/Integer;

    .line 219
    .line 220
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 221
    .line 222
    .line 223
    invoke-interface {p4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_9

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_9
    add-int/lit8 p2, p2, 0x1

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_a
    :goto_8
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    invoke-interface {p3}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    return-object p0

    .line 241
    :goto_9
    invoke-interface {p3}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

    .line 59
    .line 60
    iget-object v2, p1, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    invoke-virtual {v2}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_b

    .line 67
    .line 68
    :try_start_1
    iget-object v6, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    invoke-virtual {v6, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_3

    .line 75
    .line 76
    sget-object p0, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    invoke-virtual {v2}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    move-object v0, v2

    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :cond_3
    :try_start_2
    iget-object v6, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 87
    .line 88
    invoke-interface {v6}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    check-cast v6, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-nez v6, :cond_4

    .line 99
    .line 100
    sget-object p0, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    invoke-virtual {v2}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 103
    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_4
    :try_start_3
    new-instance v6, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1;

    .line 107
    .line 108
    invoke-direct {v6, p0, v3}, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 109
    .line 110
    .line 111
    iput-object v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    iput v5, v0, Landroidx/room/TriggerBasedInvalidationTracker$notifyInvalidation$1;->label:I

    .line 114
    .line 115
    invoke-virtual {p1, v4, v6, v0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰哲世(ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    if-ne p1, v1, :cond_5

    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_5
    move-object v0, v2

    .line 123
    :goto_1
    :try_start_4
    check-cast p1, Ljava/util/Set;

    .line 124
    .line 125
    move-object v1, p1

    .line 126
    check-cast v1, Ljava/util/Collection;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_a

    .line 133
    .line 134
    iget-object v1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroidx/room/飘花落叶言子楪哲苏兰世;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_6

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_6
    iget-object v1, v1, Landroidx/room/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 150
    .line 151
    :cond_7
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    move-object v3, v2

    .line 156
    check-cast v3, [I

    .line 157
    .line 158
    array-length v6, v3

    .line 159
    new-array v7, v6, [I

    .line 160
    .line 161
    move v8, v4

    .line 162
    :goto_2
    if-ge v8, v6, :cond_9

    .line 163
    .line 164
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_8

    .line 173
    .line 174
    aget v9, v3, v8

    .line 175
    .line 176
    add-int/2addr v9, v5

    .line 177
    goto :goto_3

    .line 178
    :cond_8
    aget v9, v3, v8

    .line 179
    .line 180
    :goto_3
    aput v9, v7, v8

    .line 181
    .line 182
    add-int/lit8 v8, v8, 0x1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_9
    invoke-virtual {v1, v2, v7}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_7

    .line 190
    .line 191
    :goto_4
    iget-object p0, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 192
    .line 193
    invoke-interface {p0, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 194
    .line 195
    .line 196
    :cond_a
    invoke-virtual {v0}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 197
    .line 198
    .line 199
    return-object p1

    .line 200
    :goto_5
    invoke-virtual {v0}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 201
    .line 202
    .line 203
    throw p0

    .line 204
    :cond_b
    sget-object p0, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 205
    .line 206
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

    .line 57
    .line 58
    iget-object v2, p1, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    invoke-virtual {v2}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    :try_start_1
    new-instance v5, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;

    .line 67
    .line 68
    invoke-direct {v5, p0, v3}, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 69
    .line 70
    .line 71
    iput-object v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    iput v4, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$1;->label:I

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    invoke-virtual {p1, p0, v5, v0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰哲世(ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    if-ne p0, v1, :cond_3

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_3
    move-object p0, v2

    .line 84
    :goto_1
    invoke-virtual {p0}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    move-object p0, v2

    .line 90
    :goto_2
    invoke-virtual {p0}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_4
    :goto_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 95
    .line 96
    return-object p0
.end method
