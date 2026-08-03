.class public final Lw/d1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:Li0/a1;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Li0/a1;Lwf/c;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/d1;->h:Li0/a1;

    .line 2
    .line 3
    iput-boolean p3, p0, Lw/d1;->i:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    new-instance p1, Lw/d1;

    .line 2
    .line 3
    iget-object v0, p0, Lw/d1;->h:Li0/a1;

    .line 4
    .line 5
    iget-boolean v1, p0, Lw/d1;->i:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, p2, v1}, Lw/d1;-><init>(Li0/a1;Lwf/c;Z)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lw/d1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/d1;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/d1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lw/d1;->h:Li0/a1;

    .line 5
    .line 6
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ln/m;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 19
    .line 20
    return-object p1
.end method
