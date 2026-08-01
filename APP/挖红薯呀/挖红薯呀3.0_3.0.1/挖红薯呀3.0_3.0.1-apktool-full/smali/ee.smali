.class public final Lee;
.super Lf40;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lde;


# instance fields
.field public final k:Lj40;


# direct methods
.method public constructor <init>(Lj40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhb0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lee;->k:Lj40;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lf40;->q()Lj40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lj40;->E(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final r()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lee;->k:Lj40;

    .line 2
    .line 3
    invoke-virtual {p0}, Lf40;->q()Lj40;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Lj40;->A(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
