.class public final LYue/ۥ۟ۦۨۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥ۟ۦۨۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:D
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟:D
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟:D
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:D
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:D
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:D
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LYue/ۥ۟ۦۨۧ;

    invoke-direct {v0}, LYue/ۥ۟ۦۨۧ;-><init>()V

    sput-object v0, LYue/ۥ۟ۦۨۧ;->ۥ:LYue/ۥ۟ۦۨۧ;

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    sput-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Math;->ulp(D)D

    move-result-wide v0

    sput-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟۟:D

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    sput-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟:D

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    sput-wide v2, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟۟:D

    const/4 v4, 0x1

    int-to-double v4, v4

    div-double v0, v4, v0

    sput-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟۠:D

    div-double/2addr v4, v2

    sput-wide v4, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟ۡ:D

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
