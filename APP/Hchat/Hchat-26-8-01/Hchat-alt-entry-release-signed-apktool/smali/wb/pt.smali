.class public final Lwb/pt;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:Lqg/t;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Lfb/v;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public constructor <init>(Lqg/t;Li0/a1;Li0/a1;Lfb/v;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/pt;->h:Lqg/t;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/pt;->i:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/pt;->j:Li0/a1;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/pt;->k:Lfb/v;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/pt;->l:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/pt;->m:Li0/a1;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lyf/i;-><init>(ILwf/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 8

    .line 1
    new-instance v0, Lwb/pt;

    .line 2
    .line 3
    iget-object v5, p0, Lwb/pt;->l:Li0/a1;

    .line 4
    .line 5
    iget-object v6, p0, Lwb/pt;->m:Li0/a1;

    .line 6
    .line 7
    iget-object v1, p0, Lwb/pt;->h:Lqg/t;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/pt;->i:Li0/a1;

    .line 10
    .line 11
    iget-object v3, p0, Lwb/pt;->j:Li0/a1;

    .line 12
    .line 13
    iget-object v4, p0, Lwb/pt;->k:Lfb/v;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lwb/pt;-><init>(Lqg/t;Li0/a1;Li0/a1;Lfb/v;Li0/a1;Li0/a1;Lwf/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lwb/pt;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/pt;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/pt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v4, p0, Lwb/pt;->l:Li0/a1;

    .line 5
    .line 6
    iget-object v5, p0, Lwb/pt;->m:Li0/a1;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/pt;->h:Lqg/t;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/pt;->i:Li0/a1;

    .line 11
    .line 12
    iget-object v2, p0, Lwb/pt;->j:Li0/a1;

    .line 13
    .line 14
    iget-object v3, p0, Lwb/pt;->k:Lfb/v;

    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lwb/y2;->f0(Lqg/t;Li0/a1;Li0/a1;Lfb/v;Li0/a1;Li0/a1;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object p1
.end method
