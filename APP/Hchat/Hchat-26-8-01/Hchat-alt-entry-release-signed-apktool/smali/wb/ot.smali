.class public final Lwb/ot;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:Li0/a1;

.field public final synthetic b:Li0/a1;

.field public final synthetic c:Li0/a1;

.field public final synthetic d:Lu2/c;

.field public final synthetic e:Li0/a1;

.field public final synthetic f:Li0/a1;


# direct methods
.method public constructor <init>(Li0/a1;Li0/a1;Li0/a1;Lu2/c;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ot;->a:Li0/a1;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ot;->b:Li0/a1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ot;->c:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ot;->d:Lu2/c;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ot;->e:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ot;->f:Li0/a1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    new-instance v1, Lwb/ad;

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    iget-object v4, p0, Lwb/ot;->a:Li0/a1;

    .line 6
    .line 7
    iget-object v2, p0, Lwb/ot;->b:Li0/a1;

    .line 8
    .line 9
    iget-object v3, p0, Lwb/ot;->c:Li0/a1;

    .line 10
    .line 11
    invoke-direct {v1, v4, v2, v3, v0}, Lwb/ad;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lc9/w0;

    .line 15
    .line 16
    const/4 v5, 0x4

    .line 17
    invoke-direct {v0, v2, v4, v3, v5}, Lc9/w0;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 18
    .line 19
    .line 20
    new-instance v8, Lc9/w0;

    .line 21
    .line 22
    const/4 v5, 0x5

    .line 23
    invoke-direct {v8, v2, v4, v3, v5}, Lc9/w0;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lc9/q0;

    .line 27
    .line 28
    const/16 v7, 0x1c

    .line 29
    .line 30
    iget-object v3, p0, Lwb/ot;->d:Lu2/c;

    .line 31
    .line 32
    iget-object v5, p0, Lwb/ot;->e:Li0/a1;

    .line 33
    .line 34
    iget-object v6, p0, Lwb/ot;->f:Li0/a1;

    .line 35
    .line 36
    invoke-direct/range {v2 .. v7}, Lc9/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    sget v3, Lm/j0;->a:F

    .line 40
    .line 41
    move-object v4, v2

    .line 42
    move-object v2, v0

    .line 43
    new-instance v0, Lm/g0;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    move-object v3, v8

    .line 47
    invoke-direct/range {v0 .. v5}, Lm/g0;-><init>(Lwb/ad;Lc9/w0;Lc9/w0;Lc9/q0;Lwf/c;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 55
    .line 56
    if-ne p1, p2, :cond_0

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object p1
.end method
