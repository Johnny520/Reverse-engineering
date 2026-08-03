.class public final Lr1/j;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lgg/u;


# direct methods
.method public synthetic constructor <init>(Lgg/u;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr1/j;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lr1/j;->h:Lgg/u;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lr1/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ld1/b0;

    .line 7
    .line 8
    iget-object v0, p0, Lr1/j;->h:Lgg/u;

    .line 9
    .line 10
    iput-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Ls1/f;

    .line 16
    .line 17
    iget-object v0, p0, Lr1/j;->h:Lgg/u;

    .line 18
    .line 19
    iget-object v1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-boolean v2, p1, Ls1/f;->w:Z

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iput-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_1
    check-cast p1, Lx1/e2;

    .line 39
    .line 40
    move-object v0, p1

    .line 41
    check-cast v0, Ly0/n;

    .line 42
    .line 43
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 44
    .line 45
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lr1/j;->h:Lgg/u;

    .line 50
    .line 51
    iput-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/4 p1, 0x1

    .line 56
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
