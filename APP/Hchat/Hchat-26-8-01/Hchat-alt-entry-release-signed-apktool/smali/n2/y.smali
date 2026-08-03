.class public final Ln2/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ln2/t;

.field public final b:Ln2/n;


# direct methods
.method public constructor <init>(Ln2/t;Ln2/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln2/y;->a:Ln2/t;

    .line 5
    .line 6
    iput-object p2, p0, Ln2/y;->b:Ln2/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ln2/s;Ln2/s;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln2/y;->a:Ln2/t;

    .line 2
    .line 3
    iget-object v0, v0, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ln2/y;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ln2/y;->b:Ln2/n;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Ln2/n;->e(Ln2/s;Ln2/s;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
