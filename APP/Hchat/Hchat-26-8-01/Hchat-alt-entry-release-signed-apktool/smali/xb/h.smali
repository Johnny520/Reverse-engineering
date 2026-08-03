.class public final Lxb/h;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lxb/i;

.field public final synthetic j:F


# direct methods
.method public constructor <init>(Lxb/i;FLwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxb/h;->i:Lxb/i;

    .line 2
    .line 3
    iput p2, p0, Lxb/h;->j:F

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    new-instance v0, Lxb/h;

    .line 2
    .line 3
    iget-object v1, p0, Lxb/h;->i:Lxb/i;

    .line 4
    .line 5
    iget v2, p0, Lxb/h;->j:F

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lxb/h;-><init>(Lxb/i;FLwf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lxb/h;->h:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lxb/h;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lxb/h;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lxb/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lxb/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqg/t;

    .line 4
    .line 5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lxb/a;

    .line 9
    .line 10
    iget v1, p0, Lxb/h;->j:F

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iget-object v3, p0, Lxb/h;->i:Lxb/i;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {p1, v3, v1, v4, v2}, Lxb/a;-><init>(Lxb/i;FLwf/c;I)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-static {v0, v4, p1, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 21
    .line 22
    .line 23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object p1
.end method
