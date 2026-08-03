.class public abstract Lx1/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lu2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lfb/v0;->a()Lu2/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lx1/i0;->a:Lu2/d;

    .line 6
    .line 7
    return-void
.end method

.method public static final a(Lx1/f0;)Lx1/r1;
    .locals 0

    .line 1
    iget-object p0, p0, Lx1/f0;->t:Lx1/r1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "LayoutNode should be attached to an owner"

    .line 7
    .line 8
    invoke-static {p0}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    throw p0
.end method
