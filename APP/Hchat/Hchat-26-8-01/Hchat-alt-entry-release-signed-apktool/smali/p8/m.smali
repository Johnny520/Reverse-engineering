.class public final synthetic Lp8/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lp8/o;


# direct methods
.method public synthetic constructor <init>(Lp8/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp8/m;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lp8/m;->h:Lp8/o;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lp8/m;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lgg/u;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lp8/n;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    iget-object v3, p0, Lp8/m;->h:Lp8/o;

    .line 15
    .line 16
    invoke-direct {v1, v0, v3, v2}, Lp8/n;-><init>(Lgg/u;Lp8/o;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lr8/e;->c(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    check-cast v0, Lp8/u;

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    const-string v0, "methods"

    .line 30
    .line 31
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    throw v0

    .line 36
    :pswitch_0
    new-instance v0, Lgg/u;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lp8/n;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iget-object v3, p0, Lp8/m;->h:Lp8/o;

    .line 45
    .line 46
    invoke-direct {v1, v0, v3, v2}, Lp8/n;-><init>(Lgg/u;Lp8/o;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lr8/e;->c(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    check-cast v0, Lp8/r;

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    const-string v0, "methods"

    .line 60
    .line 61
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    throw v0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
