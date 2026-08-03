.class public final synthetic Lwb/j8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/v0;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/v0;Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/j8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/j8;->h:Lwb/v0;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/j8;->i:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/j8;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/j8;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/util/List;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/j8;->h:Lwb/v0;

    .line 12
    .line 13
    iget-object v0, v0, Lwb/v0;->e:Lfg/l;

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lwb/s0;

    .line 39
    .line 40
    iget-object v3, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v1}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const-string v0, " \u9879"

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    const-string v2, "\u5df2\u9009\u62e9 "

    .line 61
    .line 62
    iget-object v3, p0, Lwb/j8;->i:Landroid/content/Context;

    .line 63
    .line 64
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    iget-object v0, p0, Lwb/j8;->j:Li0/a1;

    .line 69
    .line 70
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lwb/j8;->h:Lwb/v0;

    .line 80
    .line 81
    iget-object v0, v0, Lwb/v0;->e:Lfg/l;

    .line 82
    .line 83
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lwb/s0;

    .line 107
    .line 108
    iget-object v3, v3, Lwb/s0;->a:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_1
    invoke-static {v1}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    const-string v0, " \u9879"

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    const-string v2, "\u5df2\u9009\u62e9 "

    .line 129
    .line 130
    iget-object v3, p0, Lwb/j8;->i:Landroid/content/Context;

    .line 131
    .line 132
    invoke-static {v2, p1, v0, v3, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x0

    .line 136
    iget-object v0, p0, Lwb/j8;->j:Li0/a1;

    .line 137
    .line 138
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
