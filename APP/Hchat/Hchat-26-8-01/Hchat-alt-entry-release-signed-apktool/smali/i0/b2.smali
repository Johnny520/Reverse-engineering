.class public final Li0/b2;
.super Lwf/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqg/r;


# instance fields
.field public final synthetic h:Lx0/d;

.field public final synthetic i:Li0/c2;


# direct methods
.method public constructor <init>(Lx0/d;Li0/c2;)V
    .locals 1

    .line 1
    sget-object v0, Lqg/q;->g:Lqg/q;

    .line 2
    .line 3
    iput-object p1, p0, Li0/b2;->h:Lx0/d;

    .line 4
    .line 5
    iput-object p2, p0, Li0/b2;->i:Li0/c2;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lwf/a;-><init>(Lwf/f;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Throwable;Lwf/g;)V
    .locals 4

    .line 1
    new-instance v0, Lwb/xi;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    iget-object v2, p0, Li0/b2;->h:Lx0/d;

    .line 6
    .line 7
    iget-object v3, p0, Li0/b2;->i:Li0/c2;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1, v3}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lig/a;->b0(Ljava/lang/Throwable;Lfg/a;)Z

    .line 13
    .line 14
    .line 15
    sget-object v0, Lqg/q;->g:Lqg/q;

    .line 16
    .line 17
    iget-object v1, v3, Li0/c2;->g:Lwf/g;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lqg/r;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p1, p2}, Lqg/r;->m(Ljava/lang/Throwable;Lwf/g;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    throw p1
.end method
