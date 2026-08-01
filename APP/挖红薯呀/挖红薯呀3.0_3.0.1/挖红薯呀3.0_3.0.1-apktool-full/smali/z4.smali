.class public final Lz4;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:Lzn;

.field public final synthetic e:Lhw;

.field public final synthetic f:Lxn;

.field public final synthetic g:Lk50;


# direct methods
.method public constructor <init>(Lzn;Lhw;Lxn;Lk50;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz4;->d:Lzn;

    .line 2
    .line 3
    iput-object p2, p0, Lz4;->e:Lhw;

    .line 4
    .line 5
    iput-object p3, p0, Lz4;->f:Lxn;

    .line 6
    .line 7
    iput-object p4, p0, Lz4;->g:Lk50;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz4;->f:Lxn;

    .line 2
    .line 3
    iget-object v1, p0, Lz4;->g:Lk50;

    .line 4
    .line 5
    iget-object v2, p0, Lz4;->d:Lzn;

    .line 6
    .line 7
    iget-object p0, p0, Lz4;->e:Lhw;

    .line 8
    .line 9
    invoke-virtual {v2, p0, v0, v1}, Lzn;->e(Lhw;Lxn;Lk50;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lna1;->a:Lna1;

    .line 13
    .line 14
    return-object p0
.end method
