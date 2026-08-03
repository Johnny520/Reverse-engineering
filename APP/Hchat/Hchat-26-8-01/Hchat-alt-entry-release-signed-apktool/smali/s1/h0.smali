.class public abstract Ls1/h0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ls1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ls1/k;

    .line 2
    .line 3
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ls1/k;-><init>(Ljava/util/List;Lh0/q0;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls1/h0;->a:Ls1/k;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Ls1/g0;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v5, 0x6

    .line 5
    const/4 v2, 0x0

    .line 6
    move-object v1, p1

    .line 7
    move-object v4, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Ls1/g0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final b(Ly0/o;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;
    .locals 6

    .line 1
    new-instance v0, Ls1/g0;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v5, 0x4

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Ls1/g0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
