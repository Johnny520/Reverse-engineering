.class public final synthetic Lwb/bg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/bg;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/bg;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/bg;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/bg;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/bg;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/bg;->j:Li0/a1;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-interface {v0, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lwb/bg;->h:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "bubble_dark_icon"

    .line 26
    .line 27
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lwb/bg;->i:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v0, v1}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    const-string v2, "bubble-dark-"

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Lwb/tc;

    .line 53
    .line 54
    const/16 v2, 0x8

    .line 55
    .line 56
    iget-object v3, p0, Lwb/bg;->h:Landroid/content/SharedPreferences;

    .line 57
    .line 58
    iget-object v4, p0, Lwb/bg;->i:Landroid/content/Context;

    .line 59
    .line 60
    iget-object v5, p0, Lwb/bg;->j:Li0/a1;

    .line 61
    .line 62
    invoke-direct {v1, v3, v4, v5, v2}, Lwb/tc;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v4, v0, v1}, Lwb/ho;->U0(Landroid/content/Context;Ljava/lang/String;Lfg/l;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_1
    iget-object v0, p0, Lwb/bg;->j:Li0/a1;

    .line 70
    .line 71
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    const-string v2, ""

    .line 78
    .line 79
    invoke-interface {v0, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lwb/bg;->h:Landroid/content/SharedPreferences;

    .line 83
    .line 84
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v2, "bubble_icon"

    .line 89
    .line 90
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lwb/bg;->i:Landroid/content/Context;

    .line 98
    .line 99
    invoke-static {v0, v1}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    const-string v2, "bubble-"

    .line 108
    .line 109
    invoke-static {v0, v1, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v1, Lwb/tc;

    .line 114
    .line 115
    const/16 v2, 0x9

    .line 116
    .line 117
    iget-object v3, p0, Lwb/bg;->h:Landroid/content/SharedPreferences;

    .line 118
    .line 119
    iget-object v4, p0, Lwb/bg;->i:Landroid/content/Context;

    .line 120
    .line 121
    iget-object v5, p0, Lwb/bg;->j:Li0/a1;

    .line 122
    .line 123
    invoke-direct {v1, v3, v4, v5, v2}, Lwb/tc;-><init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v4, v0, v1}, Lwb/ho;->U0(Landroid/content/Context;Ljava/lang/String;Lfg/l;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
