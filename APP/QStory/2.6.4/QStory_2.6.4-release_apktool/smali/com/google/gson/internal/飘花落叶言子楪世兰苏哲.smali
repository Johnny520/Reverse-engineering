.class public final Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/gson/飘花落叶言子楪哲苏兰世;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/List;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Z)Z
    .locals 1

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    const-class v0, Ljava/lang/Enum;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, L飘花落叶言楪哲世苏子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 43
    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_3
    invoke-static {p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏世兰;
    .locals 8

    .line 1
    iget-object v0, p2, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v5

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v2, Lcom/google/gson/internal/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    move-object v3, p0

    .line 22
    move-object v6, p1

    .line 23
    move-object v7, p2

    .line 24
    invoke-direct/range {v2 .. v7}, Lcom/google/gson/internal/飘花落叶言子楪世哲兰苏;-><init>(Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;ZZLcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏哲兰;)V

    .line 25
    .line 26
    .line 27
    return-object v2
.end method
