.class public final Lf2/e;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/z1;


# instance fields
.field public u:Z

.field public final v:Z

.field public w:Lfg/l;


# direct methods
.method public constructor <init>(ZZLfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lf2/e;->u:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lf2/e;->v:Z

    .line 7
    .line 8
    iput-object p3, p0, Lf2/e;->w:Lfg/l;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final S0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf2/e;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public final X0(Lf2/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/e;->w:Lfg/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf2/e;->v:Z

    .line 2
    .line 3
    return v0
.end method
