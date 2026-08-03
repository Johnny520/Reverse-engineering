.class public final Li/b;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic h:Li/c;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li/c;Ljava/lang/Object;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li/b;->h:Li/c;

    .line 2
    .line 3
    iput-object p2, p0, Li/b;->i:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    new-instance v0, Li/b;

    .line 2
    .line 3
    iget-object v1, p0, Li/b;->h:Li/c;

    .line 4
    .line 5
    iget-object v2, p0, Li/b;->i:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Li/b;-><init>(Li/c;Ljava/lang/Object;Lwf/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lwf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Li/b;->create(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Li/b;

    .line 8
    .line 9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Li/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Li/b;->h:Li/c;

    .line 5
    .line 6
    invoke-static {p1}, Li/c;->b(Li/c;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li/b;->i:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1, v0}, Li/c;->a(Li/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p1, Li/c;->c:Li/l;

    .line 16
    .line 17
    iget-object v1, v1, Li/l;->h:Li0/j1;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Li/c;->e:Li0/j1;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object p1
.end method
