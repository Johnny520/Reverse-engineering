.class public final Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/api/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u696a\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
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
.field public static 飘花落叶言子楪哲兰苏世:I


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    const/16 v1, 0x674

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2
    .line 3
    const-class v0, Landroid/view/View;

    .line 4
    .line 5
    sget v1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v0, v1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/view/View;

    .line 22
    .line 23
    const/16 v1, 0x97

    .line 24
    .line 25
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-object v1, v2, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {v2, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/16 v2, 0x9b

    .line 61
    .line 62
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v3, v1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 67
    .line 68
    iput-object v2, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    new-array v2, v2, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v1, p1, v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const/16 v1, 0x8f

    .line 78
    .line 79
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-class v2, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-static {v2, v1, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/16 v1, 0x4c9

    .line 96
    .line 97
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const/16 v2, 0x4ca

    .line 114
    .line 115
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/16 v2, 0x14a

    .line 122
    .line 123
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 128
    .line 129
    invoke-static {v3, v2, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    const/4 v2, 0x2

    .line 140
    if-gt v1, v2, :cond_1

    .line 141
    .line 142
    check-cast v0, Landroid/view/ViewGroup;

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Landroid/view/ViewGroup;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :catch_0
    move-exception p1

    .line 149
    goto :goto_1

    .line 150
    :cond_2
    :goto_0
    return-void

    .line 151
    :goto_1
    invoke-virtual {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const/16 v0, 0x4cd

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string p1, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 10
    .line 11
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    invoke-virtual {v1, v0, p1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 33
    .line 34
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1, p0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const/16 p1, 0x675

    .line 47
    .line 48
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast p0, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    sput p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    sget p1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 64
    .line 65
    const/16 v1, 0x3002

    .line 66
    .line 67
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    const/16 v3, 0x13e

    .line 70
    .line 71
    if-lt p1, v1, :cond_1

    .line 72
    .line 73
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const/16 v0, 0x677

    .line 82
    .line 83
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 88
    .line 89
    const/16 v0, 0x678

    .line 90
    .line 91
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 104
    .line 105
    .line 106
    iput-object v2, p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-virtual {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Ljava/lang/reflect/Method;

    .line 113
    .line 114
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;

    .line 115
    .line 116
    const/4 v1, 0x1

    .line 117
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;-><init>(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;I)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_1
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-class v1, Ljava/util/List;

    .line 137
    .line 138
    const-class v3, Landroid/os/Bundle;

    .line 139
    .line 140
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 141
    .line 142
    const-class v5, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 143
    .line 144
    filled-new-array {v4, v5, v1, v3}, [Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {p1, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 149
    .line 150
    .line 151
    iput-object v2, p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 152
    .line 153
    invoke-virtual {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    const/16 v1, 0x676

    .line 158
    .line 159
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    check-cast p1, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    new-instance v1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;

    .line 168
    .line 169
    invoke-direct {v1, p0, v0}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;-><init>(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;I)V

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 177
    .line 178
    return-void
.end method

.method public final run()V
    .locals 1

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 12
    .line 13
    invoke-virtual {p0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroid/view/ViewGroup;)V
    .locals 6

    .line 1
    const/16 v0, 0x516

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v5, 0x14d

    .line 27
    .line 28
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 43
    .line 44
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 51
    .line 52
    invoke-virtual {v4, v2, v0}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 56
    .line 57
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v4, p1, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string p1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 69
    .line 70
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v2, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v4, v2, p1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 83
    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v4, v0, p1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const/16 v0, 0x675

    .line 99
    .line 100
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast p1, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    sput p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 113
    .line 114
    if-nez p1, :cond_0

    .line 115
    .line 116
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    sput p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 121
    .line 122
    :cond_0
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 128
    .line 129
    .line 130
    :cond_1
    const/16 p0, 0x679

    .line 131
    .line 132
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_3
    return-void
.end method
