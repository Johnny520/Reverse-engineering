.class public abstract Lxhss/ᲇᛸᲀᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:I

.field public static final ᛳᲁᲇᛸ:[Ljava/lang/String;

.field public static final ᛷᛴᛷᛱ:I

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

.field public static ᛸᛴᛶᛳ:I = 0x1

.field public static final ᲀᲇᛳᲁ:Z

.field public static final ᲇᛴᲇᛵ:I

.field public static final ᲇᛶᛴᲀ:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

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
    sput v0, Lxhss/ᲇᛸᲀᛸ;->ᛱᛱᛲᲇ:I

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
    sput-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛳᲁᲇᛸ:[Ljava/lang/String;

    .line 40
    .line 41
    const/4 v0, -0x1

    .line 42
    sput v0, Lxhss/ᲇᛸᲀᛸ;->ᲇᛴᲇᛵ:I

    .line 43
    .line 44
    sput v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛴᛷᛱ:I

    .line 45
    .line 46
    sput v0, Lxhss/ᲇᛸᲀᛸ;->ᲇᛶᛴᲀ:I

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    sput-boolean v0, Lxhss/ᲇᛸᲀᛸ;->ᲀᲇᛳᲁ:Z

    .line 50
    .line 51
    return-void
.end method
