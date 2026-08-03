.class public final L۟/s4;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/s4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/s4;

    invoke-direct {v0}, L۟/s4;-><init>()V

    sput-object v0, L۟/s4;->ۥ:L۟/s4;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    const/16 v0, 0xa

    .line 25
    .line 26
    new-array v0, v0, [B

    .line 27
    .line 28
    fill-array-data v0, :array_2

    .line 29
    .line 30
    .line 31
    new-array v1, v1, [B

    .line 32
    .line 33
    fill-array-data v1, :array_3

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    .line 44
    .line 45
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, L۟/k;->ۥۢۧ:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p1, v0}, L۟/r3;->ۥ۠ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 55
    .line 56
    return-object p1

    .line 57
    :array_0
    .array-data 1
        0x6at
        0x72t
    .end array-data

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    nop

    .line 63
    :array_1
    .array-data 1
        0x3t
        0x6t
        0x15t
        0x5at
        -0x51t
        -0x33t
    .end array-data

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    nop

    .line 71
    :array_2
    .array-data 1
        -0x52t
        0x56t
        0x17t
        0x4t
        0x16t
        0x57t
        -0x50t
        0x5bt
        0x1dt
        0x3t
    .end array-data

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    nop

    .line 81
    :array_3
    .array-data 1
        -0x26t
        0x3et
        0x7et
        0x77t
        0x59t
        0x35t
    .end array-data
.end method
