.class public final Lv21;
.super Lf41;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lf41;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lv21;->c:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lf41;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lv21;

    .line 5
    .line 6
    iget p1, p1, Lv21;->c:I

    .line 7
    .line 8
    iput p1, p0, Lv21;->c:I

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)Lf41;
    .locals 1

    .line 1
    new-instance v0, Lv21;

    .line 2
    .line 3
    iget p0, p0, Lv21;->c:I

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lv21;-><init>(IJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
