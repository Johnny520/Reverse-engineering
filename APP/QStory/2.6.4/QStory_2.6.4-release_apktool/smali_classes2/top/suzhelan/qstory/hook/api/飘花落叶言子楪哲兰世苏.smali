.class public final Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲兰世苏;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/api/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "<init>",
        "()V",
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public static final 飘花落叶言子楪哲苏兰世:Ljava/util/Stack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:Ljava/util/Stack;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const/16 p0, 0x4cd

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x69b

    .line 10
    .line 11
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/16 v1, 0x69c

    .line 20
    .line 21
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏兰楪(Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-class v2, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 30
    .line 31
    const-class v3, Landroid/os/Bundle;

    .line 32
    .line 33
    filled-new-array {v3, v1, v2}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    new-instance v1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v1, v2}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 53
    .line 54
    .line 55
    :try_start_0
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const/16 v0, 0x465

    .line 60
    .line 61
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    invoke-direct {v1, v2}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 69
    .line 70
    .line 71
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {p0, p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    :catch_0
    return-void
.end method
