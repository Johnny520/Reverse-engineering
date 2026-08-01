.class public abstract L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:J

.field public static final 飘花落叶言子楪世兰苏哲:Z

.field public static final 飘花落叶言子楪世哲兰苏:Z

.field public static 飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

.field public static 飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/DialogX$THEME;

.field public static 飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;

.field public static final 飘花落叶言子楪哲世兰苏:I

.field public static final 飘花落叶言子楪哲世苏兰:I

.field public static final 飘花落叶言子楪哲兰世苏:Z

.field public static final 飘花落叶言子楪哲苏世兰:I

.field public static final 飘花落叶言子楪哲苏兰世:I

.field public static final 飘花落叶言子楪苏世兰哲:Z

.field public static final 飘花落叶言子楪苏世哲兰:J

.field public static final 飘花落叶言子楪苏兰世哲:[Ljava/lang/String;

.field public static final 飘花落叶言子楪苏兰哲世:I

.field public static final 飘花落叶言子楪苏哲世兰:Z

.field public static final 飘花落叶言子楪苏哲兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言楪哲苏子世兰/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪哲苏子世兰/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    sget-object v0, Lcom/kongzue/dialogx/DialogX$THEME;->LIGHT:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 10
    .line 11
    sput-object v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 12
    .line 13
    sget-object v0, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->VIEW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 14
    .line 15
    sput-object v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    sput-boolean v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 19
    .line 20
    sput-boolean v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 21
    .line 22
    const-wide/16 v1, -0x1

    .line 23
    .line 24
    sput-wide v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 25
    .line 26
    sput-wide v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 27
    .line 28
    sput-boolean v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:Z

    .line 29
    .line 30
    sput-boolean v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:Z

    .line 31
    .line 32
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 41
    .line 42
    const/high16 v2, 0x420c0000    # 35.0f

    .line 43
    .line 44
    mul-float/2addr v2, v1

    .line 45
    const/high16 v1, 0x3f000000    # 0.5f

    .line 46
    .line 47
    add-float/2addr v2, v1

    .line 48
    float-to-int v1, v2

    .line 49
    sput v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:I

    .line 50
    .line 51
    const-string v1, "com.mobile.auth.gatewayauth"

    .line 52
    .line 53
    const-string v2, "com.google.android.gms.ads"

    .line 54
    .line 55
    const-string v3, "com.bytedance.sdk.openadsdk.stub.activity"

    .line 56
    .line 57
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sput-object v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:[Ljava/lang/String;

    .line 62
    .line 63
    const/4 v1, -0x1

    .line 64
    sput v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:I

    .line 65
    .line 66
    sput v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:I

    .line 67
    .line 68
    sput v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:I

    .line 69
    .line 70
    sput v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰:I

    .line 71
    .line 72
    sput v1, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 73
    .line 74
    sput-boolean v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Z

    .line 75
    .line 76
    return-void
.end method
