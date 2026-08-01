.class public final Ltx0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lqx0;


# instance fields
.field public final synthetic d:Lww;

.field public final synthetic e:Lsw;


# direct methods
.method public constructor <init>(Lww;Lsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltx0;->d:Lww;

    .line 5
    .line 6
    iput-object p2, p0, Ltx0;->e:Lsw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ltx0;->e:Lsw;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i(Lvw0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ltx0;->d:Lww;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
