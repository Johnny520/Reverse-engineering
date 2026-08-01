.class public final synthetic Lki0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lxq0;

.field public final synthetic e:Lxq0;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Lxq0;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lxq0;Lxq0;IILxq0;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lki0;->d:Lxq0;

    .line 5
    .line 6
    iput-object p2, p0, Lki0;->e:Lxq0;

    .line 7
    .line 8
    iput p3, p0, Lki0;->f:I

    .line 9
    .line 10
    iput p4, p0, Lki0;->g:I

    .line 11
    .line 12
    iput-object p5, p0, Lki0;->h:Lxq0;

    .line 13
    .line 14
    iput p6, p0, Lki0;->i:I

    .line 15
    .line 16
    iput p7, p0, Lki0;->j:I

    .line 17
    .line 18
    iput p8, p0, Lki0;->k:I

    .line 19
    .line 20
    iput p9, p0, Lki0;->l:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lwq0;

    .line 2
    .line 3
    iget-object v0, p0, Lki0;->d:Lxq0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lxq0;->d:I

    .line 8
    .line 9
    iget v2, p0, Lki0;->k:I

    .line 10
    .line 11
    sub-int/2addr v2, v1

    .line 12
    div-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    iget v1, v0, Lxq0;->e:I

    .line 15
    .line 16
    iget v3, p0, Lki0;->l:I

    .line 17
    .line 18
    sub-int/2addr v3, v1

    .line 19
    div-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    invoke-static {p1, v0, v2, v3}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lki0;->e:Lxq0;

    .line 25
    .line 26
    iget v1, p0, Lki0;->f:I

    .line 27
    .line 28
    iget v2, p0, Lki0;->g:I

    .line 29
    .line 30
    invoke-static {p1, v0, v1, v2}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lki0;->h:Lxq0;

    .line 34
    .line 35
    iget v1, p0, Lki0;->i:I

    .line 36
    .line 37
    iget p0, p0, Lki0;->j:I

    .line 38
    .line 39
    invoke-static {p1, v0, v1, p0}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lna1;->a:Lna1;

    .line 43
    .line 44
    return-object p0
.end method
