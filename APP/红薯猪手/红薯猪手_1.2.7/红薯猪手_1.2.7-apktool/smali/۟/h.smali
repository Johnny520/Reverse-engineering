.class public final L۟/h;
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
.field public static final ۥ:L۟/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/h;

    invoke-direct {v0}, L۟/h;-><init>()V

    sput-object v0, L۟/h;->ۥ:L۟/h;

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
    sget-object v0, L۟/n8;->ۥ:L۟/n8;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, L۟/n8;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    sget-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    .line 34
    .line 35
    iget-object v0, v0, L۟/k;->ۥ۟:Ljava/lang/String;

    .line 36
    .line 37
    const/16 v2, 0x13

    .line 38
    .line 39
    new-array v2, v2, [B

    .line 40
    .line 41
    fill-array-data v2, :array_2

    .line 42
    .line 43
    .line 44
    new-array v3, v1, [B

    .line 45
    .line 46
    fill-array-data v3, :array_3

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/16 v2, 0x11

    .line 57
    .line 58
    new-array v2, v2, [B

    .line 59
    .line 60
    fill-array-data v2, :array_4

    .line 61
    .line 62
    .line 63
    new-array v1, v1, [B

    .line 64
    .line 65
    fill-array-data v1, :array_5

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v0, v1}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const/4 v0, -0x1

    .line 84
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    const/4 p1, 0x0

    .line 92
    :goto_1
    if-eqz p1, :cond_2

    .line 93
    .line 94
    const/16 v0, 0x8

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 100
    .line 101
    return-object p1

    .line 102
    nop

    .line 103
    :array_0
    .array-data 1
        0x31t
        -0x41t
    .end array-data

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    nop

    .line 109
    :array_1
    .array-data 1
        0x58t
        -0x35t
        -0x6t
        0x7at
        -0x9t
        0x66t
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
    :array_2
    .array-data 1
        -0x7ct
        -0x33t
        0x2at
        -0x48t
        -0x6et
        -0x5et
        -0x76t
        -0x3dt
        0x33t
        -0x59t
        -0x62t
        -0x4ct
        -0x43t
        -0x2t
        0x17t
        -0x52t
        -0x48t
        -0x4at
        -0x46t
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
    .line 129
    .line 130
    .line 131
    :array_3
    .array-data 1
        -0x37t
        -0x54t
        0x5et
        -0x36t
        -0x5t
        -0x26t
    .end array-data

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    nop

    .line 139
    :array_4
    .array-data 1
        -0x76t
        -0x60t
        0x44t
        -0x77t
        -0x16t
        0x66t
        -0x61t
        -0x6at
        0x54t
        -0x7dt
        -0x13t
        0x44t
        -0x76t
        -0x46t
        0x48t
        -0x6dt
        -0x15t
    .end array-data

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    nop

    .line 153
    :array_5
    .array-data 1
        -0x15t
        -0x3dt
        0x27t
        -0x1at
        -0x61t
        0x8t
    .end array-data
.end method
