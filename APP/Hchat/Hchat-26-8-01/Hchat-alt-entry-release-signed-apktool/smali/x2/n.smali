.class public final Lx2/n;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public u:Ls1/b0;

.field public final v:Lb1/f;


# direct methods
.method public constructor <init>(Ls1/b0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx2/n;->u:Ls1/b0;

    .line 5
    .line 6
    new-instance p1, Lb1/f;

    .line 7
    .line 8
    const/16 v0, 0x13

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lx2/n;->v:Lb1/f;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/n;->u:Ls1/b0;

    .line 2
    .line 3
    iget-object v1, p0, Lx2/n;->v:Lb1/f;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls1/b0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/n;->u:Ls1/b0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ls1/b0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    return-void
.end method
