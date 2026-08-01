.class public final Ly8;
.super Ljava/util/AbstractSet;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final synthetic d:Ld9;


# direct methods
.method public constructor <init>(Ld9;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8;->d:Ld9;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lb9;

    .line 2
    .line 3
    iget-object p0, p0, Ly8;->d:Ld9;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lb9;-><init>(Ld9;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ly8;->d:Ld9;

    .line 2
    .line 3
    iget p0, p0, Ln11;->f:I

    .line 4
    .line 5
    return p0
.end method
