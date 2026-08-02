.class public final Lt73;
.super Lgx2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lt73;

.field public static final e:I

.field public static final f:Lwm0;

.field public static final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt73;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt73;->d:Lt73;

    .line 8
    .line 9
    const v0, 0x790b022e

    .line 10
    .line 11
    .line 12
    sput v0, Lt73;->e:I

    .line 13
    .line 14
    sget-object v0, Lwm0;->i:Lwm0;

    .line 15
    .line 16
    sput-object v0, Lt73;->f:Lwm0;

    .line 17
    .line 18
    const-string v0, "UnLockPictureSendLimit"

    .line 19
    .line 20
    sput-object v0, Lt73;->g:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lt73;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 4

    .line 1
    const-string v0, "com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI"

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
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lzg1;

    .line 28
    .line 29
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v1, Lkx2;

    .line 35
    .line 36
    const/16 v2, 0x9

    .line 37
    .line 38
    invoke-direct {v1, v2}, Lkx2;-><init>(I)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lkg3;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v2, p0, v1, v3}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final m()I
    .locals 0

    .line 1
    sget p0, Lt73;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final n()Lwm0;
    .locals 0

    .line 1
    sget-object p0, Lt73;->f:Lwm0;

    .line 2
    .line 3
    return-object p0
.end method
