.class public final synthetic Lci/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lci/s;


# direct methods
.method public synthetic constructor <init>(Lci/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Lci/r;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lci/r;->h:Lci/s;

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
    .locals 2

    .line 1
    iget v0, p0, Lci/r;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lci/r;->h:Lci/s;

    .line 7
    .line 8
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lx1/f0;->U(Z)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lci/r;->h:Lci/s;

    .line 20
    .line 21
    sget-object v1, Lci/b0;->a:Li0/u;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lci/z;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    iget-object v0, p0, Lci/r;->h:Lci/s;

    .line 31
    .line 32
    sget-object v1, Lsh/h0;->a:Li0/u;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    :goto_0
    const/4 v0, 0x0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-static {}, Lah/a;->d()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :goto_1
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
