.class public final Lci0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Luc;
.implements Lyc1;


# instance fields
.field public final d:Lwc;

.field public final synthetic e:Ldi0;


# direct methods
.method public constructor <init>(Ldi0;Lwc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci0;->e:Ldi0;

    .line 5
    .line 6
    iput-object p2, p0, Lci0;->d:Lwc;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lnz0;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lci0;->d:Lwc;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lwc;->a(Lnz0;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lpk;
    .locals 0

    .line 1
    iget-object p0, p0, Lci0;->d:Lwc;

    .line 2
    .line 3
    iget-object p0, p0, Lwc;->h:Lpk;

    .line 4
    .line 5
    return-object p0
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lci0;->d:Lwc;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwc;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(Ljava/lang/Object;Lxw;)Lzr;
    .locals 1

    .line 1
    check-cast p1, Lna1;

    .line 2
    .line 3
    new-instance p2, Lvc;

    .line 4
    .line 5
    iget-object v0, p0, Lci0;->e:Ldi0;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Lvc;-><init>(Ldi0;Lci0;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lci0;->d:Lwc;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lwc;->J(Ljava/lang/Object;Lxw;)Lzr;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p1, Ldi0;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

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

.method public final k(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lci0;->d:Lwc;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwc;->k(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lci0;->d:Lwc;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwc;->x(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
