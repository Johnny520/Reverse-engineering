.class public final synthetic Lx8/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lj8/p;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lj8/p;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lx8/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lx8/c;->h:Lj8/p;

    .line 4
    .line 5
    iput-object p2, p0, Lx8/c;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lx8/c;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

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
    iget-object v0, p0, Lx8/c;->h:Lj8/p;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lj8/p;->c:Lbb/b;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lx8/c;->i:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 v0, 0x1

    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lx8/c;->h:Lj8/p;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v0, v0, Lj8/p;->d:Lj8/f;

    .line 43
    .line 44
    iget-object v1, p0, Lx8/c;->i:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v0, 0x1

    .line 51
    if-ne p1, v0, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v0, 0x0

    .line 55
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lx8/c;->h:Lj8/p;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 68
    .line 69
    iget-object v1, p0, Lx8/c;->i:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1, p1}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    const/4 v0, 0x1

    .line 76
    if-ne p1, v0, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 v0, 0x0

    .line 80
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lx8/c;->h:Lj8/p;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    iget-object v1, p0, Lx8/c;->i:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, v1, p1}, Lj8/p;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const/4 v0, 0x1

    .line 99
    if-ne p1, v0, :cond_3

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    const/4 v0, 0x0

    .line 103
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lx8/c;->h:Lj8/p;

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    new-instance v1, Ljava/io/File;

    .line 116
    .line 117
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v0, v0, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 125
    .line 126
    iget-object v2, p0, Lx8/c;->i:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v0, v2, p1, v1}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    const/4 v0, 0x1

    .line 133
    if-ne p1, v0, :cond_4

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    const/4 v0, 0x0

    .line 137
    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
