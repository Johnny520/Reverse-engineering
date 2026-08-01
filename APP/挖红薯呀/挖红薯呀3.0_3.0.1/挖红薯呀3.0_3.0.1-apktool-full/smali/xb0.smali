.class public final Lxb0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyd0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lsw;

.field public final synthetic e:Lsw;

.field public final synthetic f:Lyb0;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lsw;Lsw;Lyb0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxb0;->a:I

    .line 5
    .line 6
    iput p2, p0, Lxb0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lxb0;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lxb0;->d:Lsw;

    .line 11
    .line 12
    iput-object p5, p0, Lxb0;->e:Lsw;

    .line 13
    .line 14
    iput-object p6, p0, Lxb0;->f:Lyb0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lxb0;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxb0;->f:Lyb0;

    .line 2
    .line 3
    iget-object v0, v0, Lyb0;->o:Lzb0;

    .line 4
    .line 5
    iget-object p0, p0, Lxb0;->e:Lsw;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, Lxb0;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public final d()Lsw;
    .locals 0

    .line 1
    iget-object p0, p0, Lxb0;->d:Lsw;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()I
    .locals 0

    .line 1
    iget p0, p0, Lxb0;->a:I

    .line 2
    .line 3
    return p0
.end method
