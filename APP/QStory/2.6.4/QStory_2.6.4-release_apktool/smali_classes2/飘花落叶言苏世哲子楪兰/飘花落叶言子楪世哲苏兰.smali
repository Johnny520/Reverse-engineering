.class public final L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲苏兰;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u4e16\u54f2\u5b50\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final isLoadedByDefault()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 9

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
    const/16 p0, 0x672

    .line 10
    .line 11
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/16 p1, 0x673

    .line 20
    .line 21
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;

    .line 26
    .line 27
    const/16 v2, 0xc

    .line 28
    .line 29
    invoke-direct {v1, v2}, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-class v2, Landroid/app/Activity;

    .line 33
    .line 34
    const-class v3, Ljava/util/List;

    .line 35
    .line 36
    const-class v4, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    filled-new-array {v2, v3, v4, v5, v1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {p0, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 45
    .line 46
    .line 47
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5"

    .line 48
    .line 49
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v6, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;

    .line 54
    .line 55
    const/16 v7, 0xd

    .line 56
    .line 57
    invoke-direct {v6, v7}, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 58
    .line 59
    .line 60
    const-class v7, Landroid/view/View;

    .line 61
    .line 62
    filled-new-array {v7, v6}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-static {p0, v1, v6}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v1, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;

    .line 74
    .line 75
    const/16 v6, 0xe

    .line 76
    .line 77
    const/16 v8, 0x19

    .line 78
    .line 79
    invoke-direct {v1, v8, v6}, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;-><init>(II)V

    .line 80
    .line 81
    .line 82
    filled-new-array {v2, v3, v4, v5, v1}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {p0, p1, v1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance v0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;

    .line 94
    .line 95
    const/16 v1, 0xf

    .line 96
    .line 97
    invoke-direct {v0, v8, v1}, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪世哲兰苏;-><init>(II)V

    .line 98
    .line 99
    .line 100
    filled-new-array {v7, v0}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {p0, p1, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 105
    .line 106
    .line 107
    return-void
.end method
