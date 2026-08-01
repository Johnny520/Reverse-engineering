.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰世苏;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
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
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏哲兰()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 18
    .line 19
    const/16 v2, 0x15fa

    .line 20
    .line 21
    if-ge v0, v2, :cond_0

    .line 22
    .line 23
    const/16 v0, 0x76c

    .line 24
    .line 25
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/16 v0, 0x76d

    .line 34
    .line 35
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/16 v0, 0x76e

    .line 48
    .line 49
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v0, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    const/16 v1, 0x1d

    .line 58
    .line 59
    invoke-direct {v0, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const/16 p1, 0x76f

    .line 67
    .line 68
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const/16 v0, 0x770

    .line 73
    .line 74
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    invoke-static {p1, v0, v2, v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/16 v0, 0x771

    .line 91
    .line 92
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method
