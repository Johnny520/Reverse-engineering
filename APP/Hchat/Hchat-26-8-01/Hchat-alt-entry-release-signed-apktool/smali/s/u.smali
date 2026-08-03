.class public abstract Ls/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-long v1, v0

    .line 3
    const/16 v3, 0x20

    .line 4
    .line 5
    shl-long v3, v1, v3

    .line 6
    .line 7
    const-wide v5, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v1, v5

    .line 13
    or-long/2addr v1, v3

    .line 14
    new-instance v3, Lu2/j;

    .line 15
    .line 16
    invoke-direct {v3, v1, v2}, Lu2/j;-><init>(J)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/high16 v2, 0x43c80000    # 400.0f

    .line 21
    .line 22
    invoke-static {v1, v2, v3, v0}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Ls/u;->a:Li/r0;

    .line 27
    .line 28
    return-void
.end method
