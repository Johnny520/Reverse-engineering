.class public final Lj60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyd0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lsw;

.field public final synthetic e:Lk60;

.field public final synthetic f:Lq60;

.field public final synthetic g:Lsw;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lsw;Lk60;Lq60;Lsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lj60;->a:I

    .line 5
    .line 6
    iput p2, p0, Lj60;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lj60;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lj60;->d:Lsw;

    .line 11
    .line 12
    iput-object p5, p0, Lj60;->e:Lk60;

    .line 13
    .line 14
    iput-object p6, p0, Lj60;->f:Lq60;

    .line 15
    .line 16
    iput-object p7, p0, Lj60;->g:Lsw;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lj60;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj60;->f:Lq60;

    .line 2
    .line 3
    iget-object v0, v0, Lq60;->d:Lb60;

    .line 4
    .line 5
    iget-object v1, p0, Lj60;->e:Lk60;

    .line 6
    .line 7
    invoke-virtual {v1}, Lk60;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object p0, p0, Lj60;->g:Lsw;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lb60;->I:Lmj0;

    .line 16
    .line 17
    iget-object v1, v1, Lmj0;->c:Lc20;

    .line 18
    .line 19
    iget-object v1, v1, Lc20;->U:Lb20;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, Lyb0;->o:Lzb0;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, v0, Lb60;->I:Lmj0;

    .line 30
    .line 31
    iget-object v0, v0, Lmj0;->c:Lc20;

    .line 32
    .line 33
    iget-object v0, v0, Lyb0;->o:Lzb0;

    .line 34
    .line 35
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, Lj60;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final d()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Lj60;->d:Lsw;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()I
    .locals 0

    .line 1
    iget p0, p0, Lj60;->a:I

    .line 2
    .line 3
    return p0
.end method
