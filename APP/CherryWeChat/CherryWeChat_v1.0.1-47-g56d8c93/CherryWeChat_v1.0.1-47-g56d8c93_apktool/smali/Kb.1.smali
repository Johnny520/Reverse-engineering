.class public final synthetic LKb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LKb;->a:I

    iput-object p2, p0, LKb;->b:Ljava/lang/Object;

    iput-object p3, p0, LKb;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LOg;LDA;LEC;)V
    .locals 0

    .line 2
    const/4 p3, 0x2

    iput p3, p0, LKb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKb;->b:Ljava/lang/Object;

    iput-object p2, p0, LKb;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lio/github/cherrywechat/network/model/UpdateInfo;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, LKb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKb;->c:Ljava/lang/Object;

    iput-object p2, p0, LKb;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget p1, p0, LKb;->a:I

    iget-object p2, p0, LKb;->b:Ljava/lang/Object;

    iget-object v0, p0, LKb;->c:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v0, Landroid/content/Context;

    check-cast p2, Lio/github/cherrywechat/network/model/UpdateInfo;

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/UpdateInfo;->getDownloadUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgf;->U(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :pswitch_0
    check-cast p2, LOg;

    check-cast v0, LDA;

    iget-object p1, v0, LDA;->a:Ljava/lang/String;

    sget v0, LOg;->k:I

    invoke-virtual {p2, p1}, LOg;->a(Ljava/lang/String;)V

    return-void

    :pswitch_1
    check-cast p2, LNd;

    check-cast v0, Landroid/widget/EditText;

    if-eqz p2, :cond_0

    invoke-interface {p2, v0}, LNd;->r(Landroid/widget/EditText;)V

    :cond_0
    return-void

    :pswitch_2
    check-cast p2, Ljava/util/LinkedHashMap;

    check-cast v0, Landroid/content/Context;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LHb;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    iget-object v3, v2, LHb;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object p2, LGb;->g:Lm6;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lm6;->l(Ljava/util/Map;)V

    const-wide p1, -0x15fdfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
