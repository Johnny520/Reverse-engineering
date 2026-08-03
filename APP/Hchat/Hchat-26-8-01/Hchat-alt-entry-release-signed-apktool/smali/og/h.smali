.class public final Log/h;
.super Ltf/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Log/h;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Log/h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(I)Log/e;
    .locals 3

    .line 1
    iget-object v0, p0, Log/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Log/i;

    .line 4
    .line 5
    iget-object v0, v0, Log/i;->a:Ljava/util/regex/Matcher;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->start(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->end(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Lr9/e0;->r0(II)Llg/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v2, v1, Llg/b;->g:I

    .line 20
    .line 21
    if-ltz v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Log/e;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, p1, v1}, Log/e;-><init>(Ljava/lang/String;Llg/d;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    return-object p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Log/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Log/h;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lp0/b;->containsValue(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    instance-of v0, p1, Log/e;

    .line 20
    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    check-cast p1, Log/e;

    .line 26
    .line 27
    invoke-super {p0, p1}, Ltf/a;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    :goto_1
    return p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget v0, p0, Log/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Log/h;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp0/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget v0, v0, Lp0/b;->h:I

    .line 14
    .line 15
    return v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Log/h;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Log/i;

    .line 19
    .line 20
    iget-object v0, v0, Log/i;->a:Ljava/util/regex/Matcher;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    return v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Log/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ltf/a;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 1
    iget v0, p0, Log/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp0/i;

    .line 7
    .line 8
    iget-object v1, p0, Log/h;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lp0/b;

    .line 11
    .line 12
    iget-object v1, v1, Lp0/b;->g:Lp0/j;

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    new-array v3, v2, [Lp0/k;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_0
    if-ge v4, v2, :cond_0

    .line 20
    .line 21
    new-instance v5, Lp0/l;

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    invoke-direct {v5, v6}, Lp0/l;-><init>(I)V

    .line 25
    .line 26
    .line 27
    aput-object v5, v3, v4

    .line 28
    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-direct {v0, v1, v3}, Lp0/c;-><init>(Lp0/j;[Lp0/k;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    invoke-static {p0}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ldg/n;

    .line 41
    .line 42
    const/4 v2, 0x6

    .line 43
    invoke-direct {v1, v0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lnb/a;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-direct {v0, p0, v2}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v1, Lng/s;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Lng/s;-><init>(Lng/t;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
