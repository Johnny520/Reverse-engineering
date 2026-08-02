.class public final Ley0;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Ley0;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static i:Lde/robv/android/xposed/XC_MethodHook$Unhook;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ley0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ley0;->d:Ley0;

    .line 8
    .line 9
    const v0, 0x790b0173

    .line 10
    .line 11
    .line 12
    sput v0, Ley0;->e:I

    .line 13
    .line 14
    const v0, 0x790b0174

    .line 15
    .line 16
    .line 17
    sput v0, Ley0;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->j:Lwm0;

    .line 20
    .line 21
    sput-object v0, Ley0;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "IncreaseForwardingLimit"

    .line 24
    .line 25
    sput-object v0, Ley0;->h:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ley0;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 4

    .line 1
    const-string v0, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    .line 2
    .line 3
    invoke-static {v0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "onCreate"

    .line 16
    .line 17
    iput-object v1, v0, Lzf1;->b:Ljava/lang/String;

    .line 18
    .line 19
    const-class v1, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v1, v2

    .line 33
    :goto_0
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Lsg1;->d([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lzg1;

    .line 49
    .line 50
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v1, Lnx0;

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    invoke-direct {v1, v2}, Lnx0;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v2, Lkg3;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v2, p0, v1, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sput-object p0, Ley0;->i:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 75
    .line 76
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    sget-object p0, Ley0;->i:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sput-object v0, Ley0;->i:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Ley0;->f:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Ley0;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Ley0;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
