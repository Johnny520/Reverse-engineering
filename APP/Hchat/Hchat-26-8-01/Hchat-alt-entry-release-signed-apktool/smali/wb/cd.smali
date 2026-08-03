.class public final synthetic Lwb/cd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/cd;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/cd;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/cd;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/cd;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    move-object v5, p2

    .line 6
    check-cast v5, Li0/h0;

    .line 7
    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    and-int/lit8 p1, p2, 0x11

    .line 18
    .line 19
    const/16 p3, 0x10

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p1, p3, :cond_0

    .line 26
    .line 27
    move p1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    and-int/2addr p2, v0

    .line 31
    invoke-virtual {v5, p2, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const-string v4, "keyword_notify_at_all_ringtone"

    .line 38
    .line 39
    const/16 v6, 0x6d80

    .line 40
    .line 41
    iget-object v0, p0, Lwb/cd;->h:Landroid/content/Context;

    .line 42
    .line 43
    iget-object v1, p0, Lwb/cd;->i:Landroid/content/SharedPreferences;

    .line 44
    .line 45
    const-string v2, "keyword_notify_at_all_sound"

    .line 46
    .line 47
    const-string v3, "keyword_notify_at_all_vibrate"

    .line 48
    .line 49
    invoke-static/range {v0 .. v6}, Lwb/ho;->E1(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li0/h0;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 54
    .line 55
    .line 56
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_0
    const/4 v0, 0x1

    .line 60
    if-eq p1, p3, :cond_2

    .line 61
    .line 62
    move p1, v0

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const/4 p1, 0x0

    .line 65
    :goto_2
    and-int/2addr p2, v0

    .line 66
    invoke-virtual {v5, p2, p1}, Li0/h0;->S(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    const-string v4, "keyword_notify_at_me_ringtone"

    .line 73
    .line 74
    const/16 v6, 0x6d80

    .line 75
    .line 76
    iget-object v0, p0, Lwb/cd;->h:Landroid/content/Context;

    .line 77
    .line 78
    iget-object v1, p0, Lwb/cd;->i:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    const-string v2, "keyword_notify_at_me_sound"

    .line 81
    .line 82
    const-string v3, "keyword_notify_at_me_vibrate"

    .line 83
    .line 84
    invoke-static/range {v0 .. v6}, Lwb/ho;->E1(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li0/h0;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 89
    .line 90
    .line 91
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_1
    const/4 v0, 0x1

    .line 95
    if-eq p1, p3, :cond_4

    .line 96
    .line 97
    move p1, v0

    .line 98
    goto :goto_4

    .line 99
    :cond_4
    const/4 p1, 0x0

    .line 100
    :goto_4
    and-int/2addr p2, v0

    .line 101
    invoke-virtual {v5, p2, p1}, Li0/h0;->S(IZ)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    const-string v4, "keyword_notify_keyword_ringtone"

    .line 108
    .line 109
    const/16 v6, 0x6d80

    .line 110
    .line 111
    iget-object v0, p0, Lwb/cd;->h:Landroid/content/Context;

    .line 112
    .line 113
    iget-object v1, p0, Lwb/cd;->i:Landroid/content/SharedPreferences;

    .line 114
    .line 115
    const-string v2, "keyword_notify_keyword_sound"

    .line 116
    .line 117
    const-string v3, "keyword_notify_keyword_vibrate"

    .line 118
    .line 119
    invoke-static/range {v0 .. v6}, Lwb/ho;->E1(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li0/h0;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_5
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 124
    .line 125
    .line 126
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
