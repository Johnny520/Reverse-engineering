.class public abstract LFb;
.super Lu5;
.source ""


# instance fields
.field public final b:Lac;

.field public transient c:LEb;


# direct methods
.method public constructor <init>(LEb;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, LEb;->e()Lac;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, LFb;-><init>(LEb;Lac;)V

    return-void
.end method

.method public constructor <init>(LEb;Lac;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lu5;-><init>(LEb;)V

    .line 2
    iput-object p2, p0, LFb;->b:Lac;

    return-void
.end method


# virtual methods
.method public final e()Lac;
    .locals 1

    iget-object v0, p0, LFb;->b:Lac;

    return-object v0
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, LFb;->c:LEb;

    if-eqz v0, :cond_3

    if-eq v0, p0, :cond_3

    iget-object v1, p0, LFb;->b:Lac;

    sget-object v2, Lgf;->b:Lgf;

    invoke-interface {v1, v2}, Lac;->m(LZb;)LYb;

    move-result-object v1

    check-cast v1, Lbc;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lee;

    sget-object v1, Lee;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LfG;->c:Lv1;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LM6;

    if-eqz v1, :cond_1

    check-cast v0, LM6;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    sget-object v1, LM6;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lje;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Lje;->a()V

    sget-object v2, LVs;->a:LVs;

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    :goto_1
    sget-object v0, LDa;->a:LDa;

    iput-object v0, p0, LFb;->c:LEb;

    return-void
.end method
