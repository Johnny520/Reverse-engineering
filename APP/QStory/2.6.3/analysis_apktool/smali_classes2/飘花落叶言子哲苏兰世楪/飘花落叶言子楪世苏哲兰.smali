.class public final L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏哲兰;
.super Landroid/text/Editable$Factory;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public static volatile 飘花落叶言子楪世苏兰哲:L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏哲兰;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言子哲苏兰世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    invoke-direct {p0, v0, p1}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪兰苏哲世;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-super {p0, p1}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
