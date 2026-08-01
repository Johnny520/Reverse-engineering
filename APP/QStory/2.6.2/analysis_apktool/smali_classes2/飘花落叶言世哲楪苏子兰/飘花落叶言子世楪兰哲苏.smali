.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroid/app/Activity;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide v0, -0x36a5115f051405a7L    # -2.4024275116981154E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x36a51195051405a7L    # -2.4023540107068605E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iget-object v4, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世:Landroid/app/Activity;

    .line 14
    .line 15
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 16
    .line 17
    packed-switch p1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Landroid/content/Intent;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, v0, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance p1, Landroid/content/Intent;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {p1, v0, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
