.class public final synthetic Lca/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/io/Serializable;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p9, p0, Lca/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/n;->h:Ljava/io/Serializable;

    .line 4
    .line 5
    iput-object p2, p0, Lca/n;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lca/n;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lca/n;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lca/n;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p6, p0, Lca/n;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p7, p0, Lca/n;->n:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p8, p0, Lca/n;->o:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lca/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lca/n;->h:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lca/n;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lfb/b;

    .line 13
    .line 14
    iget-object v2, p0, Lca/n;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroid/content/Context;

    .line 17
    .line 18
    iget-object v3, p0, Lca/n;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Ljava/io/Serializable;

    .line 21
    .line 22
    iget-object v4, p0, Lca/n;->l:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Lgg/u;

    .line 25
    .line 26
    iget-object v5, p0, Lca/n;->m:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Li0/a1;

    .line 29
    .line 30
    iget-object v6, p0, Lca/n;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Li0/a1;

    .line 33
    .line 34
    iget-object v7, p0, Lca/n;->o:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Li0/a1;

    .line 37
    .line 38
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v5, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    invoke-static {v7, v5, v6}, Lwb/y2;->L0(Li0/a1;J)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v1, Lfb/b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    instance-of v0, v3, Lsf/f;

    .line 69
    .line 70
    if-nez v0, :cond_0

    .line 71
    .line 72
    iget-object v0, v4, Lgg/u;->g:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ljava/lang/String;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v0, "\u81ea\u52a8\u538b\u7f29\u5931\u8d25\uff0c\u5df2\u4f7f\u7528\u539f\u4e0a\u4e0b\u6587"

    .line 78
    .line 79
    :goto_0
    const/4 v1, 0x0

    .line 80
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 85
    .line 86
    .line 87
    :cond_1
    return-void

    .line 88
    :pswitch_0
    iget-object v0, p0, Lca/n;->h:Ljava/io/Serializable;

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 92
    .line 93
    iget-object v0, p0, Lca/n;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 96
    .line 97
    iget-object v1, p0, Lca/n;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lwb/kv;

    .line 100
    .line 101
    iget-object v3, p0, Lca/n;->k:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Landroid/app/Activity;

    .line 104
    .line 105
    iget-object v4, p0, Lca/n;->m:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v5, v4

    .line 108
    check-cast v5, Lfg/l;

    .line 109
    .line 110
    iget-object v4, p0, Lca/n;->n:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v6, v4

    .line 113
    check-cast v6, Lca/e0;

    .line 114
    .line 115
    iget-object v4, p0, Lca/n;->o:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v7, v4

    .line 118
    check-cast v7, Lp8/v;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    const/4 v4, 0x1

    .line 128
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, Lwb/kv;->close()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    new-instance v1, Lc9/w;

    .line 147
    .line 148
    iget-object v4, p0, Lca/n;->l:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-direct/range {v1 .. v7}, Lc9/w;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Activity;Ljava/lang/Object;Lfg/l;Lca/e0;Lp8/v;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 154
    .line 155
    .line 156
    :cond_3
    :goto_1
    return-void

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
