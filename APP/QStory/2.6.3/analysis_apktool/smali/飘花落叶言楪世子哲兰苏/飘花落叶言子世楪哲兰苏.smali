.class public final L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/Set;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v1, "content"

    .line 4
    .line 5
    const-string v2, "android.resource"

    .line 6
    .line 7
    const-string v3, "file"

    .line 8
    .line 9
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    sget-object p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;
    .locals 2

    .line 1
    check-cast p1, Landroid/net/Uri;

    .line 2
    .line 3
    new-instance p2, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    new-instance p3, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    invoke-direct {p3, p1}, L飘花落叶言楪世哲兰子苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;

    .line 11
    .line 12
    iget p4, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 13
    .line 14
    packed-switch p4, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p4, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世兰苏;

    .line 18
    .line 19
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/content/ContentResolver;

    .line 20
    .line 21
    iget-boolean p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:Z

    .line 22
    .line 23
    invoke-direct {p4, v0, p1, p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_0
    new-instance p4, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/content/ContentResolver;

    .line 30
    .line 31
    iget-boolean p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:Z

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {p4, v0, p1, p0, v1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;ZI)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    new-instance p4, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Landroid/content/ContentResolver;

    .line 41
    .line 42
    iget-boolean p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:Z

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {p4, v0, p1, p0, v1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;ZI)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-direct {p2, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪子兰哲苏世/飘花落叶言子楪世哲兰苏;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;)V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
