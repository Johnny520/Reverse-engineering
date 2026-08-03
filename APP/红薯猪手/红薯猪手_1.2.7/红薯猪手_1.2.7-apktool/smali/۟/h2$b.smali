.class public final L۟/h2$b;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/h2;->ۥ(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
.field public static final ۥ:L۟/h2$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/h2$b;

    invoke-direct {v0}, L۟/h2$b;-><init>()V

    sput-object v0, L۟/h2$b;->ۥ:L۟/h2$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v2, 0xf

    .line 33
    .line 34
    new-array v2, v2, [B

    .line 35
    .line 36
    fill-array-data v2, :array_2

    .line 37
    .line 38
    .line 39
    new-array v3, v1, [B

    .line 40
    .line 41
    fill-array-data v3, :array_3

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v0, v2}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    const/16 v2, 0xd

    .line 55
    .line 56
    new-array v2, v2, [B

    .line 57
    .line 58
    fill-array-data v2, :array_4

    .line 59
    .line 60
    .line 61
    new-array v1, v1, [B

    .line 62
    .line 63
    fill-array-data v1, :array_5

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v0, v1}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    :cond_0
    invoke-static {p1}, L۟/h2;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 80
    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :array_0
    .array-data 1
        -0x4at
        0x59t
    .end array-data

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    nop

    .line 89
    :array_1
    .array-data 1
        -0x21t
        0x2dt
        -0x8t
        -0x3t
        -0x27t
        -0x80t
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    nop

    .line 97
    :array_2
    .array-data 1
        0x44t
        -0x26t
        0x13t
        -0x48t
        0x4t
        0x64t
        0x70t
        -0x2t
        0x4t
        -0x48t
        0x4t
        0x7ct
        0x7et
        -0x35t
        0x1et
    .end array-data

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    :array_3
    .array-data 1
        0x17t
        -0x41t
        0x67t
        -0x34t
        0x6dt
        0xat
    .end array-data

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    nop

    .line 117
    :array_4
    .array-data 1
        -0x68t
        0x6bt
        0x79t
        -0x6at
        0x14t
        -0x5et
        -0x4et
        0x71t
        0x74t
        -0x7bt
        0x5t
        -0x69t
        -0x58t
    .end array-data

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    nop

    .line 129
    :array_5
    .array-data 1
        -0x2ft
        0x5t
        0x1dt
        -0xdt
        0x6ct
        -0x1dt
    .end array-data
.end method
