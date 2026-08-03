.class public final Lcb/e;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Lcb/f;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lcb/f;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcb/e;->a:Lcb/f;

    .line 2
    .line 3
    iput p2, p0, Lcb/e;->b:I

    .line 4
    .line 5
    iput p3, p0, Lcb/e;->c:I

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcb/e;->a:Lcb/f;

    .line 5
    .line 6
    iget-object v0, v0, Lcb/f;->b:Lr8/g;

    .line 7
    .line 8
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 9
    .line 10
    const-string v2, "Hchat_round_avatar_config"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v3, "round_avatar_enable"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget v1, p0, Lcb/e;->b:I

    .line 27
    .line 28
    if-ltz v1, :cond_2

    .line 29
    .line 30
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 31
    .line 32
    array-length v4, v3

    .line 33
    if-ge v1, v4, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "round_avatar_radius_factor"

    .line 42
    .line 43
    const/high16 v4, 0x3f000000    # 0.5f

    .line 44
    .line 45
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const v2, 0x3dcccccd    # 0.1f

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2, v4}, Lr9/e0;->q(FFF)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/high16 v2, 0x42c80000    # 100.0f

    .line 57
    .line 58
    mul-float/2addr v0, v2

    .line 59
    invoke-static {v0}, Lig/a;->X(F)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-float v0, v0

    .line 64
    div-float/2addr v0, v2

    .line 65
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aput-object v0, v3, v1

    .line 70
    .line 71
    iget v0, p0, Lcb/e;->c:I

    .line 72
    .line 73
    if-ltz v0, :cond_2

    .line 74
    .line 75
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 76
    .line 77
    array-length v2, v1

    .line 78
    if-ge v0, v2, :cond_2

    .line 79
    .line 80
    aget-object v1, v1, v0

    .line 81
    .line 82
    instance-of v2, v1, Ljava/lang/Number;

    .line 83
    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Number;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 v1, 0x0

    .line 90
    :goto_0
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 97
    .line 98
    and-int/lit8 v1, v1, -0x5

    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    aput-object v1, p1, v0

    .line 105
    .line 106
    :cond_2
    :goto_1
    return-void
.end method
