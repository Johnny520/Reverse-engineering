.class public abstract Ld6/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:I

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:J

.field public static final f:J

.field public static final g:J

.field public static final h:J

.field public static final i:Ljava/text/DecimalFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Ld6/h;->a:I

    .line 8
    .line 9
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput v0, Ld6/h;->b:I

    .line 17
    .line 18
    const v0, 0x40490fdb    # (float)Math.PI

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, Ld6/h;->c:I

    .line 26
    .line 27
    const v0, 0x402df854    # (float)Math.E

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sput v0, Ld6/h;->d:I

    .line 35
    .line 36
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    sput-wide v0, Ld6/h;->e:J

    .line 43
    .line 44
    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    sput-wide v0, Ld6/h;->f:J

    .line 54
    .line 55
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    sput-wide v0, Ld6/h;->g:J

    .line 65
    .line 66
    const-wide v0, 0x4005bf0a8b145769L    # Math.E

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    sput-wide v0, Ld6/h;->h:J

    .line 76
    .line 77
    new-instance v0, Ljava/text/DecimalFormat;

    .line 78
    .line 79
    const-string v1, "0.####################E0"

    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sput-object v0, Ld6/h;->i:Ljava/text/DecimalFormat;

    .line 85
    .line 86
    return-void
.end method
