.class public final synthetic Lr9/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr9/d0;


# direct methods
.method public synthetic constructor <init>(Lr9/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr9/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lr9/b;->b:Lr9/d0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget p1, p0, Lr9/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr9/b;->b:Lr9/d0;

    .line 7
    .line 8
    const-string v0, "hide_chat_avatar_other"

    .line 9
    .line 10
    const-string v1, "hide_chat_avatar_self"

    .line 11
    .line 12
    if-eqz p2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const v3, -0x34fc38c

    .line 19
    .line 20
    .line 21
    if-eq v2, v3, :cond_1

    .line 22
    .line 23
    const v3, 0x4a38d568    # 3028314.0f

    .line 24
    .line 25
    .line 26
    if-eq v2, v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object p2, p1, Lr9/d0;->d:Landroid/content/SharedPreferences;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-interface {p2, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iput-boolean p2, p1, Lr9/d0;->C:Z

    .line 51
    .line 52
    iget-object p2, p1, Lr9/d0;->d:Landroid/content/SharedPreferences;

    .line 53
    .line 54
    invoke-interface {p2, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iput-boolean p2, p1, Lr9/d0;->D:Z

    .line 59
    .line 60
    invoke-virtual {p1}, Lr9/d0;->q0()V

    .line 61
    .line 62
    .line 63
    :cond_3
    :goto_0
    return-void

    .line 64
    :pswitch_0
    iget-object p1, p0, Lr9/b;->b:Lr9/d0;

    .line 65
    .line 66
    sget-object v0, Lr9/d0;->N:Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-static {v0, p2}, Ltf/m;->o1(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, Lr9/d0;->m0()Lr9/z;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p1, Lr9/d0;->B:Lr9/z;

    .line 79
    .line 80
    :cond_4
    sget-object v0, Lr9/d0;->L:Ljava/util/Set;

    .line 81
    .line 82
    check-cast v0, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-static {v0, p2}, Ltf/m;->o1(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    iget-object p2, p1, Lr9/d0;->u:Ljava/util/Set;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    monitor-enter p2

    .line 96
    :try_start_0
    iget-object v0, p1, Lr9/d0;->u:Ljava/util/Set;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast v0, Ljava/lang/Iterable;

    .line 102
    .line 103
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    monitor-exit p2

    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Landroid/widget/TextView;

    .line 123
    .line 124
    new-instance v1, Lr9/l;

    .line 125
    .line 126
    const/4 v2, 0x1

    .line 127
    invoke-direct {v1, v0, p1, v2}, Lr9/l;-><init>(Landroid/widget/TextView;Lr9/d0;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :catchall_0
    move-exception p1

    .line 135
    monitor-exit p2

    .line 136
    throw p1

    .line 137
    :cond_5
    sget-object v0, Lr9/d0;->M:Ljava/util/LinkedHashSet;

    .line 138
    .line 139
    invoke-static {v0, p2}, Ltf/m;->o1(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-eqz p2, :cond_6

    .line 144
    .line 145
    invoke-virtual {p1}, Lr9/d0;->q0()V

    .line 146
    .line 147
    .line 148
    :cond_6
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
