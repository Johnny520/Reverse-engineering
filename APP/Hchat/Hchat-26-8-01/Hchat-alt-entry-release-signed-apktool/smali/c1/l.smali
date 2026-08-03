.class public final Lc1/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lc1/a;


# static fields
.field public static final g:Lc1/l;

.field public static final h:Lu2/m;

.field public static final i:Lu2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc1/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc1/l;->g:Lc1/l;

    .line 7
    .line 8
    sget-object v0, Lu2/m;->g:Lu2/m;

    .line 9
    .line 10
    sput-object v0, Lc1/l;->h:Lu2/m;

    .line 11
    .line 12
    new-instance v0, Lu2/d;

    .line 13
    .line 14
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-direct {v0, v1, v1}, Lu2/d;-><init>(FF)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lc1/l;->i:Lu2/d;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final d()Lu2/c;
    .locals 1

    .line 1
    sget-object v0, Lc1/l;->i:Lu2/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayoutDirection()Lu2/m;
    .locals 1

    .line 1
    sget-object v0, Lc1/l;->h:Lu2/m;

    .line 2
    .line 3
    return-object v0
.end method
