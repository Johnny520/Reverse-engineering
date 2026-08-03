.class public final Lsh/c1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:Li0/l2;

.field public final synthetic b:Llg/a;

.field public final synthetic c:Z

.field public final synthetic d:Li0/a1;

.field public final synthetic e:Li0/a1;

.field public final synthetic f:Li0/a1;


# direct methods
.method public constructor <init>(Li0/l2;Llg/a;ZLi0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/c1;->a:Li0/l2;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/c1;->b:Llg/a;

    .line 7
    .line 8
    iput-boolean p3, p0, Lsh/c1;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Lsh/c1;->d:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lsh/c1;->e:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lsh/c1;->f:Li0/a1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Lsh/b1;

    .line 2
    .line 3
    iget-object v6, p0, Lsh/c1;->f:Li0/a1;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    iget-object v1, p0, Lsh/c1;->a:Li0/l2;

    .line 7
    .line 8
    iget-object v2, p0, Lsh/c1;->b:Llg/a;

    .line 9
    .line 10
    iget-boolean v3, p0, Lsh/c1;->c:Z

    .line 11
    .line 12
    iget-object v4, p0, Lsh/c1;->d:Li0/a1;

    .line 13
    .line 14
    iget-object v5, p0, Lsh/c1;->e:Li0/a1;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v7}, Lsh/b1;-><init>(Li0/l2;Llg/a;ZLi0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Ls1/l0;

    .line 20
    .line 21
    invoke-virtual {p1, v0, p2}, Ls1/l0;->k1(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 26
    .line 27
    if-ne p1, p2, :cond_0

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object p1
.end method
