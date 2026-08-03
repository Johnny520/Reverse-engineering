.class public final enum Lio/sentry/L2;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lio/sentry/C0;


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/L2;

.field public static final enum ABORTED:Lio/sentry/L2;

.field public static final enum ALREADY_EXISTS:Lio/sentry/L2;

.field public static final enum CANCELLED:Lio/sentry/L2;

.field public static final enum DATA_LOSS:Lio/sentry/L2;

.field public static final enum DEADLINE_EXCEEDED:Lio/sentry/L2;

.field public static final enum FAILED_PRECONDITION:Lio/sentry/L2;

.field public static final enum INTERNAL_ERROR:Lio/sentry/L2;

.field public static final enum INVALID_ARGUMENT:Lio/sentry/L2;

.field public static final enum NOT_FOUND:Lio/sentry/L2;

.field public static final enum OK:Lio/sentry/L2;

.field public static final enum OUT_OF_RANGE:Lio/sentry/L2;

.field public static final enum PERMISSION_DENIED:Lio/sentry/L2;

.field public static final enum RESOURCE_EXHAUSTED:Lio/sentry/L2;

.field public static final enum UNAUTHENTICATED:Lio/sentry/L2;

.field public static final enum UNAVAILABLE:Lio/sentry/L2;

.field public static final enum UNIMPLEMENTED:Lio/sentry/L2;

.field public static final enum UNKNOWN:Lio/sentry/L2;

.field public static final enum UNKNOWN_ERROR:Lio/sentry/L2;


# instance fields
.field private final maxHttpStatusCode:I

.field private final minHttpStatusCode:I


# direct methods
.method private static synthetic $values()[Lio/sentry/L2;
    .locals 19

    sget-object v1, Lio/sentry/L2;->OK:Lio/sentry/L2;

    sget-object v2, Lio/sentry/L2;->CANCELLED:Lio/sentry/L2;

    sget-object v3, Lio/sentry/L2;->INTERNAL_ERROR:Lio/sentry/L2;

    sget-object v4, Lio/sentry/L2;->UNKNOWN:Lio/sentry/L2;

    sget-object v5, Lio/sentry/L2;->UNKNOWN_ERROR:Lio/sentry/L2;

    sget-object v6, Lio/sentry/L2;->INVALID_ARGUMENT:Lio/sentry/L2;

    sget-object v7, Lio/sentry/L2;->DEADLINE_EXCEEDED:Lio/sentry/L2;

    sget-object v8, Lio/sentry/L2;->NOT_FOUND:Lio/sentry/L2;

    sget-object v9, Lio/sentry/L2;->ALREADY_EXISTS:Lio/sentry/L2;

    sget-object v10, Lio/sentry/L2;->PERMISSION_DENIED:Lio/sentry/L2;

    sget-object v11, Lio/sentry/L2;->RESOURCE_EXHAUSTED:Lio/sentry/L2;

    sget-object v12, Lio/sentry/L2;->FAILED_PRECONDITION:Lio/sentry/L2;

    sget-object v13, Lio/sentry/L2;->ABORTED:Lio/sentry/L2;

    sget-object v14, Lio/sentry/L2;->OUT_OF_RANGE:Lio/sentry/L2;

    sget-object v15, Lio/sentry/L2;->UNIMPLEMENTED:Lio/sentry/L2;

    sget-object v16, Lio/sentry/L2;->UNAVAILABLE:Lio/sentry/L2;

    sget-object v17, Lio/sentry/L2;->DATA_LOSS:Lio/sentry/L2;

    sget-object v18, Lio/sentry/L2;->UNAUTHENTICATED:Lio/sentry/L2;

    filled-new-array/range {v1 .. v18}, [Lio/sentry/L2;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/sentry/L2;

    const/4 v1, 0x0

    const/16 v2, 0x18f

    const-string v3, "OK"

    invoke-direct {v0, v3, v1, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lio/sentry/L2;->OK:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/4 v1, 0x1

    const/16 v2, 0x1f3

    const-string v3, "CANCELLED"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->CANCELLED:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "INTERNAL_ERROR"

    const/4 v2, 0x2

    const/16 v3, 0x1f4

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->INTERNAL_ERROR:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->UNKNOWN:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "UNKNOWN_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->UNKNOWN_ERROR:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "INVALID_ARGUMENT"

    const/4 v2, 0x5

    const/16 v4, 0x190

    invoke-direct {v0, v1, v2, v4}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->INVALID_ARGUMENT:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/4 v1, 0x6

    const/16 v2, 0x1f8

    const-string v5, "DEADLINE_EXCEEDED"

    invoke-direct {v0, v5, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->DEADLINE_EXCEEDED:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/4 v1, 0x7

    const/16 v2, 0x194

    const-string v5, "NOT_FOUND"

    invoke-direct {v0, v5, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->NOT_FOUND:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "ALREADY_EXISTS"

    const/16 v2, 0x8

    const/16 v5, 0x199

    invoke-direct {v0, v1, v2, v5}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->ALREADY_EXISTS:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/16 v1, 0x9

    const/16 v2, 0x193

    const-string v6, "PERMISSION_DENIED"

    invoke-direct {v0, v6, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->PERMISSION_DENIED:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/16 v1, 0xa

    const/16 v2, 0x1ad

    const-string v6, "RESOURCE_EXHAUSTED"

    invoke-direct {v0, v6, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->RESOURCE_EXHAUSTED:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "FAILED_PRECONDITION"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2, v4}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->FAILED_PRECONDITION:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "ABORTED"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2, v5}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->ABORTED:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "OUT_OF_RANGE"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v4}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->OUT_OF_RANGE:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/16 v1, 0xe

    const/16 v2, 0x1f5

    const-string v4, "UNIMPLEMENTED"

    invoke-direct {v0, v4, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->UNIMPLEMENTED:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/16 v1, 0xf

    const/16 v2, 0x1f7

    const-string v4, "UNAVAILABLE"

    invoke-direct {v0, v4, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->UNAVAILABLE:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const-string v1, "DATA_LOSS"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->DATA_LOSS:Lio/sentry/L2;

    new-instance v0, Lio/sentry/L2;

    const/16 v1, 0x11

    const/16 v2, 0x191

    const-string v3, "UNAUTHENTICATED"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/L2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/L2;->UNAUTHENTICATED:Lio/sentry/L2;

    invoke-static {}, Lio/sentry/L2;->$values()[Lio/sentry/L2;

    move-result-object v0

    sput-object v0, Lio/sentry/L2;->$VALUES:[Lio/sentry/L2;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lio/sentry/L2;->minHttpStatusCode:I

    .line 3
    iput p3, p0, Lio/sentry/L2;->maxHttpStatusCode:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    iput p3, p0, Lio/sentry/L2;->minHttpStatusCode:I

    .line 6
    iput p4, p0, Lio/sentry/L2;->maxHttpStatusCode:I

    return-void
.end method

.method public static fromApiNameSafely(Ljava/lang/String;)Lio/sentry/L2;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lio/sentry/L2;->valueOf(Ljava/lang/String;)Lio/sentry/L2;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static fromHttpStatusCode(I)Lio/sentry/L2;
    .locals 5

    .line 1
    invoke-static {}, Lio/sentry/L2;->values()[Lio/sentry/L2;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-direct {v3, p0}, Lio/sentry/L2;->matches(I)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static fromHttpStatusCode(Ljava/lang/Integer;Lio/sentry/L2;)Lio/sentry/L2;
    .locals 0

    if-eqz p0, :cond_0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lio/sentry/L2;->fromHttpStatusCode(I)Lio/sentry/L2;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    return-object p1
.end method

.method private matches(I)Z
    .locals 1

    iget v0, p0, Lio/sentry/L2;->minHttpStatusCode:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lio/sentry/L2;->maxHttpStatusCode:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/L2;
    .locals 1

    const-class v0, Lio/sentry/L2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/L2;

    return-object p0
.end method

.method public static values()[Lio/sentry/L2;
    .locals 1

    sget-object v0, Lio/sentry/L2;->$VALUES:[Lio/sentry/L2;

    invoke-virtual {v0}, [Lio/sentry/L2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/L2;

    return-object v0
.end method


# virtual methods
.method public apiName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 0

    invoke-virtual {p0}, Lio/sentry/L2;->apiName()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void
.end method
