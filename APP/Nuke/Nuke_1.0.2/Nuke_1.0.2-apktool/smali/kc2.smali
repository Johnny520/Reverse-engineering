.class public final Lkc2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lfa1;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ljc2;

.field public j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljc2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkc2;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lkc2;->i:Ljc2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Lia1;Lz91;)V
    .locals 1

    .line 1
    sget-object v0, Lz91;->ON_DESTROY:Lz91;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Lkc2;->j:Z

    .line 7
    .line 8
    invoke-interface {p1}, Lia1;->getLifecycle()Lba1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Lba1;->b(Lha1;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final h(Lba1;Lqc2;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lkc2;->j:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lkc2;->j:Z

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lba1;->a(Lha1;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lkc2;->i:Ljc2;

    .line 18
    .line 19
    iget-object p1, p1, Ljc2;->a:Lcj;

    .line 20
    .line 21
    iget-object p1, p1, Lcj;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Luv;

    .line 24
    .line 25
    iget-object p0, p0, Lkc2;->h:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p2, p0, p1}, Lqc2;->c(Ljava/lang/String;Lpc2;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "Already attached to lifecycleOwner"

    .line 32
    .line 33
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
