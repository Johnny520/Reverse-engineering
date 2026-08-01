.class public final Lwe1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lri;
.implements Lv90;


# instance fields
.field public final d:Lw3;

.field public final e:Lyi;

.field public f:Z

.field public g:Ls90;

.field public h:Lww;


# direct methods
.method public constructor <init>(Lw3;Lyi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwe1;->d:Lw3;

    .line 5
    .line 6
    iput-object p2, p0, Lwe1;->e:Lyi;

    .line 7
    .line 8
    sget-object p1, Lsh;->a:Lmh;

    .line 9
    .line 10
    iput-object p1, p0, Lwe1;->h:Lww;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwe1;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lwe1;->f:Z

    .line 7
    .line 8
    iget-object v0, p0, Lwe1;->d:Lw3;

    .line 9
    .line 10
    invoke-virtual {v0}, Lw3;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f060079

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lwe1;->g:Ls90;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ls90;->b(Lw90;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lwe1;->e:Lyi;

    .line 29
    .line 30
    invoke-virtual {p0}, Lyi;->m()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(Lx90;Lq90;)V
    .locals 0

    .line 1
    sget-object p1, Lq90;->ON_DESTROY:Lq90;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lwe1;->d()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Lq90;->ON_CREATE:Lq90;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lwe1;->f:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lwe1;->h:Lww;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lwe1;->f(Lww;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final f(Lww;)V
    .locals 2

    .line 1
    new-instance v0, Lo4;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lo4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lwe1;->d:Lw3;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lw3;->setOnViewTreeOwnersAvailable(Lsw;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
