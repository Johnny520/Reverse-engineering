.class public final synthetic Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:J

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    iget-wide v1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 11
    .line 12
    iget-object p0, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    iget-object v3, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 18
    .line 19
    .line 20
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :try_start_1
    iget v3, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :try_start_2
    iget-wide v3, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    cmp-long v1, v3, v1

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 v1, 0x0

    .line 40
    :try_start_3
    iput-object v1, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰:Ljava/util/concurrent/ScheduledFuture;

    .line 41
    .line 42
    iget-boolean v1, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    :try_start_4
    sget-object v1, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    iget-object v1, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v2, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v3, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    iget-object v1, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    invoke-virtual {v0}, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iget-object v2, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v3, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;

    .line 84
    .line 85
    invoke-static {v2, v3}, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lorg/luckypray/dexkit/飘花落叶言子楪苏世兰哲;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 86
    .line 87
    .line 88
    monitor-exit p0

    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    iget-object p0, v0, L飘花落叶言苏子兰楪世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 92
    .line 93
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    :goto_0
    monitor-exit p0

    .line 100
    :cond_6
    :goto_1
    return-void

    .line 101
    :goto_2
    monitor-exit p0

    .line 102
    throw v0

    .line 103
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世兰哲;

    .line 106
    .line 107
    iget-wide v1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 108
    .line 109
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget-object v1, v0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/TextInputLayout;

    .line 114
    .line 115
    iget-object v2, v0, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 116
    .line 117
    const/16 v3, 0x20

    .line 118
    .line 119
    const/16 v4, 0xa0

    .line 120
    .line 121
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {v2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {v1, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
