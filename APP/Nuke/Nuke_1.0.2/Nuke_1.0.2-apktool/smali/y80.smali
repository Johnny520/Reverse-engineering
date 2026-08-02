.class public final Ly80;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Ly80;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly80;->d:Ly80;

    .line 8
    .line 9
    const v0, 0x790b00f4

    .line 10
    .line 11
    .line 12
    sput v0, Ly80;->e:I

    .line 13
    .line 14
    const v0, 0x790b00f5

    .line 15
    .line 16
    .line 17
    sput v0, Ly80;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Ly80;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "DisableTypingStatus"

    .line 24
    .line 25
    sput-object v0, Ly80;->h:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ly80;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 4

    .line 1
    sget-object v0, Lln1;->d:Lln1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lln1;->f:Lhx2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "doScene"

    .line 23
    .line 24
    iput-object v1, v0, Lzf1;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lzg1;

    .line 35
    .line 36
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v1, Lgs;

    .line 42
    .line 43
    const/16 v2, 0xc

    .line 44
    .line 45
    invoke-direct {v1, v2}, Lgs;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lkg3;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, p0, v1, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Ly80;->f:I

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
    sget p0, Ly80;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Ly80;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
