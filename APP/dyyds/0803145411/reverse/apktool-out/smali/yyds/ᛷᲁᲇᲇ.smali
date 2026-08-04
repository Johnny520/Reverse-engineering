.class public abstract Lyyds/ᛷᲁᲇᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:I

.field public static final ᛲᛳᛶᲁ:Z

.field public static final ᛲᛴᛳᛲ:[Ljava/lang/String;

.field public static volatile ᛲᲈᲁ:Ljava/lang/ref/WeakReference; = null

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛲᲁᲈ;

.field public static final ᛶᛷᛲᲁ:I

.field public static ᛷᲈᲈᲁ:I = 0x1

.field public static ᲀᛲᛳᲀ:Z = true

.field public static final ᲇᲇᲇᛱ:I

.field public static final ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛲᲁᲈ;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᲈ;

    .line 9
    .line 10
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 19
    .line 20
    const/high16 v1, 0x420c0000    # 35.0f

    .line 21
    .line 22
    mul-float/2addr v1, v0

    .line 23
    const/high16 v0, 0x3f000000    # 0.5f

    .line 24
    .line 25
    add-float/2addr v1, v0

    .line 26
    float-to-int v0, v1

    .line 27
    sput v0, Lyyds/ᛷᲁᲇᲇ;->ᲇᲈᛵᛷ:I

    .line 28
    .line 29
    const-string v0, "com.mobile.auth.gatewayauth"

    .line 30
    .line 31
    const-string v1, "com.google.android.gms.ads"

    .line 32
    .line 33
    const-string v2, "com.bytedance.sdk.openadsdk.stub.activity"

    .line 34
    .line 35
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᛴᛳᛲ:[Ljava/lang/String;

    .line 40
    .line 41
    const/4 v0, -0x1

    .line 42
    sput v0, Lyyds/ᛷᲁᲇᲇ;->ᲇᲇᲇᛱ:I

    .line 43
    .line 44
    sput v0, Lyyds/ᛷᲁᲇᲇ;->ᛶᛷᛲᲁ:I

    .line 45
    .line 46
    sput v0, Lyyds/ᛷᲁᲇᲇ;->ᛱᲈᲁ:I

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    sput-boolean v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᛳᛶᲁ:Z

    .line 50
    .line 51
    return-void
.end method

.method public static ᛲᲈᲁ()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/content/Context;

    .line 12
    .line 13
    return-object v0
.end method
