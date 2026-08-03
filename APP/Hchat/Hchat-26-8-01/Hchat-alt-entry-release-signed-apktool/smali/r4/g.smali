.class public final Lr4/g;
.super Lr4/u0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/util/TreeMap;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr4/p;I)V
    .locals 1

    .line 1
    iput p2, p0, Lr4/g;->f:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p2, "call_site_ids"

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    invoke-direct {p0, p2, p1, v0}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/util/TreeMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 18
    .line 19
    new-instance p1, Ljava/util/TreeMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lr4/g;->h:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    const-string p2, "class_defs"

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-direct {p0, p2, p1, v0}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/util/TreeMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lr4/g;->h:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final c()Ljava/util/Collection;
    .locals 1

    .line 1
    iget v0, p0, Lr4/g;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr4/g;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()V
    .locals 5

    .line 1
    iget v0, p0, Lr4/g;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Lr4/g;->h:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lw4/c;

    .line 39
    .line 40
    sub-int v4, v1, v2

    .line 41
    .line 42
    invoke-virtual {p0, v2, v4, v3}, Lr4/g;->l(IILw4/c;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x0

    .line 59
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lr4/f;

    .line 70
    .line 71
    add-int/lit8 v3, v1, 0x1

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Lr4/z;->g(I)V

    .line 74
    .line 75
    .line 76
    move v1, v3

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l(IILw4/c;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr4/k;

    .line 8
    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    iget v1, v0, Lr4/z;->g:I

    .line 12
    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    if-ltz p2, :cond_4

    .line 17
    .line 18
    add-int/lit8 p2, p2, -0x1

    .line 19
    .line 20
    iget-object p3, v0, Lr4/k;->j:Lv4/d0;

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    iget-object p3, p3, Lv4/d0;->g:Lw4/c;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Lr4/g;->l(IILw4/c;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    :cond_1
    iget-object p3, v0, Lr4/k;->k:Lr4/t0;

    .line 31
    .line 32
    if-nez p3, :cond_2

    .line 33
    .line 34
    sget-object p3, Lw4/b;->i:Lw4/b;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object p3, p3, Lr4/t0;->k:Lw4/e;

    .line 38
    .line 39
    :goto_0
    invoke-interface {p3}, Lw4/e;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_1
    if-ge v2, v1, :cond_3

    .line 45
    .line 46
    invoke-interface {p3, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0, p1, p2, v3}, Lr4/g;->l(IILw4/c;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-virtual {v0, p1}, Lr4/z;->g(I)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lr4/g;->h:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p2, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    return p1

    .line 70
    :cond_4
    const-string p1, "class circularity with "

    .line 71
    .line 72
    invoke-static {p3, p1}, Lokio/a;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    :cond_5
    :goto_2
    return p1
.end method
