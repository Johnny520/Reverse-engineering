.class public final synthetic Lab;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lxq0;

.field public final synthetic e:Lsd0;

.field public final synthetic f:Lzd0;

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Lcb;


# direct methods
.method public synthetic constructor <init>(Lxq0;Lsd0;Lzd0;IILcb;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lab;->d:Lxq0;

    .line 5
    .line 6
    iput-object p2, p0, Lab;->e:Lsd0;

    .line 7
    .line 8
    iput-object p3, p0, Lab;->f:Lzd0;

    .line 9
    .line 10
    iput p4, p0, Lab;->g:I

    .line 11
    .line 12
    iput p5, p0, Lab;->h:I

    .line 13
    .line 14
    iput-object p6, p0, Lab;->i:Lcb;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lwq0;

    .line 3
    .line 4
    iget-object p1, p0, Lab;->f:Lzd0;

    .line 5
    .line 6
    invoke-interface {p1}, Ll30;->getLayoutDirection()Lk50;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object p1, p0, Lab;->i:Lcb;

    .line 11
    .line 12
    iget-object v6, p1, Lcb;->a:Lha;

    .line 13
    .line 14
    iget-object v1, p0, Lab;->d:Lxq0;

    .line 15
    .line 16
    iget-object v2, p0, Lab;->e:Lsd0;

    .line 17
    .line 18
    iget v4, p0, Lab;->g:I

    .line 19
    .line 20
    iget v5, p0, Lab;->h:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, Lza;->b(Lwq0;Lxq0;Lsd0;Lk50;IILha;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lna1;->a:Lna1;

    .line 26
    .line 27
    return-object p0
.end method
