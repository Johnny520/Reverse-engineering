.class public final synthetic Lwb/ec;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ec;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ec;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ec;->i:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iput-boolean p3, p0, Lwb/ec;->j:Z

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ZLandroid/content/SharedPreferences;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lwb/ec;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ec;->h:Landroid/content/Context;

    iput-boolean p2, p0, Lwb/ec;->j:Z

    iput-object p3, p0, Lwb/ec;->i:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/ec;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lwb/ec;->j:Z

    .line 7
    .line 8
    const-string v1, "\u5df2\u6e05\u9664"

    .line 9
    .line 10
    iget-object v2, p0, Lwb/ec;->h:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, p0, Lwb/ec;->i:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    invoke-static {v2, v3, v1, v0}, Lwb/ho;->S6(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, Lwb/ec;

    .line 21
    .line 22
    iget-object v1, p0, Lwb/ec;->h:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v2, p0, Lwb/ec;->i:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    iget-boolean v3, p0, Lwb/ec;->j:Z

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v3}, Lwb/ec;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Z)V

    .line 29
    .line 30
    .line 31
    instance-of v2, v1, Landroid/app/Activity;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    check-cast v1, Landroid/app/Activity;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v1, v4

    .line 40
    :goto_0
    if-eqz v1, :cond_1

    .line 41
    .line 42
    move-object v5, v1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1}, Lq8/o;->a()Landroid/app/Activity;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-object v1, v4

    .line 56
    :goto_1
    if-eqz v1, :cond_3

    .line 57
    .line 58
    move-object v4, v1

    .line 59
    :cond_3
    if-eqz v4, :cond_6

    .line 60
    .line 61
    move-object v5, v4

    .line 62
    :goto_2
    if-eqz v3, :cond_4

    .line 63
    .line 64
    const-string v1, "\u6e05\u9664\u4f2a\u96c6\u8d5e"

    .line 65
    .line 66
    :goto_3
    move-object v6, v1

    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const-string v1, "\u6e05\u9664\u4f2a\u8bc4\u8bba"

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :goto_4
    if-eqz v3, :cond_5

    .line 72
    .line 73
    const-string v1, "\u6e05\u7a7a\u5168\u90e8\u670b\u53cb\u5708\u5df2\u4fdd\u5b58\u7684\u672c\u5730\u70b9\u8d5e\uff1f"

    .line 74
    .line 75
    :goto_5
    move-object v7, v1

    .line 76
    goto :goto_6

    .line 77
    :cond_5
    const-string v1, "\u6e05\u7a7a\u5168\u90e8\u670b\u53cb\u5708\u5df2\u4fdd\u5b58\u7684\u672c\u5730\u8bc4\u8bba\uff1f"

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :goto_6
    new-instance v8, Lnb/a;

    .line 81
    .line 82
    const/16 v1, 0x18

    .line 83
    .line 84
    invoke-direct {v8, v0, v1}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    new-instance v9, Lk/s1;

    .line 88
    .line 89
    const/16 v0, 0x19

    .line 90
    .line 91
    invoke-direct {v9, v0}, Lk/s1;-><init>(I)V

    .line 92
    .line 93
    .line 94
    sget-object v10, Lwb/lv;->j:Lwb/lv;

    .line 95
    .line 96
    invoke-static/range {v5 .. v10}, Lwb/y2;->S1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 97
    .line 98
    .line 99
    :cond_6
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object v0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
