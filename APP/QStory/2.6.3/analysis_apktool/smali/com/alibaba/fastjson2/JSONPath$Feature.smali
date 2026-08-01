.class public final enum Lcom/alibaba/fastjson2/JSONPath$Feature;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/fastjson2/JSONPath$Feature;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/alibaba/fastjson2/JSONPath$Feature;

.field public static final enum AlwaysReturnList:Lcom/alibaba/fastjson2/JSONPath$Feature;

.field public static final enum DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONPath$Feature;

.field public static final enum KeepNullValue:Lcom/alibaba/fastjson2/JSONPath$Feature;

.field public static final enum NullOnError:Lcom/alibaba/fastjson2/JSONPath$Feature;


# instance fields
.field public final mask:J


# direct methods
.method private static synthetic $values()[Lcom/alibaba/fastjson2/JSONPath$Feature;
    .locals 4

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->AlwaysReturnList:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson2/JSONPath$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONPath$Feature;->KeepNullValue:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 6
    .line 7
    sget-object v3, Lcom/alibaba/fastjson2/JSONPath$Feature;->DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const-string v4, "AlwaysReturnList"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONPath$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->AlwaysReturnList:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 12
    .line 13
    new-instance v0, Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-wide/16 v2, 0x2

    .line 17
    .line 18
    const-string v4, "NullOnError"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONPath$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->NullOnError:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 24
    .line 25
    new-instance v0, Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-wide/16 v2, 0x4

    .line 29
    .line 30
    const-string v4, "KeepNullValue"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONPath$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->KeepNullValue:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 36
    .line 37
    new-instance v0, Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-wide/16 v2, 0x8

    .line 41
    .line 42
    const-string v4, "DisableStringArrayUnwrapping"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/JSONPath$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 48
    .line 49
    invoke-static {}, Lcom/alibaba/fastjson2/JSONPath$Feature;->$values()[Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->$VALUES:[Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Lcom/alibaba/fastjson2/JSONPath$Feature;->mask:J

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath$Feature;
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/alibaba/fastjson2/JSONPath$Feature;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONPath$Feature;->$VALUES:[Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/alibaba/fastjson2/JSONPath$Feature;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 8
    .line 9
    return-object v0
.end method
