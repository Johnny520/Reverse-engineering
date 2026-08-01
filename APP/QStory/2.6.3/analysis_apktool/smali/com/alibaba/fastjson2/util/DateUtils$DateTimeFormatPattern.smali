.class public final enum Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

.field public static final enum DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

.field public static final enum DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

.field public static final enum DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

.field public static final enum DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

.field public static final enum DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

.field public static final enum DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

.field public static final enum DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;


# instance fields
.field public final length:I

.field public final pattern:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;
    .locals 7

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 6
    .line 7
    sget-object v3, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 8
    .line 9
    sget-object v4, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 10
    .line 11
    sget-object v5, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 12
    .line 13
    sget-object v6, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 2
    .line 3
    const-string v1, "DATE_FORMAT_10_DASH"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "yyyy-MM-dd"

    .line 7
    .line 8
    const/16 v4, 0xa

    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 14
    .line 15
    new-instance v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const-string v2, "yyyy/MM/dd"

    .line 19
    .line 20
    const-string v3, "DATE_FORMAT_10_SLASH"

    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2, v4}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 26
    .line 27
    new-instance v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const-string v2, "dd.MM.yyyy"

    .line 31
    .line 32
    const-string v3, "DATE_FORMAT_10_DOT"

    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2, v4}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_FORMAT_10_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 38
    .line 39
    new-instance v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 40
    .line 41
    const-string v1, "DATE_TIME_FORMAT_19_DASH"

    .line 42
    .line 43
    const/4 v2, 0x3

    .line 44
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    .line 45
    .line 46
    const/16 v4, 0x13

    .line 47
    .line 48
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 52
    .line 53
    new-instance v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 54
    .line 55
    const/4 v1, 0x4

    .line 56
    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss"

    .line 57
    .line 58
    const-string v3, "DATE_TIME_FORMAT_19_DASH_T"

    .line 59
    .line 60
    invoke-direct {v0, v3, v1, v2, v4}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DASH_T:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 64
    .line 65
    new-instance v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 66
    .line 67
    const/4 v1, 0x5

    .line 68
    const-string v2, "yyyy/MM/dd HH:mm:ss"

    .line 69
    .line 70
    const-string v3, "DATE_TIME_FORMAT_19_SLASH"

    .line 71
    .line 72
    invoke-direct {v0, v3, v1, v2, v4}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_SLASH:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 76
    .line 77
    new-instance v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 78
    .line 79
    const/4 v1, 0x6

    .line 80
    const-string v2, "dd.MM.yyyy HH:mm:ss"

    .line 81
    .line 82
    const-string v3, "DATE_TIME_FORMAT_19_DOT"

    .line 83
    .line 84
    invoke-direct {v0, v3, v1, v2, v4}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->DATE_TIME_FORMAT_19_DOT:Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 88
    .line 89
    invoke-static {}, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->$values()[Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->$VALUES:[Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 94
    .line 95
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->pattern:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->length:I

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->$VALUES:[Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/alibaba/fastjson2/util/DateUtils$DateTimeFormatPattern;

    .line 8
    .line 9
    return-object v0
.end method
