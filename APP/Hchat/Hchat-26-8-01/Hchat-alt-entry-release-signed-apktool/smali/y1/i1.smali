.class public final Ly1/i1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ly1/g2;


# instance fields
.field public final a:Ln2/t;


# direct methods
.method public constructor <init>(Ln2/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/i1;->a:Ln2/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/i1;->a:Ln2/t;

    .line 2
    .line 3
    iget-object v0, v0, Ln2/t;->a:Ln2/n;

    .line 4
    .line 5
    invoke-interface {v0}, Ln2/n;->f()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/i1;->a:Ln2/t;

    .line 2
    .line 3
    iget-object v1, v0, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ln2/y;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Ln2/t;->a:Ln2/n;

    .line 14
    .line 15
    invoke-interface {v0}, Ln2/n;->c()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
