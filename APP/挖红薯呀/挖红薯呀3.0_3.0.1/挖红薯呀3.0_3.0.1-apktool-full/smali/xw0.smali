.class public final Lxw0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lno;


# instance fields
.field public final synthetic a:Lyw0;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcx0;


# direct methods
.method public constructor <init>(Lyw0;Ljava/lang/Object;Lcx0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxw0;->a:Lyw0;

    .line 5
    .line 6
    iput-object p2, p0, Lxw0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lxw0;->c:Lcx0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxw0;->a:Lyw0;

    .line 2
    .line 3
    iget-object v1, v0, Lyw0;->e:Ljh0;

    .line 4
    .line 5
    iget-object v2, p0, Lxw0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljh0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, Lxw0;->c:Lcx0;

    .line 12
    .line 13
    if-ne v1, p0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lyw0;->d:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcx0;->c()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method
