.class public final Lyyds/ᛳᲈᛷᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Landroid/content/Context;

.field public final ᛵᛸᛸᛷ:Landroid/app/ActivityManager;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲀᛵᲁᛴ;

.field public final ᲇᲈᛵᛷ:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lyyds/ᛳᲈᛷᛳ;->ᲇᲈᛵᛷ:F

    .line 7
    .line 8
    iput-object p1, p0, Lyyds/ᛳᲈᛷᛳ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 9
    .line 10
    const-string v0, "activity"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/app/ActivityManager;

    .line 17
    .line 18
    iput-object v0, p0, Lyyds/ᛳᲈᛷᛳ;->ᛵᛸᛸᛷ:Landroid/app/ActivityManager;

    .line 19
    .line 20
    new-instance v1, Lyyds/ᲀᛵᲁᛴ;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v2, 0x4

    .line 31
    invoke-direct {v1, v2, p1}, Lyyds/ᲀᛵᲁᛴ;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lyyds/ᛳᲈᛷᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛵᲁᛴ;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    iput p1, p0, Lyyds/ᛳᲈᛷᛳ;->ᲇᲈᛵᛷ:F

    .line 44
    .line 45
    :cond_0
    return-void
.end method
