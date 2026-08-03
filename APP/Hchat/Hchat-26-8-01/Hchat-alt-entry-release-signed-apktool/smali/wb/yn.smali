.class public final synthetic Lwb/yn;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic n:Landroid/content/SharedPreferences;

.field public final synthetic o:Landroid/content/Context;

.field public final synthetic p:Lfg/a;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;

.field public final synthetic w:Li0/a1;

.field public final synthetic x:Li0/a1;

.field public final synthetic y:Li0/a1;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/yn;->n:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/yn;->o:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/yn;->p:Lfg/a;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/yn;->q:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/yn;->r:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/yn;->s:Li0/a1;

    .line 12
    .line 13
    iput-object p7, p0, Lwb/yn;->t:Li0/a1;

    .line 14
    .line 15
    iput-object p8, p0, Lwb/yn;->u:Li0/a1;

    .line 16
    .line 17
    iput-object p9, p0, Lwb/yn;->v:Li0/a1;

    .line 18
    .line 19
    iput-object p10, p0, Lwb/yn;->w:Li0/a1;

    .line 20
    .line 21
    iput-object p11, p0, Lwb/yn;->x:Li0/a1;

    .line 22
    .line 23
    iput-object p12, p0, Lwb/yn;->y:Li0/a1;

    .line 24
    .line 25
    const-class p1, Lgg/k;

    .line 26
    .line 27
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    const-string p6, "KeywordNotificationTemplatePage$save(Landroid/content/SharedPreferences;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V"

    .line 32
    .line 33
    const/4 p7, 0x0

    .line 34
    const/4 p3, 0x0

    .line 35
    const-string p5, "save"

    .line 36
    .line 37
    move-object p2, p0

    .line 38
    invoke-direct/range {p2 .. p7}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lwb/yn;->n:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lwb/yn;->q:Li0/a1;

    .line 8
    .line 9
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    const-string v2, "keyword_notify_keyword_title"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lwb/yn;->r:Li0/a1;

    .line 22
    .line 23
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    const-string v2, "keyword_notify_keyword_content"

    .line 30
    .line 31
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Lwb/yn;->s:Li0/a1;

    .line 36
    .line 37
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "keyword_notify_keyword_toast"

    .line 44
    .line 45
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, Lwb/yn;->t:Li0/a1;

    .line 50
    .line 51
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    const-string v2, "keyword_notify_at_me_title"

    .line 58
    .line 59
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v1, p0, Lwb/yn;->u:Li0/a1;

    .line 64
    .line 65
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    const-string v2, "keyword_notify_at_me_content"

    .line 72
    .line 73
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v1, p0, Lwb/yn;->v:Li0/a1;

    .line 78
    .line 79
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/lang/String;

    .line 84
    .line 85
    const-string v2, "keyword_notify_at_me_toast"

    .line 86
    .line 87
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v1, p0, Lwb/yn;->w:Li0/a1;

    .line 92
    .line 93
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    const-string v2, "keyword_notify_at_all_title"

    .line 100
    .line 101
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v1, p0, Lwb/yn;->x:Li0/a1;

    .line 106
    .line 107
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/lang/String;

    .line 112
    .line 113
    const-string v2, "keyword_notify_at_all_content"

    .line 114
    .line 115
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v1, p0, Lwb/yn;->y:Li0/a1;

    .line 120
    .line 121
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Ljava/lang/String;

    .line 126
    .line 127
    const-string v2, "keyword_notify_at_all_toast"

    .line 128
    .line 129
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 134
    .line 135
    .line 136
    const-string v0, "\u6a21\u677f\u5df2\u4fdd\u5b58"

    .line 137
    .line 138
    const/4 v1, 0x0

    .line 139
    iget-object v2, p0, Lwb/yn;->o:Landroid/content/Context;

    .line 140
    .line 141
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lwb/yn;->p:Lfg/a;

    .line 149
    .line 150
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 154
    .line 155
    return-object v0
.end method
