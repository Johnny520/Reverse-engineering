.class public final synthetic L۟/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ۥ:I

.field public final synthetic ۥ۟:Ljava/lang/Object;

.field public final synthetic ۥ۟۟:L۟/y0;


# direct methods
.method public synthetic constructor <init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;L۟/y0;I)V
    .locals 0

    .line 1
    iput p3, p0, L۟/t0;->ۥ:I

    iput-object p1, p0, L۟/t0;->ۥ۟:Ljava/lang/Object;

    iput-object p2, p0, L۟/t0;->ۥ۟۟:L۟/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L۟/y0;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, L۟/t0;->ۥ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/t0;->ۥ۟۟:L۟/y0;

    iput-object p2, p0, L۟/t0;->ۥ۟:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    .line 1
    iget v0, p0, L۟/t0;->ۥ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :pswitch_0
    iget-object p1, p0, L۟/t0;->ۥ۟:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 11
    .line 12
    iget-object v0, p0, L۟/t0;->ۥ۟۟:L۟/y0;

    .line 13
    .line 14
    invoke-static {p1, v0}, L۟/y0;->ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;L۟/y0;)V

    .line 15
    .line 16
    .line 17
    return v1

    .line 18
    :pswitch_1
    iget-object p1, p0, L۟/t0;->ۥ۟:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 21
    .line 22
    iget-object v0, p0, L۟/t0;->ۥ۟۟:L۟/y0;

    .line 23
    .line 24
    invoke-static {p1, v0}, L۟/y0;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;L۟/y0;)V

    .line 25
    .line 26
    .line 27
    return v1

    .line 28
    :goto_0
    iget-object v0, p0, L۟/t0;->ۥ۟۟:L۟/y0;

    .line 29
    .line 30
    iget-object v2, p0, L۟/t0;->ۥ۟:Ljava/lang/Object;

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    new-array v4, v3, [B

    .line 34
    .line 35
    fill-array-data v4, :array_0

    .line 36
    .line 37
    .line 38
    new-array v5, v3, [B

    .line 39
    .line 40
    fill-array-data v5, :array_1

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/16 v0, 0xf

    .line 55
    .line 56
    new-array v0, v0, [B

    .line 57
    .line 58
    fill-array-data v0, :array_2

    .line 59
    .line 60
    .line 61
    new-array v3, v3, [B

    .line 62
    .line 63
    fill-array-data v3, :array_3

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v2}, L۟/y0;->ۥ۟ۡ(Landroid/content/Context;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return v1

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    :array_0
    .array-data 1
        -0x23t
        0x1at
        0x3ct
        0x78t
        -0x39t
        0x18t
    .end array-data

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    nop

    .line 93
    :array_1
    .array-data 1
        -0x57t
        0x72t
        0x55t
        0xbt
        -0x1dt
        0x28t
    .end array-data

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    nop

    .line 101
    :array_2
    .array-data 1
        0x27t
        -0x58t
        0xft
        -0x76t
        0xbt
        -0x66t
        0x34t
        -0x58t
        0x3t
        -0x43t
        0x4ct
        -0x26t
        0x6et
        -0x1dt
        0x52t
    .end array-data

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
    :array_3
    .array-data 1
        0x40t
        -0x33t
        0x7bt
        -0x37t
        0x64t
        -0xct
    .end array-data
.end method
