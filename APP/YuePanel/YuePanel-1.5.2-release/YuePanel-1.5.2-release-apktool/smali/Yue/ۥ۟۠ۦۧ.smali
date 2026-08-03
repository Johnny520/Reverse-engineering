.class public LYue/ۥ۟۠ۦۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟۠ۦۧ$ۥ۟۟;,
        LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;,
        LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;,
        LYue/ۥ۟۠ۦۧ$ۥ;,
        LYue/ۥ۟۠ۦۧ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:J = 0xaL

.field public static final ۥ۟۟۟ۢ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "LYue/\u06e5\u06df\u06e0\u06e6\u06e7;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥۢ۟ۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "LYue/\u06e5\u06df\u06e0\u06e6\u06e7$\u06e5\u06df;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06df\u06e0\u06e6\u06e7$\u06e5\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥ۟۠ۦۧ$ۥ;

.field public ۥ۟۟۟:LYue/ۥ۟۠ۦۧ$ۥ۟۟;

.field public ۥ۟۟۟۟:J

.field public ۥ۟۟۟۠:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟ۢ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ:LYue/ۥۢ۟ۡ;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    new-instance v0, LYue/ۥ۟۠ۦۧ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟۠ۦۧ$ۥ;-><init>(LYue/ۥ۟۠ۦۧ;)V

    iput-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟:LYue/ۥ۟۠ۦۧ$ۥ;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۟:J

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۠:Z

    return-void
.end method

.method public static ۥ۟۟۟()J
    .locals 2

    sget-object v0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟ۢ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟۠ۦۧ;

    iget-wide v0, v0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۟:J

    return-wide v0
.end method

.method public static ۥ۟۟۟۟()LYue/ۥ۟۠ۦۧ;
    .locals 2

    sget-object v0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟ۢ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥ۟۠ۦۧ;

    invoke-direct {v1}, LYue/ۥ۟۠ۦۧ;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟۠ۦۧ;

    return-object v0
.end method


# virtual methods
.method public ۥ(LYue/ۥ۟۠ۦۧ$ۥ۟;J)V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۠()LYue/ۥ۟۠ۦۧ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟۠ۦۧ$ۥ۟۟;->ۥ()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_2

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final ۥ۟()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۠:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۠:Z

    :cond_2
    return-void
.end method

.method public ۥ۟۟(J)V
    .locals 5

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v3, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۟۠ۦۧ$ۥ۟;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v3, v0, v1}, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟ۡ(LYue/ۥ۟۠ۦۧ$ۥ۟;J)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3, p1, p2}, LYue/ۥ۟۠ۦۧ$ۥ۟;->ۥ(J)Z

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۟۠ۦۧ;->ۥ۟()V

    return-void
.end method

.method public ۥ۟۟۟۠()LYue/ۥ۟۠ۦۧ$ۥ۟۟;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟:LYue/ۥ۟۠ۦۧ$ۥ۟۟;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;

    iget-object v1, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟:LYue/ۥ۟۠ۦۧ$ۥ;

    invoke-direct {v0, v1}, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;-><init>(LYue/ۥ۟۠ۦۧ$ۥ;)V

    iput-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟:LYue/ۥ۟۠ۦۧ$ۥ۟۟;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟:LYue/ۥ۟۠ۦۧ$ۥ۟۟;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ(LYue/ۥ۟۠ۦۧ$ۥ۟;J)Z
    .locals 4

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p2, v2, p2

    if-gez p2, :cond_1

    iget-object p2, p0, LYue/ۥ۟۠ۦۧ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {p2, p1}, LYue/ۥۢ۟ۡ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟۠ۦۧ$ۥ۟;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۠:Z

    :cond_0
    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۟۠ۦۧ$ۥ۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟:LYue/ۥ۟۠ۦۧ$ۥ۟۟;

    return-void
.end method
