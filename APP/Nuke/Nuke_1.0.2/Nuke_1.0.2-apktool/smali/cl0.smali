.class public final Lcl0;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lcl0;

.field public static final e:I

.field public static final f:Ljava/lang/String;

.field public static final g:Z

.field public static final h:Lwm0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcl0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcl0;->d:Lcl0;

    .line 8
    .line 9
    const v0, 0x790b0109

    .line 10
    .line 11
    .line 12
    sput v0, Lcl0;->e:I

    .line 13
    .line 14
    const-string v0, "FocusPadMode"

    .line 15
    .line 16
    sput-object v0, Lcl0;->f:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    sput-boolean v0, Lcl0;->g:Z

    .line 20
    .line 21
    sget-object v0, Lwm0;->n:Lwm0;

    .line 22
    .line 23
    sput-object v0, Lcl0;->h:Lwm0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lhe;->h:Lhe;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Lhe;->i:Lhe;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    sget-boolean p0, Lcl0;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lcl0;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 4

    .line 1
    sget-object p0, Lhe;->i:Lhe;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v0, Lgs;

    .line 11
    .line 12
    const/16 v1, 0x16

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lgs;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lkg3;

    .line 18
    .line 19
    sget-object v2, Lcl0;->d:Lcl0;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, v2, v0, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lhe;->h:Lhe;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Lgs;

    .line 42
    .line 43
    const/16 v1, 0x15

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lgs;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lkg3;

    .line 49
    .line 50
    invoke-direct {v1, v2, v0, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lcl0;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lcl0;->h:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
