.class public final Lb10;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lon2;


# instance fields
.field public v:Z

.field public final w:Z

.field public x:Lin0;


# direct methods
.method public constructor <init>(ZZLin0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lb10;->v:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lb10;->w:Z

    .line 7
    .line 8
    iput-object p3, p0, Lb10;->x:Lin0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final l0(Lzn2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb10;->x:Lin0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lb10;->w:Z

    .line 2
    .line 3
    return p0
.end method

.method public final o0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lb10;->v:Z

    .line 2
    .line 3
    return p0
.end method
