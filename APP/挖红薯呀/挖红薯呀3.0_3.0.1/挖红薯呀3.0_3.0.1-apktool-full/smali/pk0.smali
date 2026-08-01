.class public final Lpk0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lq8;


# instance fields
.field public final a:Lq8;

.field public final b:I

.field public c:I


# direct methods
.method public constructor <init>(Lq8;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpk0;->a:Lq8;

    .line 5
    .line 6
    iput p2, p0, Lpk0;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lpk0;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lpk0;->b:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    add-int/2addr p1, v0

    .line 10
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 11
    .line 12
    invoke-interface {p0, p1, p2}, Lq8;->a(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lpk0;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lpk0;->c:I

    .line 6
    .line 7
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lq8;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 2
    .line 3
    invoke-interface {p0}, Lq8;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lpk0;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lpk0;->b:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    add-int/2addr p1, v0

    .line 10
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 11
    .line 12
    invoke-interface {p0, p1, p2}, Lq8;->d(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final f(III)V
    .locals 1

    .line 1
    iget v0, p0, Lpk0;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lpk0;->b:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    add-int/2addr p1, v0

    .line 10
    add-int/2addr p2, v0

    .line 11
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 12
    .line 13
    invoke-interface {p0, p1, p2, p3}, Lq8;->f(III)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 2
    .line 3
    invoke-interface {p0}, Lq8;->g()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h(II)V
    .locals 1

    .line 1
    iget v0, p0, Lpk0;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lpk0;->b:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    add-int/2addr p1, v0

    .line 10
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 11
    .line 12
    invoke-interface {p0, p1, p2}, Lq8;->h(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i(Lww;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lq8;->i(Lww;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget v0, p0, Lpk0;->c:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "OffsetApplier up called with no corresponding down"

    .line 7
    .line 8
    invoke-static {v0}, Lqi;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget v0, p0, Lpk0;->c:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, Lpk0;->c:I

    .line 16
    .line 17
    iget-object p0, p0, Lpk0;->a:Lq8;

    .line 18
    .line 19
    invoke-interface {p0}, Lq8;->j()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
