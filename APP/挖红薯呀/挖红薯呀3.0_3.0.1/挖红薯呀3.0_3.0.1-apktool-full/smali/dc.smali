.class public abstract Ldc;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lln0;

.field public static final b:Lln0;

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget v0, Lrd0;->q:F

    .line 2
    .line 3
    sget v1, Lrd0;->r:F

    .line 4
    .line 5
    new-instance v2, Lln0;

    .line 6
    .line 7
    const/high16 v3, 0x41000000    # 8.0f

    .line 8
    .line 9
    invoke-direct {v2, v0, v3, v1, v3}, Lln0;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    sput-object v2, Ldc;->a:Lln0;

    .line 13
    .line 14
    const/high16 v0, 0x41800000    # 16.0f

    .line 15
    .line 16
    invoke-static {v0, v3, v1, v3}, Lrd0;->d(FFFF)Lln0;

    .line 17
    .line 18
    .line 19
    new-instance v1, Lln0;

    .line 20
    .line 21
    const/high16 v2, 0x41400000    # 12.0f

    .line 22
    .line 23
    invoke-direct {v1, v2, v3, v2, v3}, Lln0;-><init>(FFFF)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Ldc;->b:Lln0;

    .line 27
    .line 28
    invoke-static {v2, v3, v0, v3}, Lrd0;->d(FFFF)Lln0;

    .line 29
    .line 30
    .line 31
    const/high16 v0, 0x42680000    # 58.0f

    .line 32
    .line 33
    sput v0, Ldc;->c:F

    .line 34
    .line 35
    const/high16 v0, 0x42200000    # 40.0f

    .line 36
    .line 37
    sput v0, Ldc;->d:F

    .line 38
    .line 39
    return-void
.end method
