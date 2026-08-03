.class public final synthetic Li8/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lp8/d0;


# direct methods
.method public synthetic constructor <init>(Lp8/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Li8/h;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Li8/h;->h:Lp8/d0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Li8/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li8/h;->h:Lp8/d0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lp8/d0;->i()Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Li8/h;->h:Lp8/d0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lp8/d0;->g()Lp8/h;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    invoke-virtual {v0}, Lp8/h;->k()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_5

    .line 25
    .line 26
    iget-object v2, v0, Lp8/h;->g:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object v2, Lp8/h;->l:Ljava/util/List;

    .line 32
    .line 33
    new-instance v3, Lc9/k1;

    .line 34
    .line 35
    const/16 v4, 0xb

    .line 36
    .line 37
    invoke-direct {v3, v0, v1, v4}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    const-string v4, "sns_info_get_by_id_v1"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v3, v4}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iput-object v2, v0, Lp8/h;->g:Ljava/lang/reflect/Method;

    .line 49
    .line 50
    :cond_1
    :goto_0
    iget-object v2, v0, Lp8/h;->h:Ljava/lang/reflect/Method;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v2, Lp8/h;->m:Ljava/util/List;

    .line 56
    .line 57
    new-instance v3, Lc9/k1;

    .line 58
    .line 59
    const/16 v4, 0xc

    .line 60
    .line 61
    invoke-direct {v3, v0, v1, v4}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    const-string v4, "sns_info_get_by_user_v1"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v3, v4}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    iput-object v2, v0, Lp8/h;->h:Ljava/lang/reflect/Method;

    .line 73
    .line 74
    :cond_3
    :goto_1
    iget-object v2, v0, Lp8/h;->i:Ljava/lang/reflect/Method;

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    sget-object v2, Lp8/h;->n:Ljava/util/List;

    .line 80
    .line 81
    new-instance v3, Lc9/k1;

    .line 82
    .line 83
    const/16 v4, 0xd

    .line 84
    .line 85
    invoke-direct {v3, v0, v1, v4}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    const-string v1, "sns_info_get_timeline_v1"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v3, v1}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    iput-object v1, v0, Lp8/h;->i:Ljava/lang/reflect/Method;

    .line 97
    .line 98
    :cond_5
    :goto_2
    return-void

    .line 99
    :pswitch_1
    iget-object v0, p0, Li8/h;->h:Lp8/d0;

    .line 100
    .line 101
    invoke-virtual {v0}, Lp8/d0;->h()Lp8/x;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {v0}, Lp8/x;->g()Ljava/lang/reflect/Method;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lp8/x;->f()Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lp8/x;->h()Ljava/lang/reflect/Constructor;

    .line 114
    .line 115
    .line 116
    :cond_6
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
