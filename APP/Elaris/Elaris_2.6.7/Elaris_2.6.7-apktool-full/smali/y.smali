.class public final Ly;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lba;
.implements Lhc;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Ly;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ly;->a:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Lpd;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ly;->b:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, Ly;->a:Ljava/lang/Object;

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 22
    iput-object p1, p0, Ly;->a:Ljava/lang/Object;

    iput-object p2, p0, Ly;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 17
    iput-object p1, p0, Ly;->b:Ljava/lang/Object;

    iput-object p2, p0, Ly;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Ly;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz9;

    .line 4
    .line 5
    iget-object p0, p0, Ly;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lo4;

    .line 8
    .line 9
    iget-object v1, p0, Lo4;->a:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-static {v0, p1}, Lz9;->b(Lz9;I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x3

    .line 19
    if-ne v1, v2, :cond_3

    .line 20
    .line 21
    const-string v1, "V"

    .line 22
    .line 23
    invoke-static {v0, p1}, Lz9;->c(Lz9;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    const-string v1, "TwoLevel"

    .line 34
    .line 35
    const-string v3, "Release"

    .line 36
    .line 37
    const-string v4, "refreshLayout"

    .line 38
    .line 39
    filled-new-array {v4, v1, v3}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_2

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-virtual {v0, v4, p2}, Lz9;->d(Ljava/lang/String;I)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-static {v0, p1}, Lz9;->a(Lz9;I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lo4;->a:Ljava/lang/String;

    .line 63
    .line 64
    :cond_3
    :goto_1
    return-void
.end method

.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-static {v0}, Lfc;->u(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lfc;->t()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Ly;->a:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v0, p0}, Lfc;->k(Landroid/view/View;Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Lfc;->V(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
