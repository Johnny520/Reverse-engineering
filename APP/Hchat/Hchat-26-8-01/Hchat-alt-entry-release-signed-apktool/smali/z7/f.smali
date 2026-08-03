.class public final Lz7/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/util/Iterator;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Ljava/lang/Class;Lbc/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lz7/f;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lz7/f;->h:Ljava/util/Iterator;

    .line 8
    .line 9
    iput-object p2, p0, Lz7/f;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lz7/f;->k:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/util/Iterator;Ljava/util/Iterator;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lz7/f;->g:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lz7/f;->h:Ljava/util/Iterator;

    .line 16
    iput-object p2, p0, Lz7/f;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lz7/f;->i:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lz7/f;->h:Ljava/util/Iterator;

    .line 7
    .line 8
    iget-object v1, p0, Lz7/f;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Class;

    .line 11
    .line 12
    iget-object v2, p0, Lz7/f;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/function/Predicate;

    .line 15
    .line 16
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_4

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-interface {v2, v3}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    :cond_3
    iput-object v3, p0, Lz7/f;->i:Ljava/lang/Object;

    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_4
    const/4 v0, 0x0

    .line 47
    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz7/f;->i:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    iget-object v0, p0, Lz7/f;->h:Ljava/util/Iterator;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    :goto_0
    move-object v1, v2

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    iput-object v1, p0, Lz7/f;->h:Ljava/util/Iterator;

    .line 25
    .line 26
    :cond_2
    iget-object v0, p0, Lz7/f;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Iterator;

    .line 29
    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iput-object v1, p0, Lz7/f;->j:Ljava/lang/Object;

    .line 46
    .line 47
    :cond_5
    iget-object v0, p0, Lz7/f;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ljava/util/Iterator;

    .line 50
    .line 51
    if-eqz v0, :cond_8

    .line 52
    .line 53
    :goto_1
    if-eqz v0, :cond_9

    .line 54
    .line 55
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_7

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_7
    iput-object v1, p0, Lz7/f;->k:Ljava/lang/Object;

    .line 69
    .line 70
    :cond_8
    move-object v0, v1

    .line 71
    goto :goto_1

    .line 72
    :cond_9
    :goto_2
    iput-object v1, p0, Lz7/f;->i:Ljava/lang/Object;

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_a
    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lz7/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lz7/f;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0

    .line 16
    :pswitch_0
    invoke-virtual {p0}, Lz7/f;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_1
    return v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lz7/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lz7/f;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lz7/f;->i:Ljava/lang/Object;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    return-object v0

    .line 21
    :pswitch_0
    invoke-virtual {p0}, Lz7/f;->b()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iput-object v1, p0, Lz7/f;->i:Ljava/lang/Object;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {}, Lbsh/j;->e()V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    :goto_1
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
