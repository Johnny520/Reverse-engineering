.class public abstract Lh1/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lu2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu2/d;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, Lu2/d;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh1/c;->a:Lu2/d;

    .line 9
    .line 10
    return-void
.end method
