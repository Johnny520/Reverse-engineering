.class public final Ljl1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Llp;
.implements Lgc3;


# instance fields
.field public final h:Lmp;

.field public final synthetic i:Lkl1;


# direct methods
.method public constructor <init>(Lkl1;Lmp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljl1;->i:Lkl1;

    .line 5
    .line 6
    iput-object p2, p0, Ljl1;->h:Lmp;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final C(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ljl1;->h:Lmp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmp;->C(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a(Llm2;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ljl1;->h:Lmp;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lmp;->a(Llm2;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()La20;
    .locals 0

    .line 1
    iget-object p0, p0, Ljl1;->h:Lmp;

    .line 2
    .line 3
    iget-object p0, p0, Lmp;->l:La20;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ljl1;->h:Lmp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmp;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(Ljava/lang/Object;Lnn0;)V
    .locals 3

    .line 1
    check-cast p1, La83;

    .line 2
    .line 3
    sget-object p2, Lkl1;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object v1, p0, Ljl1;->i:Lkl1;

    .line 7
    .line 8
    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lv;

    .line 12
    .line 13
    const/16 v0, 0x11

    .line 14
    .line 15
    invoke-direct {p2, v0, v1, p0}, Lv;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ljl1;->h:Lmp;

    .line 19
    .line 20
    iget v0, p0, Lm90;->j:I

    .line 21
    .line 22
    new-instance v1, Lwt0;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-direct {v1, v2, p2}, Lwt0;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, v0, v1}, Lmp;->E(Ljava/lang/Object;ILnn0;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final l(Ljava/lang/Object;Lnn0;)Lhh1;
    .locals 1

    .line 1
    check-cast p1, La83;

    .line 2
    .line 3
    new-instance p2, Lwt0;

    .line 4
    .line 5
    iget-object v0, p0, Ljl1;->i:Lkl1;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Lwt0;-><init>(Lkl1;Ljl1;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ljl1;->h:Lmp;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lmp;->H(Ljava/lang/Object;Lnn0;)Lhh1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p1, Lkl1;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public final n(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ljl1;->h:Lmp;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lmp;->n(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
