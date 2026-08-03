.class public LYue/ۥ۠ۤۨۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۨۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:D = 0.3333333333333333

.field public static final ۥ۟۟۟۠:D = 0.5


# instance fields
.field public ۥ:D

.field public ۥ۟:D

.field public ۥ۟۟:D

.field public ۥ۟۟۟:D


# direct methods
.method public constructor <init>(DDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ:D

    iput-wide p3, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟:D

    iput-wide p5, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟۟:D

    iput-wide p7, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟۟۟:D

    return-void
.end method


# virtual methods
.method public ۥ(D)D
    .locals 4

    iget-wide v0, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟۟۟:D

    mul-double/2addr v0, p1

    iget-wide v2, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟۟:D

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    iget-wide v2, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟:D

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    iget-wide p1, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ:D

    add-double/2addr v0, p1

    return-wide v0
.end method

.method public ۥ۟(D)D
    .locals 6

    iget-wide v0, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟۟۟:D

    const-wide v2, 0x3fd5555555555555L    # 0.3333333333333333

    mul-double/2addr v0, v2

    mul-double/2addr v0, p1

    iget-wide v2, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟۟:D

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    iget-wide p1, p0, LYue/ۥ۠ۤۨۨ$ۥ;->ۥ۟:D

    add-double/2addr v0, p1

    return-wide v0
.end method
