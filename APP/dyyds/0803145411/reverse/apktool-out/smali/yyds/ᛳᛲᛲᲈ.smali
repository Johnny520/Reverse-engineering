.class public final synthetic Lyyds/ᛳᛲᛲᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᛶᲀᲈᛵ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᲀᲈᛵ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛳᛲᛲᲈ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᛲᛲᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲀᲈᛵ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛳᛲᛲᲈ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const-wide v2, -0x49bd3e68a836eL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-wide v5, -0x49bfde68a836eL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛳᛲᛲᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲀᲈᛵ;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v0, Lyyds/ᛵᛸᲇᲈ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 29
    .line 30
    if-ne v0, p0, :cond_0

    .line 31
    .line 32
    sput-object v4, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 33
    .line 34
    :cond_0
    sget-object p0, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 35
    .line 36
    sget-object v0, Lcom/ss/android/ugc/awemes/MainApp;->ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Lyyds/ᲁᲀᲁᛸ;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    check-cast v2, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v3, Lyyds/ᲈᛷᛲᛸ;

    .line 69
    .line 70
    invoke-direct {v3, v2, v1, p0}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return-void

    .line 78
    :pswitch_0
    sget-object v0, Lyyds/ᛵᛸᲇᲈ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    sget-object v0, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 87
    .line 88
    if-ne v0, p0, :cond_3

    .line 89
    .line 90
    sput-object v4, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 91
    .line 92
    :cond_3
    sget-object p0, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 93
    .line 94
    sget-object v0, Lcom/ss/android/ugc/awemes/MainApp;->ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    :cond_4
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Lyyds/ᲁᲀᲁᛸ;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    check-cast v2, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v3, Lyyds/ᲈᛷᛲᛸ;

    .line 127
    .line 128
    invoke-direct {v3, v2, v1, p0}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
