.class public final enum Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

.field public static final enum AlwaysQuoteStrings:Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;


# instance fields
.field public final mask:J


# direct methods
.method private static synthetic $values()[Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;->AlwaysQuoteStrings:Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 2
    .line 3
    filled-new-array {v0}, [Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const-string v4, "AlwaysQuoteStrings"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;->AlwaysQuoteStrings:Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 12
    .line 13
    invoke-static {}, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;->$values()[Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;->$VALUES:[Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 18
    .line 19
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
    iput-wide p3, p0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;->mask:J

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;->$VALUES:[Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/alibaba/fastjson2/support/csv/CSVWriter$Feature;

    .line 8
    .line 9
    return-object v0
.end method
