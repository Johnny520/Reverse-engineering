.class public final Ln/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ltg/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lsg/a;->h:Lsg/a;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {v1, v0}, Ltg/s;->a(ILsg/a;)Ltg/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ln/k;->a:Ltg/r;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ln/j;Lwf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln/k;->a:Ltg/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ltg/r;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    return-object p1
.end method

.method public final b(Ln/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln/k;->a:Ltg/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ltg/r;->p(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
