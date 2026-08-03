.class public final Li0/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/a2;


# instance fields
.field public final g:Lfg/l;

.field public h:Li0/z;


# direct methods
.method public constructor <init>(Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/y;->g:Lfg/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/y;->h:Li0/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Li0/z;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Li0/y;->h:Li0/z;

    .line 10
    .line 11
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/y;->g:Lfg/l;

    .line 2
    .line 3
    sget-object v1, Li0/r;->b:Li0/a0;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Li0/z;

    .line 10
    .line 11
    iput-object v0, p0, Li0/y;->h:Li0/z;

    .line 12
    .line 13
    return-void
.end method
