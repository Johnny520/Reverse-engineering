.class public abstract Lfo2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:I

.field public static final b:Lhh1;

.field public static final c:Lhh1;

.field public static final d:Lhh1;

.field public static final e:Lhh1;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ltl;->Y(Ljava/lang/String;II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lfo2;->a:I

    .line 12
    .line 13
    new-instance v0, Lhh1;

    .line 14
    .line 15
    const-string v1, "PERMIT"

    .line 16
    .line 17
    const/16 v3, 0x13

    .line 18
    .line 19
    invoke-direct {v0, v3, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lfo2;->b:Lhh1;

    .line 23
    .line 24
    new-instance v0, Lhh1;

    .line 25
    .line 26
    const-string v1, "TAKEN"

    .line 27
    .line 28
    invoke-direct {v0, v3, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lfo2;->c:Lhh1;

    .line 32
    .line 33
    new-instance v0, Lhh1;

    .line 34
    .line 35
    const-string v1, "BROKEN"

    .line 36
    .line 37
    invoke-direct {v0, v3, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lfo2;->d:Lhh1;

    .line 41
    .line 42
    new-instance v0, Lhh1;

    .line 43
    .line 44
    const-string v1, "CANCELLED"

    .line 45
    .line 46
    invoke-direct {v0, v3, v1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lfo2;->e:Lhh1;

    .line 50
    .line 51
    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    .line 52
    .line 53
    const/16 v1, 0x10

    .line 54
    .line 55
    invoke-static {v0, v1, v2}, Ltl;->Y(Ljava/lang/String;II)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sput v0, Lfo2;->f:I

    .line 60
    .line 61
    return-void
.end method
