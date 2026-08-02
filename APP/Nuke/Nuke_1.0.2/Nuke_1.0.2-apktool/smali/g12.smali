.class public final Lg12;
.super Lvj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lg12;

.field public static final e:Ljava/lang/String;

.field public static final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg12;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg12;->d:Lg12;

    .line 8
    .line 9
    const-string v0, "PlusMenuInjector"

    .line 10
    .line 11
    sput-object v0, Lg12;->e:Ljava/lang/String;

    .line 12
    .line 13
    sput-boolean v1, Lg12;->f:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 0

    .line 1
    sget-boolean p0, Lg12;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lg12;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 5

    .line 1
    const-string v0, "com.tencent.widget.PopupMenuDialog"

    .line 2
    .line 3
    invoke-static {v0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ln4;->v()Lsg1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "createAndAttachItemsView"

    .line 16
    .line 17
    iput-object v2, v1, Lzf1;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1}, Lsg1;->c()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lzg1;

    .line 28
    .line 29
    iget-object v1, v1, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v2, Leq1;

    .line 35
    .line 36
    const/16 v3, 0xb

    .line 37
    .line 38
    invoke-direct {v2, v3}, Leq1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Lkg3;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct {v3, p0, v2, v4}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "onClick"

    .line 67
    .line 68
    iput-object v1, v0, Lzf1;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lzg1;

    .line 79
    .line 80
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v1, Leq1;

    .line 86
    .line 87
    const/16 v2, 0xc

    .line 88
    .line 89
    invoke-direct {v1, v2}, Leq1;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v2, Lkg3;

    .line 93
    .line 94
    invoke-direct {v2, p0, v1, v4}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    return-void
.end method
