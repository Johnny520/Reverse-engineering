.class public final Lyyds/ᛶᛵᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛴᛴᲇᲇ;

.field public final synthetic ᲇᲈᛵᛷ:J


# direct methods
.method public constructor <init>(Lyyds/ᛴᛴᲇᲇ;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛶᛵᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᲇᲇ;

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᛶᛵᛷ;->ᲇᲈᛵᛷ:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛵᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᲇᲇ;

    .line 2
    .line 3
    iget-boolean v1, v0, Lyyds/ᛴᛴᲇᲇ;->ᲇᲇᲇᛱ:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-wide v3, p0, Lyyds/ᛶᛵᛷ;->ᲇᲈᛵᛷ:J

    .line 13
    .line 14
    sub-long/2addr v1, v3

    .line 15
    long-to-float v1, v1

    .line 16
    const v2, 0x44228000    # 650.0f

    .line 17
    .line 18
    .line 19
    div-float/2addr v1, v2

    .line 20
    const/4 v2, 0x0

    .line 21
    const/high16 v3, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sub-float v2, v3, v1

    .line 28
    .line 29
    mul-float v4, v2, v2

    .line 30
    .line 31
    mul-float/2addr v4, v2

    .line 32
    sub-float v2, v3, v4

    .line 33
    .line 34
    iput v2, v0, Lyyds/ᛴᛴᲇᲇ;->ᛲᛴᛳᛲ:F

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 37
    .line 38
    .line 39
    cmpg-float v1, v1, v3

    .line 40
    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    const-wide/16 v1, 0x10

    .line 44
    .line 45
    invoke-virtual {v0, p0, v1, v2}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const/4 p0, 0x0

    .line 50
    iput-boolean p0, v0, Lyyds/ᛴᛴᲇᲇ;->ᲇᲇᲇᛱ:Z

    .line 51
    .line 52
    const/high16 p0, -0x40800000    # -1.0f

    .line 53
    .line 54
    iput p0, v0, Lyyds/ᛴᛴᲇᲇ;->ᛲᛴᛳᛲ:F

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 57
    .line 58
    .line 59
    return-void
.end method
