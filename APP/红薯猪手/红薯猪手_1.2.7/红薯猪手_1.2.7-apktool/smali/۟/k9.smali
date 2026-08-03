.class public final L۟/k9;
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
.field public static final ۥ:L۟/k9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/k9;

    invoke-direct {v0}, L۟/k9;-><init>()V

    sput-object v0, L۟/k9;->ۥ:L۟/k9;

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
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 27
    .line 28
    const/16 v2, 0x39

    .line 29
    .line 30
    new-array v2, v2, [B

    .line 31
    .line 32
    fill-array-data v2, :array_2

    .line 33
    .line 34
    .line 35
    new-array v1, v1, [B

    .line 36
    .line 37
    fill-array-data v1, :array_3

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1, p1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Landroid/app/Activity;

    .line 48
    .line 49
    sget-object v1, L۟/n8;->ۥ:L۟/n8;

    .line 50
    .line 51
    new-instance v2, L۟/j9;

    .line 52
    .line 53
    invoke-direct {v2, p1, v0}, L۟/j9;-><init>(Landroid/app/Activity;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v2}, L۟/n8;->ۥ۟ۢ(Landroid/app/Activity;L۟/f3;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 63
    .line 64
    return-object p1

    .line 65
    :array_0
    .array-data 1
        0xat
        0x3dt
    .end array-data

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    nop

    .line 71
    :array_1
    .array-data 1
        0x63t
        0x49t
        0xft
        -0x61t
        -0x39t
        -0x63t
    .end array-data

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    nop

    .line 79
    :array_2
    .array-data 1
        0x2et
        0x4t
        -0x27t
        0x19t
        -0x44t
        0x2bt
        0x21t
        0x1ft
        -0x25t
        0x1at
        -0x18t
        0x68t
        0x22t
        0x14t
        -0x6bt
        0x16t
        -0x3t
        0x3bt
        0x34t
        0x51t
        -0x3ft
        0x1at
        -0x44t
        0x26t
        0x2ft
        0x1ft
        -0x68t
        0x1bt
        -0x17t
        0x24t
        0x2ct
        0x51t
        -0x3ft
        0xct
        -0x14t
        0x2dt
        0x60t
        0x10t
        -0x25t
        0x11t
        -0x12t
        0x27t
        0x29t
        0x15t
        -0x65t
        0x14t
        -0x14t
        0x38t
        0x6et
        0x30t
        -0x2at
        0x1t
        -0xbt
        0x3et
        0x29t
        0x5t
        -0x34t
    .end array-data

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
    .line 110
    .line 111
    .line 112
    nop

    .line 113
    :array_3
    .array-data 1
        0x40t
        0x71t
        -0x4bt
        0x75t
        -0x64t
        0x48t
    .end array-data
.end method
