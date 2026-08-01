.class public final Llin/xposed/hook/view/main/itemview/JumpDataCard;
.super Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u001f\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llin/xposed/hook/view/main/itemview/JumpDataCard;",
        "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "uin",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "showTypeMenu",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "jumpGroup",
        "jumpPerson",
        "getLeftText",
        "()Ljava/lang/String;",
        "Landroid/view/View$OnClickListener;",
        "getOnClick",
        "()Landroid/view/View$OnClickListener;",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static final $stable:I = 0x8


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final getOnClick$lambda$0(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a5791f051405a7L    # -2.366275913036435E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 18
    .line 19
    .line 20
    const-wide v1, -0x36a578bd051405a7L    # -2.366409303724268E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 30
    .line 31
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 32
    .line 33
    .line 34
    const-wide v1, -0x36a519a9051405a7L    # -2.3995391949676905E45

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 46
    .line 47
    .line 48
    const-wide v1, -0x36a54ec9051405a7L    # -2.3810278342071914E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世兰哲:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 60
    .line 61
    .line 62
    new-instance v1, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世哲苏兰;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-direct {v1, p0, p1, v2}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世哲苏兰;-><init>(Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;Landroid/view/View;I)V

    .line 66
    .line 67
    .line 68
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世楪兰哲:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰哲苏;

    .line 69
    .line 70
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method private static final getOnClick$lambda$0$0(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/view/View;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏哲世;Landroid/view/View;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p4}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪兰世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const/4 p4, 0x0

    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    const-wide p0, -0x36a578b6051405a7L    # -2.3664188316305417E45

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return p4

    .line 32
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-wide v0, -0x36a57b58051405a7L    # -2.365501430369323E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/view/main/itemview/JumpDataCard;->showTypeMenu(Landroid/content/Context;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return p4
.end method

.method private final jumpGroup(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance p0, Landroid/content/Intent;

    .line 2
    .line 3
    const-wide v0, -0x36a5115f051405a7L    # -2.4024275116981154E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-wide v2, -0x36a51edb051405a7L    # -2.397728892775671E45

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-wide v2, -0x36a51e9f051405a7L    # -2.397810560543732E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-direct {p0, v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 53
    .line 54
    .line 55
    const/high16 p2, 0x10000000

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    :catch_0
    return-void
.end method

.method private final jumpPerson(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance p0, Landroid/content/Intent;

    .line 2
    .line 3
    const-wide v0, -0x36a5115f051405a7L    # -2.4024275116981154E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-wide v2, -0x36a578f1051405a7L    # -2.3663385249919484E45

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-wide v2, -0x36a578d1051405a7L    # -2.3663820811349142E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-direct {p0, v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 53
    .line 54
    .line 55
    const/high16 p2, 0x10000000

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    :catch_0
    return-void
.end method

.method private final showTypeMenu(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世兰哲()L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide v1, -0x36a57905051405a7L    # -2.3663113024025947E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲世兰()V

    .line 17
    .line 18
    .line 19
    const-wide v1, -0x36a5790d051405a7L    # -2.3663004133668532E45

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-wide v2, -0x36a5790b051405a7L    # -2.3663031356257886E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲兰世([Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;

    .line 45
    .line 46
    invoke-direct {v1, p0, p1, p2}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;-><init>(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 50
    .line 51
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private static final showTypeMenu$lambda$0(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/content/Context;Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z
    .locals 0

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/view/main/itemview/JumpDataCard;->jumpPerson(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/view/main/itemview/JumpDataCard;->jumpGroup(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世哲苏兰(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/content/Context;Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Llin/xposed/hook/view/main/itemview/JumpDataCard;->showTypeMenu$lambda$0(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/content/Context;Ljava/lang/String;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Llin/xposed/hook/view/main/itemview/JumpDataCard;->getOnClick$lambda$0(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/view/View;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏哲世;Landroid/view/View;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Llin/xposed/hook/view/main/itemview/JumpDataCard;->getOnClick$lambda$0$0(Llin/xposed/hook/view/main/itemview/JumpDataCard;Landroid/view/View;L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏哲世;Landroid/view/View;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public getLeftText()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5791f051405a7L    # -2.366275913036435E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getOnClick()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
