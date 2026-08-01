.class public abstract Lcom/google/gson/internal/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lcom/google/gson/internal/飘花落叶言子楪哲苏世兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Lcom/google/gson/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    const-class v0, Ljava/lang/reflect/AccessibleObject;

    .line 8
    .line 9
    const-string v1, "canAccess"

    .line 10
    .line 11
    const-class v2, Ljava/lang/Object;

    .line 12
    .line 13
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lcom/google/gson/internal/飘花落叶言子楪哲世苏兰;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lcom/google/gson/internal/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    if-nez v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Lcom/google/gson/internal/飘花落叶言子楪哲世兰苏;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    :cond_1
    sput-object v1, Lcom/google/gson/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Lcom/google/gson/internal/飘花落叶言子楪哲苏世兰;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public abstract 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z
.end method
