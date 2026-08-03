.class public final L۟/h2$d;
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
.field public static final ۥ:L۟/h2$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/h2$d;

    invoke-direct {v0}, L۟/h2$d;-><init>()V

    sput-object v0, L۟/h2$d;->ۥ:L۟/h2$d;

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
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    const/16 v0, 0x39

    .line 25
    .line 26
    new-array v0, v0, [B

    .line 27
    .line 28
    fill-array-data v0, :array_2

    .line 29
    .line 30
    .line 31
    new-array v2, v1, [B

    .line 32
    .line 33
    fill-array-data v2, :array_3

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Landroid/app/Activity;

    .line 44
    .line 45
    const v0, 0x1020002

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroid/widget/FrameLayout;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    sget-object v2, L۟/q;->ۥ۟:L۟/kb;

    .line 57
    .line 58
    invoke-static {}, L۟/q$c;->ۥ۟()Landroid/os/Handler;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, L۟/ib;

    .line 63
    .line 64
    invoke-direct {v3, v0, p1, v1}, L۟/ib;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    const-wide/16 v0, 0x64

    .line 68
    .line 69
    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 70
    .line 71
    .line 72
    :cond_0
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 73
    .line 74
    return-object p1

    .line 75
    :array_0
    .array-data 1
        0x25t
        -0xdt
    .end array-data

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    nop

    .line 81
    :array_1
    .array-data 1
        0x4ct
        -0x79t
        0x29t
        -0x52t
        0x19t
        -0x2ft
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    nop

    .line 89
    :array_2
    .array-data 1
        -0x37t
        0x60t
        0x4t
        0x1dt
        0x20t
        0x47t
        -0x3at
        0x7bt
        0x6t
        0x1et
        0x74t
        0x4t
        -0x3bt
        0x70t
        0x48t
        0x12t
        0x61t
        0x57t
        -0x2dt
        0x35t
        0x1ct
        0x1et
        0x20t
        0x4at
        -0x38t
        0x7bt
        0x45t
        0x1ft
        0x75t
        0x48t
        -0x35t
        0x35t
        0x1ct
        0x8t
        0x70t
        0x41t
        -0x79t
        0x74t
        0x6t
        0x15t
        0x72t
        0x4bt
        -0x32t
        0x71t
        0x46t
        0x10t
        0x70t
        0x54t
        -0x77t
        0x54t
        0xbt
        0x5t
        0x69t
        0x52t
        -0x32t
        0x61t
        0x11t
    .end array-data

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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    nop

    .line 123
    :array_3
    .array-data 1
        -0x59t
        0x15t
        0x68t
        0x71t
        0x0t
        0x24t
    .end array-data
.end method
