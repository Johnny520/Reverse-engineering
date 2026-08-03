.class public final Lh/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/z;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lh/f;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lh/f;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lh/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lh/f;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lh/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh/f;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/content/SharedPreferences;

    .line 9
    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lh/f;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Li0/a1;

    .line 17
    .line 18
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const-string v3, "[\u5df2\u5220\u9664]"

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    move-object v1, v3

    .line 33
    :cond_0
    const-string v2, "sns_custom_mark_text"

    .line 34
    .line 35
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, Lh/f;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Li0/a1;

    .line 42
    .line 43
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v3, v1

    .line 57
    :goto_0
    const-string v1, "sns_comment_custom_mark_text"

    .line 58
    .line 59
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_0
    iget-object v0, p0, Lh/f;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lv0/d;

    .line 70
    .line 71
    iget-object v1, v0, Lv0/d;->h:Lf/k0;

    .line 72
    .line 73
    iget-object v2, p0, Lh/f;->b:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v3, p0, Lh/f;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Lv0/i;

    .line 82
    .line 83
    if-ne v1, v3, :cond_3

    .line 84
    .line 85
    iget-object v0, v0, Lv0/d;->g:Ljava/util/Map;

    .line 86
    .line 87
    invoke-virtual {v3}, Lv0/i;->c()Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_3
    :goto_1
    return-void

    .line 105
    :pswitch_1
    iget-object v0, p0, Lh/f;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lw0/p;

    .line 108
    .line 109
    iget-object v1, p0, Lh/f;->b:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lw0/p;->remove(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lh/f;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Lh/t;

    .line 117
    .line 118
    iget-object v0, v0, Lh/t;->c:Lf/k0;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
