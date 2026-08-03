.class public final synthetic Lwb/fc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Landroid/content/SharedPreferences;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Z

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lwb/fc;->g:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    iput-object p11, p0, Lwb/fc;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p12, p0, Lwb/fc;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p14, p0, Lwb/fc;->j:Z

    .line 11
    .line 12
    iput-object p1, p0, Lwb/fc;->k:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p13, p0, Lwb/fc;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p3, p0, Lwb/fc;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p4, p0, Lwb/fc;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p5, p0, Lwb/fc;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p6, p0, Lwb/fc;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p7, p0, Lwb/fc;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p8, p0, Lwb/fc;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p9, p0, Lwb/fc;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p10, p0, Lwb/fc;->t:Li0/a1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lwb/fc;->g:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lwb/fc;->h:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    iget-object v4, p0, Lwb/fc;->i:Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-boolean v2, p0, Lwb/fc;->j:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const-string v4, "fake_like_use_non_friends"

    .line 26
    .line 27
    invoke-interface {v1, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, "fake_like_random_order"

    .line 32
    .line 33
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "fake_like_auto_select"

    .line 38
    .line 39
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "fake_like_auto_select_count"

    .line 44
    .line 45
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "fake_like_excluded_ids"

    .line 50
    .line 51
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const-string v5, "fake_like_hide_menu"

    .line 56
    .line 57
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, "fake_like_menu_text"

    .line 62
    .line 63
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const-string v4, "fake_comment_use_non_friends"

    .line 68
    .line 69
    invoke-interface {v1, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "fake_comment_hide_menu"

    .line 74
    .line 75
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const-string v5, "fake_comment_menu_text"

    .line 80
    .line 81
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 82
    .line 83
    .line 84
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-object v4, p0, Lwb/fc;->k:Landroid/content/Context;

    .line 89
    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    const-string v0, "\u6062\u590d\u9ed8\u8ba4\u5931\u8d25"

    .line 93
    .line 94
    invoke-static {v4, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 103
    .line 104
    iget-object v3, p0, Lwb/fc;->m:Li0/a1;

    .line 105
    .line 106
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Lwb/fc;->n:Li0/a1;

    .line 110
    .line 111
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object v3, p0, Lwb/fc;->o:Li0/a1;

    .line 115
    .line 116
    iget-object v5, p0, Lwb/fc;->l:Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {v3, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v3, p0, Lwb/fc;->p:Li0/a1;

    .line 122
    .line 123
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    if-eqz v2, :cond_2

    .line 127
    .line 128
    iget-object v3, p0, Lwb/fc;->q:Li0/a1;

    .line 129
    .line 130
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v3, p0, Lwb/fc;->r:Li0/a1;

    .line 134
    .line 135
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const-string v1, "50"

    .line 139
    .line 140
    iget-object v3, p0, Lwb/fc;->s:Li0/a1;

    .line 141
    .line 142
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v1, Ltf/v;->g:Ltf/v;

    .line 146
    .line 147
    iget-object v3, p0, Lwb/fc;->t:Li0/a1;

    .line 148
    .line 149
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    const-string v1, "\u5df2\u6062\u590d\u9ed8\u8ba4"

    .line 153
    .line 154
    invoke-static {v4, v0, v1, v2}, Lwb/ho;->S6(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 158
    .line 159
    return-object v0
.end method
