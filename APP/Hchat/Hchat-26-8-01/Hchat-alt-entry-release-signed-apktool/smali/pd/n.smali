.class public Lpd/n;
.super Lpd/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:I

.field public final p:Lod/d;


# direct methods
.method public constructor <init>(Lod/d;II)V
    .locals 1

    .line 96
    sget-object v0, Lpd/k;->O:Lpd/k;

    .line 97
    invoke-direct {p0, v0, p3}, Lud/p;-><init>(Lpd/k;I)V

    .line 98
    iput-object p1, p0, Lpd/n;->p:Lod/d;

    .line 99
    iput p2, p0, Lpd/n;->o:I

    return-void
.end method

.method public constructor <init>(Lod/d;Lgf/a;IZ)V
    .locals 7

    const/4 v0, 0x1

    if-eq p3, v0, :cond_0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v6, p4

    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 100
    :goto_1
    invoke-direct/range {v1 .. v6}, Lpd/n;-><init>(Lod/d;Lgf/a;IZZ)V

    return-void
.end method

.method public constructor <init>(Lod/d;Lgf/a;IZZ)V
    .locals 2

    .line 1
    iget-object v0, p1, Lod/d;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/2addr v0, p4

    .line 8
    sget-object v1, Lpd/k;->O:Lpd/k;

    .line 9
    .line 10
    invoke-direct {p0, v1, v0}, Lud/p;-><init>(Lpd/k;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lpd/n;->p:Lod/d;

    .line 14
    .line 15
    iput p3, p0, Lpd/n;->o:I

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    if-eqz p5, :cond_0

    .line 19
    .line 20
    iget-object v0, p2, Lgf/a;->i:[I

    .line 21
    .line 22
    aget p3, v0, p3

    .line 23
    .line 24
    :cond_0
    if-eqz p4, :cond_2

    .line 25
    .line 26
    if-eqz p5, :cond_1

    .line 27
    .line 28
    move p4, p3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p4, p2, Lgf/a;->i:[I

    .line 31
    .line 32
    aget p4, p4, p3

    .line 33
    .line 34
    :goto_0
    iget-object v0, p1, Lod/d;->j:Lod/a;

    .line 35
    .line 36
    iget-object v0, v0, Lod/a;->g:Lqd/j;

    .line 37
    .line 38
    sget-object v1, Lqd/l;->k:Lmh/b;

    .line 39
    .line 40
    new-instance v1, Lqd/r;

    .line 41
    .line 42
    invoke-direct {v1, p4, v0}, Lqd/r;-><init>(ILqd/j;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Lud/p;->I(Lqd/l;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 p3, p3, 0x1

    .line 49
    .line 50
    :cond_2
    iget-object p1, p1, Lod/d;->i:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    if-eqz p4, :cond_4

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    check-cast p4, Lqd/j;

    .line 67
    .line 68
    if-eqz p5, :cond_3

    .line 69
    .line 70
    move v0, p3

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    iget-object v0, p2, Lgf/a;->i:[I

    .line 73
    .line 74
    aget v0, v0, p3

    .line 75
    .line 76
    :goto_2
    sget-object v1, Lqd/l;->k:Lmh/b;

    .line 77
    .line 78
    new-instance v1, Lqd/r;

    .line 79
    .line 80
    invoke-direct {v1, v0, p4}, Lqd/r;-><init>(ILqd/j;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lud/p;->I(Lqd/l;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p4}, Lqd/j;->p()I

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    add-int/2addr p3, p4

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public O()Lud/p;
    .locals 4

    .line 1
    new-instance v0, Lpd/n;

    .line 2
    .line 3
    iget-object v1, p0, Lud/p;->m:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lpd/n;->p:Lod/d;

    .line 10
    .line 11
    iget v3, p0, Lpd/n;->o:I

    .line 12
    .line 13
    invoke-direct {v0, v2, v3, v1}, Lpd/n;-><init>(Lod/d;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public Y(Lud/p;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lpd/n;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lpd/n;

    .line 16
    .line 17
    iget v0, p0, Lpd/n;->o:I

    .line 18
    .line 19
    iget v1, p1, Lpd/n;->o:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lpd/n;->p:Lod/d;

    .line 24
    .line 25
    iget-object p1, p1, Lpd/n;->p:Lod/d;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lod/d;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final i0()Lod/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/n;->p:Lod/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public j0()I
    .locals 2

    .line 1
    iget v0, p0, Lpd/n;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0

    .line 8
    :cond_0
    return v1
.end method

.method public k0()Lqd/l;
    .locals 2

    .line 1
    iget v0, p0, Lpd/n;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lud/p;->m:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, Lud/p;->S(I)Lqd/l;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lud/p;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lpd/n;->o:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v1, "null"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_0
    const-string v1, "CUSTOM_RAW"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_1
    const-string v1, "CUSTOM"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_2
    const-string v1, "POLYMORPHIC"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_3
    const-string v1, "SUPER"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_4
    const-string v1, "INTERFACE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_5
    const-string v1, "VIRTUAL"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_6
    const-string v1, "DIRECT"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_7
    const-string v1, "STATIC"

    .line 35
    .line 36
    :goto_0
    iget-object v2, p0, Lpd/n;->p:Lod/d;

    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p0}, Lud/p;->M()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v4, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, " "

    .line 55
    .line 56
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, " call: "

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
