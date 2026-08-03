.class public final enum Lio/sentry/y2;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/y2;

.field public static final enum HIGH:Lio/sentry/y2;

.field public static final enum LOW:Lio/sentry/y2;

.field public static final enum MEDIUM:Lio/sentry/y2;


# instance fields
.field public final bitRate:I

.field public final screenshotQuality:I

.field public final sizeScale:F


# direct methods
.method private static synthetic $values()[Lio/sentry/y2;
    .locals 3

    sget-object v0, Lio/sentry/y2;->LOW:Lio/sentry/y2;

    sget-object v1, Lio/sentry/y2;->MEDIUM:Lio/sentry/y2;

    sget-object v2, Lio/sentry/y2;->HIGH:Lio/sentry/y2;

    filled-new-array {v0, v1, v2}, [Lio/sentry/y2;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lio/sentry/y2;

    const v4, 0xc350

    const/16 v5, 0xa

    const-string v1, "LOW"

    const/4 v2, 0x0

    const v3, 0x3f4ccccd    # 0.8f

    invoke-direct/range {v0 .. v5}, Lio/sentry/y2;-><init>(Ljava/lang/String;IFII)V

    sput-object v0, Lio/sentry/y2;->LOW:Lio/sentry/y2;

    new-instance v1, Lio/sentry/y2;

    const v5, 0x124f8

    const/16 v6, 0x1e

    const-string v2, "MEDIUM"

    const/4 v3, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct/range {v1 .. v6}, Lio/sentry/y2;-><init>(Ljava/lang/String;IFII)V

    sput-object v1, Lio/sentry/y2;->MEDIUM:Lio/sentry/y2;

    new-instance v2, Lio/sentry/y2;

    const v6, 0x186a0

    const/16 v7, 0x32

    const-string v3, "HIGH"

    const/4 v4, 0x2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct/range {v2 .. v7}, Lio/sentry/y2;-><init>(Ljava/lang/String;IFII)V

    sput-object v2, Lio/sentry/y2;->HIGH:Lio/sentry/y2;

    invoke-static {}, Lio/sentry/y2;->$values()[Lio/sentry/y2;

    move-result-object v0

    sput-object v0, Lio/sentry/y2;->$VALUES:[Lio/sentry/y2;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FII)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/sentry/y2;->sizeScale:F

    iput p4, p0, Lio/sentry/y2;->bitRate:I

    iput p5, p0, Lio/sentry/y2;->screenshotQuality:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/y2;
    .locals 1

    const-class v0, Lio/sentry/y2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/y2;

    return-object p0
.end method

.method public static values()[Lio/sentry/y2;
    .locals 1

    sget-object v0, Lio/sentry/y2;->$VALUES:[Lio/sentry/y2;

    invoke-virtual {v0}, [Lio/sentry/y2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/y2;

    return-object v0
.end method


# virtual methods
.method public serializedName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
