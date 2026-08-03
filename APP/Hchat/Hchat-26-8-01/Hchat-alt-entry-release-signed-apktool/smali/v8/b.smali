.class public final synthetic Lv8/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lv8/q;

.field public final synthetic i:Lv8/h;


# direct methods
.method public synthetic constructor <init>(Lv8/h;Lv8/q;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lv8/b;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv8/b;->i:Lv8/h;

    .line 8
    .line 9
    iput-object p2, p0, Lv8/b;->h:Lv8/q;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lv8/q;Lv8/h;I)V
    .locals 0

    .line 12
    iput p3, p0, Lv8/b;->g:I

    iput-object p1, p0, Lv8/b;->h:Lv8/q;

    iput-object p2, p0, Lv8/b;->i:Lv8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lv8/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv8/b;->h:Lv8/q;

    .line 7
    .line 8
    iget-object v1, p0, Lv8/b;->i:Lv8/h;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lv8/q;->k(Lv8/h;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lv8/b;->i:Lv8/h;

    .line 17
    .line 18
    iget-boolean v1, v0, Lv8/h;->q:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lv8/b;->h:Lv8/q;

    .line 23
    .line 24
    iget-object v2, v1, Lv8/q;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 25
    .line 26
    iget-object v3, v0, Lv8/h;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 v2, 0x0

    .line 36
    iput-boolean v2, v0, Lv8/h;->q:Z

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    iput-boolean v2, v0, Lv8/h;->r:Z

    .line 40
    .line 41
    const-string v2, "\u7b49\u5f85\u4e0b\u8f7d\u5b8c\u6210\u56de\u8c03\u8d85\u65f6"

    .line 42
    .line 43
    iput-object v2, v0, Lv8/h;->s:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lv8/q;->k(Lv8/h;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    iget-object v0, p0, Lv8/b;->i:Lv8/h;

    .line 52
    .line 53
    iget-object v1, v0, Lv8/h;->n:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v0, v0, Lv8/h;->o:Ljava/lang/String;

    .line 56
    .line 57
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, Lr9/p;

    .line 66
    .line 67
    const/16 v2, 0x10

    .line 68
    .line 69
    invoke-direct {v1, v2}, Lr9/p;-><init>(I)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Lng/i;

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    invoke-direct {v2, v0, v3, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Lng/m;->S(Lng/j;)Lng/c;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sget-object v1, Lv8/o;->n:Lv8/o;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v1, v0, Lng/t;->a:Lng/j;

    .line 89
    .line 90
    invoke-interface {v1}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    iget-object v2, v0, Lng/t;->b:Lfg/l;

    .line 101
    .line 102
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {v2, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Ljava/io/File;

    .line 111
    .line 112
    iget-object v3, p0, Lv8/b;->h:Lv8/q;

    .line 113
    .line 114
    invoke-virtual {v3, v2}, Lv8/q;->a(Ljava/io/File;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_2
    iget-object v0, p0, Lv8/b;->h:Lv8/q;

    .line 122
    .line 123
    iget-object v1, p0, Lv8/b;->i:Lv8/h;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lv8/q;->k(Lv8/h;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
