.class public final Lje0;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lje0;

.field public static final e:I

.field public static final f:Ljava/lang/String;

.field public static final g:Lwm0;

.field public static final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lje0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lje0;->d:Lje0;

    .line 8
    .line 9
    const v0, 0x790b0108

    .line 10
    .line 11
    .line 12
    sput v0, Lje0;->e:I

    .line 13
    .line 14
    const-string v0, "EnableRoundAvatar"

    .line 15
    .line 16
    sput-object v0, Lje0;->f:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v0, Lwm0;->m:Lwm0;

    .line 19
    .line 20
    sput-object v0, Lje0;->g:Lwm0;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    sput-boolean v0, Lje0;->h:Z

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lhe;->g:Lhe;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lje0;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    sget-boolean p0, Lje0;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()V
    .locals 4

    .line 1
    sget-object v0, Lhe;->g:Lhe;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lgs;

    .line 8
    .line 9
    const/16 v2, 0x12

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lgs;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lkg3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, v3, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lje0;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lje0;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
