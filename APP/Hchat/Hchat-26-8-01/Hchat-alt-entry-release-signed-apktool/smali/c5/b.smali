.class public abstract Lc5/b;
.super Lb5/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb5/j;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lc5/b;->h:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()D
    .locals 2

    .line 1
    iget v0, p0, Lc5/b;->h:I

    .line 2
    .line 3
    int-to-double v0, v0

    .line 4
    return-wide v0
.end method
