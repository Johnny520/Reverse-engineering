.class public final synthetic Lci/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lci/s;


# direct methods
.method public synthetic constructor <init>(Lci/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Lci/q;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lci/q;->h:Lci/s;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lci/q;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lf1/d0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lci/q;->h:Lci/s;

    .line 12
    .line 13
    iget-object v0, v0, Lci/s;->u:Lci/p;

    .line 14
    .line 15
    iget v1, v0, Lci/p;->a:F

    .line 16
    .line 17
    invoke-interface {p1, v1}, Lf1/d0;->s(F)V

    .line 18
    .line 19
    .line 20
    iget v0, v0, Lci/p;->b:F

    .line 21
    .line 22
    invoke-interface {p1, v0}, Lf1/d0;->g(F)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-interface {p1, v0}, Lf1/d0;->r(Z)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_0
    check-cast p1, Lfg/p;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lci/q;->h:Lci/s;

    .line 38
    .line 39
    invoke-virtual {v0}, Ly0/n;->Y0()Lqg/t;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    const/4 v2, 0x3

    .line 45
    invoke-static {v0, v1, p1, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
