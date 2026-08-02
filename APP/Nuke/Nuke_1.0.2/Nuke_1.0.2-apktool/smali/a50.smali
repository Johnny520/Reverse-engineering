.class public final La50;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lwo;


# instance fields
.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Lwo;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lwo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La50;->h:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, La50;->i:Lwo;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lcp;)V
    .locals 3

    .line 1
    new-instance v0, Lsz0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, p0, p1, v2}, Lsz0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La50;->i:Lwo;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Lwo;->b(Lcp;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c()Lk82;
    .locals 0

    .line 1
    iget-object p0, p0, La50;->i:Lwo;

    .line 2
    .line 3
    invoke-interface {p0}, Lwo;->c()Lk82;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, La50;->i:Lwo;

    .line 2
    .line 3
    invoke-interface {p0}, Lwo;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-virtual {p0}, La50;->clone()Lwo;

    move-result-object p0

    return-object p0
.end method

.method public final clone()Lwo;
    .locals 2

    .line 1
    new-instance v0, La50;

    .line 2
    .line 3
    iget-object v1, p0, La50;->i:Lwo;

    .line 4
    .line 5
    invoke-interface {v1}, Lwo;->clone()Lwo;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, La50;->h:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La50;-><init>(Ljava/util/concurrent/Executor;Lwo;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-object p0, p0, La50;->i:Lwo;

    .line 2
    .line 3
    invoke-interface {p0}, Lwo;->e()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
