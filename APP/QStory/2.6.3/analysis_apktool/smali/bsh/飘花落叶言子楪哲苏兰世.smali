.class public final Lbsh/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Supplier;
.implements Ljava/util/function/Consumer;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

.field public static final 飘花落叶言子楪哲兰苏世:Ljava/util/WeakHashMap;


# instance fields
.field public volatile 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Z

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    new-instance v0, Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Ljava/util/WeakHashMap;

    .line 21
    .line 22
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰()Z
    .locals 1

    .line 1
    sget-object v0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput-boolean p1, p0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Z

    .line 8
    .line 9
    return-void
.end method

.method public final get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Z

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
