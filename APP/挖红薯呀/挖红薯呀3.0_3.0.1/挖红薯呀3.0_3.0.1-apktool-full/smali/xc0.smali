.class public final synthetic Lxc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Llf1;

.field public final synthetic e:Z

.field public final synthetic f:Lsw;

.field public final synthetic g:Lpe0;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Llf1;ZLsw;Lpe0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxc0;->d:Llf1;

    .line 5
    .line 6
    iput-boolean p2, p0, Lxc0;->e:Z

    .line 7
    .line 8
    iput-object p3, p0, Lxc0;->f:Lsw;

    .line 9
    .line 10
    iput-object p4, p0, Lxc0;->g:Lpe0;

    .line 11
    .line 12
    iput p5, p0, Lxc0;->h:I

    .line 13
    .line 14
    iput p6, p0, Lxc0;->i:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v7

    .line 10
    iget-object v0, p0, Lxc0;->d:Llf1;

    .line 11
    .line 12
    iget-boolean v1, p0, Lxc0;->e:Z

    .line 13
    .line 14
    iget-object v2, p0, Lxc0;->f:Lsw;

    .line 15
    .line 16
    iget-object v3, p0, Lxc0;->g:Lpe0;

    .line 17
    .line 18
    iget v4, p0, Lxc0;->h:I

    .line 19
    .line 20
    iget v5, p0, Lxc0;->i:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v7}, Lzc0;->q(Llf1;ZLsw;Lpe0;IILji;I)Lna1;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
