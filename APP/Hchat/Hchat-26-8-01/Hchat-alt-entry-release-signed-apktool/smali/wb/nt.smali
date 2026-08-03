.class public final Lwb/nt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Lfg/a;

.field public final synthetic c:Lfg/a;

.field public final synthetic d:Li0/a1;


# direct methods
.method public constructor <init>(FLfg/a;Lfg/a;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/nt;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Lwb/nt;->b:Lfg/a;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/nt;->c:Lfg/a;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/nt;->d:Li0/a1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lwb/mt;

    .line 2
    .line 3
    iget-object v4, p0, Lwb/nt;->d:Li0/a1;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    iget v1, p0, Lwb/nt;->a:F

    .line 7
    .line 8
    iget-object v2, p0, Lwb/nt;->b:Lfg/a;

    .line 9
    .line 10
    iget-object v3, p0, Lwb/nt;->c:Lfg/a;

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lwb/mt;-><init>(FLfg/a;Lfg/a;Li0/a1;Lwf/c;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
