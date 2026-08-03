.class public final L۟/x0;
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


# instance fields
.field public final synthetic ۥ:L۟/y0;


# direct methods
.method public constructor <init>(L۟/y0;)V
    .locals 0

    iput-object p1, p0, L۟/x0;->ۥ:L۟/y0;

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
    const/4 v0, 0x5

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
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    aget-object v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    sget-object v2, L۟/n8;->ۥ:L۟/n8;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, L۟/n8;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    sget-object v2, L۟/k8;->ۥۣ۟:L۟/k;

    .line 43
    .line 44
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v2, v2, L۟/k;->ۥۣ۟:Ljava/lang/String;

    .line 49
    .line 50
    const/16 v3, 0x16

    .line 51
    .line 52
    new-array v3, v3, [B

    .line 53
    .line 54
    fill-array-data v3, :array_2

    .line 55
    .line 56
    .line 57
    new-array v4, v1, [B

    .line 58
    .line 59
    fill-array-data v4, :array_3

    .line 60
    .line 61
    .line 62
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3, v2}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/16 v3, 0xf

    .line 70
    .line 71
    new-array v3, v3, [B

    .line 72
    .line 73
    fill-array-data v3, :array_4

    .line 74
    .line 75
    .line 76
    new-array v1, v1, [B

    .line 77
    .line 78
    fill-array-data v1, :array_5

    .line 79
    .line 80
    .line 81
    invoke-static {v3, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v2, v1}, L۟/r3;->ۥ۟ۨ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const/4 v1, -0x1

    .line 97
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    :cond_2
    if-eqz v2, :cond_3

    .line 102
    .line 103
    iget-object p1, p0, L۟/x0;->ۥ:L۟/y0;

    .line 104
    .line 105
    new-instance v1, L۟/t0;

    .line 106
    .line 107
    invoke-direct {v1, p1, v0}, L۟/t0;-><init>(L۟/y0;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_1
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 114
    .line 115
    return-object p1

    .line 116
    nop

    .line 117
    :array_0
    .array-data 1
        -0x19t
        -0x30t
        0x6t
        -0x3et
        -0x18t
    .end array-data

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    nop

    .line 125
    :array_1
    .array-data 1
        -0x69t
        -0x4ft
        0x74t
        -0x5dt
        -0x7bt
        -0x36t
    .end array-data

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    nop

    .line 133
    :array_2
    .array-data 1
        0x6ft
        0x46t
        0x6bt
        0x66t
        0x1dt
        0x11t
        0x66t
        0x42t
        0x6bt
        0x75t
        0x1dt
        0x5t
        0x64t
        0x42t
        0x7at
        0x70t
        0x26t
        0x20t
        0x46t
        0x64t
        0x73t
        0x67t
    .end array-data

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
    .line 145
    .line 146
    .line 147
    .line 148
    nop

    .line 149
    :array_3
    .array-data 1
        0x22t
        0x27t
        0x1ft
        0x14t
        0x74t
        0x69t
    .end array-data

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    nop

    .line 157
    :array_4
    .array-data 1
        -0x2at
        -0x6dt
        -0x33t
        0x4dt
        -0x59t
        -0x1at
        -0x2at
        -0x78t
        -0x24t
        0x46t
        -0x70t
        -0x23t
        -0x23t
        -0x7ct
        -0x33t
    .end array-data

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    :array_5
    .array-data 1
        -0x48t
        -0x4t
        -0x47t
        0x28t
        -0x1ct
        -0x77t
    .end array-data
.end method
