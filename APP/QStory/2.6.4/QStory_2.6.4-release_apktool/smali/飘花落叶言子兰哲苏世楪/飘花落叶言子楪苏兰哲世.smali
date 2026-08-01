.class public final L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/locks/ReentrantLock;

.field public static volatile 飘花落叶言子楪世哲苏兰:L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏哲兰世;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Landroid/app/Activity;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Landroid/app/Activity;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v1

    .line 13
    :goto_0
    if-eqz p1, :cond_c

    .line 14
    .line 15
    sget-object v0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/locks/ReentrantLock;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 18
    .line 19
    .line 20
    :try_start_0
    iget-object v2, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    new-instance p0, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 25
    .line 26
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3, p0}, Landroidx/core/util/飘花落叶言子楪世苏哲兰;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    iget-object p0, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    :try_start_1
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;

    .line 68
    .line 69
    iget-object v5, v5, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroid/app/Activity;

    .line 70
    .line 71
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_3

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    :cond_4
    :goto_1
    new-instance v4, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;

    .line 79
    .line 80
    invoke-direct {v4, p1, p2, p3}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;-><init>(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    if-nez v3, :cond_7

    .line 87
    .line 88
    check-cast v2, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏哲兰世;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_5

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-eqz p0, :cond_5

    .line 101
    .line 102
    iget-object v1, p0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 103
    .line 104
    :cond_5
    if-eqz v1, :cond_6

    .line 105
    .line 106
    invoke-virtual {v2, v1, p1}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Landroid/os/IBinder;Landroid/app/Activity;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    new-instance p0, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;

    .line 111
    .line 112
    invoke-direct {p0, v2, p1}, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;-><init>(L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏哲兰世;Landroid/app/Activity;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-eqz p2, :cond_9

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    move-object p3, p2

    .line 142
    check-cast p3, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;

    .line 143
    .line 144
    iget-object p3, p3, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroid/app/Activity;

    .line 145
    .line 146
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    if-eqz p3, :cond_8

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_9
    move-object p2, v1

    .line 154
    :goto_2
    check-cast p2, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;

    .line 155
    .line 156
    if-eqz p2, :cond_a

    .line 157
    .line 158
    iget-object v1, p2, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 159
    .line 160
    :cond_a
    if-eqz v1, :cond_b

    .line 161
    .line 162
    iput-object v1, v4, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 163
    .line 164
    iget-object p0, v4, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/Executor;

    .line 165
    .line 166
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 167
    .line 168
    const/16 p2, 0x14

    .line 169
    .line 170
    invoke-direct {p1, v4, p2, v1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    .line 175
    .line 176
    :cond_b
    :goto_3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :goto_4
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 181
    .line 182
    .line 183
    throw p0

    .line 184
    :cond_c
    new-instance p0, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;

    .line 185
    .line 186
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 187
    .line 188
    invoke-direct {p0, p1}, Landroidx/window/layout/飘花落叶言子楪苏兰世哲;-><init>(Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {p3, p0}, Landroidx/core/util/飘花落叶言子楪世苏哲兰;->accept(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/core/util/飘花落叶言子楪世苏哲兰;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;

    .line 38
    .line 39
    iget-object v4, v3, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/core/util/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    if-ne v4, p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    iget-object p1, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_7

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;

    .line 69
    .line 70
    iget-object v1, v1, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroid/app/Activity;

    .line 71
    .line 72
    iget-object v2, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 73
    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;

    .line 98
    .line 99
    iget-object v3, v3, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroid/app/Activity;

    .line 100
    .line 101
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    :goto_2
    iget-object v2, p0, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    check-cast v2, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏哲兰世;

    .line 113
    .line 114
    invoke-virtual {v2, v1}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲(Landroid/app/Activity;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_7
    monitor-exit v0

    .line 119
    return-void

    .line 120
    :goto_3
    monitor-exit v0

    .line 121
    throw p0
.end method
