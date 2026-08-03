.class public final Ly1/n;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly1/t;


# direct methods
.method public synthetic constructor <init>(Ly1/t;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly1/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ly1/n;->h:Ly1/t;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ly1/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly1/n;->h:Ly1/t;

    .line 7
    .line 8
    invoke-static {v0}, Ly1/t;->i(Ly1/t;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Ly1/n;->h:Ly1/t;

    .line 14
    .line 15
    iget-object v1, v0, Ly1/t;->C0:Landroid/view/MotionEvent;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x7

    .line 24
    if-eq v1, v2, :cond_0

    .line 25
    .line 26
    const/16 v2, 0x9

    .line 27
    .line 28
    if-eq v1, v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    iput-wide v1, v0, Ly1/t;->D0:J

    .line 36
    .line 37
    iget-object v1, v0, Ly1/t;->I0:Lrg/f;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    iget-object v0, p0, Ly1/n;->h:Ly1/t;

    .line 46
    .line 47
    invoke-virtual {v0}, Ly1/t;->getConfiguration()Landroid/content/res/Configuration;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Ld3/a;

    .line 56
    .line 57
    new-instance v2, Ld3/b;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Ld3/b;-><init>(Landroid/os/LocaleList;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v1, v2}, Ld3/a;-><init>(Ld3/b;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v1, Ld3/a;

    .line 76
    .line 77
    new-instance v2, Ld3/b;

    .line 78
    .line 79
    invoke-direct {v2, v0}, Ld3/b;-><init>(Landroid/os/LocaleList;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, v2}, Ld3/a;-><init>(Ld3/b;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    iget-object v0, v1, Ld3/a;->a:Ld3/b;

    .line 86
    .line 87
    iget-object v0, v0, Ld3/b;->a:Landroid/os/LocaleList;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    new-instance v2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    :goto_1
    if-ge v3, v1, :cond_3

    .line 100
    .line 101
    new-instance v4, Lp2/a;

    .line 102
    .line 103
    invoke-virtual {v0, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-direct {v4, v5}, Lp2/a;-><init>(Ljava/util/Locale;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    new-instance v0, Lp2/b;

    .line 120
    .line 121
    invoke-direct {v0, v2}, Lp2/b;-><init>(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_2
    iget-object v0, p0, Ly1/n;->h:Ly1/t;

    .line 126
    .line 127
    iget-object v0, v0, Ly1/t;->w:Li0/j1;

    .line 128
    .line 129
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
