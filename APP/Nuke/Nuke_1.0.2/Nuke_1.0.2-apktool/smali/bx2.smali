.class public final Lbx2;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lbx2;

.field public static final e:I

.field public static final f:I

.field public static final g:Lwm0;

.field public static final h:Ljava/lang/String;

.field public static final i:Z

.field public static final j:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbx2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbx2;->d:Lbx2;

    .line 8
    .line 9
    const v0, 0x790b0223

    .line 10
    .line 11
    .line 12
    sput v0, Lbx2;->e:I

    .line 13
    .line 14
    const v0, 0x790b0224

    .line 15
    .line 16
    .line 17
    sput v0, Lbx2;->f:I

    .line 18
    .line 19
    sget-object v0, Lwm0;->i:Lwm0;

    .line 20
    .line 21
    sput-object v0, Lbx2;->g:Lwm0;

    .line 22
    .line 23
    const-string v0, "SwipeToDeleteConversation"

    .line 24
    .line 25
    sput-object v0, Lbx2;->h:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lbx2;->i:Z

    .line 29
    .line 30
    new-instance v0, Lhn1;

    .line 31
    .line 32
    const/16 v1, 0x18

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lhx2;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lbx2;->j:Lhx2;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lbx2;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Z
    .locals 0

    .line 1
    sget-boolean p0, Lbx2;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()V
    .locals 4

    .line 1
    const-class v0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    :goto_0
    const-class v1, Landroid/view/MotionEvent;

    .line 16
    .line 17
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_1
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "dispatchTouchEvent"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v1, Lml2;

    .line 43
    .line 44
    const/16 v2, 0x1a

    .line 45
    .line 46
    invoke-direct {v1, v2}, Lml2;-><init>(I)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Lkg3;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-direct {v2, p0, v1, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final k()Ljava/lang/Integer;
    .locals 0

    .line 1
    sget p0, Lbx2;->f:I

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
    sget p0, Lbx2;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lbx2;->g:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
