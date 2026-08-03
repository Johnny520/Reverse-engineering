.class public final Lxf/b;
.super Lyf/g;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:I

.field public final synthetic h:Lfg/p;

.field public final synthetic i:Lwf/c;


# direct methods
.method public constructor <init>(Lfg/p;Lwf/c;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxf/b;->h:Lfg/p;

    .line 2
    .line 3
    iput-object p3, p0, Lxf/b;->i:Lwf/c;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lyf/g;-><init>(Lwf/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxf/b;->g:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    iput v1, p0, Lxf/b;->g:I

    .line 10
    .line 11
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    const-string p1, "This coroutine had already completed"

    .line 16
    .line 17
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    :cond_1
    iput v2, p0, Lxf/b;->g:I

    .line 23
    .line 24
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lxf/b;->h:Lfg/p;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lxf/b;->i:Lwf/c;

    .line 36
    .line 37
    invoke-interface {p1, v0, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method
