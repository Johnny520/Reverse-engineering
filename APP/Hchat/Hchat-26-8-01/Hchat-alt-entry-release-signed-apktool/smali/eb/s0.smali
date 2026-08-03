.class public final synthetic Leb/s0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Leb/s0;->g:I

    .line 2
    .line 3
    iput-wide p1, p0, Leb/s0;->h:J

    .line 4
    .line 5
    iput-object p3, p0, Leb/s0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 11
    iput p4, p0, Leb/s0;->g:I

    iput-object p1, p0, Leb/s0;->i:Ljava/lang/Object;

    iput-wide p2, p0, Leb/s0;->h:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Leb/s0;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-wide v2, p0, Leb/s0;->h:J

    .line 6
    .line 7
    iget-object v4, p0, Leb/s0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v4, Lv1/b1;

    .line 13
    .line 14
    check-cast p1, Lv1/a1;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v4, v2, v3}, Lv1/a1;->C(Lv1/a1;Lv1/b1;J)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    check-cast v4, Lv8/q;

    .line 24
    .line 25
    check-cast p1, Ljava/io/File;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-string v5, "image_"

    .line 42
    .line 43
    invoke-static {v0, v5, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v5, "video_"

    .line 57
    .line 58
    invoke-static {v0, v5, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 65
    .line 66
    .line 67
    move-result-wide v5

    .line 68
    cmp-long v0, v5, v2

    .line 69
    .line 70
    if-gtz v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {v4, p1}, Lv8/q;->g(Ljava/io/File;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    iget-object v0, v4, Lv8/q;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const/4 v0, 0x1

    .line 85
    xor-int/2addr p1, v0

    .line 86
    if-ne p1, v0, :cond_1

    .line 87
    .line 88
    move v1, v0

    .line 89
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    :pswitch_1
    check-cast v4, Lfg/l;

    .line 95
    .line 96
    check-cast p1, Lv1/t;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Lv1/t;->F()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    invoke-static {v2, v3, v5, v6}, Lu2/l;->a(JJ)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_2

    .line 110
    .line 111
    new-instance p1, Lu2/l;

    .line 112
    .line 113
    invoke-direct {p1, v5, v6}, Lu2/l;-><init>(J)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v4, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_2
    return-object v1

    .line 120
    :pswitch_2
    check-cast v4, Ls/t;

    .line 121
    .line 122
    check-cast p1, Li/c;

    .line 123
    .line 124
    invoke-virtual {p1}, Li/c;->d()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Lu2/j;

    .line 129
    .line 130
    iget-wide v5, p1, Lu2/j;->a:J

    .line 131
    .line 132
    invoke-static {v5, v6, v2, v3}, Lu2/j;->c(JJ)J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    sget p1, Ls/t;->r:I

    .line 137
    .line 138
    invoke-virtual {v4, v2, v3}, Ls/t;->e(J)V

    .line 139
    .line 140
    .line 141
    iget-object p1, v4, Ls/t;->c:Li/e0;

    .line 142
    .line 143
    invoke-virtual {p1}, Li/e0;->invoke()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :pswitch_3
    check-cast v4, Ljava/lang/String;

    .line 148
    .line 149
    check-cast p1, Lj8/p;

    .line 150
    .line 151
    invoke-static {v4, v2, v3, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->g(Ljava/lang/String;JLj8/p;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    return-object p1

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
