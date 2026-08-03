.class public final Lf1/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/a2;


# instance fields
.field public final g:Lf1/z;

.field public final h:Li1/b;


# direct methods
.method public constructor <init>(Lf1/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf1/a0;->g:Lf1/z;

    .line 5
    .line 6
    invoke-interface {p1}, Lf1/z;->c()Li1/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lf1/a0;->h:Li1/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/a0;->g:Lf1/z;

    .line 2
    .line 3
    iget-object v1, p0, Lf1/a0;->h:Li1/b;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lf1/z;->a(Li1/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/a0;->g:Lf1/z;

    .line 2
    .line 3
    iget-object v1, p0, Lf1/a0;->h:Li1/b;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lf1/z;->a(Li1/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method
