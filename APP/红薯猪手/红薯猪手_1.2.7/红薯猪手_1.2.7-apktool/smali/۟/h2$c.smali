.class public final L۟/h2$c;
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


# instance fields
.field public final synthetic ۥ:L۟/h2;


# direct methods
.method public constructor <init>(L۟/h2;)V
    .locals 0

    iput-object p1, p0, L۟/h2$c;->ۥ:L۟/h2;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

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
    sget-object v0, L۟/n8;->ۥ:L۟/n8;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, L۟/n8;->ۥ()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-lez v0, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 43
    .line 44
    const/16 v0, 0x39

    .line 45
    .line 46
    new-array v0, v0, [B

    .line 47
    .line 48
    fill-array-data v0, :array_2

    .line 49
    .line 50
    .line 51
    new-array v1, v1, [B

    .line 52
    .line 53
    fill-array-data v1, :array_3

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    check-cast p1, Landroid/app/Activity;

    .line 64
    .line 65
    const v0, 0x1020002

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    iget-object v0, p0, L۟/h2$c;->ۥ:L۟/h2;

    .line 75
    .line 76
    invoke-static {v0, p1}, L۟/h2;->ۥ۟۟(L۟/h2;Landroid/app/Activity;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    iget-object v1, p0, L۟/h2$c;->ۥ:L۟/h2;

    .line 81
    .line 82
    new-instance v2, L۟/ib;

    .line 83
    .line 84
    const/4 v3, 0x5

    .line 85
    invoke-direct {v2, v1, p1, v3}, L۟/ib;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    const-wide/16 v3, 0xc8

    .line 89
    .line 90
    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_1
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :array_0
    .array-data 1
        0x72t
        -0x55t
    .end array-data

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    nop

    .line 103
    :array_1
    .array-data 1
        0x1bt
        -0x21t
        0x17t
        -0xct
        0x5t
        -0x4ct
    .end array-data

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    nop

    .line 111
    :array_2
    .array-data 1
        -0x28t
        0x7ct
        -0x38t
        0x34t
        0x62t
        -0x60t
        -0x29t
        0x67t
        -0x36t
        0x37t
        0x36t
        -0x1dt
        -0x2ct
        0x6ct
        -0x7ct
        0x3bt
        0x23t
        -0x50t
        -0x3et
        0x29t
        -0x30t
        0x37t
        0x62t
        -0x53t
        -0x27t
        0x67t
        -0x77t
        0x36t
        0x37t
        -0x51t
        -0x26t
        0x29t
        -0x30t
        0x21t
        0x32t
        -0x5at
        -0x6at
        0x68t
        -0x36t
        0x3ct
        0x30t
        -0x54t
        -0x21t
        0x6dt
        -0x76t
        0x39t
        0x32t
        -0x4dt
        -0x68t
        0x48t
        -0x39t
        0x2ct
        0x2bt
        -0x4bt
        -0x21t
        0x7dt
        -0x23t
    .end array-data

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
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    nop

    .line 145
    :array_3
    .array-data 1
        -0x4at
        0x9t
        -0x5ct
        0x58t
        0x42t
        -0x3dt
    .end array-data
.end method
